package p000;
/* renamed from: FE1 */
/* loaded from: classes8.dex */
public class FE1 {

    /* renamed from: a */
    public C52053yB0 f9050a;

    /* renamed from: b */
    public FE1 f9051b;

    /* renamed from: c */
    public FE1 f9052c;

    public FE1(C52053yB0 c52053yB0) {
        this.f9050a = c52053yB0;
    }

    /* renamed from: a */
    public int m107424a(FE1 fe1) {
        double m107420f = m107420f();
        double m107419g = m107419g();
        double m107420f2 = fe1.m107420f();
        double m107419g2 = fe1.m107419g();
        if (m107420f == m107420f2 && m107419g == m107419g2) {
            return 0;
        }
        int m4964a = C51699xb4.m4964a(m107420f, m107419g);
        int m4964a2 = C51699xb4.m4964a(m107420f2, m107419g2);
        if (m4964a > m4964a2) {
            return 1;
        }
        if (m4964a < m4964a2) {
            return -1;
        }
        C52053yB0 mo24245e = mo24245e();
        return C32534Dy3.m109571a(fe1.f9050a, fe1.mo24245e(), mo24245e);
    }

    /* renamed from: b */
    public int m107423b(Object obj) {
        return m107424a((FE1) obj);
    }

    /* renamed from: c */
    public int m107422c() {
        int i = 0;
        FE1 fe1 = this;
        do {
            i++;
            fe1 = fe1.m107414l();
        } while (fe1 != this);
        return i;
    }

    /* renamed from: d */
    public C52053yB0 m107421d() {
        return this.f9051b.f9050a;
    }

    /* renamed from: e */
    public C52053yB0 mo24245e() {
        return m107421d();
    }

    /* renamed from: f */
    public double m107420f() {
        return mo24245e().m3883k() - this.f9050a.m3883k();
    }

    /* renamed from: g */
    public double m107419g() {
        return mo24245e().m3882l() - this.f9050a.m3882l();
    }

    /* renamed from: h */
    public void m107418h(FE1 fe1) {
        if (m107414l() == this) {
            m107417i(fe1);
        } else {
            m107416j(fe1).m107417i(fe1);
        }
    }

    /* renamed from: i */
    public final void m107417i(FE1 fe1) {
        C4596Ko.m98284a(this.f9050a, fe1.m107413m());
        FE1 m107414l = m107414l();
        this.f9051b.m107412n(fe1);
        fe1.m107410p().m107412n(m107414l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        return r0;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FE1 m107416j(FE1 fe1) {
        FE1 fe12 = this;
        while (true) {
            FE1 m107414l = fe12.m107414l();
            if (m107414l.m107423b(fe12) > 0 && fe1.m107423b(fe12) >= 0 && fe1.m107423b(m107414l) <= 0) {
                return fe12;
            }
            if (m107414l.m107423b(fe12) > 0 || (fe1.m107423b(m107414l) > 0 && fe1.m107423b(fe12) < 0)) {
                if (m107414l == this) {
                    C4596Ko.m98280e();
                    return null;
                }
                fe12 = m107414l;
            }
        }
    }

    /* renamed from: k */
    public void m107415k(FE1 fe1) {
        m107411o(fe1);
        fe1.m107411o(this);
        m107412n(fe1);
        fe1.m107412n(this);
    }

    /* renamed from: l */
    public FE1 m107414l() {
        return this.f9051b.f9052c;
    }

    /* renamed from: m */
    public C52053yB0 m107413m() {
        return this.f9050a;
    }

    /* renamed from: n */
    public final void m107412n(FE1 fe1) {
        this.f9052c = fe1;
    }

    /* renamed from: o */
    public final void m107411o(FE1 fe1) {
        this.f9051b = fe1;
    }

    /* renamed from: p */
    public FE1 m107410p() {
        return this.f9051b;
    }

    public String toString() {
        return "HE(" + this.f9050a.f118922b + " " + this.f9050a.f118923c + ", " + this.f9051b.f9050a.f118922b + " " + this.f9051b.f9050a.f118923c + ")";
    }
}
