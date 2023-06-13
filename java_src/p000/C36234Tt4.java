package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: Tt4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36234Tt4 {

    /* renamed from: c */
    public C39002cC1[] f36411c;

    /* renamed from: a */
    public AbstractC48893sr2 f36409a = new C31861Bb5();

    /* renamed from: b */
    public MW3 f36410b = new MW3();

    /* renamed from: d */
    public N83 f36412d = new N83(new C36702Vt4());

    /* renamed from: e */
    public P62 f36413e = null;

    /* renamed from: f */
    public ArrayList f36414f = new ArrayList();

    public C36234Tt4(C39002cC1[] c39002cC1Arr) {
        this.f36411c = c39002cC1Arr;
    }

    /* renamed from: f */
    public static int m82308f(WB1 wb1, InterfaceC49573u00 interfaceC49573u00) {
        if (C50166v00.m9397h(wb1, interfaceC49573u00)) {
            if (wb1.mo77244F() == 1) {
                return 0;
            }
            return wb1.mo77240P();
        }
        return -1;
    }

    /* renamed from: a */
    public final void m82313a(P62 p62, InterfaceC49573u00 interfaceC49573u00) {
        WB1 m61695z = this.f36411c[0].m61695z();
        if (!m61695z.mo77226r0()) {
            p62.m90809m(0, 2, m61695z.mo77244F());
            p62.m90809m(1, 2, m82308f(m61695z, interfaceC49573u00));
        }
        WB1 m61695z2 = this.f36411c[1].m61695z();
        if (!m61695z2.mo77226r0()) {
            p62.m90809m(2, 0, m61695z2.mo77244F());
            p62.m90809m(2, 1, m82308f(m61695z2, interfaceC49573u00));
        }
    }

    /* renamed from: b */
    public P62 m82312b() {
        P62 p62 = new P62();
        p62.m90809m(2, 2, 2);
        if (!this.f36411c[0].m61695z().m78759Z().m13887K(this.f36411c[1].m61695z().m78759Z())) {
            m82313a(p62, this.f36411c[0].m61697x());
            return p62;
        }
        this.f36411c[0].m61701t(this.f36409a, false);
        this.f36411c[1].m61701t(this.f36409a, false);
        C39002cC1[] c39002cC1Arr = this.f36411c;
        C36910Wq5 m61702s = c39002cC1Arr[0].m61702s(c39002cC1Arr[1], this.f36409a, false);
        m82311c(0);
        m82311c(1);
        m82309e(0);
        m82309e(1);
        m82303k();
        m82310d(m61702s, p62);
        C50849w91 c50849w91 = new C50849w91();
        m82307g(c50849w91.m7354a(this.f36411c[0].m27209e()));
        m82307g(c50849w91.m7354a(this.f36411c[1].m27209e()));
        m82302l();
        m82305i(0, 1);
        m82305i(1, 0);
        m82301m(p62);
        return p62;
    }

    /* renamed from: c */
    public final void m82311c(int i) {
        Iterator m27209e = this.f36411c[i].m27209e();
        while (m27209e.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) m27209e.next();
            int m84874d = c47293q91.m85838b().m84874d(i);
            Iterator m114324e = c47293q91.m18066p().m114324e();
            while (m114324e.hasNext()) {
                C36468Ut4 c36468Ut4 = (C36468Ut4) this.f36412d.m94324b(((A91) m114324e.next()).f200b);
                if (m84874d == 1) {
                    c36468Ut4.m110879o(i);
                } else if (c36468Ut4.m85838b().m84868j(i)) {
                    c36468Ut4.m110880n(i, 0);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m82310d(C36910Wq5 c36910Wq5, P62 p62) {
        int mo77244F = this.f36411c[0].m61695z().mo77244F();
        int mo77244F2 = this.f36411c[1].m61695z().mo77244F();
        boolean m77810c = c36910Wq5.m77810c();
        boolean m77811b = c36910Wq5.m77811b();
        if (mo77244F == 2 && mo77244F2 == 2) {
            if (m77810c) {
                p62.m90806p("212101212");
            }
        } else if (mo77244F == 2 && mo77244F2 == 1) {
            if (m77810c) {
                p62.m90806p("FFF0FFFF2");
            }
            if (m77811b) {
                p62.m90806p("1FFFFF1FF");
            }
        } else if (mo77244F == 1 && mo77244F2 == 2) {
            if (m77810c) {
                p62.m90806p("F0FFFFFF2");
            }
            if (m77811b) {
                p62.m90806p("1F1FFFFFF");
            }
        } else if (mo77244F == 1 && mo77244F2 == 1 && m77811b) {
            p62.m90806p("0FFFFFFFF");
        }
    }

    /* renamed from: e */
    public final void m82309e(int i) {
        Iterator m27208f = this.f36411c[i].m27208f();
        while (m27208f.hasNext()) {
            D83 d83 = (D83) m27208f.next();
            this.f36412d.m94324b(d83.m110884j()).m110880n(i, d83.m85838b().m84874d(i));
        }
    }

    /* renamed from: g */
    public final void m82307g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f36412d.m94325a((C50256v91) it.next());
        }
    }

    /* renamed from: h */
    public final void m82306h(C47293q91 c47293q91, int i, WB1 wb1) {
        if (wb1.mo77244F() > 0) {
            c47293q91.m85838b().m84866l(i, this.f36410b.m95239b(c47293q91.m18070l(), wb1));
            return;
        }
        c47293q91.m85838b().m84866l(i, 2);
    }

    /* renamed from: i */
    public final void m82305i(int i, int i2) {
        Iterator m27209e = this.f36411c[i].m27209e();
        while (m27209e.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) m27209e.next();
            if (c47293q91.m18061u()) {
                m82306h(c47293q91, i2, this.f36411c[i2].m61695z());
                this.f36414f.add(c47293q91);
            }
        }
    }

    /* renamed from: j */
    public final void m82304j(D83 d83, int i) {
        d83.m85838b().m84866l(i, this.f36410b.m95239b(d83.m110884j(), this.f36411c[i].m61695z()));
    }

    /* renamed from: k */
    public final void m82303k() {
        boolean z;
        Iterator m94321e = this.f36412d.m94321e();
        while (m94321e.hasNext()) {
            D83 d83 = (D83) m94321e.next();
            C35926Sl2 m85838b = d83.m85838b();
            if (m85838b.m84875c() > 0) {
                z = true;
            } else {
                z = false;
            }
            C4596Ko.m98281d(z, "node with empty label found");
            if (d83.m110881m()) {
                if (m85838b.m84868j(0)) {
                    m82304j(d83, 0);
                } else {
                    m82304j(d83, 1);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m82302l() {
        Iterator m94321e = this.f36412d.m94321e();
        while (m94321e.hasNext()) {
            ((C36468Ut4) m94321e.next()).m110883k().mo1761b(this.f36411c);
        }
    }

    /* renamed from: m */
    public final void m82301m(P62 p62) {
        Iterator it = this.f36414f.iterator();
        while (it.hasNext()) {
            ((C47293q91) it.next()).m85832h(p62);
        }
        Iterator m94321e = this.f36412d.m94321e();
        while (m94321e.hasNext()) {
            C36468Ut4 c36468Ut4 = (C36468Ut4) m94321e.next();
            c36468Ut4.m85832h(p62);
            c36468Ut4.m80659p(p62);
        }
    }
}
