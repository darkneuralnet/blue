package zendesk.messaging;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class SingleLiveEvent<T> extends C49882uX2<T> {
    private final AtomicBoolean pending = new AtomicBoolean(false);

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final InterfaceC41056fe3<? super T> interfaceC41056fe3) {
        if (hasActiveObservers()) {
            C33694Ix2.m101447l("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.", new Object[0]);
        }
        super.observe(lifecycleOwner, new InterfaceC41056fe3<T>() { // from class: zendesk.messaging.SingleLiveEvent.1
            @Override // p000.InterfaceC41056fe3
            public void onChanged(T t) {
                if (SingleLiveEvent.this.pending.compareAndSet(true, false)) {
                    interfaceC41056fe3.onChanged(t);
                }
            }
        });
    }

    @Override // p000.C49882uX2, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.pending.set(true);
        super.setValue(t);
    }
}
