package p000;
/* renamed from: DI2 */
/* loaded from: classes4.dex */
public final class DI2 implements InterfaceC48812sj1<InterfaceC32874Fk1> {

    /* renamed from: a */
    public final VH2 f5494a;

    /* renamed from: b */
    public final Y94<InterfaceC31852Ba5> f5495b;

    /* renamed from: c */
    public final Y94<InterfaceC45298mn4> f5496c;

    /* renamed from: d */
    public final Y94<InterfaceC43381jZ5> f5497d;

    public DI2(VH2 vh2, Y94<InterfaceC31852Ba5> y94, Y94<InterfaceC45298mn4> y942, Y94<InterfaceC43381jZ5> y943) {
        this.f5494a = vh2;
        this.f5495b = y94;
        this.f5496c = y942;
        this.f5497d = y943;
    }

    /* renamed from: a */
    public static DI2 m110605a(VH2 vh2, Y94<InterfaceC31852Ba5> y94, Y94<InterfaceC45298mn4> y942, Y94<InterfaceC43381jZ5> y943) {
        return new DI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC32874Fk1 m110603c(VH2 vh2, InterfaceC31852Ba5 interfaceC31852Ba5, InterfaceC45298mn4 interfaceC45298mn4, InterfaceC43381jZ5 interfaceC43381jZ5) {
        return (InterfaceC32874Fk1) C51679xZ3.m5002e(vh2.m80104I(interfaceC31852Ba5, interfaceC45298mn4, interfaceC43381jZ5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32874Fk1 get() {
        return m110603c(this.f5494a, this.f5495b.get(), this.f5496c.get(), this.f5497d.get());
    }
}
