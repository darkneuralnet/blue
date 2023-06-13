package p000;
/* renamed from: v91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50256v91 implements Comparable {

    /* renamed from: b */
    public C47293q91 f113599b;

    /* renamed from: c */
    public C35926Sl2 f113600c;

    /* renamed from: d */
    public D83 f113601d;

    /* renamed from: e */
    public C52053yB0 f113602e;

    /* renamed from: f */
    public C52053yB0 f113603f;

    /* renamed from: g */
    public double f113604g;

    /* renamed from: h */
    public double f113605h;

    /* renamed from: i */
    public int f113606i;

    public C50256v91(C47293q91 c47293q91) {
        this.f113599b = c47293q91;
    }

    /* renamed from: a */
    public int m9131a(C50256v91 c50256v91) {
        if (this.f113604g == c50256v91.f113604g && this.f113605h == c50256v91.f113605h) {
            return 0;
        }
        int i = this.f113606i;
        int i2 = c50256v91.f113606i;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        return C32534Dy3.m109571a(c50256v91.f113602e, c50256v91.f113603f, this.f113603f);
    }

    /* renamed from: b */
    public void mo5788b(InterfaceC49573u00 interfaceC49573u00) {
    }

    /* renamed from: c */
    public C52053yB0 m9130c() {
        return this.f113602e;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return m9131a((C50256v91) obj);
    }

    /* renamed from: d */
    public C52053yB0 m9129d() {
        return this.f113603f;
    }

    /* renamed from: e */
    public C47293q91 mo9128e() {
        return this.f113599b;
    }

    /* renamed from: f */
    public C35926Sl2 mo5787f() {
        return this.f113600c;
    }

    /* renamed from: g */
    public D83 m9127g() {
        return this.f113601d;
    }

    /* renamed from: h */
    public void m9126h(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        boolean z;
        this.f113602e = c52053yB0;
        this.f113603f = c52053yB02;
        double d = c52053yB02.f118922b - c52053yB0.f118922b;
        this.f113604g = d;
        double d2 = c52053yB02.f118923c - c52053yB0.f118923c;
        this.f113605h = d2;
        this.f113606i = C51699xb4.m4964a(d, d2);
        if (this.f113604g == 0.0d && this.f113605h == 0.0d) {
            z = false;
        } else {
            z = true;
        }
        C4596Ko.m98281d(z, "EdgeEnd with identical endpoints found");
    }

    /* renamed from: i */
    public void m9125i(D83 d83) {
        this.f113601d = d83;
    }

    public String toString() {
        double atan2 = Math.atan2(this.f113605h, this.f113604g);
        String name = getClass().getName();
        String substring = name.substring(name.lastIndexOf(46) + 1);
        return "  " + substring + ": " + this.f113602e + " - " + this.f113603f + " " + this.f113606i + ":" + atan2 + "   " + this.f113600c;
    }

    public C50256v91(C47293q91 c47293q91, C52053yB0 c52053yB0, C52053yB0 c52053yB02, C35926Sl2 c35926Sl2) {
        this(c47293q91);
        m9126h(c52053yB0, c52053yB02);
        this.f113600c = c35926Sl2;
    }
}
