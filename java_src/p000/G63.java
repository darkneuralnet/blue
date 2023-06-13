package p000;
/* renamed from: G63 */
/* loaded from: classes4.dex */
public final class G63 implements InterfaceC48812sj1<InterfaceC51545xK4> {

    /* renamed from: a */
    public final P43 f10958a;

    /* renamed from: b */
    public final Y94<MN4> f10959b;

    public G63(P43 p43, Y94<MN4> y94) {
        this.f10958a = p43;
        this.f10959b = y94;
    }

    /* renamed from: a */
    public static G63 m105814a(P43 p43, Y94<MN4> y94) {
        return new G63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC51545xK4 m105812c(P43 p43, MN4 mn4) {
        return (InterfaceC51545xK4) C51679xZ3.m5002e(p43.m90970U0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51545xK4 get() {
        return m105812c(this.f10958a, this.f10959b.get());
    }
}
