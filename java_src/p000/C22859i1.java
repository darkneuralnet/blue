package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: i1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C22859i1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m35391a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
