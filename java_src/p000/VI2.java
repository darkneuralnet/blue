package p000;
/* renamed from: VI2 */
/* loaded from: classes4.dex */
public final class VI2 implements InterfaceC48812sj1<InterfaceC42015hF5> {

    /* renamed from: a */
    public final VH2 f38851a;

    /* renamed from: b */
    public final Y94<InterfaceC47352qF5> f38852b;

    public VI2(VH2 vh2, Y94<InterfaceC47352qF5> y94) {
        this.f38851a = vh2;
        this.f38852b = y94;
    }

    /* renamed from: a */
    public static VI2 m80001a(VH2 vh2, Y94<InterfaceC47352qF5> y94) {
        return new VI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC42015hF5 m79999c(VH2 vh2, InterfaceC47352qF5 interfaceC47352qF5) {
        return (InterfaceC42015hF5) C51679xZ3.m5002e(vh2.m80072a0(interfaceC47352qF5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC42015hF5 get() {
        return m79999c(this.f38851a, this.f38852b.get());
    }
}
