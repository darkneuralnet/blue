package p000;
/* renamed from: FI2 */
/* loaded from: classes4.dex */
public final class FI2 implements InterfaceC48812sj1<InterfaceC51213wm1> {

    /* renamed from: a */
    public final VH2 f9141a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f9142b;

    public FI2(VH2 vh2, Y94<C36207Tq4> y94) {
        this.f9141a = vh2;
        this.f9142b = y94;
    }

    /* renamed from: a */
    public static FI2 m107350a(VH2 vh2, Y94<C36207Tq4> y94) {
        return new FI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC51213wm1 m107348c(VH2 vh2, C36207Tq4 c36207Tq4) {
        return (InterfaceC51213wm1) C51679xZ3.m5002e(vh2.m80100K(c36207Tq4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51213wm1 get() {
        return m107348c(this.f9141a, this.f9142b.get());
    }
}
