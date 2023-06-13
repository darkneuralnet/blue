package p000;
/* renamed from: S43 */
/* loaded from: classes4.dex */
public final class S43 implements InterfaceC48812sj1<BQ2> {

    /* renamed from: a */
    public final P43 f33127a;

    /* renamed from: b */
    public final Y94<MN4> f33128b;

    public S43(P43 p43, Y94<MN4> y94) {
        this.f33127a = p43;
        this.f33128b = y94;
    }

    /* renamed from: a */
    public static S43 m86035a(P43 p43, Y94<MN4> y94) {
        return new S43(p43, y94);
    }

    /* renamed from: c */
    public static BQ2 m86033c(P43 p43, MN4 mn4) {
        return (BQ2) C51679xZ3.m5002e(p43.m90950d(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BQ2 get() {
        return m86033c(this.f33127a, this.f33128b.get());
    }
}
