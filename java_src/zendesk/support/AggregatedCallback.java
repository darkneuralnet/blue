package zendesk.support;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes8.dex */
public final class AggregatedCallback<T> extends AbstractC44415lI6<T> {
    private final Set<C52353yh5<T>> callbackSet = Collections.synchronizedSet(new HashSet());

    public boolean add(AbstractC44415lI6<T> abstractC44415lI6) {
        boolean isEmpty = this.callbackSet.isEmpty();
        this.callbackSet.add(C52353yh5.m2896a(abstractC44415lI6));
        return isEmpty;
    }

    public void cancel() {
        for (C52353yh5<T> c52353yh5 : this.callbackSet) {
            c52353yh5.cancel();
        }
        this.callbackSet.clear();
    }

    @Override // p000.AbstractC44415lI6
    public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
        for (C52353yh5<T> c52353yh5 : this.callbackSet) {
            c52353yh5.onError(interfaceC48782sg1);
        }
        this.callbackSet.clear();
    }

    @Override // p000.AbstractC44415lI6
    public void onSuccess(T t) {
        for (C52353yh5<T> c52353yh5 : this.callbackSet) {
            c52353yh5.onSuccess(t);
        }
        this.callbackSet.clear();
    }
}
