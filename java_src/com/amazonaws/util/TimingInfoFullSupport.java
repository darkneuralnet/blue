package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
class TimingInfoFullSupport extends TimingInfo {
    private final Map<String, Number> countersByName;
    private final Map<String, List<TimingInfo>> subMeasurementsByName;

    public TimingInfoFullSupport(Long l, long j, Long l2) {
        super(l, j, l2);
        this.subMeasurementsByName = new HashMap();
        this.countersByName = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void addSubMeasurement(String str, TimingInfo timingInfo) {
        List<TimingInfo> list = this.subMeasurementsByName.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.subMeasurementsByName.put(str, list);
        }
        if (timingInfo.isEndTimeKnown()) {
            list.add(timingInfo);
            return;
        }
        Log log = LogFactory.getLog(getClass());
        log.debug("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public Map<String, Number> getAllCounters() {
        return this.countersByName;
    }

    @Override // com.amazonaws.util.TimingInfo
    public List<TimingInfo> getAllSubMeasurements(String str) {
        return this.subMeasurementsByName.get(str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public Number getCounter(String str) {
        return this.countersByName.get(str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo getLastSubMeasurement(String str) {
        List<TimingInfo> list;
        Map<String, List<TimingInfo>> map = this.subMeasurementsByName;
        if (map == null || map.size() == 0 || (list = this.subMeasurementsByName.get(str)) == null || list.size() == 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo getSubMeasurement(String str) {
        return getSubMeasurement(str, 0);
    }

    @Override // com.amazonaws.util.TimingInfo
    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return this.subMeasurementsByName;
    }

    @Override // com.amazonaws.util.TimingInfo
    public void incrementCounter(String str) {
        int i;
        Number counter = getCounter(str);
        if (counter != null) {
            i = counter.intValue();
        } else {
            i = 0;
        }
        setCounter(str, i + 1);
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setCounter(String str, long j) {
        this.countersByName.put(str, Long.valueOf(j));
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo getSubMeasurement(String str, int i) {
        List<TimingInfo> list = this.subMeasurementsByName.get(str);
        if (i < 0 || list == null || list.size() == 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }
}
