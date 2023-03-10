package net.floodlightcontroller.hub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.IFloodlightProviderService;
import net.floodlightcontroller.core.IOFMessageListener;
import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.core.module.IFloodlightService;
import org.projectfloodlight.openflow.protocol.OFFlowAdd;
import org.projectfloodlight.openflow.protocol.OFMessage;
import org.projectfloodlight.openflow.protocol.OFPacketIn;
import org.projectfloodlight.openflow.protocol.OFPacketOut;
import org.projectfloodlight.openflow.protocol.OFType;
import org.projectfloodlight.openflow.protocol.OFVersion;
import org.projectfloodlight.openflow.protocol.action.OFAction;
import org.projectfloodlight.openflow.protocol.action.OFActionOutput;
import org.projectfloodlight.openflow.protocol.match.MatchField;
import org.projectfloodlight.openflow.types.OFBufferId;
import org.projectfloodlight.openflow.types.OFPort;
public class Hub implements IFloodlightModule, IOFMessageListener {
	private enum HubType {USE_PACKET_OUT, USE_FLOW_MOD};
    private IFloodlightProviderService floodlightProvider;
    public void setFloodlightProvider(IFloodlightProviderService floodlightProvider) {
        this.floodlightProvider = floodlightProvider;
    }
    @Override
    public String getName() {
        return Hub.class.getPackage().getName();
    }
    public Command receive(IOFSwitch sw, OFMessage msg, FloodlightContext cntx) {
    	OFMessage outMessage;
    	HubType ht = HubType.USE_PACKET_OUT;
    	switch (ht) {
    	case USE_FLOW_MOD:
            outMessage = createHubFlowMod(sw, msg);
            break;
        default:
    	case USE_PACKET_OUT:
            outMessage = createHubPacketOut(sw, msg);
            break;
    	}
        sw.write(outMessage);
        return Command.CONTINUE;
    }
    private OFMessage createHubFlowMod(IOFSwitch sw, OFMessage msg) {
    	OFPacketIn pi = (OFPacketIn) msg;
        OFFlowAdd.Builder fmb = sw.getOFFactory().buildFlowAdd();
        fmb.setBufferId(pi.getBufferId())
        .setXid(pi.getXid());
        OFActionOutput.Builder actionBuilder = sw.getOFFactory().actions().buildOutput();
        actionBuilder.setPort(OFPort.FLOOD);
        fmb.setActions(Collections.singletonList((OFAction) actionBuilder.build()));
        return fmb.build();
    }
    private OFMessage createHubPacketOut(IOFSwitch sw, OFMessage msg) {
    	OFPacketIn pi = (OFPacketIn) msg;
        OFPacketOut.Builder pob = sw.getOFFactory().buildPacketOut();
        pob.setBufferId(pi.getBufferId()).setXid(pi.getXid()).setInPort((pi.getVersion().compareTo(OFVersion.OF_12) < 0 ? pi.getInPort() : pi.getMatch().get(MatchField.IN_PORT)));
        OFActionOutput.Builder actionBuilder = sw.getOFFactory().actions().buildOutput();
        actionBuilder.setPort(OFPort.FLOOD);
        pob.setActions(Collections.singletonList((OFAction) actionBuilder.build()));
        if (pi.getBufferId() == OFBufferId.NO_BUFFER) {
            byte[] packetData = pi.getData();
            pob.setData(packetData);
        }
        return pob.build();  
    }
    @Override
    public boolean isCallbackOrderingPrereq(OFType type, String name) {
        return false;
    }
    @Override
    public boolean isCallbackOrderingPostreq(OFType type, String name) {
        return false;
    }
    @Override
    public Collection<Class<? extends IFloodlightService>> getModuleServices() {
        return null;
    }
    @Override
    public Map<Class<? extends IFloodlightService>, IFloodlightService>
            getServiceImpls() {
        return null;
    }
    @Override
    public Collection<Class<? extends IFloodlightService>>
            getModuleDependencies() {
        Collection<Class<? extends IFloodlightService>> l = 
                new ArrayList<Class<? extends IFloodlightService>>();
        l.add(IFloodlightProviderService.class);
        return l;
    }
    @Override
    public void init(FloodlightModuleContext context)
            throws FloodlightModuleException {
        floodlightProvider = context.getServiceImpl(IFloodlightProviderService.class);
    }
    @Override
    public void startUp(FloodlightModuleContext context) {
        floodlightProvider.addOFMessageListener(OFType.PACKET_IN, this);
    }
}
