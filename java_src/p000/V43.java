package p000;
/* renamed from: V43 */
/* loaded from: classes4.dex */
public final class V43 implements InterfaceC48812sj1<InterfaceC10121Z9> {

    /* renamed from: a */
    public final P43 f38564a;

    /* renamed from: b */
    public final Y94<MN4> f38565b;

    public V43(P43 p43, Y94<MN4> y94) {
        this.f38564a = p43;
        this.f38565b = y94;
    }

    /* renamed from: a */
    public static V43 m80449a(P43 p43, Y94<MN4> y94) {
        return new V43(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC10121Z9 m80447c(P43 p43, MN4 mn4) {
        return (InterfaceC10121Z9) C51679xZ3.m5002e(p43.m90941g(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC10121Z9 get() {
        return m80447c(this.f38564a, this.f38565b.get());
    }
}
