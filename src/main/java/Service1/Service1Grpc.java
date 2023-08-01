package Service1;

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
    comments = "Source: Service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Service1.ScanSecurityBadgeRequest,
      Service1.ScanSecurityBadgeResponse> getScanSecurityBadgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scanSecurityBadge",
      requestType = Service1.ScanSecurityBadgeRequest.class,
      responseType = Service1.ScanSecurityBadgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Service1.ScanSecurityBadgeRequest,
      Service1.ScanSecurityBadgeResponse> getScanSecurityBadgeMethod() {
    io.grpc.MethodDescriptor<Service1.ScanSecurityBadgeRequest, Service1.ScanSecurityBadgeResponse> getScanSecurityBadgeMethod;
    if ((getScanSecurityBadgeMethod = Service1Grpc.getScanSecurityBadgeMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getScanSecurityBadgeMethod = Service1Grpc.getScanSecurityBadgeMethod) == null) {
          Service1Grpc.getScanSecurityBadgeMethod = getScanSecurityBadgeMethod = 
              io.grpc.MethodDescriptor.<Service1.ScanSecurityBadgeRequest, Service1.ScanSecurityBadgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "scanSecurityBadge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.ScanSecurityBadgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.ScanSecurityBadgeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("scanSecurityBadge"))
                  .build();
          }
        }
     }
     return getScanSecurityBadgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Service1.SecurityCodeEntryRequest,
      Service1.SecurityCodeEntryResponse> getSecurityCodeEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "securityCodeEntry",
      requestType = Service1.SecurityCodeEntryRequest.class,
      responseType = Service1.SecurityCodeEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Service1.SecurityCodeEntryRequest,
      Service1.SecurityCodeEntryResponse> getSecurityCodeEntryMethod() {
    io.grpc.MethodDescriptor<Service1.SecurityCodeEntryRequest, Service1.SecurityCodeEntryResponse> getSecurityCodeEntryMethod;
    if ((getSecurityCodeEntryMethod = Service1Grpc.getSecurityCodeEntryMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getSecurityCodeEntryMethod = Service1Grpc.getSecurityCodeEntryMethod) == null) {
          Service1Grpc.getSecurityCodeEntryMethod = getSecurityCodeEntryMethod = 
              io.grpc.MethodDescriptor.<Service1.SecurityCodeEntryRequest, Service1.SecurityCodeEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "securityCodeEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.SecurityCodeEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.SecurityCodeEntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("securityCodeEntry"))
                  .build();
          }
        }
     }
     return getSecurityCodeEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Service1.IntercomCallRequest,
      Service1.IntercomCallResponse> getIntercomCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "intercomCall",
      requestType = Service1.IntercomCallRequest.class,
      responseType = Service1.IntercomCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Service1.IntercomCallRequest,
      Service1.IntercomCallResponse> getIntercomCallMethod() {
    io.grpc.MethodDescriptor<Service1.IntercomCallRequest, Service1.IntercomCallResponse> getIntercomCallMethod;
    if ((getIntercomCallMethod = Service1Grpc.getIntercomCallMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getIntercomCallMethod = Service1Grpc.getIntercomCallMethod) == null) {
          Service1Grpc.getIntercomCallMethod = getIntercomCallMethod = 
              io.grpc.MethodDescriptor.<Service1.IntercomCallRequest, Service1.IntercomCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "intercomCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.IntercomCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.IntercomCallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("intercomCall"))
                  .build();
          }
        }
     }
     return getIntercomCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Service1.OneWayCommunicationRequest,
      Service1.Empty> getOneWayCommunicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oneWayCommunication",
      requestType = Service1.OneWayCommunicationRequest.class,
      responseType = Service1.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Service1.OneWayCommunicationRequest,
      Service1.Empty> getOneWayCommunicationMethod() {
    io.grpc.MethodDescriptor<Service1.OneWayCommunicationRequest, Service1.Empty> getOneWayCommunicationMethod;
    if ((getOneWayCommunicationMethod = Service1Grpc.getOneWayCommunicationMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getOneWayCommunicationMethod = Service1Grpc.getOneWayCommunicationMethod) == null) {
          Service1Grpc.getOneWayCommunicationMethod = getOneWayCommunicationMethod = 
              io.grpc.MethodDescriptor.<Service1.OneWayCommunicationRequest, Service1.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service1", "oneWayCommunication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.OneWayCommunicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service1.Empty.getDefaultInstance()))
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
    public void scanSecurityBadge(Service1.ScanSecurityBadgeRequest request,
        io.grpc.stub.StreamObserver<Service1.ScanSecurityBadgeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScanSecurityBadgeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public void securityCodeEntry(Service1.SecurityCodeEntryRequest request,
        io.grpc.stub.StreamObserver<Service1.SecurityCodeEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSecurityCodeEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns an acceptance/rejection message
     * </pre>
     */
    public void intercomCall(Service1.IntercomCallRequest request,
        io.grpc.stub.StreamObserver<Service1.IntercomCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIntercomCallMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sends a streamed message to the server when the user has the communication button held
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Service1.OneWayCommunicationRequest> oneWayCommunication(
        io.grpc.stub.StreamObserver<Service1.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getOneWayCommunicationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScanSecurityBadgeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Service1.ScanSecurityBadgeRequest,
                Service1.ScanSecurityBadgeResponse>(
                  this, METHODID_SCAN_SECURITY_BADGE)))
          .addMethod(
            getSecurityCodeEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Service1.SecurityCodeEntryRequest,
                Service1.SecurityCodeEntryResponse>(
                  this, METHODID_SECURITY_CODE_ENTRY)))
          .addMethod(
            getIntercomCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Service1.IntercomCallRequest,
                Service1.IntercomCallResponse>(
                  this, METHODID_INTERCOM_CALL)))
          .addMethod(
            getOneWayCommunicationMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Service1.OneWayCommunicationRequest,
                Service1.Empty>(
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
    public void scanSecurityBadge(Service1.ScanSecurityBadgeRequest request,
        io.grpc.stub.StreamObserver<Service1.ScanSecurityBadgeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanSecurityBadgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public void securityCodeEntry(Service1.SecurityCodeEntryRequest request,
        io.grpc.stub.StreamObserver<Service1.SecurityCodeEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecurityCodeEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns an acceptance/rejection message
     * </pre>
     */
    public void intercomCall(Service1.IntercomCallRequest request,
        io.grpc.stub.StreamObserver<Service1.IntercomCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntercomCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sends a streamed message to the server when the user has the communication button held
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Service1.OneWayCommunicationRequest> oneWayCommunication(
        io.grpc.stub.StreamObserver<Service1.Empty> responseObserver) {
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
    public Service1.ScanSecurityBadgeResponse scanSecurityBadge(Service1.ScanSecurityBadgeRequest request) {
      return blockingUnaryCall(
          getChannel(), getScanSecurityBadgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public Service1.SecurityCodeEntryResponse securityCodeEntry(Service1.SecurityCodeEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSecurityCodeEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns an acceptance/rejection message
     * </pre>
     */
    public Service1.IntercomCallResponse intercomCall(Service1.IntercomCallRequest request) {
      return blockingUnaryCall(
          getChannel(), getIntercomCallMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<Service1.ScanSecurityBadgeResponse> scanSecurityBadge(
        Service1.ScanSecurityBadgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScanSecurityBadgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Sends the user's input Security Code and returns a message after validation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Service1.SecurityCodeEntryResponse> securityCodeEntry(
        Service1.SecurityCodeEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSecurityCodeEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Sends the user's request for an intercom call and returns an acceptance/rejection message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Service1.IntercomCallResponse> intercomCall(
        Service1.IntercomCallRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIntercomCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCAN_SECURITY_BADGE = 0;
  private static final int METHODID_SECURITY_CODE_ENTRY = 1;
  private static final int METHODID_INTERCOM_CALL = 2;
  private static final int METHODID_ONE_WAY_COMMUNICATION = 3;

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
          serviceImpl.scanSecurityBadge((Service1.ScanSecurityBadgeRequest) request,
              (io.grpc.stub.StreamObserver<Service1.ScanSecurityBadgeResponse>) responseObserver);
          break;
        case METHODID_SECURITY_CODE_ENTRY:
          serviceImpl.securityCodeEntry((Service1.SecurityCodeEntryRequest) request,
              (io.grpc.stub.StreamObserver<Service1.SecurityCodeEntryResponse>) responseObserver);
          break;
        case METHODID_INTERCOM_CALL:
          serviceImpl.intercomCall((Service1.IntercomCallRequest) request,
              (io.grpc.stub.StreamObserver<Service1.IntercomCallResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<Service1.Empty>) responseObserver);
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
      return Service1.DoorControlsImpl.getDescriptor();
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
              .addMethod(getOneWayCommunicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
