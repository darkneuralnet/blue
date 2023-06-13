package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: jP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC43293jP7 extends SR7 {

    /* renamed from: a */
    public final AtomicReference f92691a = new AtomicReference();

    /* renamed from: b */
    public boolean f92692b;

    /* renamed from: g5 */
    public static final Object m30649g5(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // p000.InterfaceC42134hS7
    /* renamed from: W0 */
    public final void mo30653W0(Bundle bundle) {
        synchronized (this.f92691a) {
            this.f92691a.set(bundle);
            this.f92692b = true;
            this.f92691a.notify();
        }
    }

    /* renamed from: d5 */
    public final Bundle m30652d5(long j) {
        Bundle bundle;
        synchronized (this.f92691a) {
            if (!this.f92692b) {
                try {
                    this.f92691a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f92691a.get();
        }
        return bundle;
    }

    /* renamed from: e5 */
    public final Long m30651e5(long j) {
        return (Long) m30649g5(m30652d5(j), Long.class);
    }

    /* renamed from: f5 */
    public final String m30650f5(long j) {
        return (String) m30649g5(m30652d5(j), String.class);
    }
}
