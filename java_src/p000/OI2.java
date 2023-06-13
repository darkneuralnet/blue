package p000;
/* renamed from: OI2 */
/* loaded from: classes4.dex */
public final class OI2 implements InterfaceC48812sj1<InterfaceC44723lp2> {

    /* renamed from: a */
    public final VH2 f26358a;

    /* renamed from: b */
    public final Y94<InterfaceC5225MD> f26359b;

    /* renamed from: c */
    public final Y94<InterfaceC48847sm6> f26360c;

    /* renamed from: d */
    public final Y94<InterfaceC10732aY> f26361d;

    /* renamed from: e */
    public final Y94<InterfaceC34076Kn6> f26362e;

    public OI2(VH2 vh2, Y94<InterfaceC5225MD> y94, Y94<InterfaceC48847sm6> y942, Y94<InterfaceC10732aY> y943, Y94<InterfaceC34076Kn6> y944) {
        this.f26358a = vh2;
        this.f26359b = y94;
        this.f26360c = y942;
        this.f26361d = y943;
        this.f26362e = y944;
    }

    /* renamed from: a */
    public static OI2 m92425a(VH2 vh2, Y94<InterfaceC5225MD> y94, Y94<InterfaceC48847sm6> y942, Y94<InterfaceC10732aY> y943, Y94<InterfaceC34076Kn6> y944) {
        return new OI2(vh2, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC44723lp2 m92423c(VH2 vh2, InterfaceC5225MD interfaceC5225MD, InterfaceC48847sm6 interfaceC48847sm6, InterfaceC10732aY interfaceC10732aY, InterfaceC34076Kn6 interfaceC34076Kn6) {
        return (InterfaceC44723lp2) C51679xZ3.m5002e(vh2.m80082T(interfaceC5225MD, interfaceC48847sm6, interfaceC10732aY, interfaceC34076Kn6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44723lp2 get() {
        return m92423c(this.f26358a, this.f26359b.get(), this.f26360c.get(), this.f26361d.get(), this.f26362e.get());
    }
}
