package p000;
/* renamed from: N62 */
/* loaded from: classes8.dex */
public class N62 {
    /* renamed from: a */
    public static C52053yB0 m94373a(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9 = c52053yB0.f118922b;
        double d10 = c52053yB02.f118922b;
        if (d9 < d10) {
            d = d9;
        } else {
            d = d10;
        }
        double d11 = c52053yB0.f118923c;
        double d12 = c52053yB02.f118923c;
        if (d11 < d12) {
            d2 = d11;
        } else {
            d2 = d12;
        }
        if (d9 > d10) {
            d3 = d9;
        } else {
            d3 = d10;
        }
        if (d11 > d12) {
            d4 = d11;
        } else {
            d4 = d12;
        }
        double d13 = c52053yB03.f118922b;
        double d14 = c52053yB04.f118922b;
        if (d13 < d14) {
            d5 = d13;
        } else {
            d5 = d14;
        }
        double d15 = c52053yB03.f118923c;
        double d16 = c52053yB04.f118923c;
        if (d15 < d16) {
            d6 = d15;
        } else {
            d6 = d16;
        }
        if (d13 > d14) {
            d7 = d13;
        } else {
            d7 = d14;
        }
        if (d15 > d16) {
            d8 = d15;
        } else {
            d8 = d16;
        }
        if (d <= d5) {
            d = d5;
        }
        if (d3 >= d7) {
            d3 = d7;
        }
        if (d2 <= d6) {
            d2 = d6;
        }
        if (d4 >= d8) {
            d4 = d8;
        }
        double d17 = (d + d3) / 2.0d;
        double d18 = (d2 + d4) / 2.0d;
        double d19 = d9 - d17;
        double d20 = d11 - d18;
        double d21 = d10 - d17;
        double d22 = d12 - d18;
        double d23 = d13 - d17;
        double d24 = d15 - d18;
        double d25 = d14 - d17;
        double d26 = d16 - d18;
        double d27 = d20 - d22;
        double d28 = d21 - d19;
        double d29 = (d19 * d22) - (d21 * d20);
        double d30 = d24 - d26;
        double d31 = d25 - d23;
        double d32 = (d23 * d26) - (d25 * d24);
        double d33 = (d27 * d31) - (d30 * d28);
        double d34 = ((d28 * d32) - (d31 * d29)) / d33;
        double d35 = ((d29 * d30) - (d32 * d27)) / d33;
        if (!Double.isNaN(d34) && !Double.isInfinite(d34) && !Double.isNaN(d35) && !Double.isInfinite(d35)) {
            return new C52053yB0(d34 + d17, d35 + d18);
        }
        return null;
    }
}
