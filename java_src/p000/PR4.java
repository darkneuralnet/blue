package p000;
/* renamed from: PR4 */
/* loaded from: classes4.dex */
public final class PR4 implements InterfaceC48812sj1<OR4> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f28493a;

    public PR4(Y94<InterfaceC36152Tk3> y94) {
        this.f28493a = y94;
    }

    /* renamed from: a */
    public static PR4 m90252a(Y94<InterfaceC36152Tk3> y94) {
        return new PR4(y94);
    }

    /* renamed from: c */
    public static OR4 m90250c(InterfaceC36152Tk3 interfaceC36152Tk3) {
        return new OR4(interfaceC36152Tk3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OR4 get() {
        return m90250c(this.f28493a.get());
    }
}
