package p000;
/* renamed from: r41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47836r41 implements InterfaceC49405tj1<C47243q41> {

    /* renamed from: a */
    public final Z94<InterfaceC34043Kk0> f106373a;

    /* renamed from: b */
    public final Z94<C48428s41> f106374b;

    public C47836r41(Z94<InterfaceC34043Kk0> z94, Z94<C48428s41> z942) {
        this.f106373a = z94;
        this.f106374b = z942;
    }

    /* renamed from: a */
    public static C47836r41 m16545a(Z94<InterfaceC34043Kk0> z94, Z94<C48428s41> z942) {
        return new C47836r41(z94, z942);
    }

    /* renamed from: c */
    public static C47243q41 m16543c(InterfaceC34043Kk0 interfaceC34043Kk0, C48428s41 c48428s41) {
        return new C47243q41(interfaceC34043Kk0, c48428s41);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C47243q41 get() {
        return m16543c(this.f106373a.get(), this.f106374b.get());
    }
}
