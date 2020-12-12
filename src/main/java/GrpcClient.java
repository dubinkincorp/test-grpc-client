import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.SslContextBuilder;
import ru.irit.grpctestserver.Ping;
import ru.irit.grpctestserver.PingPongGrpc;
import ru.irit.grpctestserver.Pong;

import javax.net.ssl.SSLException;
import java.io.*;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class GrpcClient {

    public static void main(String[] args) {
        Key privateKey = null;
        Certificate certificate = null;

        try {
            final File file = new File("file");
            final KeyStore keyStore = KeyStore.getInstance("pkcs12");

            try (InputStream inputStream = new FileInputStream(file)) {
                char[] pwd = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
                keyStore.load(inputStream, pwd);

                final String alias = keyStore.aliases().nextElement();

                privateKey = keyStore.getKey(alias, pwd);
                certificate = keyStore.getCertificate(alias);
            } catch (IOException | CertificateException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
                e.printStackTrace();
            }
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }


        NettyChannelBuilder channelBuilder = NettyChannelBuilder
                .forAddress(
                        "url",
                        80
                );

        if (privateKey != null && certificate != null) {
            try {
                channelBuilder
                        .sslContext(
                                SslContextBuilder
                                        .forClient()
                                        .keyManager(((PrivateKey) privateKey), ((X509Certificate) certificate))
                                        .applicationProtocolConfig(
                                                new ApplicationProtocolConfig(
                                                        ApplicationProtocolConfig.Protocol.ALPN,
                                                        ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL,
                                                        ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT,
                                                        "h2"
                                                )
                                        )
                                        .build()
                        );
            } catch (SSLException e) {
                e.printStackTrace();
            }
        }

        final ManagedChannel managedChannel = channelBuilder.build();

        final PingPongGrpc.PingPongBlockingStub stub = PingPongGrpc.newBlockingStub(managedChannel);

        final Pong pong = stub.testPingPong(
                Ping
                        .newBuilder()
                        .setRequestPing("Ping")
                        .build()
        );

        System.out.println(pong.getReplyPong());

        managedChannel.shutdown();

    }
}
