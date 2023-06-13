package p000;
/* renamed from: Hm */
/* loaded from: classes8.dex */
public class C3228Hm {
    /* renamed from: a */
    public static double m103442a(EB0 eb0) {
        return Math.abs(m103441b(eb0));
    }

    /* renamed from: b */
    public static double m103441b(EB0 eb0) {
        int size = eb0.size();
        double d = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        C52053yB0 m109311R = eb0.m109311R();
        C52053yB0 m109311R2 = eb0.m109311R();
        C52053yB0 m109311R3 = eb0.m109311R();
        eb0.mo1715T(0, m109311R2);
        eb0.mo1715T(1, m109311R3);
        double d2 = m109311R2.f118922b;
        m109311R3.f118922b -= d2;
        int i = 1;
        while (i < size - 1) {
            m109311R.f118923c = m109311R2.f118923c;
            m109311R2.f118922b = m109311R3.f118922b;
            m109311R2.f118923c = m109311R3.f118923c;
            i++;
            eb0.mo1715T(i, m109311R3);
            m109311R3.f118922b -= d2;
            d += m109311R2.f118922b * (m109311R.f118923c - m109311R3.f118923c);
            d2 = d2;
        }
        return d / 2.0d;
    }
}
