package p000;
/* renamed from: K53 */
/* loaded from: classes4.dex */
public final class K53 implements InterfaceC48812sj1<InterfaceC43072j21> {

    /* renamed from: a */
    public final P43 f19041a;

    /* renamed from: b */
    public final Y94<MN4> f19042b;

    public K53(P43 p43, Y94<MN4> y94) {
        this.f19041a = p43;
        this.f19042b = y94;
    }

    /* renamed from: a */
    public static K53 m99249a(P43 p43, Y94<MN4> y94) {
        return new K53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC43072j21 m99247c(P43 p43, MN4 mn4) {
        return (InterfaceC43072j21) C51679xZ3.m5002e(p43.m90969V(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC43072j21 get() {
        return m99247c(this.f19041a, this.f19042b.get());
    }
}
