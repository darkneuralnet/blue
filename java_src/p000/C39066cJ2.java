package p000;
/* renamed from: cJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39066cJ2 implements InterfaceC48812sj1<InterfaceC51298wu6<? extends InterfaceC50693vt4>> {

    /* renamed from: a */
    public final VH2 f60390a;

    /* renamed from: b */
    public final Y94<RW3> f60391b;

    public C39066cJ2(VH2 vh2, Y94<RW3> y94) {
        this.f60390a = vh2;
        this.f60391b = y94;
    }

    /* renamed from: a */
    public static C39066cJ2 m61585a(VH2 vh2, Y94<RW3> y94) {
        return new C39066cJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51298wu6<? extends InterfaceC50693vt4> m61583c(VH2 vh2, RW3 rw3) {
        return (InterfaceC51298wu6) C51679xZ3.m5002e(vh2.m80058h0(rw3));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51298wu6<? extends InterfaceC50693vt4> get() {
        return m61583c(this.f60390a, this.f60391b.get());
    }
}
