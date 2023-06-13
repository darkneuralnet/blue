package p000;
/* renamed from: Sj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35908Sj2 {

    /* renamed from: a */
    public C52053yB0 f34144a;

    /* renamed from: b */
    public Object f34145b;

    /* renamed from: c */
    public C35908Sj2 f34146c = null;

    /* renamed from: d */
    public C35908Sj2 f34147d = null;

    /* renamed from: e */
    public int f34148e = 1;

    public C35908Sj2(C52053yB0 c52053yB0, Object obj) {
        this.f34144a = null;
        this.f34144a = new C52053yB0(c52053yB0);
        this.f34145b = obj;
    }

    /* renamed from: a */
    public C52053yB0 m84996a() {
        return this.f34144a;
    }

    /* renamed from: b */
    public Object m84995b() {
        return this.f34145b;
    }

    /* renamed from: c */
    public C35908Sj2 m84994c() {
        return this.f34146c;
    }

    /* renamed from: d */
    public C35908Sj2 m84993d() {
        return this.f34147d;
    }

    /* renamed from: e */
    public void m84992e() {
        this.f34148e++;
    }

    /* renamed from: f */
    public boolean m84991f(boolean z, C52053yB0 c52053yB0) {
        double d;
        if (z) {
            d = c52053yB0.f118922b;
        } else {
            d = c52053yB0.f118923c;
        }
        if (d < m84986k(z)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m84990g(boolean z, C48772sf1 c48772sf1) {
        double m13868q;
        if (z) {
            m13868q = c48772sf1.m13869p();
        } else {
            m13868q = c48772sf1.m13868q();
        }
        if (m13868q < m84986k(z)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m84989h(boolean z, C48772sf1 c48772sf1) {
        double m13870o;
        if (z) {
            m13870o = c48772sf1.m13871n();
        } else {
            m13870o = c48772sf1.m13870o();
        }
        if (m84986k(z) <= m13870o) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m84988i(C35908Sj2 c35908Sj2) {
        this.f34146c = c35908Sj2;
    }

    /* renamed from: j */
    public void m84987j(C35908Sj2 c35908Sj2) {
        this.f34147d = c35908Sj2;
    }

    /* renamed from: k */
    public double m84986k(boolean z) {
        if (z) {
            return this.f34144a.m3883k();
        }
        return this.f34144a.m3882l();
    }
}
