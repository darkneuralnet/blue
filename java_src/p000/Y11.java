package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.Typography;
/* renamed from: Y11 */
/* loaded from: classes6.dex */
public final class Y11 {

    /* renamed from: g */
    public static final int[] f44443g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C1837ET f44444a;

    /* renamed from: b */
    public boolean f44445b;

    /* renamed from: c */
    public int f44446c;

    /* renamed from: d */
    public int f44447d;

    /* renamed from: e */
    public int f44448e;

    /* renamed from: f */
    public int f44449f;

    /* renamed from: Y11$a */
    /* loaded from: classes6.dex */
    public static final class C9602a {

        /* renamed from: a */
        public final int f44450a;

        /* renamed from: b */
        public final int f44451b;

        public C9602a(int i, int i2) {
            this.f44450a = i;
            this.f44451b = i2;
        }

        /* renamed from: a */
        public int m75829a() {
            return this.f44450a;
        }

        /* renamed from: b */
        public int m75828b() {
            return this.f44451b;
        }

        /* renamed from: c */
        public C40900fN4 m75827c() {
            return new C40900fN4(m75829a(), m75828b());
        }

        public String toString() {
            return "<" + this.f44450a + ' ' + this.f44451b + Typography.greater;
        }
    }

    public Y11(C1837ET c1837et) {
        this.f44444a = c1837et;
    }

    /* renamed from: b */
    public static float m75846b(C9602a c9602a, C9602a c9602a2) {
        return C39713dN2.m44342b(c9602a.m75829a(), c9602a.m75828b(), c9602a2.m75829a(), c9602a2.m75828b());
    }

    /* renamed from: c */
    public static float m75845c(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        return C39713dN2.m44343a(c40900fN4.m41471c(), c40900fN4.m41470d(), c40900fN42.m41471c(), c40900fN42.m41470d());
    }

    /* renamed from: d */
    public static C40900fN4[] m75844d(C40900fN4[] c40900fN4Arr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float m41471c = c40900fN4Arr[0].m41471c() - c40900fN4Arr[2].m41471c();
        float m41470d = c40900fN4Arr[0].m41470d() - c40900fN4Arr[2].m41470d();
        float m41471c2 = (c40900fN4Arr[0].m41471c() + c40900fN4Arr[2].m41471c()) / 2.0f;
        float m41470d2 = (c40900fN4Arr[0].m41470d() + c40900fN4Arr[2].m41470d()) / 2.0f;
        float f2 = m41471c * f;
        float f3 = m41470d * f;
        C40900fN4 c40900fN4 = new C40900fN4(m41471c2 + f2, m41470d2 + f3);
        C40900fN4 c40900fN42 = new C40900fN4(m41471c2 - f2, m41470d2 - f3);
        float m41471c3 = c40900fN4Arr[1].m41471c() - c40900fN4Arr[3].m41471c();
        float m41470d3 = c40900fN4Arr[1].m41470d() - c40900fN4Arr[3].m41470d();
        float m41471c4 = (c40900fN4Arr[1].m41471c() + c40900fN4Arr[3].m41471c()) / 2.0f;
        float m41470d4 = (c40900fN4Arr[1].m41470d() + c40900fN4Arr[3].m41470d()) / 2.0f;
        float f4 = m41471c3 * f;
        float f5 = f * m41470d3;
        return new C40900fN4[]{c40900fN4, new C40900fN4(m41471c4 + f4, m41470d4 + f5), c40900fN42, new C40900fN4(m41471c4 - f4, m41470d4 - f5)};
    }

