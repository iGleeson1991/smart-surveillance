package AlarmController;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service3.proto")
public final class Service3Grpc {

  private Service3Grpc() {}

  public static final String SERVICE_NAME = "Service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AlarmController.ManualAlarmRequest,
      AlarmController.ManualAlarmResponse> getManualAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "manualAlarm",
      requestType = AlarmController.ManualAlarmRequest.class,
      responseType = AlarmController.ManualAlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AlarmController.ManualAlarmRequest,
      AlarmController.ManualAlarmResponse> getManualAlarmMethod() {
    io.grpc.MethodDescriptor<AlarmController.ManualAlarmRequest, AlarmController.ManualAlarmResponse> getManualAlarmMethod;
    if ((getManualAlarmMethod = Service3Grpc.getManualAlarmMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getManualAlarmMethod = Service3Grpc.getManualAlarmMethod) == null) {
          Service3Grpc.getManualAlarmMethod = getManualAlarmMethod = 
              io.grpc.MethodDescriptor.<AlarmController.ManualAlarmRequest, AlarmController.ManualAlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "manualAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.ManualAlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.ManualAlarmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("manualAlarm"))
                  .build();
          }
        }
     }
     return getManualAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AlarmController.FireSuppressionRequest,
      AlarmController.FireSuppressionResponse> getFireSuppressionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fireSuppression",
      requestType = AlarmController.FireSuppressionRequest.class,
      responseType = AlarmController.FireSuppressionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AlarmController.FireSuppressionRequest,
      AlarmController.FireSuppressionResponse> getFireSuppressionMethod() {
    io.grpc.MethodDescriptor<AlarmController.FireSuppressionRequest, AlarmController.FireSuppressionResponse> getFireSuppressionMethod;
    if ((getFireSuppressionMethod = Service3Grpc.getFireSuppressionMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getFireSuppressionMethod = Service3Grpc.getFireSuppressionMethod) == null) {
          Service3Grpc.getFireSuppressionMethod = getFireSuppressionMethod = 
              io.grpc.MethodDescriptor.<AlarmController.FireSuppressionRequest, AlarmController.FireSuppressionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "fireSuppression"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.FireSuppressionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.FireSuppressionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("fireSuppression"))
                  .build();
          }
        }
     }
     return getFireSuppressionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AlarmController.Empty,
      AlarmController.EmergencyServicesCallResponse> getEmergencyServicesCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emergencyServicesCall",
      requestType = AlarmController.Empty.class,
      responseType = AlarmController.EmergencyServicesCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AlarmController.Empty,
      AlarmController.EmergencyServicesCallResponse> getEmergencyServicesCallMethod() {
    io.grpc.MethodDescriptor<AlarmController.Empty, AlarmController.EmergencyServicesCallResponse> getEmergencyServicesCallMethod;
    if ((getEmergencyServicesCallMethod = Service3Grpc.getEmergencyServicesCallMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getEmergencyServicesCallMethod = Service3Grpc.getEmergencyServicesCallMethod) == null) {
          Service3Grpc.getEmergencyServicesCallMethod = getEmergencyServicesCallMethod = 
              io.grpc.MethodDescriptor.<AlarmController.Empty, AlarmController.EmergencyServicesCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "emergencyServicesCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.EmergencyServicesCallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("emergencyServicesCall"))
                  .build();
          }
        }
     }
     return getEmergencyServicesCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AlarmController.Empty,
      AlarmController.AlarmCheckResponse> getAlarmCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alarmCheck",
      requestType = AlarmController.Empty.class,
      responseType = AlarmController.AlarmCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<AlarmController.Empty,
      AlarmController.AlarmCheckResponse> getAlarmCheckMethod() {
    io.grpc.MethodDescriptor<AlarmController.Empty, AlarmController.AlarmCheckResponse> getAlarmCheckMethod;
    if ((getAlarmCheckMethod = Service3Grpc.getAlarmCheckMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getAlarmCheckMethod = Service3Grpc.getAlarmCheckMethod) == null) {
          Service3Grpc.getAlarmCheckMethod = getAlarmCheckMethod = 
              io.grpc.MethodDescriptor.<AlarmController.Empty, AlarmController.AlarmCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service3", "alarmCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AlarmController.AlarmCheckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("alarmCheck"))
                  .build();
          }
        }
     }
     return getAlarmCheckMethod;
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
    public void manualAlarm(AlarmController.ManualAlarmRequest request,
        io.grpc.stub.StreamObserver<AlarmController.ManualAlarmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getManualAlarmMethod(), responseObserver);
    }

    /**
     */
    public void fireSuppression(AlarmController.FireSuppressionRequest request,
        io.grpc.stub.StreamObserver<AlarmController.FireSuppressionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFireSuppressionMethod(), responseObserver);
    }

    /**
     */
    public void emergencyServicesCall(AlarmController.Empty request,
        io.grpc.stub.StreamObserver<AlarmController.EmergencyServicesCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyServicesCallMethod(), responseObserver);
    }

    /**
     */
    public void alarmCheck(AlarmController.Empty request,
        io.grpc.stub.StreamObserver<AlarmController.AlarmCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlarmCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getManualAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AlarmController.ManualAlarmRequest,
                AlarmController.ManualAlarmResponse>(
                  this, METHODID_MANUAL_ALARM)))
          .addMethod(
            getFireSuppressionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AlarmController.FireSuppressionRequest,
                AlarmController.FireSuppressionResponse>(
                  this, METHODID_FIRE_SUPPRESSION)))
          .addMethod(
            getEmergencyServicesCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AlarmController.Empty,
                AlarmController.EmergencyServicesCallResponse>(
                  this, METHODID_EMERGENCY_SERVICES_CALL)))
          .addMethod(
            getAlarmCheckMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                AlarmController.Empty,
                AlarmController.AlarmCheckResponse>(
                  this, METHODID_ALARM_CHECK)))
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
    public void manualAlarm(AlarmController.ManualAlarmRequest request,
        io.grpc.stub.StreamObserver<AlarmController.ManualAlarmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getManualAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fireSuppression(AlarmController.FireSuppressionRequest request,
        io.grpc.stub.StreamObserver<AlarmController.FireSuppressionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFireSuppressionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emergencyServicesCall(AlarmController.Empty request,
        io.grpc.stub.StreamObserver<AlarmController.EmergencyServicesCallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyServicesCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alarmCheck(AlarmController.Empty request,
        io.grpc.stub.StreamObserver<AlarmController.AlarmCheckResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAlarmCheckMethod(), getCallOptions()), request, responseObserver);
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
    public AlarmController.ManualAlarmResponse manualAlarm(AlarmController.ManualAlarmRequest request) {
      return blockingUnaryCall(
          getChannel(), getManualAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public AlarmController.FireSuppressionResponse fireSuppression(AlarmController.FireSuppressionRequest request) {
      return blockingUnaryCall(
          getChannel(), getFireSuppressionMethod(), getCallOptions(), request);
    }

    /**
     */
    public AlarmController.EmergencyServicesCallResponse emergencyServicesCall(AlarmController.Empty request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyServicesCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<AlarmController.AlarmCheckResponse> alarmCheck(
        AlarmController.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getAlarmCheckMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<AlarmController.ManualAlarmResponse> manualAlarm(
        AlarmController.ManualAlarmRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getManualAlarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AlarmController.FireSuppressionResponse> fireSuppression(
        AlarmController.FireSuppressionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFireSuppressionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AlarmController.EmergencyServicesCallResponse> emergencyServicesCall(
        AlarmController.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyServicesCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MANUAL_ALARM = 0;
  private static final int METHODID_FIRE_SUPPRESSION = 1;
  private static final int METHODID_EMERGENCY_SERVICES_CALL = 2;
  private static final int METHODID_ALARM_CHECK = 3;

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
          serviceImpl.manualAlarm((AlarmController.ManualAlarmRequest) request,
              (io.grpc.stub.StreamObserver<AlarmController.ManualAlarmResponse>) responseObserver);
          break;
        case METHODID_FIRE_SUPPRESSION:
          serviceImpl.fireSuppression((AlarmController.FireSuppressionRequest) request,
              (io.grpc.stub.StreamObserver<AlarmController.FireSuppressionResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_SERVICES_CALL:
          serviceImpl.emergencyServicesCall((AlarmController.Empty) request,
              (io.grpc.stub.StreamObserver<AlarmController.EmergencyServicesCallResponse>) responseObserver);
          break;
        case METHODID_ALARM_CHECK:
          serviceImpl.alarmCheck((AlarmController.Empty) request,
              (io.grpc.stub.StreamObserver<AlarmController.AlarmCheckResponse>) responseObserver);
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
      return AlarmController.AlarmControlsImpl.getDescriptor();
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
              .addMethod(getAlarmCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
