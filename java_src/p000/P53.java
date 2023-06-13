package p000;
/* renamed from: P53 */
/* loaded from: classes4.dex */
public final class P53 implements InterfaceC48812sj1<InterfaceC50650vp1> {

    /* renamed from: a */
    public final P43 f27874a;

    /* renamed from: b */
    public final Y94<MN4> f27875b;

    public P53(P43 p43, Y94<MN4> y94) {
        this.f27874a = p43;
        this.f27875b = y94;
    }

    /* renamed from: a */
    public static P53 m90871a(P43 p43, Y94<MN4> y94) {
        return new P53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC50650vp1 m90869c(P43 p43, MN4 mn4) {
        return (InterfaceC50650vp1) C51679xZ3.m5002e(p43.m90955b0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC50650vp1 get() {
        return m90869c(this.f27874a, this.f27875b.get());
    }
}
