package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* renamed from: F91 */
/* loaded from: classes8.dex */
public class F91 {

    /* renamed from: a */
    public C40414eZ3 f8904a;

    /* renamed from: c */
    public T83 f8906c;

    /* renamed from: e */
    public C45772nb5 f8908e;

    /* renamed from: f */
    public C50671vr2 f8909f;

    /* renamed from: b */
    public List<S83> f8905b = new ArrayList();

    /* renamed from: d */
    public C48772sf1 f8907d = null;

    /* renamed from: g */
    public boolean[] f8910g = new boolean[2];

    public F91(C40414eZ3 c40414eZ3, T83 t83) {
        this.f8904a = c40414eZ3;
        this.f8906c = t83;
    }

    /* renamed from: k */
    public static int m107571k(C34108Kr2 c34108Kr2, boolean z) {
        boolean m109570b = C32534Dy3.m109570b(c34108Kr2.m113440M0());
        if (!z) {
            m109570b = !m109570b;
        }
        return m109570b ? 1 : -1;
    }

    /* renamed from: m */
    public static T83 m107569m(C40414eZ3 c40414eZ3) {
        return new C45043mM5(c40414eZ3);
    }

    /* renamed from: n */
    public static T83 m107568n(boolean z) {
        EE2 ee2 = new EE2();
        ee2.m27686c(new O62(new C31861Bb5()));
        if (z) {
            return new C49410tj6(ee2);
        }
        return ee2;
    }

    /* renamed from: u */
    public static C52053yB0[] m107561u(C32002Br2 c32002Br2) {
        return BB0.m114279g(c32002Br2.mo77238Y());
    }

    /* renamed from: a */
    public final void m107581a(WB1 wb1, int i) {
        if (wb1 == null || wb1.mo77226r0() || m107565q(wb1.m78759Z())) {
            return;
        }
        if (wb1 instanceof CX3) {
            m107575g((CX3) wb1, i);
        } else if (wb1 instanceof C32002Br2) {
            m107577e((C32002Br2) wb1, i);
        } else if (wb1 instanceof DW2) {
            m107580b((DW2) wb1, i);
        } else if (wb1 instanceof WW2) {
            m107580b((WW2) wb1, i);
        } else if (wb1 instanceof XB1) {
            m107578d((XB1) wb1, i, wb1.mo77244F());
        }
    }

    /* renamed from: b */
    public final void m107580b(XB1 xb1, int i) {
        for (int i2 = 0; i2 < xb1.mo77232f0(); i2++) {
            m107581a(xb1.mo77236d0(i2), i);
        }
    }

    /* renamed from: c */
    public final void m107579c(C52053yB0[] c52053yB0Arr, J91 j91) {
        this.f8905b.add(new S83(c52053yB0Arr, j91));
    }

    /* renamed from: d */
    public final void m107578d(XB1 xb1, int i, int i2) {
        for (int i3 = 0; i3 < xb1.mo77232f0(); i3++) {
            WB1 mo77236d0 = xb1.mo77236d0(i3);
            if (mo77236d0.mo77244F() == i2) {
                m107581a(mo77236d0, i);
            } else {
                throw new IllegalArgumentException("Overlay input is mixed-dimension");
            }
        }
    }

    /* renamed from: e */
    public final void m107577e(C32002Br2 c32002Br2, int i) {
        if (c32002Br2.mo77226r0() || m107565q(c32002Br2.m78759Z())) {
            return;
        }
        if (m107564r(c32002Br2)) {
            for (C52053yB0[] c52053yB0Arr : m107563s(c32002Br2)) {
                m107576f(c52053yB0Arr, i);
            }
            return;
        }
        m107576f(m107561u(c32002Br2), i);
    }

    /* renamed from: f */
    public final void m107576f(C52053yB0[] c52053yB0Arr, int i) {
        if (c52053yB0Arr.length < 2) {
            return;
        }
        m107579c(c52053yB0Arr, new J91(i));
    }

    /* renamed from: g */
    public final void m107575g(CX3 cx3, int i) {
        m107574h(cx3.m112157L0(), false, i);
        for (int i2 = 0; i2 < cx3.m112155O0(); i2++) {
            m107574h(cx3.m112156M0(i2), true, i);
        }
    }

    /* renamed from: h */
    public final void m107574h(C34108Kr2 c34108Kr2, boolean z, int i) {
        if (c34108Kr2.mo77226r0() || m107565q(c34108Kr2.m78759Z())) {
            return;
        }
        C52053yB0[] m107572j = m107572j(c34108Kr2);
        if (m107572j.length < 2) {
            return;
        }
        m107579c(m107572j, new J91(i, m107571k(c34108Kr2, z), z));
    }

    /* renamed from: i */
    public List<C47886r91> m107573i(WB1 wb1, WB1 wb12) {
        m107581a(wb1, 0);
        m107581a(wb12, 1);
        return E91.m109342a(m107562t(this.f8905b));
    }

    /* renamed from: j */
    public final C52053yB0[] m107572j(C34108Kr2 c34108Kr2) {
        C52053yB0[] mo77238Y = c34108Kr2.mo77238Y();
        C48772sf1 m78759Z = c34108Kr2.m78759Z();
        if (this.f8908e != null && !this.f8907d.m13879f(m78759Z)) {
            return this.f8908e.m23476a(mo77238Y);
        }
        return m107561u(c34108Kr2);
    }

    /* renamed from: l */
    public final List<C47886r91> m107570l(Collection<InterfaceC39410cr5> collection) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC39410cr5 interfaceC39410cr5 : collection) {
            if (!C47886r91.m16343j(interfaceC39410cr5.mo44967h())) {
                J91 j91 = (J91) interfaceC39410cr5.getData();
                this.f8910g[j91.m101079c()] = true;
                arrayList.add(new C47886r91(interfaceC39410cr5.mo44967h(), j91));
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final T83 m107567o() {
        T83 t83 = this.f8906c;
        if (t83 != null) {
            return t83;
        }
        if (C52047yA3.m3999h(this.f8904a)) {
            return m107568n(true);
        }
        return m107569m(this.f8904a);
    }

    /* renamed from: p */
    public boolean m107566p(int i) {
        return this.f8910g[i];
    }

    /* renamed from: q */
    public final boolean m107565q(C48772sf1 c48772sf1) {
        C48772sf1 c48772sf12 = this.f8907d;
        if (c48772sf12 == null) {
            return false;
        }
        return c48772sf12.m13878g(c48772sf1);
    }

    /* renamed from: r */
    public final boolean m107564r(C32002Br2 c32002Br2) {
        C52053yB0[] mo77238Y = c32002Br2.mo77238Y();
        if (this.f8909f == null || mo77238Y.length <= 20) {
            return false;
        }
        if (this.f8907d.m13879f(c32002Br2.m78759Z())) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final List<C52053yB0[]> m107563s(C32002Br2 c32002Br2) {
        return this.f8909f.m7920f(c32002Br2.mo77238Y());
    }

    /* renamed from: t */
    public final List<C47886r91> m107562t(List<S83> list) {
        T83 m107567o = m107567o();
        m107567o.mo11840a(list);
        return m107570l(m107567o.mo11839b());
    }

    /* renamed from: v */
    public void m107560v(C48772sf1 c48772sf1) {
        this.f8907d = c48772sf1;
        this.f8908e = new C45772nb5(c48772sf1);
        this.f8909f = new C50671vr2(c48772sf1);
    }
}
