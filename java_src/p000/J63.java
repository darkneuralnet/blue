package p000;
/* renamed from: J63 */
/* loaded from: classes4.dex */
public final class J63 implements InterfaceC48812sj1<PU4> {

    /* renamed from: a */
    public final P43 f16845a;

    /* renamed from: b */
    public final Y94<MN4> f16846b;

    public J63(P43 p43, Y94<MN4> y94) {
        this.f16845a = p43;
        this.f16846b = y94;
    }

    /* renamed from: a */
    public static J63 m101146a(P43 p43, Y94<MN4> y94) {
        return new J63(p43, y94);
    }

    /* renamed from: c */
    public static PU4 m101144c(P43 p43, MN4 mn4) {
        return (PU4) C51679xZ3.m5002e(p43.m90964X0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public PU4 get() {
        return m101144c(this.f16845a, this.f16846b.get());
    }
}
