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
@SuppressWarnings("all") public class CursorRequestMessage implements org.apache.thrift.TBase<CursorRequestMessage, CursorRequestMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CursorRequestMessage");
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STORE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("storeName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CURSOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("cursorId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CLOSE_FIELD_DESC = new org.apache.thrift.protocol.TField("close", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CursorRequestMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CursorRequestMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    STORE_NAME((short)2, "storeName"),
    CURSOR_ID((short)3, "cursorId"),
    CLOSE((short)4, "close");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return HEADER;
          return STORE_NAME;
          return CURSOR_ID;
          return CLOSE;
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
  private static final int __CURSORID_ISSET_ID = 0;
  private static final int __CLOSE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.STORE_NAME,_Fields.CURSOR_ID,_Fields.CLOSE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.STORE_NAME, new org.apache.thrift.meta_data.FieldMetaData("storeName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CURSOR_ID, new org.apache.thrift.meta_data.FieldMetaData("cursorId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CLOSE, new org.apache.thrift.meta_data.FieldMetaData("close", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CursorRequestMessage.class, metaDataMap);
  }
  public CursorRequestMessage() {
  }
  public CursorRequestMessage(
    AsyncMessageHeader header)
  {
    this();
    this.header = header;
  }
  public CursorRequestMessage(CursorRequestMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    if (other.isSetStoreName()) {
      this.storeName = other.storeName;
    }
    this.cursorId = other.cursorId;
    this.close = other.close;
  }
  public CursorRequestMessage deepCopy() {
    return new CursorRequestMessage(this);
  }
  @Override
  public void clear() {
    this.header = null;
    this.storeName = null;
    setCursorIdIsSet(false);
    this.cursorId = 0;
    setCloseIsSet(false);
    this.close = false;
  }
  public AsyncMessageHeader getHeader() {
    return this.header;
  }
  public CursorRequestMessage setHeader(AsyncMessageHeader header) {
    this.header = header;
    return this;
  }
  public void unsetHeader() {
    this.header = null;
  }
  public boolean isSetHeader() {
    return this.header != null;
  }
  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }
  public String getStoreName() {
    return this.storeName;
  }
  public CursorRequestMessage setStoreName(String storeName) {
    this.storeName = storeName;
    return this;
  }
  public void unsetStoreName() {
    this.storeName = null;
  }
  public boolean isSetStoreName() {
    return this.storeName != null;
  }
  public void setStoreNameIsSet(boolean value) {
    if (!value) {
      this.storeName = null;
    }
  }
  public int getCursorId() {
    return this.cursorId;
  }
  public CursorRequestMessage setCursorId(int cursorId) {
    this.cursorId = cursorId;
    setCursorIdIsSet(true);
    return this;
  }
  public void unsetCursorId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURSORID_ISSET_ID);
  }
  public boolean isSetCursorId() {
    return EncodingUtils.testBit(__isset_bitfield, __CURSORID_ISSET_ID);
  }
  public void setCursorIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURSORID_ISSET_ID, value);
  }
  public boolean isClose() {
    return this.close;
  }
  public CursorRequestMessage setClose(boolean close) {
    this.close = close;
    setCloseIsSet(true);
    return this;
  }
  public void unsetClose() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLOSE_ISSET_ID);
  }
  public boolean isSetClose() {
    return EncodingUtils.testBit(__isset_bitfield, __CLOSE_ISSET_ID);
  }
  public void setCloseIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLOSE_ISSET_ID, value);
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;
    case STORE_NAME:
      if (value == null) {
        unsetStoreName();
      } else {
        setStoreName((String)value);
      }
      break;
    case CURSOR_ID:
      if (value == null) {
        unsetCursorId();
      } else {
        setCursorId((Integer)value);
      }
      break;
    case CLOSE:
      if (value == null) {
        unsetClose();
      } else {
        setClose((Boolean)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();
    case STORE_NAME:
      return getStoreName();
    case CURSOR_ID:
      return Integer.valueOf(getCursorId());
    case CLOSE:
      return Boolean.valueOf(isClose());
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case HEADER:
      return isSetHeader();
    case STORE_NAME:
      return isSetStoreName();
    case CURSOR_ID:
      return isSetCursorId();
    case CLOSE:
      return isSetClose();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CursorRequestMessage)
      return this.equals((CursorRequestMessage)that);
    return false;
  }
  public boolean equals(CursorRequestMessage that) {
    if (that == null)
      return false;
    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }
    boolean this_present_storeName = true && this.isSetStoreName();
    boolean that_present_storeName = true && that.isSetStoreName();
    if (this_present_storeName || that_present_storeName) {
      if (!(this_present_storeName && that_present_storeName))
        return false;
      if (!this.storeName.equals(that.storeName))
        return false;
    }
    boolean this_present_cursorId = true && this.isSetCursorId();
    boolean that_present_cursorId = true && that.isSetCursorId();
    if (this_present_cursorId || that_present_cursorId) {
      if (!(this_present_cursorId && that_present_cursorId))
        return false;
      if (this.cursorId != that.cursorId)
        return false;
    }
    boolean this_present_close = true && this.isSetClose();
    boolean that_present_close = true && that.isSetClose();
    if (this_present_close || that_present_close) {
      if (!(this_present_close && that_present_close))
        return false;
      if (this.close != that.close)
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(CursorRequestMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    CursorRequestMessage typedOther = (CursorRequestMessage)other;
    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(typedOther.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, typedOther.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStoreName()).compareTo(typedOther.isSetStoreName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeName, typedOther.storeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCursorId()).compareTo(typedOther.isSetCursorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCursorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cursorId, typedOther.cursorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClose()).compareTo(typedOther.isSetClose());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClose()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.close, typedOther.close);
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
    StringBuilder sb = new StringBuilder("CursorRequestMessage(");
    boolean first = true;
    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (isSetStoreName()) {
      if (!first) sb.append(", ");
      sb.append("storeName:");
      if (this.storeName == null) {
        sb.append("null");
      } else {
        sb.append(this.storeName);
      }
      first = false;
    }
    if (isSetCursorId()) {
      if (!first) sb.append(", ");
      sb.append("cursorId:");
      sb.append(this.cursorId);
      first = false;
    }
    if (isSetClose()) {
      if (!first) sb.append(", ");
      sb.append("close:");
      sb.append(this.close);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    if (header != null) {
      header.validate();
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private static class CursorRequestMessageStandardSchemeFactory implements SchemeFactory {
    public CursorRequestMessageStandardScheme getScheme() {
      return new CursorRequestMessageStandardScheme();
    }
  }
  private static class CursorRequestMessageStandardScheme extends StandardScheme<CursorRequestMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, CursorRequestMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new AsyncMessageHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storeName = iprot.readString();
              struct.setStoreNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cursorId = iprot.readI32();
              struct.setCursorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.close = iprot.readBool();
              struct.setCloseIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, CursorRequestMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.storeName != null) {
        if (struct.isSetStoreName()) {
          oprot.writeFieldBegin(STORE_NAME_FIELD_DESC);
          oprot.writeString(struct.storeName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCursorId()) {
        oprot.writeFieldBegin(CURSOR_ID_FIELD_DESC);
        oprot.writeI32(struct.cursorId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetClose()) {
        oprot.writeFieldBegin(CLOSE_FIELD_DESC);
        oprot.writeBool(struct.close);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class CursorRequestMessageTupleSchemeFactory implements SchemeFactory {
    public CursorRequestMessageTupleScheme getScheme() {
      return new CursorRequestMessageTupleScheme();
    }
  }
  private static class CursorRequestMessageTupleScheme extends TupleScheme<CursorRequestMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CursorRequestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetStoreName()) {
        optionals.set(0);
      }
      if (struct.isSetCursorId()) {
        optionals.set(1);
      }
      if (struct.isSetClose()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStoreName()) {
        oprot.writeString(struct.storeName);
      }
      if (struct.isSetCursorId()) {
        oprot.writeI32(struct.cursorId);
      }
      if (struct.isSetClose()) {
        oprot.writeBool(struct.close);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CursorRequestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.storeName = iprot.readString();
        struct.setStoreNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cursorId = iprot.readI32();
        struct.setCursorIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.close = iprot.readBool();
        struct.setCloseIsSet(true);
      }
    }
  }
}
