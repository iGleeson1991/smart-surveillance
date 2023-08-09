// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service2.proto

package CameraController;

public final class CameraControlsImpl {
  private CameraControlsImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CameraAdjustmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CameraAdjustmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CameraAdjustmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CameraAdjustmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MotionDetectedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MotionDetectedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CameraAutomationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CameraAutomationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CameraAutomationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CameraAutomationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Service2.proto\"\312\001\n\027CameraAdjustmentReq" +
      "uest\022\020\n\010cameraID\030\001 \001(\t\022\026\n\016cameraPosition" +
      "\030\002 \001(\t\022A\n\017cameraDirection\030\003 \001(\0162(.Camera" +
      "AdjustmentRequest.CameraDirection\"B\n\017Cam" +
      "eraDirection\022\010\n\004WAIT\020\000\022\006\n\002UP\020\001\022\010\n\004DOWN\020\002" +
      "\022\010\n\004LEFT\020\003\022\t\n\005RIGHT\020\004\"2\n\030CameraAdjustmen" +
      "tResponse\022\026\n\016cameraPosition\030\001 \001(\t\"\007\n\005Emp" +
      "ty\"0\n\026MotionDetectedResponse\022\026\n\016detectio" +
      "nAlert\030\001 \001(\t\"P\n\027CameraAutomationRequest\022" +
      "\031\n\021automatedCameraID\030\001 \001(\t\022\032\n\022locationOf" +
      "Movement\030\002 \001(\t\"4\n\030CameraAutomationRespon" +
      "se\022\030\n\020cameraAutomation\030\001 \001(\t2\331\001\n\010Service" +
      "2\022M\n\020cameraAdjustment\022\030.CameraAdjustment" +
      "Request\032\031.CameraAdjustmentResponse\"\000(\0010\001" +
      "\0223\n\016motionDetected\022\006.Empty\032\027.MotionDetec" +
      "tedResponse\"\000\022I\n\020cameraAutomation\022\030.Came" +
      "raAutomationRequest\032\031.CameraAutomationRe" +
      "sponse\"\000B(\n\020CameraControllerB\022CameraCont" +
      "rolsImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_CameraAdjustmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CameraAdjustmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CameraAdjustmentRequest_descriptor,
        new java.lang.String[] { "CameraID", "CameraPosition", "CameraDirection", });
    internal_static_CameraAdjustmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CameraAdjustmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CameraAdjustmentResponse_descriptor,
        new java.lang.String[] { "CameraPosition", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_MotionDetectedResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MotionDetectedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MotionDetectedResponse_descriptor,
        new java.lang.String[] { "DetectionAlert", });
    internal_static_CameraAutomationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_CameraAutomationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CameraAutomationRequest_descriptor,
        new java.lang.String[] { "AutomatedCameraID", "LocationOfMovement", });
    internal_static_CameraAutomationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_CameraAutomationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CameraAutomationResponse_descriptor,
        new java.lang.String[] { "CameraAutomation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
