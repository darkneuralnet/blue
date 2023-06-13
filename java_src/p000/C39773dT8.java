package p000;

import java.util.Set;
/* renamed from: dT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39773dT8 {
    /* renamed from: a */
    public static int m44223a(Set<?> set) {
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
