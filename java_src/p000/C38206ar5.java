package p000;
/* renamed from: ar5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38206ar5 {
    /* renamed from: a */
    public static int m65380a(int i, C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        if (c52053yB0.m3886g(c52053yB02)) {
            return 0;
        }
        int m65378c = m65378c(c52053yB0.f118922b, c52053yB02.f118922b);
        int m65378c2 = m65378c(c52053yB0.f118923c, c52053yB02.f118923c);
        switch (i) {
            case 0:
                return m65379b(m65378c, m65378c2);
            case 1:
                return m65379b(m65378c2, m65378c);
            case 2:
                return m65379b(m65378c2, -m65378c);
            case 3:
                return m65379b(-m65378c, m65378c2);
            case 4:
                return m65379b(-m65378c, -m65378c2);
            case 5:
                return m65379b(-m65378c2, -m65378c);
            case 6:
                return m65379b(-m65378c2, m65378c);
            case 7:
                return m65379b(m65378c, -m65378c2);
            default:
                C4596Ko.m98279f("invalid octant value");
                return 0;
        }
    }

    /* renamed from: b */
    public static int m65379b(int i, int i2) {
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static int m65378c(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d > d2 ? 1 : 0;
    }
}
