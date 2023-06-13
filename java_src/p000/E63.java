package p000;
/* renamed from: E63 */
/* loaded from: classes4.dex */
public final class E63 implements InterfaceC48812sj1<InterfaceC33939Jy4> {

    /* renamed from: a */
    public final P43 f6965a;

    /* renamed from: b */
    public final Y94<MN4> f6966b;

    public E63(P43 p43, Y94<MN4> y94) {
        this.f6965a = p43;
        this.f6966b = y94;
    }

    /* renamed from: a */
    public static E63 m109389a(P43 p43, Y94<MN4> y94) {
        return new E63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC33939Jy4 m109387c(P43 p43, MN4 mn4) {
        return (InterfaceC33939Jy4) C51679xZ3.m5002e(p43.m90974S0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC33939Jy4 get() {
        return m109387c(this.f6965a, this.f6966b.get());
    }
}
