package p000;
/* renamed from: BI2 */
/* loaded from: classes4.dex */
public final class BI2 implements InterfaceC48812sj1<InterfaceC47617qi1> {

    /* renamed from: a */
    public final VH2 f2176a;

    /* renamed from: b */
    public final Y94<C48210ri1> f2177b;

    public BI2(VH2 vh2, Y94<C48210ri1> y94) {
        this.f2176a = vh2;
        this.f2177b = y94;
    }

    /* renamed from: a */
    public static BI2 m114131a(VH2 vh2, Y94<C48210ri1> y94) {
        return new BI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC47617qi1 m114129c(VH2 vh2, C48210ri1 c48210ri1) {
        return (InterfaceC47617qi1) C51679xZ3.m5002e(vh2.m80108G(c48210ri1));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47617qi1 get() {
        return m114129c(this.f2176a, this.f2177b.get());
    }
}
