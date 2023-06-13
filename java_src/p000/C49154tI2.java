package p000;
/* renamed from: tI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49154tI2 implements InterfaceC48812sj1<InterfaceC52458ys0> {

    /* renamed from: a */
    public final VH2 f110270a;

    /* renamed from: b */
    public final Y94<InterfaceC51865xs0> f110271b;

    public C49154tI2(VH2 vh2, Y94<InterfaceC51865xs0> y94) {
        this.f110270a = vh2;
        this.f110271b = y94;
    }

    /* renamed from: a */
    public static C49154tI2 m12525a(VH2 vh2, Y94<InterfaceC51865xs0> y94) {
        return new C49154tI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC52458ys0 m12523c(VH2 vh2, InterfaceC51865xs0 interfaceC51865xs0) {
        return (InterfaceC52458ys0) C51679xZ3.m5002e(vh2.m80027x(interfaceC51865xs0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC52458ys0 get() {
        return m12523c(this.f110270a, this.f110271b.get());
    }
}
