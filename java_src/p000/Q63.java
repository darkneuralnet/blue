package p000;
/* renamed from: Q63 */
/* loaded from: classes4.dex */
public final class Q63 implements InterfaceC48812sj1<InterfaceC32023Bt5> {

    /* renamed from: a */
    public final P43 f29835a;

    /* renamed from: b */
    public final Y94<MN4> f29836b;

    public Q63(P43 p43, Y94<MN4> y94) {
        this.f29835a = p43;
        this.f29836b = y94;
    }

    /* renamed from: a */
    public static Q63 m88913a(P43 p43, Y94<MN4> y94) {
        return new Q63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC32023Bt5 m88911c(P43 p43, MN4 mn4) {
        return (InterfaceC32023Bt5) C51679xZ3.m5002e(p43.m90945e1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32023Bt5 get() {
        return m88911c(this.f29835a, this.f29836b.get());
    }
}
