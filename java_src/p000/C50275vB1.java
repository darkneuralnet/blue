package p000;
/* renamed from: vB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50275vB1 {

    /* renamed from: a */
    public final C49683uB1 f113662a;

    /* renamed from: b */
    public final int[] f113663b;

    public C50275vB1(C49683uB1 c49683uB1, int[] iArr) {
        if (iArr.length != 0) {
            this.f113662a = c49683uB1;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f113663b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f113663b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f113663b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C50275vB1 m9042a(C50275vB1 c50275vB1) {
        if (this.f113662a.equals(c50275vB1.f113662a)) {
            if (m9036g()) {
                return c50275vB1;
            }
            if (c50275vB1.m9036g()) {
                return this;
            }
            int[] iArr = this.f113663b;
            int[] iArr2 = c50275vB1.f113663b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C49683uB1.m10685a(iArr2[i - length], iArr[i]);
            }
            return new C50275vB1(this.f113662a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: b */
    public C50275vB1[] m9041b(C50275vB1 c50275vB1) {
        if (this.f113662a.equals(c50275vB1.f113662a)) {
            if (!c50275vB1.m9036g()) {
                C50275vB1 m10679g = this.f113662a.m10679g();
                int m10678h = this.f113662a.m10678h(c50275vB1.m9039d(c50275vB1.m9037f()));
                C50275vB1 c50275vB12 = this;
                while (c50275vB12.m9037f() >= c50275vB1.m9037f() && !c50275vB12.m9036g()) {
                    int m9037f = c50275vB12.m9037f() - c50275vB1.m9037f();
                    int m10676j = this.f113662a.m10676j(c50275vB12.m9039d(c50275vB12.m9037f()), m10678h);
                    C50275vB1 m9033j = c50275vB1.m9033j(m9037f, m10676j);
                    m10679g = m10679g.m9042a(this.f113662a.m10684b(m9037f, m10676j));
                    c50275vB12 = c50275vB12.m9042a(m9033j);
                }
                return new C50275vB1[]{m10679g, c50275vB12};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: c */
    public int m9040c(int i) {
        if (i == 0) {
            return m9039d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f113663b) {
                i2 = C49683uB1.m10685a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f113663b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = C49683uB1.m10685a(this.f113662a.m10676j(i, i4), this.f113663b[i5]);
        }
        return i4;
    }

    /* renamed from: d */
    public int m9039d(int i) {
        int[] iArr = this.f113663b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: e */
    public int[] m9038e() {
        return this.f113663b;
    }

    /* renamed from: f */
    public int m9037f() {
        return this.f113663b.length - 1;
    }

    /* renamed from: g */
    public boolean m9036g() {
        return this.f113663b[0] == 0;
    }

    /* renamed from: h */
    public C50275vB1 m9035h(int i) {
        if (i == 0) {
            return this.f113662a.m10679g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f113663b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f113662a.m10676j(this.f113663b[i2], i);
        }
        return new C50275vB1(this.f113662a, iArr);
    }

    /* renamed from: i */
    public C50275vB1 m9034i(C50275vB1 c50275vB1) {
        if (this.f113662a.equals(c50275vB1.f113662a)) {
            if (!m9036g() && !c50275vB1.m9036g()) {
                int[] iArr = this.f113663b;
                int length = iArr.length;
                int[] iArr2 = c50275vB1.f113663b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = C49683uB1.m10685a(iArr3[i4], this.f113662a.m10676j(i2, iArr2[i3]));
                    }
                }
                return new C50275vB1(this.f113662a, iArr3);
            }
            return this.f113662a.m10679g();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: j */
    public C50275vB1 m9033j(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f113662a.m10679g();
            }
            int length = this.f113663b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f113662a.m10676j(this.f113663b[i3], i2);
            }
            return new C50275vB1(this.f113662a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m9037f() * 8);
        for (int m9037f = m9037f(); m9037f >= 0; m9037f--) {
            int m9039d = m9039d(m9037f);
            if (m9039d != 0) {
                if (m9039d < 0) {
                    sb.append(" - ");
                    m9039d = -m9039d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m9037f == 0 || m9039d != 1) {
                    int m10677i = this.f113662a.m10677i(m9039d);
                    if (m10677i == 0) {
                        sb.append('1');
                    } else if (m10677i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(m10677i);
                    }
                }
                if (m9037f != 0) {
                    if (m9037f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m9037f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
