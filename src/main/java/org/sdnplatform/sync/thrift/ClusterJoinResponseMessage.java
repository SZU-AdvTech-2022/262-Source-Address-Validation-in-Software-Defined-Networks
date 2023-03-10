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
@SuppressWarnings("all") public class ClusterJoinResponseMessage implements org.apache.thrift.TBase<ClusterJoinResponseMessage, ClusterJoinResponseMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClusterJoinResponseMessage");
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("newNodeId", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_STORE_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeStore", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterJoinResponseMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterJoinResponseMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    NEW_NODE_ID((short)2, "newNodeId"),
    NODE_STORE((short)3, "nodeStore");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return HEADER;
          return NEW_NODE_ID;
          return NODE_STORE;
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
  private static final int __NEWNODEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NEW_NODE_ID,_Fields.NODE_STORE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.NEW_NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("newNodeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.NODE_STORE, new org.apache.thrift.meta_data.FieldMetaData("nodeStore", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyedValues.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterJoinResponseMessage.class, metaDataMap);
  }
  public ClusterJoinResponseMessage() {
  }
  public ClusterJoinResponseMessage(
    AsyncMessageHeader header)
  {
    this();
    this.header = header;
  }
  public ClusterJoinResponseMessage(ClusterJoinResponseMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    this.newNodeId = other.newNodeId;
    if (other.isSetNodeStore()) {
      List<KeyedValues> __this__nodeStore = new ArrayList<KeyedValues>();
      for (KeyedValues other_element : other.nodeStore) {
        __this__nodeStore.add(new KeyedValues(other_element));
      }
      this.nodeStore = __this__nodeStore;
    }
  }
  public ClusterJoinResponseMessage deepCopy() {
    return new ClusterJoinResponseMessage(this);
  }
  @Override
  public void clear() {
    this.header = null;
    setNewNodeIdIsSet(false);
    this.newNodeId = 0;
    this.nodeStore = null;
  }
  public AsyncMessageHeader getHeader() {
    return this.header;
  }
  public ClusterJoinResponseMessage setHeader(AsyncMessageHeader header) {
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
  public short getNewNodeId() {
    return this.newNodeId;
  }
  public ClusterJoinResponseMessage setNewNodeId(short newNodeId) {
    this.newNodeId = newNodeId;
    setNewNodeIdIsSet(true);
    return this;
  }
  public void unsetNewNodeId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEWNODEID_ISSET_ID);
  }
  public boolean isSetNewNodeId() {
    return EncodingUtils.testBit(__isset_bitfield, __NEWNODEID_ISSET_ID);
  }
  public void setNewNodeIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEWNODEID_ISSET_ID, value);
  }
  public int getNodeStoreSize() {
    return (this.nodeStore == null) ? 0 : this.nodeStore.size();
  }
  public java.util.Iterator<KeyedValues> getNodeStoreIterator() {
    return (this.nodeStore == null) ? null : this.nodeStore.iterator();
  }
  public void addToNodeStore(KeyedValues elem) {
    if (this.nodeStore == null) {
      this.nodeStore = new ArrayList<KeyedValues>();
    }
    this.nodeStore.add(elem);
  }
  public List<KeyedValues> getNodeStore() {
    return this.nodeStore;
  }
  public ClusterJoinResponseMessage setNodeStore(List<KeyedValues> nodeStore) {
    this.nodeStore = nodeStore;
    return this;
  }
  public void unsetNodeStore() {
    this.nodeStore = null;
  }
  public boolean isSetNodeStore() {
    return this.nodeStore != null;
  }
  public void setNodeStoreIsSet(boolean value) {
    if (!value) {
      this.nodeStore = null;
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
    case NEW_NODE_ID:
      if (value == null) {
        unsetNewNodeId();
      } else {
        setNewNodeId((Short)value);
      }
      break;
    case NODE_STORE:
      if (value == null) {
        unsetNodeStore();
      } else {
        setNodeStore((List<KeyedValues>)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();
    case NEW_NODE_ID:
      return Short.valueOf(getNewNodeId());
    case NODE_STORE:
      return getNodeStore();
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
    case NEW_NODE_ID:
      return isSetNewNodeId();
    case NODE_STORE:
      return isSetNodeStore();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClusterJoinResponseMessage)
      return this.equals((ClusterJoinResponseMessage)that);
    return false;
  }
  public boolean equals(ClusterJoinResponseMessage that) {
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
    boolean this_present_newNodeId = true && this.isSetNewNodeId();
    boolean that_present_newNodeId = true && that.isSetNewNodeId();
    if (this_present_newNodeId || that_present_newNodeId) {
      if (!(this_present_newNodeId && that_present_newNodeId))
        return false;
      if (this.newNodeId != that.newNodeId)
        return false;
    }
    boolean this_present_nodeStore = true && this.isSetNodeStore();
    boolean that_present_nodeStore = true && that.isSetNodeStore();
    if (this_present_nodeStore || that_present_nodeStore) {
      if (!(this_present_nodeStore && that_present_nodeStore))
        return false;
      if (!this.nodeStore.equals(that.nodeStore))
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(ClusterJoinResponseMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    ClusterJoinResponseMessage typedOther = (ClusterJoinResponseMessage)other;
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
    lastComparison = Boolean.valueOf(isSetNewNodeId()).compareTo(typedOther.isSetNewNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newNodeId, typedOther.newNodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeStore()).compareTo(typedOther.isSetNodeStore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeStore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeStore, typedOther.nodeStore);
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
    StringBuilder sb = new StringBuilder("ClusterJoinResponseMessage(");
    boolean first = true;
    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (isSetNewNodeId()) {
      if (!first) sb.append(", ");
      sb.append("newNodeId:");
      sb.append(this.newNodeId);
      first = false;
    }
    if (isSetNodeStore()) {
      if (!first) sb.append(", ");
      sb.append("nodeStore:");
      if (this.nodeStore == null) {
        sb.append("null");
      } else {
        sb.append(this.nodeStore);
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
  private static class ClusterJoinResponseMessageStandardSchemeFactory implements SchemeFactory {
    public ClusterJoinResponseMessageStandardScheme getScheme() {
      return new ClusterJoinResponseMessageStandardScheme();
    }
  }
  private static class ClusterJoinResponseMessageStandardScheme extends StandardScheme<ClusterJoinResponseMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.newNodeId = iprot.readI16();
              struct.setNewNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.nodeStore = new ArrayList<KeyedValues>(_list64.size);
                for (int _i65 = 0; _i65 < _list64.size; ++_i65)
                {
                  _elem66 = new KeyedValues();
                  _elem66.read(iprot);
                  struct.nodeStore.add(_elem66);
                }
                iprot.readListEnd();
              }
              struct.setNodeStoreIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNewNodeId()) {
        oprot.writeFieldBegin(NEW_NODE_ID_FIELD_DESC);
        oprot.writeI16(struct.newNodeId);
        oprot.writeFieldEnd();
      }
      if (struct.nodeStore != null) {
        if (struct.isSetNodeStore()) {
          oprot.writeFieldBegin(NODE_STORE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodeStore.size()));
            for (KeyedValues _iter67 : struct.nodeStore)
            {
              _iter67.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class ClusterJoinResponseMessageTupleSchemeFactory implements SchemeFactory {
    public ClusterJoinResponseMessageTupleScheme getScheme() {
      return new ClusterJoinResponseMessageTupleScheme();
    }
  }
  private static class ClusterJoinResponseMessageTupleScheme extends TupleScheme<ClusterJoinResponseMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetNewNodeId()) {
        optionals.set(0);
      }
      if (struct.isSetNodeStore()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNewNodeId()) {
        oprot.writeI16(struct.newNodeId);
      }
      if (struct.isSetNodeStore()) {
        {
          oprot.writeI32(struct.nodeStore.size());
          for (KeyedValues _iter68 : struct.nodeStore)
          {
            _iter68.write(oprot);
          }
        }
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.newNodeId = iprot.readI16();
        struct.setNewNodeIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.nodeStore = new ArrayList<KeyedValues>(_list69.size);
          for (int _i70 = 0; _i70 < _list69.size; ++_i70)
          {
            _elem71 = new KeyedValues();
            _elem71.read(iprot);
            struct.nodeStore.add(_elem71);
          }
        }
        struct.setNodeStoreIsSet(true);
      }
    }
  }
}
