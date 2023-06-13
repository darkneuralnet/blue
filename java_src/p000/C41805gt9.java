package p000;

import java.text.SimpleDateFormat;
/* renamed from: gt9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41805gt9 {

    /* renamed from: a */
    public static final Kr9 f84412a;

    /* renamed from: b */
    public static final Kr9 f84413b;

    /* renamed from: c */
    public static final Kr9 f84414c;

    /* renamed from: d */
    public static final ThreadLocal<SimpleDateFormat> f84415d;

    static {
        Ir9 m98218y = Kr9.m98218y();
        m98218y.m101580A(-62135596800L);
        m98218y.m101579y(0);
        f84412a = m98218y.m64021q();
        Ir9 m98218y2 = Kr9.m98218y();
        m98218y2.m101580A(253402300799L);
        m98218y2.m101579y(999999999);
        f84413b = m98218y2.m64021q();
        Ir9 m98218y3 = Kr9.m98218y();
        m98218y3.m101580A(0L);
        m98218y3.m101579y(0);
        f84414c = m98218y3.m64021q();
        f84415d = new C40619et9();
    }

    /* renamed from: a */
    public static Zj9 m37358a(Kr9 kr9, Kr9 kr92) {
        m37357b(kr9);
        m37357b(kr92);
        long m86087c = S19.m86087c(kr92.m98219x(), kr9.m98219x());
        int m98220w = kr92.m98220w();
        int m98220w2 = kr9.m98220w();
        long j = m98220w - m98220w2;
        int i = (int) j;
        if (j == i) {
            return Xs9.m76175b(m86087c, i);
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("overflow: checkedSubtract(");
        sb.append(m98220w);
        sb.append(", ");
        sb.append(m98220w2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    /* renamed from: b */
    public static Kr9 m37357b(Kr9 kr9) {
        long m98219x = kr9.m98219x();
        int m98220w = kr9.m98220w();
        if (m98219x >= -62135596800L && m98219x <= 253402300799L && m98220w >= 0 && m98220w < 1000000000) {
            return kr9;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(m98219x), Integer.valueOf(m98220w)));
    }

    /* renamed from: c */
    public static Kr9 m37356c(long j) {
        return m37355d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    /* renamed from: d */
    public static Kr9 m37355d(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = S19.m86089a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (i + 1000000000);
            j = S19.m86087c(j, 1L);
        }
        Ir9 m98218y = Kr9.m98218y();
        m98218y.m101580A(j);
        m98218y.m101579y(i);
        Kr9 m64021q = m98218y.m64021q();
        m37357b(m64021q);
        return m64021q;
    }
}
