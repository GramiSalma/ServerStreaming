package stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Multiplication.proto")
public final class MultiplicationGrpc {

  private MultiplicationGrpc() {}

  public static final String SERVICE_NAME = "Multiplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stub.MultiplicationOuterClass.MultiplicationRequest,
      stub.MultiplicationOuterClass.MultiplicationResponse> getGetMultiplicationTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMultiplicationTable",
      requestType = stub.MultiplicationOuterClass.MultiplicationRequest.class,
      responseType = stub.MultiplicationOuterClass.MultiplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<stub.MultiplicationOuterClass.MultiplicationRequest,
      stub.MultiplicationOuterClass.MultiplicationResponse> getGetMultiplicationTableMethod() {
    io.grpc.MethodDescriptor<stub.MultiplicationOuterClass.MultiplicationRequest, stub.MultiplicationOuterClass.MultiplicationResponse> getGetMultiplicationTableMethod;
    if ((getGetMultiplicationTableMethod = MultiplicationGrpc.getGetMultiplicationTableMethod) == null) {
      synchronized (MultiplicationGrpc.class) {
        if ((getGetMultiplicationTableMethod = MultiplicationGrpc.getGetMultiplicationTableMethod) == null) {
          MultiplicationGrpc.getGetMultiplicationTableMethod = getGetMultiplicationTableMethod = 
              io.grpc.MethodDescriptor.<stub.MultiplicationOuterClass.MultiplicationRequest, stub.MultiplicationOuterClass.MultiplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Multiplication", "GetMultiplicationTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.MultiplicationOuterClass.MultiplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.MultiplicationOuterClass.MultiplicationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MultiplicationMethodDescriptorSupplier("GetMultiplicationTable"))
                  .build();
          }
        }
     }
     return getGetMultiplicationTableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MultiplicationStub newStub(io.grpc.Channel channel) {
    return new MultiplicationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MultiplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MultiplicationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MultiplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MultiplicationFutureStub(channel);
  }

  /**
   */
  public static abstract class MultiplicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMultiplicationTable(stub.MultiplicationOuterClass.MultiplicationRequest request,
        io.grpc.stub.StreamObserver<stub.MultiplicationOuterClass.MultiplicationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMultiplicationTableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMultiplicationTableMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                stub.MultiplicationOuterClass.MultiplicationRequest,
                stub.MultiplicationOuterClass.MultiplicationResponse>(
                  this, METHODID_GET_MULTIPLICATION_TABLE)))
          .build();
    }
  }

  /**
   */
  public static final class MultiplicationStub extends io.grpc.stub.AbstractStub<MultiplicationStub> {
    private MultiplicationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MultiplicationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiplicationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MultiplicationStub(channel, callOptions);
    }

    /**
     */
    public void getMultiplicationTable(stub.MultiplicationOuterClass.MultiplicationRequest request,
        io.grpc.stub.StreamObserver<stub.MultiplicationOuterClass.MultiplicationResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMultiplicationTableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MultiplicationBlockingStub extends io.grpc.stub.AbstractStub<MultiplicationBlockingStub> {
    private MultiplicationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MultiplicationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiplicationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MultiplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<stub.MultiplicationOuterClass.MultiplicationResponse> getMultiplicationTable(
        stub.MultiplicationOuterClass.MultiplicationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMultiplicationTableMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MultiplicationFutureStub extends io.grpc.stub.AbstractStub<MultiplicationFutureStub> {
    private MultiplicationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MultiplicationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiplicationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MultiplicationFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_MULTIPLICATION_TABLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MultiplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MultiplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MULTIPLICATION_TABLE:
          serviceImpl.getMultiplicationTable((stub.MultiplicationOuterClass.MultiplicationRequest) request,
              (io.grpc.stub.StreamObserver<stub.MultiplicationOuterClass.MultiplicationResponse>) responseObserver);
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

  private static abstract class MultiplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MultiplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stub.MultiplicationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Multiplication");
    }
  }

  private static final class MultiplicationFileDescriptorSupplier
      extends MultiplicationBaseDescriptorSupplier {
    MultiplicationFileDescriptorSupplier() {}
  }

  private static final class MultiplicationMethodDescriptorSupplier
      extends MultiplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MultiplicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (MultiplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MultiplicationFileDescriptorSupplier())
              .addMethod(getGetMultiplicationTableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
