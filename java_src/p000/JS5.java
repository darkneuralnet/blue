package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: JS5 */
/* loaded from: classes6.dex */
public final /* synthetic */ class JS5 {
    /* renamed from: a */
    public static /* synthetic */ boolean m100428a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
