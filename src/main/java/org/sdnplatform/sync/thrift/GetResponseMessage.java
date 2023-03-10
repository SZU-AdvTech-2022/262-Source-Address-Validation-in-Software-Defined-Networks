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
@SuppressWarnings("all") public class GetResponseMessage implements org.apache.thrift.TBase<GetResponseMessage, GetResponseMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetResponseMessage");
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetResponseMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetResponseMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    VALUES((short)2, "values"),
    ERROR((short)3, "error");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return HEADER;
          return VALUES;
          return ERROR;
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
  private _Fields optionals[] = {_Fields.ERROR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, VersionedValue.class))));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SyncError.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetResponseMessage.class, metaDataMap);
  }
  public GetResponseMessage() {
  }
  public GetResponseMessage(
    AsyncMessageHeader header,
    List<VersionedValue> values)
  {
    this();
    this.header = header;
    this.values = values;
  }
  public GetResponseMessage(GetResponseMessage other) {
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    if (other.isSetValues()) {
      List<VersionedValue> __this__values = new ArrayList<VersionedValue>();
      for (VersionedValue other_element : other.values) {
        __this__values.add(new VersionedValue(other_element));
      }
      this.values = __this__values;
    }
    if (other.isSetError()) {
      this.error = new SyncError(other.error);
    }
  }
  public GetResponseMessage deepCopy() {
    return new GetResponseMessage(this);
  }
  @Override
  public void clear() {
    this.header = null;
    this.values = null;
    this.error = null;
  }
  public AsyncMessageHeader getHeader() {
    return this.header;
  }
  public GetResponseMessage setHeader(AsyncMessageHeader header) {
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
  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }
  public java.util.Iterator<VersionedValue> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }
  public void addToValues(VersionedValue elem) {
    if (this.values == null) {
      this.values = new ArrayList<VersionedValue>();
    }
    this.values.add(elem);
  }
  public List<VersionedValue> getValues() {
    return this.values;
  }
  public GetResponseMessage setValues(List<VersionedValue> values) {
    this.values = values;
    return this;
  }
  public void unsetValues() {
    this.values = null;
  }
  public boolean isSetValues() {
    return this.values != null;
  }
  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }
  public SyncError getError() {
    return this.error;
  }
  public GetResponseMessage setError(SyncError error) {
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
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;
    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<VersionedValue>)value);
      }
      break;
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((SyncError)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();
    case VALUES:
      return getValues();
    case ERROR:
      return getError();
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
    case VALUES:
      return isSetValues();
    case ERROR:
      return isSetError();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetResponseMessage)
      return this.equals((GetResponseMessage)that);
    return false;
  }
  public boolean equals(GetResponseMessage that) {
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
    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
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
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(GetResponseMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    GetResponseMessage typedOther = (GetResponseMessage)other;
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
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(typedOther.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, typedOther.values);
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
    StringBuilder sb = new StringBuilder("GetResponseMessage(");
    boolean first = true;
    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
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
    if (error != null) {
      error.validate();
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
  private static class GetResponseMessageStandardSchemeFactory implements SchemeFactory {
    public GetResponseMessageStandardScheme getScheme() {
      return new GetResponseMessageStandardScheme();
    }
  }
  private static class GetResponseMessageStandardScheme extends StandardScheme<GetResponseMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, GetResponseMessage struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.values = new ArrayList<VersionedValue>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  _elem26 = new VersionedValue();
                  _elem26.read(iprot);
                  struct.values.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.error = new SyncError();
              struct.error.read(iprot);
              struct.setErrorIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, GetResponseMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.values.size()));
          for (VersionedValue _iter27 : struct.values)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.error != null) {
        if (struct.isSetError()) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          struct.error.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class GetResponseMessageTupleSchemeFactory implements SchemeFactory {
    public GetResponseMessageTupleScheme getScheme() {
      return new GetResponseMessageTupleScheme();
    }
  }
  private static class GetResponseMessageTupleScheme extends TupleScheme<GetResponseMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetValues()) {
        optionals.set(0);
      }
      if (struct.isSetError()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (VersionedValue _iter28 : struct.values)
          {
            _iter28.write(oprot);
          }
        }
      }
      if (struct.isSetError()) {
        struct.error.write(oprot);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.values = new ArrayList<VersionedValue>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            _elem31 = new VersionedValue();
            _elem31.read(iprot);
            struct.values.add(_elem31);
          }
        }
        struct.setValuesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error = new SyncError();
        struct.error.read(iprot);
        struct.setErrorIsSet(true);
      }
    }
  }
}
