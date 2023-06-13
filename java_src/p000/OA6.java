package p000;

import com.google.zxing.NotFoundException;
/* renamed from: OA6 */
/* loaded from: classes6.dex */
public final class OA6 {

    /* renamed from: a */
    public final C1837ET f26091a;

    /* renamed from: b */
    public final int f26092b;

    /* renamed from: c */
    public final int f26093c;

    /* renamed from: d */
    public final int f26094d;

    /* renamed from: e */
    public final int f26095e;

    /* renamed from: f */
    public final int f26096f;

    /* renamed from: g */
    public final int f26097g;

    public OA6(C1837ET c1837et) throws NotFoundException {
        this(c1837et, 10, c1837et.m108953o() / 2, c1837et.m108956l() / 2);
    }

    /* renamed from: a */
    public final C40900fN4[] m92674a(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44) {
        float m41471c = c40900fN4.m41471c();
        float m41470d = c40900fN4.m41470d();
        float m41471c2 = c40900fN42.m41471c();
        float m41470d2 = c40900fN42.m41470d();
        float m41471c3 = c40900fN43.m41471c();
        float m41470d3 = c40900fN43.m41470d();
        float m41471c4 = c40900fN44.m41471c();
        float m41470d4 = c40900fN44.m41470d();
        return m41471c < ((float) this.f26093c) / 2.0f ? new C40900fN4[]{new C40900fN4(m41471c4 - 1.0f, m41470d4 + 1.0f), new C40900fN4(m41471c2 + 1.0f, m41470d2 + 1.0f), new C40900fN4(m41471c3 - 1.0f, m41470d3 - 1.0f), new C40900fN4(m41471c + 1.0f, m41470d - 1.0f)} : new C40900fN4[]{new C40900fN4(m41471c4 + 1.0f, m41470d4 + 1.0f), new C40900fN4(m41471c2 + 1.0f, m41470d2 - 1.0f), new C40900fN4(m41471c3 - 1.0f, m41470d3 + 1.0f), new C40900fN4(m41471c - 1.0f, m41470d - 1.0f)};
    }

    /* renamed from: b */
    public final boolean m92673b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f26091a.m108959h(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f26091a.m108959h(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: c */
    public C40900fN4[] m92672c() throws NotFoundException {
        int i = this.f26094d;
        int i2 = this.f26095e;
        int i3 = this.f26097g;
        int i4 = this.f26096f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.f26093c) {
                    z9 = m92673b(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f26093c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z3) && i4 < this.f26092b) {
                        z10 = m92673b(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z3 = true;
                            z8 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f26092b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z4) && i >= 0) {
                            z11 = m92673b(i3, i4, i, false);
                            if (z11) {
                                i--;
                                z4 = true;
                                z8 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean z12 = true;
                        while (true) {
                            if ((z12 || !z6) && i3 >= 0) {
                                z12 = m92673b(i, i2, i3, true);
                                if (z12) {
                                    i3--;
                                    z7 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (!z && z5) {
            int i5 = i2 - i;
            C40900fN4 c40900fN4 = null;
            C40900fN4 c40900fN42 = null;
            for (int i6 = 1; c40900fN42 == null && i6 < i5; i6++) {
                c40900fN42 = m92671d(i, i4 - i6, i + i6, i4);
            }
            if (c40900fN42 != null) {
                C40900fN4 c40900fN43 = null;
                for (int i7 = 1; c40900fN43 == null && i7 < i5; i7++) {
                    c40900fN43 = m92671d(i, i3 + i7, i + i7, i3);
                }
                if (c40900fN43 != null) {
                    C40900fN4 c40900fN44 = null;
                    for (int i8 = 1; c40900fN44 == null && i8 < i5; i8++) {
                        c40900fN44 = m92671d(i2, i3 + i8, i2 - i8, i3);
                    }
                    if (c40900fN44 != null) {
                        for (int i9 = 1; c40900fN4 == null && i9 < i5; i9++) {
                            c40900fN4 = m92671d(i2, i4 - i9, i2 - i9, i4);
                        }
                        if (c40900fN4 != null) {
                            return m92674a(c40900fN4, c40900fN42, c40900fN44, c40900fN43);
                        }
                        throw NotFoundException.m45943a();
                    }
                    throw NotFoundException.m45943a();
                }
                throw NotFoundException.m45943a();
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: d */
    public final C40900fN4 m92671d(float f, float f2, float f3, float f4) {
        int m44341c = C39713dN2.m44341c(C39713dN2.m44343a(f, f2, f3, f4));
        float f5 = m44341c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < m44341c; i++) {
            float f8 = i;
            int m44341c2 = C39713dN2.m44341c((f8 * f6) + f);
            int m44341c3 = C39713dN2.m44341c((f8 * f7) + f2);
            if (this.f26091a.m108959h(m44341c2, m44341c3)) {
                return new C40900fN4(m44341c2, m44341c3);
            }
        }
        return null;
    }

    public OA6(C1837ET c1837et, int i, int i2, int i3) throws NotFoundException {
        this.f26091a = c1837et;
        int m108956l = c1837et.m108956l();
        this.f26092b = m108956l;
        int m108953o = c1837et.m108953o();
        this.f26093c = m108953o;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f26094d = i5;
        int i6 = i2 + i4;
        this.f26095e = i6;
        int i7 = i3 - i4;
        this.f26097g = i7;
        int i8 = i3 + i4;
        this.f26096f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= m108956l || i6 >= m108953o) {
            throw NotFoundException.m45943a();
        }
    }
}
