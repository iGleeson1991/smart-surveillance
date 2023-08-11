package DoorController;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DoorController.ScanSecurityBadgeRequest,
      DoorController.ScanSecurityBadgeResponse> getScanSecurityBadgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scanSecurityBadge",
      requestType = DoorController.ScanSecurityBadgeRequest.class,
      responseType = DoorController.ScanSecurityBadgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DoorController.ScanSecurityBadgeRequest,
      DoorController.ScanSecurityBadgeResponse> getScanSecurityBadgeMethod() {
    io.grpc.MethodDescriptor<DoorController.ScanSecurityBadgeRequest, DoorController.ScanSecurityBadgeResponse> getScanSecurityBadgeMethod;
    if ((getScanSecurityBadgeMethod = Service1Grpc.getScanSecurityBadgeMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getScanSecurityBadgeMethod = Service1Grpc.getScanSecurityBadgeMethod) == null) {
          Service1Grpc.getScanSecurityBadgeMethod = getScanSecurityBadgeMethod = 
              io.grpc.MethodDescriptor.<DoorController.ScanSecurityBadgeRequest, DoorController.ScanSecurityBadgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "scanSecurityBadge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.ScanSecurityBadgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.ScanSecurityBadgeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("scanSecurityBadge"))
                  .build();
          }
        }
     }
     return getScanSecurityBadgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DoorController.SecurityCodeEntryRequest,
      DoorController.SecurityCodeEntryResponse> getSecurityCodeEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "securityCodeEntry",
      requestType = DoorController.SecurityCodeEntryRequest.class,
      responseType = DoorController.SecurityCodeEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DoorController.SecurityCodeEntryRequest,
      DoorController.SecurityCodeEntryResponse> getSecurityCodeEntryMethod() {
    io.grpc.MethodDescriptor<DoorController.SecurityCodeEntryRequest, DoorController.SecurityCodeEntryResponse> getSecurityCodeEntryMethod;
    if ((getSecurityCodeEntryMethod = Service1Grpc.getSecurityCodeEntryMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getSecurityCodeEntryMethod = Service1Grpc.getSecurityCodeEntryMethod) == null) {
          Service1Grpc.getSecurityCodeEntryMethod = getSecurityCodeEntryMethod = 
              io.grpc.MethodDescriptor.<DoorController.SecurityCodeEntryRequest, DoorController.SecurityCodeEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "securityCodeEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.SecurityCodeEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.SecurityCodeEntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("securityCodeEntry"))
                  .build();
          }
        }
     }
     return getSecurityCodeEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DoorController.Empty,
      DoorController.IntercomCallResponse> getIntercomCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "intercomCall",
      requestType = DoorController.Empty.class,
      responseType = DoorController.IntercomCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DoorController.Empty,
      DoorController.IntercomCallResponse> getIntercomCallMethod() {
    io.grpc.MethodDescriptor<DoorController.Empty, DoorController.IntercomCallResponse> getIntercomCallMethod;
    if ((getIntercomCallMethod = Service1Grpc.getIntercomCallMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getIntercomCallMethod = Service1Grpc.getIntercomCallMethod) == null) {
          Service1Grpc.getIntercomCallMethod = getIntercomCallMethod = 
              io.grpc.MethodDescriptor.<DoorController.Empty, DoorController.IntercomCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "intercomCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.IntercomCallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("intercomCall"))
                  .build();
          }
        }
     }
     return getIntercomCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DoorController.IntercomAnswerRequest,
      DoorController.IntercomAnswerResponse> getIntercomAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "intercomAnswer",
      requestType = DoorController.IntercomAnswerRequest.class,
      responseType = DoorController.IntercomAnswerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DoorController.IntercomAnswerRequest,
      DoorController.IntercomAnswerResponse> getIntercomAnswerMethod() {
    io.grpc.MethodDescriptor<DoorController.IntercomAnswerRequest, DoorController.IntercomAnswerResponse> getIntercomAnswerMethod;
    if ((getIntercomAnswerMethod = Service1Grpc.getIntercomAnswerMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getIntercomAnswerMethod = Service1Grpc.getIntercomAnswerMethod) == null) {
          Service1Grpc.getIntercomAnswerMethod = getIntercomAnswerMethod = 
              io.grpc.MethodDescriptor.<DoorController.IntercomAnswerRequest, DoorController.IntercomAnswerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "intercomAnswer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.IntercomAnswerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.IntercomAnswerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("intercomAnswer"))
                  .build();
          }
        }
     }
     return getIntercomAnswerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DoorController.OneWayCommunicationRequest,
      DoorController.OneWayCommunicationResponse> getOneWayCommunicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oneWayCommunication",
      requestType = DoorController.OneWayCommunicationRequest.class,
      responseType = DoorController.OneWayCommunicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<DoorController.OneWayCommunicationRequest,
      DoorController.OneWayCommunicationResponse> getOneWayCommunicationMethod() {
    io.grpc.MethodDescriptor<DoorController.OneWayCommunicationRequest, DoorController.OneWayCommunicationResponse> getOneWayCommunicationMethod;
    if ((getOneWayCommunicationMethod = Service1Grpc.getOneWayCommunicationMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getOneWayCommunicationMethod = Service1Grpc.getOneWayCommunicationMethod) == null) {
          Service1Grpc.getOneWayCommunicationMethod = getOneWayCommunicationMethod = 
              io.grpc.MethodDescriptor.<DoorController.OneWayCommunicationRequest, DoorController.OneWayCommunicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "oneWayCommunication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.OneWayCommunicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DoorController.OneWayCommunicationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("oneWayCommunication"))
                  .build();
          }
        }
     }
     return getOneWayCommunicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    return new Service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service1FutureStub(channel);
  }

  /**
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Sends the user's Security Badge and returns a message after validation
     * </pre>
     */
    public void scanSecurityBadge(DoorController.ScanSecurityBadgeRequest request,
        io.grpc.stub.StreamObserver<DoorController.ScanSecurityBadgeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScanSecurityBadgeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public void securityCodeEntry(DoorController.SecurityCodeEntryRequest request,
        io.grpc.stub.StreamObserver<DoorController.SecurityCodeEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSecurityCodeEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns a call initiated message
     * </pre>
     */
    public void intercomCall(DoorController.Empty request,
        io.grpc.stub.StreamObserver<DoorController.IntercomCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIntercomCallMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends the receiving user's response to an intercom call
     * </pre>
     */
    public void intercomAnswer(DoorController.IntercomAnswerRequest request,
        io.grpc.stub.StreamObserver<DoorController.IntercomAnswerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIntercomAnswerMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends a streamed message to the server when the user has the communication button held
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DoorController.OneWayCommunicationRequest> oneWayCommunication(
        io.grpc.stub.StreamObserver<DoorController.OneWayCommunicationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getOneWayCommunicationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScanSecurityBadgeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DoorController.ScanSecurityBadgeRequest,
                DoorController.ScanSecurityBadgeResponse>(
                  this, METHODID_SCAN_SECURITY_BADGE)))
          .addMethod(
            getSecurityCodeEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DoorController.SecurityCodeEntryRequest,
                DoorController.SecurityCodeEntryResponse>(
                  this, METHODID_SECURITY_CODE_ENTRY)))
          .addMethod(
            getIntercomCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DoorController.Empty,
                DoorController.IntercomCallResponse>(
                  this, METHODID_INTERCOM_CALL)))
          .addMethod(
            getIntercomAnswerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DoorController.IntercomAnswerRequest,
                DoorController.IntercomAnswerResponse>(
                  this, METHODID_INTERCOM_ANSWER)))
          .addMethod(
            getOneWayCommunicationMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                DoorController.OneWayCommunicationRequest,
                DoorController.OneWayCommunicationResponse>(
                  this, METHODID_ONE_WAY_COMMUNICATION)))
          .build();
    }
  }

  /**
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractStub<Service1Stub> {
    private Service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *Sends the user's Security Badge and returns a message after validation
     * </pre>
     */
    public void scanSecurityBadge(DoorController.ScanSecurityBadgeRequest request,
        io.grpc.stub.StreamObserver<DoorController.ScanSecurityBadgeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanSecurityBadgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public void securityCodeEntry(DoorController.SecurityCodeEntryRequest request,
        io.grpc.stub.StreamObserver<DoorController.SecurityCodeEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecurityCodeEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns a call initiated message
     * </pre>
     */
    public void intercomCall(DoorController.Empty request,
        io.grpc.stub.StreamObserver<DoorController.IntercomCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntercomCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends the receiving user's response to an intercom call
     * </pre>
     */
    public void intercomAnswer(DoorController.IntercomAnswerRequest request,
        io.grpc.stub.StreamObserver<DoorController.IntercomAnswerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntercomAnswerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends a streamed message to the server when the user has the communication button held
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DoorController.OneWayCommunicationRequest> oneWayCommunication(
        io.grpc.stub.StreamObserver<DoorController.OneWayCommunicationResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getOneWayCommunicationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractStub<Service1BlockingStub> {
    private Service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Sends the user's Security Badge and returns a message after validation
     * </pre>
     */
    public DoorController.ScanSecurityBadgeResponse scanSecurityBadge(DoorController.ScanSecurityBadgeRequest request) {
      return blockingUnaryCall(
          getChannel(), getScanSecurityBadgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public DoorController.SecurityCodeEntryResponse securityCodeEntry(DoorController.SecurityCodeEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSecurityCodeEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns a call initiated message
     * </pre>
     */
    public DoorController.IntercomCallResponse intercomCall(DoorController.Empty request) {
      return blockingUnaryCall(
          getChannel(), getIntercomCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Sends the receiving user's response to an intercom call
     * </pre>
     */
    public DoorController.IntercomAnswerResponse intercomAnswer(DoorController.IntercomAnswerRequest request) {
      return blockingUnaryCall(
          getChannel(), getIntercomAnswerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractStub<Service1FutureStub> {
    private Service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Sends the user's Security Badge and returns a message after validation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DoorController.ScanSecurityBadgeResponse> scanSecurityBadge(
        DoorController.ScanSecurityBadgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScanSecurityBadgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DoorController.SecurityCodeEntryResponse> securityCodeEntry(
        DoorController.SecurityCodeEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSecurityCodeEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns a call initiated message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DoorController.IntercomCallResponse> intercomCall(
        DoorController.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getIntercomCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Sends the receiving user's response to an intercom call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DoorController.IntercomAnswerResponse> intercomAnswer(
        DoorController.IntercomAnswerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIntercomAnswerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCAN_SECURITY_BADGE = 0;
  private static final int METHODID_SECURITY_CODE_ENTRY = 1;
  private static final int METHODID_INTERCOM_CALL = 2;
  private static final int METHODID_INTERCOM_ANSWER = 3;
  private static final int METHODID_ONE_WAY_COMMUNICATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCAN_SECURITY_BADGE:
          serviceImpl.scanSecurityBadge((DoorController.ScanSecurityBadgeRequest) request,
              (io.grpc.stub.StreamObserver<DoorController.ScanSecurityBadgeResponse>) responseObserver);
          break;
        case METHODID_SECURITY_CODE_ENTRY:
          serviceImpl.securityCodeEntry((DoorController.SecurityCodeEntryRequest) request,
              (io.grpc.stub.StreamObserver<DoorController.SecurityCodeEntryResponse>) responseObserver);
          break;
        case METHODID_INTERCOM_CALL:
          serviceImpl.intercomCall((DoorController.Empty) request,
              (io.grpc.stub.StreamObserver<DoorController.IntercomCallResponse>) responseObserver);
          break;
        case METHODID_INTERCOM_ANSWER:
          serviceImpl.intercomAnswer((DoorController.IntercomAnswerRequest) request,
              (io.grpc.stub.StreamObserver<DoorController.IntercomAnswerResponse>) responseObserver);
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
        case METHODID_ONE_WAY_COMMUNICATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.oneWayCommunication(
              (io.grpc.stub.StreamObserver<DoorController.OneWayCommunicationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DoorController.DoorControlsImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getScanSecurityBadgeMethod())
              .addMethod(getSecurityCodeEntryMethod())
              .addMethod(getIntercomCallMethod())
              .addMethod(getIntercomAnswerMethod())
              .addMethod(getOneWayCommunicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
