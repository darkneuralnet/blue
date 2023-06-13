package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* renamed from: HL6 */
/* loaded from: classes6.dex */
public final class HL6 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f13298a;

    public HL6(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f13298a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == HL6.class) {
            if (this == obj) {
                return true;
            }
            HL6 hl6 = (HL6) obj;
            if (this.f13298a == hl6.f13298a && get() == hl6.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13298a;
    }
}
