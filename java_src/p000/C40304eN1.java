package p000;

import p000.AbstractC41387gB6;
import p000.C37211Xy0;
import p000.C43042iz0;
import p000.C46610p01;
/* renamed from: eN1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40304eN1 extends AbstractC41387gB6 {

    /* renamed from: k */
    public static int[] f78283k = new int[2];

    /* renamed from: eN1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C20012a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78284a;

        static {
            int[] iArr = new int[AbstractC41387gB6.EnumC20782b.values().length];
            f78284a = iArr;
            try {
                iArr[AbstractC41387gB6.EnumC20782b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78284a[AbstractC41387gB6.EnumC20782b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78284a[AbstractC41387gB6.EnumC20782b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C40304eN1(C43042iz0 c43042iz0) {
        super(c43042iz0);
        this.f81756h.f102905e = C46610p01.EnumC27118a.LEFT;
        this.f81757i.f102905e = C46610p01.EnumC27118a.RIGHT;
        this.f81754f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // p000.AbstractC41387gB6, p000.InterfaceC44238l01
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
        Y31 y31;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float m31332x;
        float f2;
        int i;
        C43042iz0 c43042iz0;
        int i2 = C20012a.f78284a[this.f81758j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C43042iz0 c43042iz02 = this.f81750b;
                    m39887n(interfaceC44238l01, c43042iz02.f91869Q, c43042iz02.f91873S, 0);
                    return;
                }
            } else {
                m39886o(interfaceC44238l01);
            }
        } else {
            m39885p(interfaceC44238l01);
        }
        if (!this.f81753e.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
            C43042iz0 c43042iz03 = this.f81750b;
            int i3 = c43042iz03.f91927w;
            if (i3 != 2) {
                if (i3 == 3) {
                    int i4 = c43042iz03.f91929x;
                    if (i4 != 0 && i4 != 3) {
                        int m31330y = c43042iz03.m31330y();
                        if (m31330y != -1) {
                            if (m31330y != 0) {
                                if (m31330y != 1) {
                                    i = 0;
                                    this.f81753e.mo20170d(i);
                                } else {
                                    C43042iz0 c43042iz04 = this.f81750b;
                                    f = c43042iz04.f91893f.f81753e.f102907g;
                                    m31332x = c43042iz04.m31332x();
                                }
                            } else {
                                f2 = c43042iz0.f91893f.f81753e.f102907g / this.f81750b.m31332x();
                                i = (int) (f2 + 0.5f);
                                this.f81753e.mo20170d(i);
                            }
                        } else {
                            C43042iz0 c43042iz05 = this.f81750b;
                            f = c43042iz05.f91893f.f81753e.f102907g;
                            m31332x = c43042iz05.m31332x();
                        }
                        f2 = f * m31332x;
                        i = (int) (f2 + 0.5f);
                        this.f81753e.mo20170d(i);
                    } else {
                        C34085Ko6 c34085Ko6 = c43042iz03.f91893f;
                        C46610p01 c46610p01 = c34085Ko6.f81756h;
                        C46610p01 c46610p012 = c34085Ko6.f81757i;
                        if (c43042iz03.f91869Q.f44308f != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c43042iz03.f91871R.f44308f != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (c43042iz03.f91873S.f44308f != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c43042iz03.f91875T.f44308f != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int m31330y2 = c43042iz03.m31330y();
                        if (z && z2 && z3 && z4) {
                            float m31332x2 = this.f81750b.m31332x();
                            if (c46610p01.f102910j && c46610p012.f102910j) {
                                C46610p01 c46610p013 = this.f81756h;
                                if (c46610p013.f102903c && this.f81757i.f102903c) {
                                    m42990q(f78283k, c46610p013.f102912l.get(0).f102907g + this.f81756h.f102906f, this.f81757i.f102912l.get(0).f102907g - this.f81757i.f102906f, c46610p01.f102907g + c46610p01.f102906f, c46610p012.f102907g - c46610p012.f102906f, m31332x2, m31330y2);
                                    this.f81753e.mo20170d(f78283k[0]);
                                    this.f81750b.f91893f.f81753e.mo20170d(f78283k[1]);
                                    return;
                                }
                                return;
                            }
                            C46610p01 c46610p014 = this.f81756h;
                            if (c46610p014.f102910j) {
                                C46610p01 c46610p015 = this.f81757i;
                                if (c46610p015.f102910j) {
                                    if (c46610p01.f102903c && c46610p012.f102903c) {
                                        m42990q(f78283k, c46610p014.f102907g + c46610p014.f102906f, c46610p015.f102907g - c46610p015.f102906f, c46610p01.f102912l.get(0).f102907g + c46610p01.f102906f, c46610p012.f102912l.get(0).f102907g - c46610p012.f102906f, m31332x2, m31330y2);
                                        this.f81753e.mo20170d(f78283k[0]);
                                        this.f81750b.f91893f.f81753e.mo20170d(f78283k[1]);
                                    } else {
                                        return;
                                    }
                                }
                            }
                            C46610p01 c46610p016 = this.f81756h;
                            if (c46610p016.f102903c && this.f81757i.f102903c && c46610p01.f102903c && c46610p012.f102903c) {
                                m42990q(f78283k, c46610p016.f102912l.get(0).f102907g + this.f81756h.f102906f, this.f81757i.f102912l.get(0).f102907g - this.f81757i.f102906f, c46610p01.f102912l.get(0).f102907g + c46610p01.f102906f, c46610p012.f102912l.get(0).f102907g - c46610p012.f102906f, m31332x2, m31330y2);
                                this.f81753e.mo20170d(f78283k[0]);
                                this.f81750b.f91893f.f81753e.mo20170d(f78283k[1]);
                            } else {
                                return;
                            }
                        } else if (z && z3) {
                            if (this.f81756h.f102903c && this.f81757i.f102903c) {
                                float m31332x3 = this.f81750b.m31332x();
                                int i5 = this.f81756h.f102912l.get(0).f102907g + this.f81756h.f102906f;
                                int i6 = this.f81757i.f102912l.get(0).f102907g - this.f81757i.f102906f;
                                if (m31330y2 != -1 && m31330y2 != 0) {
                                    if (m31330y2 == 1) {
                                        int m39892g = m39892g(i6 - i5, 0);
                                        int i7 = (int) ((m39892g / m31332x3) + 0.5f);
                                        int m39892g2 = m39892g(i7, 1);
                                        if (i7 != m39892g2) {
                                            m39892g = (int) ((m39892g2 * m31332x3) + 0.5f);
                                        }
                                        this.f81753e.mo20170d(m39892g);
                                        this.f81750b.f91893f.f81753e.mo20170d(m39892g2);
                                    }
                                } else {
                                    int m39892g3 = m39892g(i6 - i5, 0);
                                    int i8 = (int) ((m39892g3 * m31332x3) + 0.5f);
                                    int m39892g4 = m39892g(i8, 1);
                                    if (i8 != m39892g4) {
                                        m39892g3 = (int) ((m39892g4 / m31332x3) + 0.5f);
                                    }
                                    this.f81753e.mo20170d(m39892g3);
                                    this.f81750b.f91893f.f81753e.mo20170d(m39892g4);
                                }
                            } else {
                                return;
                            }
                        } else if (z2 && z4) {
                            if (c46610p01.f102903c && c46610p012.f102903c) {
                                float m31332x4 = this.f81750b.m31332x();
                                int i9 = c46610p01.f102912l.get(0).f102907g + c46610p01.f102906f;
                                int i10 = c46610p012.f102912l.get(0).f102907g - c46610p012.f102906f;
                                if (m31330y2 != -1) {
                                    if (m31330y2 == 0) {
                                        int m39892g5 = m39892g(i10 - i9, 1);
                                        int i11 = (int) ((m39892g5 * m31332x4) + 0.5f);
                                        int m39892g6 = m39892g(i11, 0);
                                        if (i11 != m39892g6) {
                                            m39892g5 = (int) ((m39892g6 / m31332x4) + 0.5f);
                                        }
                                        this.f81753e.mo20170d(m39892g6);
                                        this.f81750b.f91893f.f81753e.mo20170d(m39892g5);
                                    }
                                }
                                int m39892g7 = m39892g(i10 - i9, 1);
                                int i12 = (int) ((m39892g7 / m31332x4) + 0.5f);
                                int m39892g8 = m39892g(i12, 0);
                                if (i12 != m39892g8) {
                                    m39892g7 = (int) ((m39892g8 * m31332x4) + 0.5f);
                                }
                                this.f81753e.mo20170d(m39892g8);
                                this.f81750b.f91893f.f81753e.mo20170d(m39892g7);
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else {
                C43042iz0 m31414M = c43042iz03.m31414M();
                if (m31414M != null) {
                    if (m31414M.f91891e.f81753e.f102910j) {
                        this.f81753e.mo20170d((int) ((y31.f102907g * this.f81750b.f91839B) + 0.5f));
                    }
                }
            }
        }
        C46610p01 c46610p017 = this.f81756h;
        if (c46610p017.f102903c) {
            C46610p01 c46610p018 = this.f81757i;
            if (c46610p018.f102903c) {
                if (c46610p017.f102910j && c46610p018.f102910j && this.f81753e.f102910j) {
                    return;
                }
                if (!this.f81753e.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    C43042iz0 c43042iz06 = this.f81750b;
                    if (c43042iz06.f91927w == 0 && !c43042iz06.m31361k0()) {
                        int i13 = this.f81756h.f102912l.get(0).f102907g;
                        C46610p01 c46610p019 = this.f81756h;
                        int i14 = i13 + c46610p019.f102906f;
                        int i15 = this.f81757i.f102912l.get(0).f102907g + this.f81757i.f102906f;
                        c46610p019.mo20170d(i14);
                        this.f81757i.mo20170d(i15);
                        this.f81753e.mo20170d(i15 - i14);
                        return;
                    }
                }
                if (!this.f81753e.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && this.f81749a == 1 && this.f81756h.f102912l.size() > 0 && this.f81757i.f102912l.size() > 0) {
                    int min = Math.min((this.f81757i.f102912l.get(0).f102907g + this.f81757i.f102906f) - (this.f81756h.f102912l.get(0).f102907g + this.f81756h.f102906f), this.f81753e.f44482m);
                    C43042iz0 c43042iz07 = this.f81750b;
                    int i16 = c43042iz07.f91837A;
                    int max = Math.max(c43042iz07.f91933z, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    this.f81753e.mo20170d(max);
                }
                if (!this.f81753e.f102910j) {
                    return;
                }
                C46610p01 c46610p0110 = this.f81756h.f102912l.get(0);
                C46610p01 c46610p0111 = this.f81757i.f102912l.get(0);
                int i17 = c46610p0110.f102907g + this.f81756h.f102906f;
                int i18 = c46610p0111.f102907g + this.f81757i.f102906f;
                float m31438A = this.f81750b.m31438A();
                if (c46610p0110 == c46610p0111) {
                    i17 = c46610p0110.f102907g;
                    i18 = c46610p0111.f102907g;
                    m31438A = 0.5f;
                }
                this.f81756h.mo20170d((int) (i17 + 0.5f + (((i18 - i17) - this.f81753e.f102907g) * m31438A)));
                this.f81757i.mo20170d(this.f81756h.f102907g + this.f81753e.f102907g);
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
            this.f81753e.mo20170d(c43042iz0.m31391Y());
        }
        if (!this.f81753e.f102910j) {
            C43042iz0.EnumC24677b m31434C = this.f81750b.m31434C();
            this.f81752d = m31434C;
            if (m31434C != C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_PARENT;
                if (m31434C == enumC24677b && (m31414M2 = this.f81750b.m31414M()) != null && (m31414M2.m31434C() == C43042iz0.EnumC24677b.FIXED || m31414M2.m31434C() == enumC24677b)) {
                    int m31391Y = (m31414M2.m31391Y() - this.f81750b.f91869Q.m75997f()) - this.f81750b.f91873S.m75997f();
                    m39894b(this.f81756h, m31414M2.f91891e.f81756h, this.f81750b.f91869Q.m75997f());
                    m39894b(this.f81757i, m31414M2.f91891e.f81757i, -this.f81750b.f91873S.m75997f());
                    this.f81753e.mo20170d(m31391Y);
                    return;
                } else if (this.f81752d == C43042iz0.EnumC24677b.FIXED) {
                    this.f81753e.mo20170d(this.f81750b.m31391Y());
                }
            }
        } else {
            C43042iz0.EnumC24677b enumC24677b2 = this.f81752d;
            C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.MATCH_PARENT;
            if (enumC24677b2 == enumC24677b3 && (m31414M = this.f81750b.m31414M()) != null && (m31414M.m31434C() == C43042iz0.EnumC24677b.FIXED || m31414M.m31434C() == enumC24677b3)) {
                m39894b(this.f81756h, m31414M.f91891e.f81756h, this.f81750b.f91869Q.m75997f());
                m39894b(this.f81757i, m31414M.f91891e.f81757i, -this.f81750b.f91873S.m75997f());
                return;
            }
        }
        Y31 y31 = this.f81753e;
        if (y31.f102910j) {
            C43042iz0 c43042iz02 = this.f81750b;
            if (c43042iz02.f91883a) {
                C37211Xy0[] c37211Xy0Arr = c43042iz02.f91881Y;
                C37211Xy0 c37211Xy0 = c37211Xy0Arr[0];
                C37211Xy0 c37211Xy02 = c37211Xy0.f44308f;
                if (c37211Xy02 != null && c37211Xy0Arr[1].f44308f != null) {
                    if (c43042iz02.m31361k0()) {
                        this.f81756h.f102906f = this.f81750b.f91881Y[0].m75997f();
                        this.f81757i.f102906f = -this.f81750b.f91881Y[1].m75997f();
                        return;
                    }
                    C46610p01 m39891h = m39891h(this.f81750b.f91881Y[0]);
                    if (m39891h != null) {
                        m39894b(this.f81756h, m39891h, this.f81750b.f91881Y[0].m75997f());
                    }
                    C46610p01 m39891h2 = m39891h(this.f81750b.f91881Y[1]);
                    if (m39891h2 != null) {
                        m39894b(this.f81757i, m39891h2, -this.f81750b.f91881Y[1].m75997f());
                    }
                    this.f81756h.f102902b = true;
                    this.f81757i.f102902b = true;
                    return;
                } else if (c37211Xy02 != null) {
                    C46610p01 m39891h3 = m39891h(c37211Xy0);
                    if (m39891h3 != null) {
                        m39894b(this.f81756h, m39891h3, this.f81750b.f91881Y[0].m75997f());
                        m39894b(this.f81757i, this.f81756h, this.f81753e.f102907g);
                        return;
                    }
                    return;
                } else {
                    C37211Xy0 c37211Xy03 = c37211Xy0Arr[1];
                    if (c37211Xy03.f44308f != null) {
                        C46610p01 m39891h4 = m39891h(c37211Xy03);
                        if (m39891h4 != null) {
                            m39894b(this.f81757i, m39891h4, -this.f81750b.f91881Y[1].m75997f());
                            m39894b(this.f81756h, this.f81757i, -this.f81753e.f102907g);
                            return;
                        }
                        return;
                    } else if (!(c43042iz02 instanceof HL1) && c43042iz02.m31414M() != null && this.f81750b.mo7200q(C37211Xy0.EnumC9561b.CENTER).f44308f == null) {
                        m39894b(this.f81756h, this.f81750b.m31414M().f91891e.f81756h, this.f81750b.m31389Z());
                        m39894b(this.f81757i, this.f81756h, this.f81753e.f102907g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
            C43042iz0 c43042iz03 = this.f81750b;
            int i = c43042iz03.f91927w;
            if (i != 2) {
                if (i == 3) {
                    if (c43042iz03.f91929x == 3) {
                        this.f81756h.f102901a = this;
                        this.f81757i.f102901a = this;
                        C34085Ko6 c34085Ko6 = c43042iz03.f91893f;
                        c34085Ko6.f81756h.f102901a = this;
                        c34085Ko6.f81757i.f102901a = this;
                        y31.f102901a = this;
                        if (c43042iz03.m31355m0()) {
                            this.f81753e.f102912l.add(this.f81750b.f91893f.f81753e);
                            this.f81750b.f91893f.f81753e.f102911k.add(this.f81753e);
                            C34085Ko6 c34085Ko62 = this.f81750b.f91893f;
                            c34085Ko62.f81753e.f102901a = this;
                            this.f81753e.f102912l.add(c34085Ko62.f81756h);
                            this.f81753e.f102912l.add(this.f81750b.f91893f.f81757i);
                            this.f81750b.f91893f.f81756h.f102911k.add(this.f81753e);
                            this.f81750b.f91893f.f81757i.f102911k.add(this.f81753e);
                        } else if (this.f81750b.m31361k0()) {
                            this.f81750b.f91893f.f81753e.f102912l.add(this.f81753e);
                            this.f81753e.f102911k.add(this.f81750b.f91893f.f81753e);
                        } else {
                            this.f81750b.f91893f.f81753e.f102912l.add(this.f81753e);
                        }
                    } else {
                        Y31 y312 = c43042iz03.f91893f.f81753e;
                        y31.f102912l.add(y312);
                        y312.f102911k.add(this.f81753e);
                        this.f81750b.f91893f.f81756h.f102911k.add(this.f81753e);
                        this.f81750b.f91893f.f81757i.f102911k.add(this.f81753e);
                        Y31 y313 = this.f81753e;
                        y313.f102902b = true;
                        y313.f102911k.add(this.f81756h);
                        this.f81753e.f102911k.add(this.f81757i);
                        this.f81756h.f102912l.add(this.f81753e);
                        this.f81757i.f102912l.add(this.f81753e);
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
        }
        C43042iz0 c43042iz04 = this.f81750b;
        C37211Xy0[] c37211Xy0Arr2 = c43042iz04.f91881Y;
        C37211Xy0 c37211Xy04 = c37211Xy0Arr2[0];
        C37211Xy0 c37211Xy05 = c37211Xy04.f44308f;
        if (c37211Xy05 != null && c37211Xy0Arr2[1].f44308f != null) {
            if (c43042iz04.m31361k0()) {
                this.f81756h.f102906f = this.f81750b.f91881Y[0].m75997f();
                this.f81757i.f102906f = -this.f81750b.f91881Y[1].m75997f();
                return;
            }
            C46610p01 m39891h5 = m39891h(this.f81750b.f91881Y[0]);
            C46610p01 m39891h6 = m39891h(this.f81750b.f91881Y[1]);
            if (m39891h5 != null) {
                m39891h5.m20172b(this);
            }
            if (m39891h6 != null) {
                m39891h6.m20172b(this);
            }
            this.f81758j = AbstractC41387gB6.EnumC20782b.CENTER;
        } else if (c37211Xy05 != null) {
            C46610p01 m39891h7 = m39891h(c37211Xy04);
            if (m39891h7 != null) {
                m39894b(this.f81756h, m39891h7, this.f81750b.f91881Y[0].m75997f());
                m39893c(this.f81757i, this.f81756h, 1, this.f81753e);
            }
        } else {
            C37211Xy0 c37211Xy06 = c37211Xy0Arr2[1];
            if (c37211Xy06.f44308f != null) {
                C46610p01 m39891h8 = m39891h(c37211Xy06);
                if (m39891h8 != null) {
                    m39894b(this.f81757i, m39891h8, -this.f81750b.f91881Y[1].m75997f());
                    m39893c(this.f81756h, this.f81757i, -1, this.f81753e);
                }
            } else if (!(c43042iz04 instanceof HL1) && c43042iz04.m31414M() != null) {
                m39894b(this.f81756h, this.f81750b.m31414M().f91891e.f81756h, this.f81750b.m31389Z());
                m39893c(this.f81757i, this.f81756h, 1, this.f81753e);
            }
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: e */
    public void mo5647e() {
        C46610p01 c46610p01 = this.f81756h;
        if (c46610p01.f102910j) {
            this.f81750b.m31346q1(c46610p01.f102907g);
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: f */
    public void mo5646f() {
        this.f81751c = null;
        this.f81756h.m20171c();
        this.f81757i.m20171c();
        this.f81753e.m20171c();
        this.f81755g = false;
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: m */
    public boolean mo5645m() {
        if (this.f81752d != C43042iz0.EnumC24677b.MATCH_CONSTRAINT || this.f81750b.f91927w == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void m42990q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: r */
    public void m42989r() {
        this.f81755g = false;
        this.f81756h.m20171c();
        this.f81756h.f102910j = false;
        this.f81757i.m20171c();
        this.f81757i.f102910j = false;
        this.f81753e.f102910j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f81750b.m31335v();
    }
}
