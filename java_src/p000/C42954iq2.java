package p000;
/* renamed from: iq2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42954iq2 {
    /* renamed from: a */
    public static double m31763a(EB0 eb0) {
        int size = eb0.size();
        double d = 0.0d;
        int i = 1;
        if (size <= 1) {
            return 0.0d;
        }
        C52053yB0 m109311R = eb0.m109311R();
        eb0.mo1715T(0, m109311R);
        double d2 = m109311R.f118922b;
        double d3 = m109311R.f118923c;
        while (i < size) {
            eb0.mo1715T(i, m109311R);
            double d4 = m109311R.f118922b;
            double d5 = m109311R.f118923c;
            double d6 = d4 - d2;
            double d7 = d5 - d3;
            d += Math.sqrt((d6 * d6) + (d7 * d7));
            i++;
            d2 = d4;
            d3 = d5;
        }
        return d;
    }
}
