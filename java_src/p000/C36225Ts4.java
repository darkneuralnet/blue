package p000;
/* renamed from: Ts4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36225Ts4 {

    /* renamed from: a */
    public C48772sf1 f36380a;

    public C36225Ts4(CX3 cx3) {
        this.f36380a = cx3.m78759Z();
    }

    /* renamed from: b */
    public static boolean m82328b(CX3 cx3, WB1 wb1) {
        return new C36225Ts4(cx3).m82329a(wb1);
    }

    /* renamed from: a */
    public boolean m82329a(WB1 wb1) {
        if (!this.f36380a.m13883b(wb1.m78759Z()) || m82327c(wb1)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m82327c(WB1 wb1) {
        if (wb1 instanceof CX3) {
            return false;
        }
        if (wb1 instanceof FW3) {
            return m82323g((FW3) wb1);
        }
        if (wb1 instanceof C32002Br2) {
            return m82325e((C32002Br2) wb1);
        }
        for (int i = 0; i < wb1.mo77232f0(); i++) {
            if (!m82327c(wb1.mo77236d0(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m82326d(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        if (c52053yB0.equals(c52053yB02)) {
            return m82324f(c52053yB0);
        }
        double d = c52053yB0.f118922b;
        if (d == c52053yB02.f118922b) {
            if (d == this.f36380a.m13869p() || c52053yB0.f118922b == this.f36380a.m13871n()) {
                return true;
            }
            return false;
        }
        double d2 = c52053yB0.f118923c;
        if (d2 == c52053yB02.f118923c) {
            if (d2 == this.f36380a.m13868q() || c52053yB0.f118923c == this.f36380a.m13870o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m82325e(C32002Br2 c32002Br2) {
        EB0 m113440M0 = c32002Br2.m113440M0();
        C52053yB0 c52053yB0 = new C52053yB0();
        C52053yB0 c52053yB02 = new C52053yB0();
        int i = 0;
        while (i < m113440M0.size() - 1) {
            m113440M0.mo1715T(i, c52053yB0);
            i++;
            m113440M0.mo1715T(i, c52053yB02);
            if (!m82326d(c52053yB0, c52053yB02)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m82324f(C52053yB0 c52053yB0) {
        if (c52053yB0.f118922b != this.f36380a.m13869p() && c52053yB0.f118922b != this.f36380a.m13871n() && c52053yB0.f118923c != this.f36380a.m13868q() && c52053yB0.f118923c != this.f36380a.m13870o()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m82323g(FW3 fw3) {
        return m82324f(fw3.mo77239W());
    }
}
