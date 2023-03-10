package net.floodlightcontroller.packet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.projectfloodlight.openflow.types.IpProtocol;
public class IPv4Test {
    @Test
    public void testToIPv4Address() {
        int intIp = 0xc0a80001;
        String stringIp = "192.168.0.1";
        byte[] byteIp = new byte[] {(byte)192, (byte)168, (byte)0, (byte)1};
        assertEquals(intIp, IPv4.toIPv4Address(stringIp));
        assertEquals(intIp, IPv4.toIPv4Address(byteIp));
        assertTrue(Arrays.equals(byteIp, IPv4.toIPv4AddressBytes(intIp)));
        assertTrue(Arrays.equals(byteIp, IPv4.toIPv4AddressBytes(stringIp)));
    }
    @Test
    public void testToIPv4AddressBytes() {
        byte[] expected = new byte[] {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        Assert.assertArrayEquals(expected, IPv4.toIPv4AddressBytes("255.255.255.255"));
        expected = new byte[] {(byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80};
        Assert.assertArrayEquals(expected, IPv4.toIPv4AddressBytes("128.128.128.128"));
        expected = new byte[] {0x7f,0x7f,0x7f,0x7f};
        Assert.assertArrayEquals(expected, IPv4.toIPv4AddressBytes("127.127.127.127"));
    }
    @Test
    public void testSerialize() {
        byte[] expected = new byte[] { 0x45, 0x00, 0x00, 0x14, 0x5e, 0x4e,
                0x00, 0x00, 0x3f, 0x06, 0x31, 0x2e, (byte) 0xac, 0x18,
                0x4a, (byte) 0xdf, (byte) 0xab, 0x40, 0x4a, 0x30 };
        IPv4 packet = new IPv4()
            .setIdentification((short) 24142)
            .setTtl((byte) 63)
            .setProtocol(IpProtocol.of((byte) 0x06))
            .setSourceAddress("172.24.74.223")
            .setDestinationAddress("171.64.74.48");
        byte[] actual = packet.serialize();
        assertTrue(Arrays.equals(expected, actual));
    }
    byte[] pktSerialized = 
            new byte[] { 0x45, 0x00,
                         0x00, 0x2e, 0x41, (byte) 0xbe, 0x40, 0x00, 0x40, 0x06,
                         (byte) 0xd4, (byte) 0xf0, (byte) 0xc0, (byte) 0xa8, 
                         0x02, (byte) 0xdb, (byte) 0xd0, 0x55,
                         (byte) 0x90, 0x42, (byte) 0xd5, 0x48, 0x01, (byte) 
                         0xbb, (byte) 0xe3, 0x50,
                         (byte) 0xb2, 0x2f, (byte) 0xfc, (byte) 0xf8, 
                         (byte) 0xa8, 0x2c, 0x50, 0x18,
                         (byte) 0xff, (byte) 0xff, 0x24, 0x3c, 0x00, 
                         0x00, 0x14, 0x03,
                         0x01, 0x00, 0x01, 0x01
    };
    @Test
    public void testDeserialize() throws Exception {
        IPv4 packet = new IPv4();
        packet.deserialize(pktSerialized, 0, pktSerialized.length);
        byte[] pktSerialized1 = packet.serialize();
        assertTrue(Arrays.equals(pktSerialized, pktSerialized1));
    }
    @Test
    public void testDeserializePadded() throws Exception {
        byte[] pktSerializedPadded = new byte[] { 0x45, 0x00,
                0x00, 0x2e, 0x41, (byte) 0xbe, 0x40, 0x00, 0x40, 0x06,
                (byte) 0xd4, (byte) 0xf0, (byte) 0xc0, (byte) 0xa8, 0x02, (byte) 0xdb, (byte) 0xd0, 0x55,
                (byte) 0x90, 0x42, (byte) 0xd5, 0x48, 0x01, (byte) 0xbb, (byte) 0xe3, 0x50,
                (byte) 0xb2, 0x2f, (byte) 0xfc, (byte) 0xf8, (byte) 0xa8, 0x2c, 0x50, 0x18,
                (byte) 0xff, (byte) 0xff, 0x24, 0x3c, 0x00, 0x00, 0x14, 0x03,
                0x01, 0x00, 0x01, 0x01, 0x01, 0x00, 0x01, 0x01, 
                0x01, 0x00, 0x01, 0x01, 0x01, 0x00, 0x01, 0x01, 
        };
        IPv4 packet = new IPv4();
        packet.deserialize(pktSerializedPadded, 0, pktSerializedPadded.length);
        byte[] pktSerialized1 = packet.serialize();
        assertTrue(Arrays.equals(pktSerialized, pktSerialized1));
    }
    @Test
    public void testDeserializeFragment() throws Exception {
        byte[] pktSerializedFirstFrag = new byte[] { 0x45, 0x00,
                0x00, 0x2e, 0x41, (byte) 0xbe, 0x20, 0x00, 0x40, 0x06,
                (byte) 0xd4, (byte) 0xf0, (byte) 0xc0, (byte) 0xa8, 0x02, (byte) 0xdb, (byte) 0xd0, 0x55,
                (byte) 0x90, 0x42, (byte) 0xd5, 0x48, 0x01, (byte) 0xbb, (byte) 0xe3, 0x50,
                (byte) 0xb2, 0x2f, (byte) 0xfc, (byte) 0xf8, (byte) 0xa8, 0x2c, 0x50, 0x18,
                (byte) 0xff, (byte) 0xff, 0x24, 0x3c, 0x00, 0x00, 0x14, 0x03,
                0x01, 0x00, 0x01, 0x01,
        };
        IPv4 packet1 = new IPv4();
        packet1.deserialize(pktSerializedFirstFrag, 0, pktSerializedFirstFrag.length);
        byte[] pktSerialized1 = packet1.serialize();
        assertTrue(packet1.isFragment());
        assertTrue(Arrays.equals(pktSerializedFirstFrag, pktSerialized1));
        byte[] pktSerializedLastFrag = new byte[] { 0x45, 0x00,
                0x00, 0x2e, 0x41, (byte) 0xbe, 0x01, 0x00, 0x40, 0x06,
                (byte) 0xd4, (byte) 0xf0, (byte) 0xc0, (byte) 0xa8, 0x02, (byte) 0xdb, (byte) 0xd0, 0x55,
                (byte) 0x90, 0x42, (byte) 0xd5, 0x48, 0x01, (byte) 0xbb, (byte) 0xe3, 0x50,
                (byte) 0xb2, 0x2f, (byte) 0xfc, (byte) 0xf8, (byte) 0xa8, 0x2c, 0x50, 0x18,
                (byte) 0xff, (byte) 0xff, 0x24, 0x3c, 0x00, 0x00, 0x14, 0x03,
                0x01, 0x00, 0x01, 0x01,
        };
        IPv4 packet2 = new IPv4();
        packet2.deserialize(pktSerializedLastFrag, 0, pktSerializedLastFrag.length);
        byte[] pktSerialized2 = packet2.serialize();
        assertTrue(packet2.isFragment());
        assertTrue(Arrays.equals(pktSerializedLastFrag, pktSerialized2));
    }
    @Test
    public void testDeserializeDontFragment() throws Exception {
        byte[] pktSerializedDontFrag = new byte[] { 0x45, 0x00,
                0x00, 0x2e, 0x41, (byte) 0xbe, 0x60, 0x00, 0x40, 0x06,
                (byte) 0xd4, (byte) 0xf0, (byte) 0xc0, (byte) 0xa8, 0x02, (byte) 0xdb, (byte) 0xd0, 0x55,
                (byte) 0x90, 0x42, (byte) 0xd5, 0x48, 0x01, (byte) 0xbb, (byte) 0xe3, 0x50,
                (byte) 0xb2, 0x2f, (byte) 0xfc, (byte) 0xf8, (byte) 0xa8, 0x2c, 0x50, 0x18,
                (byte) 0xff, (byte) 0xff, 0x24, 0x3c, 0x00, 0x00, 0x14, 0x03,
                0x01, 0x00, 0x01, 0x01,
        };
        IPv4 packet1 = new IPv4();
        packet1.deserialize(pktSerializedDontFrag, 0, pktSerializedDontFrag.length);
        byte[] pktSerialized1 = packet1.serialize();
        assertTrue(!packet1.isFragment());
        assertTrue(Arrays.equals(pktSerializedDontFrag, pktSerialized1));
    }
}
