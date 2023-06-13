package p000;
/* renamed from: F53 */
/* loaded from: classes4.dex */
public final class F53 implements InterfaceC48812sj1<InterfaceC42567iB0> {

    /* renamed from: a */
    public final P43 f8707a;

    /* renamed from: b */
    public final Y94<MN4> f8708b;

    public F53(P43 p43, Y94<MN4> y94) {
        this.f8707a = p43;
        this.f8708b = y94;
    }

    /* renamed from: a */
    public static F53 m107801a(P43 p43, Y94<MN4> y94) {
        return new F53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC42567iB0 m107799c(P43 p43, MN4 mn4) {
        return (InterfaceC42567iB0) C51679xZ3.m5002e(p43.m90979Q(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC42567iB0 get() {
        return m107799c(this.f8707a, this.f8708b.get());
    }
}
