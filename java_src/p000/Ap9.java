package p000;

import java.util.Map;
/* renamed from: Ap9 */
/* loaded from: classes6.dex */
public final class Ap9 {
    /* renamed from: a */
    public static final int m115128a(int i, Object obj, Object obj2) {
        C52437yp9 c52437yp9 = (C52437yp9) obj;
        C50658vp9 c50658vp9 = (C50658vp9) obj2;
        int i2 = 0;
        if (!c52437yp9.isEmpty()) {
            for (Map.Entry entry : c52437yp9.entrySet()) {
                i2 += c50658vp9.m7955a(i, entry.getKey(), entry.getValue());
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final Object m115127b(Object obj, Object obj2) {
        C52437yp9 c52437yp9 = (C52437yp9) obj;
        C52437yp9 c52437yp92 = (C52437yp9) obj2;
        if (!c52437yp92.isEmpty()) {
            if (!c52437yp9.m2506h()) {
                c52437yp9 = c52437yp9.m2509e();
            }
            c52437yp9.m2507g(c52437yp92);
        }
        return c52437yp9;
    }
}
