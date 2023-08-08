package CameraController;

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
    comments = "Source: Service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CameraController.CameraAdjustmentRequest,
      CameraController.CameraAdjustmentResponse> getCameraAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cameraAdjustment",
      requestType = CameraController.CameraAdjustmentRequest.class,
      responseType = CameraController.CameraAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<CameraController.CameraAdjustmentRequest,
      CameraController.CameraAdjustmentResponse> getCameraAdjustmentMethod() {
    io.grpc.MethodDescriptor<CameraController.CameraAdjustmentRequest, CameraController.CameraAdjustmentResponse> getCameraAdjustmentMethod;
    if ((getCameraAdjustmentMethod = Service2Grpc.getCameraAdjustmentMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getCameraAdjustmentMethod = Service2Grpc.getCameraAdjustmentMethod) == null) {
          Service2Grpc.getCameraAdjustmentMethod = getCameraAdjustmentMethod = 
              io.grpc.MethodDescriptor.<CameraController.CameraAdjustmentRequest, CameraController.CameraAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service2", "cameraAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CameraController.CameraAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CameraController.CameraAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("cameraAdjustment"))
                  .build();
          }
        }
     }
     return getCameraAdjustmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CameraController.Empty,
      CameraController.MotionDetectedResponse> getMotionDetectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "motionDetected",
      requestType = CameraController.Empty.class,
      responseType = CameraController.MotionDetectedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CameraController.Empty,
      CameraController.MotionDetectedResponse> getMotionDetectedMethod() {
    io.grpc.MethodDescriptor<CameraController.Empty, CameraController.MotionDetectedResponse> getMotionDetectedMethod;
    if ((getMotionDetectedMethod = Service2Grpc.getMotionDetectedMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getMotionDetectedMethod = Service2Grpc.getMotionDetectedMethod) == null) {
          Service2Grpc.getMotionDetectedMethod = getMotionDetectedMethod = 
              io.grpc.MethodDescriptor.<CameraController.Empty, CameraController.MotionDetectedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service2", "motionDetected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CameraController.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CameraController.MotionDetectedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("motionDetected"))
                  .build();
          }
        }
     }
     return getMotionDetectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CameraController.CameraAutomationRequest,
      CameraController.CameraAutomationResponse> getCameraAutomationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cameraAutomation",
      requestType = CameraController.CameraAutomationRequest.class,
      responseType = CameraController.CameraAutomationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<CameraController.CameraAutomationRequest,
      CameraController.CameraAutomationResponse> getCameraAutomationMethod() {
    io.grpc.MethodDescriptor<CameraController.CameraAutomationRequest, CameraController.CameraAutomationResponse> getCameraAutomationMethod;
    if ((getCameraAutomationMethod = Service2Grpc.getCameraAutomationMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getCameraAutomationMethod = Service2Grpc.getCameraAutomationMethod) == null) {
          Service2Grpc.getCameraAutomationMethod = getCameraAutomationMethod = 
              io.grpc.MethodDescriptor.<CameraController.CameraAutomationRequest, CameraController.CameraAutomationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service2", "cameraAutomation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CameraController.CameraAutomationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CameraController.CameraAutomationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("cameraAutomation"))
                  .build();
          }
        }
     }
     return getCameraAutomationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Takes in direction controls and moves the currently selected camera
     * </pre>
     */
    public io.grpc.stub.StreamObserver<CameraController.CameraAdjustmentRequest> cameraAdjustment(
        io.grpc.stub.StreamObserver<CameraController.CameraAdjustmentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCameraAdjustmentMethod(), responseObserver);
    }

    /**
     * <pre>
     *When motion is detected on the camera not in use, the user is notified
     * </pre>
     */
    public void motionDetected(CameraController.Empty request,
        io.grpc.stub.StreamObserver<CameraController.MotionDetectedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMotionDetectedMethod(), responseObserver);
    }

    /**
     * <pre>
     *When motion is detected on the camera not in use, the camera autonomously moves to the location of the motion
     * </pre>
     */
    public io.grpc.stub.StreamObserver<CameraController.CameraAutomationRequest> cameraAutomation(
        io.grpc.stub.StreamObserver<CameraController.CameraAutomationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCameraAutomationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCameraAdjustmentMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CameraController.CameraAdjustmentRequest,
                CameraController.CameraAdjustmentResponse>(
                  this, METHODID_CAMERA_ADJUSTMENT)))
          .addMethod(
            getMotionDetectedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CameraController.Empty,
                CameraController.MotionDetectedResponse>(
                  this, METHODID_MOTION_DETECTED)))
          .addMethod(
            getCameraAutomationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CameraController.CameraAutomationRequest,
                CameraController.CameraAutomationResponse>(
                  this, METHODID_CAMERA_AUTOMATION)))
          .build();
    }
  }

  /**
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *Takes in direction controls and moves the currently selected camera
     * </pre>
     */
    public io.grpc.stub.StreamObserver<CameraController.CameraAdjustmentRequest> cameraAdjustment(
        io.grpc.stub.StreamObserver<CameraController.CameraAdjustmentResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCameraAdjustmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *When motion is detected on the camera not in use, the user is notified
     * </pre>
     */
    public void motionDetected(CameraController.Empty request,
        io.grpc.stub.StreamObserver<CameraController.MotionDetectedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMotionDetectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *When motion is detected on the camera not in use, the camera autonomously moves to the location of the motion
     * </pre>
     */
    public io.grpc.stub.StreamObserver<CameraController.CameraAutomationRequest> cameraAutomation(
        io.grpc.stub.StreamObserver<CameraController.CameraAutomationResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCameraAutomationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *When motion is detected on the camera not in use, the user is notified
     * </pre>
     */
    public CameraController.MotionDetectedResponse motionDetected(CameraController.Empty request) {
      return blockingUnaryCall(
          getChannel(), getMotionDetectedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *When motion is detected on the camera not in use, the user is notified
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CameraController.MotionDetectedResponse> motionDetected(
        CameraController.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getMotionDetectedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOTION_DETECTED = 0;
  private static final int METHODID_CAMERA_ADJUSTMENT = 1;
  private static final int METHODID_CAMERA_AUTOMATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOTION_DETECTED:
          serviceImpl.motionDetected((CameraController.Empty) request,
              (io.grpc.stub.StreamObserver<CameraController.MotionDetectedResponse>) responseObserver);
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
        case METHODID_CAMERA_ADJUSTMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cameraAdjustment(
              (io.grpc.stub.StreamObserver<CameraController.CameraAdjustmentResponse>) responseObserver);
        case METHODID_CAMERA_AUTOMATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cameraAutomation(
              (io.grpc.stub.StreamObserver<CameraController.CameraAutomationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CameraController.CameraControlsImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getCameraAdjustmentMethod())
              .addMethod(getMotionDetectedMethod())
              .addMethod(getCameraAutomationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
