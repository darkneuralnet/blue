package p000;

import java.util.Set;
/* renamed from: sF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48539sF7 {
    /* renamed from: a */
    public static int m14491a(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
