package ru.irit.grpctestserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: ping_pong.proto")
public final class PingPongGrpc {

  private PingPongGrpc() {}

  public static final String SERVICE_NAME = "ru.irit.grpctestserver.PingPong";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.irit.grpctestserver.Ping,
      ru.irit.grpctestserver.Pong> getTestPingPongMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testPingPong",
      requestType = ru.irit.grpctestserver.Ping.class,
      responseType = ru.irit.grpctestserver.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.irit.grpctestserver.Ping,
      ru.irit.grpctestserver.Pong> getTestPingPongMethod() {
    io.grpc.MethodDescriptor<ru.irit.grpctestserver.Ping, ru.irit.grpctestserver.Pong> getTestPingPongMethod;
    if ((getTestPingPongMethod = PingPongGrpc.getTestPingPongMethod) == null) {
      synchronized (PingPongGrpc.class) {
        if ((getTestPingPongMethod = PingPongGrpc.getTestPingPongMethod) == null) {
          PingPongGrpc.getTestPingPongMethod = getTestPingPongMethod =
              io.grpc.MethodDescriptor.<ru.irit.grpctestserver.Ping, ru.irit.grpctestserver.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testPingPong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.irit.grpctestserver.Ping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.irit.grpctestserver.Pong.getDefaultInstance()))
              .setSchemaDescriptor(new PingPongMethodDescriptorSupplier("testPingPong"))
              .build();
        }
      }
    }
    return getTestPingPongMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingPongStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongStub>() {
        @java.lang.Override
        public PingPongStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongStub(channel, callOptions);
        }
      };
    return PingPongStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingPongBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongBlockingStub>() {
        @java.lang.Override
        public PingPongBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongBlockingStub(channel, callOptions);
        }
      };
    return PingPongBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingPongFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongFutureStub>() {
        @java.lang.Override
        public PingPongFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongFutureStub(channel, callOptions);
        }
      };
    return PingPongFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PingPongImplBase implements io.grpc.BindableService {

    /**
     */
    public void testPingPong(ru.irit.grpctestserver.Ping request,
        io.grpc.stub.StreamObserver<ru.irit.grpctestserver.Pong> responseObserver) {
      asyncUnimplementedUnaryCall(getTestPingPongMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestPingPongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.irit.grpctestserver.Ping,
                ru.irit.grpctestserver.Pong>(
                  this, METHODID_TEST_PING_PONG)))
          .build();
    }
  }

  /**
   */
  public static final class PingPongStub extends io.grpc.stub.AbstractAsyncStub<PingPongStub> {
    private PingPongStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongStub(channel, callOptions);
    }

    /**
     */
    public void testPingPong(ru.irit.grpctestserver.Ping request,
        io.grpc.stub.StreamObserver<ru.irit.grpctestserver.Pong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestPingPongMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PingPongBlockingStub extends io.grpc.stub.AbstractBlockingStub<PingPongBlockingStub> {
    private PingPongBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.irit.grpctestserver.Pong testPingPong(ru.irit.grpctestserver.Ping request) {
      return blockingUnaryCall(
          getChannel(), getTestPingPongMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PingPongFutureStub extends io.grpc.stub.AbstractFutureStub<PingPongFutureStub> {
    private PingPongFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.irit.grpctestserver.Pong> testPingPong(
        ru.irit.grpctestserver.Ping request) {
      return futureUnaryCall(
          getChannel().newCall(getTestPingPongMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_PING_PONG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PingPongImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PingPongImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_PING_PONG:
          serviceImpl.testPingPong((ru.irit.grpctestserver.Ping) request,
              (io.grpc.stub.StreamObserver<ru.irit.grpctestserver.Pong>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PingPongBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingPongBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.irit.grpctestserver.PingPongOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingPong");
    }
  }

  private static final class PingPongFileDescriptorSupplier
      extends PingPongBaseDescriptorSupplier {
    PingPongFileDescriptorSupplier() {}
  }

  private static final class PingPongMethodDescriptorSupplier
      extends PingPongBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PingPongMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PingPongGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingPongFileDescriptorSupplier())
              .addMethod(getTestPingPongMethod())
              .build();
        }
      }
    }
    return result;
  }
}
