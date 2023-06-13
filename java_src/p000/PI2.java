package p000;
/* renamed from: PI2 */
/* loaded from: classes4.dex */
public final class PI2 implements InterfaceC48812sj1<InterfaceC32461Dq2> {

    /* renamed from: a */
    public final VH2 f28212a;

    /* renamed from: b */
    public final Y94<InterfaceC7378SL> f28213b;

    public PI2(VH2 vh2, Y94<InterfaceC7378SL> y94) {
        this.f28212a = vh2;
        this.f28213b = y94;
    }

    /* renamed from: a */
    public static PI2 m90503a(VH2 vh2, Y94<InterfaceC7378SL> y94) {
        return new PI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC32461Dq2 m90501c(VH2 vh2, InterfaceC7378SL interfaceC7378SL) {
        return (InterfaceC32461Dq2) C51679xZ3.m5002e(vh2.m80080U(interfaceC7378SL));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32461Dq2 get() {
        return m90501c(this.f28212a, this.f28213b.get());
    }
}
