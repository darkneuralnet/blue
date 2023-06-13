package p000;
/* renamed from: qI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47376qI2 implements InterfaceC48812sj1<InterfaceC36176Tn0> {

    /* renamed from: a */
    public final VH2 f105037a;

    /* renamed from: b */
    public final Y94<InterfaceC43515jn0> f105038b;

    public C47376qI2(VH2 vh2, Y94<InterfaceC43515jn0> y94) {
        this.f105037a = vh2;
        this.f105038b = y94;
    }

    /* renamed from: a */
    public static C47376qI2 m17677a(VH2 vh2, Y94<InterfaceC43515jn0> y94) {
        return new C47376qI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC36176Tn0 m17675c(VH2 vh2, InterfaceC43515jn0 interfaceC43515jn0) {
        return (InterfaceC36176Tn0) C51679xZ3.m5002e(vh2.m80033u(interfaceC43515jn0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36176Tn0 get() {
        return m17675c(this.f105037a, this.f105038b.get());
    }
}
