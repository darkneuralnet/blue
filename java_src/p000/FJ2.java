package p000;
/* renamed from: FJ2 */
/* loaded from: classes4.dex */
public final class FJ2 implements InterfaceC48812sj1<InterfaceC35660Rh6> {

    /* renamed from: a */
    public final VH2 f9165a;

    /* renamed from: b */
    public final Y94<C22454gl> f9166b;

    public FJ2(VH2 vh2, Y94<C22454gl> y94) {
        this.f9165a = vh2;
        this.f9166b = y94;
    }

    /* renamed from: a */
    public static FJ2 m107326a(VH2 vh2, Y94<C22454gl> y94) {
        return new FJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC35660Rh6 m107324c(VH2 vh2, C22454gl c22454gl) {
        return (InterfaceC35660Rh6) C51679xZ3.m5002e(vh2.m80097L0(c22454gl));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC35660Rh6 get() {
        return m107324c(this.f9165a, this.f9166b.get());
    }
}
