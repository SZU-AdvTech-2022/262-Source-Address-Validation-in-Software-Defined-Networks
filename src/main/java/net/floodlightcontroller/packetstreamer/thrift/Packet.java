package net.floodlightcontroller.packetstreamer.thrift;
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
@SuppressWarnings("all") public class Packet implements org.apache.thrift.TBase<Packet, Packet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Packet");
  private static final org.apache.thrift.protocol.TField MESSAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("messageType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SW_PORT_TUPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("swPortTuple", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PacketStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PacketTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE_TYPE((short)1, "messageType"),
    SW_PORT_TUPLE((short)2, "swPortTuple"),
    DATA((short)3, "data");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return MESSAGE_TYPE;
          return SW_PORT_TUPLE;
          return DATA;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("messageType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OFMessageType.class)));
    tmpMap.put(_Fields.SW_PORT_TUPLE, new org.apache.thrift.meta_data.FieldMetaData("swPortTuple", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SwitchPortTuple.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Packet.class, metaDataMap);
  }
  public Packet() {
  }
  public Packet(
    OFMessageType messageType,
    SwitchPortTuple swPortTuple,
    ByteBuffer data)
  {
    this();
    this.messageType = messageType;
    this.swPortTuple = swPortTuple;
    this.data = data;
  }
  public Packet(Packet other) {
    if (other.isSetMessageType()) {
      this.messageType = other.messageType;
    }
    if (other.isSetSwPortTuple()) {
      this.swPortTuple = new SwitchPortTuple(other.swPortTuple);
    }
    if (other.isSetData()) {
      this.data = org.apache.thrift.TBaseHelper.copyBinary(other.data);
;
    }
  }
  public Packet deepCopy() {
    return new Packet(this);
  }
  @Override
  public void clear() {
    this.messageType = null;
    this.swPortTuple = null;
    this.data = null;
  }
  public OFMessageType getMessageType() {
    return this.messageType;
  }
  public Packet setMessageType(OFMessageType messageType) {
    this.messageType = messageType;
    return this;
  }
  public void unsetMessageType() {
    this.messageType = null;
  }
  public boolean isSetMessageType() {
    return this.messageType != null;
  }
  public void setMessageTypeIsSet(boolean value) {
    if (!value) {
      this.messageType = null;
    }
  }
  public SwitchPortTuple getSwPortTuple() {
    return this.swPortTuple;
  }
  public Packet setSwPortTuple(SwitchPortTuple swPortTuple) {
    this.swPortTuple = swPortTuple;
    return this;
  }
  public void unsetSwPortTuple() {
    this.swPortTuple = null;
  }
  public boolean isSetSwPortTuple() {
    return this.swPortTuple != null;
  }
  public void setSwPortTupleIsSet(boolean value) {
    if (!value) {
      this.swPortTuple = null;
    }
  }
  public byte[] getData() {
    setData(org.apache.thrift.TBaseHelper.rightSize(data));
    return data == null ? null : data.array();
  }
  public ByteBuffer bufferForData() {
    return data;
  }
  public Packet setData(byte[] data) {
    setData(data == null ? (ByteBuffer)null : ByteBuffer.wrap(data));
    return this;
  }
  public Packet setData(ByteBuffer data) {
    this.data = data;
    return this;
  }
  public void unsetData() {
    this.data = null;
  }
  public boolean isSetData() {
    return this.data != null;
  }
  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE_TYPE:
      if (value == null) {
        unsetMessageType();
      } else {
        setMessageType((OFMessageType)value);
      }
      break;
    case SW_PORT_TUPLE:
      if (value == null) {
        unsetSwPortTuple();
      } else {
        setSwPortTuple((SwitchPortTuple)value);
      }
      break;
    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((ByteBuffer)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_TYPE:
      return getMessageType();
    case SW_PORT_TUPLE:
      return getSwPortTuple();
    case DATA:
      return getData();
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case MESSAGE_TYPE:
      return isSetMessageType();
    case SW_PORT_TUPLE:
      return isSetSwPortTuple();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Packet)
      return this.equals((Packet)that);
    return false;
  }
  public boolean equals(Packet that) {
    if (that == null)
      return false;
    boolean this_present_messageType = true && this.isSetMessageType();
    boolean that_present_messageType = true && that.isSetMessageType();
    if (this_present_messageType || that_present_messageType) {
      if (!(this_present_messageType && that_present_messageType))
        return false;
      if (!this.messageType.equals(that.messageType))
        return false;
    }
    boolean this_present_swPortTuple = true && this.isSetSwPortTuple();
    boolean that_present_swPortTuple = true && that.isSetSwPortTuple();
    if (this_present_swPortTuple || that_present_swPortTuple) {
      if (!(this_present_swPortTuple && that_present_swPortTuple))
        return false;
      if (!this.swPortTuple.equals(that.swPortTuple))
        return false;
    }
    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(Packet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    Packet typedOther = (Packet)other;
    lastComparison = Boolean.valueOf(isSetMessageType()).compareTo(typedOther.isSetMessageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageType, typedOther.messageType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSwPortTuple()).compareTo(typedOther.isSetSwPortTuple());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSwPortTuple()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.swPortTuple, typedOther.swPortTuple);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, typedOther.data);
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
    StringBuilder sb = new StringBuilder("Packet(");
    boolean first = true;
    sb.append("messageType:");
    if (this.messageType == null) {
      sb.append("null");
    } else {
      sb.append(this.messageType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("swPortTuple:");
    if (this.swPortTuple == null) {
      sb.append("null");
    } else {
      sb.append(this.swPortTuple);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.data, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
    if (swPortTuple != null) {
      swPortTuple.validate();
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
  private static class PacketStandardSchemeFactory implements SchemeFactory {
    public PacketStandardScheme getScheme() {
      return new PacketStandardScheme();
    }
  }
  private static class PacketStandardScheme extends StandardScheme<Packet> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, Packet struct) throws org.apache.thrift.TException {
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
              struct.messageType = OFMessageType.findByValue(iprot.readI32());
              struct.setMessageTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.swPortTuple = new SwitchPortTuple();
              struct.swPortTuple.read(iprot);
              struct.setSwPortTupleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readBinary();
              struct.setDataIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, Packet struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.messageType != null) {
        oprot.writeFieldBegin(MESSAGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.messageType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.swPortTuple != null) {
        oprot.writeFieldBegin(SW_PORT_TUPLE_FIELD_DESC);
        struct.swPortTuple.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeBinary(struct.data);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class PacketTupleSchemeFactory implements SchemeFactory {
    public PacketTupleScheme getScheme() {
      return new PacketTupleScheme();
    }
  }
  private static class PacketTupleScheme extends TupleScheme<Packet> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Packet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMessageType()) {
        optionals.set(0);
      }
      if (struct.isSetSwPortTuple()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMessageType()) {
        oprot.writeI32(struct.messageType.getValue());
      }
      if (struct.isSetSwPortTuple()) {
        struct.swPortTuple.write(oprot);
      }
      if (struct.isSetData()) {
        oprot.writeBinary(struct.data);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Packet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.messageType = OFMessageType.findByValue(iprot.readI32());
        struct.setMessageTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.swPortTuple = new SwitchPortTuple();
        struct.swPortTuple.read(iprot);
        struct.setSwPortTupleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.data = iprot.readBinary();
        struct.setDataIsSet(true);
      }
    }
  }
}
