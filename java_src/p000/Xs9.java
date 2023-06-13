package p000;
/* renamed from: Xs9 */
/* loaded from: classes6.dex */
public final class Xs9 {

    /* renamed from: a */
    public static final Zj9 f44146a;

    /* renamed from: b */
    public static final Zj9 f44147b;

    /* renamed from: c */
    public static final Zj9 f44148c;

    static {
        Sj9 m72599y = Zj9.m72599y();
        m72599y.m84937A(-315576000000L);
        m72599y.m84936y(-999999999);
        f44146a = m72599y.m64021q();
        Sj9 m72599y2 = Zj9.m72599y();
        m72599y2.m84937A(315576000000L);
        m72599y2.m84936y(999999999);
        f44147b = m72599y2.m64021q();
        Sj9 m72599y3 = Zj9.m72599y();
        m72599y3.m84937A(0L);
        m72599y3.m84936y(0);
        f44148c = m72599y3.m64021q();
    }

    /* renamed from: a */
    public static Zj9 m76176a(Zj9 zj9) {
        int i;
        long m72600x = zj9.m72600x();
        int m72601w = zj9.m72601w();
        if (m72600x >= -315576000000L && m72600x <= 315576000000L) {
            long j = m72601w;
            if (j >= -999999999 && j < 1000000000 && ((m72600x >= 0 && m72601w >= 0) || (i <= 0 && m72601w <= 0))) {
                return zj9;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(m72600x), Integer.valueOf(m72601w)));
    }

    /* renamed from: b */
    public static Zj9 m76175b(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = S19.m86089a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - 1000000000);
            j++;
        }
        Sj9 m72599y = Zj9.m72599y();
        m72599y.m84937A(j);
        m72599y.m84936y(i);
        Zj9 m64021q = m72599y.m64021q();
        m76176a(m64021q);
        return m64021q;
    }
}
