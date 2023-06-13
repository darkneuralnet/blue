package zendesk.support;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes8.dex */
public final class RequestUpdates {
    private final Map<String, Integer> requestIds;

    public RequestUpdates(Map<String, Integer> map) {
        if (map == null) {
            this.requestIds = Collections.emptyMap();
        } else {
            this.requestIds = map;
        }
    }

    public Map<String, Integer> getRequestUpdates() {
        return C43505jm0.m29953d(this.requestIds);
    }

    public boolean hasUpdatedRequests() {
        return !this.requestIds.isEmpty();
    }

    public boolean isRequestUnread(String str) {
        return this.requestIds.containsKey(str) && this.requestIds.get(str).intValue() > 0;
    }

    public int totalUpdates() {
        int i = 0;
        for (Integer num : this.requestIds.values()) {
            i += num.intValue();
        }
        return i;
    }
}