    /* renamed from: h */
    public static int m75840h(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C42986it4(C49683uB1.f111917k).m31679a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.m45943a();
        }
    }

    /* renamed from: m */
    public static int m75835m(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f44443g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: a */
    public C12188av m75847a(boolean z) throws NotFoundException {
        C40900fN4[] m75842f = m75842f(m75837k());
        if (z) {
            C40900fN4 c40900fN4 = m75842f[0];
            m75842f[0] = m75842f[2];
            m75842f[2] = c40900fN4;
        }
        m75843e(m75842f);
        C1837ET c1837et = this.f44444a;
        int i = this.f44449f;
        return new C12188av(m75831q(c1837et, m75842f[i % 4], m75842f[(i + 1) % 4], m75842f[(i + 2) % 4], m75842f[(i + 3) % 4]), m75836l(m75842f), this.f44445b, this.f44447d, this.f44446c);
    }

    /* renamed from: e */
    public final void m75843e(C40900fN4[] c40900fN4Arr) throws NotFoundException {
        long j;
        long j2;
        if (m75833o(c40900fN4Arr[0]) && m75833o(c40900fN4Arr[1]) && m75833o(c40900fN4Arr[2]) && m75833o(c40900fN4Arr[3])) {
            int i = this.f44448e * 2;
            int[] iArr = {m75830r(c40900fN4Arr[0], c40900fN4Arr[1], i), m75830r(c40900fN4Arr[1], c40900fN4Arr[2], i), m75830r(c40900fN4Arr[2], c40900fN4Arr[3], i), m75830r(c40900fN4Arr[3], c40900fN4Arr[0], i)};
            this.f44449f = m75835m(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f44449f + i2) % 4];
                if (this.f44445b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int m75840h = m75840h(j3, this.f44445b);
            if (this.f44445b) {
                this.f44446c = (m75840h >> 6) + 1;
                this.f44447d = (m75840h & 63) + 1;
                return;
            }
            this.f44446c = (m75840h >> 11) + 1;
            this.f44447d = (m75840h & 2047) + 1;
            return;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: f */
    public final C40900fN4[] m75842f(C9602a c9602a) throws NotFoundException {
        boolean z;
        this.f44448e = 1;
        C9602a c9602a2 = c9602a;
        C9602a c9602a3 = c9602a2;
        C9602a c9602a4 = c9602a3;
        boolean z2 = true;
        while (this.f44448e < 9) {
            C9602a m75838j = m75838j(c9602a, z2, 1, -1);
            C9602a m75838j2 = m75838j(c9602a2, z2, 1, 1);
            C9602a m75838j3 = m75838j(c9602a3, z2, -1, 1);
            C9602a m75838j4 = m75838j(c9602a4, z2, -1, -1);
            if (this.f44448e > 2) {
                double m75846b = (m75846b(m75838j4, m75838j) * this.f44448e) / (m75846b(c9602a4, c9602a) * (this.f44448e + 2));
                if (m75846b < 0.75d || m75846b > 1.25d || !m75832p(m75838j, m75838j2, m75838j3, m75838j4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f44448e++;
            c9602a4 = m75838j4;
            c9602a = m75838j;
            c9602a2 = m75838j2;
            c9602a3 = m75838j3;
        }
        int i = this.f44448e;
        if (i != 5 && i != 7) {
            throw NotFoundException.m45943a();
        }
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f44445b = z;
        C40900fN4[] c40900fN4Arr = {new C40900fN4(c9602a.m75829a() + 0.5f, c9602a.m75828b() - 0.5f), new C40900fN4(c9602a2.m75829a() + 0.5f, c9602a2.m75828b() + 0.5f), new C40900fN4(c9602a3.m75829a() - 0.5f, c9602a3.m75828b() + 0.5f), new C40900fN4(c9602a4.m75829a() - 0.5f, c9602a4.m75828b() - 0.5f)};
        int i2 = this.f44448e;
        return m75844d(c40900fN4Arr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: g */
    public final int m75841g(C9602a c9602a, C9602a c9602a2) {
        float m75846b = m75846b(c9602a, c9602a2);
        float m75829a = (c9602a2.m75829a() - c9602a.m75829a()) / m75846b;
        float m75828b = (c9602a2.m75828b() - c9602a.m75828b()) / m75846b;
        float m75829a2 = c9602a.m75829a();
        float m75828b2 = c9602a.m75828b();
        boolean m108959h = this.f44444a.m108959h(c9602a.m75829a(), c9602a.m75828b());
        int ceil = (int) Math.ceil(m75846b);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            m75829a2 += m75829a;
            m75828b2 += m75828b;
            if (this.f44444a.m108959h(C39713dN2.m44341c(m75829a2), C39713dN2.m44341c(m75828b2)) != m108959h) {
                i++;
            }
        }
        float f = i / m75846b;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        if (z == m108959h) {
            return 1;
        }
        return -1;
    }

    /* renamed from: i */
    public final int m75839i() {
        if (this.f44445b) {
            return (this.f44446c * 4) + 11;
        }
        int i = this.f44446c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    public final C9602a m75838j(C9602a c9602a, boolean z, int i, int i2) {
        int m75829a = c9602a.m75829a() + i;
        int m75828b = c9602a.m75828b();
        while (true) {
            m75828b += i2;
            if (!m75834n(m75829a, m75828b) || this.f44444a.m108959h(m75829a, m75828b) != z) {
                break;
            }
            m75829a += i;
        }
        int i3 = m75829a - i;
        int i4 = m75828b - i2;
        while (m75834n(i3, i4) && this.f44444a.m108959h(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m75834n(i5, i4) && this.f44444a.m108959h(i5, i4) == z) {
            i4 += i2;
        }
        return new C9602a(i5, i4 - i2);
    }

    /* renamed from: k */
    public final C9602a m75837k() {
        C40900fN4 m75827c;
        C40900fN4 c40900fN4;
        C40900fN4 c40900fN42;
        C40900fN4 c40900fN43;
        C40900fN4 m75827c2;
        C40900fN4 m75827c3;
        C40900fN4 m75827c4;
        C40900fN4 m75827c5;
        try {
            C40900fN4[] m92672c = new OA6(this.f44444a).m92672c();
            c40900fN42 = m92672c[0];
            c40900fN43 = m92672c[1];
            c40900fN4 = m92672c[2];
            m75827c = m92672c[3];
        } catch (NotFoundException unused) {
            int m108953o = this.f44444a.m108953o() / 2;
            int m108956l = this.f44444a.m108956l() / 2;
            int i = m108953o + 7;
            int i2 = m108956l - 7;
            C40900fN4 m75827c6 = m75838j(new C9602a(i, i2), false, 1, -1).m75827c();
            int i3 = m108956l + 7;
            C40900fN4 m75827c7 = m75838j(new C9602a(i, i3), false, 1, 1).m75827c();
            int i4 = m108953o - 7;
            C40900fN4 m75827c8 = m75838j(new C9602a(i4, i3), false, -1, 1).m75827c();
            m75827c = m75838j(new C9602a(i4, i2), false, -1, -1).m75827c();
            c40900fN4 = m75827c8;
            c40900fN42 = m75827c6;
            c40900fN43 = m75827c7;
        }
        int m44341c = C39713dN2.m44341c((((c40900fN42.m41471c() + m75827c.m41471c()) + c40900fN43.m41471c()) + c40900fN4.m41471c()) / 4.0f);
        int m44341c2 = C39713dN2.m44341c((((c40900fN42.m41470d() + m75827c.m41470d()) + c40900fN43.m41470d()) + c40900fN4.m41470d()) / 4.0f);
        try {
            C40900fN4[] m92672c2 = new OA6(this.f44444a, 15, m44341c, m44341c2).m92672c();
            m75827c2 = m92672c2[0];
            m75827c3 = m92672c2[1];
            m75827c4 = m92672c2[2];
            m75827c5 = m92672c2[3];
        } catch (NotFoundException unused2) {
            int i5 = m44341c + 7;
            int i6 = m44341c2 - 7;
            m75827c2 = m75838j(new C9602a(i5, i6), false, 1, -1).m75827c();
            int i7 = m44341c2 + 7;
            m75827c3 = m75838j(new C9602a(i5, i7), false, 1, 1).m75827c();
            int i8 = m44341c - 7;
            m75827c4 = m75838j(new C9602a(i8, i7), false, -1, 1).m75827c();
            m75827c5 = m75838j(new C9602a(i8, i6), false, -1, -1).m75827c();
        }
        return new C9602a(C39713dN2.m44341c((((m75827c2.m41471c() + m75827c5.m41471c()) + m75827c3.m41471c()) + m75827c4.m41471c()) / 4.0f), C39713dN2.m44341c((((m75827c2.m41470d() + m75827c5.m41470d()) + m75827c3.m41470d()) + m75827c4.m41470d()) / 4.0f));
    }

    /* renamed from: l */
    public final C40900fN4[] m75836l(C40900fN4[] c40900fN4Arr) {
        return m75844d(c40900fN4Arr, this.f44448e * 2, m75839i());
    }

    /* renamed from: n */
    public final boolean m75834n(int i, int i2) {
        return i >= 0 && i < this.f44444a.m108953o() && i2 > 0 && i2 < this.f44444a.m108956l();
    }

    /* renamed from: o */
    public final boolean m75833o(C40900fN4 c40900fN4) {
        return m75834n(C39713dN2.m44341c(c40900fN4.m41471c()), C39713dN2.m44341c(c40900fN4.m41470d()));
    }

    /* renamed from: p */
    public final boolean m75832p(C9602a c9602a, C9602a c9602a2, C9602a c9602a3, C9602a c9602a4) {
        C9602a c9602a5 = new C9602a(c9602a.m75829a() - 3, c9602a.m75828b() + 3);
        C9602a c9602a6 = new C9602a(c9602a2.m75829a() - 3, c9602a2.m75828b() - 3);
        C9602a c9602a7 = new C9602a(c9602a3.m75829a() + 3, c9602a3.m75828b() - 3);
        C9602a c9602a8 = new C9602a(c9602a4.m75829a() + 3, c9602a4.m75828b() + 3);
        int m75841g = m75841g(c9602a8, c9602a5);
        if (m75841g == 0 || m75841g(c9602a5, c9602a6) != m75841g || m75841g(c9602a6, c9602a7) != m75841g || m75841g(c9602a7, c9602a8) != m75841g) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final C1837ET m75831q(C1837ET c1837et, C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44) throws NotFoundException {
        AbstractC40223eE1 m43088b = AbstractC40223eE1.m43088b();
        int m75839i = m75839i();
        float f = m75839i / 2.0f;
        int i = this.f44448e;
        float f2 = f - i;
        float f3 = f + i;
        return m43088b.mo20940c(c1837et, m75839i, m75839i, f2, f2, f3, f2, f3, f3, f2, f3, c40900fN4.m41471c(), c40900fN4.m41470d(), c40900fN42.m41471c(), c40900fN42.m41470d(), c40900fN43.m41471c(), c40900fN43.m41470d(), c40900fN44.m41471c(), c40900fN44.m41470d());
    }

    /* renamed from: r */
    public final int m75830r(C40900fN4 c40900fN4, C40900fN4 c40900fN42, int i) {
        float m75845c = m75845c(c40900fN4, c40900fN42);
        float f = m75845c / i;
        float m41471c = c40900fN4.m41471c();
        float m41470d = c40900fN4.m41470d();
        float m41471c2 = ((c40900fN42.m41471c() - c40900fN4.m41471c()) * f) / m75845c;
        float m41470d2 = (f * (c40900fN42.m41470d() - c40900fN4.m41470d())) / m75845c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f44444a.m108959h(C39713dN2.m44341c((f2 * m41471c2) + m41471c), C39713dN2.m44341c((f2 * m41470d2) + m41470d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
