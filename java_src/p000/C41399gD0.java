package p000;

import android.util.Pair;
/* renamed from: gD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41399gD0 {
    private C41399gD0() {
    }

    /* renamed from: a */
    public static Pair<Double, Double> m39869a(double d, double d2) {
        if (Q21.m89097a(A23.class) != null) {
            d = m39868b(d);
            d2 = m39868b(d2);
        }
        return Pair.create(Double.valueOf(d), Double.valueOf(d2));
    }

    /* renamed from: b */
    public static double m39868b(double d) {
        return d >= 0.0d ? d : ((d * 10000.0d) - 1.0d) / 10000.0d;
    }
}
