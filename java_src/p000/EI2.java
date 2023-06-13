package p000;
/* renamed from: EI2 */
/* loaded from: classes4.dex */
public final class EI2 implements InterfaceC48812sj1<InterfaceC35223Pl1> {

    /* renamed from: a */
    public final VH2 f7204a;

    /* renamed from: b */
    public final Y94<C22454gl> f7205b;

    public EI2(VH2 vh2, Y94<C22454gl> y94) {
        this.f7204a = vh2;
        this.f7205b = y94;
    }

    /* renamed from: a */
    public static EI2 m109238a(VH2 vh2, Y94<C22454gl> y94) {
        return new EI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC35223Pl1 m109236c(VH2 vh2, C22454gl c22454gl) {
        return (InterfaceC35223Pl1) C51679xZ3.m5002e(vh2.m80102J(c22454gl));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC35223Pl1 get() {
        return m109236c(this.f7204a, this.f7205b.get());
    }
}
