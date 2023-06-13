package p000;
/* renamed from: X70 */
/* loaded from: classes8.dex */
public class X70 {
    private X70() {
    }

    /* renamed from: a */
    public static int m77367a(double d, double d2, double d3, double d4, double d5, double d6) {
        int m77365c = m77365c(d, d2, d3, d4, d5, d6);
        if (m77365c <= 1) {
            return m77365c;
        }
        return JF0.m100916l0(d3).m100936P(-d).m100932Z(JF0.m100916l0(d6).m100936P(-d4)).m100931c0(JF0.m100916l0(d4).m100936P(-d2).m100932Z(JF0.m100916l0(d5).m100936P(-d3))).m100929d0();
    }

    /* renamed from: b */
    public static int m77366b(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        return m77367a(c52053yB0.f118922b, c52053yB0.f118923c, c52053yB02.f118922b, c52053yB02.f118923c, c52053yB03.f118922b, c52053yB03.f118923c);
    }

    /* renamed from: c */
    public static int m77365c(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = (d - d5) * (d4 - d6);
        double d9 = (d2 - d6) * (d3 - d5);
        double d10 = d8 - d9;
        if (d8 > 0.0d) {
            if (d9 <= 0.0d) {
                return m77364d(d10);
            }
            d7 = d8 + d9;
        } else if (d8 < 0.0d) {
            if (d9 >= 0.0d) {
                return m77364d(d10);
            }
            d7 = (-d8) - d9;
        } else {
            return m77364d(d10);
        }
        double d11 = d7 * 1.0E-15d;
        if (d10 < d11 && (-d10) < d11) {
            return 2;
        }
        return m77364d(d10);
    }

    /* renamed from: d */
    public static int m77364d(double d) {
        if (d > 0.0d) {
            return 1;
        }
        return d < 0.0d ? -1 : 0;
    }
}
