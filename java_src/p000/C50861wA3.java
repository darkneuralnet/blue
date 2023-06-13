package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: wA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50861wA3 extends C39613dC1 {

    /* renamed from: d */
    public final MW3 f115434d;

    /* renamed from: e */
    public C38409bC1 f115435e;

    /* renamed from: f */
    public WB1 f115436f;

    /* renamed from: g */
    public C44529lV3 f115437g;

    /* renamed from: h */
    public D91 f115438h;

    /* renamed from: i */
    public List f115439i;

    /* renamed from: j */
    public List f115440j;

    /* renamed from: k */
    public List f115441k;

    public C50861wA3(WB1 wb1, WB1 wb12) {
        super(wb1, wb12);
        this.f115434d = new MW3();
        this.f115438h = new D91();
        this.f115439i = new ArrayList();
        this.f115440j = new ArrayList();
        this.f115441k = new ArrayList();
        this.f115437g = new C44529lV3(new C50268vA3());
        this.f115435e = wb1.m78758c0();
    }

    /* renamed from: h */
    public static WB1 m7334h(int i, WB1 wb1, WB1 wb12, C38409bC1 c38409bC1) {
        return c38409bC1.m64853b(m7318x(i, wb1, wb12));
    }

    /* renamed from: q */
    public static boolean m7325q(int i, int i2, int i3) {
        if (i == 1) {
            i = 0;
        }
        if (i2 == 1) {
            i2 = 0;
        }
        if (i3 == 1) {
            return i == 0 && i2 == 0;
        } else if (i3 == 2) {
            return i == 0 || i2 == 0;
        } else if (i3 == 3) {
            return i == 0 && i2 != 0;
        } else if (i3 != 4) {
            return false;
        } else {
            return (i == 0 && i2 != 0) || (i != 0 && i2 == 0);
        }
    }

    /* renamed from: r */
    public static boolean m7324r(C35926Sl2 c35926Sl2, int i) {
        return m7325q(c35926Sl2.m84874d(0), c35926Sl2.m84874d(1), i);
    }

    /* renamed from: v */
    public static WB1 m7320v(WB1 wb1, WB1 wb12, int i) {
        return new C50861wA3(wb1, wb12).m7331k(i);
    }

    /* renamed from: x */
    public static int m7318x(int i, WB1 wb1, WB1 wb12) {
        int mo77244F = wb1.mo77244F();
        int mo77244F2 = wb12.mo77244F();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return -1;
                    }
                    return Math.max(mo77244F, mo77244F2);
                }
                return mo77244F;
            }
            return Math.max(mo77244F, mo77244F2);
        }
        return Math.min(mo77244F, mo77244F2);
    }

    /* renamed from: b */
    public final void m7340b() {
        for (C43685k41 c43685k41 : this.f115437g.m27210d()) {
            C43685k41 m29370o = c43685k41.m29370o();
            if (c43685k41.m29368q() && m29370o.m29368q()) {
                c43685k41.m29363v(false);
                m29370o.m29363v(false);
            }
        }
    }

    /* renamed from: c */
    public final WB1 m7339c(List list, List list2, List list3, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        if (arrayList.isEmpty()) {
            return m7334h(i, this.f76259c[0].m61695z(), this.f76259c[1].m61695z(), this.f115435e);
        }
        return this.f115435e.m64854a(arrayList);
    }

    /* renamed from: d */
    public final void m7338d() {
        for (D83 d83 : this.f115437g.m27207g()) {
            d83.m110883k().mo1761b(this.f76259c);
        }
        m7321u();
        m7317y();
    }

    /* renamed from: e */
    public final void m7337e() {
        Iterator m110869e = this.f115438h.m110869e();
        while (m110869e.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) m110869e.next();
            C35926Sl2 m85838b = c47293q91.m85838b();
            C47796r01 m18067o = c47293q91.m18067o();
            if (!m18067o.m16696e()) {
                m18067o.m16693h();
                for (int i = 0; i < 2; i++) {
                    if (!m85838b.m84868j(i) && m85838b.m84871g() && !m18067o.m16695f(i)) {
                        if (m18067o.m16698c(i) == 0) {
                            m85838b.m84862p(i);
                        } else {
                            C4596Ko.m98281d(!m18067o.m16694g(i, 1), "depth of LEFT side has not been initialized");
                            m85838b.m84863o(i, 1, m18067o.m16697d(i, 1));
                            C4596Ko.m98281d(true ^ m18067o.m16694g(i, 2), "depth of RIGHT side has not been initialized");
                            m85838b.m84863o(i, 2, m18067o.m16697d(i, 2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void m7336f(int i) {
        m7335g(0);
        m7335g(1);
        this.f76259c[0].m61701t(this.f76257a, false);
        this.f76259c[1].m61701t(this.f76257a, false);
        C39002cC1[] c39002cC1Arr = this.f76259c;
        c39002cC1Arr[0].m61702s(c39002cC1Arr[1], this.f76257a, true);
        ArrayList arrayList = new ArrayList();
        this.f76259c[0].m61700u(arrayList);
        this.f76259c[1].m61700u(arrayList);
        m7329m(arrayList);
        m7337e();
        m7319w();
        G91.m105696b(this.f115438h.m110870d());
        this.f115437g.m27212b(this.f115438h.m110870d());
        m7338d();
        m7322t();
        m7333i(i);
        m7340b();
        FX3 fx3 = new FX3(this.f115435e);
        fx3.m107038a(this.f115437g);
        this.f115439i = fx3.m107031h();
        this.f115440j = new C42964ir2(this, this.f115435e, this.f115434d).m31756a(i);
        List m103798a = new HW3(this, this.f115435e, this.f115434d).m103798a(i);
        this.f115441k = m103798a;
        this.f115436f = m7339c(m103798a, this.f115440j, this.f115439i, i);
    }

    /* renamed from: g */
    public final void m7335g(int i) {
        Iterator m27208f = this.f76259c[i].m27208f();
        while (m27208f.hasNext()) {
            D83 d83 = (D83) m27208f.next();
            this.f115437g.m27211c(d83.m110884j()).m110880n(i, d83.m85838b().m84874d(i));
        }
    }

    /* renamed from: i */
    public final void m7333i(int i) {
        for (C43685k41 c43685k41 : this.f115437g.m27210d()) {
            C35926Sl2 mo5787f = c43685k41.mo5787f();
            if (mo5787f.m84871g() && !c43685k41.m29367r() && m7325q(mo5787f.m84873e(0, 2), mo5787f.m84873e(1, 2), i)) {
                c43685k41.m29363v(true);
            }
        }
    }

    /* renamed from: j */
    public C44529lV3 m7332j() {
        return this.f115437g;
    }

    /* renamed from: k */
    public WB1 m7331k(int i) {
        m7336f(i);
        return this.f115436f;
    }

    /* renamed from: l */
    public void m7330l(C47293q91 c47293q91) {
        C47293q91 m110871c = this.f115438h.m110871c(c47293q91);
        if (m110871c != null) {
            C35926Sl2 m85838b = m110871c.m85838b();
            C35926Sl2 m85838b2 = c47293q91.m85838b();
            if (!m110871c.m18060v(c47293q91)) {
                m85838b2 = new C35926Sl2(c47293q91.m85838b());
                m85838b2.m84876b();
            }
            C47796r01 m18067o = m110871c.m18067o();
            if (m18067o.m16696e()) {
                m18067o.m16700a(m85838b);
            }
            m18067o.m16700a(m85838b2);
            m85838b.m84867k(m85838b2);
            return;
        }
        this.f115438h.m110873a(c47293q91);
    }

    /* renamed from: m */
    public final void m7329m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m7330l((C47293q91) it.next());
        }
    }

    /* renamed from: n */
    public final boolean m7328n(C52053yB0 c52053yB0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this.f115434d.m95239b(c52053yB0, (WB1) it.next()) != 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m7327o(C52053yB0 c52053yB0) {
        return m7328n(c52053yB0, this.f115439i);
    }

    /* renamed from: p */
    public boolean m7326p(C52053yB0 c52053yB0) {
        if (m7328n(c52053yB0, this.f115440j) || m7328n(c52053yB0, this.f115439i)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m7323s(D83 d83, int i) {
        d83.m85838b().m84864n(i, this.f115434d.m95239b(d83.m110884j(), this.f76259c[i].m61695z()));
    }

    /* renamed from: t */
    public final void m7322t() {
        for (D83 d83 : this.f115437g.m27207g()) {
            C35926Sl2 m85838b = d83.m85838b();
            if (d83.m110881m()) {
                if (m85838b.m84868j(0)) {
                    m7323s(d83, 0);
                } else {
                    m7323s(d83, 1);
                }
            }
            ((C44278l41) d83.m110883k()).m27967r(m85838b);
        }
    }

    /* renamed from: u */
    public final void m7321u() {
        for (D83 d83 : this.f115437g.m27207g()) {
            ((C44278l41) d83.m110883k()).m27968q();
        }
    }

    /* renamed from: w */
    public final void m7319w() {
        ArrayList arrayList = new ArrayList();
        Iterator m110869e = this.f115438h.m110869e();
        while (m110869e.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) m110869e.next();
            if (c47293q91.m18062t()) {
                m110869e.remove();
                arrayList.add(c47293q91.m18071k());
            }
        }
        this.f115438h.m110872b(arrayList);
    }

    /* renamed from: y */
    public final void m7317y() {
        for (D83 d83 : this.f115437g.m27207g()) {
            d83.m85838b().m84867k(((C44278l41) d83.m110883k()).m27973l());
        }
    }
}
