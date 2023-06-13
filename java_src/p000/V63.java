package p000;
/* renamed from: V63 */
/* loaded from: classes4.dex */
public final class V63 implements InterfaceC48812sj1<InterfaceC47478qT5> {

    /* renamed from: a */
    public final P43 f38643a;

    /* renamed from: b */
    public final Y94<MN4> f38644b;

    public V63(P43 p43, Y94<MN4> y94) {
        this.f38643a = p43;
        this.f38644b = y94;
    }

    /* renamed from: a */
    public static V63 m80391a(P43 p43, Y94<MN4> y94) {
        return new V63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC47478qT5 m80389c(P43 p43, MN4 mn4) {
        return (InterfaceC47478qT5) C51679xZ3.m5002e(p43.m90930j1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47478qT5 get() {
        return m80389c(this.f38643a, this.f38644b.get());
    }
}
