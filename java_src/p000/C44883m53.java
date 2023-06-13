package p000;
/* renamed from: m53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44883m53 implements InterfaceC48812sj1<InterfaceC7153RM> {

    /* renamed from: a */
    public final P43 f97315a;

    /* renamed from: b */
    public final Y94<MN4> f97316b;

    public C44883m53(P43 p43, Y94<MN4> y94) {
        this.f97315a = p43;
        this.f97316b = y94;
    }

    /* renamed from: a */
    public static C44883m53 m26361a(P43 p43, Y94<MN4> y94) {
        return new C44883m53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC7153RM m26359c(P43 p43, MN4 mn4) {
        return (InterfaceC7153RM) C51679xZ3.m5002e(p43.m90890x(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC7153RM get() {
        return m26359c(this.f97315a, this.f97316b.get());
    }
}
