package p000;
/* renamed from: B53 */
/* loaded from: classes4.dex */
public final class B53 implements InterfaceC48812sj1<InterfaceC33854Jp0> {

    /* renamed from: a */
    public final P43 f1647a;

    /* renamed from: b */
    public final Y94<MN4> f1648b;

    public B53(P43 p43, Y94<MN4> y94) {
        this.f1647a = p43;
        this.f1648b = y94;
    }

    /* renamed from: a */
    public static B53 m114701a(P43 p43, Y94<MN4> y94) {
        return new B53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC33854Jp0 m114699c(P43 p43, MN4 mn4) {
        return (InterfaceC33854Jp0) C51679xZ3.m5002e(p43.m90987M(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC33854Jp0 get() {
        return m114699c(this.f1647a, this.f1648b.get());
    }
}
