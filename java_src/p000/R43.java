package p000;
/* renamed from: R43 */
/* loaded from: classes4.dex */
public final class R43 implements InterfaceC48812sj1<InterfaceC20345fH> {

    /* renamed from: a */
    public final P43 f31472a;

    /* renamed from: b */
    public final Y94<MN4> f31473b;

    public R43(P43 p43, Y94<MN4> y94) {
        this.f31472a = p43;
        this.f31473b = y94;
    }

    /* renamed from: a */
    public static InterfaceC20345fH m87340a(P43 p43, MN4 mn4) {
        return (InterfaceC20345fH) C51679xZ3.m5002e(p43.m90953c(mn4));
    }

    /* renamed from: b */
    public static R43 m87339b(P43 p43, Y94<MN4> y94) {
        return new R43(p43, y94);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public InterfaceC20345fH get() {
        return m87340a(this.f31472a, this.f31473b.get());
    }
}
