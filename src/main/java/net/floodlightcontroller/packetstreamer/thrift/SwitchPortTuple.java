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
@SuppressWarnings("all") public class SwitchPortTuple implements org.apache.thrift.TBase<SwitchPortTuple, SwitchPortTuple._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SwitchPortTuple");
  private static final org.apache.thrift.protocol.TField DPID_FIELD_DESC = new org.apache.thrift.protocol.TField("dpid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SwitchPortTupleStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SwitchPortTupleTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DPID((short)1, "dpid"),
    PORT((short)2, "port");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return DPID;
          return PORT;
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
  private static final int __DPID_ISSET_ID = 0;
  private static final int __PORT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DPID, new org.apache.thrift.meta_data.FieldMetaData("dpid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SwitchPortTuple.class, metaDataMap);
  }
  public SwitchPortTuple() {
  }
  public SwitchPortTuple(
    long dpid,
    short port)
  {
    this();
    this.dpid = dpid;
    setDpidIsSet(true);
    this.port = port;
    setPortIsSet(true);
  }
  public SwitchPortTuple(SwitchPortTuple other) {
    __isset_bitfield = other.__isset_bitfield;
    this.dpid = other.dpid;
    this.port = other.port;
  }
  public SwitchPortTuple deepCopy() {
    return new SwitchPortTuple(this);
  }
  @Override
  public void clear() {
    setDpidIsSet(false);
    this.dpid = 0;
    setPortIsSet(false);
    this.port = 0;
  }
  public long getDpid() {
    return this.dpid;
  }
  public SwitchPortTuple setDpid(long dpid) {
    this.dpid = dpid;
    setDpidIsSet(true);
    return this;
  }
  public void unsetDpid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DPID_ISSET_ID);
  }
  public boolean isSetDpid() {
    return EncodingUtils.testBit(__isset_bitfield, __DPID_ISSET_ID);
  }
  public void setDpidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DPID_ISSET_ID, value);
  }
  public short getPort() {
    return this.port;
  }
  public SwitchPortTuple setPort(short port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }
  public void unsetPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }
  public boolean isSetPort() {
    return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }
  public void setPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DPID:
      if (value == null) {
        unsetDpid();
      } else {
        setDpid((Long)value);
      }
      break;
    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((Short)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DPID:
      return Long.valueOf(getDpid());
    case PORT:
      return Short.valueOf(getPort());
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case DPID:
      return isSetDpid();
    case PORT:
      return isSetPort();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SwitchPortTuple)
      return this.equals((SwitchPortTuple)that);
    return false;
  }
  public boolean equals(SwitchPortTuple that) {
    if (that == null)
      return false;
    boolean this_present_dpid = true;
    boolean that_present_dpid = true;
    if (this_present_dpid || that_present_dpid) {
      if (!(this_present_dpid && that_present_dpid))
        return false;
      if (this.dpid != that.dpid)
        return false;
    }
    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(SwitchPortTuple other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    SwitchPortTuple typedOther = (SwitchPortTuple)other;
    lastComparison = Boolean.valueOf(isSetDpid()).compareTo(typedOther.isSetDpid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDpid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dpid, typedOther.dpid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(typedOther.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, typedOther.port);
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
    StringBuilder sb = new StringBuilder("SwitchPortTuple(");
    boolean first = true;
    sb.append("dpid:");
    sb.append(this.dpid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private static class SwitchPortTupleStandardSchemeFactory implements SchemeFactory {
    public SwitchPortTupleStandardScheme getScheme() {
      return new SwitchPortTupleStandardScheme();
    }
  }
  private static class SwitchPortTupleStandardScheme extends StandardScheme<SwitchPortTuple> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, SwitchPortTuple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dpid = iprot.readI64();
              struct.setDpidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.port = iprot.readI16();
              struct.setPortIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, SwitchPortTuple struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DPID_FIELD_DESC);
      oprot.writeI64(struct.dpid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI16(struct.port);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class SwitchPortTupleTupleSchemeFactory implements SchemeFactory {
    public SwitchPortTupleTupleScheme getScheme() {
      return new SwitchPortTupleTupleScheme();
    }
  }
  private static class SwitchPortTupleTupleScheme extends TupleScheme<SwitchPortTuple> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SwitchPortTuple struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDpid()) {
        optionals.set(0);
      }
      if (struct.isSetPort()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDpid()) {
        oprot.writeI64(struct.dpid);
      }
      if (struct.isSetPort()) {
        oprot.writeI16(struct.port);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SwitchPortTuple struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.dpid = iprot.readI64();
        struct.setDpidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.port = iprot.readI16();
        struct.setPortIsSet(true);
      }
    }
  }
}
