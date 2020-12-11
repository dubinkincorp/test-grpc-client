import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ru.irit.grpctestserver.Ping;
import ru.irit.grpctestserver.PingPongGrpc;
import ru.irit.grpctestserver.Pong;

public class GrpcClient {

    public static void main(String[] args) {

        final ManagedChannel managedChannel = ManagedChannelBuilder
                .forTarget(
                        "https://mobile-asud-demo.interrao.ru"
                )
                .usePlaintext()
                .build();

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
