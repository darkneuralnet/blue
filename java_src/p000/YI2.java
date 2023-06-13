package p000;
/* renamed from: YI2 */
/* loaded from: classes4.dex */
public final class YI2 implements InterfaceC48812sj1<GI3> {

    /* renamed from: a */
    public final VH2 f44947a;

    /* renamed from: b */
    public final Y94<FI3> f44948b;

    /* renamed from: c */
    public final Y94<InterfaceC36187To2> f44949c;

    public YI2(VH2 vh2, Y94<FI3> y94, Y94<InterfaceC36187To2> y942) {
        this.f44947a = vh2;
        this.f44948b = y94;
        this.f44949c = y942;
    }

    /* renamed from: a */
    public static YI2 m75268a(VH2 vh2, Y94<FI3> y94, Y94<InterfaceC36187To2> y942) {
        return new YI2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static GI3 m75266c(VH2 vh2, FI3 fi3, InterfaceC36187To2 interfaceC36187To2) {
        return (GI3) C51679xZ3.m5002e(vh2.m80066d0(fi3, interfaceC36187To2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public GI3 get() {
        return m75266c(this.f44947a, this.f44948b.get(), this.f44949c.get());
    }
}
