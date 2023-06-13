package p000;
/* renamed from: L63 */
/* loaded from: classes4.dex */
public final class L63 implements InterfaceC48812sj1<InterfaceC40425ea5> {

    /* renamed from: a */
    public final P43 f20755a;

    /* renamed from: b */
    public final Y94<MN4> f20756b;

    public L63(P43 p43, Y94<MN4> y94) {
        this.f20755a = p43;
        this.f20756b = y94;
    }

    /* renamed from: a */
    public static L63 m97773a(P43 p43, Y94<MN4> y94) {
        return new L63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC40425ea5 m97771c(P43 p43, MN4 mn4) {
        return (InterfaceC40425ea5) C51679xZ3.m5002e(p43.m90960Z0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40425ea5 get() {
        return m97771c(this.f20755a, this.f20756b.get());
    }
}
