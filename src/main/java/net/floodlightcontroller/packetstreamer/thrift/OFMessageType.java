package net.floodlightcontroller.packetstreamer.thrift;
import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;
@SuppressWarnings("all") public enum OFMessageType implements org.apache.thrift.TEnum {
  HELLO(0),
  ERROR(1),
  ECHO_REQUEST(2),
  ECHO_REPLY(3),
  VENDOR(4),
  FEATURES_REQUEST(5),
  FEATURES_REPLY(6),
  GET_CONFIG_REQUEST(7),
  GET_CONFIG_REPLY(8),
  SET_CONFIG(9),
  PACKET_IN(10),
  FLOW_REMOVED(11),
  PORT_STATUS(12),
  PACKET_OUT(13),
  FLOW_MOD(14),
  PORT_MOD(15),
  STATS_REQUEST(16),
  STATS_REPLY(17),
  BARRIER_REQUEST(18),
  BARRIER_REPLY(19),
  QUEUE_GET_CONFIG_REQUEST(20),
  QUEUE_GET_CONFIG_REPLY(21);
  private final int value;
  private OFMessageType(int value) {
    this.value = value;
  }
  public int getValue() {
    return value;
  }
  public static OFMessageType findByValue(int value) { 
    switch (value) {
      case 0:
        return HELLO;
      case 1:
        return ERROR;
      case 2:
        return ECHO_REQUEST;
      case 3:
        return ECHO_REPLY;
      case 4:
        return VENDOR;
      case 5:
        return FEATURES_REQUEST;
      case 6:
        return FEATURES_REPLY;
      case 7:
        return GET_CONFIG_REQUEST;
      case 8:
        return GET_CONFIG_REPLY;
      case 9:
        return SET_CONFIG;
      case 10:
        return PACKET_IN;
      case 11:
        return FLOW_REMOVED;
      case 12:
        return PORT_STATUS;
      case 13:
        return PACKET_OUT;
      case 14:
        return FLOW_MOD;
      case 15:
        return PORT_MOD;
      case 16:
        return STATS_REQUEST;
      case 17:
        return STATS_REPLY;
      case 18:
        return BARRIER_REQUEST;
      case 19:
        return BARRIER_REPLY;
      case 20:
        return QUEUE_GET_CONFIG_REQUEST;
      case 21:
        return QUEUE_GET_CONFIG_REPLY;
      default:
        return null;
    }
  }
}
