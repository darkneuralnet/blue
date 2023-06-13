package p000;
/* renamed from: Z53 */
/* loaded from: classes4.dex */
public final class Z53 implements InterfaceC48812sj1<InterfaceC47672qn6> {

    /* renamed from: a */
    public final P43 f47836a;

    /* renamed from: b */
    public final Y94<MN4> f47837b;

    public Z53(P43 p43, Y94<MN4> y94) {
        this.f47836a = p43;
        this.f47837b = y94;
    }

    /* renamed from: a */
    public static Z53 m73738a(P43 p43, Y94<MN4> y94) {
        return new Z53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC47672qn6 m73736c(P43 p43, MN4 mn4) {
        return (InterfaceC47672qn6) C51679xZ3.m5002e(p43.m90922m0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47672qn6 get() {
        return m73736c(this.f47836a, this.f47837b.get());
    }
}
