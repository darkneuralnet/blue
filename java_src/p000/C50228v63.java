package p000;
/* renamed from: v63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50228v63 implements InterfaceC48812sj1<LL3> {

    /* renamed from: a */
    public final P43 f113529a;

    /* renamed from: b */
    public final Y94<MN4> f113530b;

    public C50228v63(P43 p43, Y94<MN4> y94) {
        this.f113529a = p43;
        this.f113530b = y94;
    }

    /* renamed from: a */
    public static C50228v63 m9190a(P43 p43, Y94<MN4> y94) {
        return new C50228v63(p43, y94);
    }

    /* renamed from: c */
    public static LL3 m9188c(P43 p43, MN4 mn4) {
        return (LL3) C51679xZ3.m5002e(p43.m90995I0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public LL3 get() {
        return m9188c(this.f113529a, this.f113530b.get());
    }
}
