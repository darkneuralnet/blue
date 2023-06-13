package p000;
/* renamed from: S63 */
/* loaded from: classes4.dex */
public final class S63 implements InterfaceC48812sj1<InterfaceC42042hI5> {

    /* renamed from: a */
    public final P43 f33161a;

    /* renamed from: b */
    public final Y94<MN4> f33162b;

    public S63(P43 p43, Y94<MN4> y94) {
        this.f33161a = p43;
        this.f33162b = y94;
    }

    /* renamed from: a */
    public static S63 m86009a(P43 p43, Y94<MN4> y94) {
        return new S63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC42042hI5 m86007c(P43 p43, MN4 mn4) {
        return (InterfaceC42042hI5) C51679xZ3.m5002e(p43.m90939g1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC42042hI5 get() {
        return m86007c(this.f33161a, this.f33162b.get());
    }
}
