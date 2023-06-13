package p000;
/* renamed from: Bb5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31861Bb5 extends AbstractC48893sr2 {
    /* renamed from: A */
    public static double m113826A(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        double mo3881m = c52053yB02.mo3881m();
        double mo3881m2 = c52053yB03.mo3881m();
        if (Double.isNaN(mo3881m)) {
            return mo3881m2;
        }
        if (Double.isNaN(mo3881m2)) {
            return mo3881m;
        }
        if (c52053yB0.m3886g(c52053yB02)) {
            return mo3881m;
        }
        if (c52053yB0.m3886g(c52053yB03)) {
            return mo3881m2;
        }
        double d = mo3881m2 - mo3881m;
        if (d == 0.0d) {
            return mo3881m;
        }
        double d2 = c52053yB03.f118922b;
        double d3 = c52053yB02.f118922b;
        double d4 = d2 - d3;
        double d5 = c52053yB03.f118923c;
        double d6 = c52053yB02.f118923c;
        double d7 = d5 - d6;
        double d8 = (d4 * d4) + (d7 * d7);
        double d9 = c52053yB0.f118922b - d3;
        double d10 = c52053yB0.f118923c - d6;
        return mo3881m + (d * Math.sqrt(((d9 * d9) + (d10 * d10)) / d8));
    }

    /* renamed from: B */
    public static double m113825B(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04, C52053yB0 c52053yB05) {
        double m113826A = m113826A(c52053yB0, c52053yB02, c52053yB03);
        double m113826A2 = m113826A(c52053yB0, c52053yB04, c52053yB05);
        if (Double.isNaN(m113826A)) {
            return m113826A2;
        }
        if (Double.isNaN(m113826A2)) {
            return m113826A;
        }
        return (m113826A + m113826A2) / 2.0d;
    }

    /* renamed from: r */
    public static C52053yB0 m113823r(C52053yB0 c52053yB0) {
        return new C52053yB0(c52053yB0);
    }

    /* renamed from: s */
    public static C52053yB0 m113822s(C52053yB0 c52053yB0, double d) {
        C52053yB0 m113823r = m113823r(c52053yB0);
        if (!Double.isNaN(d)) {
            m113823r.mo3877q(d);
        }
        return m113823r;
    }

    /* renamed from: t */
    public static C52053yB0 m113821t(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        return m113822s(c52053yB0, m113815z(c52053yB0, c52053yB02, c52053yB03));
    }

    /* renamed from: x */
    public static C52053yB0 m113817x(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        C52053yB0 c52053yB05;
        double m105836a = G51.m105836a(c52053yB0, c52053yB03, c52053yB04);
        double m105836a2 = G51.m105836a(c52053yB02, c52053yB03, c52053yB04);
        if (m105836a2 < m105836a) {
            m105836a = m105836a2;
            c52053yB05 = c52053yB02;
        } else {
            c52053yB05 = c52053yB0;
        }
        double m105836a3 = G51.m105836a(c52053yB03, c52053yB0, c52053yB02);
        if (m105836a3 < m105836a) {
            m105836a = m105836a3;
        } else {
            c52053yB03 = c52053yB05;
        }
        if (G51.m105836a(c52053yB04, c52053yB0, c52053yB02) >= m105836a) {
            return c52053yB03;
        }
        return c52053yB04;
    }

    /* renamed from: y */
    public static double m113816y(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        double mo3881m = c52053yB0.mo3881m();
        if (Double.isNaN(mo3881m)) {
            return c52053yB02.mo3881m();
        }
        return mo3881m;
    }

    /* renamed from: z */
    public static double m113815z(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        double mo3881m = c52053yB0.mo3881m();
        if (!Double.isNaN(mo3881m)) {
            return mo3881m;
        }
        return m113826A(c52053yB0, c52053yB02, c52053yB03);
    }

    @Override // p000.AbstractC48893sr2
    /* renamed from: b */
    public int mo13589b(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        boolean z;
        double d;
        double m113815z;
        this.f109416d = false;
        if (!C48772sf1.m13888J(c52053yB0, c52053yB02, c52053yB03, c52053yB04)) {
            return 0;
        }
        int m109571a = C32534Dy3.m109571a(c52053yB0, c52053yB02, c52053yB03);
        int m109571a2 = C32534Dy3.m109571a(c52053yB0, c52053yB02, c52053yB04);
        if ((m109571a > 0 && m109571a2 > 0) || (m109571a < 0 && m109571a2 < 0)) {
            return 0;
        }
        int m109571a3 = C32534Dy3.m109571a(c52053yB03, c52053yB04, c52053yB0);
        int m109571a4 = C32534Dy3.m109571a(c52053yB03, c52053yB04, c52053yB02);
        if ((m109571a3 > 0 && m109571a4 > 0) || (m109571a3 < 0 && m109571a4 < 0)) {
            return 0;
        }
        if (m109571a == 0 && m109571a2 == 0 && m109571a3 == 0 && m109571a4 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m113824q(c52053yB0, c52053yB02, c52053yB03, c52053yB04);
        }
        if (m109571a != 0 && m109571a2 != 0 && m109571a3 != 0 && m109571a4 != 0) {
            this.f109416d = true;
            C52053yB0 m113820u = m113820u(c52053yB0, c52053yB02, c52053yB03, c52053yB04);
            d = m113825B(m113820u, c52053yB0, c52053yB02, c52053yB03, c52053yB04);
            c52053yB0 = m113820u;
        } else {
            this.f109416d = false;
            if (c52053yB0.m3886g(c52053yB03)) {
                d = m113816y(c52053yB0, c52053yB03);
            } else if (c52053yB0.m3886g(c52053yB04)) {
                d = m113816y(c52053yB0, c52053yB04);
            } else {
                if (c52053yB02.m3886g(c52053yB03)) {
                    m113815z = m113816y(c52053yB02, c52053yB03);
                } else if (c52053yB02.m3886g(c52053yB04)) {
                    m113815z = m113816y(c52053yB02, c52053yB04);
                } else if (m109571a == 0) {
                    double m113815z2 = m113815z(c52053yB03, c52053yB0, c52053yB02);
                    c52053yB0 = c52053yB03;
                    d = m113815z2;
                } else if (m109571a2 == 0) {
                    d = m113815z(c52053yB04, c52053yB0, c52053yB02);
                    c52053yB0 = c52053yB04;
                } else if (m109571a3 == 0) {
                    d = m113815z(c52053yB0, c52053yB03, c52053yB04);
                } else if (m109571a4 == 0) {
                    m113815z = m113815z(c52053yB02, c52053yB03, c52053yB04);
                } else {
                    c52053yB0 = null;
                    d = Double.NaN;
                }
                c52053yB0 = c52053yB02;
                d = m113815z;
            }
        }
        this.f109415c[0] = m113822s(c52053yB0, d);
        return 1;
    }

    @Override // p000.AbstractC48893sr2
    /* renamed from: c */
    public void mo13588c(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        this.f109416d = false;
        if (C48772sf1.m13889H(c52053yB02, c52053yB03, c52053yB0) && C32534Dy3.m109571a(c52053yB02, c52053yB03, c52053yB0) == 0 && C32534Dy3.m109571a(c52053yB03, c52053yB02, c52053yB0) == 0) {
            this.f109416d = true;
            if (c52053yB0.equals(c52053yB02) || c52053yB0.equals(c52053yB03)) {
                this.f109416d = false;
            }
            this.f109413a = 1;
            return;
        }
        this.f109413a = 0;
    }

    /* renamed from: q */
    public final int m113824q(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        boolean m13889H = C48772sf1.m13889H(c52053yB0, c52053yB02, c52053yB03);
        boolean m13889H2 = C48772sf1.m13889H(c52053yB0, c52053yB02, c52053yB04);
        boolean m13889H3 = C48772sf1.m13889H(c52053yB03, c52053yB04, c52053yB0);
        boolean m13889H4 = C48772sf1.m13889H(c52053yB03, c52053yB04, c52053yB02);
        if (m13889H && m13889H2) {
            this.f109415c[0] = m113821t(c52053yB03, c52053yB0, c52053yB02);
            this.f109415c[1] = m113821t(c52053yB04, c52053yB0, c52053yB02);
            return 2;
        } else if (m13889H3 && m13889H4) {
            this.f109415c[0] = m113821t(c52053yB0, c52053yB03, c52053yB04);
            this.f109415c[1] = m113821t(c52053yB02, c52053yB03, c52053yB04);
            return 2;
        } else if (m13889H && m13889H3) {
            this.f109415c[0] = m113821t(c52053yB03, c52053yB0, c52053yB02);
            this.f109415c[1] = m113821t(c52053yB0, c52053yB03, c52053yB04);
            if (!c52053yB03.equals(c52053yB0) || m13889H2 || m13889H4) {
                return 2;
            }
            return 1;
        } else if (m13889H && m13889H4) {
            this.f109415c[0] = m113821t(c52053yB03, c52053yB0, c52053yB02);
            this.f109415c[1] = m113821t(c52053yB02, c52053yB03, c52053yB04);
            if (!c52053yB03.equals(c52053yB02) || m13889H2 || m13889H3) {
                return 2;
            }
            return 1;
        } else if (m13889H2 && m13889H3) {
            this.f109415c[0] = m113821t(c52053yB04, c52053yB0, c52053yB02);
            this.f109415c[1] = m113821t(c52053yB0, c52053yB03, c52053yB04);
            if (!c52053yB04.equals(c52053yB0) || m13889H || m13889H4) {
                return 2;
            }
            return 1;
        } else if (!m13889H2 || !m13889H4) {
            return 0;
        } else {
            this.f109415c[0] = m113821t(c52053yB04, c52053yB0, c52053yB02);
            this.f109415c[1] = m113821t(c52053yB02, c52053yB03, c52053yB04);
            if (!c52053yB04.equals(c52053yB02) || m13889H || m13889H3) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: u */
    public final C52053yB0 m113820u(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        C52053yB0 m113819v = m113819v(c52053yB0, c52053yB02, c52053yB03, c52053yB04);
        if (!m113818w(m113819v)) {
            m113819v = m113823r(m113817x(c52053yB0, c52053yB02, c52053yB03, c52053yB04));
        }
        C40414eZ3 c40414eZ3 = this.f109419g;
        if (c40414eZ3 != null) {
            c40414eZ3.m42760f(m113819v);
        }
        return m113819v;
    }

    /* renamed from: v */
    public final C52053yB0 m113819v(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        C52053yB0 m94373a = N62.m94373a(c52053yB0, c52053yB02, c52053yB03, c52053yB04);
        if (m94373a == null) {
            return m113817x(c52053yB0, c52053yB02, c52053yB03, c52053yB04);
        }
        return m94373a;
    }

    /* renamed from: w */
    public final boolean m113818w(C52053yB0 c52053yB0) {
        C52053yB0[] c52053yB0Arr = this.f109414b[0];
        C48772sf1 c48772sf1 = new C48772sf1(c52053yB0Arr[0], c52053yB0Arr[1]);
        C52053yB0[] c52053yB0Arr2 = this.f109414b[1];
        C48772sf1 c48772sf12 = new C48772sf1(c52053yB0Arr2[0], c52053yB0Arr2[1]);
        if (!c48772sf1.m13884a(c52053yB0) || !c48772sf12.m13884a(c52053yB0)) {
            return false;
        }
        return true;
    }
}
