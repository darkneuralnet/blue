package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: sA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48490sA3 {

    /* renamed from: a */
    public final int f108412a;

    /* renamed from: b */
    public final C40414eZ3 f108413b;

    /* renamed from: c */
    public final WB1 f108414c;

    /* renamed from: d */
    public final WB1 f108415d;

    /* renamed from: e */
    public final C38409bC1 f108416e;

    /* renamed from: f */
    public final boolean f108417f;

    /* renamed from: g */
    public WB1 f108418g;

    /* renamed from: h */
    public int f108419h;

    /* renamed from: i */
    public NW3 f108420i;

    /* renamed from: j */
    public int f108421j;

    public C48490sA3(int i, WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3) {
        this.f108412a = i;
        this.f108413b = c40414eZ3;
        this.f108416e = wb1.m78758c0();
        this.f108421j = C52047yA3.m3994m(i, wb1.mo77244F(), wb12.mo77244F());
        if (wb1.mo77244F() == 0) {
            this.f108414c = wb1;
            this.f108415d = wb12;
            this.f108417f = false;
            return;
        }
        this.f108414c = wb12;
        this.f108415d = wb1;
        this.f108417f = true;
    }

    /* renamed from: h */
    public static C52053yB0[] m14602h(WB1 wb1, C40414eZ3 c40414eZ3) {
        DB0 db0 = new DB0();
        int mo77232f0 = wb1.mo77232f0();
        for (int i = 0; i < mo77232f0; i++) {
            FW3 fw3 = (FW3) wb1.mo77236d0(i);
            if (!fw3.mo77226r0()) {
                db0.m110797f(C52047yA3.m3992o(fw3, c40414eZ3), true);
            }
        }
        return db0.m110799b2();
    }

    /* renamed from: i */
    public static List<C32002Br2> m14601i(WB1 wb1) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < wb1.mo77232f0(); i++) {
            C32002Br2 c32002Br2 = (C32002Br2) wb1.mo77236d0(i);
            if (!c32002Br2.mo77226r0()) {
                arrayList.add(c32002Br2);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static List<CX3> m14600j(WB1 wb1) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < wb1.mo77232f0(); i++) {
            CX3 cx3 = (CX3) wb1.mo77236d0(i);
            if (!cx3.mo77226r0()) {
                arrayList.add(cx3);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static WB1 m14596n(int i, WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3) {
        return new C48490sA3(i, wb1, wb12, c40414eZ3).m14598l();
    }

    /* renamed from: a */
    public final WB1 m14609a(C52053yB0[] c52053yB0Arr) {
        if (this.f108417f) {
            return m14606d();
        }
        return m14604f(m14599k(false, c52053yB0Arr));
    }

    /* renamed from: b */
    public final WB1 m14608b(C52053yB0[] c52053yB0Arr) {
        return m14604f(m14599k(true, c52053yB0Arr));
    }

    /* renamed from: c */
    public final WB1 m14607c(C52053yB0[] c52053yB0Arr) {
        List<C32002Br2> list;
        List<FW3> m14599k = m14599k(false, c52053yB0Arr);
        List<CX3> list2 = null;
        if (this.f108419h == 1) {
            list = m14601i(this.f108418g);
        } else {
            list = null;
        }
        if (this.f108419h == 2) {
            list2 = m14600j(this.f108418g);
        }
        return C52047yA3.m4004c(list2, list, m14599k, this.f108416e);
    }

    /* renamed from: d */
    public final WB1 m14606d() {
        WB1 wb1 = this.f108415d;
        WB1 wb12 = this.f108418g;
        if (wb1 != wb12) {
            return wb12;
        }
        return wb12.m78752m();
    }

    /* renamed from: e */
    public final NW3 m14605e(WB1 wb1) {
        if (this.f108419h == 2) {
            return new C50770w12(wb1);
        }
        return new C51363x12(wb1);
    }

    /* renamed from: f */
    public final WB1 m14604f(List<FW3> list) {
        if (list.size() == 0) {
            return this.f108416e.m64853b(0);
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return this.f108416e.m64840o(C38409bC1.m64856F(list));
    }

    /* renamed from: g */
    public final List<FW3> m14603g(Set<C52053yB0> set) {
        ArrayList arrayList = new ArrayList();
        for (C52053yB0 c52053yB0 : set) {
            arrayList.add(this.f108416e.m64835t(c52053yB0));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final List<FW3> m14599k(boolean z, C52053yB0[] c52053yB0Arr) {
        HashSet hashSet = new HashSet();
        for (C52053yB0 c52053yB0 : c52053yB0Arr) {
            if (m14597m(z, c52053yB0)) {
                hashSet.add(c52053yB0.mo3888e());
            }
        }
        return m14603g(hashSet);
    }

    /* renamed from: l */
    public WB1 m14598l() {
        WB1 m14595o = m14595o(this.f108415d);
        this.f108418g = m14595o;
        this.f108419h = m14595o.mo77244F();
        this.f108420i = m14605e(this.f108418g);
        C52053yB0[] m14602h = m14602h(this.f108414c, this.f108413b);
        int i = this.f108412a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C4596Ko.m98279f("Unknown overlay op code");
                        return null;
                    }
                } else {
                    return m14609a(m14602h);
                }
            }
            return m14607c(m14602h);
        }
        return m14608b(m14602h);
    }

    /* renamed from: m */
    public final boolean m14597m(boolean z, C52053yB0 c52053yB0) {
        boolean z2 = 2 == this.f108420i.mo5981a(c52053yB0);
        return z ? !z2 : z2;
    }

    /* renamed from: o */
    public final WB1 m14595o(WB1 wb1) {
        if (this.f108421j == 0) {
            return wb1;
        }
        return C49083tA3.m12938o(this.f108415d, this.f108413b);
    }
}
