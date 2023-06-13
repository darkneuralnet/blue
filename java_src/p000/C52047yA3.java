package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: yA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C52047yA3 {
    /* renamed from: a */
    public static C48772sf1 m4006a(int i, C40711f32 c40711f32, C40414eZ3 c40414eZ3) {
        C48772sf1 m3993n = m3993n(i, c40711f32, c40414eZ3);
        if (m3993n == null) {
            return null;
        }
        return m3991p(C31627Ab5.m115485g(c40711f32.m42228d(0), c40711f32.m42228d(1), m3993n), c40414eZ3);
    }

    /* renamed from: b */
    public static WB1 m4005b(int i, C38409bC1 c38409bC1) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        C4596Ko.m98279f("Unable to determine overlay result geometry dimension");
                        return null;
                    }
                    return c38409bC1.m64833v();
                }
                return c38409bC1.m64850e();
            }
            return c38409bC1.m64836s();
        }
        return c38409bC1.m64852c();
    }

    /* renamed from: c */
    public static WB1 m4004c(List<CX3> list, List<C32002Br2> list2, List<FW3> list3, C38409bC1 c38409bC1) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return c38409bC1.m64854a(arrayList);
    }

    /* renamed from: d */
    public static boolean m4003d(C48772sf1 c48772sf1, C48772sf1 c48772sf12, C40414eZ3 c40414eZ3) {
        if (c40414eZ3.m42761e(c48772sf12.m13869p()) > c40414eZ3.m42761e(c48772sf1.m13871n()) || c40414eZ3.m42761e(c48772sf12.m13871n()) < c40414eZ3.m42761e(c48772sf1.m13869p()) || c40414eZ3.m42761e(c48772sf12.m13868q()) > c40414eZ3.m42761e(c48772sf1.m13870o()) || c40414eZ3.m42761e(c48772sf12.m13870o()) < c40414eZ3.m42761e(c48772sf1.m13868q())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m4002e(WB1 wb1) {
        return wb1 == null || wb1.mo77226r0();
    }

    /* renamed from: f */
    public static boolean m4001f(int i, WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                } else if (m4002e(wb1)) {
                    return true;
                } else {
                    return false;
                }
            }
            if (m4002e(wb1) && m4002e(wb12)) {
                return true;
            }
            return false;
        } else if (m4000g(wb1, wb12, c40414eZ3)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m4000g(WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3) {
        if (!m4002e(wb1) && !m4002e(wb12)) {
            if (m3999h(c40414eZ3)) {
                return wb1.m78759Z().m13878g(wb12.m78759Z());
            }
            return m4003d(wb1.m78759Z(), wb12.m78759Z(), c40414eZ3);
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m3999h(C40414eZ3 c40414eZ3) {
        if (c40414eZ3 == null) {
            return true;
        }
        return c40414eZ3.m42762d();
    }

    /* renamed from: i */
    public static boolean m3998i(double d, double d2, double d3) {
        return d >= d2 * (1.0d - d3);
    }

    /* renamed from: j */
    public static boolean m3997j(double d, double d2, double d3) {
        return d <= d2 * (d3 + 1.0d);
    }

    /* renamed from: k */
    public static boolean m3996k(WB1 wb1, WB1 wb12, int i, WB1 wb13) {
        if (wb1 == null || wb12 == null) {
            return true;
        }
        double mo77242M = wb13.mo77242M();
        double mo77242M2 = wb1.mo77242M();
        double mo77242M3 = wb12.mo77242M();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return true;
                    }
                    return m3997j(mo77242M, mo77242M2 + mo77242M3, 0.1d);
                } else if (m3997j(mo77242M, mo77242M2, 0.1d) && m3998i(mo77242M, mo77242M2 - mo77242M3, 0.1d)) {
                    return true;
                }
            } else if (m3997j(mo77242M2, mo77242M, 0.1d) && m3997j(mo77242M3, mo77242M, 0.1d) && m3998i(mo77242M, mo77242M2 - mo77242M3, 0.1d)) {
                return true;
            }
        } else if (m3997j(mo77242M, mo77242M2, 0.1d) && m3997j(mo77242M, mo77242M3, 0.1d)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static String m3995l(C45526nA3 c45526nA3) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(c45526nA3.m24237x().m18027F(c45526nA3.m24235z()));
        if (c45526nA3.m24266B()) {
            str = " Res";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: m */
    public static int m3994m(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return -1;
                    }
                    return Math.max(i2, i3);
                }
                return i2;
            }
            return Math.max(i2, i3);
        }
        return Math.min(i2, i3);
    }

    /* renamed from: n */
    public static C48772sf1 m3993n(int i, C40711f32 c40711f32, C40414eZ3 c40414eZ3) {
        if (i != 1) {
            if (i != 3) {
                return null;
            }
            return m3991p(c40711f32.m42229c(0), c40414eZ3);
        }
        return m3991p(c40711f32.m42229c(0), c40414eZ3).m13863v(m3991p(c40711f32.m42229c(1), c40414eZ3));
    }

    /* renamed from: o */
    public static C52053yB0 m3992o(FW3 fw3, C40414eZ3 c40414eZ3) {
        if (fw3.mo77226r0()) {
            return null;
        }
        C52053yB0 mo3888e = fw3.mo77239W().mo3888e();
        if (!m3999h(c40414eZ3)) {
            c40414eZ3.m42760f(mo3888e);
        }
        return mo3888e;
    }

    /* renamed from: p */
    public static C48772sf1 m3991p(C48772sf1 c48772sf1, C40414eZ3 c40414eZ3) {
        double m3990q = m3990q(c48772sf1, c40414eZ3);
        C48772sf1 m13882c = c48772sf1.m13882c();
        m13882c.m13877h(m3990q);
        return m13882c;
    }

    /* renamed from: q */
    public static double m3990q(C48772sf1 c48772sf1, C40414eZ3 c40414eZ3) {
        double m42764b;
        double d;
        if (m3999h(c40414eZ3)) {
            m42764b = Math.min(c48772sf1.m13872m(), c48772sf1.m13867r());
            if (m42764b <= 0.0d) {
                m42764b = Math.max(c48772sf1.m13872m(), c48772sf1.m13867r());
            }
            d = 0.1d;
        } else {
            m42764b = 1.0d / c40414eZ3.m42764b();
            d = 3.0d;
        }
        return m42764b * d;
    }

    /* renamed from: r */
    public static WB1 m3989r(C46712pA3 c46712pA3, boolean z, C38409bC1 c38409bC1) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (C45526nA3 c45526nA3 : c46712pA3.m19849b()) {
            if (!z && !c45526nA3.m24266B()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C32002Br2 m64848g = c38409bC1.m64848g(c45526nA3.m24240u());
                m64848g.m78767F0(m3995l(c45526nA3));
                arrayList.add(m64848g);
            }
        }
        return c38409bC1.m64854a(arrayList);
    }
}
