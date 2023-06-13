package p000;
/* renamed from: Tg0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36113Tg0 {

    /* renamed from: a */
    public C52053yB0 f35843a;

    /* renamed from: b */
    public C52053yB0 f35844b = new C52053yB0();

    /* renamed from: c */
    public double f35845c = 0.0d;

    /* renamed from: d */
    public C52053yB0 f35846d = new C52053yB0();

    /* renamed from: e */
    public C52053yB0 f35847e = new C52053yB0();

    /* renamed from: f */
    public double f35848f = 0.0d;

    /* renamed from: g */
    public int f35849g = 0;

    /* renamed from: h */
    public C52053yB0 f35850h = new C52053yB0();

    public C36113Tg0(WB1 wb1) {
        this.f35843a = null;
        this.f35843a = null;
        m83218a(wb1);
    }

    /* renamed from: h */
    public static double m83211h(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        double d = c52053yB02.f118922b;
        double d2 = c52053yB0.f118922b;
        double d3 = c52053yB03.f118923c;
        double d4 = c52053yB0.f118923c;
        return ((d - d2) * (d3 - d4)) - ((c52053yB03.f118922b - d2) * (c52053yB02.f118923c - d4));
    }

    /* renamed from: i */
    public static void m83210i(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        c52053yB04.f118922b = c52053yB0.f118922b + c52053yB02.f118922b + c52053yB03.f118922b;
        c52053yB04.f118923c = c52053yB0.f118923c + c52053yB02.f118923c + c52053yB03.f118923c;
    }

    /* renamed from: k */
    public static C52053yB0 m83208k(WB1 wb1) {
        return new C36113Tg0(wb1).m83209j();
    }

    /* renamed from: a */
    public final void m83218a(WB1 wb1) {
        if (wb1.mo77226r0()) {
            return;
        }
        if (wb1 instanceof FW3) {
            m83214e(wb1.mo77239W());
        } else if (wb1 instanceof C32002Br2) {
            m83215d(wb1.mo77238Y());
        } else if (wb1 instanceof CX3) {
            m83217b((CX3) wb1);
        } else if (wb1 instanceof XB1) {
            XB1 xb1 = (XB1) wb1;
            for (int i = 0; i < xb1.mo77232f0(); i++) {
                m83218a(xb1.mo77236d0(i));
            }
        }
    }

    /* renamed from: b */
    public final void m83217b(CX3 cx3) {
        m83213f(cx3.m112157L0().mo77238Y());
        for (int i = 0; i < cx3.m112155O0(); i++) {
            m83216c(cx3.m112156M0(i).mo77238Y());
        }
    }

    /* renamed from: c */
    public final void m83216c(C52053yB0[] c52053yB0Arr) {
        boolean m109569c = C32534Dy3.m109569c(c52053yB0Arr);
        int i = 0;
        while (i < c52053yB0Arr.length - 1) {
            C52053yB0 c52053yB0 = this.f35843a;
            C52053yB0 c52053yB02 = c52053yB0Arr[i];
            i++;
            m83212g(c52053yB0, c52053yB02, c52053yB0Arr[i], m109569c);
        }
        m83215d(c52053yB0Arr);
    }

    /* renamed from: d */
    public final void m83215d(C52053yB0[] c52053yB0Arr) {
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        while (i < c52053yB0Arr.length - 1) {
            int i2 = i + 1;
            double m3887f = c52053yB0Arr[i].m3887f(c52053yB0Arr[i2]);
            if (m3887f != d) {
                d2 += m3887f;
                C52053yB0 c52053yB0 = c52053yB0Arr[i];
                double d3 = c52053yB0.f118922b;
                C52053yB0 c52053yB02 = c52053yB0Arr[i2];
                C52053yB0 c52053yB03 = this.f35847e;
                c52053yB03.f118922b += ((d3 + c52053yB02.f118922b) / 2.0d) * m3887f;
                c52053yB03.f118923c += m3887f * ((c52053yB0.f118923c + c52053yB02.f118923c) / 2.0d);
            }
            i = i2;
            d = 0.0d;
        }
        this.f35848f += d2;
        if (d2 == 0.0d && c52053yB0Arr.length > 0) {
            m83214e(c52053yB0Arr[0]);
        }
    }

    /* renamed from: e */
    public final void m83214e(C52053yB0 c52053yB0) {
        this.f35849g++;
        C52053yB0 c52053yB02 = this.f35850h;
        c52053yB02.f118922b += c52053yB0.f118922b;
        c52053yB02.f118923c += c52053yB0.f118923c;
    }

    /* renamed from: f */
    public final void m83213f(C52053yB0[] c52053yB0Arr) {
        int i = 0;
        if (c52053yB0Arr.length > 0) {
            m83207l(c52053yB0Arr[0]);
        }
        boolean z = !C32534Dy3.m109569c(c52053yB0Arr);
        while (i < c52053yB0Arr.length - 1) {
            C52053yB0 c52053yB0 = this.f35843a;
            C52053yB0 c52053yB02 = c52053yB0Arr[i];
            i++;
            m83212g(c52053yB0, c52053yB02, c52053yB0Arr[i], z);
        }
        m83215d(c52053yB0Arr);
    }

    /* renamed from: g */
    public final void m83212g(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, boolean z) {
        double d;
        if (z) {
            d = 1.0d;
        } else {
            d = -1.0d;
        }
        m83210i(c52053yB0, c52053yB02, c52053yB03, this.f35844b);
        double m83211h = m83211h(c52053yB0, c52053yB02, c52053yB03);
        C52053yB0 c52053yB04 = this.f35846d;
        double d2 = c52053yB04.f118922b;
        double d3 = d * m83211h;
        C52053yB0 c52053yB05 = this.f35844b;
        c52053yB04.f118922b = d2 + (c52053yB05.f118922b * d3);
        c52053yB04.f118923c += c52053yB05.f118923c * d3;
        this.f35845c += d3;
    }

    /* renamed from: j */
    public C52053yB0 m83209j() {
        C52053yB0 c52053yB0 = new C52053yB0();
        if (Math.abs(this.f35845c) > 0.0d) {
            C52053yB0 c52053yB02 = this.f35846d;
            double d = this.f35845c;
            c52053yB0.f118922b = (c52053yB02.f118922b / 3.0d) / d;
            c52053yB0.f118923c = (c52053yB02.f118923c / 3.0d) / d;
        } else {
            double d2 = this.f35848f;
            if (d2 > 0.0d) {
                C52053yB0 c52053yB03 = this.f35847e;
                c52053yB0.f118922b = c52053yB03.f118922b / d2;
                c52053yB0.f118923c = c52053yB03.f118923c / d2;
            } else {
                int i = this.f35849g;
                if (i > 0) {
                    C52053yB0 c52053yB04 = this.f35850h;
                    c52053yB0.f118922b = c52053yB04.f118922b / i;
                    c52053yB0.f118923c = c52053yB04.f118923c / i;
                } else {
                    return null;
                }
            }
        }
        return c52053yB0;
    }

    /* renamed from: l */
    public final void m83207l(C52053yB0 c52053yB0) {
        this.f35843a = c52053yB0;
    }
}
