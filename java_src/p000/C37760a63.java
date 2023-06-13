package p000;
/* renamed from: a63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37760a63 implements InterfaceC48812sj1<U72> {

    /* renamed from: a */
    public final P43 f49830a;

    /* renamed from: b */
    public final Y94<MN4> f49831b;

    public C37760a63(P43 p43, Y94<MN4> y94) {
        this.f49830a = p43;
        this.f49831b = y94;
    }

    /* renamed from: a */
    public static C37760a63 m71899a(P43 p43, Y94<MN4> y94) {
        return new C37760a63(p43, y94);
    }

    /* renamed from: c */
    public static U72 m71897c(P43 p43, MN4 mn4) {
        return (U72) C51679xZ3.m5002e(p43.m90919n0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public U72 get() {
        return m71897c(this.f49830a, this.f49831b.get());
    }
}
