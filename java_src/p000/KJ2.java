package p000;
/* renamed from: KJ2 */
/* loaded from: classes4.dex */
public final class KJ2 implements InterfaceC48812sj1<InterfaceC6909Qo> {

    /* renamed from: a */
    public final VH2 f19421a;

    /* renamed from: b */
    public final Y94<InterfaceC52534yz6> f19422b;

    public KJ2(VH2 vh2, Y94<InterfaceC52534yz6> y94) {
        this.f19421a = vh2;
        this.f19422b = y94;
    }

    /* renamed from: a */
    public static KJ2 m99018a(VH2 vh2, Y94<InterfaceC52534yz6> y94) {
        return new KJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC6909Qo m99016c(VH2 vh2, InterfaceC52534yz6 interfaceC52534yz6) {
        return (InterfaceC6909Qo) C51679xZ3.m5002e(vh2.m80087Q0(interfaceC52534yz6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC6909Qo get() {
        return m99016c(this.f19421a, this.f19422b.get());
    }
}
