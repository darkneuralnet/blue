package p000;
/* renamed from: SD1 */
/* loaded from: classes8.dex */
public abstract class SD1 {

    /* renamed from: a */
    public C35926Sl2 f33341a;

    /* renamed from: b */
    public boolean f33342b = false;

    /* renamed from: c */
    public boolean f33343c = false;

    /* renamed from: d */
    public boolean f33344d = false;

    /* renamed from: e */
    public boolean f33345e = false;

    /* renamed from: a */
    public abstract void mo18074a(P62 p62);

    /* renamed from: b */
    public C35926Sl2 m85838b() {
        return this.f33341a;
    }

    /* renamed from: c */
    public boolean m85837c() {
        return this.f33343c;
    }

    /* renamed from: d */
    public boolean m85836d() {
        return this.f33344d;
    }

    /* renamed from: e */
    public boolean m85835e() {
        return this.f33342b;
    }

    /* renamed from: f */
    public void m85834f(boolean z) {
        this.f33343c = z;
        this.f33344d = true;
    }

    /* renamed from: g */
    public void m85833g(boolean z) {
        this.f33342b = z;
    }

    /* renamed from: h */
    public void m85832h(P62 p62) {
        boolean z;
        if (this.f33341a.m84875c() >= 2) {
            z = true;
        } else {
            z = false;
        }
        C4596Ko.m98281d(z, "found partial label");
        mo18074a(p62);
    }
}
