package p000;

import com.google.zxing.ChecksumException;
/* renamed from: dg1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39889dg1 {

    /* renamed from: a */
    public final C50456vV2 f77024a = C50456vV2.f114169f;

    /* renamed from: a */
    public int m43909a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        C51049wV2 c51049wV2 = new C51049wV2(this.f77024a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int m6777b = c51049wV2.m6777b(this.f77024a.m8591c(i2));
            iArr3[i - i2] = m6777b;
            if (m6777b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C51049wV2 m8590d = this.f77024a.m8590d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int m8591c = this.f77024a.m8591c((iArr.length - 1) - i3);
                C50456vV2 c50456vV2 = this.f77024a;
                m8590d = m8590d.m6772g(new C51049wV2(c50456vV2, new int[]{c50456vV2.m8584j(0, m8591c), 1}));
            }
        }
        C51049wV2[] m43906d = m43906d(this.f77024a.m8592b(i, 1), new C51049wV2(this.f77024a, iArr3), i);
        C51049wV2 c51049wV22 = m43906d[0];
        C51049wV2 c51049wV23 = m43906d[1];
        int[] m43908b = m43908b(c51049wV22);
        int[] m43907c = m43907c(c51049wV23, c51049wV22, m43908b);
        for (int i4 = 0; i4 < m43908b.length; i4++) {
            int length = (iArr.length - 1) - this.f77024a.m8586h(m43908b[i4]);
            if (length >= 0) {
                iArr[length] = this.f77024a.m8584j(iArr[length], m43907c[i4]);
            } else {
                throw ChecksumException.m45946a();
            }
        }
        return m43908b.length;
    }

    /* renamed from: b */
    public final int[] m43908b(C51049wV2 c51049wV2) throws ChecksumException {
        int m6775d = c51049wV2.m6775d();
        int[] iArr = new int[m6775d];
        int i = 0;
        for (int i2 = 1; i2 < this.f77024a.m8589e() && i < m6775d; i2++) {
            if (c51049wV2.m6777b(i2) == 0) {
                iArr[i] = this.f77024a.m8587g(i2);
                i++;
            }
        }
        if (i == m6775d) {
            return iArr;
        }
        throw ChecksumException.m45946a();
    }

    /* renamed from: c */
    public final int[] m43907c(C51049wV2 c51049wV2, C51049wV2 c51049wV22, int[] iArr) {
        int m6775d = c51049wV22.m6775d();
        int[] iArr2 = new int[m6775d];
        for (int i = 1; i <= m6775d; i++) {
            iArr2[m6775d - i] = this.f77024a.m8585i(i, c51049wV22.m6776c(i));
        }
        C51049wV2 c51049wV23 = new C51049wV2(this.f77024a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m8587g = this.f77024a.m8587g(iArr[i2]);
            iArr3[i2] = this.f77024a.m8585i(this.f77024a.m8584j(0, c51049wV2.m6777b(m8587g)), this.f77024a.m8587g(c51049wV23.m6777b(m8587g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    public final C51049wV2[] m43906d(C51049wV2 c51049wV2, C51049wV2 c51049wV22, int i) throws ChecksumException {
        if (c51049wV2.m6775d() < c51049wV22.m6775d()) {
            c51049wV22 = c51049wV2;
            c51049wV2 = c51049wV22;
        }
        C51049wV2 m8588f = this.f77024a.m8588f();
        C51049wV2 m8590d = this.f77024a.m8590d();
        while (true) {
            C51049wV2 c51049wV23 = c51049wV22;
            c51049wV22 = c51049wV2;
            c51049wV2 = c51049wV23;
            C51049wV2 c51049wV24 = m8590d;
            C51049wV2 c51049wV25 = m8588f;
            m8588f = c51049wV24;
            if (c51049wV2.m6775d() >= i / 2) {
                if (!c51049wV2.m6774e()) {
                    C51049wV2 m8588f2 = this.f77024a.m8588f();
                    int m8587g = this.f77024a.m8587g(c51049wV2.m6776c(c51049wV2.m6775d()));
                    while (c51049wV22.m6775d() >= c51049wV2.m6775d() && !c51049wV22.m6774e()) {
                        int m6775d = c51049wV22.m6775d() - c51049wV2.m6775d();
                        int m8585i = this.f77024a.m8585i(c51049wV22.m6776c(c51049wV22.m6775d()), m8587g);
                        m8588f2 = m8588f2.m6778a(this.f77024a.m8592b(m6775d, m8585i));
                        c51049wV22 = c51049wV22.m6769j(c51049wV2.m6771h(m6775d, m8585i));
                    }
                    m8590d = m8588f2.m6772g(m8588f).m6769j(c51049wV25).m6770i();
                } else {
                    throw ChecksumException.m45946a();
                }
            } else {
                int m6776c = m8588f.m6776c(0);
                if (m6776c != 0) {
                    int m8587g2 = this.f77024a.m8587g(m6776c);
                    return new C51049wV2[]{m8588f.m6773f(m8587g2), c51049wV2.m6773f(m8587g2)};
                }
                throw ChecksumException.m45946a();
            }
        }
    }
}
