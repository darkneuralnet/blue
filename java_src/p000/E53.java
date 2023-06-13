package p000;
/* renamed from: E53 */
/* loaded from: classes4.dex */
public final class E53 implements InterfaceC48812sj1<InterfaceC51865xs0> {

    /* renamed from: a */
    public final P43 f6955a;

    /* renamed from: b */
    public final Y94<MN4> f6956b;

    public E53(P43 p43, Y94<MN4> y94) {
        this.f6955a = p43;
        this.f6956b = y94;
    }

    /* renamed from: a */
    public static E53 m109406a(P43 p43, Y94<MN4> y94) {
        return new E53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC51865xs0 m109404c(P43 p43, MN4 mn4) {
        return (InterfaceC51865xs0) C51679xZ3.m5002e(p43.m90981P(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51865xs0 get() {
        return m109404c(this.f6955a, this.f6956b.get());
    }
}
