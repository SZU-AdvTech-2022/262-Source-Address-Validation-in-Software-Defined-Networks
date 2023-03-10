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
@SuppressWarnings("all") public class Node implements org.apache.thrift.TBase<Node, Node._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Node");
  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeId", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField DOMAIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("domainId", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField HOSTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NodeTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_ID((short)1, "nodeId"),
    DOMAIN_ID((short)2, "domainId"),
    HOSTNAME((short)3, "hostname"),
    PORT((short)4, "port");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return NODE_ID;
          return DOMAIN_ID;
          return HOSTNAME;
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
  private static final int __NODEID_ISSET_ID = 0;
  private static final int __DOMAINID_ISSET_ID = 1;
  private static final int __PORT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NODE_ID,_Fields.DOMAIN_ID,_Fields.HOSTNAME,_Fields.PORT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("nodeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.DOMAIN_ID, new org.apache.thrift.meta_data.FieldMetaData("domainId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.HOSTNAME, new org.apache.thrift.meta_data.FieldMetaData("hostname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Node.class, metaDataMap);
  }
  public Node() {
  }
  public Node(Node other) {
    __isset_bitfield = other.__isset_bitfield;
    this.nodeId = other.nodeId;
    this.domainId = other.domainId;
    if (other.isSetHostname()) {
      this.hostname = other.hostname;
    }
    this.port = other.port;
  }
  public Node deepCopy() {
    return new Node(this);
  }
  @Override
  public void clear() {
    setNodeIdIsSet(false);
    this.nodeId = 0;
    setDomainIdIsSet(false);
    this.domainId = 0;
    this.hostname = null;
    setPortIsSet(false);
    this.port = 0;
  }
  public short getNodeId() {
    return this.nodeId;
  }
  public Node setNodeId(short nodeId) {
    this.nodeId = nodeId;
    setNodeIdIsSet(true);
    return this;
  }
  public void unsetNodeId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NODEID_ISSET_ID);
  }
  public boolean isSetNodeId() {
    return EncodingUtils.testBit(__isset_bitfield, __NODEID_ISSET_ID);
  }
  public void setNodeIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NODEID_ISSET_ID, value);
  }
  public short getDomainId() {
    return this.domainId;
  }
  public Node setDomainId(short domainId) {
    this.domainId = domainId;
    setDomainIdIsSet(true);
    return this;
  }
  public void unsetDomainId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DOMAINID_ISSET_ID);
  }
  public boolean isSetDomainId() {
    return EncodingUtils.testBit(__isset_bitfield, __DOMAINID_ISSET_ID);
  }
  public void setDomainIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DOMAINID_ISSET_ID, value);
  }
  public String getHostname() {
    return this.hostname;
  }
  public Node setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }
  public void unsetHostname() {
    this.hostname = null;
  }
  public boolean isSetHostname() {
    return this.hostname != null;
  }
  public void setHostnameIsSet(boolean value) {
    if (!value) {
      this.hostname = null;
    }
  }
  public int getPort() {
    return this.port;
  }
  public Node setPort(int port) {
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
    case NODE_ID:
      if (value == null) {
        unsetNodeId();
      } else {
        setNodeId((Short)value);
      }
      break;
    case DOMAIN_ID:
      if (value == null) {
        unsetDomainId();
      } else {
        setDomainId((Short)value);
      }
      break;
    case HOSTNAME:
      if (value == null) {
        unsetHostname();
      } else {
        setHostname((String)value);
      }
      break;
    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((Integer)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ID:
      return Short.valueOf(getNodeId());
    case DOMAIN_ID:
      return Short.valueOf(getDomainId());
    case HOSTNAME:
      return getHostname();
    case PORT:
      return Integer.valueOf(getPort());
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case NODE_ID:
      return isSetNodeId();
    case DOMAIN_ID:
      return isSetDomainId();
    case HOSTNAME:
      return isSetHostname();
    case PORT:
      return isSetPort();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Node)
      return this.equals((Node)that);
    return false;
  }
  public boolean equals(Node that) {
    if (that == null)
      return false;
    boolean this_present_nodeId = true && this.isSetNodeId();
    boolean that_present_nodeId = true && that.isSetNodeId();
    if (this_present_nodeId || that_present_nodeId) {
      if (!(this_present_nodeId && that_present_nodeId))
        return false;
      if (this.nodeId != that.nodeId)
        return false;
    }
    boolean this_present_domainId = true && this.isSetDomainId();
    boolean that_present_domainId = true && that.isSetDomainId();
    if (this_present_domainId || that_present_domainId) {
      if (!(this_present_domainId && that_present_domainId))
        return false;
      if (this.domainId != that.domainId)
        return false;
    }
    boolean this_present_hostname = true && this.isSetHostname();
    boolean that_present_hostname = true && that.isSetHostname();
    if (this_present_hostname || that_present_hostname) {
      if (!(this_present_hostname && that_present_hostname))
        return false;
      if (!this.hostname.equals(that.hostname))
        return false;
    }
    boolean this_present_port = true && this.isSetPort();
    boolean that_present_port = true && that.isSetPort();
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
  public int compareTo(Node other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    Node typedOther = (Node)other;
    lastComparison = Boolean.valueOf(isSetNodeId()).compareTo(typedOther.isSetNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeId, typedOther.nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDomainId()).compareTo(typedOther.isSetDomainId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomainId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domainId, typedOther.domainId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostname()).compareTo(typedOther.isSetHostname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostname, typedOther.hostname);
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
    StringBuilder sb = new StringBuilder("Node(");
    boolean first = true;
    if (isSetNodeId()) {
      sb.append("nodeId:");
      sb.append(this.nodeId);
      first = false;
    }
    if (isSetDomainId()) {
      if (!first) sb.append(", ");
      sb.append("domainId:");
      sb.append(this.domainId);
      first = false;
    }
    if (isSetHostname()) {
      if (!first) sb.append(", ");
      sb.append("hostname:");
      if (this.hostname == null) {
        sb.append("null");
      } else {
        sb.append(this.hostname);
      }
      first = false;
    }
    if (isSetPort()) {
      if (!first) sb.append(", ");
      sb.append("port:");
      sb.append(this.port);
      first = false;
    }
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
  private static class NodeStandardSchemeFactory implements SchemeFactory {
    public NodeStandardScheme getScheme() {
      return new NodeStandardScheme();
    }
  }
  private static class NodeStandardScheme extends StandardScheme<Node> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, Node struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.nodeId = iprot.readI16();
              struct.setNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.domainId = iprot.readI16();
              struct.setDomainIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostname = iprot.readString();
              struct.setHostnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, Node struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetNodeId()) {
        oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
        oprot.writeI16(struct.nodeId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDomainId()) {
        oprot.writeFieldBegin(DOMAIN_ID_FIELD_DESC);
        oprot.writeI16(struct.domainId);
        oprot.writeFieldEnd();
      }
      if (struct.hostname != null) {
        if (struct.isSetHostname()) {
          oprot.writeFieldBegin(HOSTNAME_FIELD_DESC);
          oprot.writeString(struct.hostname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPort()) {
        oprot.writeFieldBegin(PORT_FIELD_DESC);
        oprot.writeI32(struct.port);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class NodeTupleSchemeFactory implements SchemeFactory {
    public NodeTupleScheme getScheme() {
      return new NodeTupleScheme();
    }
  }
  private static class NodeTupleScheme extends TupleScheme<Node> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Node struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNodeId()) {
        optionals.set(0);
      }
      if (struct.isSetDomainId()) {
        optionals.set(1);
      }
      if (struct.isSetHostname()) {
        optionals.set(2);
      }
      if (struct.isSetPort()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNodeId()) {
        oprot.writeI16(struct.nodeId);
      }
      if (struct.isSetDomainId()) {
        oprot.writeI16(struct.domainId);
      }
      if (struct.isSetHostname()) {
        oprot.writeString(struct.hostname);
      }
      if (struct.isSetPort()) {
        oprot.writeI32(struct.port);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Node struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.nodeId = iprot.readI16();
        struct.setNodeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.domainId = iprot.readI16();
        struct.setDomainIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.hostname = iprot.readString();
        struct.setHostnameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.port = iprot.readI32();
        struct.setPortIsSet(true);
      }
    }
  }
}
