package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: cC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39002cC1 extends C44529lV3 {

    /* renamed from: d */
    public WB1 f60293d;

    /* renamed from: f */
    public InterfaceC49573u00 f60295f;

    /* renamed from: h */
    public int f60297h;

    /* renamed from: i */
    public Collection f60298i;

    /* renamed from: e */
    public Map f60294e = new HashMap();

    /* renamed from: g */
    public boolean f60296g = true;

    /* renamed from: j */
    public boolean f60299j = false;

    /* renamed from: k */
    public C52053yB0 f60300k = null;

    /* renamed from: l */
    public NW3 f60301l = null;

    /* renamed from: m */
    public final MW3 f60302m = new MW3();

    public C39002cC1(int i, WB1 wb1, InterfaceC49573u00 interfaceC49573u00) {
        this.f60295f = null;
        this.f60297h = i;
        this.f60293d = wb1;
        this.f60295f = interfaceC49573u00;
        if (wb1 != null) {
            m61710k(wb1);
        }
    }

    /* renamed from: w */
    public static int m61698w(InterfaceC49573u00 interfaceC49573u00, int i) {
        return interfaceC49573u00.mo11111a(i) ? 1 : 0;
    }

    /* renamed from: A */
    public final void m61712A(int i, C52053yB0 c52053yB0) {
        C35926Sl2 m85838b = this.f96264b.m94324b(c52053yB0).m85838b();
        int i2 = 1;
        if (m85838b.m84873e(i, 0) == 1) {
            i2 = 2;
        }
        m85838b.m84864n(i, m61698w(this.f60295f, i2));
    }

    /* renamed from: B */
    public final void m61711B(int i, C52053yB0 c52053yB0, int i2) {
        D83 m94324b = this.f96264b.m94324b(c52053yB0);
        C35926Sl2 m85838b = m94324b.m85838b();
        if (m85838b == null) {
            m94324b.f33341a = new C35926Sl2(i, i2);
        } else {
            m85838b.m84864n(i, i2);
        }
    }

    /* renamed from: k */
    public final void m61710k(WB1 wb1) {
        if (wb1.mo77226r0()) {
            return;
        }
        boolean z = wb1 instanceof WW2;
        if (z) {
            this.f60296g = false;
        }
        if (wb1 instanceof CX3) {
            m61706o((CX3) wb1);
        } else if (wb1 instanceof C32002Br2) {
            m61708m((C32002Br2) wb1);
        } else if (wb1 instanceof FW3) {
            m61707n((FW3) wb1);
        } else if (wb1 instanceof VW2) {
            m61709l((VW2) wb1);
        } else if (wb1 instanceof DW2) {
            m61709l((DW2) wb1);
        } else if (z) {
            m61709l((WW2) wb1);
        } else if (wb1 instanceof XB1) {
            m61709l((XB1) wb1);
        } else {
            throw new UnsupportedOperationException(wb1.getClass().getName());
        }
    }

    /* renamed from: l */
    public final void m61709l(XB1 xb1) {
        for (int i = 0; i < xb1.mo77232f0(); i++) {
            m61710k(xb1.mo77236d0(i));
        }
    }

    /* renamed from: m */
    public final void m61708m(C32002Br2 c32002Br2) {
        boolean z;
        C52053yB0[] m114279g = BB0.m114279g(c32002Br2.mo77238Y());
        if (m114279g.length < 2) {
            this.f60299j = true;
            this.f60300k = m114279g[0];
            return;
        }
        C47293q91 c47293q91 = new C47293q91(m114279g, new C35926Sl2(this.f60297h, 0));
        this.f60294e.put(c32002Br2, c47293q91);
        m27206h(c47293q91);
        if (m114279g.length >= 2) {
            z = true;
        } else {
            z = false;
        }
        C4596Ko.m98281d(z, "found LineString with single point");
        m61712A(this.f60297h, m114279g[0]);
        m61712A(this.f60297h, m114279g[m114279g.length - 1]);
    }

    /* renamed from: n */
    public final void m61707n(FW3 fw3) {
        m61711B(this.f60297h, fw3.mo77239W(), 0);
    }

    /* renamed from: o */
    public final void m61706o(CX3 cx3) {
        m61705p(cx3.m112157L0(), 2, 0);
        for (int i = 0; i < cx3.m112155O0(); i++) {
            m61705p(cx3.m112156M0(i), 0, 2);
        }
    }

    /* renamed from: p */
    public final void m61705p(C34108Kr2 c34108Kr2, int i, int i2) {
        if (c34108Kr2.mo77226r0()) {
            return;
        }
        C52053yB0[] m114279g = BB0.m114279g(c34108Kr2.mo77238Y());
        if (m114279g.length < 4) {
            this.f60299j = true;
            this.f60300k = m114279g[0];
            return;
        }
        if (C32534Dy3.m109569c(m114279g)) {
            i2 = i;
            i = i2;
        }
        C47293q91 c47293q91 = new C47293q91(m114279g, new C35926Sl2(this.f60297h, 1, i, i2));
        this.f60294e.put(c34108Kr2, c47293q91);
        m27206h(c47293q91);
        m61711B(this.f60297h, m114279g[0], 1);
    }

    /* renamed from: q */
    public final void m61704q(int i, C52053yB0 c52053yB0, int i2) {
        if (m27205i(i, c52053yB0)) {
            return;
        }
        if (i2 == 1 && this.f60296g) {
            m61712A(i, c52053yB0);
        } else {
            m61711B(i, c52053yB0, i2);
        }
    }

    /* renamed from: r */
    public final void m61703r(int i) {
        for (C47293q91 c47293q91 : this.f96263a) {
            int m84874d = c47293q91.m85838b().m84874d(i);
            Iterator m114324e = c47293q91.f104784g.m114324e();
            while (m114324e.hasNext()) {
                m61704q(i, ((A91) m114324e.next()).f200b, m84874d);
            }
        }
    }

    /* renamed from: s */
    public C36910Wq5 m61702s(C39002cC1 c39002cC1, AbstractC48893sr2 abstractC48893sr2, boolean z) {
        C36910Wq5 c36910Wq5 = new C36910Wq5(abstractC48893sr2, z, true);
        c36910Wq5.m77804i(m61696y(), c39002cC1.m61696y());
        m61699v().mo87226b(this.f96263a, c39002cC1.f96263a, c36910Wq5);
        return c36910Wq5;
    }

    /* renamed from: t */
    public C36910Wq5 m61701t(AbstractC48893sr2 abstractC48893sr2, boolean z) {
        boolean z2;
        boolean z3 = true;
        C36910Wq5 c36910Wq5 = new C36910Wq5(abstractC48893sr2, true, false);
        I91 m61699v = m61699v();
        WB1 wb1 = this.f60293d;
        if (!(wb1 instanceof C34108Kr2) && !(wb1 instanceof CX3) && !(wb1 instanceof WW2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && z2) {
            z3 = false;
        }
        m61699v.mo87227a(this.f96263a, c36910Wq5, z3);
        m61703r(this.f60297h);
        return c36910Wq5;
    }

    /* renamed from: u */
    public void m61700u(List list) {
        for (C47293q91 c47293q91 : this.f96263a) {
            c47293q91.f104784g.m114326c(list);
        }
    }

    /* renamed from: v */
    public final I91 m61699v() {
        return new RA5();
    }

    /* renamed from: x */
    public InterfaceC49573u00 m61697x() {
        return this.f60295f;
    }

    /* renamed from: y */
    public Collection m61696y() {
        if (this.f60298i == null) {
            this.f60298i = this.f96264b.m94322d(this.f60297h);
        }
        return this.f60298i;
    }

    /* renamed from: z */
    public WB1 m61695z() {
        return this.f60293d;
    }
}
