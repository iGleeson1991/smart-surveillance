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
    internal_static_MotionDetectedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MotionDetectedRequest_fieldAccessorTable;
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
      "\n\016Service2.proto\"\307\001\n\027CameraAdjustmentReq" +
      "uest\022\020\n\010cameraID\030\001 \001(\t\022A\n\017cameraDirectio" +
      "n\030\002 \001(\0162(.CameraAdjustmentRequest.Camera" +
      "Direction\022\035\n\025cameraBeingControlled\030\003 \001(\010" +
      "\"8\n\017CameraDirection\022\006\n\002UP\020\000\022\010\n\004DOWN\020\001\022\010\n" +
      "\004LEFT\020\002\022\t\n\005RIGHT\020\003\"2\n\030CameraAdjustmentRe" +
      "sponse\022\026\n\016cameraPosition\030\001 \001(\t\"1\n\025Motion" +
      "DetectedRequest\022\030\n\020motionedDetected\030\001 \001(" +
      "\010\"0\n\026MotionDetectedResponse\022\026\n\016detection" +
      "Alert\030\001 \001(\t\"\226\001\n\027CameraAutomationRequest\022" +
      "\020\n\010cameraID\030\001 \001(\t\022\026\n\016motionDetected\030\002 \001(" +
      "\010\022\035\n\025cameraBeingControlled\030\003 \001(\010\022\032\n\022loca" +
      "tionOfMovement\030\004 \001(\t\022\026\n\016cameraPosition\030\005" +
      " \001(\t\"3\n\030CameraAutomationResponse\022\027\n\017came" +
      "raDirection\030\001 \001(\t2\355\001\n\010Service2\022M\n\020camera" +
      "Adjustment\022\030.CameraAdjustmentRequest\032\031.C" +
      "ameraAdjustmentResponse\"\000(\0010\001\022C\n\016motionD" +
      "etected\022\026.MotionDetectedRequest\032\027.Motion" +
      "DetectedResponse\"\000\022M\n\020cameraAutomation\022\030" +
      ".CameraAutomationRequest\032\031.CameraAutomat" +
      "ionResponse\"\000(\0010\001B(\n\020CameraControllerB\022C" +
      "ameraControlsImplP\001b\006proto3"
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
        new java.lang.String[] { "CameraID", "CameraDirection", "CameraBeingControlled", });
    internal_static_CameraAdjustmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CameraAdjustmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CameraAdjustmentResponse_descriptor,
        new java.lang.String[] { "CameraPosition", });
    internal_static_MotionDetectedRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MotionDetectedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MotionDetectedRequest_descriptor,
        new java.lang.String[] { "MotionedDetected", });
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
        new java.lang.String[] { "CameraID", "MotionDetected", "CameraBeingControlled", "LocationOfMovement", "CameraPosition", });
    internal_static_CameraAutomationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_CameraAutomationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CameraAutomationResponse_descriptor,
        new java.lang.String[] { "CameraDirection", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
