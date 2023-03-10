package net.floodlightcontroller.perfmon;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import net.floodlightcontroller.core.IOFMessageListener;
@JsonSerialize(using=CumulativeTimeBucketJSONSerializer.class)
public class CumulativeTimeBucket {
    private Map<Integer, OneComponentTime> compStats;
    private long totalPktCnt;
    private long sumSquaredProcTimeNs2;
    private long maxTotalProcTimeNs;
    private long minTotalProcTimeNs;
    private long avgTotalProcTimeNs;
    public long getStartTimeNs() {
        return startTime_ns;
    }
    public long getTotalPktCnt() {
        return totalPktCnt;
    }
    public long getAverageProcTimeNs() {
        return avgTotalProcTimeNs;
    }
    public long getMinTotalProcTimeNs() {
        return minTotalProcTimeNs;
    }
    public long getMaxTotalProcTimeNs() {
        return maxTotalProcTimeNs;
    }
    public long getTotalSigmaProcTimeNs() {
        return sigmaTotalProcTimeNs;
    }
    public int getNumComps() {
        return compStats.values().size();
    }
    public Collection<OneComponentTime> getModules() {
        return compStats.values();
    }
    public CumulativeTimeBucket(List<IOFMessageListener> listeners) {
        compStats = new ConcurrentHashMap<Integer, OneComponentTime>(listeners.size());
        for (IOFMessageListener l : listeners) {
            OneComponentTime oct = new OneComponentTime(l);
            compStats.put(oct.hashCode(), oct);
        }
        startTime_ns = System.nanoTime();
    }
    private void updateSquaredProcessingTime(long curTimeNs) {
        sumSquaredProcTimeNs2 += (Math.pow(curTimeNs, 2));
    }
    public void reset() {
        startTime_ns = System.nanoTime();
        totalPktCnt = 0;
        totalProcTimeNs = 0;
        avgTotalProcTimeNs = 0;
        sumSquaredProcTimeNs2 = 0;
        maxTotalProcTimeNs = Long.MIN_VALUE;
        minTotalProcTimeNs = Long.MAX_VALUE;
        sigmaTotalProcTimeNs = 0;
        for (OneComponentTime oct : compStats.values()) {
            oct.resetAllCounters();
        }
    }
    private void computeSigma() {
        double temp = totalProcTimeNs;
        temp = Math.pow(temp, 2) / totalPktCnt;
        temp = (sumSquaredProcTimeNs2 - temp) / totalPktCnt;
        sigmaTotalProcTimeNs = (long) Math.sqrt(temp);
    }
    public void computeAverages() {
        computeSigma();
        for (OneComponentTime oct : compStats.values()) {
            oct.computeSigma();
        }
    }
    public void updatePerPacketCounters(long procTimeNs) {
        totalPktCnt++;
        totalProcTimeNs += procTimeNs;
        avgTotalProcTimeNs = totalProcTimeNs / totalPktCnt;
        updateSquaredProcessingTime(procTimeNs);
        if (procTimeNs > maxTotalProcTimeNs) {
            maxTotalProcTimeNs = procTimeNs;
        }
        if (procTimeNs < minTotalProcTimeNs) {
            minTotalProcTimeNs = procTimeNs;
        }
    }
    public void updateOneComponent(IOFMessageListener l, long procTimeNs) {
        compStats.get(l.hashCode()).updatePerPacketCounters(procTimeNs);
    }
}