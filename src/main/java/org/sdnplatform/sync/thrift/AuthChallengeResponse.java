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
@SuppressWarnings("all") public class AuthChallengeResponse implements org.apache.thrift.TBase<AuthChallengeResponse, AuthChallengeResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthChallengeResponse");
  private static final org.apache.thrift.protocol.TField CHALLENGE_FIELD_DESC = new org.apache.thrift.protocol.TField("challenge", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("response", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthChallengeResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthChallengeResponseTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHALLENGE((short)1, "challenge"),
    RESPONSE((short)2, "response");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return CHALLENGE;
          return RESPONSE;
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
  private _Fields optionals[] = {_Fields.CHALLENGE,_Fields.RESPONSE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHALLENGE, new org.apache.thrift.meta_data.FieldMetaData("challenge", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("response", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthChallengeResponse.class, metaDataMap);
  }
  public AuthChallengeResponse() {
  }
  public AuthChallengeResponse(AuthChallengeResponse other) {
    if (other.isSetChallenge()) {
      this.challenge = other.challenge;
    }
    if (other.isSetResponse()) {
      this.response = other.response;
    }
  }
  public AuthChallengeResponse deepCopy() {
    return new AuthChallengeResponse(this);
  }
  @Override
  public void clear() {
    this.challenge = null;
    this.response = null;
  }
  public String getChallenge() {
    return this.challenge;
  }
  public AuthChallengeResponse setChallenge(String challenge) {
    this.challenge = challenge;
    return this;
  }
  public void unsetChallenge() {
    this.challenge = null;
  }
  public boolean isSetChallenge() {
    return this.challenge != null;
  }
  public void setChallengeIsSet(boolean value) {
    if (!value) {
      this.challenge = null;
    }
  }
  public String getResponse() {
    return this.response;
  }
  public AuthChallengeResponse setResponse(String response) {
    this.response = response;
    return this;
  }
  public void unsetResponse() {
    this.response = null;
  }
  public boolean isSetResponse() {
    return this.response != null;
  }
  public void setResponseIsSet(boolean value) {
    if (!value) {
      this.response = null;
    }
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHALLENGE:
      if (value == null) {
        unsetChallenge();
      } else {
        setChallenge((String)value);
      }
      break;
    case RESPONSE:
      if (value == null) {
        unsetResponse();
      } else {
        setResponse((String)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHALLENGE:
      return getChallenge();
    case RESPONSE:
      return getResponse();
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case CHALLENGE:
      return isSetChallenge();
    case RESPONSE:
      return isSetResponse();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthChallengeResponse)
      return this.equals((AuthChallengeResponse)that);
    return false;
  }
  public boolean equals(AuthChallengeResponse that) {
    if (that == null)
      return false;
    boolean this_present_challenge = true && this.isSetChallenge();
    boolean that_present_challenge = true && that.isSetChallenge();
    if (this_present_challenge || that_present_challenge) {
      if (!(this_present_challenge && that_present_challenge))
        return false;
      if (!this.challenge.equals(that.challenge))
        return false;
    }
    boolean this_present_response = true && this.isSetResponse();
    boolean that_present_response = true && that.isSetResponse();
    if (this_present_response || that_present_response) {
      if (!(this_present_response && that_present_response))
        return false;
      if (!this.response.equals(that.response))
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(AuthChallengeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    AuthChallengeResponse typedOther = (AuthChallengeResponse)other;
    lastComparison = Boolean.valueOf(isSetChallenge()).compareTo(typedOther.isSetChallenge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChallenge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.challenge, typedOther.challenge);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponse()).compareTo(typedOther.isSetResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.response, typedOther.response);
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
    StringBuilder sb = new StringBuilder("AuthChallengeResponse(");
    boolean first = true;
    if (isSetChallenge()) {
      sb.append("challenge:");
      if (this.challenge == null) {
        sb.append("null");
      } else {
        sb.append(this.challenge);
      }
      first = false;
    }
    if (isSetResponse()) {
      if (!first) sb.append(", ");
      sb.append("response:");
      if (this.response == null) {
        sb.append("null");
      } else {
        sb.append(this.response);
      }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private static class AuthChallengeResponseStandardSchemeFactory implements SchemeFactory {
    public AuthChallengeResponseStandardScheme getScheme() {
      return new AuthChallengeResponseStandardScheme();
    }
  }
  private static class AuthChallengeResponseStandardScheme extends StandardScheme<AuthChallengeResponse> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthChallengeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.challenge = iprot.readString();
              struct.setChallengeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.response = iprot.readString();
              struct.setResponseIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthChallengeResponse struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.challenge != null) {
        if (struct.isSetChallenge()) {
          oprot.writeFieldBegin(CHALLENGE_FIELD_DESC);
          oprot.writeString(struct.challenge);
          oprot.writeFieldEnd();
        }
      }
      if (struct.response != null) {
        if (struct.isSetResponse()) {
          oprot.writeFieldBegin(RESPONSE_FIELD_DESC);
          oprot.writeString(struct.response);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class AuthChallengeResponseTupleSchemeFactory implements SchemeFactory {
    public AuthChallengeResponseTupleScheme getScheme() {
      return new AuthChallengeResponseTupleScheme();
    }
  }
  private static class AuthChallengeResponseTupleScheme extends TupleScheme<AuthChallengeResponse> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthChallengeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChallenge()) {
        optionals.set(0);
      }
      if (struct.isSetResponse()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetChallenge()) {
        oprot.writeString(struct.challenge);
      }
      if (struct.isSetResponse()) {
        oprot.writeString(struct.response);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthChallengeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.challenge = iprot.readString();
        struct.setChallengeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.response = iprot.readString();
        struct.setResponseIsSet(true);
      }
    }
  }
}
