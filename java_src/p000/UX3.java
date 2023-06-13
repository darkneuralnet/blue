package p000;

import java.io.PrintStream;
/* renamed from: UX3 */
/* loaded from: classes8.dex */
public final class UX3 {
    private UX3() {
    }

    /* renamed from: a */
    public static int m81374a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m81373b(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = m81369f(i4, i);
        }
    }

    /* renamed from: c */
    public static int m81372c(int i) {
        PrintStream printStream;
        String str;
        if (i < 0) {
            printStream = System.err;
            str = "The Degree is negative";
        } else if (i <= 31) {
            if (i == 0) {
                return 1;
            }
            int i2 = 1 << (i + 1);
            for (int i3 = (1 << i) + 1; i3 < i2; i3 += 2) {
                if (m81371d(i3)) {
                    return i3;
                }
            }
            return 0;
        } else {
            printStream = System.err;
            str = "The Degree is more then 31";
        }
        printStream.println(str);
        return 0;
    }

    /* renamed from: d */
    public static boolean m81371d(int i) {
        if (i == 0) {
            return false;
        }
        int m81374a = m81374a(i) >>> 1;
        int i2 = 2;
        for (int i3 = 0; i3 < m81374a; i3++) {
            i2 = m81370e(i2, i2, i);
            if (m81373b(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static int m81370e(int i, int i2, int i3) {
        int m81369f = m81369f(i, i3);
        int m81369f2 = m81369f(i2, i3);
        int i4 = 0;
        if (m81369f2 != 0) {
            int m81374a = 1 << m81374a(i3);
            while (m81369f != 0) {
                if (((byte) (m81369f & 1)) == 1) {
                    i4 ^= m81369f2;
                }
                m81369f >>>= 1;
                m81369f2 <<= 1;
                if (m81369f2 >= m81374a) {
                    m81369f2 ^= i3;
                }
            }
        }
        return i4;
    }

    /* renamed from: f */
    public static int m81369f(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m81374a(i) >= m81374a(i2)) {
            i ^= i2 << (m81374a(i) - m81374a(i2));
        }
        return i;
    }
}
