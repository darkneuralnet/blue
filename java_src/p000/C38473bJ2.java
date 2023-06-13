package p000;
/* renamed from: bJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38473bJ2 implements InterfaceC48812sj1<InterfaceC52757zN3> {

    /* renamed from: a */
    public final VH2 f57259a;

    /* renamed from: b */
    public final Y94<LL3> f57260b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f57261c;

    /* renamed from: d */
    public final Y94<InterfaceC42586iD1> f57262d;

    /* renamed from: e */
    public final Y94<AM3> f57263e;

    /* renamed from: f */
    public final Y94<VM3> f57264f;

    /* renamed from: g */
    public final Y94<InterfaceC35660Rh6> f57265g;

    public C38473bJ2(VH2 vh2, Y94<LL3> y94, Y94<C36207Tq4> y942, Y94<InterfaceC42586iD1> y943, Y94<AM3> y944, Y94<VM3> y945, Y94<InterfaceC35660Rh6> y946) {
        this.f57259a = vh2;
        this.f57260b = y94;
        this.f57261c = y942;
        this.f57262d = y943;
        this.f57263e = y944;
        this.f57264f = y945;
        this.f57265g = y946;
    }

    /* renamed from: a */
    public static C38473bJ2 m64694a(VH2 vh2, Y94<LL3> y94, Y94<C36207Tq4> y942, Y94<InterfaceC42586iD1> y943, Y94<AM3> y944, Y94<VM3> y945, Y94<InterfaceC35660Rh6> y946) {
        return new C38473bJ2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static InterfaceC52757zN3 m64692c(VH2 vh2, LL3 ll3, C36207Tq4 c36207Tq4, InterfaceC42586iD1 interfaceC42586iD1, AM3 am3, VM3 vm3, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (InterfaceC52757zN3) C51679xZ3.m5002e(vh2.m80060g0(ll3, c36207Tq4, interfaceC42586iD1, am3, vm3, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC52757zN3 get() {
        return m64692c(this.f57259a, this.f57260b.get(), this.f57261c.get(), this.f57262d.get(), this.f57263e.get(), this.f57264f.get(), this.f57265g.get());
    }
}
