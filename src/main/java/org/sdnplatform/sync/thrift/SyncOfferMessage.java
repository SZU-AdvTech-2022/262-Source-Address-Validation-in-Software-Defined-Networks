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
@SuppressWarnings("all") public class SyncOfferMessage implements org.apache.thrift.TBase<SyncOfferMessage, SyncOfferMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SyncOfferMessage");
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STORE_FIELD_DESC = new org.apache.thrift.protocol.TField("store", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("versions", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SyncOfferMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SyncOfferMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    STORE((short)2, "store"),
    VERSIONS((short)3, "versions");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return HEADER;
          return STORE;
          return VERSIONS;
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
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.STORE, new org.apache.thrift.meta_data.FieldMetaData("store", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Store.class)));
    tmpMap.put(_Fields.VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("versions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyedVersions.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SyncOfferMessage.class, metaDataMap);
  }
  public SyncOfferMessage() {
  }
  public SyncOfferMessage(
    AsyncMessageHeader header,
    Store store,
    List<KeyedVersions> versions)
  {
    this();
    this.header = header;
    this.store = store;
    this.versions = versions;
  }
  public SyncOfferMessage(SyncOfferMessage other) {
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    if (other.isSetStore()) {
      this.store = new Store(other.store);
    }
    if (other.isSetVersions()) {
      List<KeyedVersions> __this__versions = new ArrayList<KeyedVersions>();
      for (KeyedVersions other_element : other.versions) {
        __this__versions.add(new KeyedVersions(other_element));
      }
      this.versions = __this__versions;
    }
  }
  public SyncOfferMessage deepCopy() {
    return new SyncOfferMessage(this);
  }
  @Override
  public void clear() {
    this.header = null;
    this.store = null;
    this.versions = null;
  }
  public AsyncMessageHeader getHeader() {
    return this.header;
  }
  public SyncOfferMessage setHeader(AsyncMessageHeader header) {
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
  public Store getStore() {
    return this.store;
  }
  public SyncOfferMessage setStore(Store store) {
    this.store = store;
    return this;
  }
  public void unsetStore() {
    this.store = null;
  }
  public boolean isSetStore() {
    return this.store != null;
  }
  public void setStoreIsSet(boolean value) {
    if (!value) {
      this.store = null;
    }
  }
  public int getVersionsSize() {
    return (this.versions == null) ? 0 : this.versions.size();
  }
  public java.util.Iterator<KeyedVersions> getVersionsIterator() {
    return (this.versions == null) ? null : this.versions.iterator();
  }
  public void addToVersions(KeyedVersions elem) {
    if (this.versions == null) {
      this.versions = new ArrayList<KeyedVersions>();
    }
    this.versions.add(elem);
  }
  public List<KeyedVersions> getVersions() {
    return this.versions;
  }
  public SyncOfferMessage setVersions(List<KeyedVersions> versions) {
    this.versions = versions;
    return this;
  }
  public void unsetVersions() {
    this.versions = null;
  }
  public boolean isSetVersions() {
    return this.versions != null;
  }
  public void setVersionsIsSet(boolean value) {
    if (!value) {
      this.versions = null;
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
    case STORE:
      if (value == null) {
        unsetStore();
      } else {
        setStore((Store)value);
      }
      break;
    case VERSIONS:
      if (value == null) {
        unsetVersions();
      } else {
        setVersions((List<KeyedVersions>)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();
    case STORE:
      return getStore();
    case VERSIONS:
      return getVersions();
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
    case STORE:
      return isSetStore();
    case VERSIONS:
      return isSetVersions();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SyncOfferMessage)
      return this.equals((SyncOfferMessage)that);
    return false;
  }
  public boolean equals(SyncOfferMessage that) {
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
    boolean this_present_store = true && this.isSetStore();
    boolean that_present_store = true && that.isSetStore();
    if (this_present_store || that_present_store) {
      if (!(this_present_store && that_present_store))
        return false;
      if (!this.store.equals(that.store))
        return false;
    }
    boolean this_present_versions = true && this.isSetVersions();
    boolean that_present_versions = true && that.isSetVersions();
    if (this_present_versions || that_present_versions) {
      if (!(this_present_versions && that_present_versions))
        return false;
      if (!this.versions.equals(that.versions))
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(SyncOfferMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    SyncOfferMessage typedOther = (SyncOfferMessage)other;
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
    lastComparison = Boolean.valueOf(isSetStore()).compareTo(typedOther.isSetStore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.store, typedOther.store);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersions()).compareTo(typedOther.isSetVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versions, typedOther.versions);
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
    StringBuilder sb = new StringBuilder("SyncOfferMessage(");
    boolean first = true;
    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("store:");
    if (this.store == null) {
      sb.append("null");
    } else {
      sb.append(this.store);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versions:");
    if (this.versions == null) {
      sb.append("null");
    } else {
      sb.append(this.versions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    if (store == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'store' was not present! Struct: " + toString());
    }
    if (header != null) {
      header.validate();
    }
    if (store != null) {
      store.validate();
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
  private static class SyncOfferMessageStandardSchemeFactory implements SchemeFactory {
    public SyncOfferMessageStandardScheme getScheme() {
      return new SyncOfferMessageStandardScheme();
    }
  }
  private static class SyncOfferMessageStandardScheme extends StandardScheme<SyncOfferMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, SyncOfferMessage struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.store = new Store();
              struct.store.read(iprot);
              struct.setStoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.versions = new ArrayList<KeyedVersions>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  _elem42 = new KeyedVersions();
                  _elem42.read(iprot);
                  struct.versions.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setVersionsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, SyncOfferMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.store != null) {
        oprot.writeFieldBegin(STORE_FIELD_DESC);
        struct.store.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.versions != null) {
        oprot.writeFieldBegin(VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.versions.size()));
          for (KeyedVersions _iter43 : struct.versions)
          {
            _iter43.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class SyncOfferMessageTupleSchemeFactory implements SchemeFactory {
    public SyncOfferMessageTupleScheme getScheme() {
      return new SyncOfferMessageTupleScheme();
    }
  }
  private static class SyncOfferMessageTupleScheme extends TupleScheme<SyncOfferMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SyncOfferMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      struct.store.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetVersions()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVersions()) {
        {
          oprot.writeI32(struct.versions.size());
          for (KeyedVersions _iter44 : struct.versions)
          {
            _iter44.write(oprot);
          }
        }
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SyncOfferMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      struct.store = new Store();
      struct.store.read(iprot);
      struct.setStoreIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.versions = new ArrayList<KeyedVersions>(_list45.size);
          for (int _i46 = 0; _i46 < _list45.size; ++_i46)
          {
            _elem47 = new KeyedVersions();
            _elem47.read(iprot);
            struct.versions.add(_elem47);
          }
        }
        struct.setVersionsIsSet(true);
      }
    }
  }
}
