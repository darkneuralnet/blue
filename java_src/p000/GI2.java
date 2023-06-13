package p000;
/* renamed from: GI2 */
/* loaded from: classes4.dex */
public final class GI2 implements InterfaceC48812sj1<InterfaceC51298wu6<? extends InterfaceC50693vt4>> {

    /* renamed from: a */
    public final VH2 f11503a;

    /* renamed from: b */
    public final Y94<QB1> f11504b;

    public GI2(VH2 vh2, Y94<QB1> y94) {
        this.f11503a = vh2;
        this.f11504b = y94;
    }

    /* renamed from: a */
    public static GI2 m105525a(VH2 vh2, Y94<QB1> y94) {
        return new GI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51298wu6<? extends InterfaceC50693vt4> m105523c(VH2 vh2, QB1 qb1) {
        return (InterfaceC51298wu6) C51679xZ3.m5002e(vh2.m80098L(qb1));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51298wu6<? extends InterfaceC50693vt4> get() {
        return m105523c(this.f11503a, this.f11504b.get());
    }
}
