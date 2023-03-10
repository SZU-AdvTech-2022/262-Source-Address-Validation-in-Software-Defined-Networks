package net.floodlightcontroller.learningswitch;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.internal.IOFSwitchService;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.debugcounter.IDebugCounterService;
import net.floodlightcontroller.debugcounter.MockDebugCounterService;
import net.floodlightcontroller.packet.Data;
import net.floodlightcontroller.packet.Ethernet;
import net.floodlightcontroller.packet.IPacket;
import net.floodlightcontroller.packet.IPv4;
import net.floodlightcontroller.packet.UDP;
import net.floodlightcontroller.restserver.IRestApiService;
import net.floodlightcontroller.restserver.RestApiServer;
import net.floodlightcontroller.test.FloodlightTestCase;
import net.floodlightcontroller.util.OFMessageUtils;
import org.easymock.Capture;
import org.easymock.CaptureType;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.projectfloodlight.openflow.protocol.OFFactories;
import org.projectfloodlight.openflow.protocol.OFFactory;
import org.projectfloodlight.openflow.protocol.OFFlowAdd;
import org.projectfloodlight.openflow.protocol.OFFlowModFlags;
import org.projectfloodlight.openflow.protocol.OFMessage;
import org.projectfloodlight.openflow.protocol.OFPacketIn;
import org.projectfloodlight.openflow.protocol.OFPacketInReason;
import org.projectfloodlight.openflow.protocol.OFPacketOut;
import org.projectfloodlight.openflow.protocol.OFVersion;
import org.projectfloodlight.openflow.types.DatapathId;
import org.projectfloodlight.openflow.types.EthType;
import org.projectfloodlight.openflow.types.MacAddress;
import org.projectfloodlight.openflow.types.OFBufferId;
import org.projectfloodlight.openflow.types.OFPort;
import org.projectfloodlight.openflow.types.OFVlanVidMatch;
import org.projectfloodlight.openflow.types.U64;
import org.projectfloodlight.openflow.types.VlanVid;
import org.projectfloodlight.openflow.protocol.OFType;
import org.projectfloodlight.openflow.protocol.action.OFAction;
import org.projectfloodlight.openflow.protocol.action.OFActionOutput;
import org.projectfloodlight.openflow.protocol.match.MatchField;
public class LearningSwitchTest extends FloodlightTestCase {
    protected OFPacketIn packetIn;
    protected IPacket testPacket;
    protected byte[] testPacketSerialized;
    protected IPacket broadcastPacket;
    protected byte[] broadcastPacketSerialized;
    protected IPacket testPacketReply;
    protected byte[] testPacketReplySerialized;
    private LearningSwitch learningSwitch;
    private OFFactory factory = OFFactories.getFactory(OFVersion.OF_13);
    private FloodlightModuleContext fmc;
    private RestApiServer restApiService;
    private MockDebugCounterService debugCounterService;
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        this.testPacket = new Ethernet()
            .setDestinationMACAddress("00:11:22:33:44:55")
            .setSourceMACAddress("00:44:33:22:11:00")
            .setVlanID((short) 42)
            .setEtherType(EthType.IPv4)
            .setPayload(
                new IPv4()
                .setTtl((byte) 128)
                .setSourceAddress("192.168.1.1")
                .setDestinationAddress("192.168.1.2")
                .setPayload(new UDP()
                            .setSourcePort((short) 5000)
                            .setDestinationPort((short) 5001)
                            .setPayload(new Data(new byte[] {0x01}))));
        this.testPacketSerialized = testPacket.serialize();
        this.broadcastPacket = new Ethernet()
            .setDestinationMACAddress("FF:FF:FF:FF:FF:FF")
            .setSourceMACAddress("00:44:33:22:11:00")
            .setVlanID((short) 42)
            .setEtherType(EthType.IPv4)
            .setPayload(
                new IPv4()
                .setTtl((byte) 128)
                .setSourceAddress("192.168.1.1")
                .setDestinationAddress("192.168.255.255")
                .setPayload(new UDP()
                        .setSourcePort((short) 5000)
                        .setDestinationPort((short) 5001)
                        .setPayload(new Data(new byte[] {0x01}))));
        this.broadcastPacketSerialized = broadcastPacket.serialize();
        this.testPacketReply = new Ethernet()
            .setDestinationMACAddress("00:44:33:22:11:00")
            .setSourceMACAddress("00:11:22:33:44:55")
            .setVlanID((short) 42)
            .setEtherType(EthType.IPv4)
            .setPayload(
                    new IPv4()
                    .setTtl((byte) 128)
                    .setSourceAddress("192.168.1.2")
                    .setDestinationAddress("192.168.1.1")
                    .setPayload(new UDP()
                    .setSourcePort((short) 5001)
                    .setDestinationPort((short) 5000)
                    .setPayload(new Data(new byte[] {0x02}))));
        this.testPacketReplySerialized = testPacketReply.serialize();
        this.packetIn = factory.buildPacketIn()
        	.setMatch(factory.buildMatch()
        			.setExact(MatchField.IN_PORT, OFPort.of(1))
        			.build()
        	)
            .setBufferId(OFBufferId.NO_BUFFER)
            .setData(this.testPacketSerialized)
            .setReason(OFPacketInReason.NO_MATCH)
            .build();
        this.debugCounterService = new MockDebugCounterService();
        this.learningSwitch = new LearningSwitch();
        this.restApiService = new RestApiServer();
        this.fmc = new FloodlightModuleContext();
        fmc.addService(IOFSwitchService.class, getMockSwitchService());
        fmc.addService(IFloodlightProviderService.class, getMockFloodlightProvider());
        fmc.addService(IDebugCounterService.class, debugCounterService);
        fmc.addService(IRestApiService.class, this.restApiService);
        this.debugCounterService.init(fmc);
        this.restApiService.init(fmc);
        this.learningSwitch.init(fmc);
        this.debugCounterService.startUp(fmc);
        this.restApiService.startUp(fmc);
        this.learningSwitch.startUp(fmc);
        this.mockFloodlightProvider.addOFMessageListener(OFType.PACKET_IN, learningSwitch);
        this.mockFloodlightProvider.addCompletionListener(learningSwitch);
    }
    @Test
    public void testFlood() throws Exception {
        OFPacketOut po = factory.buildPacketOut()
        	.setInPort(OFPort.of(1))
            .setActions(Arrays.asList((OFAction)factory.actions().output(OFPort.FLOOD, 0xffFFffFF)))
            .setBufferId(OFBufferId.NO_BUFFER)
            .setData(this.testPacketSerialized)
	        .build();
        Capture<OFMessage> wc1 = new Capture<OFMessage>(CaptureType.ALL);
        IOFSwitch mockSwitch = createMock(IOFSwitch.class);
        expect(mockSwitch.getId()).andReturn(DatapathId.of("00:11:22:33:44:55:66:77")).anyTimes();
        expect(mockSwitch.getOFFactory()).andReturn(factory).anyTimes();
        replay(mockSwitch);
        IOFMessageListener listener = mockFloodlightProvider.getListeners().get(OFType.PACKET_IN).get(0);
        listener.receive(mockSwitch, this.packetIn, parseAndAnnotate(this.packetIn));
        OFPort result = learningSwitch.getFromPortMap(mockSwitch, MacAddress.of("00:44:33:22:11:00"), VlanVid.ofVlan(42));
        verify(mockSwitch);
        assertTrue(wc1.hasCaptured());
        assertTrue(OFMessageUtils.equalsIgnoreXid(wc1.getValue(), po));
        assertEquals(OFPort.of(1), result);
    }
    @Test
    public void testFlowMod() throws Exception {
        this.packetIn = packetIn.createBuilder().setBufferId(OFBufferId.of(50)).build();
        Capture<OFMessage> wc1 = new Capture<OFMessage>(CaptureType.ALL);
        Capture<OFMessage> wc2 = new Capture<OFMessage>(CaptureType.ALL);
        Capture<OFMessage> wc3 = new Capture<OFMessage>(CaptureType.ALL);
        Set<OFFlowModFlags> flags = new HashSet<OFFlowModFlags>();
        flags.add(OFFlowModFlags.SEND_FLOW_REM);
        OFFlowAdd fm1 = factory.buildFlowAdd()
            .setActions(Arrays.asList((OFAction)factory.actions().output(OFPort.of(2), 0xffFFffFF)))
            .setBufferId(OFBufferId.NO_BUFFER)
            .setIdleTimeout((short) 5)
            .setMatch(factory.buildMatch()
        			.setExact(MatchField.IN_PORT, OFPort.of(1))
        			.setExact(MatchField.ETH_SRC, MacAddress.of("00:44:33:22:11:00"))
        			.setExact(MatchField.ETH_DST, MacAddress.of("00:11:22:33:44:55"))
        			.setExact(MatchField.VLAN_VID, OFVlanVidMatch.ofVlan(42))
        			.build())
            .setOutPort(OFPort.of(2))
            .setCookie(U64.of(1L << 52))
            .setPriority((short) 100)
            .setFlags(flags)
            .build();
        OFFlowAdd fm2 = factory.buildFlowAdd()
            .setActions(Arrays.asList((OFAction)factory.actions().output(OFPort.of(1), 0xffFFffFF)))
            .setBufferId(OFBufferId.NO_BUFFER)
            .setIdleTimeout((short) 5)
            .setMatch(factory.buildMatch()
        			.setExact(MatchField.IN_PORT, OFPort.of(2))
        			.setExact(MatchField.ETH_DST, MacAddress.of("00:44:33:22:11:00"))
        			.setExact(MatchField.ETH_SRC, MacAddress.of("00:11:22:33:44:55"))
        			.setExact(MatchField.VLAN_VID, OFVlanVidMatch.ofVlan(42))
        			.build()
        	)
            .setOutPort(OFPort.of(1))
            .setFlags(flags)
            .setCookie(U64.of(1L << 52))
            .setPriority((short) 100)
            .build();
        OFActionOutput ofAcOut = factory.actions().output(OFPort.of(2), 0xffFFffFF);
        OFPacketOut packetOut = factory.buildPacketOut()
        .setActions(Arrays.asList((OFAction)ofAcOut))
        .setBufferId(OFBufferId.of(50))
        .setInPort(OFPort.of(1))
        .build();
        IOFSwitch mockSwitch = createMock(IOFSwitch.class);
        expect(mockSwitch.getId()).andReturn(DatapathId.of(1L)).anyTimes();
        expect(mockSwitch.getBuffers()).andReturn((long)100).anyTimes();
        expect(mockSwitch.getOFFactory()).andReturn(factory).anyTimes();
        replay(mockSwitch);
        learningSwitch.addToPortMap(mockSwitch,
                MacAddress.of("00:11:22:33:44:55"), VlanVid.ofVlan(42), OFPort.of(2));
        IOFMessageListener listener = mockFloodlightProvider.getListeners().get(
                OFType.PACKET_IN).get(0);
        listener.receive(mockSwitch, this.packetIn, parseAndAnnotate(this.packetIn));
        OFPort result = learningSwitch.getFromPortMap(mockSwitch, MacAddress.of("00:44:33:22:11:00"), VlanVid.ofVlan(42));
        verify(mockSwitch);
        assertTrue(wc1.hasCaptured());
        assertTrue(wc2.hasCaptured());
        assertTrue(wc3.hasCaptured());
        assertTrue(OFMessageUtils.equalsIgnoreXid(wc1.getValue(), packetOut));
        assertTrue(OFMessageUtils.equalsIgnoreXid(wc2.getValue(), fm1));
        assertTrue(OFMessageUtils.equalsIgnoreXid(wc3.getValue(), fm2));
        assertEquals(OFPort.of(1), result);
    }
}
