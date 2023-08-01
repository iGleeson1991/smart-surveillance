package Service3;

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
    comments = "Source: Service3.proto")
public final class Service3Grpc {

  private Service3Grpc() {}

  public static final String SERVICE_NAME = "Service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Service3.ManualAlarmRequest,
      Service3.ManualAlarmResponse> getManualAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "manualAlarm",
      requestType = Service3.ManualAlarmRequest.class,
      responseType = Service3.ManualAlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Service3.ManualAlarmRequest,
      Service3.ManualAlarmResponse> getManualAlarmMethod() {
    io.grpc.MethodDescriptor<Service3.ManualAlarmRequest, Service3.ManualAlarmResponse> getManualAlarmMethod;
    if ((getManualAlarmMethod = Service3Grpc.getManualAlarmMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getManualAlarmMethod = Service3Grpc.getManualAlarmMethod) == null) {
          Service3Grpc.getManualAlarmMethod = getManualAlarmMethod = 
              io.grpc.MethodDescriptor.<Service3.ManualAlarmRequest, Service3.ManualAlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "manualAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service3.ManualAlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service3.ManualAlarmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("manualAlarm"))
                  .build();
          }
        }
     }
     return getManualAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Service3.FireSuppressionRequest,
      Service3.FireSuppressionResponse> getFireSuppressionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fireSuppression",
      requestType = Service3.FireSuppressionRequest.class,
      responseType = Service3.FireSuppressionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Service3.FireSuppressionRequest,
      Service3.FireSuppressionResponse> getFireSuppressionMethod() {
    io.grpc.MethodDescriptor<Service3.FireSuppressionRequest, Service3.FireSuppressionResponse> getFireSuppressionMethod;
    if ((getFireSuppressionMethod = Service3Grpc.getFireSuppressionMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getFireSuppressionMethod = Service3Grpc.getFireSuppressionMethod) == null) {
          Service3Grpc.getFireSuppressionMethod = getFireSuppressionMethod = 
              io.grpc.MethodDescriptor.<Service3.FireSuppressionRequest, Service3.FireSuppressionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "fireSuppression"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service3.FireSuppressionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service3.FireSuppressionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("fireSuppression"))
                  .build();
          }
        }
     }
     return getFireSuppressionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Service3.EmergencyServicesCallRequest,
      Service3.EmergencyServicesCallResponse> getEmergencyServicesCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emergencyServicesCall",
      requestType = Service3.EmergencyServicesCallRequest.class,
      responseType = Service3.EmergencyServicesCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Service3.EmergencyServicesCallRequest,
      Service3.EmergencyServicesCallResponse> getEmergencyServicesCallMethod() {
    io.grpc.MethodDescriptor<Service3.EmergencyServicesCallRequest, Service3.EmergencyServicesCallResponse> getEmergencyServicesCallMethod;
    if ((getEmergencyServicesCallMethod = Service3Grpc.getEmergencyServicesCallMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getEmergencyServicesCallMethod = Service3Grpc.getEmergencyServicesCallMethod) == null) {
          Service3Grpc.getEmergencyServicesCallMethod = getEmergencyServicesCallMethod = 
              io.grpc.MethodDescriptor.<Service3.EmergencyServicesCallRequest, Service3.EmergencyServicesCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "emergencyServicesCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service3.EmergencyServicesCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service3.EmergencyServicesCallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("emergencyServicesCall"))
                  .build();
          }
        }
     }
     return getEmergencyServicesCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service3Stub newStub(io.grpc.Channel channel) {
    return new Service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service3FutureStub(channel);
  }

  /**
   */
  public static abstract class Service3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void manualAlarm(Service3.ManualAlarmRequest request,
        io.grpc.stub.StreamObserver<Service3.ManualAlarmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getManualAlarmMethod(), responseObserver);
    }

    /**
     */
    public void fireSuppression(Service3.FireSuppressionRequest request,
        io.grpc.stub.StreamObserver<Service3.FireSuppressionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFireSuppressionMethod(), responseObserver);
    }

    /**
     */
    public void emergencyServicesCall(Service3.EmergencyServicesCallRequest request,
        io.grpc.stub.StreamObserver<Service3.EmergencyServicesCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyServicesCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getManualAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Service3.ManualAlarmRequest,
                Service3.ManualAlarmResponse>(
                  this, METHODID_MANUAL_ALARM)))
          .addMethod(
            getFireSuppressionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Service3.FireSuppressionRequest,
                Service3.FireSuppressionResponse>(
                  this, METHODID_FIRE_SUPPRESSION)))
          .addMethod(
            getEmergencyServicesCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Service3.EmergencyServicesCallRequest,
                Service3.EmergencyServicesCallResponse>(
                  this, METHODID_EMERGENCY_SERVICES_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class Service3Stub extends io.grpc.stub.AbstractStub<Service3Stub> {
    private Service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3Stub(channel, callOptions);
    }

    /**
     */
    public void manualAlarm(Service3.ManualAlarmRequest request,
        io.grpc.stub.StreamObserver<Service3.ManualAlarmResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getManualAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fireSuppression(Service3.FireSuppressionRequest request,
        io.grpc.stub.StreamObserver<Service3.FireSuppressionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFireSuppressionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emergencyServicesCall(Service3.EmergencyServicesCallRequest request,
        io.grpc.stub.StreamObserver<Service3.EmergencyServicesCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyServicesCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Service3BlockingStub extends io.grpc.stub.AbstractStub<Service3BlockingStub> {
    private Service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3BlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<Service3.ManualAlarmResponse> manualAlarm(
        Service3.ManualAlarmRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getManualAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Service3.FireSuppressionResponse> fireSuppression(
        Service3.FireSuppressionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFireSuppressionMethod(), getCallOptions(), request);
    }

    /**
     */
    public Service3.EmergencyServicesCallResponse emergencyServicesCall(Service3.EmergencyServicesCallRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyServicesCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service3FutureStub extends io.grpc.stub.AbstractStub<Service3FutureStub> {
    private Service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Service3.EmergencyServicesCallResponse> emergencyServicesCall(
        Service3.EmergencyServicesCallRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyServicesCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MANUAL_ALARM = 0;
  private static final int METHODID_FIRE_SUPPRESSION = 1;
  private static final int METHODID_EMERGENCY_SERVICES_CALL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MANUAL_ALARM:
          serviceImpl.manualAlarm((Service3.ManualAlarmRequest) request,
              (io.grpc.stub.StreamObserver<Service3.ManualAlarmResponse>) responseObserver);
          break;
        case METHODID_FIRE_SUPPRESSION:
          serviceImpl.fireSuppression((Service3.FireSuppressionRequest) request,
              (io.grpc.stub.StreamObserver<Service3.FireSuppressionResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_SERVICES_CALL:
          serviceImpl.emergencyServicesCall((Service3.EmergencyServicesCallRequest) request,
              (io.grpc.stub.StreamObserver<Service3.EmergencyServicesCallResponse>) responseObserver);
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

  private static abstract class Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Service3.AlarmControlsImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service3");
    }
  }

  private static final class Service3FileDescriptorSupplier
      extends Service3BaseDescriptorSupplier {
    Service3FileDescriptorSupplier() {}
  }

  private static final class Service3MethodDescriptorSupplier
      extends Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service3FileDescriptorSupplier())
              .addMethod(getManualAlarmMethod())
              .addMethod(getFireSuppressionMethod())
              .addMethod(getEmergencyServicesCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
