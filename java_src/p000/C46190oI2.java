package p000;
/* renamed from: oI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46190oI2 implements InterfaceC48812sj1<InterfaceC50768w10> {

    /* renamed from: a */
    public final VH2 f101736a;

    /* renamed from: b */
    public final Y94<LL3> f101737b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f101738c;

    /* renamed from: d */
    public final Y94<C22454gl> f101739d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f101740e;

    /* renamed from: f */
    public final Y94<InterfaceC44647lh6> f101741f;

    /* renamed from: g */
    public final Y94<InterfaceC20357fL> f101742g;

    public C46190oI2(VH2 vh2, Y94<LL3> y94, Y94<InterfaceC1880Ea> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<InterfaceC44647lh6> y945, Y94<InterfaceC20357fL> y946) {
        this.f101736a = vh2;
        this.f101737b = y94;
        this.f101738c = y942;
        this.f101739d = y943;
        this.f101740e = y944;
        this.f101741f = y945;
        this.f101742g = y946;
    }

    /* renamed from: a */
    public static C46190oI2 m21409a(VH2 vh2, Y94<LL3> y94, Y94<InterfaceC1880Ea> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<InterfaceC44647lh6> y945, Y94<InterfaceC20357fL> y946) {
        return new C46190oI2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static InterfaceC50768w10 m21407c(VH2 vh2, LL3 ll3, InterfaceC1880Ea interfaceC1880Ea, C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC20357fL interfaceC20357fL) {
        return (InterfaceC50768w10) C51679xZ3.m5002e(vh2.m80037s(ll3, interfaceC1880Ea, c22454gl, c36207Tq4, interfaceC44647lh6, interfaceC20357fL));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC50768w10 get() {
        return m21407c(this.f101736a, this.f101737b.get(), this.f101738c.get(), this.f101739d.get(), this.f101740e.get(), this.f101741f.get(), this.f101742g.get());
    }
}
