package p000;
/* renamed from: u63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49636u63 implements InterfaceC48812sj1<FI3> {

    /* renamed from: a */
    public final P43 f111756a;

    /* renamed from: b */
    public final Y94<MN4> f111757b;

    public C49636u63(P43 p43, Y94<MN4> y94) {
        this.f111756a = p43;
        this.f111757b = y94;
    }

    /* renamed from: a */
    public static C49636u63 m10858a(P43 p43, Y94<MN4> y94) {
        return new C49636u63(p43, y94);
    }

    /* renamed from: c */
    public static FI3 m10856c(P43 p43, MN4 mn4) {
        return (FI3) C51679xZ3.m5002e(p43.m90998H0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FI3 get() {
        return m10856c(this.f111756a, this.f111757b.get());
    }
}
