package p000;

import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: tA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49083tA3 {

    /* renamed from: a */
    public int f109972a;

    /* renamed from: b */
    public C40711f32 f109973b;

    /* renamed from: c */
    public C38409bC1 f109974c;

    /* renamed from: d */
    public C40414eZ3 f109975d;

    /* renamed from: e */
    public T83 f109976e;

    /* renamed from: f */
    public boolean f109977f;

    /* renamed from: g */
    public boolean f109978g;

    /* renamed from: h */
    public boolean f109979h;

    /* renamed from: i */
    public boolean f109980i;

    /* renamed from: j */
    public boolean f109981j;

    /* renamed from: k */
    public boolean f109982k;

    public C49083tA3(WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3, int i) {
        this.f109977f = false;
        this.f109978g = true;
        this.f109979h = false;
        this.f109980i = false;
        this.f109981j = false;
        this.f109982k = false;
        this.f109975d = c40414eZ3;
        this.f109972a = i;
        this.f109974c = wb1.m78758c0();
        this.f109973b = new C40711f32(wb1, wb12);
    }

    /* renamed from: f */
    public static boolean m12947f(List list) {
        return list == null || list.size() == 0;
    }

    /* renamed from: g */
    public static boolean m12946g(int i, int i2, int i3) {
        if (i2 == 1) {
            i2 = 0;
        }
        if (i3 == 1) {
            i3 = 0;
        }
        if (i == 1) {
            return i2 == 0 && i3 == 0;
        } else if (i == 2) {
            return i2 == 0 || i3 == 0;
        } else if (i == 3) {
            return i2 == 0 && i3 != 0;
        } else if (i != 4) {
            return false;
        } else {
            return (i2 == 0 && i3 != 0) || (i2 != 0 && i3 == 0);
        }
    }

    /* renamed from: j */
    public static WB1 m12943j(WB1 wb1, WB1 wb12, int i) {
        return new C49083tA3(wb1, wb12, i).m12948e();
    }

    /* renamed from: k */
    public static WB1 m12942k(WB1 wb1, WB1 wb12, int i, T83 t83) {
        C49083tA3 c49083tA3 = new C49083tA3(wb1, wb12, null, i);
        c49083tA3.m12940m(t83);
        return c49083tA3.m12948e();
    }

    /* renamed from: l */
    public static WB1 m12941l(WB1 wb1, WB1 wb12, int i, C40414eZ3 c40414eZ3) {
        return new C49083tA3(wb1, wb12, c40414eZ3, i).m12948e();
    }

    /* renamed from: o */
    public static WB1 m12938o(WB1 wb1, C40414eZ3 c40414eZ3) {
        return new C49083tA3(wb1, c40414eZ3).m12948e();
    }

    /* renamed from: a */
    public final C46712pA3 m12952a(Collection<C47886r91> collection) {
        C46712pA3 c46712pA3 = new C46712pA3();
        for (C47886r91 c47886r91 : collection) {
            c46712pA3.m19850a(c47886r91.m16347f(), c47886r91.m16351b());
        }
        return c46712pA3;
    }

    /* renamed from: b */
    public final WB1 m12951b() {
        C46712pA3 m12952a = m12952a(m12944i());
        if (this.f109982k) {
            return C52047yA3.m3989r(m12952a, this.f109980i, this.f109974c);
        }
        m12945h(m12952a);
        boolean z = this.f109980i;
        if (!z && !this.f109981j) {
            WB1 m12949d = m12949d(this.f109972a, m12952a);
            if (C52047yA3.m3999h(this.f109975d) && !C52047yA3.m3996k(this.f109973b.m42228d(0), this.f109973b.m42228d(1), this.f109972a, m12949d)) {
                throw new TopologyException("Result area inconsistent with overlay operation");
            }
            return m12949d;
        }
        return C52047yA3.m3989r(m12952a, z, this.f109974c);
    }

    /* renamed from: c */
    public final WB1 m12950c() {
        return C52047yA3.m4005b(C52047yA3.m3994m(this.f109972a, this.f109973b.m42230b(0), this.f109973b.m42230b(1)), this.f109974c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* renamed from: d */
    public final WB1 m12949d(int i, C46712pA3 c46712pA3) {
        boolean z;
        List<FW3> list;
        boolean z2;
        List<C32002Br2> list2;
        boolean z3;
        boolean z4 = !this.f109977f;
        List<CX3> m108849h = new EX3(c46712pA3.m19847d(), this.f109974c).m108849h();
        boolean z5 = false;
        if (m108849h.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        List<FW3> list3 = null;
        if (!this.f109979h) {
            if (z && !z4 && i != 4 && i != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C42371hr2 c42371hr2 = new C42371hr2(this.f109973b, c46712pA3, z, i, this.f109974c);
                c42371hr2.m35755f(this.f109977f);
                list2 = c42371hr2.m35758c();
            } else {
                list2 = null;
            }
            if (!z && list2.size() <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || z4) {
                z5 = true;
            }
            if (i == 1 && z5) {
                Q62 q62 = new Q62(c46712pA3, this.f109974c);
                q62.m88914e(this.f109977f);
                list3 = q62.m88917b();
            }
            list = list3;
            list3 = list2;
        } else {
            list = null;
        }
        if (m12947f(m108849h) && m12947f(list3) && m12947f(list)) {
            return m12950c();
        }
        return C52047yA3.m4004c(m108849h, list3, list, this.f109974c);
    }

    /* renamed from: e */
    public WB1 m12948e() {
        WB1 m12951b;
        if (C52047yA3.m4001f(this.f109972a, this.f109973b.m42228d(0), this.f109973b.m42228d(1), this.f109975d)) {
            return m12950c();
        }
        C44572la1 m27142c = C44572la1.m27142c(this.f109973b.m42228d(0), this.f109973b.m42228d(1));
        if (this.f109973b.m42224h()) {
            m12951b = C51454xA3.m5759g(this.f109972a, this.f109973b.m42228d(0), this.f109973b.m42228d(1), this.f109975d);
        } else if (!this.f109973b.m42221k() && this.f109973b.m42225g()) {
            m12951b = C48490sA3.m14596n(this.f109972a, this.f109973b.m42228d(0), this.f109973b.m42228d(1), this.f109975d);
        } else {
            m12951b = m12951b();
        }
        m27142c.m27138g(m12951b);
        return m12951b;
    }

    /* renamed from: h */
    public final void m12945h(C46712pA3 c46712pA3) {
        C47898rA3 c47898rA3 = new C47898rA3(c46712pA3, this.f109973b);
        c47898rA3.m16306a();
        c47898rA3.m16295l(this.f109972a);
        c47898rA3.m16291p();
    }

    /* renamed from: i */
    public final List<C47886r91> m12944i() {
        C48772sf1 m4006a;
        F91 f91 = new F91(this.f109975d, this.f109976e);
        if (this.f109978g && (m4006a = C52047yA3.m4006a(this.f109972a, this.f109973b, this.f109975d)) != null) {
            f91.m107560v(m4006a);
        }
        List<C47886r91> m107573i = f91.m107573i(this.f109973b.m42228d(0), this.f109973b.m42228d(1));
        this.f109973b.m42219m(0, !f91.m107566p(0));
        this.f109973b.m42219m(1, !f91.m107566p(1));
        return m107573i;
    }

    /* renamed from: m */
    public void m12940m(T83 t83) {
        this.f109976e = t83;
    }

    /* renamed from: n */
    public void m12939n(boolean z) {
        this.f109977f = z;
    }

    public C49083tA3(WB1 wb1, WB1 wb12, int i) {
        this(wb1, wb12, wb1.m78758c0().m64860B(), i);
    }

    public C49083tA3(WB1 wb1, C40414eZ3 c40414eZ3) {
        this(wb1, null, c40414eZ3, 2);
    }
}
