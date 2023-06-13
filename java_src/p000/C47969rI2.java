package p000;
/* renamed from: rI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47969rI2 implements InterfaceC48812sj1<InterfaceC32684Ep0> {

    /* renamed from: a */
    public final VH2 f106819a;

    /* renamed from: b */
    public final Y94<InterfaceC32450Dp0> f106820b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f106821c;

    /* renamed from: d */
    public final Y94<InterfaceC35660Rh6> f106822d;

    public C47969rI2(VH2 vh2, Y94<InterfaceC32450Dp0> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC35660Rh6> y943) {
        this.f106819a = vh2;
        this.f106820b = y94;
        this.f106821c = y942;
        this.f106822d = y943;
    }

    /* renamed from: a */
    public static C47969rI2 m16110a(VH2 vh2, Y94<InterfaceC32450Dp0> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC35660Rh6> y943) {
        return new C47969rI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC32684Ep0 m16108c(VH2 vh2, InterfaceC32450Dp0 interfaceC32450Dp0, InterfaceC1880Ea interfaceC1880Ea, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (InterfaceC32684Ep0) C51679xZ3.m5002e(vh2.m80031v(interfaceC32450Dp0, interfaceC1880Ea, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32684Ep0 get() {
        return m16108c(this.f106819a, this.f106820b.get(), this.f106821c.get(), this.f106822d.get());
    }
}
