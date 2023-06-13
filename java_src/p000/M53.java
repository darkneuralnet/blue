package p000;
/* renamed from: M53 */
/* loaded from: classes4.dex */
public final class M53 implements InterfaceC48812sj1<InterfaceC37758a61> {

    /* renamed from: a */
    public final P43 f22615a;

    /* renamed from: b */
    public final Y94<MN4> f22616b;

    public M53(P43 p43, Y94<MN4> y94) {
        this.f22615a = p43;
        this.f22616b = y94;
    }

    /* renamed from: a */
    public static M53 m95834a(P43 p43, Y94<MN4> y94) {
        return new M53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC37758a61 m95832c(P43 p43, MN4 mn4) {
        return (InterfaceC37758a61) C51679xZ3.m5002e(p43.m90965X(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC37758a61 get() {
        return m95832c(this.f22615a, this.f22616b.get());
    }
}
