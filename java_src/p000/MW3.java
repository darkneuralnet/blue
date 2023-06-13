package p000;
/* renamed from: MW3 */
/* loaded from: classes8.dex */
public class MW3 {

    /* renamed from: a */
    public InterfaceC49573u00 f23181a = InterfaceC49573u00.f111462e;

    /* renamed from: b */
    public boolean f23182b;

    /* renamed from: c */
    public int f23183c;

    /* renamed from: a */
    public final void m95240a(C52053yB0 c52053yB0, WB1 wb1) {
        if (wb1 instanceof FW3) {
            m95234g(m95235f(c52053yB0, (FW3) wb1));
        }
        if (wb1 instanceof C32002Br2) {
            m95234g(m95236e(c52053yB0, (C32002Br2) wb1));
        } else if (wb1 instanceof CX3) {
            m95234g(m95238c(c52053yB0, (CX3) wb1));
        } else {
            int i = 0;
            if (wb1 instanceof DW2) {
                DW2 dw2 = (DW2) wb1;
                while (i < dw2.mo77232f0()) {
                    m95234g(m95236e(c52053yB0, (C32002Br2) dw2.mo77236d0(i)));
                    i++;
                }
            } else if (wb1 instanceof WW2) {
                WW2 ww2 = (WW2) wb1;
                while (i < ww2.mo77232f0()) {
                    m95234g(m95238c(c52053yB0, (CX3) ww2.mo77236d0(i)));
                    i++;
                }
            } else if (wb1 instanceof XB1) {
                YB1 yb1 = new YB1((XB1) wb1);
                while (yb1.hasNext()) {
                    WB1 wb12 = (WB1) yb1.next();
                    if (wb12 != wb1) {
                        m95240a(c52053yB0, wb12);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public int m95239b(C52053yB0 c52053yB0, WB1 wb1) {
        if (wb1.mo77226r0()) {
            return 2;
        }
        if (wb1 instanceof C32002Br2) {
            return m95236e(c52053yB0, (C32002Br2) wb1);
        }
        if (wb1 instanceof CX3) {
            return m95238c(c52053yB0, (CX3) wb1);
        }
        this.f23182b = false;
        this.f23183c = 0;
        m95240a(c52053yB0, wb1);
        if (this.f23181a.mo11111a(this.f23183c)) {
            return 1;
        }
        if (this.f23183c <= 0 && !this.f23182b) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public final int m95238c(C52053yB0 c52053yB0, CX3 cx3) {
        int m95237d;
        if (cx3.mo77226r0() || (m95237d = m95237d(c52053yB0, cx3.m112157L0())) == 2) {
            return 2;
        }
        if (m95237d == 1) {
            return 1;
        }
        for (int i = 0; i < cx3.m112155O0(); i++) {
            int m95237d2 = m95237d(c52053yB0, cx3.m112156M0(i));
            if (m95237d2 == 0) {
                return 2;
            }
            if (m95237d2 == 1) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int m95237d(C52053yB0 c52053yB0, C34108Kr2 c34108Kr2) {
        if (!c34108Kr2.m78759Z().m13891E(c52053yB0)) {
            return 2;
        }
        return LW3.m96716c(c52053yB0, c34108Kr2.mo77238Y());
    }

    /* renamed from: e */
    public final int m95236e(C52053yB0 c52053yB0, C32002Br2 c32002Br2) {
        if (!c32002Br2.m78759Z().m13891E(c52053yB0)) {
            return 2;
        }
        EB0 m113440M0 = c32002Br2.m113440M0();
        if (!c32002Br2.mo98233T0() && (c52053yB0.equals(m113440M0.mo1707u(0)) || c52053yB0.equals(m113440M0.mo1707u(m113440M0.size() - 1)))) {
            return 1;
        }
        if (!LW3.m96717b(c52053yB0, m113440M0)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: f */
    public final int m95235f(C52053yB0 c52053yB0, FW3 fw3) {
        if (fw3.mo77239W().m3886g(c52053yB0)) {
            return 0;
        }
        return 2;
    }

    /* renamed from: g */
    public final void m95234g(int i) {
        if (i == 0) {
            this.f23182b = true;
        }
        if (i == 1) {
            this.f23183c++;
        }
    }
}
