package net.floodlightcontroller.core.internal;
import org.junit.Before;
import org.junit.Test;
import net.floodlightcontroller.test.FloodlightTestCase;
import java.util.List;
import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.HARole;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IHAListener;
import net.floodlightcontroller.core.IListener;
import net.floodlightcontroller.core.IListener.Command;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.RoleInfo;
import net.floodlightcontroller.core.SwitchDescription;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.test.MockThreadPoolService;
import net.floodlightcontroller.debugcounter.IDebugCounterService;
import net.floodlightcontroller.debugcounter.DebugCounterServiceImpl;
import net.floodlightcontroller.debugevent.DebugEventService;
import net.floodlightcontroller.debugevent.IDebugEventService;
import net.floodlightcontroller.packet.ARP;
import net.floodlightcontroller.packet.Ethernet;
import net.floodlightcontroller.packet.IPacket;
import net.floodlightcontroller.perfmon.IPktInProcessingTimeService;
import net.floodlightcontroller.perfmon.PktInProcessingTime;
import net.floodlightcontroller.restserver.IRestApiService;
import net.floodlightcontroller.restserver.RestApiServer;
import net.floodlightcontroller.storage.IStorageSourceService;
import net.floodlightcontroller.storage.memory.MemoryStorageSource;
import net.floodlightcontroller.threadpool.IThreadPoolService;
import net.floodlightcontroller.threadpool.ThreadPool;
import org.junit.After;
import net.floodlightcontroller.core.IShutdownListener;
import net.floodlightcontroller.core.IShutdownService;
import net.floodlightcontroller.core.internal.IOFSwitchService;
import net.floodlightcontroller.core.test.MockSwitchManager;
import net.floodlightcontroller.core.IOFSwitchBackend;
import org.projectfloodlight.openflow.protocol.OFControllerRole;
import org.projectfloodlight.openflow.protocol.OFFactories;
import org.projectfloodlight.openflow.protocol.OFFeaturesReply;
import org.projectfloodlight.openflow.protocol.OFFlowMod;
import org.projectfloodlight.openflow.protocol.OFMessage;
import org.projectfloodlight.openflow.protocol.OFPacketIn;
import org.projectfloodlight.openflow.protocol.OFPacketInReason;
import org.projectfloodlight.openflow.protocol.OFVersion;
import org.projectfloodlight.openflow.types.DatapathId;
import org.projectfloodlight.openflow.types.EthType;
import org.projectfloodlight.openflow.types.IPv4Address;
import org.projectfloodlight.openflow.types.MacAddress;
import org.projectfloodlight.openflow.types.OFBufferId;
import org.projectfloodlight.openflow.types.OFPort;
import org.projectfloodlight.openflow.protocol.OFPortDesc;
import org.projectfloodlight.openflow.protocol.OFType;
import org.projectfloodlight.openflow.protocol.OFFactory;
import org.sdnplatform.sync.ISyncService;
import org.sdnplatform.sync.test.MockSyncService;
import com.google.common.collect.ImmutableList;
public class ControllerTest extends FloodlightTestCase {
    private Controller controller;
    private MockThreadPoolService tp;
    private MockSyncService syncService;
    private IPacket testPacket;
    private OFPacketIn pi;
    private final OFFactory factory = OFFactories.getFactory(OFVersion.OF_10);
    private static DatapathId DATAPATH_ID_0 = DatapathId.of(0);
    @Override
    @Before
    public void setUp() throws Exception {
        doSetUp(HARole.ACTIVE);
    }
    public void doSetUp(HARole role) throws Exception {
        super.setUp();
        FloodlightModuleContext fmc = new FloodlightModuleContext();
        FloodlightProvider cm = new FloodlightProvider();
        fmc.addConfigParam(cm, "role", role.toString());
        controller = (Controller)cm.getServiceImpls().get(IFloodlightProviderService.class);
        fmc.addService(IFloodlightProviderService.class, controller);
        MemoryStorageSource memstorage = new MemoryStorageSource();
        fmc.addService(IStorageSourceService.class, memstorage);
        RestApiServer restApi = new RestApiServer();
        fmc.addService(IRestApiService.class, restApi);
        ThreadPool threadPool = new ThreadPool();
        fmc.addService(IThreadPoolService.class, threadPool);
        MockSwitchManager switchService = new MockSwitchManager();
        fmc.addService(IOFSwitchService.class, switchService);
        PktInProcessingTime ppt = new PktInProcessingTime();
        fmc.addService(IPktInProcessingTimeService.class, ppt);
        DebugCounterServiceImpl debugCounterService = new DebugCounterServiceImpl();
        fmc.addService(IDebugCounterService.class, debugCounterService);
        DebugEventService debugEventService = new DebugEventService();
        fmc.addService(IDebugEventService.class, debugEventService);
        IShutdownService shutdownService = createMock(IShutdownService.class);
        shutdownService.registerShutdownListener(anyObject(IShutdownListener.class));
        expectLastCall().anyTimes();
        replay(shutdownService);
        fmc.addService(IShutdownService.class, shutdownService);
        verify(shutdownService);
        tp = new MockThreadPoolService();
        fmc.addService(IThreadPoolService.class, tp);
        syncService = new MockSyncService();
        fmc.addService(ISyncService.class, syncService);
        ppt.init(fmc);
        restApi.init(fmc);
        threadPool.init(fmc);
        memstorage.init(fmc);
        tp.init(fmc);
        debugCounterService.init(fmc);
        debugEventService.init(fmc);
        syncService.init(fmc);
        cm.init(fmc);
        ppt.startUp(fmc);
        restApi.startUp(fmc);
        threadPool.startUp(fmc);
        memstorage.startUp(fmc);
        tp.startUp(fmc);
        debugCounterService.startUp(fmc);
        debugEventService.startUp(fmc);
        syncService.startUp(fmc);
        cm.startUp(fmc);
        testPacket = new Ethernet()
        .setSourceMACAddress("00:44:33:22:11:00")
        .setDestinationMACAddress("00:11:22:33:44:55")
        .setEtherType(EthType.ARP)
        .setPayload(
                new ARP()
                .setHardwareType(ARP.HW_TYPE_ETHERNET)
                .setProtocolType(ARP.PROTO_TYPE_IP)
                .setHardwareAddressLength((byte) 6)
                .setProtocolAddressLength((byte) 4)
                .setOpCode(ARP.OP_REPLY)
                .setSenderHardwareAddress(MacAddress.of("00:44:33:22:11:00"))
                .setSenderProtocolAddress(IPv4Address.of("192.168.1.1"))
                .setTargetHardwareAddress(MacAddress.of("00:11:22:33:44:55"))
                .setTargetProtocolAddress(IPv4Address.of("192.168.1.2")));
        byte[] testPacketSerialized = testPacket.serialize();
        pi = (OFPacketIn) factory.buildPacketIn()
                .setBufferId(OFBufferId.NO_BUFFER)
                .setInPort(OFPort.of(1))
                .setData(testPacketSerialized)
                .setReason(OFPacketInReason.NO_MATCH)
                .setTotalLen(testPacketSerialized.length).build();
    }
    @After
    public void tearDown() {
        tp.getScheduledExecutor().shutdownNow();
        assertTrue("Updates left in controller update queue",
                   controller.isUpdateQueueEmptyForTesting());
    }
    public Controller getController() {
        return controller;
    }
    private static SwitchDescription createSwitchDescription() {
        return new SwitchDescription();
    }
    private OFFeaturesReply createOFFeaturesReply(DatapathId datapathId) {
        OFFeaturesReply fr = factory.buildFeaturesReply()
                .setXid(0)
                .setDatapathId(datapathId)
                .setPorts(ImmutableList.<OFPortDesc>of())
                .build();
        return fr;
    }
    protected void setupSwitchForAddSwitch(IOFSwitch sw, DatapathId datapathId,
                                           SwitchDescription description,
                                           OFFeaturesReply featuresReply) {
    	String dpidString = datapathId.toString();
        if (description == null) {
            description = createSwitchDescription();
        }
        if (featuresReply == null) {
            featuresReply = createOFFeaturesReply(datapathId);
        }
        List<OFPortDesc> ports = featuresReply.getPorts();
        expect(sw.getOFFactory()).andReturn(OFFactories.getFactory(OFVersion.OF_10)).anyTimes();
        expect(sw.getId()).andReturn(datapathId).anyTimes();
        expect(sw.getId().toString()).andReturn(dpidString).anyTimes();
        expect(sw.getSwitchDescription()).andReturn(description).atLeastOnce();
        expect(sw.getBuffers())
                .andReturn(featuresReply.getNBuffers()).atLeastOnce();
        expect(sw.getNumTables())
                .andReturn(featuresReply.getNTables()).atLeastOnce();
        expect(sw.getCapabilities())
                .andReturn(featuresReply.getCapabilities()).atLeastOnce();
        expect(sw.getActions())
                .andReturn(featuresReply.getActions()).atLeastOnce();
        expect(sw.getPorts())
                .andReturn(ports).atLeastOnce();
        expect(sw.attributeEquals(IOFSwitch.SWITCH_SUPPORTS_NX_ROLE, true))
                .andReturn(false).anyTimes();
        expect(sw.getInetAddress()).andReturn(null).anyTimes();
    }
    @SuppressWarnings("unchecked")
    private <T> void setupListenerOrdering(IListener<T> listener) {
        listener.isCallbackOrderingPostreq((T)anyObject(),
                                           anyObject(String.class));
        expectLastCall().andReturn(false).anyTimes();
        listener.isCallbackOrderingPrereq((T)anyObject(),
                                          anyObject(String.class));
        expectLastCall().andReturn(false).anyTimes();
    }
    @Test
    public void testHandleMessagesNoListeners() throws Exception {
    	IOFSwitch sw = createMock(IOFSwitch.class);
        expect(sw.getId()).andReturn(DatapathId.NONE).anyTimes();
        replay(sw);
        controller.handleMessage(sw, pi, null);
        verify(sw);
    }
    @Test
    public void testHandleMessages() throws Exception {
        controller.removeOFMessageListeners(OFType.PACKET_IN);
        IOFSwitch sw = createMock(IOFSwitch.class);
        expect(sw.getId()).andReturn(DatapathId.NONE).anyTimes();
        IOFMessageListener test1 = createMock(IOFMessageListener.class);
        expect(test1.getName()).andReturn("test1").anyTimes();
        setupListenerOrdering(test1);
        IOFMessageListener test2 = createMock(IOFMessageListener.class);
        expect(test2.getName()).andReturn("test2").anyTimes();
        expect(test2.isCallbackOrderingPrereq(OFType.PACKET_IN, "test1"))
                .andReturn(true).atLeastOnce();
        expect(test2.isCallbackOrderingPostreq(OFType.FLOW_MOD, "test1"))
                .andReturn(true).atLeastOnce();
        setupListenerOrdering(test2);
        IOFMessageListener test3 = createMock(IOFMessageListener.class);
        expect(test3.getName()).andReturn("test3").anyTimes();
        expect(test3.isCallbackOrderingPrereq((OFType)anyObject(), eq("test1")))
                .andReturn(true).atLeastOnce();
        expect(test3.isCallbackOrderingPrereq((OFType)anyObject(), eq("test2")))
                .andReturn(true).atLeastOnce();
        setupListenerOrdering(test3);
        replay(test1, test2, test3);
        controller.addOFMessageListener(OFType.PACKET_IN, test1);
        controller.addOFMessageListener(OFType.PACKET_IN, test3);
        controller.addOFMessageListener(OFType.PACKET_IN, test2);
        controller.addOFMessageListener(OFType.FLOW_MOD, test1);
        controller.addOFMessageListener(OFType.FLOW_MOD, test2);
        verify(test1);
        verify(test2);
        verify(test3);
        replay(sw);
        reset(test1, test2, test3);
        expect(test1.receive(eq(sw), eq(pi), isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        expect(test2.receive(eq(sw), eq(pi), isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        expect(test3.receive(eq(sw), eq(pi), isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        replay(test1, test2, test3);
        controller.handleMessage(sw, pi, null);
        verify(test1);
        verify(test2);
        verify(test3);
        reset(test1, test2, test3);
        expect(test1.receive(eq(sw), eq(pi), isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        expect(test2.receive(eq(sw), eq(pi), isA(FloodlightContext.class)))
                .andThrow(new RuntimeException("This is NOT an error! We " +
                                           "are testing exception catching."));
        replay(test1, test2, test3);
        try {
            controller.handleMessage(sw, pi, null);
            fail("Expected exception was not thrown!");
        } catch (RuntimeException e) {
            assertTrue("The caught exception was not the expected one",
                       e.getMessage().startsWith("This is NOT an error!"));
        }
        verify(test1);
        verify(test2);
        verify(test3);
        reset(test1, test2, test3);
        expect(test1.receive(eq(sw), eq(pi), isA(FloodlightContext.class)))
                .andReturn(Command.STOP);
        replay(test1, test2, test3);
        controller.handleMessage(sw, pi, null);
        verify(test1);
        verify(test2);
        verify(test3);
        OFFlowMod fm = (OFFlowMod) factory.buildFlowModify().build();
        reset(test1, test2, test3);
        expect(test1.receive(eq(sw), eq(fm), isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        expect(test2.receive(eq(sw), eq(fm), isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        replay(test1, test2, test3);
        controller.handleMessage(sw, fm, null);
        verify(test1);
        verify(test2);
        verify(test3);
        reset(test1, test2, test3);
        expect(test2.receive(eq(sw), eq(fm), isA(FloodlightContext.class)))
                .andReturn(Command.STOP);
        replay(test1, test2, test3);
        controller.handleMessage(sw, fm, null);
        verify(test1);
        verify(test2);
        verify(test3);
        verify(sw);
    }
    @Test
    public void testHandleMessagesSlave() throws Exception {
        doSetUp(HARole.STANDBY);
        IOFSwitch sw = createMock(IOFSwitch.class);
        expect(sw.getId()).andReturn(DatapathId.NONE).anyTimes();
        IOFMessageListener test1 = createMock(IOFMessageListener.class);
        expect(test1.getName()).andReturn("test1").atLeastOnce();
        expect(test1.isCallbackOrderingPrereq((OFType)anyObject(),
                                              (String)anyObject()))
                .andReturn(false).atLeastOnce();
        expect(test1.isCallbackOrderingPostreq((OFType)anyObject(),
                                               (String)anyObject()))
                .andReturn(false).atLeastOnce();
        replay(test1, sw);
        controller.addOFMessageListener(OFType.PACKET_IN, test1);
        controller.handleMessage(sw, pi, null);
        verify(test1);
        controller.setRole(HARole.ACTIVE, "FooBar");
        reset(test1);
        replay(test1);
        controller.handleMessage(sw, pi, null);
        verify(test1);
        controller.processUpdateQueueForTesting();
        reset(test1);
        expect(test1.receive(eq(sw), eq(pi), isA(FloodlightContext.class))).andReturn(Command.STOP);
        replay(test1);
        controller.handleMessage(sw, pi, null);
        verify(test1);
        verify(sw);
    }
    @Test
    public void testHandleMessageWithContext() throws Exception {
        IOFSwitch sw = createMock(IOFSwitch.class);
        expect(sw.getId()).andReturn(DatapathId.NONE).anyTimes();
        IOFMessageListener test1 = createMock(IOFMessageListener.class);
        expect(test1.getName()).andReturn("test1").anyTimes();
        expect(test1.isCallbackOrderingPrereq((OFType)anyObject(),
                                              (String)anyObject()))
                .andReturn(false).anyTimes();
        expect(test1.isCallbackOrderingPostreq((OFType)anyObject(),
                                               (String)anyObject()))
                .andReturn(false).anyTimes();
        FloodlightContext cntx = new FloodlightContext();
        expect(test1.receive(same(sw), same(pi) , same(cntx)))
                .andReturn(Command.CONTINUE);
        IOFMessageListener test2 = createMock(IOFMessageListener.class);
        expect(test2.getName()).andReturn("test2").anyTimes();
        expect(test2.isCallbackOrderingPrereq((OFType)anyObject(),
                                              (String)anyObject()))
                .andReturn(false).anyTimes();
        expect(test2.isCallbackOrderingPostreq((OFType)anyObject(),
                                               (String)anyObject()))
                .andReturn(false).anyTimes();
        replay(test1, test2, sw);
        controller.addOFMessageListener(OFType.PACKET_IN, test1);
        controller.addOFMessageListener(OFType.ERROR, test2);
        controller.handleMessage(sw, pi, cntx);
        verify(test1, test2, sw);
        Ethernet eth = IFloodlightProviderService.bcStore.get(cntx,
                IFloodlightProviderService.CONTEXT_PI_PAYLOAD);
        assertArrayEquals(testPacket.serialize(), eth.serialize());
    }
    @Test
    public void testHandleOutgoingMessage() throws Exception {
        OFMessage m = factory.buildEchoRequest().build();
        IOFSwitchBackend sw = createMock(IOFSwitchBackend.class);
        expect(sw.getId()).andReturn(DATAPATH_ID_0).anyTimes();
        IOFMessageListener test1 = createMock(IOFMessageListener.class);
        expect(test1.getName()).andReturn("test1").anyTimes();
        setupListenerOrdering(test1);
        IOFMessageListener test2 = createMock(IOFMessageListener.class);
        expect(test2.getName()).andReturn("test2").anyTimes();
        test2.isCallbackOrderingPostreq(OFType.ECHO_REQUEST, "test1");
        expectLastCall().andReturn(true).atLeastOnce();
        setupListenerOrdering(test2);
        IOFMessageListener test3 = createMock(IOFMessageListener.class);
        expect(test3.getName()).andReturn("test3").anyTimes();
        test3.isCallbackOrderingPostreq(OFType.ECHO_REQUEST, "test2");
        expectLastCall().andReturn(true).atLeastOnce();
        setupListenerOrdering(test3);
        replay(test1, test2, test3);
        controller.addOFMessageListener(OFType.ECHO_REQUEST, test1);
        controller.addOFMessageListener(OFType.ECHO_REQUEST, test3);
        controller.addOFMessageListener(OFType.ECHO_REQUEST, test2);
        verify(test1);
        verify(test2);
        verify(test3);
        reset(test1, test2, test3);
        replay(test1, test2, test3, sw);
        try {
            controller.handleOutgoingMessage(null, pi);
            fail("handleOutgoindMessage should have thrown a NPE");
        } catch (NullPointerException e) {
        }
        try {
            controller.handleOutgoingMessage(sw, null);
            fail("handleOutgoingMessage should have thrown a NPE");
        } catch (NullPointerException e) {
        }
        verify(test1);
        verify(test2);
        verify(test3);
        verify(sw);
        reset(test1, test2, test3, sw);
        expect(sw.getId()).andReturn(DATAPATH_ID_0).anyTimes();
        expect(test2.receive(same(sw), same(m) , isA(FloodlightContext.class)))
                .andReturn(Command.STOP);
        expect(test3.receive(same(sw), same(m) , isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        replay(test1, test2, test3, sw);
        controller.handleOutgoingMessage(sw, m);
        verify(test1);
        verify(test2);
        verify(test3);
        verify(sw);
        reset(test1, test2, test3, sw);
        expect(sw.getId()).andReturn(DATAPATH_ID_0).anyTimes();
        expect(test2.receive(same(sw), same(m) , isA(FloodlightContext.class)))
                .andReturn(Command.STOP);
        expect(test3.receive(same(sw), same(m) , isA(FloodlightContext.class)))
                .andReturn(Command.CONTINUE);
        replay(test1, test2, test3, sw);
        controller.handleOutgoingMessage(sw, m);
        verify(test1);
        verify(test2);
        verify(test3);
        verify(sw);
        reset(test1, test2, test3, sw);
        replay(test1, test2, test3, sw);
        m = factory.buildEchoReply().build();
        controller.handleOutgoingMessage(sw, m);
        verify(test1);
        verify(test2);
        verify(test3);
        verify(sw);
    }
    @Test
    public void testGetRoleInfoDefault() {
        RoleInfo info = controller.getRoleInfo();
        assertEquals(HARole.ACTIVE, info.getRole());
        assertNotNull(info.getRoleChangeDescription());
        assertEquals(HARole.ACTIVE, controller.getRole());
    }
    @Test
    public void testChannelHandlerMaster() {
    	OFSwitchHandshakeHandler h = createMock(OFSwitchHandshakeHandler.class);
        reset(h);
        h.sendRoleRequestIfNotPending(OFControllerRole.ROLE_MASTER);
        replay(h);
        controller.reassertRole(h, HARole.ACTIVE);
        verify(h);
        reset(h);
        replay(h);
        controller.reassertRole(h, HARole.STANDBY);
        verify(h);
    }
    @Test
    public void testSetRole() throws Exception {
    	doSetUp(HARole.STANDBY);
        RoleInfo info = controller.getRoleInfo();
        assertEquals(HARole.STANDBY, info.getRole());
        assertEquals(HARole.STANDBY, controller.getRole());
        OFSwitchHandshakeHandler h = createMock(OFSwitchHandshakeHandler.class);
        reset(h);
        h.sendRoleRequestIfNotPending(OFControllerRole.ROLE_SLAVE);
        replay(h);
        controller.reassertRole(h, HARole.STANDBY);
        verify(h);
        reset(h);
        replay(h);
        controller.reassertRole(h, HARole.ACTIVE);
        verify(h);
        IHAListener listener = createMock(IHAListener.class);
        expect(listener.getName()).andReturn("foo").anyTimes();
        setupListenerOrdering(listener);
        listener.transitionToActive();
        expectLastCall().once();
        replay(listener);
        controller.addHAListener(listener);
        controller.setRole(HARole.ACTIVE, "FooBar");
        controller.processUpdateQueueForTesting();
        verify(listener);
        info = controller.getRoleInfo();
        assertEquals(HARole.ACTIVE, info.getRole());
        assertEquals("FooBar", info.getRoleChangeDescription());
        assertEquals(HARole.ACTIVE, controller.getRole());
    }
    @Test
    public void testSetRoleOthercases() throws Exception {
    	doSetUp(HARole.STANDBY);
        IHAListener listener = createMock(IHAListener.class);
        expect(listener.getName()).andReturn("foo").anyTimes();
        setupListenerOrdering(listener);
        replay(listener);
        controller.addHAListener(listener);
        controller.setRole(HARole.STANDBY, "FooBar");
        controller.processUpdateQueueForTesting();
        verify(listener);
        reset(listener);
        expect(listener.getName()).andReturn("foo").anyTimes();
        listener.transitionToActive();
        expectLastCall().once();
        replay(listener);
    }
    @Test
    public void testSetRoleNPE() {
        try {
            controller.setRole(null, "");
            fail("Should have thrown an Exception");
        }
        catch (NullPointerException e) {
        }
        try {
            controller.setRole(HARole.ACTIVE, null);
            fail("Should have thrown an Exception");
        }
        catch (NullPointerException e) {
        }
    }
}
