package p000;

import com.google.zxing.NotFoundException;
/* renamed from: w00  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50758w00 {

    /* renamed from: a */
    public final C1837ET f115134a;

    /* renamed from: b */
    public final C40900fN4 f115135b;

    /* renamed from: c */
    public final C40900fN4 f115136c;

    /* renamed from: d */
    public final C40900fN4 f115137d;

    /* renamed from: e */
    public final C40900fN4 f115138e;

    /* renamed from: f */
    public final int f115139f;

    /* renamed from: g */
    public final int f115140g;

    /* renamed from: h */
    public final int f115141h;

    /* renamed from: i */
    public final int f115142i;

    public C50758w00(C1837ET c1837et, C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44) throws NotFoundException {
        boolean z = false;
        boolean z2 = c40900fN4 == null || c40900fN42 == null;
        z = (c40900fN43 == null || c40900fN44 == null) ? true : z;
        if (z2 && z) {
            throw NotFoundException.m45943a();
        }
        if (z2) {
            c40900fN4 = new C40900fN4(0.0f, c40900fN43.m41470d());
            c40900fN42 = new C40900fN4(0.0f, c40900fN44.m41470d());
        } else if (z) {
            c40900fN43 = new C40900fN4(c1837et.m108953o() - 1, c40900fN4.m41470d());
            c40900fN44 = new C40900fN4(c1837et.m108953o() - 1, c40900fN42.m41470d());
        }
        this.f115134a = c1837et;
        this.f115135b = c40900fN4;
        this.f115136c = c40900fN42;
        this.f115137d = c40900fN43;
        this.f115138e = c40900fN44;
        this.f115139f = (int) Math.min(c40900fN4.m41471c(), c40900fN42.m41471c());
        this.f115140g = (int) Math.max(c40900fN43.m41471c(), c40900fN44.m41471c());
        this.f115141h = (int) Math.min(c40900fN4.m41470d(), c40900fN43.m41470d());
        this.f115142i = (int) Math.max(c40900fN42.m41470d(), c40900fN44.m41470d());
    }

    /* renamed from: j */
    public static C50758w00 m7574j(C50758w00 c50758w00, C50758w00 c50758w002) throws NotFoundException {
        return c50758w00 == null ? c50758w002 : c50758w002 == null ? c50758w00 : new C50758w00(c50758w00.f115134a, c50758w00.f115135b, c50758w00.f115136c, c50758w002.f115137d, c50758w002.f115138e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C50758w00 m7583a(int i, int i2, boolean z) throws NotFoundException {
        C40900fN4 c40900fN4;
        C40900fN4 c40900fN42;
        C40900fN4 c40900fN43;
        C40900fN4 c40900fN44;
        C40900fN4 c40900fN45;
        C40900fN4 c40900fN46;
        C40900fN4 c40900fN47 = this.f115135b;
        C40900fN4 c40900fN48 = this.f115136c;
        C40900fN4 c40900fN49 = this.f115137d;
        C40900fN4 c40900fN410 = this.f115138e;
        if (i > 0) {
            if (z) {
                c40900fN46 = c40900fN47;
            } else {
                c40900fN46 = c40900fN49;
            }
            int m41470d = ((int) c40900fN46.m41470d()) - i;
            if (m41470d < 0) {
                m41470d = 0;
            }
            C40900fN4 c40900fN411 = new C40900fN4(c40900fN46.m41471c(), m41470d);
            if (z) {
                c40900fN4 = c40900fN411;
            } else {
                c40900fN42 = c40900fN411;
                c40900fN4 = c40900fN47;
                if (i2 <= 0) {
                    if (z) {
                        c40900fN45 = this.f115136c;
                    } else {
                        c40900fN45 = this.f115138e;
                    }
                    int m41470d2 = ((int) c40900fN45.m41470d()) + i2;
                    if (m41470d2 >= this.f115134a.m108956l()) {
                        m41470d2 = this.f115134a.m108956l() - 1;
                    }
                    C40900fN4 c40900fN412 = new C40900fN4(c40900fN45.m41471c(), m41470d2);
                    if (z) {
                        c40900fN43 = c40900fN412;
                    } else {
                        c40900fN44 = c40900fN412;
                        c40900fN43 = c40900fN48;
                        return new C50758w00(this.f115134a, c40900fN4, c40900fN43, c40900fN42, c40900fN44);
                    }
                } else {
                    c40900fN43 = c40900fN48;
                }
                c40900fN44 = c40900fN410;
                return new C50758w00(this.f115134a, c40900fN4, c40900fN43, c40900fN42, c40900fN44);
            }
        } else {
            c40900fN4 = c40900fN47;
        }
        c40900fN42 = c40900fN49;
        if (i2 <= 0) {
        }
        c40900fN44 = c40900fN410;
        return new C50758w00(this.f115134a, c40900fN4, c40900fN43, c40900fN42, c40900fN44);
    }

    /* renamed from: b */
    public C40900fN4 m7582b() {
        return this.f115136c;
    }

    /* renamed from: c */
    public C40900fN4 m7581c() {
        return this.f115138e;
    }

    /* renamed from: d */
    public int m7580d() {
        return this.f115140g;
    }

    /* renamed from: e */
    public int m7579e() {
        return this.f115142i;
    }

    /* renamed from: f */
    public int m7578f() {
        return this.f115139f;
    }

    /* renamed from: g */
    public int m7577g() {
        return this.f115141h;
    }

    /* renamed from: h */
    public C40900fN4 m7576h() {
        return this.f115135b;
    }

    /* renamed from: i */
    public C40900fN4 m7575i() {
        return this.f115137d;
    }

    public C50758w00(C50758w00 c50758w00) {
        this.f115134a = c50758w00.f115134a;
        this.f115135b = c50758w00.m7576h();
        this.f115136c = c50758w00.m7582b();
        this.f115137d = c50758w00.m7575i();
        this.f115138e = c50758w00.m7581c();
        this.f115139f = c50758w00.m7578f();
        this.f115140g = c50758w00.m7580d();
        this.f115141h = c50758w00.m7577g();
        this.f115142i = c50758w00.m7579e();
    }
}
