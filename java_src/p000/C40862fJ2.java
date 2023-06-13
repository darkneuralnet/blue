package p000;
/* renamed from: fJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40862fJ2 implements InterfaceC48812sj1<XY3> {

    /* renamed from: a */
    public final VH2 f79835a;

    /* renamed from: b */
    public final Y94<WY3> f79836b;

    public C40862fJ2(VH2 vh2, Y94<WY3> y94) {
        this.f79835a = vh2;
        this.f79836b = y94;
    }

    /* renamed from: a */
    public static C40862fJ2 m41592a(VH2 vh2, Y94<WY3> y94) {
        return new C40862fJ2(vh2, y94);
    }

    /* renamed from: c */
    public static XY3 m41590c(VH2 vh2, WY3 wy3) {
        return (XY3) C51679xZ3.m5002e(vh2.m80052k0(wy3));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public XY3 get() {
        return m41590c(this.f79835a, this.f79836b.get());
    }
}
