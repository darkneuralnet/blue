package p000;
/* renamed from: xJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51534xJ2 implements InterfaceC48812sj1<InterfaceC49310tZ5> {

    /* renamed from: a */
    public final VH2 f117363a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f117364b;

    /* renamed from: c */
    public final Y94<InterfaceC48717sZ5> f117365c;

    public C51534xJ2(VH2 vh2, Y94<InterfaceC46473om3> y94, Y94<InterfaceC48717sZ5> y942) {
        this.f117363a = vh2;
        this.f117364b = y94;
        this.f117365c = y942;
    }

    /* renamed from: a */
    public static C51534xJ2 m5558a(VH2 vh2, Y94<InterfaceC46473om3> y94, Y94<InterfaceC48717sZ5> y942) {
        return new C51534xJ2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC49310tZ5 m5556c(VH2 vh2, InterfaceC46473om3 interfaceC46473om3, InterfaceC48717sZ5 interfaceC48717sZ5) {
        return (InterfaceC49310tZ5) C51679xZ3.m5002e(vh2.m80113D0(interfaceC46473om3, interfaceC48717sZ5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49310tZ5 get() {
        return m5556c(this.f117363a, this.f117364b.get(), this.f117365c.get());
    }
}
