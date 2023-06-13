package p000;
/* renamed from: s73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48460s73 implements InterfaceC48812sj1<InterfaceC51944y00> {

    /* renamed from: a */
    public final P43 f108308a;

    /* renamed from: b */
    public final Y94<MN4> f108309b;

    public C48460s73(P43 p43, Y94<MN4> y94) {
        this.f108308a = p43;
        this.f108309b = y94;
    }

    /* renamed from: a */
    public static C48460s73 m14763a(P43 p43, Y94<MN4> y94) {
        return new C48460s73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC51944y00 m14761c(P43 p43, MN4 mn4) {
        return (InterfaceC51944y00) C51679xZ3.m5002e(p43.m90997H1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51944y00 get() {
        return m14761c(this.f108308a, this.f108309b.get());
    }
}
