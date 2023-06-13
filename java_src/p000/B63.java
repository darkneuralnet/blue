package p000;
/* renamed from: B63 */
/* loaded from: classes4.dex */
public final class B63 implements InterfaceC48812sj1<InterfaceC45298mn4> {

    /* renamed from: a */
    public final P43 f1834a;

    /* renamed from: b */
    public final Y94<MN4> f1835b;

    public B63(P43 p43, Y94<MN4> y94) {
        this.f1834a = p43;
        this.f1835b = y94;
    }

    /* renamed from: a */
    public static B63 m114358a(P43 p43, Y94<MN4> y94) {
        return new B63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC45298mn4 m114356c(P43 p43, MN4 mn4) {
        return (InterfaceC45298mn4) C51679xZ3.m5002e(p43.m90980P0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC45298mn4 get() {
        return m114356c(this.f1834a, this.f1835b.get());
    }
}
