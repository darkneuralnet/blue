package p000;

import org.locationtech.jts.geom.TopologyException;
/* renamed from: uA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49676uA3 {

    /* renamed from: a */
    public static InterfaceC35390Qd6 f111868a = new C29104a();

    /* renamed from: uA3$a */
    /* loaded from: classes8.dex */
    public static class C29104a implements InterfaceC35390Qd6 {
    }

    /* renamed from: a */
    public static double m10719a(WB1 wb1) {
        if (wb1 != null && !wb1.mo77226r0()) {
            C48772sf1 m78759Z = wb1.m78759Z();
            return Math.max(Math.max(Math.abs(m78759Z.m13871n()), Math.abs(m78759Z.m13870o())), Math.max(Math.abs(m78759Z.m13869p()), Math.abs(m78759Z.m13868q())));
        }
        return 0.0d;
    }

    /* renamed from: b */
    public static WB1 m10718b(WB1 wb1, WB1 wb12, int i) {
        try {
            return C49083tA3.m12943j(wb1, wb12, i);
        } catch (RuntimeException e) {
            WB1 m10714f = m10714f(wb1, wb12, i);
            if (m10714f != null) {
                return m10714f;
            }
            WB1 m10717c = m10717c(wb1, wb12, i);
            if (m10717c != null) {
                return m10717c;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public static WB1 m10717c(WB1 wb1, WB1 wb12, int i) {
        try {
            return C49083tA3.m12941l(wb1, wb12, i, new C40414eZ3(C41007fZ3.m41174d(wb1, wb12)));
        } catch (TopologyException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static WB1 m10716d(WB1 wb1, WB1 wb12, int i, double d) {
        try {
            return m10715e(m10712h(wb1, d), m10712h(wb12, d), i, d);
        } catch (TopologyException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static WB1 m10715e(WB1 wb1, WB1 wb12, int i, double d) {
        return C49083tA3.m12942k(wb1, wb12, i, new C47415qM5(d));
    }

    /* renamed from: f */
    public static WB1 m10714f(WB1 wb1, WB1 wb12, int i) {
        double m10710j = m10710j(wb1, wb12);
        for (int i2 = 0; i2 < 5; i2++) {
            WB1 m10713g = m10713g(wb1, wb12, i, m10710j);
            if (m10713g != null) {
                return m10713g;
            }
            WB1 m10716d = m10716d(wb1, wb12, i, m10710j);
            if (m10716d != null) {
                return m10716d;
            }
            m10710j *= 10.0d;
        }
        return null;
    }

    /* renamed from: g */
    public static WB1 m10713g(WB1 wb1, WB1 wb12, int i, double d) {
        try {
            return m10715e(wb1, wb12, i, d);
        } catch (TopologyException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static WB1 m10712h(WB1 wb1, double d) {
        C49083tA3 c49083tA3 = new C49083tA3(wb1, null);
        c49083tA3.m12940m(new C47415qM5(d));
        c49083tA3.m12939n(true);
        return c49083tA3.m12948e();
    }

    /* renamed from: i */
    public static double m10711i(WB1 wb1) {
        return m10719a(wb1) / 1.0E12d;
    }

    /* renamed from: j */
    public static double m10710j(WB1 wb1, WB1 wb12) {
        return Math.max(m10711i(wb1), m10711i(wb12));
    }
}
