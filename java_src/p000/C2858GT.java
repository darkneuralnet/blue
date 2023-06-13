package p000;

import com.google.zxing.FormatException;
/* renamed from: GT */
/* loaded from: classes6.dex */
public final class C2858GT {

    /* renamed from: a */
    public final C1837ET f11952a;

    /* renamed from: b */
    public C32447Do6 f11953b;

    /* renamed from: c */
    public C50138ux1 f11954c;

    /* renamed from: d */
    public boolean f11955d;

    public C2858GT(C1837ET c1837et) throws FormatException {
        int m108956l = c1837et.m108956l();
        if (m108956l >= 21 && (m108956l & 3) == 1) {
            this.f11952a = c1837et;
            return;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: a */
    public final int m105079a(int i, int i2, int i3) {
        return this.f11955d ? this.f11952a.m108959h(i2, i) : this.f11952a.m108959h(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: b */
    public void m105078b() {
        int i = 0;
        while (i < this.f11952a.m108953o()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f11952a.m108956l(); i3++) {
                if (this.f11952a.m108959h(i, i3) != this.f11952a.m108959h(i3, i)) {
                    this.f11952a.m108960g(i3, i);
                    this.f11952a.m108960g(i, i3);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public byte[] m105077c() throws FormatException {
        int i;
        C50138ux1 m105076d = m105076d();
        C32447Do6 m105075e = m105075e();
        LS0 ls0 = LS0.values()[m105076d.m9439c()];
        int m108956l = this.f11952a.m108956l();
        ls0.m96934b(this.f11952a, m108956l);
        C1837ET m109915a = m105075e.m109915a();
        byte[] bArr = new byte[m105075e.m109908h()];
        int i2 = m108956l - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < m108956l; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!m109915a.m108959h(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f11952a.m108959h(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == m105075e.m109908h()) {
            return bArr;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: d */
    public C50138ux1 m105076d() throws FormatException {
        C50138ux1 c50138ux1 = this.f11954c;
        if (c50138ux1 != null) {
            return c50138ux1;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m105079a(i3, 8, i2);
        }
        int m105079a = m105079a(8, 7, m105079a(8, 8, m105079a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m105079a = m105079a(8, i4, m105079a);
        }
        int m108956l = this.f11952a.m108956l();
        int i5 = m108956l - 7;
        for (int i6 = m108956l - 1; i6 >= i5; i6--) {
            i = m105079a(8, i6, i);
        }
        for (int i7 = m108956l - 8; i7 < m108956l; i7++) {
            i = m105079a(i7, 8, i);
        }
        C50138ux1 m9441a = C50138ux1.m9441a(m105079a, i);
        this.f11954c = m9441a;
        if (m9441a != null) {
            return m9441a;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: e */
    public C32447Do6 m105075e() throws FormatException {
        C32447Do6 c32447Do6 = this.f11953b;
        if (c32447Do6 != null) {
            return c32447Do6;
        }
        int m108956l = this.f11952a.m108956l();
        int i = (m108956l - 17) / 4;
        if (i <= 6) {
            return C32447Do6.m109907i(i);
        }
        int i2 = m108956l - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = m108956l - 9; i6 >= i2; i6--) {
                i4 = m105079a(i6, i5, i4);
            }
        }
        C32447Do6 m109913c = C32447Do6.m109913c(i4);
        if (m109913c != null && m109913c.m109911e() == m108956l) {
            this.f11953b = m109913c;
            return m109913c;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = m108956l - 9; i8 >= i2; i8--) {
                i3 = m105079a(i7, i8, i3);
            }
        }
        C32447Do6 m109913c2 = C32447Do6.m109913c(i3);
        if (m109913c2 != null && m109913c2.m109911e() == m108956l) {
            this.f11953b = m109913c2;
            return m109913c2;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: f */
    public void m105074f() {
        if (this.f11954c == null) {
            return;
        }
        LS0.values()[this.f11954c.m9439c()].m96934b(this.f11952a, this.f11952a.m108956l());
    }

    /* renamed from: g */
    public void m105073g(boolean z) {
        this.f11953b = null;
        this.f11954c = null;
        this.f11955d = z;
    }
}
