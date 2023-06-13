package p000;
/* renamed from: O53 */
/* loaded from: classes4.dex */
public final class O53 implements InterfaceC48812sj1<InterfaceC47024pi1> {

    /* renamed from: a */
    public final P43 f25621a;

    /* renamed from: b */
    public final Y94<MN4> f25622b;

    public O53(P43 p43, Y94<MN4> y94) {
        this.f25621a = p43;
        this.f25622b = y94;
    }

    /* renamed from: a */
    public static O53 m92944a(P43 p43, Y94<MN4> y94) {
        return new O53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC47024pi1 m92942c(P43 p43, MN4 mn4) {
        return (InterfaceC47024pi1) C51679xZ3.m5002e(p43.m90958a0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47024pi1 get() {
        return m92942c(this.f25621a, this.f25622b.get());
    }
}
