package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: i24  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C42482i24 {
    /* renamed from: a */
    public static /* synthetic */ boolean m35337a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
