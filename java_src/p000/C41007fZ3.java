package p000;
/* renamed from: fZ3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41007fZ3 {

    /* renamed from: a */
    public static int f80322a = 14;

    /* renamed from: a */
    public static double m41177a(C48772sf1 c48772sf1) {
        return C37916aN2.m71518b(Math.abs(c48772sf1.m13871n()), Math.abs(c48772sf1.m13870o()), Math.abs(c48772sf1.m13869p()), Math.abs(c48772sf1.m13868q()));
    }

    /* renamed from: b */
    public static double m41176b(double d, int i) {
        return Math.pow(10.0d, i - ((int) ((Math.log(d) / Math.log(10.0d)) + 1.0d)));
    }

    /* renamed from: c */
    public static double m41175c(double d) {
        return m41176b(d, f80322a);
    }

    /* renamed from: d */
    public static double m41174d(WB1 wb1, WB1 wb12) {
        double m41177a = m41177a(wb1.m78759Z());
        if (wb12 != null) {
            m41177a = Math.max(m41177a, m41177a(wb12.m78759Z()));
        }
        return m41175c(m41177a);
    }
}
