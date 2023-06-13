package zendesk.support.requestlist;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes8.dex */
class CancelableCompositeCallback {
    private Set<C52353yh5> zendeskCallbacks = new HashSet();

    public void add(C52353yh5... c52353yh5Arr) {
        for (C52353yh5 c52353yh5 : c52353yh5Arr) {
            add(c52353yh5);
        }
    }

    public void cancel() {
        for (C52353yh5 c52353yh5 : this.zendeskCallbacks) {
            c52353yh5.cancel();
        }
        this.zendeskCallbacks.clear();
    }

    public void add(C52353yh5 c52353yh5) {
        this.zendeskCallbacks.add(c52353yh5);
    }
}
