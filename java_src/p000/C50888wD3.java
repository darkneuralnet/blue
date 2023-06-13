package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* renamed from: wD3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50888wD3 {

    /* renamed from: a */
    public static final C39889dg1 f115604a = new C39889dg1();

    private C50888wD3() {
    }

    /* renamed from: a */
    public static C50758w00 m7255a(X11 x11) throws NotFoundException {
        int[] m77543j;
        if (x11 == null || (m77543j = x11.m77543j()) == null) {
            return null;
        }
        int m7240p = m7240p(m77543j);
        int i = 0;
        int i2 = 0;
        for (int i3 : m77543j) {
            i2 += m7240p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C36158Tl0[] m78928d = x11.m78928d();
        for (int i4 = 0; i2 > 0 && m78928d[i4] == null; i4++) {
            i2--;
        }
        for (int length = m77543j.length - 1; length >= 0; length--) {
            int i5 = m77543j[length];
            i += m7240p - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = m78928d.length - 1; i > 0 && m78928d[length2] == null; length2--) {
            i--;
        }
        return x11.m78931a().m7583a(i2, i, x11.m77542k());
    }

    /* renamed from: b */
    public static void m7254b(V11 v11, C30789yy[][] c30789yyArr) throws NotFoundException {
        C30789yy c30789yy = c30789yyArr[0][1];
        int[] m2207a = c30789yy.m2207a();
        int m80488j = (v11.m80488j() * v11.m80486l()) - m7238r(v11.m80487k());
        if (m2207a.length == 0) {
            if (m80488j > 0 && m80488j <= 928) {
                c30789yy.m2206b(m80488j);
                return;
            }
            throw NotFoundException.m45943a();
        } else if (m2207a[0] != m80488j) {
            c30789yy.m2206b(m80488j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m7253c(C1837ET c1837et, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        if (z) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (z) {
                    if (i6 < i) {
                        break;
                    }
                    if (z != c1837et.m108959h(i6, i4)) {
                        if (Math.abs(i3 - i6) > 2) {
                            return i3;
                        }
                        i6 += i5;
                    }
                } else {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z != c1837et.m108959h(i6, i4)) {
                        break;
                    }
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    public static boolean m7252d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    public static int m7251e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f115604a.m43909a(iArr, i, iArr2);
        }
        throw ChecksumException.m45946a();
    }

    /* renamed from: f */
    public static C30789yy[][] m7250f(V11 v11) {
        W11[] m80483o;
        C36158Tl0[] m78928d;
        int m83011c;
        C30789yy[][] c30789yyArr = (C30789yy[][]) Array.newInstance(C30789yy.class, v11.m80486l(), v11.m80488j() + 2);
        for (C30789yy[] c30789yyArr2 : c30789yyArr) {
            int i = 0;
            while (true) {
                if (i < c30789yyArr2.length) {
                    c30789yyArr2[i] = new C30789yy();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (W11 w11 : v11.m80483o()) {
            if (w11 != null) {
                for (C36158Tl0 c36158Tl0 : w11.m78928d()) {
                    if (c36158Tl0 != null && (m83011c = c36158Tl0.m83011c()) >= 0 && m83011c < c30789yyArr.length) {
                        c30789yyArr[m83011c][i2].m2206b(c36158Tl0.m83009e());
                    }
                }
            }
            i2++;
        }
        return c30789yyArr;
    }

    /* renamed from: g */
    public static HV0 m7249g(V11 v11) throws FormatException, ChecksumException, NotFoundException {
        C30789yy[][] m7250f = m7250f(v11);
        m7254b(v11, m7250f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[v11.m80486l() * v11.m80488j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < v11.m80486l(); i++) {
            int i2 = 0;
            while (i2 < v11.m80488j()) {
                int i3 = i2 + 1;
                int[] m2207a = m7250f[i][i3].m2207a();
                int m80488j = (v11.m80488j() * i) + i2;
                if (m2207a.length == 0) {
                    arrayList.add(Integer.valueOf(m80488j));
                } else if (m2207a.length == 1) {
                    iArr[m80488j] = m2207a[0];
                } else {
                    arrayList3.add(Integer.valueOf(m80488j));
                    arrayList2.add(m2207a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m7248h(v11.m80487k(), iArr, C47332qD3.m17896b(arrayList), C47332qD3.m17896b(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static HV0 m7248h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m7246j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw ChecksumException.m45946a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.m45946a();
                    }
                }
            } else {
                throw ChecksumException.m45946a();
            }
        }
    }

    /* renamed from: i */
    public static HV0 m7247i(C1837ET c1837et, C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44, int i, int i2) throws NotFoundException, FormatException, ChecksumException {
        boolean z;
        int i3;
        W11 x11;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        X11 x112 = null;
        X11 x113 = null;
        V11 v11 = null;
        C50758w00 c50758w00 = new C50758w00(c1837et, c40900fN4, c40900fN42, c40900fN43, c40900fN44);
        for (int i8 = 0; i8 < 2; i8++) {
            if (c40900fN4 != null) {
                x112 = m7237s(c1837et, c50758w00, c40900fN4, true, i, i2);
            }
            if (c40900fN43 != null) {
                x113 = m7237s(c1837et, c50758w00, c40900fN43, false, i, i2);
            }
            v11 = m7234v(x112, x113);
            if (v11 != null) {
                if (i8 == 0 && v11.m80485m() != null && (v11.m80485m().m7577g() < c50758w00.m7577g() || v11.m80485m().m7579e() > c50758w00.m7579e())) {
                    c50758w00 = v11.m80485m();
                } else {
                    v11.m80482p(c50758w00);
                    break;
                }
            } else {
                throw NotFoundException.m45943a();
            }
        }
        int m80488j = v11.m80488j() + 1;
        v11.m80481q(0, x112);
        v11.m80481q(m80488j, x113);
        if (x112 != null) {
            z = true;
        } else {
            z = false;
        }
        int i9 = i;
        int i10 = i2;
        for (int i11 = 1; i11 <= m80488j; i11++) {
            if (z) {
                i3 = i11;
            } else {
                i3 = m80488j - i11;
            }
            if (v11.m80484n(i3) == null) {
                if (i3 != 0 && i3 != m80488j) {
                    x11 = new W11(c50758w00);
                } else {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    x11 = new X11(c50758w00, z2);
                }
                v11.m80481q(i3, x11);
                int i12 = -1;
                int m7577g = c50758w00.m7577g();
                int i13 = -1;
                while (m7577g <= c50758w00.m7579e()) {
                    int m7236t = m7236t(v11, i3, m7577g, z);
                    if (m7236t >= 0 && m7236t <= c50758w00.m7580d()) {
                        i7 = m7236t;
                    } else if (i13 != i12) {
                        i7 = i13;
                    } else {
                        i4 = i13;
                        i5 = m7577g;
                        i6 = i12;
                        i13 = i4;
                        m7577g = i5 + 1;
                        i12 = i6;
                    }
                    i4 = i13;
                    int i14 = m7577g;
                    i6 = i12;
                    C36158Tl0 m7245k = m7245k(c1837et, c50758w00.m7578f(), c50758w00.m7580d(), z, i7, i14, i9, i10);
                    i5 = i14;
                    if (m7245k != null) {
                        x11.m78926f(i5, m7245k);
                        i9 = Math.min(i9, m7245k.m83008f());
                        i10 = Math.max(i10, m7245k.m83008f());
                        i13 = i7;
                        m7577g = i5 + 1;
                        i12 = i6;
                    }
                    i13 = i4;
                    m7577g = i5 + 1;
                    i12 = i6;
                }
            }
        }
        return m7249g(v11);
    }

    /* renamed from: j */
    public static HV0 m7246j(int[] iArr, int i, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int m7251e = m7251e(iArr, iArr2, i2);
            m7233w(iArr, i2);
            HV0 m6784b = C51047wV0.m6784b(iArr, String.valueOf(i));
            m6784b.m103813k(Integer.valueOf(m7251e));
            m6784b.m103814j(Integer.valueOf(iArr2.length));
            return m6784b;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: k */
    public static C36158Tl0 m7245k(C1837ET c1837et, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int m19817d;
        int m17897a;
        int m7253c = m7253c(c1837et, i, i2, z, i3, i4);
        int[] m7239q = m7239q(c1837et, i, i2, z, m7253c, i4);
        if (m7239q == null) {
            return null;
        }
        int m44340d = C39713dN2.m44340d(m7239q);
        if (z) {
            i7 = m7253c + m44340d;
        } else {
            for (int i8 = 0; i8 < m7239q.length / 2; i8++) {
                int i9 = m7239q[i8];
                m7239q[i8] = m7239q[(m7239q.length - 1) - i8];
                m7239q[(m7239q.length - 1) - i8] = i9;
            }
            m7253c -= m44340d;
            i7 = m7253c;
        }
        if (!m7252d(m44340d, i5, i6) || (m17897a = C47332qD3.m17897a((m19817d = C46739pD3.m19817d(m7239q)))) == -1) {
            return null;
        }
        return new C36158Tl0(m7253c, i7, m7242n(m19817d), m17897a);
    }

    /* renamed from: l */
    public static C7615Sx m7244l(X11 x11, X11 x112) {
        C7615Sx m77544i;
        C7615Sx m77544i2;
        if (x11 != null && (m77544i = x11.m77544i()) != null) {
            if (x112 != null && (m77544i2 = x112.m77544i()) != null && m77544i.m84588a() != m77544i2.m84588a() && m77544i.m84587b() != m77544i2.m84587b() && m77544i.m84586c() != m77544i2.m84586c()) {
                return null;
            }
            return m77544i;
        } else if (x112 == null) {
            return null;
        } else {
            return x112.m77544i();
        }
    }

    /* renamed from: m */
    public static int[] m7243m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 >= 0) {
                    i2 = i4;
                } else {
                    return iArr;
                }
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    public static int m7242n(int i) {
        return m7241o(m7243m(i));
    }

    /* renamed from: o */
    public static int m7241o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    public static int m7240p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] m7239q(C1837ET c1837et, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        int[] iArr = new int[8];
        if (z) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (z) {
                if (i3 >= i2) {
                    break;
                }
                if (i6 < 8) {
                    break;
                } else if (c1837et.m108959h(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            } else {
                if (i3 < i) {
                    break;
                }
                if (i6 < 8) {
                }
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (i3 != i || i6 != 7) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    public static int m7238r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    public static X11 m7237s(C1837ET c1837et, C50758w00 c50758w00, C40900fN4 c40900fN4, boolean z, int i, int i2) {
        int i3;
        int m83012b;
        X11 x11 = new X11(c50758w00, z);
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i5 = i3;
            int m41471c = (int) c40900fN4.m41471c();
            for (int m41470d = (int) c40900fN4.m41470d(); m41470d <= c50758w00.m7579e() && m41470d >= c50758w00.m7577g(); m41470d += i5) {
                C36158Tl0 m7245k = m7245k(c1837et, 0, c1837et.m108953o(), z, m41471c, m41470d, i, i2);
                if (m7245k != null) {
                    x11.m78926f(m41470d, m7245k);
                    if (z) {
                        m83012b = m7245k.m83010d();
                    } else {
                        m83012b = m7245k.m83012b();
                    }
                    m41471c = m83012b;
                }
            }
        }
        return x11;
    }

    /* renamed from: t */
    public static int m7236t(V11 v11, int i, int i2, boolean z) {
        int i3;
        C36158Tl0 c36158Tl0;
        C36158Tl0[] m78928d;
        int m83010d;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i4 = i - i3;
        if (m7235u(v11, i4)) {
            c36158Tl0 = v11.m80484n(i4).m78930b(i2);
        } else {
            c36158Tl0 = null;
        }
        if (c36158Tl0 != null) {
            if (z) {
                return c36158Tl0.m83012b();
            }
            return c36158Tl0.m83010d();
        }
        C36158Tl0 m78929c = v11.m80484n(i).m78929c(i2);
        if (m78929c != null) {
            if (z) {
                return m78929c.m83010d();
            }
            return m78929c.m83012b();
        }
        if (m7235u(v11, i4)) {
            m78929c = v11.m80484n(i4).m78929c(i2);
        }
        if (m78929c != null) {
            if (z) {
                return m78929c.m83012b();
            }
            return m78929c.m83010d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m7235u(v11, i)) {
                for (C36158Tl0 c36158Tl02 : v11.m80484n(i).m78928d()) {
                    if (c36158Tl02 != null) {
                        if (z) {
                            m83010d = c36158Tl02.m83012b();
                        } else {
                            m83010d = c36158Tl02.m83010d();
                        }
                        return m83010d + (i3 * i5 * (c36158Tl02.m83012b() - c36158Tl02.m83010d()));
                    }
                }
                i5++;
            } else {
                C50758w00 m80485m = v11.m80485m();
                if (z) {
                    return m80485m.m7578f();
                }
                return m80485m.m7580d();
            }
        }
    }

    /* renamed from: u */
    public static boolean m7235u(V11 v11, int i) {
        return i >= 0 && i <= v11.m80488j() + 1;
    }

    /* renamed from: v */
    public static V11 m7234v(X11 x11, X11 x112) throws NotFoundException {
        C7615Sx m7244l;
        if ((x11 == null && x112 == null) || (m7244l = m7244l(x11, x112)) == null) {
            return null;
        }
        return new V11(m7244l, C50758w00.m7574j(m7255a(x11), m7255a(x112)));
    }

    /* renamed from: w */
    public static void m7233w(int[] iArr, int i) throws FormatException {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 <= iArr.length) {
                if (i2 == 0) {
                    if (i < iArr.length) {
                        iArr[0] = iArr.length - i;
                        return;
                    }
                    throw FormatException.m45945a();
                }
                return;
            }
            throw FormatException.m45945a();
        }
        throw FormatException.m45945a();
    }
}
