package p000;
/* renamed from: b10  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38300b10 extends AbstractC45877nm0 {

    /* renamed from: b */
    public final C35444Qj6 f56788b = C35444Qj6.m88118x();

    /* renamed from: c */
    public final C35444Qj6 f56789c = C35444Qj6.m88131k();

    /* renamed from: d */
    public final C43270jN2 f56790d = new C43270jN2();

    public C38300b10() {
    }

    /* renamed from: c */
    public C35444Qj6 m65119c() {
        return new C35444Qj6(this.f56788b);
    }

    /* renamed from: d */
    public C35444Qj6 m65118d() {
        return new C35444Qj6(this.f56789c);
    }

    @Override // p000.AbstractC45877nm0
    /* renamed from: e */
    public C38300b10 mo23207a() {
        return new C38300b10(m65118d(), m65119c());
    }

    /* renamed from: f */
    public void m65116f(C35444Qj6 c35444Qj6) {
        DZ3.m110173d(c35444Qj6, "Parameter \"center\" was null.");
        this.f56788b.m88127o(c35444Qj6);
        m23206b();
    }

    /* renamed from: g */
    public void m65115g(C35444Qj6 c35444Qj6) {
        DZ3.m110173d(c35444Qj6, "Parameter \"size\" was null.");
        this.f56789c.m88127o(c35444Qj6);
        m23206b();
    }

    public C38300b10(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj62, "Parameter \"center\" was null.");
        DZ3.m110173d(c35444Qj6, "Parameter \"size\" was null.");
        m65116f(c35444Qj62);
        m65115g(c35444Qj6);
    }
}
