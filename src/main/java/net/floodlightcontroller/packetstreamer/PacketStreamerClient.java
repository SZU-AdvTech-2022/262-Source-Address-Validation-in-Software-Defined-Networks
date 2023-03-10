package net.floodlightcontroller.packetstreamer;
import java.util.List;
import java.util.ArrayList;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class PacketStreamerClient {
    protected static Logger log = LoggerFactory.getLogger(PacketStreamerClient.class);
    public static void main(String [] args) {
        try {
            int serverPort = Integer.parseInt(System.getProperty("net.floodlightcontroller.packetstreamer.port", "9090"));
            TTransport transport;
            transport = new TFramedTransport(new TSocket("localhost", serverPort));
            transport.open();
            TProtocol protocol = new  TBinaryProtocol(transport);
            PacketStreamer.Client client = new PacketStreamer.Client(protocol);
            sendPackets(client, (short)2, OFMessageType.PACKET_IN, true);
            log.debug("Terminate session1");
            client.terminateSession("session1");
            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        } 
    }
    private static void sendPackets(PacketStreamer.Client client, short numPackets, OFMessageType ofType, boolean sync) 
    throws TException {
        while (numPackets-- > 0) {
            Message msg = new Message();
            Packet packet = new Packet();
            List<String> sids = new ArrayList<String>();
            sids.add("session1");
            sids.add("session2");
            msg.setSessionIDs(sids);
            packet.setMessageType(ofType);
            long sw_dpid = numPackets/40 + 1;
            String strData = "New data, sequence " + numPackets;
            packet.setData(strData.getBytes());
            msg.setPacket(packet);
            try {
                if (sync) {
                      client.pushMessageSync(msg);
                      log.debug("Send packet sync: " + msg.toString());
                } else {
                      client.pushMessageAsync(msg);
                      log.debug("Send packet sync: " + msg.toString());
                }
            } catch (TTransportException e) {
                log.error(e.toString());
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }
}
