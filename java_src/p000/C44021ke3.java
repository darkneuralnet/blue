package p000;
/* renamed from: ke3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44021ke3 {
    private C44021ke3() {
    }

    /* renamed from: a */
    public static int m28706a(double d, double d2) {
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i == 0 && d2 == 0.0d) {
            throw new IllegalArgumentException("Cannot compute the octant for point ( " + d + ", " + d2 + " )");
        }
        double abs = Math.abs(d);
        double abs2 = Math.abs(d2);
        if (i >= 0) {
            if (d2 >= 0.0d) {
                if (abs >= abs2) {
                    return 0;
                }
                return 1;
            } else if (abs >= abs2) {
                return 7;
            } else {
                return 6;
            }
        } else if (d2 >= 0.0d) {
            if (abs >= abs2) {
                return 3;
            }
            return 2;
        } else if (abs >= abs2) {
            return 4;
        } else {
            return 5;
        }
    }

    /* renamed from: b */
    public static int m28705b(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        double d = c52053yB02.f118922b - c52053yB0.f118922b;
        double d2 = c52053yB02.f118923c - c52053yB0.f118923c;
        if (d == 0.0d && d2 == 0.0d) {
            throw new IllegalArgumentException("Cannot compute the octant for two identical points " + c52053yB0);
        }
        return m28706a(d, d2);
    }
}
