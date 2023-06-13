package p000;

import java.util.Map;
/* renamed from: Ob7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34905Ob7 {
    /* renamed from: a */
    public static final int m91860a(int i, Object obj, Object obj2) {
        C34671Nb7 c34671Nb7 = (C34671Nb7) obj;
        C34437Mb7 c34437Mb7 = (C34437Mb7) obj2;
        int i2 = 0;
        if (!c34671Nb7.isEmpty()) {
            for (Map.Entry entry : c34671Nb7.entrySet()) {
                i2 += c34437Mb7.m95142a(i, entry.getKey(), entry.getValue());
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final Object m91859b(Object obj, Object obj2) {
        C34671Nb7 c34671Nb7 = (C34671Nb7) obj;
        C34671Nb7 c34671Nb72 = (C34671Nb7) obj2;
        if (!c34671Nb72.isEmpty()) {
            if (!c34671Nb7.m93717h()) {
                c34671Nb7 = c34671Nb7.m93720e();
            }
            c34671Nb7.m93718g(c34671Nb72);
        }
        return c34671Nb7;
    }
}
