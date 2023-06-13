package p000;

import p000.AbstractC41387gB6;
import p000.C37211Xy0;
import p000.C43042iz0;
import p000.C46610p01;
/* renamed from: Ko6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34085Ko6 extends AbstractC41387gB6 {

    /* renamed from: k */
    public C46610p01 f20245k;

    /* renamed from: l */
    public Y31 f20246l;

    /* renamed from: Ko6$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4600a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20247a;

        static {
            int[] iArr = new int[AbstractC41387gB6.EnumC20782b.values().length];
            f20247a = iArr;
            try {
                iArr[AbstractC41387gB6.EnumC20782b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20247a[AbstractC41387gB6.EnumC20782b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20247a[AbstractC41387gB6.EnumC20782b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C34085Ko6(C43042iz0 c43042iz0) {
        super(c43042iz0);
        C46610p01 c46610p01 = new C46610p01(this);
        this.f20245k = c46610p01;
        this.f20246l = null;
        this.f81756h.f102905e = C46610p01.EnumC27118a.TOP;
        this.f81757i.f102905e = C46610p01.EnumC27118a.BOTTOM;
        c46610p01.f102905e = C46610p01.EnumC27118a.BASELINE;
        this.f81754f = 1;
    }

    @Override // p000.AbstractC41387gB6, p000.InterfaceC44238l01
    /* renamed from: a */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
        Y31 y31;
        float f;
        float m31332x;
        float f2;
        int i;
        C43042iz0 c43042iz0;
        int i2 = C4600a.f20247a[this.f81758j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C43042iz0 c43042iz02 = this.f81750b;
                    m39887n(interfaceC44238l01, c43042iz02.f91871R, c43042iz02.f91875T, 1);
                    return;
                }
            } else {
                m39886o(interfaceC44238l01);
            }
        } else {
            m39885p(interfaceC44238l01);
        }
        Y31 y312 = this.f81753e;
        if (y312.f102903c && !y312.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
            C43042iz0 c43042iz03 = this.f81750b;
            int i3 = c43042iz03.f91929x;
            if (i3 != 2) {
                if (i3 == 3 && c43042iz03.f91891e.f81753e.f102910j) {
                    int m31330y = c43042iz03.m31330y();
                    if (m31330y != -1) {
                        if (m31330y != 0) {
                            if (m31330y != 1) {
                                i = 0;
                                this.f81753e.mo20170d(i);
                            } else {
                                C43042iz0 c43042iz04 = this.f81750b;
                                f = c43042iz04.f91891e.f81753e.f102907g;
                                m31332x = c43042iz04.m31332x();
                            }
                        } else {
                            f2 = c43042iz0.f91891e.f81753e.f102907g * this.f81750b.m31332x();
                            i = (int) (f2 + 0.5f);
                            this.f81753e.mo20170d(i);
                        }
                    } else {
                        C43042iz0 c43042iz05 = this.f81750b;
                        f = c43042iz05.f91891e.f81753e.f102907g;
                        m31332x = c43042iz05.m31332x();
                    }
                    f2 = f / m31332x;
                    i = (int) (f2 + 0.5f);
                    this.f81753e.mo20170d(i);
                }
            } else {
                C43042iz0 m31414M = c43042iz03.m31414M();
                if (m31414M != null) {
                    if (m31414M.f91893f.f81753e.f102910j) {
                        this.f81753e.mo20170d((int) ((y31.f102907g * this.f81750b.f91845E) + 0.5f));
                    }
                }
            }
        }
        C46610p01 c46610p01 = this.f81756h;
        if (c46610p01.f102903c) {
            C46610p01 c46610p012 = this.f81757i;
            if (c46610p012.f102903c) {
                if (c46610p01.f102910j && c46610p012.f102910j && this.f81753e.f102910j) {
                    return;
                }
                if (!this.f81753e.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    C43042iz0 c43042iz06 = this.f81750b;
                    if (c43042iz06.f91927w == 0 && !c43042iz06.m31355m0()) {
                        int i4 = this.f81756h.f102912l.get(0).f102907g;
                        C46610p01 c46610p013 = this.f81756h;
                        int i5 = i4 + c46610p013.f102906f;
                        int i6 = this.f81757i.f102912l.get(0).f102907g + this.f81757i.f102906f;
                        c46610p013.mo20170d(i5);
                        this.f81757i.mo20170d(i6);
                        this.f81753e.mo20170d(i6 - i5);
                        return;
                    }
                }
                if (!this.f81753e.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && this.f81749a == 1 && this.f81756h.f102912l.size() > 0 && this.f81757i.f102912l.size() > 0) {
                    int i7 = (this.f81757i.f102912l.get(0).f102907g + this.f81757i.f102906f) - (this.f81756h.f102912l.get(0).f102907g + this.f81756h.f102906f);
                    Y31 y313 = this.f81753e;
                    int i8 = y313.f44482m;
                    if (i7 < i8) {
                        y313.mo20170d(i7);
                    } else {
                        y313.mo20170d(i8);
                    }
                }
                if (this.f81753e.f102910j && this.f81756h.f102912l.size() > 0 && this.f81757i.f102912l.size() > 0) {
                    C46610p01 c46610p014 = this.f81756h.f102912l.get(0);
                    C46610p01 c46610p015 = this.f81757i.f102912l.get(0);
                    int i9 = c46610p014.f102907g + this.f81756h.f102906f;
                    int i10 = c46610p015.f102907g + this.f81757i.f102906f;
                    float m31401T = this.f81750b.m31401T();
                    if (c46610p014 == c46610p015) {
                        i9 = c46610p014.f102907g;
                        i10 = c46610p015.f102907g;
                        m31401T = 0.5f;
                    }
                    this.f81756h.mo20170d((int) (i9 + 0.5f + (((i10 - i9) - this.f81753e.f102907g) * m31401T)));
                    this.f81757i.mo20170d(this.f81756h.f102907g + this.f81753e.f102907g);
                }
            }
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: d */
    public void mo5648d() {
        C43042iz0 m31414M;
        C43042iz0 m31414M2;
        C43042iz0 c43042iz0 = this.f81750b;
        if (c43042iz0.f91883a) {
            this.f81753e.mo20170d(c43042iz0.m31328z());
        }
        if (!this.f81753e.f102910j) {
            this.f81752d = this.f81750b.m31397V();
            if (this.f81750b.m31385b0()) {
                this.f20246l = new C2694GE(this);
            }
            C43042iz0.EnumC24677b enumC24677b = this.f81752d;
            if (enumC24677b != C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                if (enumC24677b == C43042iz0.EnumC24677b.MATCH_PARENT && (m31414M2 = this.f81750b.m31414M()) != null && m31414M2.m31397V() == C43042iz0.EnumC24677b.FIXED) {
                    int m31328z = (m31414M2.m31328z() - this.f81750b.f91871R.m75997f()) - this.f81750b.f91875T.m75997f();
                    m39894b(this.f81756h, m31414M2.f91893f.f81756h, this.f81750b.f91871R.m75997f());
                    m39894b(this.f81757i, m31414M2.f91893f.f81757i, -this.f81750b.f91875T.m75997f());
                    this.f81753e.mo20170d(m31328z);
                    return;
                } else if (this.f81752d == C43042iz0.EnumC24677b.FIXED) {
                    this.f81753e.mo20170d(this.f81750b.m31328z());
                }
            }
        } else if (this.f81752d == C43042iz0.EnumC24677b.MATCH_PARENT && (m31414M = this.f81750b.m31414M()) != null && m31414M.m31397V() == C43042iz0.EnumC24677b.FIXED) {
            m39894b(this.f81756h, m31414M.f91893f.f81756h, this.f81750b.f91871R.m75997f());
            m39894b(this.f81757i, m31414M.f91893f.f81757i, -this.f81750b.f91875T.m75997f());
            return;
        }
        Y31 y31 = this.f81753e;
        boolean z = y31.f102910j;
        if (z) {
            C43042iz0 c43042iz02 = this.f81750b;
            if (c43042iz02.f91883a) {
                C37211Xy0[] c37211Xy0Arr = c43042iz02.f91881Y;
                C37211Xy0 c37211Xy0 = c37211Xy0Arr[2];
                C37211Xy0 c37211Xy02 = c37211Xy0.f44308f;
                if (c37211Xy02 != null && c37211Xy0Arr[3].f44308f != null) {
                    if (c43042iz02.m31355m0()) {
                        this.f81756h.f102906f = this.f81750b.f91881Y[2].m75997f();
                        this.f81757i.f102906f = -this.f81750b.f91881Y[3].m75997f();
                    } else {
                        C46610p01 m39891h = m39891h(this.f81750b.f91881Y[2]);
                        if (m39891h != null) {
                            m39894b(this.f81756h, m39891h, this.f81750b.f91881Y[2].m75997f());
                        }
                        C46610p01 m39891h2 = m39891h(this.f81750b.f91881Y[3]);
                        if (m39891h2 != null) {
                            m39894b(this.f81757i, m39891h2, -this.f81750b.f91881Y[3].m75997f());
                        }
                        this.f81756h.f102902b = true;
                        this.f81757i.f102902b = true;
                    }
                    if (this.f81750b.m31385b0()) {
                        m39894b(this.f20245k, this.f81756h, this.f81750b.m31345r());
                        return;
                    }
                    return;
                } else if (c37211Xy02 != null) {
                    C46610p01 m39891h3 = m39891h(c37211Xy0);
                    if (m39891h3 != null) {
                        m39894b(this.f81756h, m39891h3, this.f81750b.f91881Y[2].m75997f());
                        m39894b(this.f81757i, this.f81756h, this.f81753e.f102907g);
                        if (this.f81750b.m31385b0()) {
                            m39894b(this.f20245k, this.f81756h, this.f81750b.m31345r());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    C37211Xy0 c37211Xy03 = c37211Xy0Arr[3];
                    if (c37211Xy03.f44308f != null) {
                        C46610p01 m39891h4 = m39891h(c37211Xy03);
                        if (m39891h4 != null) {
                            m39894b(this.f81757i, m39891h4, -this.f81750b.f91881Y[3].m75997f());
                            m39894b(this.f81756h, this.f81757i, -this.f81753e.f102907g);
                        }
                        if (this.f81750b.m31385b0()) {
                            m39894b(this.f20245k, this.f81756h, this.f81750b.m31345r());
                            return;
                        }
                        return;
                    }
                    C37211Xy0 c37211Xy04 = c37211Xy0Arr[4];
                    if (c37211Xy04.f44308f != null) {
                        C46610p01 m39891h5 = m39891h(c37211Xy04);
                        if (m39891h5 != null) {
                            m39894b(this.f20245k, m39891h5, 0);
                            m39894b(this.f81756h, this.f20245k, -this.f81750b.m31345r());
                            m39894b(this.f81757i, this.f81756h, this.f81753e.f102907g);
                            return;
                        }
                        return;
                    } else if (!(c43042iz02 instanceof HL1) && c43042iz02.m31414M() != null && this.f81750b.mo7200q(C37211Xy0.EnumC9561b.CENTER).f44308f == null) {
                        m39894b(this.f81756h, this.f81750b.m31414M().f91893f.f81756h, this.f81750b.m31387a0());
                        m39894b(this.f81757i, this.f81756h, this.f81753e.f102907g);
                        if (this.f81750b.m31385b0()) {
                            m39894b(this.f20245k, this.f81756h, this.f81750b.m31345r());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
            C43042iz0 c43042iz03 = this.f81750b;
            int i = c43042iz03.f91929x;
            if (i != 2) {
                if (i == 3 && !c43042iz03.m31355m0()) {
                    C43042iz0 c43042iz04 = this.f81750b;
                    if (c43042iz04.f91927w != 3) {
                        Y31 y312 = c43042iz04.f91891e.f81753e;
                        this.f81753e.f102912l.add(y312);
                        y312.f102911k.add(this.f81753e);
                        Y31 y313 = this.f81753e;
                        y313.f102902b = true;
                        y313.f102911k.add(this.f81756h);
                        this.f81753e.f102911k.add(this.f81757i);
                    }
                }
            } else {
                C43042iz0 m31414M3 = c43042iz03.m31414M();
                if (m31414M3 != null) {
                    Y31 y314 = m31414M3.f91893f.f81753e;
                    this.f81753e.f102912l.add(y314);
                    y314.f102911k.add(this.f81753e);
                    Y31 y315 = this.f81753e;
                    y315.f102902b = true;
                    y315.f102911k.add(this.f81756h);
                    this.f81753e.f102911k.add(this.f81757i);
                }
            }
        } else {
            y31.m20172b(this);
        }
        C43042iz0 c43042iz05 = this.f81750b;
        C37211Xy0[] c37211Xy0Arr2 = c43042iz05.f91881Y;
        C37211Xy0 c37211Xy05 = c37211Xy0Arr2[2];
        C37211Xy0 c37211Xy06 = c37211Xy05.f44308f;
        if (c37211Xy06 != null && c37211Xy0Arr2[3].f44308f != null) {
            if (c43042iz05.m31355m0()) {
                this.f81756h.f102906f = this.f81750b.f91881Y[2].m75997f();
                this.f81757i.f102906f = -this.f81750b.f91881Y[3].m75997f();
            } else {
                C46610p01 m39891h6 = m39891h(this.f81750b.f91881Y[2]);
                C46610p01 m39891h7 = m39891h(this.f81750b.f91881Y[3]);
                if (m39891h6 != null) {
                    m39891h6.m20172b(this);
                }
                if (m39891h7 != null) {
                    m39891h7.m20172b(this);
                }
                this.f81758j = AbstractC41387gB6.EnumC20782b.CENTER;
            }
            if (this.f81750b.m31385b0()) {
                m39893c(this.f20245k, this.f81756h, 1, this.f20246l);
            }
        } else if (c37211Xy06 != null) {
            C46610p01 m39891h8 = m39891h(c37211Xy05);
            if (m39891h8 != null) {
                m39894b(this.f81756h, m39891h8, this.f81750b.f91881Y[2].m75997f());
                m39893c(this.f81757i, this.f81756h, 1, this.f81753e);
                if (this.f81750b.m31385b0()) {
                    m39893c(this.f20245k, this.f81756h, 1, this.f20246l);
                }
                C43042iz0.EnumC24677b enumC24677b2 = this.f81752d;
                C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (enumC24677b2 == enumC24677b3 && this.f81750b.m31332x() > 0.0f) {
                    C40304eN1 c40304eN1 = this.f81750b.f91891e;
                    if (c40304eN1.f81752d == enumC24677b3) {
                        c40304eN1.f81753e.f102911k.add(this.f81753e);
                        this.f81753e.f102912l.add(this.f81750b.f91891e.f81753e);
                        this.f81753e.f102901a = this;
                    }
                }
            }
        } else {
            C37211Xy0 c37211Xy07 = c37211Xy0Arr2[3];
            if (c37211Xy07.f44308f != null) {
                C46610p01 m39891h9 = m39891h(c37211Xy07);
                if (m39891h9 != null) {
                    m39894b(this.f81757i, m39891h9, -this.f81750b.f91881Y[3].m75997f());
                    m39893c(this.f81756h, this.f81757i, -1, this.f81753e);
                    if (this.f81750b.m31385b0()) {
                        m39893c(this.f20245k, this.f81756h, 1, this.f20246l);
                    }
                }
            } else {
                C37211Xy0 c37211Xy08 = c37211Xy0Arr2[4];
                if (c37211Xy08.f44308f != null) {
                    C46610p01 m39891h10 = m39891h(c37211Xy08);
                    if (m39891h10 != null) {
                        m39894b(this.f20245k, m39891h10, 0);
                        m39893c(this.f81756h, this.f20245k, -1, this.f20246l);
                        m39893c(this.f81757i, this.f81756h, 1, this.f81753e);
                    }
                } else if (!(c43042iz05 instanceof HL1) && c43042iz05.m31414M() != null) {
                    m39894b(this.f81756h, this.f81750b.m31414M().f91893f.f81756h, this.f81750b.m31387a0());
                    m39893c(this.f81757i, this.f81756h, 1, this.f81753e);
                    if (this.f81750b.m31385b0()) {
                        m39893c(this.f20245k, this.f81756h, 1, this.f20246l);
                    }
                    C43042iz0.EnumC24677b enumC24677b4 = this.f81752d;
                    C43042iz0.EnumC24677b enumC24677b5 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                    if (enumC24677b4 == enumC24677b5 && this.f81750b.m31332x() > 0.0f) {
                        C40304eN1 c40304eN12 = this.f81750b.f91891e;
                        if (c40304eN12.f81752d == enumC24677b5) {
                            c40304eN12.f81753e.f102911k.add(this.f81753e);
                            this.f81753e.f102912l.add(this.f81750b.f91891e.f81753e);
                            this.f81753e.f102901a = this;
                        }
                    }
                }
            }
        }
        if (this.f81753e.f102912l.size() == 0) {
            this.f81753e.f102903c = true;
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: e */
    public void mo5647e() {
        C46610p01 c46610p01 = this.f81756h;
        if (c46610p01.f102910j) {
            this.f81750b.m31343r1(c46610p01.f102907g);
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: f */
    public void mo5646f() {
        this.f81751c = null;
        this.f81756h.m20171c();
        this.f81757i.m20171c();
        this.f20245k.m20171c();
        this.f81753e.m20171c();
        this.f81755g = false;
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: m */
    public boolean mo5645m() {
        if (this.f81752d != C43042iz0.EnumC24677b.MATCH_CONSTRAINT || this.f81750b.f91929x == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void m98273q() {
        this.f81755g = false;
        this.f81756h.m20171c();
        this.f81756h.f102910j = false;
        this.f81757i.m20171c();
        this.f81757i.f102910j = false;
        this.f20245k.m20171c();
        this.f20245k.f102910j = false;
        this.f81753e.f102910j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f81750b.m31335v();
    }
}
