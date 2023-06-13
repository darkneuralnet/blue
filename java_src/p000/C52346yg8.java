package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* renamed from: yg8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52346yg8 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f120012a;

    public C52346yg8(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f120012a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C52346yg8.class) {
            if (this == obj) {
                return true;
            }
            C52346yg8 c52346yg8 = (C52346yg8) obj;
            if (this.f120012a == c52346yg8.f120012a && get() == c52346yg8.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f120012a;
    }
}
