package p000;
/* renamed from: dJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39677dJ2 implements InterfaceC48812sj1<InterfaceC51298wu6<? extends InterfaceC50693vt4>> {

    /* renamed from: a */
    public final VH2 f76415a;

    /* renamed from: b */
    public final Y94<RW3> f76416b;

    public C39677dJ2(VH2 vh2, Y94<RW3> y94) {
        this.f76415a = vh2;
        this.f76416b = y94;
    }

    /* renamed from: a */
    public static C39677dJ2 m44406a(VH2 vh2, Y94<RW3> y94) {
        return new C39677dJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51298wu6<? extends InterfaceC50693vt4> m44404c(VH2 vh2, RW3 rw3) {
        return (InterfaceC51298wu6) C51679xZ3.m5002e(vh2.m80056i0(rw3));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51298wu6<? extends InterfaceC50693vt4> get() {
        return m44404c(this.f76415a, this.f76416b.get());
    }
}
