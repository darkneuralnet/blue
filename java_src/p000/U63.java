package p000;
/* renamed from: U63 */
/* loaded from: classes4.dex */
public final class U63 implements InterfaceC48812sj1<InterfaceC49840uS5> {

    /* renamed from: a */
    public final P43 f36858a;

    /* renamed from: b */
    public final Y94<MN4> f36859b;

    public U63(P43 p43, Y94<MN4> y94) {
        this.f36858a = p43;
        this.f36859b = y94;
    }

    /* renamed from: a */
    public static U63 m81969a(P43 p43, Y94<MN4> y94) {
        return new U63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC49840uS5 m81967c(P43 p43, MN4 mn4) {
        return (InterfaceC49840uS5) C51679xZ3.m5002e(p43.m90933i1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49840uS5 get() {
        return m81967c(this.f36858a, this.f36859b.get());
    }
}
