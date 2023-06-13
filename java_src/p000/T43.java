package p000;
/* renamed from: T43 */
/* loaded from: classes4.dex */
public final class T43 implements InterfaceC48812sj1<InterfaceC25921m9> {

    /* renamed from: a */
    public final P43 f34729a;

    /* renamed from: b */
    public final Y94<MN4> f34730b;

    public T43(P43 p43, Y94<MN4> y94) {
        this.f34729a = p43;
        this.f34730b = y94;
    }

    /* renamed from: a */
    public static T43 m84374a(P43 p43, Y94<MN4> y94) {
        return new T43(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC25921m9 m84372c(P43 p43, MN4 mn4) {
        return (InterfaceC25921m9) C51679xZ3.m5002e(p43.m90947e(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC25921m9 get() {
        return m84372c(this.f34729a, this.f34730b.get());
    }
}
