package p000;
/* renamed from: II2 */
/* loaded from: classes4.dex */
public final class II2 implements InterfaceC48812sj1<InterfaceC51298wu6<? extends InterfaceC50693vt4>> {

    /* renamed from: a */
    public final VH2 f15272a;

    /* renamed from: b */
    public final Y94<QB1> f15273b;

    public II2(VH2 vh2, Y94<QB1> y94) {
        this.f15272a = vh2;
        this.f15273b = y94;
    }

    /* renamed from: a */
    public static II2 m102554a(VH2 vh2, Y94<QB1> y94) {
        return new II2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51298wu6<? extends InterfaceC50693vt4> m102552c(VH2 vh2, QB1 qb1) {
        return (InterfaceC51298wu6) C51679xZ3.m5002e(vh2.m80094N(qb1));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51298wu6<? extends InterfaceC50693vt4> get() {
        return m102552c(this.f15272a, this.f15273b.get());
    }
}
