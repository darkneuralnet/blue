package p000;
/* renamed from: G51 */
/* loaded from: classes8.dex */
public class G51 {
    /* renamed from: a */
    public static double m105836a(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        double d = c52053yB02.f118922b;
        double d2 = c52053yB03.f118922b;
        if (d == d2 && c52053yB02.f118923c == c52053yB03.f118923c) {
            return c52053yB0.m3887f(c52053yB02);
        }
        double d3 = c52053yB03.f118923c;
        double d4 = c52053yB02.f118923c;
        double d5 = ((d2 - d) * (d2 - d)) + ((d3 - d4) * (d3 - d4));
        double d6 = c52053yB0.f118922b;
        double d7 = c52053yB0.f118923c;
        double d8 = (((d6 - d) * (d2 - d)) + ((d7 - d4) * (d3 - d4))) / d5;
        if (d8 <= 0.0d) {
            return c52053yB0.m3887f(c52053yB02);
        }
        if (d8 >= 1.0d) {
            return c52053yB0.m3887f(c52053yB03);
        }
        return Math.abs((((d4 - d7) * (d2 - d)) - ((d - d6) * (d3 - d4))) / d5) * Math.sqrt(d5);
    }
}
