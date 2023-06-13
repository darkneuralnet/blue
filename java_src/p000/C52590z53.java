package p000;
/* renamed from: z53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52590z53 implements InterfaceC48812sj1<InterfaceC32450Dp0> {

    /* renamed from: a */
    public final P43 f120759a;

    /* renamed from: b */
    public final Y94<MN4> f120760b;

    public C52590z53(P43 p43, Y94<MN4> y94) {
        this.f120759a = p43;
        this.f120760b = y94;
    }

    /* renamed from: a */
    public static C52590z53 m1835a(P43 p43, Y94<MN4> y94) {
        return new C52590z53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC32450Dp0 m1833c(P43 p43, MN4 mn4) {
        return (InterfaceC32450Dp0) C51679xZ3.m5002e(p43.m90991K(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32450Dp0 get() {
        return m1833c(this.f120759a, this.f120760b.get());
    }
}
