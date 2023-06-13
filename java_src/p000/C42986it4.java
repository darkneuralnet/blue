package p000;

import com.google.zxing.common.reedsolomon.ReedSolomonException;
/* renamed from: it4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42986it4 {

    /* renamed from: a */
    public final C49683uB1 f91654a;

    public C42986it4(C49683uB1 c49683uB1) {
        this.f91654a = c49683uB1;
    }

    /* renamed from: a */
    public void m31679a(int[] iArr, int i) throws ReedSolomonException {
        C50275vB1 c50275vB1 = new C50275vB1(this.f91654a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C49683uB1 c49683uB1 = this.f91654a;
            int m9040c = c50275vB1.m9040c(c49683uB1.m10683c(c49683uB1.m10682d() + i2));
            iArr2[(i - 1) - i2] = m9040c;
            if (m9040c != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C50275vB1[] m31676d = m31676d(this.f91654a.m10684b(i, 1), new C50275vB1(this.f91654a, iArr2), i);
        C50275vB1 c50275vB12 = m31676d[0];
        C50275vB1 c50275vB13 = m31676d[1];
        int[] m31678b = m31678b(c50275vB12);
        int[] m31677c = m31677c(c50275vB13, m31678b);
        for (int i3 = 0; i3 < m31678b.length; i3++) {
            int length = (iArr.length - 1) - this.f91654a.m10677i(m31678b[i3]);
            if (length >= 0) {
                iArr[length] = C49683uB1.m10685a(iArr[length], m31677c[i3]);
            } else {
                throw new ReedSolomonException("Bad error location");
            }
        }
    }

    /* renamed from: b */
    public final int[] m31678b(C50275vB1 c50275vB1) throws ReedSolomonException {
        int m9037f = c50275vB1.m9037f();
        int i = 0;
        if (m9037f == 1) {
            return new int[]{c50275vB1.m9039d(1)};
        }
        int[] iArr = new int[m9037f];
        for (int i2 = 1; i2 < this.f91654a.m10680f() && i < m9037f; i2++) {
            if (c50275vB1.m9040c(i2) == 0) {
                iArr[i] = this.f91654a.m10678h(i2);
                i++;
            }
        }
        if (i == m9037f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    public final int[] m31677c(C50275vB1 c50275vB1, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m10678h = this.f91654a.m10678h(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int m10676j = this.f91654a.m10676j(iArr[i4], m10678h);
                    if ((m10676j & 1) == 0) {
                        i = m10676j | 1;
                    } else {
                        i = m10676j & (-2);
                    }
                    i3 = this.f91654a.m10676j(i3, i);
                }
            }
            iArr2[i2] = this.f91654a.m10676j(c50275vB1.m9040c(m10678h), this.f91654a.m10678h(i3));
            if (this.f91654a.m10682d() != 0) {
                iArr2[i2] = this.f91654a.m10676j(iArr2[i2], m10678h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final C50275vB1[] m31676d(C50275vB1 c50275vB1, C50275vB1 c50275vB12, int i) throws ReedSolomonException {
        if (c50275vB1.m9037f() < c50275vB12.m9037f()) {
            c50275vB12 = c50275vB1;
            c50275vB1 = c50275vB12;
        }
        C50275vB1 m10679g = this.f91654a.m10679g();
        C50275vB1 m10681e = this.f91654a.m10681e();
        do {
            C50275vB1 c50275vB13 = c50275vB12;
            c50275vB12 = c50275vB1;
            c50275vB1 = c50275vB13;
            C50275vB1 c50275vB14 = m10681e;
            C50275vB1 c50275vB15 = m10679g;
            m10679g = c50275vB14;
            if (c50275vB1.m9037f() >= i / 2) {
                if (!c50275vB1.m9036g()) {
                    C50275vB1 m10679g2 = this.f91654a.m10679g();
                    int m10678h = this.f91654a.m10678h(c50275vB1.m9039d(c50275vB1.m9037f()));
                    while (c50275vB12.m9037f() >= c50275vB1.m9037f() && !c50275vB12.m9036g()) {
                        int m9037f = c50275vB12.m9037f() - c50275vB1.m9037f();
                        int m10676j = this.f91654a.m10676j(c50275vB12.m9039d(c50275vB12.m9037f()), m10678h);
                        m10679g2 = m10679g2.m9042a(this.f91654a.m10684b(m9037f, m10676j));
                        c50275vB12 = c50275vB12.m9042a(c50275vB1.m9033j(m9037f, m10676j));
                    }
                    m10681e = m10679g2.m9034i(m10679g).m9042a(c50275vB15);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int m9039d = m10679g.m9039d(0);
                if (m9039d != 0) {
                    int m10678h2 = this.f91654a.m10678h(m9039d);
                    return new C50275vB1[]{m10679g.m9035h(m10678h2), c50275vB1.m9035h(m10678h2)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (c50275vB12.m9037f() < c50275vB1.m9037f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
