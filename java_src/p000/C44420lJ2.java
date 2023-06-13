package p000;
/* renamed from: lJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44420lJ2 implements InterfaceC48812sj1<MK4> {

    /* renamed from: a */
    public final VH2 f95861a;

    /* renamed from: b */
    public final Y94<InterfaceC51545xK4> f95862b;

    /* renamed from: c */
    public final Y94<C22454gl> f95863c;

    /* renamed from: d */
    public final Y94<YR4> f95864d;

    /* renamed from: e */
    public final Y94<InterfaceC46893pU4> f95865e;

    /* renamed from: f */
    public final Y94<InterfaceC46820pM3> f95866f;

    /* renamed from: g */
    public final Y94<InterfaceC35660Rh6> f95867g;

    public C44420lJ2(VH2 vh2, Y94<InterfaceC51545xK4> y94, Y94<C22454gl> y942, Y94<YR4> y943, Y94<InterfaceC46893pU4> y944, Y94<InterfaceC46820pM3> y945, Y94<InterfaceC35660Rh6> y946) {
        this.f95861a = vh2;
        this.f95862b = y94;
        this.f95863c = y942;
        this.f95864d = y943;
        this.f95865e = y944;
        this.f95866f = y945;
        this.f95867g = y946;
    }

    /* renamed from: a */
    public static C44420lJ2 m27431a(VH2 vh2, Y94<InterfaceC51545xK4> y94, Y94<C22454gl> y942, Y94<YR4> y943, Y94<InterfaceC46893pU4> y944, Y94<InterfaceC46820pM3> y945, Y94<InterfaceC35660Rh6> y946) {
        return new C44420lJ2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static MK4 m27429c(VH2 vh2, InterfaceC51545xK4 interfaceC51545xK4, C22454gl c22454gl, YR4 yr4, InterfaceC46893pU4 interfaceC46893pU4, InterfaceC46820pM3 interfaceC46820pM3, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (MK4) C51679xZ3.m5002e(vh2.m80038r0(interfaceC51545xK4, c22454gl, yr4, interfaceC46893pU4, interfaceC46820pM3, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MK4 get() {
        return m27429c(this.f95861a, this.f95862b.get(), this.f95863c.get(), this.f95864d.get(), this.f95865e.get(), this.f95866f.get(), this.f95867g.get());
    }
}
