package zendesk.support.request;

import android.annotation.SuppressLint;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class StateIdMapper implements Serializable {
    private final Map<Long, Long> localToRemote;
    private final Map<Long, Long> remoteToLocal;

    private StateIdMapper(Map<Long, Long> map, Map<Long, Long> map2) {
        this.remoteToLocal = map;
        this.localToRemote = map2;
    }

    public StateIdMapper addIdMapping(Long l, Long l2) {
        this.remoteToLocal.put(l, l2);
        this.localToRemote.put(l2, l);
        return copy();
    }

    public StateIdMapper copy() {
        return new StateIdMapper(C43505jm0.m29953d(this.remoteToLocal), C43505jm0.m29953d(this.localToRemote));
    }

    public Long getLocalId(Long l) {
        return this.remoteToLocal.get(l);
    }

    public Long getRemoteId(Long l) {
        return this.localToRemote.get(l);
    }

    public Set<Long> getRemoteIds() {
        return this.remoteToLocal.keySet();
    }

    public boolean hasLocalId(Long l) {
        return this.remoteToLocal.containsKey(l) && this.localToRemote.containsValue(l);
    }

    public boolean hasRemoteId(Long l) {
        return this.localToRemote.containsKey(l) && this.remoteToLocal.containsValue(l);
    }

    public String toString() {
        return "IdMapper{ remoteToLocal=" + this.remoteToLocal + " localToRemote=" + this.localToRemote + CoreConstants.CURLY_RIGHT;
    }

    @SuppressLint({"UseSparseArrays"})
    public StateIdMapper() {
        this.localToRemote = new HashMap();
        this.remoteToLocal = new HashMap();
    }
}
