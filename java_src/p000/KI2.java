package p000;
/* renamed from: KI2 */
/* loaded from: classes4.dex */
public final class KI2 implements InterfaceC48812sj1<InterfaceC45686nS1> {

    /* renamed from: a */
    public final VH2 f19376a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f19377b;

    /* renamed from: c */
    public final Y94<InterfaceC7381SM> f19378c;

    /* renamed from: d */
    public final Y94<InterfaceC10163ZF> f19379d;

    /* renamed from: e */
    public final Y94<InterfaceC1880Ea> f19380e;

    public KI2(VH2 vh2, Y94<InterfaceC46473om3> y94, Y94<InterfaceC7381SM> y942, Y94<InterfaceC10163ZF> y943, Y94<InterfaceC1880Ea> y944) {
        this.f19376a = vh2;
        this.f19377b = y94;
        this.f19378c = y942;
        this.f19379d = y943;
        this.f19380e = y944;
    }

    /* renamed from: a */
    public static KI2 m99038a(VH2 vh2, Y94<InterfaceC46473om3> y94, Y94<InterfaceC7381SM> y942, Y94<InterfaceC10163ZF> y943, Y94<InterfaceC1880Ea> y944) {
        return new KI2(vh2, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC45686nS1 m99036c(VH2 vh2, InterfaceC46473om3 interfaceC46473om3, InterfaceC7381SM interfaceC7381SM, InterfaceC10163ZF interfaceC10163ZF, InterfaceC1880Ea interfaceC1880Ea) {
        return (InterfaceC45686nS1) C51679xZ3.m5002e(vh2.m80090P(interfaceC46473om3, interfaceC7381SM, interfaceC10163ZF, interfaceC1880Ea));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC45686nS1 get() {
        return m99036c(this.f19376a, this.f19377b.get(), this.f19378c.get(), this.f19379d.get(), this.f19380e.get());
    }
}
