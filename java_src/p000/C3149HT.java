package p000;

import com.google.zxing.FormatException;
/* renamed from: HT */
/* loaded from: classes6.dex */
public final class C3149HT {

    /* renamed from: a */
    public final C1837ET f13422a;

    /* renamed from: b */
    public final C1837ET f13423b;

    /* renamed from: c */
    public final C32213Co6 f13424c;

    public C3149HT(C1837ET c1837et) throws FormatException {
        int m108956l = c1837et.m108956l();
        if (m108956l >= 8 && m108956l <= 144 && (m108956l & 1) == 0) {
            this.f13424c = m103837j(c1837et);
            C1837ET m103846a = m103846a(c1837et);
            this.f13422a = m103846a;
            this.f13423b = new C1837ET(m103846a.m108953o(), m103846a.m108956l());
            return;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: j */
    public static C32213Co6 m103837j(C1837ET c1837et) throws FormatException {
        return C32213Co6.m111512h(c1837et.m108956l(), c1837et.m108953o());
    }

    /* renamed from: a */
    public final C1837ET m103846a(C1837ET c1837et) {
        int m111514f = this.f13424c.m111514f();
        int m111515e = this.f13424c.m111515e();
        if (c1837et.m108956l() == m111514f) {
            int m111517c = this.f13424c.m111517c();
            int m111518b = this.f13424c.m111518b();
            int i = m111514f / m111517c;
            int i2 = m111515e / m111518b;
            C1837ET c1837et2 = new C1837ET(i2 * m111518b, i * m111517c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * m111517c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * m111518b;
                    for (int i7 = 0; i7 < m111517c; i7++) {
                        int i8 = ((m111517c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < m111518b; i10++) {
                            if (c1837et.m108959h(((m111518b + 2) * i5) + 1 + i10, i8)) {
                                c1837et2.m108951q(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return c1837et2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: b */
    public C32213Co6 m103845b() {
        return this.f13424c;
    }

    /* renamed from: c */
    public byte[] m103844c() throws FormatException {
        byte[] bArr = new byte[this.f13424c.m111513g()];
        int m108956l = this.f13422a.m108956l();
        int m108953o = this.f13422a.m108953o();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == m108956l && i == 0 && !z) {
                bArr[i2] = (byte) m103843d(m108956l, m108953o);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = m108956l - 2;
                if (i3 == i4 && i == 0 && (m108953o & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m103842e(m108956l, m108953o);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == m108956l + 4 && i == 2 && (m108953o & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m103841f(m108956l, m108953o);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (m108953o & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m103840g(m108956l, m108953o);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < m108956l && i >= 0 && !this.f13423b.m108959h(i, i3)) {
                            bArr[i2] = (byte) m103838i(i3, i, m108956l, m108953o);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < m108953o);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m108953o && !this.f13423b.m108959h(i6, i5)) {
                            bArr[i2] = (byte) m103838i(i5, i6, m108956l, m108953o);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= m108956l) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= m108956l && i >= m108953o) {
                break;
            }
        }
        if (i2 == this.f13424c.m111513g()) {
            return bArr;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: d */
    public final int m103843d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m103839h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m103839h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m103839h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m103839h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m103839h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m103839h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m103839h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m103839h(3, i8, i, i2)) {
            return i11 | 1;
        }
        return i11;
    }

    /* renamed from: e */
    public final int m103842e(int i, int i2) {
        int i3 = (m103839h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m103839h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m103839h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m103839h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m103839h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m103839h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m103839h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m103839h(1, i9, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: f */
    public final int m103841f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m103839h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m103839h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m103839h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m103839h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m103839h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m103839h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m103839h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m103839h(1, i5, i, i2)) {
            return i13 | 1;
        }
        return i13;
    }

    /* renamed from: g */
    public final int m103840g(int i, int i2) {
        int i3 = (m103839h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m103839h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m103839h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m103839h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m103839h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m103839h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m103839h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m103839h(3, i7, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: h */
    public final boolean m103839h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f13423b.m108951q(i2, i);
        return this.f13422a.m108959h(i2, i);
    }

    /* renamed from: i */
    public final int m103838i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m103839h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m103839h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m103839h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m103839h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m103839h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m103839h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m103839h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m103839h(i, i2, i3, i4)) {
            return i15 | 1;
        }
        return i15;
    }
}
