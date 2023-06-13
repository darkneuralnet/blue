package p000;
/* renamed from: I63 */
/* loaded from: classes4.dex */
public final class I63 implements InterfaceC48812sj1<NP4> {

    /* renamed from: a */
    public final P43 f14528a;

    /* renamed from: b */
    public final Y94<MN4> f14529b;

    public I63(P43 p43, Y94<MN4> y94) {
        this.f14528a = p43;
        this.f14529b = y94;
    }

    /* renamed from: a */
    public static I63 m102942a(P43 p43, Y94<MN4> y94) {
        return new I63(p43, y94);
    }

    /* renamed from: c */
    public static NP4 m102940c(P43 p43, MN4 mn4) {
        return (NP4) C51679xZ3.m5002e(p43.m90966W0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public NP4 get() {
        return m102940c(this.f14528a, this.f14529b.get());
    }
}
