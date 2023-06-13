package p000;
/* renamed from: eJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40269eJ2 implements InterfaceC48812sj1<InterfaceC51298wu6<? extends InterfaceC50693vt4>> {

    /* renamed from: a */
    public final VH2 f78222a;

    /* renamed from: b */
    public final Y94<RW3> f78223b;

    public C40269eJ2(VH2 vh2, Y94<RW3> y94) {
        this.f78222a = vh2;
        this.f78223b = y94;
    }

    /* renamed from: a */
    public static C40269eJ2 m43047a(VH2 vh2, Y94<RW3> y94) {
        return new C40269eJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51298wu6<? extends InterfaceC50693vt4> m43045c(VH2 vh2, RW3 rw3) {
        return (InterfaceC51298wu6) C51679xZ3.m5002e(vh2.m80054j0(rw3));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51298wu6<? extends InterfaceC50693vt4> get() {
        return m43045c(this.f78222a, this.f78223b.get());
    }
}
