package p000;

import sun.misc.Unsafe;
/* renamed from: l39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C44276l39 {
    /* renamed from: a */
    public static /* synthetic */ boolean m27979a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
