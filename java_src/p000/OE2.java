package p000;

import p000.C35621Rd3;
/* renamed from: OE2 */
/* loaded from: classes5.dex */
public class OE2 extends C35621Rd3.AbstractC7219a {

    /* renamed from: e */
    public static C35621Rd3<OE2> f26253e;

    /* renamed from: c */
    public double f26254c;

    /* renamed from: d */
    public double f26255d;

    static {
        C35621Rd3<OE2> m86536a = C35621Rd3.m86536a(64, new OE2(0.0d, 0.0d));
        f26253e = m86536a;
        m86536a.m86530g(0.5f);
    }

    public OE2(double d, double d2) {
        this.f26254c = d;
        this.f26255d = d2;
    }

    /* renamed from: b */
    public static OE2 m92598b(double d, double d2) {
        OE2 m86535b = f26253e.m86535b();
        m86535b.f26254c = d;
        m86535b.f26255d = d2;
        return m86535b;
    }

    /* renamed from: c */
    public static void m92597c(OE2 oe2) {
        f26253e.m86534c(oe2);
    }

    @Override // p000.C35621Rd3.AbstractC7219a
    /* renamed from: a */
    public C35621Rd3.AbstractC7219a mo72662a() {
        return new OE2(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f26254c + ", y: " + this.f26255d;
    }
}
