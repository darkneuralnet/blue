package p000;

import ch.qos.logback.core.net.SyslogConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.WriterException;
/* renamed from: pN2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46828pN2 {

    /* renamed from: a */
    public static final int[][] f103593a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int[][] f103594b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int[][] f103595c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, SyslogConstants.LOG_LOCAL1, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    public static final int[][] f103596d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private C46828pN2() {
    }

    /* renamed from: a */
    public static void m19382a(C1027CT c1027ct, EnumC41074fg1 enumC41074fg1, C32447Do6 c32447Do6, int i, G70 g70) throws WriterException {
        m19380c(g70);
        m19379d(c32447Do6, g70);
        m19371l(enumC41074fg1, i, g70);
        m19364s(c32447Do6, g70);
        m19377f(c1027ct, i, g70);
    }

    /* renamed from: b */
    public static int m19381b(int i, int i2) {
        if (i2 != 0) {
            int m19369n = m19369n(i2);
            int i3 = i << (m19369n - 1);
            while (m19369n(i3) >= m19369n) {
                i3 ^= i2 << (m19369n(i3) - m19369n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    public static void m19380c(G70 g70) {
        g70.m105769a((byte) -1);
    }

    /* renamed from: d */
    public static void m19379d(C32447Do6 c32447Do6, G70 g70) throws WriterException {
        m19373j(g70);
        m19378e(g70);
        m19365r(c32447Do6, g70);
        m19372k(g70);
    }

    /* renamed from: e */
    public static void m19378e(G70 g70) throws WriterException {
        if (g70.m105768b(8, g70.m105766d() - 8) != 0) {
            g70.m105764f(8, g70.m105766d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: f */
    public static void m19377f(C1027CT c1027ct, int i, G70 g70) throws WriterException {
        boolean z;
        int m105765e = g70.m105765e() - 1;
        int m105766d = g70.m105766d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (m105765e > 0) {
            if (m105765e == 6) {
                m105765e--;
            }
            while (m105766d >= 0 && m105766d < g70.m105766d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = m105765e - i4;
                    if (m19368o(g70.m105768b(i5, m105766d))) {
                        if (i2 < c1027ct.m112213o()) {
                            z = c1027ct.m112217k(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C48597sM2.m14308f(i, i5, m105766d)) {
                            z = !z;
                        }
                        g70.m105763g(i5, m105766d, z);
                    }
                }
                m105766d += i3;
            }
            i3 = -i3;
            m105766d += i3;
            m105765e -= 2;
        }
        if (i2 == c1027ct.m112213o()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + JsonPointer.SEPARATOR + c1027ct.m112213o());
    }

    /* renamed from: g */
    public static void m19376g(int i, int i2, G70 g70) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (m19368o(g70.m105768b(i4, i2))) {
                g70.m105764f(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: h */
    public static void m19375h(int i, int i2, G70 g70) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f103594b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                g70.m105764f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    public static void m19374i(int i, int i2, G70 g70) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f103593a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                g70.m105764f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    public static void m19373j(G70 g70) throws WriterException {
        int length = f103593a[0].length;
        m19374i(0, 0, g70);
        m19374i(g70.m105765e() - length, 0, g70);
        m19374i(0, g70.m105765e() - length, g70);
        m19376g(0, 7, g70);
        m19376g(g70.m105765e() - 8, 7, g70);
        m19376g(0, g70.m105765e() - 8, g70);
        m19370m(7, 0, g70);
        m19370m((g70.m105766d() - 7) - 1, 0, g70);
        m19370m(7, g70.m105766d() - 7, g70);
    }

    /* renamed from: k */
    public static void m19372k(G70 g70) {
        int i = 8;
        while (i < g70.m105765e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m19368o(g70.m105768b(i, 6))) {
                g70.m105764f(i, 6, i3);
            }
            if (m19368o(g70.m105768b(6, i))) {
                g70.m105764f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    public static void m19371l(EnumC41074fg1 enumC41074fg1, int i, G70 g70) throws WriterException {
        C1027CT c1027ct = new C1027CT();
        m19367p(enumC41074fg1, i, c1027ct);
        for (int i2 = 0; i2 < c1027ct.m112213o(); i2++) {
            boolean m112217k = c1027ct.m112217k((c1027ct.m112213o() - 1) - i2);
            int[] iArr = f103596d[i2];
            g70.m105763g(iArr[0], iArr[1], m112217k);
            if (i2 < 8) {
                g70.m105763g((g70.m105765e() - i2) - 1, 8, m112217k);
            } else {
                g70.m105763g(8, (g70.m105766d() - 7) + (i2 - 8), m112217k);
            }
        }
    }

    /* renamed from: m */
    public static void m19370m(int i, int i2, G70 g70) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (m19368o(g70.m105768b(i, i4))) {
                g70.m105764f(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: n */
    public static int m19369n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    public static boolean m19368o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    public static void m19367p(EnumC41074fg1 enumC41074fg1, int i, C1027CT c1027ct) throws WriterException {
        if (C45771nb4.m23482b(i)) {
            int m41044b = (enumC41074fg1.m41044b() << 3) | i;
            c1027ct.m112221f(m41044b, 5);
            c1027ct.m112221f(m19381b(m41044b, 1335), 10);
            C1027CT c1027ct2 = new C1027CT();
            c1027ct2.m112221f(21522, 15);
            c1027ct.m112224A(c1027ct2);
            if (c1027ct.m112213o() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + c1027ct.m112213o());
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: q */
    public static void m19366q(C32447Do6 c32447Do6, C1027CT c1027ct) throws WriterException {
        c1027ct.m112221f(c32447Do6.m109906j(), 6);
        c1027ct.m112221f(m19381b(c32447Do6.m109906j(), 7973), 12);
        if (c1027ct.m112213o() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + c1027ct.m112213o());
    }

    /* renamed from: r */
    public static void m19365r(C32447Do6 c32447Do6, G70 g70) {
        if (c32447Do6.m109906j() < 2) {
            return;
        }
        int[] iArr = f103595c[c32447Do6.m109906j() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && m19368o(g70.m105768b(i2, i))) {
                        m19375h(i2 - 2, i - 2, g70);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static void m19364s(C32447Do6 c32447Do6, G70 g70) throws WriterException {
        if (c32447Do6.m109906j() < 7) {
            return;
        }
        C1027CT c1027ct = new C1027CT();
        m19366q(c32447Do6, c1027ct);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean m112217k = c1027ct.m112217k(i);
                i--;
                g70.m105763g(i2, (g70.m105766d() - 11) + i3, m112217k);
                g70.m105763g((g70.m105766d() - 11) + i3, i2, m112217k);
            }
        }
    }
}
