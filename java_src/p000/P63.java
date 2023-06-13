package p000;
/* renamed from: P63 */
/* loaded from: classes4.dex */
public final class P63 implements InterfaceC48812sj1<InterfaceC41741gn5> {

    /* renamed from: a */
    public final P43 f27899a;

    /* renamed from: b */
    public final Y94<MN4> f27900b;

    public P63(P43 p43, Y94<MN4> y94) {
        this.f27899a = p43;
        this.f27900b = y94;
    }

    /* renamed from: a */
    public static P63 m90804a(P43 p43, Y94<MN4> y94) {
        return new P63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC41741gn5 m90802c(P43 p43, MN4 mn4) {
        return (InterfaceC41741gn5) C51679xZ3.m5002e(p43.m90948d1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41741gn5 get() {
        return m90802c(this.f27899a, this.f27900b.get());
    }
}
