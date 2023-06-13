package p000;
/* renamed from: N63 */
/* loaded from: classes4.dex */
public final class N63 implements InterfaceC48812sj1<InterfaceC45782nc5> {

    /* renamed from: a */
    public final P43 f24154a;

    /* renamed from: b */
    public final Y94<MN4> f24155b;

    public N63(P43 p43, Y94<MN4> y94) {
        this.f24154a = p43;
        this.f24155b = y94;
    }

    /* renamed from: a */
    public static N63 m94372a(P43 p43, Y94<MN4> y94) {
        return new N63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC45782nc5 m94370c(P43 p43, MN4 mn4) {
        return (InterfaceC45782nc5) C51679xZ3.m5002e(p43.m90954b1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC45782nc5 get() {
        return m94370c(this.f24154a, this.f24155b.get());
    }
}
