// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service1.proto

package DoorController;

public final class DoorControlsImpl {
  private DoorControlsImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScanSecurityBadgeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScanSecurityBadgeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScanSecurityBadgeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScanSecurityBadgeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SecurityCodeEntryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SecurityCodeEntryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SecurityCodeEntryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SecurityCodeEntryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntercomCallRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntercomCallRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntercomCallResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntercomCallResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntercomAnswerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntercomAnswerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntercomAnswerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntercomAnswerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OneWayCommunicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OneWayCommunicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OneWayCommunicationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OneWayCommunicationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Service1.proto\";\n\030ScanSecurityBadgeReq" +
      "uest\022\016\n\006doorID\030\001 \001(\t\022\017\n\007badgeID\030\002 \001(\t\"*\n" +
      "\031ScanSecurityBadgeResponse\022\r\n\005valid\030\001 \001(" +
      "\t\"@\n\030SecurityCodeEntryRequest\022\016\n\006doorID\030" +
      "\001 \001(\t\022\024\n\014securityCode\030\002 \001(\t\"*\n\031SecurityC" +
      "odeEntryResponse\022\r\n\005valid\030\001 \001(\t\"*\n\023Inter" +
      "comCallRequest\022\023\n\013callRequest\030\001 \001(\t\",\n\024I" +
      "ntercomCallResponse\022\024\n\014callResponse\030\001 \001(" +
      "\t\".\n\025IntercomAnswerRequest\022\025\n\ranswerRequ" +
      "est\030\001 \001(\t\"0\n\026IntercomAnswerResponse\022\026\n\016a" +
      "nswerResponse\030\001 \001(\t\"0\n\032OneWayCommunicati" +
      "onRequest\022\022\n\nbuttonHeld\030\001 \001(\010\"4\n\033OneWayC" +
      "ommunicationResponse\022\025\n\rchannelStatus\030\001 " +
      "\001(\t2\200\003\n\010Service1\022L\n\021scanSecurityBadge\022\031." +
      "ScanSecurityBadgeRequest\032\032.ScanSecurityB" +
      "adgeResponse\"\000\022L\n\021securityCodeEntry\022\031.Se" +
      "curityCodeEntryRequest\032\032.SecurityCodeEnt" +
      "ryResponse\"\000\022=\n\014intercomCall\022\024.IntercomC" +
      "allRequest\032\025.IntercomCallResponse\"\000\022C\n\016i" +
      "ntercomAnswer\022\026.IntercomAnswerRequest\032\027." +
      "IntercomAnswerResponse\"\000\022T\n\023oneWayCommun" +
      "ication\022\033.OneWayCommunicationRequest\032\034.O" +
      "neWayCommunicationResponse\"\000(\001B$\n\016DoorCo" +
      "ntrollerB\020DoorControlsImplP\001b\006proto3"
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
    internal_static_ScanSecurityBadgeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScanSecurityBadgeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScanSecurityBadgeRequest_descriptor,
        new java.lang.String[] { "DoorID", "BadgeID", });
    internal_static_ScanSecurityBadgeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ScanSecurityBadgeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScanSecurityBadgeResponse_descriptor,
        new java.lang.String[] { "Valid", });
    internal_static_SecurityCodeEntryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SecurityCodeEntryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SecurityCodeEntryRequest_descriptor,
        new java.lang.String[] { "DoorID", "SecurityCode", });
    internal_static_SecurityCodeEntryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SecurityCodeEntryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SecurityCodeEntryResponse_descriptor,
        new java.lang.String[] { "Valid", });
    internal_static_IntercomCallRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_IntercomCallRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntercomCallRequest_descriptor,
        new java.lang.String[] { "CallRequest", });
    internal_static_IntercomCallResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_IntercomCallResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntercomCallResponse_descriptor,
        new java.lang.String[] { "CallResponse", });
    internal_static_IntercomAnswerRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_IntercomAnswerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntercomAnswerRequest_descriptor,
        new java.lang.String[] { "AnswerRequest", });
    internal_static_IntercomAnswerResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_IntercomAnswerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntercomAnswerResponse_descriptor,
        new java.lang.String[] { "AnswerResponse", });
    internal_static_OneWayCommunicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_OneWayCommunicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OneWayCommunicationRequest_descriptor,
        new java.lang.String[] { "ButtonHeld", });
    internal_static_OneWayCommunicationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_OneWayCommunicationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OneWayCommunicationResponse_descriptor,
        new java.lang.String[] { "ChannelStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}