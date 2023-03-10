package net.floodlightcontroller.core.web.serializers;
import java.io.IOException;
import java.util.List;
import net.floodlightcontroller.util.InstructionUtils;
import org.projectfloodlight.openflow.protocol.instruction.OFInstruction;
import org.projectfloodlight.openflow.protocol.instruction.OFInstructionApplyActions;
import org.projectfloodlight.openflow.protocol.instruction.OFInstructionExperimenter;
import org.projectfloodlight.openflow.protocol.instruction.OFInstructionGotoTable;
import org.projectfloodlight.openflow.protocol.instruction.OFInstructionMeter;
import org.projectfloodlight.openflow.protocol.instruction.OFInstructionWriteActions;
import org.projectfloodlight.openflow.protocol.instruction.OFInstructionWriteMetadata;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
public class OFInstructionListSerializer extends JsonSerializer<List<OFInstruction>> {
	@Override
	public void serialize(List<OFInstruction> instructions, JsonGenerator jGen, SerializerProvider serializer) throws IOException,
			JsonProcessingException {
		serializeInstructionList(jGen, instructions);
	}
	public static void serializeInstructionList(JsonGenerator jGen, List<OFInstruction> instructions) throws IOException, JsonProcessingException {
		jGen.writeObjectFieldStart("instructions");
        if (instructions.isEmpty()) {
            jGen.writeStringField("none", "drop");
        } else {
            for (OFInstruction i : instructions) {
                switch (i.getType()) {
                case CLEAR_ACTIONS:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_CLEAR_ACTIONS);
                    break;
                case WRITE_METADATA:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_WRITE_METADATA);
                    jGen.writeNumberField(InstructionUtils.STR_WRITE_METADATA, ((OFInstructionWriteMetadata)i).getMetadata().getValue());
                    jGen.writeNumberField(InstructionUtils.STR_WRITE_METADATA + "_mask", ((OFInstructionWriteMetadata)i).getMetadataMask().getValue());
                    break;
                case EXPERIMENTER:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_EXPERIMENTER);
                    jGen.writeNumberField(InstructionUtils.STR_EXPERIMENTER, ((OFInstructionExperimenter)i).getExperimenter());
                    break;
                case GOTO_TABLE:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_GOTO_TABLE);
                    jGen.writeNumberField(InstructionUtils.STR_GOTO_TABLE, ((OFInstructionGotoTable)i).getTableId().getValue());
                    break;
                case METER:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_GOTO_METER);
                    jGen.writeNumberField(InstructionUtils.STR_GOTO_METER, ((OFInstructionMeter)i).getMeterId());
                    break;
                case APPLY_ACTIONS:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_APPLY_ACTIONS);
                    OFActionListSerializer.serializeActions(jGen, ((OFInstructionApplyActions)i).getActions());
                    break;
                case WRITE_ACTIONS:
                    jGen.writeObjectFieldStart(InstructionUtils.STR_WRITE_ACTIONS);
                    OFActionListSerializer.serializeActions(jGen, ((OFInstructionWriteActions)i).getActions());
                default:
                    break;
}
