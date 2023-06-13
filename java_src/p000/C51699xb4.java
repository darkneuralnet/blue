package p000;
/* renamed from: xb4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C51699xb4 {
    /* renamed from: a */
    public static int m4964a(double d, double d2) {
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i != 0 || d2 != 0.0d) {
            return i >= 0 ? d2 >= 0.0d ? 0 : 3 : d2 >= 0.0d ? 1 : 2;
        }
        throw new IllegalArgumentException("Cannot compute the quadrant for point ( " + d + ", " + d2 + " )");
    }

    /* renamed from: b */
    public static int m4963b(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        double d = c52053yB02.f118922b;
        double d2 = c52053yB0.f118922b;
        if (d == d2 && c52053yB02.f118923c == c52053yB0.f118923c) {
            throw new IllegalArgumentException("Cannot compute the quadrant for two identical points " + c52053yB0);
        } else if (d >= d2) {
            if (c52053yB02.f118923c >= c52053yB0.f118923c) {
                return 0;
            }
            return 3;
        } else if (c52053yB02.f118923c >= c52053yB0.f118923c) {
            return 1;
        } else {
            return 2;
        }
    }
}
