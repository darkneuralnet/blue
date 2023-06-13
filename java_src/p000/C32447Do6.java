package p000;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.FormatException;
/* renamed from: Do6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32447Do6 {

    /* renamed from: e */
    public static final int[] f6367e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C32447Do6[] f6368f = m109914b();

    /* renamed from: a */
    public final int f6369a;

    /* renamed from: b */
    public final int[] f6370b;

    /* renamed from: c */
    public final C1619b[] f6371c;

    /* renamed from: d */
    public final int f6372d;

    /* renamed from: Do6$a */
    /* loaded from: classes6.dex */
    public static final class C1618a {

        /* renamed from: a */
        public final int f6373a;

        /* renamed from: b */
        public final int f6374b;

        public C1618a(int i, int i2) {
            this.f6373a = i;
            this.f6374b = i2;
        }

        /* renamed from: a */
        public int m109905a() {
            return this.f6373a;
        }

        /* renamed from: b */
        public int m109904b() {
            return this.f6374b;
        }
    }

    /* renamed from: Do6$b */
    /* loaded from: classes6.dex */
    public static final class C1619b {

        /* renamed from: a */
        public final int f6375a;

        /* renamed from: b */
        public final C1618a[] f6376b;

        public C1619b(int i, C1618a... c1618aArr) {
            this.f6375a = i;
            this.f6376b = c1618aArr;
        }

        /* renamed from: a */
        public C1618a[] m109903a() {
            return this.f6376b;
        }

        /* renamed from: b */
        public int m109902b() {
            return this.f6375a;
        }

        /* renamed from: c */
        public int m109901c() {
            int i = 0;
            for (C1618a c1618a : this.f6376b) {
                i += c1618a.m109905a();
            }
            return i;
        }

        /* renamed from: d */
        public int m109900d() {
            return this.f6375a * m109901c();
        }
    }

    public C32447Do6(int i, int[] iArr, C1619b... c1619bArr) {
        C1618a[] m109903a;
        this.f6369a = i;
        this.f6370b = iArr;
        this.f6371c = c1619bArr;
        int m109902b = c1619bArr[0].m109902b();
        int i2 = 0;
        for (C1618a c1618a : c1619bArr[0].m109903a()) {
            i2 += c1618a.m109905a() * (c1618a.m109904b() + m109902b);
        }
        this.f6372d = i2;
    }

    /* renamed from: b */
    public static C32447Do6[] m109914b() {
        return new C32447Do6[]{new C32447Do6(1, new int[0], new C1619b(7, new C1618a(1, 19)), new C1619b(10, new C1618a(1, 16)), new C1619b(13, new C1618a(1, 13)), new C1619b(17, new C1618a(1, 9))), new C32447Do6(2, new int[]{6, 18}, new C1619b(10, new C1618a(1, 34)), new C1619b(16, new C1618a(1, 28)), new C1619b(22, new C1618a(1, 22)), new C1619b(28, new C1618a(1, 16))), new C32447Do6(3, new int[]{6, 22}, new C1619b(15, new C1618a(1, 55)), new C1619b(26, new C1618a(1, 44)), new C1619b(18, new C1618a(2, 17)), new C1619b(22, new C1618a(2, 13))), new C32447Do6(4, new int[]{6, 26}, new C1619b(20, new C1618a(1, 80)), new C1619b(18, new C1618a(2, 32)), new C1619b(26, new C1618a(2, 24)), new C1619b(16, new C1618a(4, 9))), new C32447Do6(5, new int[]{6, 30}, new C1619b(26, new C1618a(1, 108)), new C1619b(24, new C1618a(2, 43)), new C1619b(18, new C1618a(2, 15), new C1618a(2, 16)), new C1619b(22, new C1618a(2, 11), new C1618a(2, 12))), new C32447Do6(6, new int[]{6, 34}, new C1619b(18, new C1618a(2, 68)), new C1619b(16, new C1618a(4, 27)), new C1619b(24, new C1618a(4, 19)), new C1619b(28, new C1618a(4, 15))), new C32447Do6(7, new int[]{6, 22, 38}, new C1619b(20, new C1618a(2, 78)), new C1619b(18, new C1618a(4, 31)), new C1619b(18, new C1618a(2, 14), new C1618a(4, 15)), new C1619b(26, new C1618a(4, 13), new C1618a(1, 14))), new C32447Do6(8, new int[]{6, 24, 42}, new C1619b(24, new C1618a(2, 97)), new C1619b(22, new C1618a(2, 38), new C1618a(2, 39)), new C1619b(22, new C1618a(4, 18), new C1618a(2, 19)), new C1619b(26, new C1618a(4, 14), new C1618a(2, 15))), new C32447Do6(9, new int[]{6, 26, 46}, new C1619b(30, new C1618a(2, 116)), new C1619b(22, new C1618a(3, 36), new C1618a(2, 37)), new C1619b(20, new C1618a(4, 16), new C1618a(4, 17)), new C1619b(24, new C1618a(4, 12), new C1618a(4, 13))), new C32447Do6(10, new int[]{6, 28, 50}, new C1619b(18, new C1618a(2, 68), new C1618a(2, 69)), new C1619b(26, new C1618a(4, 43), new C1618a(1, 44)), new C1619b(24, new C1618a(6, 19), new C1618a(2, 20)), new C1619b(28, new C1618a(6, 15), new C1618a(2, 16))), new C32447Do6(11, new int[]{6, 30, 54}, new C1619b(20, new C1618a(4, 81)), new C1619b(30, new C1618a(1, 50), new C1618a(4, 51)), new C1619b(28, new C1618a(4, 22), new C1618a(4, 23)), new C1619b(24, new C1618a(3, 12), new C1618a(8, 13))), new C32447Do6(12, new int[]{6, 32, 58}, new C1619b(24, new C1618a(2, 92), new C1618a(2, 93)), new C1619b(22, new C1618a(6, 36), new C1618a(2, 37)), new C1619b(26, new C1618a(4, 20), new C1618a(6, 21)), new C1619b(28, new C1618a(7, 14), new C1618a(4, 15))), new C32447Do6(13, new int[]{6, 34, 62}, new C1619b(26, new C1618a(4, 107)), new C1619b(22, new C1618a(8, 37), new C1618a(1, 38)), new C1619b(24, new C1618a(8, 20), new C1618a(4, 21)), new C1619b(22, new C1618a(12, 11), new C1618a(4, 12))), new C32447Do6(14, new int[]{6, 26, 46, 66}, new C1619b(30, new C1618a(3, 115), new C1618a(1, 116)), new C1619b(24, new C1618a(4, 40), new C1618a(5, 41)), new C1619b(20, new C1618a(11, 16), new C1618a(5, 17)), new C1619b(24, new C1618a(11, 12), new C1618a(5, 13))), new C32447Do6(15, new int[]{6, 26, 48, 70}, new C1619b(22, new C1618a(5, 87), new C1618a(1, 88)), new C1619b(24, new C1618a(5, 41), new C1618a(5, 42)), new C1619b(30, new C1618a(5, 24), new C1618a(7, 25)), new C1619b(24, new C1618a(11, 12), new C1618a(7, 13))), new C32447Do6(16, new int[]{6, 26, 50, 74}, new C1619b(24, new C1618a(5, 98), new C1618a(1, 99)), new C1619b(28, new C1618a(7, 45), new C1618a(3, 46)), new C1619b(24, new C1618a(15, 19), new C1618a(2, 20)), new C1619b(30, new C1618a(3, 15), new C1618a(13, 16))), new C32447Do6(17, new int[]{6, 30, 54, 78}, new C1619b(28, new C1618a(1, 107), new C1618a(5, 108)), new C1619b(28, new C1618a(10, 46), new C1618a(1, 47)), new C1619b(28, new C1618a(1, 22), new C1618a(15, 23)), new C1619b(28, new C1618a(2, 14), new C1618a(17, 15))), new C32447Do6(18, new int[]{6, 30, 56, 82}, new C1619b(30, new C1618a(5, 120), new C1618a(1, 121)), new C1619b(26, new C1618a(9, 43), new C1618a(4, 44)), new C1619b(28, new C1618a(17, 22), new C1618a(1, 23)), new C1619b(28, new C1618a(2, 14), new C1618a(19, 15))), new C32447Do6(19, new int[]{6, 30, 58, 86}, new C1619b(28, new C1618a(3, 113), new C1618a(4, 114)), new C1619b(26, new C1618a(3, 44), new C1618a(11, 45)), new C1619b(26, new C1618a(17, 21), new C1618a(4, 22)), new C1619b(26, new C1618a(9, 13), new C1618a(16, 14))), new C32447Do6(20, new int[]{6, 34, 62, 90}, new C1619b(28, new C1618a(3, 107), new C1618a(5, 108)), new C1619b(26, new C1618a(3, 41), new C1618a(13, 42)), new C1619b(30, new C1618a(15, 24), new C1618a(5, 25)), new C1619b(28, new C1618a(15, 15), new C1618a(10, 16))), new C32447Do6(21, new int[]{6, 28, 50, 72, 94}, new C1619b(28, new C1618a(4, 116), new C1618a(4, 117)), new C1619b(26, new C1618a(17, 42)), new C1619b(28, new C1618a(17, 22), new C1618a(6, 23)), new C1619b(30, new C1618a(19, 16), new C1618a(6, 17))), new C32447Do6(22, new int[]{6, 26, 50, 74, 98}, new C1619b(28, new C1618a(2, 111), new C1618a(7, 112)), new C1619b(28, new C1618a(17, 46)), new C1619b(30, new C1618a(7, 24), new C1618a(16, 25)), new C1619b(24, new C1618a(34, 13))), new C32447Do6(23, new int[]{6, 30, 54, 78, 102}, new C1619b(30, new C1618a(4, 121), new C1618a(5, 122)), new C1619b(28, new C1618a(4, 47), new C1618a(14, 48)), new C1619b(30, new C1618a(11, 24), new C1618a(14, 25)), new C1619b(30, new C1618a(16, 15), new C1618a(14, 16))), new C32447Do6(24, new int[]{6, 28, 54, 80, 106}, new C1619b(30, new C1618a(6, 117), new C1618a(4, 118)), new C1619b(28, new C1618a(6, 45), new C1618a(14, 46)), new C1619b(30, new C1618a(11, 24), new C1618a(16, 25)), new C1619b(30, new C1618a(30, 16), new C1618a(2, 17))), new C32447Do6(25, new int[]{6, 32, 58, 84, 110}, new C1619b(26, new C1618a(8, 106), new C1618a(4, 107)), new C1619b(28, new C1618a(8, 47), new C1618a(13, 48)), new C1619b(30, new C1618a(7, 24), new C1618a(22, 25)), new C1619b(30, new C1618a(22, 15), new C1618a(13, 16))), new C32447Do6(26, new int[]{6, 30, 58, 86, 114}, new C1619b(28, new C1618a(10, 114), new C1618a(2, 115)), new C1619b(28, new C1618a(19, 46), new C1618a(4, 47)), new C1619b(28, new C1618a(28, 22), new C1618a(6, 23)), new C1619b(30, new C1618a(33, 16), new C1618a(4, 17))), new C32447Do6(27, new int[]{6, 34, 62, 90, 118}, new C1619b(30, new C1618a(8, 122), new C1618a(4, 123)), new C1619b(28, new C1618a(22, 45), new C1618a(3, 46)), new C1619b(30, new C1618a(8, 23), new C1618a(26, 24)), new C1619b(30, new C1618a(12, 15), new C1618a(28, 16))), new C32447Do6(28, new int[]{6, 26, 50, 74, 98, 122}, new C1619b(30, new C1618a(3, 117), new C1618a(10, 118)), new C1619b(28, new C1618a(3, 45), new C1618a(23, 46)), new C1619b(30, new C1618a(4, 24), new C1618a(31, 25)), new C1619b(30, new C1618a(11, 15), new C1618a(31, 16))), new C32447Do6(29, new int[]{6, 30, 54, 78, 102, 126}, new C1619b(30, new C1618a(7, 116), new C1618a(7, 117)), new C1619b(28, new C1618a(21, 45), new C1618a(7, 46)), new C1619b(30, new C1618a(1, 23), new C1618a(37, 24)), new C1619b(30, new C1618a(19, 15), new C1618a(26, 16))), new C32447Do6(30, new int[]{6, 26, 52, 78, 104, 130}, new C1619b(30, new C1618a(5, 115), new C1618a(10, 116)), new C1619b(28, new C1618a(19, 47), new C1618a(10, 48)), new C1619b(30, new C1618a(15, 24), new C1618a(25, 25)), new C1619b(30, new C1618a(23, 15), new C1618a(25, 16))), new C32447Do6(31, new int[]{6, 30, 56, 82, 108, 134}, new C1619b(30, new C1618a(13, 115), new C1618a(3, 116)), new C1619b(28, new C1618a(2, 46), new C1618a(29, 47)), new C1619b(30, new C1618a(42, 24), new C1618a(1, 25)), new C1619b(30, new C1618a(23, 15), new C1618a(28, 16))), new C32447Do6(32, new int[]{6, 34, 60, 86, 112, 138}, new C1619b(30, new C1618a(17, 115)), new C1619b(28, new C1618a(10, 46), new C1618a(23, 47)), new C1619b(30, new C1618a(10, 24), new C1618a(35, 25)), new C1619b(30, new C1618a(19, 15), new C1618a(35, 16))), new C32447Do6(33, new int[]{6, 30, 58, 86, 114, 142}, new C1619b(30, new C1618a(17, 115), new C1618a(1, 116)), new C1619b(28, new C1618a(14, 46), new C1618a(21, 47)), new C1619b(30, new C1618a(29, 24), new C1618a(19, 25)), new C1619b(30, new C1618a(11, 15), new C1618a(46, 16))), new C32447Do6(34, new int[]{6, 34, 62, 90, 118, 146}, new C1619b(30, new C1618a(13, 115), new C1618a(6, 116)), new C1619b(28, new C1618a(14, 46), new C1618a(23, 47)), new C1619b(30, new C1618a(44, 24), new C1618a(7, 25)), new C1619b(30, new C1618a(59, 16), new C1618a(1, 17))), new C32447Do6(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C1619b(30, new C1618a(12, 121), new C1618a(7, 122)), new C1619b(28, new C1618a(12, 47), new C1618a(26, 48)), new C1619b(30, new C1618a(39, 24), new C1618a(14, 25)), new C1619b(30, new C1618a(22, 15), new C1618a(41, 16))), new C32447Do6(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C1619b(30, new C1618a(6, 121), new C1618a(14, 122)), new C1619b(28, new C1618a(6, 47), new C1618a(34, 48)), new C1619b(30, new C1618a(46, 24), new C1618a(10, 25)), new C1619b(30, new C1618a(2, 15), new C1618a(64, 16))), new C32447Do6(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C1619b(30, new C1618a(17, 122), new C1618a(4, 123)), new C1619b(28, new C1618a(29, 46), new C1618a(14, 47)), new C1619b(30, new C1618a(49, 24), new C1618a(10, 25)), new C1619b(30, new C1618a(24, 15), new C1618a(46, 16))), new C32447Do6(38, new int[]{6, 32, 58, 84, 110, SyslogConstants.LOG_LOCAL1, 162}, new C1619b(30, new C1618a(4, 122), new C1618a(18, 123)), new C1619b(28, new C1618a(13, 46), new C1618a(32, 47)), new C1619b(30, new C1618a(48, 24), new C1618a(14, 25)), new C1619b(30, new C1618a(42, 15), new C1618a(32, 16))), new C32447Do6(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C1619b(30, new C1618a(20, 117), new C1618a(4, 118)), new C1619b(28, new C1618a(40, 47), new C1618a(7, 48)), new C1619b(30, new C1618a(43, 24), new C1618a(22, 25)), new C1619b(30, new C1618a(10, 15), new C1618a(67, 16))), new C32447Do6(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C1619b(30, new C1618a(19, 118), new C1618a(6, 119)), new C1619b(28, new C1618a(18, 47), new C1618a(31, 48)), new C1619b(30, new C1618a(34, 24), new C1618a(34, 25)), new C1619b(30, new C1618a(20, 15), new C1618a(61, 16)))};
    }

    /* renamed from: c */
    public static C32447Do6 m109913c(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f6367e;
            if (i3 < iArr.length) {
                int i5 = iArr[i3];
                if (i5 == i) {
                    return m109907i(i3 + 7);
                }
                int m9437e = C50138ux1.m9437e(i, i5);
                if (m9437e < i2) {
                    i4 = i3 + 7;
                    i2 = m9437e;
                }
                i3++;
            } else if (i2 <= 3) {
                return m109907i(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C32447Do6 m109909g(int i) throws FormatException {
        if (i % 4 == 1) {
            try {
                return m109907i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.m45945a();
            }
        }
        throw FormatException.m45945a();
    }

    /* renamed from: i */
    public static C32447Do6 m109907i(int i) {
        if (i > 0 && i <= 40) {
            return f6368f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C1837ET m109915a() {
        int m109911e = m109911e();
        C1837ET c1837et = new C1837ET(m109911e);
        c1837et.m108950r(0, 0, 9, 9);
        int i = m109911e - 8;
        c1837et.m108950r(i, 0, 8, 9);
        c1837et.m108950r(0, i, 9, 8);
        int length = this.f6370b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f6370b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if ((i2 != 0 || (i4 != 0 && i4 != length - 1)) && (i2 != length - 1 || i4 != 0)) {
                    c1837et.m108950r(this.f6370b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = m109911e - 17;
        c1837et.m108950r(6, 9, 1, i5);
        c1837et.m108950r(9, 6, i5, 1);
        if (this.f6369a > 6) {
            int i6 = m109911e - 11;
            c1837et.m108950r(i6, 0, 3, 6);
            c1837et.m108950r(0, i6, 6, 3);
        }
        return c1837et;
    }

    /* renamed from: d */
    public int[] m109912d() {
        return this.f6370b;
    }

    /* renamed from: e */
    public int m109911e() {
        return (this.f6369a * 4) + 17;
    }

    /* renamed from: f */
    public C1619b m109910f(EnumC41074fg1 enumC41074fg1) {
        return this.f6371c[enumC41074fg1.ordinal()];
    }

    /* renamed from: h */
    public int m109908h() {
        return this.f6372d;
    }

    /* renamed from: j */
    public int m109906j() {
        return this.f6369a;
    }

    public String toString() {
        return String.valueOf(this.f6369a);
    }
}
