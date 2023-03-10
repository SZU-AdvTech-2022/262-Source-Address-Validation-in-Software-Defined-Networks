package org.sdnplatform.sync.thrift;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SuppressWarnings("all") public class SyncMessage implements org.apache.thrift.TBase<SyncMessage, SyncMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SyncMessage");
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HELLO_FIELD_DESC = new org.apache.thrift.protocol.TField("hello", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ECHO_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("echoRequest", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField ECHO_REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("echoReply", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField GET_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("getRequest", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField GET_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("getResponse", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField PUT_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("putRequest", org.apache.thrift.protocol.TType.STRUCT, (short)8);
  private static final org.apache.thrift.protocol.TField PUT_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("putResponse", org.apache.thrift.protocol.TType.STRUCT, (short)9);
  private static final org.apache.thrift.protocol.TField DELETE_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("deleteRequest", org.apache.thrift.protocol.TType.STRUCT, (short)10);
  private static final org.apache.thrift.protocol.TField DELETE_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("deleteResponse", org.apache.thrift.protocol.TType.STRUCT, (short)11);
  private static final org.apache.thrift.protocol.TField SYNC_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("syncValue", org.apache.thrift.protocol.TType.STRUCT, (short)12);
  private static final org.apache.thrift.protocol.TField SYNC_VALUE_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("syncValueResponse", org.apache.thrift.protocol.TType.STRUCT, (short)13);
  private static final org.apache.thrift.protocol.TField SYNC_OFFER_FIELD_DESC = new org.apache.thrift.protocol.TField("syncOffer", org.apache.thrift.protocol.TType.STRUCT, (short)14);
  private static final org.apache.thrift.protocol.TField SYNC_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("syncRequest", org.apache.thrift.protocol.TType.STRUCT, (short)15);
  private static final org.apache.thrift.protocol.TField FULL_SYNC_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("fullSyncRequest", org.apache.thrift.protocol.TType.STRUCT, (short)16);
  private static final org.apache.thrift.protocol.TField CURSOR_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("cursorRequest", org.apache.thrift.protocol.TType.STRUCT, (short)17);
  private static final org.apache.thrift.protocol.TField CURSOR_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("cursorResponse", org.apache.thrift.protocol.TType.STRUCT, (short)18);
  private static final org.apache.thrift.protocol.TField REGISTER_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("registerRequest", org.apache.thrift.protocol.TType.STRUCT, (short)19);
  private static final org.apache.thrift.protocol.TField REGISTER_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("registerResponse", org.apache.thrift.protocol.TType.STRUCT, (short)20);
  private static final org.apache.thrift.protocol.TField CLUSTER_JOIN_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterJoinRequest", org.apache.thrift.protocol.TType.STRUCT, (short)21);
  private static final org.apache.thrift.protocol.TField CLUSTER_JOIN_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterJoinResponse", org.apache.thrift.protocol.TType.STRUCT, (short)22);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SyncMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SyncMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    HELLO((short)2, "hello"),
    ERROR((short)3, "error"),
    ECHO_REQUEST((short)4, "echoRequest"),
    ECHO_REPLY((short)5, "echoReply"),
    GET_REQUEST((short)6, "getRequest"),
    GET_RESPONSE((short)7, "getResponse"),
    PUT_REQUEST((short)8, "putRequest"),
    PUT_RESPONSE((short)9, "putResponse"),
    DELETE_REQUEST((short)10, "deleteRequest"),
    DELETE_RESPONSE((short)11, "deleteResponse"),
    SYNC_VALUE((short)12, "syncValue"),
    SYNC_VALUE_RESPONSE((short)13, "syncValueResponse"),
    SYNC_OFFER((short)14, "syncOffer"),
    SYNC_REQUEST((short)15, "syncRequest"),
    FULL_SYNC_REQUEST((short)16, "fullSyncRequest"),
    CURSOR_REQUEST((short)17, "cursorRequest"),
    CURSOR_RESPONSE((short)18, "cursorResponse"),
    REGISTER_REQUEST((short)19, "registerRequest"),
    REGISTER_RESPONSE((short)20, "registerResponse"),
    CLUSTER_JOIN_REQUEST((short)21, "clusterJoinRequest"),
    CLUSTER_JOIN_RESPONSE((short)22, "clusterJoinResponse");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return TYPE;
          return HELLO;
          return ERROR;
          return ECHO_REQUEST;
          return ECHO_REPLY;
          return GET_REQUEST;
          return GET_RESPONSE;
          return PUT_REQUEST;
          return PUT_RESPONSE;
          return DELETE_REQUEST;
          return DELETE_RESPONSE;
          return SYNC_VALUE;
          return SYNC_VALUE_RESPONSE;
          return SYNC_OFFER;
          return SYNC_REQUEST;
          return FULL_SYNC_REQUEST;
          return CURSOR_REQUEST;
          return CURSOR_RESPONSE;
          return REGISTER_REQUEST;
          return REGISTER_RESPONSE;
          return CLUSTER_JOIN_REQUEST;
          return CLUSTER_JOIN_RESPONSE;
        default:
          return null;
      }
    }
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
    private final short _thriftId;
    private final String _fieldName;
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
    public short getThriftFieldId() {
      return _thriftId;
    }
    public String getFieldName() {
      return _fieldName;
    }
  }
  private _Fields optionals[] = {_Fields.HELLO,_Fields.ERROR,_Fields.ECHO_REQUEST,_Fields.ECHO_REPLY,_Fields.GET_REQUEST,_Fields.GET_RESPONSE,_Fields.PUT_REQUEST,_Fields.PUT_RESPONSE,_Fields.DELETE_REQUEST,_Fields.DELETE_RESPONSE,_Fields.SYNC_VALUE,_Fields.SYNC_VALUE_RESPONSE,_Fields.SYNC_OFFER,_Fields.SYNC_REQUEST,_Fields.FULL_SYNC_REQUEST,_Fields.CURSOR_REQUEST,_Fields.CURSOR_RESPONSE,_Fields.REGISTER_REQUEST,_Fields.REGISTER_RESPONSE,_Fields.CLUSTER_JOIN_REQUEST,_Fields.CLUSTER_JOIN_RESPONSE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MessageType.class)));
    tmpMap.put(_Fields.HELLO, new org.apache.thrift.meta_data.FieldMetaData("hello", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HelloMessage.class)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ErrorMessage.class)));
    tmpMap.put(_Fields.ECHO_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("echoRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EchoRequestMessage.class)));
    tmpMap.put(_Fields.ECHO_REPLY, new org.apache.thrift.meta_data.FieldMetaData("echoReply", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EchoReplyMessage.class)));
    tmpMap.put(_Fields.GET_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("getRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GetRequestMessage.class)));
    tmpMap.put(_Fields.GET_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("getResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GetResponseMessage.class)));
    tmpMap.put(_Fields.PUT_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("putRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PutRequestMessage.class)));
    tmpMap.put(_Fields.PUT_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("putResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PutResponseMessage.class)));
    tmpMap.put(_Fields.DELETE_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("deleteRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DeleteRequestMessage.class)));
    tmpMap.put(_Fields.DELETE_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("deleteResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DeleteResponseMessage.class)));
    tmpMap.put(_Fields.SYNC_VALUE, new org.apache.thrift.meta_data.FieldMetaData("syncValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncValueMessage.class)));
    tmpMap.put(_Fields.SYNC_VALUE_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("syncValueResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncValueResponseMessage.class)));
    tmpMap.put(_Fields.SYNC_OFFER, new org.apache.thrift.meta_data.FieldMetaData("syncOffer", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncOfferMessage.class)));
    tmpMap.put(_Fields.SYNC_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("syncRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncRequestMessage.class)));
    tmpMap.put(_Fields.FULL_SYNC_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("fullSyncRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FullSyncRequestMessage.class)));
    tmpMap.put(_Fields.CURSOR_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("cursorRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CursorRequestMessage.class)));
    tmpMap.put(_Fields.CURSOR_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("cursorResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CursorResponseMessage.class)));
    tmpMap.put(_Fields.REGISTER_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("registerRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RegisterRequestMessage.class)));
    tmpMap.put(_Fields.REGISTER_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("registerResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RegisterResponseMessage.class)));
    tmpMap.put(_Fields.CLUSTER_JOIN_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("clusterJoinRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ClusterJoinRequestMessage.class)));
    tmpMap.put(_Fields.CLUSTER_JOIN_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("clusterJoinResponse", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ClusterJoinResponseMessage.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SyncMessage.class, metaDataMap);
  }
  public SyncMessage() {
  }
  public SyncMessage(
    MessageType type)
  {
    this();
    this.type = type;
  }
  public SyncMessage(SyncMessage other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetHello()) {
      this.hello = new HelloMessage(other.hello);
    }
    if (other.isSetError()) {
      this.error = new ErrorMessage(other.error);
    }
    if (other.isSetEchoRequest()) {
      this.echoRequest = new EchoRequestMessage(other.echoRequest);
    }
    if (other.isSetEchoReply()) {
      this.echoReply = new EchoReplyMessage(other.echoReply);
    }
    if (other.isSetGetRequest()) {
      this.getRequest = new GetRequestMessage(other.getRequest);
    }
    if (other.isSetGetResponse()) {
      this.getResponse = new GetResponseMessage(other.getResponse);
    }
    if (other.isSetPutRequest()) {
      this.putRequest = new PutRequestMessage(other.putRequest);
    }
    if (other.isSetPutResponse()) {
      this.putResponse = new PutResponseMessage(other.putResponse);
    }
    if (other.isSetDeleteRequest()) {
      this.deleteRequest = new DeleteRequestMessage(other.deleteRequest);
    }
    if (other.isSetDeleteResponse()) {
      this.deleteResponse = new DeleteResponseMessage(other.deleteResponse);
    }
    if (other.isSetSyncValue()) {
      this.syncValue = new SyncValueMessage(other.syncValue);
    }
    if (other.isSetSyncValueResponse()) {
      this.syncValueResponse = new SyncValueResponseMessage(other.syncValueResponse);
    }
    if (other.isSetSyncOffer()) {
      this.syncOffer = new SyncOfferMessage(other.syncOffer);
    }
    if (other.isSetSyncRequest()) {
      this.syncRequest = new SyncRequestMessage(other.syncRequest);
    }
    if (other.isSetFullSyncRequest()) {
      this.fullSyncRequest = new FullSyncRequestMessage(other.fullSyncRequest);
    }
    if (other.isSetCursorRequest()) {
      this.cursorRequest = new CursorRequestMessage(other.cursorRequest);
    }
    if (other.isSetCursorResponse()) {
      this.cursorResponse = new CursorResponseMessage(other.cursorResponse);
    }
    if (other.isSetRegisterRequest()) {
      this.registerRequest = new RegisterRequestMessage(other.registerRequest);
    }
    if (other.isSetRegisterResponse()) {
      this.registerResponse = new RegisterResponseMessage(other.registerResponse);
    }
    if (other.isSetClusterJoinRequest()) {
      this.clusterJoinRequest = new ClusterJoinRequestMessage(other.clusterJoinRequest);
    }
    if (other.isSetClusterJoinResponse()) {
      this.clusterJoinResponse = new ClusterJoinResponseMessage(other.clusterJoinResponse);
    }
  }
  public SyncMessage deepCopy() {
    return new SyncMessage(this);
  }
  @Override
  public void clear() {
    this.type = null;
    this.hello = null;
    this.error = null;
    this.echoRequest = null;
    this.echoReply = null;
    this.getRequest = null;
    this.getResponse = null;
    this.putRequest = null;
    this.putResponse = null;
    this.deleteRequest = null;
    this.deleteResponse = null;
    this.syncValue = null;
    this.syncValueResponse = null;
    this.syncOffer = null;
    this.syncRequest = null;
    this.fullSyncRequest = null;
    this.cursorRequest = null;
    this.cursorResponse = null;
    this.registerRequest = null;
    this.registerResponse = null;
    this.clusterJoinRequest = null;
    this.clusterJoinResponse = null;
  }
  public MessageType getType() {
    return this.type;
  }
  public SyncMessage setType(MessageType type) {
    this.type = type;
    return this;
  }
  public void unsetType() {
    this.type = null;
  }
  public boolean isSetType() {
    return this.type != null;
  }
  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }
  public HelloMessage getHello() {
    return this.hello;
  }
  public SyncMessage setHello(HelloMessage hello) {
    this.hello = hello;
    return this;
  }
  public void unsetHello() {
    this.hello = null;
  }
  public boolean isSetHello() {
    return this.hello != null;
  }
  public void setHelloIsSet(boolean value) {
    if (!value) {
      this.hello = null;
    }
  }
  public ErrorMessage getError() {
    return this.error;
  }
  public SyncMessage setError(ErrorMessage error) {
    this.error = error;
    return this;
  }
  public void unsetError() {
    this.error = null;
  }
  public boolean isSetError() {
    return this.error != null;
  }
  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }
  public EchoRequestMessage getEchoRequest() {
    return this.echoRequest;
  }
  public SyncMessage setEchoRequest(EchoRequestMessage echoRequest) {
    this.echoRequest = echoRequest;
    return this;
  }
  public void unsetEchoRequest() {
    this.echoRequest = null;
  }
  public boolean isSetEchoRequest() {
    return this.echoRequest != null;
  }
  public void setEchoRequestIsSet(boolean value) {
    if (!value) {
      this.echoRequest = null;
    }
  }
  public EchoReplyMessage getEchoReply() {
    return this.echoReply;
  }
  public SyncMessage setEchoReply(EchoReplyMessage echoReply) {
    this.echoReply = echoReply;
    return this;
  }
  public void unsetEchoReply() {
    this.echoReply = null;
  }
  public boolean isSetEchoReply() {
    return this.echoReply != null;
  }
  public void setEchoReplyIsSet(boolean value) {
    if (!value) {
      this.echoReply = null;
    }
  }
  public GetRequestMessage getGetRequest() {
    return this.getRequest;
  }
  public SyncMessage setGetRequest(GetRequestMessage getRequest) {
    this.getRequest = getRequest;
    return this;
  }
  public void unsetGetRequest() {
    this.getRequest = null;
  }
  public boolean isSetGetRequest() {
    return this.getRequest != null;
  }
  public void setGetRequestIsSet(boolean value) {
    if (!value) {
      this.getRequest = null;
    }
  }
  public GetResponseMessage getGetResponse() {
    return this.getResponse;
  }
  public SyncMessage setGetResponse(GetResponseMessage getResponse) {
    this.getResponse = getResponse;
    return this;
  }
  public void unsetGetResponse() {
    this.getResponse = null;
  }
  public boolean isSetGetResponse() {
    return this.getResponse != null;
  }
  public void setGetResponseIsSet(boolean value) {
    if (!value) {
      this.getResponse = null;
    }
  }
  public PutRequestMessage getPutRequest() {
    return this.putRequest;
  }
  public SyncMessage setPutRequest(PutRequestMessage putRequest) {
    this.putRequest = putRequest;
    return this;
  }
  public void unsetPutRequest() {
    this.putRequest = null;
  }
  public boolean isSetPutRequest() {
    return this.putRequest != null;
  }
  public void setPutRequestIsSet(boolean value) {
    if (!value) {
      this.putRequest = null;
    }
  }
  public PutResponseMessage getPutResponse() {
    return this.putResponse;
  }
  public SyncMessage setPutResponse(PutResponseMessage putResponse) {
    this.putResponse = putResponse;
    return this;
  }
  public void unsetPutResponse() {
    this.putResponse = null;
  }
  public boolean isSetPutResponse() {
    return this.putResponse != null;
  }
  public void setPutResponseIsSet(boolean value) {
    if (!value) {
      this.putResponse = null;
    }
  }
  public DeleteRequestMessage getDeleteRequest() {
    return this.deleteRequest;
  }
  public SyncMessage setDeleteRequest(DeleteRequestMessage deleteRequest) {
    this.deleteRequest = deleteRequest;
    return this;
  }
  public void unsetDeleteRequest() {
    this.deleteRequest = null;
  }
  public boolean isSetDeleteRequest() {
    return this.deleteRequest != null;
  }
  public void setDeleteRequestIsSet(boolean value) {
    if (!value) {
      this.deleteRequest = null;
    }
  }
  public DeleteResponseMessage getDeleteResponse() {
    return this.deleteResponse;
  }
  public SyncMessage setDeleteResponse(DeleteResponseMessage deleteResponse) {
    this.deleteResponse = deleteResponse;
    return this;
  }
  public void unsetDeleteResponse() {
    this.deleteResponse = null;
  }
  public boolean isSetDeleteResponse() {
    return this.deleteResponse != null;
  }
  public void setDeleteResponseIsSet(boolean value) {
    if (!value) {
      this.deleteResponse = null;
    }
  }
  public SyncValueMessage getSyncValue() {
    return this.syncValue;
  }
  public SyncMessage setSyncValue(SyncValueMessage syncValue) {
    this.syncValue = syncValue;
    return this;
  }
  public void unsetSyncValue() {
    this.syncValue = null;
  }
  public boolean isSetSyncValue() {
    return this.syncValue != null;
  }
  public void setSyncValueIsSet(boolean value) {
    if (!value) {
      this.syncValue = null;
    }
  }
  public SyncValueResponseMessage getSyncValueResponse() {
    return this.syncValueResponse;
  }
  public SyncMessage setSyncValueResponse(SyncValueResponseMessage syncValueResponse) {
    this.syncValueResponse = syncValueResponse;
    return this;
  }
  public void unsetSyncValueResponse() {
    this.syncValueResponse = null;
  }
  public boolean isSetSyncValueResponse() {
    return this.syncValueResponse != null;
  }
  public void setSyncValueResponseIsSet(boolean value) {
    if (!value) {
      this.syncValueResponse = null;
    }
  }
  public SyncOfferMessage getSyncOffer() {
    return this.syncOffer;
  }
  public SyncMessage setSyncOffer(SyncOfferMessage syncOffer) {
    this.syncOffer = syncOffer;
    return this;
  }
  public void unsetSyncOffer() {
    this.syncOffer = null;
  }
  public boolean isSetSyncOffer() {
    return this.syncOffer != null;
  }
  public void setSyncOfferIsSet(boolean value) {
    if (!value) {
      this.syncOffer = null;
    }
  }
  public SyncRequestMessage getSyncRequest() {
    return this.syncRequest;
  }
  public SyncMessage setSyncRequest(SyncRequestMessage syncRequest) {
    this.syncRequest = syncRequest;
    return this;
  }
  public void unsetSyncRequest() {
    this.syncRequest = null;
  }
  public boolean isSetSyncRequest() {
    return this.syncRequest != null;
  }
  public void setSyncRequestIsSet(boolean value) {
    if (!value) {
      this.syncRequest = null;
    }
  }
  public FullSyncRequestMessage getFullSyncRequest() {
    return this.fullSyncRequest;
  }
  public SyncMessage setFullSyncRequest(FullSyncRequestMessage fullSyncRequest) {
    this.fullSyncRequest = fullSyncRequest;
    return this;
  }
  public void unsetFullSyncRequest() {
    this.fullSyncRequest = null;
  }
  public boolean isSetFullSyncRequest() {
    return this.fullSyncRequest != null;
  }
  public void setFullSyncRequestIsSet(boolean value) {
    if (!value) {
      this.fullSyncRequest = null;
    }
  }
  public CursorRequestMessage getCursorRequest() {
    return this.cursorRequest;
  }
  public SyncMessage setCursorRequest(CursorRequestMessage cursorRequest) {
    this.cursorRequest = cursorRequest;
    return this;
  }
  public void unsetCursorRequest() {
    this.cursorRequest = null;
  }
  public boolean isSetCursorRequest() {
    return this.cursorRequest != null;
  }
  public void setCursorRequestIsSet(boolean value) {
    if (!value) {
      this.cursorRequest = null;
    }
  }
  public CursorResponseMessage getCursorResponse() {
    return this.cursorResponse;
  }
  public SyncMessage setCursorResponse(CursorResponseMessage cursorResponse) {
    this.cursorResponse = cursorResponse;
    return this;
  }
  public void unsetCursorResponse() {
    this.cursorResponse = null;
  }
  public boolean isSetCursorResponse() {
    return this.cursorResponse != null;
  }
  public void setCursorResponseIsSet(boolean value) {
    if (!value) {
      this.cursorResponse = null;
    }
  }
  public RegisterRequestMessage getRegisterRequest() {
    return this.registerRequest;
  }
  public SyncMessage setRegisterRequest(RegisterRequestMessage registerRequest) {
    this.registerRequest = registerRequest;
    return this;
  }
  public void unsetRegisterRequest() {
    this.registerRequest = null;
  }
  public boolean isSetRegisterRequest() {
    return this.registerRequest != null;
  }
  public void setRegisterRequestIsSet(boolean value) {
    if (!value) {
      this.registerRequest = null;
    }
  }
  public RegisterResponseMessage getRegisterResponse() {
    return this.registerResponse;
  }
  public SyncMessage setRegisterResponse(RegisterResponseMessage registerResponse) {
    this.registerResponse = registerResponse;
    return this;
  }
  public void unsetRegisterResponse() {
    this.registerResponse = null;
  }
  public boolean isSetRegisterResponse() {
    return this.registerResponse != null;
  }
  public void setRegisterResponseIsSet(boolean value) {
    if (!value) {
      this.registerResponse = null;
    }
  }
  public ClusterJoinRequestMessage getClusterJoinRequest() {
    return this.clusterJoinRequest;
  }
  public SyncMessage setClusterJoinRequest(ClusterJoinRequestMessage clusterJoinRequest) {
    this.clusterJoinRequest = clusterJoinRequest;
    return this;
  }
  public void unsetClusterJoinRequest() {
    this.clusterJoinRequest = null;
  }
  public boolean isSetClusterJoinRequest() {
    return this.clusterJoinRequest != null;
  }
  public void setClusterJoinRequestIsSet(boolean value) {
    if (!value) {
      this.clusterJoinRequest = null;
    }
  }
  public ClusterJoinResponseMessage getClusterJoinResponse() {
    return this.clusterJoinResponse;
  }
  public SyncMessage setClusterJoinResponse(ClusterJoinResponseMessage clusterJoinResponse) {
    this.clusterJoinResponse = clusterJoinResponse;
    return this;
  }
  public void unsetClusterJoinResponse() {
    this.clusterJoinResponse = null;
  }
  public boolean isSetClusterJoinResponse() {
    return this.clusterJoinResponse != null;
  }
  public void setClusterJoinResponseIsSet(boolean value) {
    if (!value) {
      this.clusterJoinResponse = null;
    }
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((MessageType)value);
      }
      break;
    case HELLO:
      if (value == null) {
        unsetHello();
      } else {
        setHello((HelloMessage)value);
      }
      break;
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((ErrorMessage)value);
      }
      break;
    case ECHO_REQUEST:
      if (value == null) {
        unsetEchoRequest();
      } else {
        setEchoRequest((EchoRequestMessage)value);
      }
      break;
    case ECHO_REPLY:
      if (value == null) {
        unsetEchoReply();
      } else {
        setEchoReply((EchoReplyMessage)value);
      }
      break;
    case GET_REQUEST:
      if (value == null) {
        unsetGetRequest();
      } else {
        setGetRequest((GetRequestMessage)value);
      }
      break;
    case GET_RESPONSE:
      if (value == null) {
        unsetGetResponse();
      } else {
        setGetResponse((GetResponseMessage)value);
      }
      break;
    case PUT_REQUEST:
      if (value == null) {
        unsetPutRequest();
      } else {
        setPutRequest((PutRequestMessage)value);
      }
      break;
    case PUT_RESPONSE:
      if (value == null) {
        unsetPutResponse();
      } else {
        setPutResponse((PutResponseMessage)value);
      }
      break;
    case DELETE_REQUEST:
      if (value == null) {
        unsetDeleteRequest();
      } else {
        setDeleteRequest((DeleteRequestMessage)value);
      }
      break;
    case DELETE_RESPONSE:
      if (value == null) {
        unsetDeleteResponse();
      } else {
        setDeleteResponse((DeleteResponseMessage)value);
      }
      break;
    case SYNC_VALUE:
      if (value == null) {
        unsetSyncValue();
      } else {
        setSyncValue((SyncValueMessage)value);
      }
      break;
    case SYNC_VALUE_RESPONSE:
      if (value == null) {
        unsetSyncValueResponse();
      } else {
        setSyncValueResponse((SyncValueResponseMessage)value);
      }
      break;
    case SYNC_OFFER:
      if (value == null) {
        unsetSyncOffer();
      } else {
        setSyncOffer((SyncOfferMessage)value);
      }
      break;
    case SYNC_REQUEST:
      if (value == null) {
        unsetSyncRequest();
      } else {
        setSyncRequest((SyncRequestMessage)value);
      }
      break;
    case FULL_SYNC_REQUEST:
      if (value == null) {
        unsetFullSyncRequest();
      } else {
        setFullSyncRequest((FullSyncRequestMessage)value);
      }
      break;
    case CURSOR_REQUEST:
      if (value == null) {
        unsetCursorRequest();
      } else {
        setCursorRequest((CursorRequestMessage)value);
      }
      break;
    case CURSOR_RESPONSE:
      if (value == null) {
        unsetCursorResponse();
      } else {
        setCursorResponse((CursorResponseMessage)value);
      }
      break;
    case REGISTER_REQUEST:
      if (value == null) {
        unsetRegisterRequest();
      } else {
        setRegisterRequest((RegisterRequestMessage)value);
      }
      break;
    case REGISTER_RESPONSE:
      if (value == null) {
        unsetRegisterResponse();
      } else {
        setRegisterResponse((RegisterResponseMessage)value);
      }
      break;
    case CLUSTER_JOIN_REQUEST:
      if (value == null) {
        unsetClusterJoinRequest();
      } else {
        setClusterJoinRequest((ClusterJoinRequestMessage)value);
      }
      break;
    case CLUSTER_JOIN_RESPONSE:
      if (value == null) {
        unsetClusterJoinResponse();
      } else {
        setClusterJoinResponse((ClusterJoinResponseMessage)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();
    case HELLO:
      return getHello();
    case ERROR:
      return getError();
    case ECHO_REQUEST:
      return getEchoRequest();
    case ECHO_REPLY:
      return getEchoReply();
    case GET_REQUEST:
      return getGetRequest();
    case GET_RESPONSE:
      return getGetResponse();
    case PUT_REQUEST:
      return getPutRequest();
    case PUT_RESPONSE:
      return getPutResponse();
    case DELETE_REQUEST:
      return getDeleteRequest();
    case DELETE_RESPONSE:
      return getDeleteResponse();
    case SYNC_VALUE:
      return getSyncValue();
    case SYNC_VALUE_RESPONSE:
      return getSyncValueResponse();
    case SYNC_OFFER:
      return getSyncOffer();
    case SYNC_REQUEST:
      return getSyncRequest();
    case FULL_SYNC_REQUEST:
      return getFullSyncRequest();
    case CURSOR_REQUEST:
      return getCursorRequest();
    case CURSOR_RESPONSE:
      return getCursorResponse();
    case REGISTER_REQUEST:
      return getRegisterRequest();
    case REGISTER_RESPONSE:
      return getRegisterResponse();
    case CLUSTER_JOIN_REQUEST:
      return getClusterJoinRequest();
    case CLUSTER_JOIN_RESPONSE:
      return getClusterJoinResponse();
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case TYPE:
      return isSetType();
    case HELLO:
      return isSetHello();
    case ERROR:
      return isSetError();
    case ECHO_REQUEST:
      return isSetEchoRequest();
    case ECHO_REPLY:
      return isSetEchoReply();
    case GET_REQUEST:
      return isSetGetRequest();
    case GET_RESPONSE:
      return isSetGetResponse();
    case PUT_REQUEST:
      return isSetPutRequest();
    case PUT_RESPONSE:
      return isSetPutResponse();
    case DELETE_REQUEST:
      return isSetDeleteRequest();
    case DELETE_RESPONSE:
      return isSetDeleteResponse();
    case SYNC_VALUE:
      return isSetSyncValue();
    case SYNC_VALUE_RESPONSE:
      return isSetSyncValueResponse();
    case SYNC_OFFER:
      return isSetSyncOffer();
    case SYNC_REQUEST:
      return isSetSyncRequest();
    case FULL_SYNC_REQUEST:
      return isSetFullSyncRequest();
    case CURSOR_REQUEST:
      return isSetCursorRequest();
    case CURSOR_RESPONSE:
      return isSetCursorResponse();
    case REGISTER_REQUEST:
      return isSetRegisterRequest();
    case REGISTER_RESPONSE:
      return isSetRegisterResponse();
    case CLUSTER_JOIN_REQUEST:
      return isSetClusterJoinRequest();
    case CLUSTER_JOIN_RESPONSE:
      return isSetClusterJoinResponse();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SyncMessage)
      return this.equals((SyncMessage)that);
    return false;
  }
  public boolean equals(SyncMessage that) {
    if (that == null)
      return false;
    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }
    boolean this_present_hello = true && this.isSetHello();
    boolean that_present_hello = true && that.isSetHello();
    if (this_present_hello || that_present_hello) {
      if (!(this_present_hello && that_present_hello))
        return false;
      if (!this.hello.equals(that.hello))
        return false;
    }
    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }
    boolean this_present_echoRequest = true && this.isSetEchoRequest();
    boolean that_present_echoRequest = true && that.isSetEchoRequest();
    if (this_present_echoRequest || that_present_echoRequest) {
      if (!(this_present_echoRequest && that_present_echoRequest))
        return false;
      if (!this.echoRequest.equals(that.echoRequest))
        return false;
    }
    boolean this_present_echoReply = true && this.isSetEchoReply();
    boolean that_present_echoReply = true && that.isSetEchoReply();
    if (this_present_echoReply || that_present_echoReply) {
      if (!(this_present_echoReply && that_present_echoReply))
        return false;
      if (!this.echoReply.equals(that.echoReply))
        return false;
    }
    boolean this_present_getRequest = true && this.isSetGetRequest();
    boolean that_present_getRequest = true && that.isSetGetRequest();
    if (this_present_getRequest || that_present_getRequest) {
      if (!(this_present_getRequest && that_present_getRequest))
        return false;
      if (!this.getRequest.equals(that.getRequest))
        return false;
    }
    boolean this_present_getResponse = true && this.isSetGetResponse();
    boolean that_present_getResponse = true && that.isSetGetResponse();
    if (this_present_getResponse || that_present_getResponse) {
      if (!(this_present_getResponse && that_present_getResponse))
        return false;
      if (!this.getResponse.equals(that.getResponse))
        return false;
    }
    boolean this_present_putRequest = true && this.isSetPutRequest();
    boolean that_present_putRequest = true && that.isSetPutRequest();
    if (this_present_putRequest || that_present_putRequest) {
      if (!(this_present_putRequest && that_present_putRequest))
        return false;
      if (!this.putRequest.equals(that.putRequest))
        return false;
    }
    boolean this_present_putResponse = true && this.isSetPutResponse();
    boolean that_present_putResponse = true && that.isSetPutResponse();
    if (this_present_putResponse || that_present_putResponse) {
      if (!(this_present_putResponse && that_present_putResponse))
        return false;
      if (!this.putResponse.equals(that.putResponse))
        return false;
    }
    boolean this_present_deleteRequest = true && this.isSetDeleteRequest();
    boolean that_present_deleteRequest = true && that.isSetDeleteRequest();
    if (this_present_deleteRequest || that_present_deleteRequest) {
      if (!(this_present_deleteRequest && that_present_deleteRequest))
        return false;
      if (!this.deleteRequest.equals(that.deleteRequest))
        return false;
    }
    boolean this_present_deleteResponse = true && this.isSetDeleteResponse();
    boolean that_present_deleteResponse = true && that.isSetDeleteResponse();
    if (this_present_deleteResponse || that_present_deleteResponse) {
      if (!(this_present_deleteResponse && that_present_deleteResponse))
        return false;
      if (!this.deleteResponse.equals(that.deleteResponse))
        return false;
    }
    boolean this_present_syncValue = true && this.isSetSyncValue();
    boolean that_present_syncValue = true && that.isSetSyncValue();
    if (this_present_syncValue || that_present_syncValue) {
      if (!(this_present_syncValue && that_present_syncValue))
        return false;
      if (!this.syncValue.equals(that.syncValue))
        return false;
    }
    boolean this_present_syncValueResponse = true && this.isSetSyncValueResponse();
    boolean that_present_syncValueResponse = true && that.isSetSyncValueResponse();
    if (this_present_syncValueResponse || that_present_syncValueResponse) {
      if (!(this_present_syncValueResponse && that_present_syncValueResponse))
        return false;
      if (!this.syncValueResponse.equals(that.syncValueResponse))
        return false;
    }
    boolean this_present_syncOffer = true && this.isSetSyncOffer();
    boolean that_present_syncOffer = true && that.isSetSyncOffer();
    if (this_present_syncOffer || that_present_syncOffer) {
      if (!(this_present_syncOffer && that_present_syncOffer))
        return false;
      if (!this.syncOffer.equals(that.syncOffer))
        return false;
    }
    boolean this_present_syncRequest = true && this.isSetSyncRequest();
    boolean that_present_syncRequest = true && that.isSetSyncRequest();
    if (this_present_syncRequest || that_present_syncRequest) {
      if (!(this_present_syncRequest && that_present_syncRequest))
        return false;
      if (!this.syncRequest.equals(that.syncRequest))
        return false;
    }
    boolean this_present_fullSyncRequest = true && this.isSetFullSyncRequest();
    boolean that_present_fullSyncRequest = true && that.isSetFullSyncRequest();
    if (this_present_fullSyncRequest || that_present_fullSyncRequest) {
      if (!(this_present_fullSyncRequest && that_present_fullSyncRequest))
        return false;
      if (!this.fullSyncRequest.equals(that.fullSyncRequest))
        return false;
    }
    boolean this_present_cursorRequest = true && this.isSetCursorRequest();
    boolean that_present_cursorRequest = true && that.isSetCursorRequest();
    if (this_present_cursorRequest || that_present_cursorRequest) {
      if (!(this_present_cursorRequest && that_present_cursorRequest))
        return false;
      if (!this.cursorRequest.equals(that.cursorRequest))
        return false;
    }
    boolean this_present_cursorResponse = true && this.isSetCursorResponse();
    boolean that_present_cursorResponse = true && that.isSetCursorResponse();
    if (this_present_cursorResponse || that_present_cursorResponse) {
      if (!(this_present_cursorResponse && that_present_cursorResponse))
        return false;
      if (!this.cursorResponse.equals(that.cursorResponse))
        return false;
    }
    boolean this_present_registerRequest = true && this.isSetRegisterRequest();
    boolean that_present_registerRequest = true && that.isSetRegisterRequest();
    if (this_present_registerRequest || that_present_registerRequest) {
      if (!(this_present_registerRequest && that_present_registerRequest))
        return false;
      if (!this.registerRequest.equals(that.registerRequest))
        return false;
    }
    boolean this_present_registerResponse = true && this.isSetRegisterResponse();
    boolean that_present_registerResponse = true && that.isSetRegisterResponse();
    if (this_present_registerResponse || that_present_registerResponse) {
      if (!(this_present_registerResponse && that_present_registerResponse))
        return false;
      if (!this.registerResponse.equals(that.registerResponse))
        return false;
    }
    boolean this_present_clusterJoinRequest = true && this.isSetClusterJoinRequest();
    boolean that_present_clusterJoinRequest = true && that.isSetClusterJoinRequest();
    if (this_present_clusterJoinRequest || that_present_clusterJoinRequest) {
      if (!(this_present_clusterJoinRequest && that_present_clusterJoinRequest))
        return false;
      if (!this.clusterJoinRequest.equals(that.clusterJoinRequest))
        return false;
    }
    boolean this_present_clusterJoinResponse = true && this.isSetClusterJoinResponse();
    boolean that_present_clusterJoinResponse = true && that.isSetClusterJoinResponse();
    if (this_present_clusterJoinResponse || that_present_clusterJoinResponse) {
      if (!(this_present_clusterJoinResponse && that_present_clusterJoinResponse))
        return false;
      if (!this.clusterJoinResponse.equals(that.clusterJoinResponse))
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(SyncMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    SyncMessage typedOther = (SyncMessage)other;
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHello()).compareTo(typedOther.isSetHello());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHello()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hello, typedOther.hello);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError()).compareTo(typedOther.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, typedOther.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEchoRequest()).compareTo(typedOther.isSetEchoRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEchoRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.echoRequest, typedOther.echoRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEchoReply()).compareTo(typedOther.isSetEchoReply());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEchoReply()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.echoReply, typedOther.echoReply);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGetRequest()).compareTo(typedOther.isSetGetRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.getRequest, typedOther.getRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGetResponse()).compareTo(typedOther.isSetGetResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.getResponse, typedOther.getResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPutRequest()).compareTo(typedOther.isSetPutRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPutRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.putRequest, typedOther.putRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPutResponse()).compareTo(typedOther.isSetPutResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPutResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.putResponse, typedOther.putResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteRequest()).compareTo(typedOther.isSetDeleteRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleteRequest, typedOther.deleteRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteResponse()).compareTo(typedOther.isSetDeleteResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleteResponse, typedOther.deleteResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSyncValue()).compareTo(typedOther.isSetSyncValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncValue, typedOther.syncValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSyncValueResponse()).compareTo(typedOther.isSetSyncValueResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncValueResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncValueResponse, typedOther.syncValueResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSyncOffer()).compareTo(typedOther.isSetSyncOffer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncOffer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncOffer, typedOther.syncOffer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSyncRequest()).compareTo(typedOther.isSetSyncRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncRequest, typedOther.syncRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFullSyncRequest()).compareTo(typedOther.isSetFullSyncRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullSyncRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fullSyncRequest, typedOther.fullSyncRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCursorRequest()).compareTo(typedOther.isSetCursorRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCursorRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cursorRequest, typedOther.cursorRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCursorResponse()).compareTo(typedOther.isSetCursorResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCursorResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cursorResponse, typedOther.cursorResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRegisterRequest()).compareTo(typedOther.isSetRegisterRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegisterRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.registerRequest, typedOther.registerRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRegisterResponse()).compareTo(typedOther.isSetRegisterResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegisterResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.registerResponse, typedOther.registerResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClusterJoinRequest()).compareTo(typedOther.isSetClusterJoinRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterJoinRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterJoinRequest, typedOther.clusterJoinRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClusterJoinResponse()).compareTo(typedOther.isSetClusterJoinResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterJoinResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterJoinResponse, typedOther.clusterJoinResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SyncMessage(");
    boolean first = true;
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetHello()) {
      if (!first) sb.append(", ");
      sb.append("hello:");
      if (this.hello == null) {
        sb.append("null");
      } else {
        sb.append(this.hello);
      }
      first = false;
    }
    if (isSetError()) {
      if (!first) sb.append(", ");
      sb.append("error:");
      if (this.error == null) {
        sb.append("null");
      } else {
        sb.append(this.error);
      }
      first = false;
    }
    if (isSetEchoRequest()) {
      if (!first) sb.append(", ");
      sb.append("echoRequest:");
      if (this.echoRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.echoRequest);
      }
      first = false;
    }
    if (isSetEchoReply()) {
      if (!first) sb.append(", ");
      sb.append("echoReply:");
      if (this.echoReply == null) {
        sb.append("null");
      } else {
        sb.append(this.echoReply);
      }
      first = false;
    }
    if (isSetGetRequest()) {
      if (!first) sb.append(", ");
      sb.append("getRequest:");
      if (this.getRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.getRequest);
      }
      first = false;
    }
    if (isSetGetResponse()) {
      if (!first) sb.append(", ");
      sb.append("getResponse:");
      if (this.getResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.getResponse);
      }
      first = false;
    }
    if (isSetPutRequest()) {
      if (!first) sb.append(", ");
      sb.append("putRequest:");
      if (this.putRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.putRequest);
      }
      first = false;
    }
    if (isSetPutResponse()) {
      if (!first) sb.append(", ");
      sb.append("putResponse:");
      if (this.putResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.putResponse);
      }
      first = false;
    }
    if (isSetDeleteRequest()) {
      if (!first) sb.append(", ");
      sb.append("deleteRequest:");
      if (this.deleteRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.deleteRequest);
      }
      first = false;
    }
    if (isSetDeleteResponse()) {
      if (!first) sb.append(", ");
      sb.append("deleteResponse:");
      if (this.deleteResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.deleteResponse);
      }
      first = false;
    }
    if (isSetSyncValue()) {
      if (!first) sb.append(", ");
      sb.append("syncValue:");
      if (this.syncValue == null) {
        sb.append("null");
      } else {
        sb.append(this.syncValue);
      }
      first = false;
    }
    if (isSetSyncValueResponse()) {
      if (!first) sb.append(", ");
      sb.append("syncValueResponse:");
      if (this.syncValueResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.syncValueResponse);
      }
      first = false;
    }
    if (isSetSyncOffer()) {
      if (!first) sb.append(", ");
      sb.append("syncOffer:");
      if (this.syncOffer == null) {
        sb.append("null");
      } else {
        sb.append(this.syncOffer);
      }
      first = false;
    }
    if (isSetSyncRequest()) {
      if (!first) sb.append(", ");
      sb.append("syncRequest:");
      if (this.syncRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.syncRequest);
      }
      first = false;
    }
    if (isSetFullSyncRequest()) {
      if (!first) sb.append(", ");
      sb.append("fullSyncRequest:");
      if (this.fullSyncRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.fullSyncRequest);
      }
      first = false;
    }
    if (isSetCursorRequest()) {
      if (!first) sb.append(", ");
      sb.append("cursorRequest:");
      if (this.cursorRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.cursorRequest);
      }
      first = false;
    }
    if (isSetCursorResponse()) {
      if (!first) sb.append(", ");
      sb.append("cursorResponse:");
      if (this.cursorResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.cursorResponse);
      }
      first = false;
    }
    if (isSetRegisterRequest()) {
      if (!first) sb.append(", ");
      sb.append("registerRequest:");
      if (this.registerRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.registerRequest);
      }
      first = false;
    }
    if (isSetRegisterResponse()) {
      if (!first) sb.append(", ");
      sb.append("registerResponse:");
      if (this.registerResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.registerResponse);
      }
      first = false;
    }
    if (isSetClusterJoinRequest()) {
      if (!first) sb.append(", ");
      sb.append("clusterJoinRequest:");
      if (this.clusterJoinRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterJoinRequest);
      }
      first = false;
    }
    if (isSetClusterJoinResponse()) {
      if (!first) sb.append(", ");
      sb.append("clusterJoinResponse:");
      if (this.clusterJoinResponse == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterJoinResponse);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    if (hello != null) {
      hello.validate();
    }
    if (error != null) {
      error.validate();
    }
    if (echoRequest != null) {
      echoRequest.validate();
    }
    if (echoReply != null) {
      echoReply.validate();
    }
    if (getRequest != null) {
      getRequest.validate();
    }
    if (getResponse != null) {
      getResponse.validate();
    }
    if (putRequest != null) {
      putRequest.validate();
    }
    if (putResponse != null) {
      putResponse.validate();
    }
    if (deleteRequest != null) {
      deleteRequest.validate();
    }
    if (deleteResponse != null) {
      deleteResponse.validate();
    }
    if (syncValue != null) {
      syncValue.validate();
    }
    if (syncValueResponse != null) {
      syncValueResponse.validate();
    }
    if (syncOffer != null) {
      syncOffer.validate();
    }
    if (syncRequest != null) {
      syncRequest.validate();
    }
    if (fullSyncRequest != null) {
      fullSyncRequest.validate();
    }
    if (cursorRequest != null) {
      cursorRequest.validate();
    }
    if (cursorResponse != null) {
      cursorResponse.validate();
    }
    if (registerRequest != null) {
      registerRequest.validate();
    }
    if (registerResponse != null) {
      registerResponse.validate();
    }
    if (clusterJoinRequest != null) {
      clusterJoinRequest.validate();
    }
    if (clusterJoinResponse != null) {
      clusterJoinResponse.validate();
    }
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private static class SyncMessageStandardSchemeFactory implements SchemeFactory {
    public SyncMessageStandardScheme getScheme() {
      return new SyncMessageStandardScheme();
    }
  }
  private static class SyncMessageStandardScheme extends StandardScheme<SyncMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, SyncMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = MessageType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hello = new HelloMessage();
              struct.hello.read(iprot);
              struct.setHelloIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.error = new ErrorMessage();
              struct.error.read(iprot);
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.echoRequest = new EchoRequestMessage();
              struct.echoRequest.read(iprot);
              struct.setEchoRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.echoReply = new EchoReplyMessage();
              struct.echoReply.read(iprot);
              struct.setEchoReplyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.getRequest = new GetRequestMessage();
              struct.getRequest.read(iprot);
              struct.setGetRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.getResponse = new GetResponseMessage();
              struct.getResponse.read(iprot);
              struct.setGetResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.putRequest = new PutRequestMessage();
              struct.putRequest.read(iprot);
              struct.setPutRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.putResponse = new PutResponseMessage();
              struct.putResponse.read(iprot);
              struct.setPutResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.deleteRequest = new DeleteRequestMessage();
              struct.deleteRequest.read(iprot);
              struct.setDeleteRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.deleteResponse = new DeleteResponseMessage();
              struct.deleteResponse.read(iprot);
              struct.setDeleteResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.syncValue = new SyncValueMessage();
              struct.syncValue.read(iprot);
              struct.setSyncValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.syncValueResponse = new SyncValueResponseMessage();
              struct.syncValueResponse.read(iprot);
              struct.setSyncValueResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.syncOffer = new SyncOfferMessage();
              struct.syncOffer.read(iprot);
              struct.setSyncOfferIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.syncRequest = new SyncRequestMessage();
              struct.syncRequest.read(iprot);
              struct.setSyncRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fullSyncRequest = new FullSyncRequestMessage();
              struct.fullSyncRequest.read(iprot);
              struct.setFullSyncRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cursorRequest = new CursorRequestMessage();
              struct.cursorRequest.read(iprot);
              struct.setCursorRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cursorResponse = new CursorResponseMessage();
              struct.cursorResponse.read(iprot);
              struct.setCursorResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.registerRequest = new RegisterRequestMessage();
              struct.registerRequest.read(iprot);
              struct.setRegisterRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.registerResponse = new RegisterResponseMessage();
              struct.registerResponse.read(iprot);
              struct.setRegisterResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.clusterJoinRequest = new ClusterJoinRequestMessage();
              struct.clusterJoinRequest.read(iprot);
              struct.setClusterJoinRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.clusterJoinResponse = new ClusterJoinResponseMessage();
              struct.clusterJoinResponse.read(iprot);
              struct.setClusterJoinResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }
    public void write(org.apache.thrift.protocol.TProtocol oprot, SyncMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.hello != null) {
        if (struct.isSetHello()) {
          oprot.writeFieldBegin(HELLO_FIELD_DESC);
          struct.hello.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.error != null) {
        if (struct.isSetError()) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          struct.error.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.echoRequest != null) {
        if (struct.isSetEchoRequest()) {
          oprot.writeFieldBegin(ECHO_REQUEST_FIELD_DESC);
          struct.echoRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.echoReply != null) {
        if (struct.isSetEchoReply()) {
          oprot.writeFieldBegin(ECHO_REPLY_FIELD_DESC);
          struct.echoReply.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.getRequest != null) {
        if (struct.isSetGetRequest()) {
          oprot.writeFieldBegin(GET_REQUEST_FIELD_DESC);
          struct.getRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.getResponse != null) {
        if (struct.isSetGetResponse()) {
          oprot.writeFieldBegin(GET_RESPONSE_FIELD_DESC);
          struct.getResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.putRequest != null) {
        if (struct.isSetPutRequest()) {
          oprot.writeFieldBegin(PUT_REQUEST_FIELD_DESC);
          struct.putRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.putResponse != null) {
        if (struct.isSetPutResponse()) {
          oprot.writeFieldBegin(PUT_RESPONSE_FIELD_DESC);
          struct.putResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.deleteRequest != null) {
        if (struct.isSetDeleteRequest()) {
          oprot.writeFieldBegin(DELETE_REQUEST_FIELD_DESC);
          struct.deleteRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.deleteResponse != null) {
        if (struct.isSetDeleteResponse()) {
          oprot.writeFieldBegin(DELETE_RESPONSE_FIELD_DESC);
          struct.deleteResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.syncValue != null) {
        if (struct.isSetSyncValue()) {
          oprot.writeFieldBegin(SYNC_VALUE_FIELD_DESC);
          struct.syncValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.syncValueResponse != null) {
        if (struct.isSetSyncValueResponse()) {
          oprot.writeFieldBegin(SYNC_VALUE_RESPONSE_FIELD_DESC);
          struct.syncValueResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.syncOffer != null) {
        if (struct.isSetSyncOffer()) {
          oprot.writeFieldBegin(SYNC_OFFER_FIELD_DESC);
          struct.syncOffer.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.syncRequest != null) {
        if (struct.isSetSyncRequest()) {
          oprot.writeFieldBegin(SYNC_REQUEST_FIELD_DESC);
          struct.syncRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.fullSyncRequest != null) {
        if (struct.isSetFullSyncRequest()) {
          oprot.writeFieldBegin(FULL_SYNC_REQUEST_FIELD_DESC);
          struct.fullSyncRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cursorRequest != null) {
        if (struct.isSetCursorRequest()) {
          oprot.writeFieldBegin(CURSOR_REQUEST_FIELD_DESC);
          struct.cursorRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cursorResponse != null) {
        if (struct.isSetCursorResponse()) {
          oprot.writeFieldBegin(CURSOR_RESPONSE_FIELD_DESC);
          struct.cursorResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.registerRequest != null) {
        if (struct.isSetRegisterRequest()) {
          oprot.writeFieldBegin(REGISTER_REQUEST_FIELD_DESC);
          struct.registerRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.registerResponse != null) {
        if (struct.isSetRegisterResponse()) {
          oprot.writeFieldBegin(REGISTER_RESPONSE_FIELD_DESC);
          struct.registerResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.clusterJoinRequest != null) {
        if (struct.isSetClusterJoinRequest()) {
          oprot.writeFieldBegin(CLUSTER_JOIN_REQUEST_FIELD_DESC);
          struct.clusterJoinRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.clusterJoinResponse != null) {
        if (struct.isSetClusterJoinResponse()) {
          oprot.writeFieldBegin(CLUSTER_JOIN_RESPONSE_FIELD_DESC);
          struct.clusterJoinResponse.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class SyncMessageTupleSchemeFactory implements SchemeFactory {
    public SyncMessageTupleScheme getScheme() {
      return new SyncMessageTupleScheme();
    }
  }
  private static class SyncMessageTupleScheme extends TupleScheme<SyncMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SyncMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetHello()) {
        optionals.set(0);
      }
      if (struct.isSetError()) {
        optionals.set(1);
      }
      if (struct.isSetEchoRequest()) {
        optionals.set(2);
      }
      if (struct.isSetEchoReply()) {
        optionals.set(3);
      }
      if (struct.isSetGetRequest()) {
        optionals.set(4);
      }
      if (struct.isSetGetResponse()) {
        optionals.set(5);
      }
      if (struct.isSetPutRequest()) {
        optionals.set(6);
      }
      if (struct.isSetPutResponse()) {
        optionals.set(7);
      }
      if (struct.isSetDeleteRequest()) {
        optionals.set(8);
      }
      if (struct.isSetDeleteResponse()) {
        optionals.set(9);
      }
      if (struct.isSetSyncValue()) {
        optionals.set(10);
      }
      if (struct.isSetSyncValueResponse()) {
        optionals.set(11);
      }
      if (struct.isSetSyncOffer()) {
        optionals.set(12);
      }
      if (struct.isSetSyncRequest()) {
        optionals.set(13);
      }
      if (struct.isSetFullSyncRequest()) {
        optionals.set(14);
      }
      if (struct.isSetCursorRequest()) {
        optionals.set(15);
      }
      if (struct.isSetCursorResponse()) {
        optionals.set(16);
      }
      if (struct.isSetRegisterRequest()) {
        optionals.set(17);
      }
      if (struct.isSetRegisterResponse()) {
        optionals.set(18);
      }
      if (struct.isSetClusterJoinRequest()) {
        optionals.set(19);
      }
      if (struct.isSetClusterJoinResponse()) {
        optionals.set(20);
      }
      oprot.writeBitSet(optionals, 21);
      if (struct.isSetHello()) {
        struct.hello.write(oprot);
      }
      if (struct.isSetError()) {
        struct.error.write(oprot);
      }
      if (struct.isSetEchoRequest()) {
        struct.echoRequest.write(oprot);
      }
      if (struct.isSetEchoReply()) {
        struct.echoReply.write(oprot);
      }
      if (struct.isSetGetRequest()) {
        struct.getRequest.write(oprot);
      }
      if (struct.isSetGetResponse()) {
        struct.getResponse.write(oprot);
      }
      if (struct.isSetPutRequest()) {
        struct.putRequest.write(oprot);
      }
      if (struct.isSetPutResponse()) {
        struct.putResponse.write(oprot);
      }
      if (struct.isSetDeleteRequest()) {
        struct.deleteRequest.write(oprot);
      }
      if (struct.isSetDeleteResponse()) {
        struct.deleteResponse.write(oprot);
      }
      if (struct.isSetSyncValue()) {
        struct.syncValue.write(oprot);
      }
      if (struct.isSetSyncValueResponse()) {
        struct.syncValueResponse.write(oprot);
      }
      if (struct.isSetSyncOffer()) {
        struct.syncOffer.write(oprot);
      }
      if (struct.isSetSyncRequest()) {
        struct.syncRequest.write(oprot);
      }
      if (struct.isSetFullSyncRequest()) {
        struct.fullSyncRequest.write(oprot);
      }
      if (struct.isSetCursorRequest()) {
        struct.cursorRequest.write(oprot);
      }
      if (struct.isSetCursorResponse()) {
        struct.cursorResponse.write(oprot);
      }
      if (struct.isSetRegisterRequest()) {
        struct.registerRequest.write(oprot);
      }
      if (struct.isSetRegisterResponse()) {
        struct.registerResponse.write(oprot);
      }
      if (struct.isSetClusterJoinRequest()) {
        struct.clusterJoinRequest.write(oprot);
      }
      if (struct.isSetClusterJoinResponse()) {
        struct.clusterJoinResponse.write(oprot);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SyncMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = MessageType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(21);
      if (incoming.get(0)) {
        struct.hello = new HelloMessage();
        struct.hello.read(iprot);
        struct.setHelloIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error = new ErrorMessage();
        struct.error.read(iprot);
        struct.setErrorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.echoRequest = new EchoRequestMessage();
        struct.echoRequest.read(iprot);
        struct.setEchoRequestIsSet(true);
      }
      if (incoming.get(3)) {
        struct.echoReply = new EchoReplyMessage();
        struct.echoReply.read(iprot);
        struct.setEchoReplyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.getRequest = new GetRequestMessage();
        struct.getRequest.read(iprot);
        struct.setGetRequestIsSet(true);
      }
      if (incoming.get(5)) {
        struct.getResponse = new GetResponseMessage();
        struct.getResponse.read(iprot);
        struct.setGetResponseIsSet(true);
      }
      if (incoming.get(6)) {
        struct.putRequest = new PutRequestMessage();
        struct.putRequest.read(iprot);
        struct.setPutRequestIsSet(true);
      }
      if (incoming.get(7)) {
        struct.putResponse = new PutResponseMessage();
        struct.putResponse.read(iprot);
        struct.setPutResponseIsSet(true);
      }
      if (incoming.get(8)) {
        struct.deleteRequest = new DeleteRequestMessage();
        struct.deleteRequest.read(iprot);
        struct.setDeleteRequestIsSet(true);
      }
      if (incoming.get(9)) {
        struct.deleteResponse = new DeleteResponseMessage();
        struct.deleteResponse.read(iprot);
        struct.setDeleteResponseIsSet(true);
      }
      if (incoming.get(10)) {
        struct.syncValue = new SyncValueMessage();
        struct.syncValue.read(iprot);
        struct.setSyncValueIsSet(true);
      }
      if (incoming.get(11)) {
        struct.syncValueResponse = new SyncValueResponseMessage();
        struct.syncValueResponse.read(iprot);
        struct.setSyncValueResponseIsSet(true);
      }
      if (incoming.get(12)) {
        struct.syncOffer = new SyncOfferMessage();
        struct.syncOffer.read(iprot);
        struct.setSyncOfferIsSet(true);
      }
      if (incoming.get(13)) {
        struct.syncRequest = new SyncRequestMessage();
        struct.syncRequest.read(iprot);
        struct.setSyncRequestIsSet(true);
      }
      if (incoming.get(14)) {
        struct.fullSyncRequest = new FullSyncRequestMessage();
        struct.fullSyncRequest.read(iprot);
        struct.setFullSyncRequestIsSet(true);
      }
      if (incoming.get(15)) {
        struct.cursorRequest = new CursorRequestMessage();
        struct.cursorRequest.read(iprot);
        struct.setCursorRequestIsSet(true);
      }
      if (incoming.get(16)) {
        struct.cursorResponse = new CursorResponseMessage();
        struct.cursorResponse.read(iprot);
        struct.setCursorResponseIsSet(true);
      }
      if (incoming.get(17)) {
        struct.registerRequest = new RegisterRequestMessage();
        struct.registerRequest.read(iprot);
        struct.setRegisterRequestIsSet(true);
      }
      if (incoming.get(18)) {
        struct.registerResponse = new RegisterResponseMessage();
        struct.registerResponse.read(iprot);
        struct.setRegisterResponseIsSet(true);
      }
      if (incoming.get(19)) {
        struct.clusterJoinRequest = new ClusterJoinRequestMessage();
        struct.clusterJoinRequest.read(iprot);
        struct.setClusterJoinRequestIsSet(true);
      }
      if (incoming.get(20)) {
        struct.clusterJoinResponse = new ClusterJoinResponseMessage();
        struct.clusterJoinResponse.read(iprot);
        struct.setClusterJoinResponseIsSet(true);
      }
    }
  }
}
