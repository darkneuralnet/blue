package p000;
/* renamed from: M63 */
/* loaded from: classes4.dex */
public final class M63 implements InterfaceC48812sj1<InterfaceC31852Ba5> {

    /* renamed from: a */
    public final P43 f22632a;

    /* renamed from: b */
    public final Y94<MN4> f22633b;

    public M63(P43 p43, Y94<MN4> y94) {
        this.f22632a = p43;
        this.f22633b = y94;
    }

    /* renamed from: a */
    public static M63 m95820a(P43 p43, Y94<MN4> y94) {
        return new M63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC31852Ba5 m95818c(P43 p43, MN4 mn4) {
        return (InterfaceC31852Ba5) C51679xZ3.m5002e(p43.m90957a1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC31852Ba5 get() {
        return m95818c(this.f22632a, this.f22633b.get());
    }
}
