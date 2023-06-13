package p000;
/* renamed from: HI2 */
/* loaded from: classes4.dex */
public final class HI2 implements InterfaceC48812sj1<InterfaceC51298wu6<? extends InterfaceC50693vt4>> {

    /* renamed from: a */
    public final VH2 f13249a;

    /* renamed from: b */
    public final Y94<QB1> f13250b;

    public HI2(VH2 vh2, Y94<QB1> y94) {
        this.f13249a = vh2;
        this.f13250b = y94;
    }

    /* renamed from: a */
    public static HI2 m104043a(VH2 vh2, Y94<QB1> y94) {
        return new HI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51298wu6<? extends InterfaceC50693vt4> m104041c(VH2 vh2, QB1 qb1) {
        return (InterfaceC51298wu6) C51679xZ3.m5002e(vh2.m80096M(qb1));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51298wu6<? extends InterfaceC50693vt4> get() {
        return m104041c(this.f13249a, this.f13250b.get());
    }
}
