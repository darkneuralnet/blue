package p000;

import p000.C37211Xy0;
import p000.C43042iz0;
/* renamed from: gB6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41387gB6 implements InterfaceC44238l01 {

    /* renamed from: a */
    public int f81749a;

    /* renamed from: b */
    public C43042iz0 f81750b;

    /* renamed from: c */
    public C40455ed5 f81751c;

    /* renamed from: d */
    public C43042iz0.EnumC24677b f81752d;

    /* renamed from: e */
    public Y31 f81753e = new Y31(this);

    /* renamed from: f */
    public int f81754f = 0;

    /* renamed from: g */
    public boolean f81755g = false;

    /* renamed from: h */
    public C46610p01 f81756h = new C46610p01(this);

    /* renamed from: i */
    public C46610p01 f81757i = new C46610p01(this);

    /* renamed from: j */
    public EnumC20782b f81758j = EnumC20782b.NONE;

    /* renamed from: gB6$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C20781a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81759a;

        static {
            int[] iArr = new int[C37211Xy0.EnumC9561b.values().length];
            f81759a = iArr;
            try {
                iArr[C37211Xy0.EnumC9561b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81759a[C37211Xy0.EnumC9561b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81759a[C37211Xy0.EnumC9561b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81759a[C37211Xy0.EnumC9561b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81759a[C37211Xy0.EnumC9561b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: gB6$b */
    /* loaded from: classes.dex */
    public enum EnumC20782b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC41387gB6(C43042iz0 c43042iz0) {
        this.f81750b = c43042iz0;
    }

    @Override // p000.InterfaceC44238l01
    /* renamed from: a */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
    }

    /* renamed from: b */
    public final void m39894b(C46610p01 c46610p01, C46610p01 c46610p012, int i) {
        c46610p01.f102912l.add(c46610p012);
        c46610p01.f102906f = i;
        c46610p012.f102911k.add(c46610p01);
    }

    /* renamed from: c */
    public final void m39893c(C46610p01 c46610p01, C46610p01 c46610p012, int i, Y31 y31) {
        c46610p01.f102912l.add(c46610p012);
        c46610p01.f102912l.add(this.f81753e);
        c46610p01.f102908h = i;
        c46610p01.f102909i = y31;
        c46610p012.f102911k.add(c46610p01);
        y31.f102911k.add(c46610p01);
    }

    /* renamed from: d */
    public abstract void mo5648d();

    /* renamed from: e */
    public abstract void mo5647e();

    /* renamed from: f */
    public abstract void mo5646f();

    /* renamed from: g */
    public final int m39892g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C43042iz0 c43042iz0 = this.f81750b;
            int i3 = c43042iz0.f91837A;
            max = Math.max(c43042iz0.f91933z, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C43042iz0 c43042iz02 = this.f81750b;
            int i4 = c43042iz02.f91843D;
            max = Math.max(c43042iz02.f91841C, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: h */
    public final C46610p01 m39891h(C37211Xy0 c37211Xy0) {
        C37211Xy0 c37211Xy02 = c37211Xy0.f44308f;
        if (c37211Xy02 == null) {
            return null;
        }
        C43042iz0 c43042iz0 = c37211Xy02.f44306d;
        int i = C20781a.f81759a[c37211Xy02.f44307e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return c43042iz0.f91893f.f81757i;
                    }
                    return c43042iz0.f91893f.f20245k;
                }
                return c43042iz0.f91893f.f81756h;
            }
            return c43042iz0.f91891e.f81757i;
        }
        return c43042iz0.f91891e.f81756h;
    }

    /* renamed from: i */
    public final C46610p01 m39890i(C37211Xy0 c37211Xy0, int i) {
        AbstractC41387gB6 abstractC41387gB6;
        C37211Xy0 c37211Xy02 = c37211Xy0.f44308f;
        if (c37211Xy02 == null) {
            return null;
        }
        C43042iz0 c43042iz0 = c37211Xy02.f44306d;
        if (i == 0) {
            abstractC41387gB6 = c43042iz0.f91891e;
        } else {
            abstractC41387gB6 = c43042iz0.f91893f;
        }
        int i2 = C20781a.f81759a[c37211Xy02.f44307e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC41387gB6.f81757i;
        }
        return abstractC41387gB6.f81756h;
    }

    /* renamed from: j */
    public long mo20620j() {
        Y31 y31 = this.f81753e;
        if (y31.f102910j) {
            return y31.f102907g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m39889k() {
        return this.f81755g;
    }

    /* renamed from: l */
    public final void m39888l(int i, int i2) {
        AbstractC41387gB6 abstractC41387gB6;
        float f;
        int i3;
        int i4 = this.f81749a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        C43042iz0 c43042iz0 = this.f81750b;
                        AbstractC41387gB6 abstractC41387gB62 = c43042iz0.f91891e;
                        C43042iz0.EnumC24677b enumC24677b = abstractC41387gB62.f81752d;
                        C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                        if (enumC24677b == enumC24677b2 && abstractC41387gB62.f81749a == 3) {
                            C34085Ko6 c34085Ko6 = c43042iz0.f91893f;
                            if (c34085Ko6.f81752d == enumC24677b2 && c34085Ko6.f81749a == 3) {
                                return;
                            }
                        }
                        if (i == 0) {
                            abstractC41387gB62 = c43042iz0.f91893f;
                        }
                        if (abstractC41387gB62.f81753e.f102910j) {
                            float m31332x = c43042iz0.m31332x();
                            if (i == 1) {
                                i3 = (int) ((abstractC41387gB62.f81753e.f102907g / m31332x) + 0.5f);
                            } else {
                                i3 = (int) ((m31332x * abstractC41387gB62.f81753e.f102907g) + 0.5f);
                            }
                            this.f81753e.mo20170d(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C43042iz0 m31414M = this.f81750b.m31414M();
                if (m31414M != null) {
                    if (i == 0) {
                        abstractC41387gB6 = m31414M.f91891e;
                    } else {
                        abstractC41387gB6 = m31414M.f91893f;
                    }
                    Y31 y31 = abstractC41387gB6.f81753e;
                    if (y31.f102910j) {
                        C43042iz0 c43042iz02 = this.f81750b;
                        if (i == 0) {
                            f = c43042iz02.f91839B;
                        } else {
                            f = c43042iz02.f91845E;
                        }
                        this.f81753e.mo20170d(m39892g((int) ((y31.f102907g * f) + 0.5f), i));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f81753e.mo20170d(Math.min(m39892g(this.f81753e.f44482m, i), i2));
            return;
        }
        this.f81753e.mo20170d(m39892g(i2, i));
    }

    /* renamed from: m */
    public abstract boolean mo5645m();

    /* renamed from: n */
    public void m39887n(InterfaceC44238l01 interfaceC44238l01, C37211Xy0 c37211Xy0, C37211Xy0 c37211Xy02, int i) {
        float m31401T;
        C46610p01 m39891h = m39891h(c37211Xy0);
        C46610p01 m39891h2 = m39891h(c37211Xy02);
        if (m39891h.f102910j && m39891h2.f102910j) {
            int m75997f = m39891h.f102907g + c37211Xy0.m75997f();
            int m75997f2 = m39891h2.f102907g - c37211Xy02.m75997f();
            int i2 = m75997f2 - m75997f;
            if (!this.f81753e.f102910j && this.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                m39888l(i, i2);
            }
            Y31 y31 = this.f81753e;
            if (!y31.f102910j) {
                return;
            }
            if (y31.f102907g == i2) {
                this.f81756h.mo20170d(m75997f);
                this.f81757i.mo20170d(m75997f2);
                return;
            }
            C43042iz0 c43042iz0 = this.f81750b;
            if (i == 0) {
                m31401T = c43042iz0.m31438A();
            } else {
                m31401T = c43042iz0.m31401T();
            }
            if (m39891h == m39891h2) {
                m75997f = m39891h.f102907g;
                m75997f2 = m39891h2.f102907g;
                m31401T = 0.5f;
            }
            this.f81756h.mo20170d((int) (m75997f + 0.5f + (((m75997f2 - m75997f) - this.f81753e.f102907g) * m31401T)));
            this.f81757i.mo20170d(this.f81756h.f102907g + this.f81753e.f102907g);
        }
    }

    /* renamed from: o */
    public void m39886o(InterfaceC44238l01 interfaceC44238l01) {
    }

    /* renamed from: p */
    public void m39885p(InterfaceC44238l01 interfaceC44238l01) {
    }
}
