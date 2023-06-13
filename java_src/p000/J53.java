package p000;
/* renamed from: J53 */
/* loaded from: classes4.dex */
public final class J53 implements InterfaceC48812sj1<IT0> {

    /* renamed from: a */
    public final P43 f16812a;

    /* renamed from: b */
    public final Y94<MN4> f16813b;

    public J53(P43 p43, Y94<MN4> y94) {
        this.f16812a = p43;
        this.f16813b = y94;
    }

    /* renamed from: a */
    public static J53 m101179a(P43 p43, Y94<MN4> y94) {
        return new J53(p43, y94);
    }

    /* renamed from: c */
    public static IT0 m101177c(P43 p43, MN4 mn4) {
        return (IT0) C51679xZ3.m5002e(p43.m90971U(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public IT0 get() {
        return m101177c(this.f16812a, this.f16813b.get());
    }
}
