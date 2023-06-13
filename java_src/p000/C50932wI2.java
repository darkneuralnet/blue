package p000;
/* renamed from: wI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50932wI2 implements InterfaceC48812sj1<InterfaceC43160jB0> {

    /* renamed from: a */
    public final VH2 f115763a;

    /* renamed from: b */
    public final Y94<InterfaceC42567iB0> f115764b;

    /* renamed from: c */
    public final Y94<InterfaceC8601VK> f115765c;

    /* renamed from: d */
    public final Y94<InterfaceC43381jZ5> f115766d;

    /* renamed from: e */
    public final Y94<C22454gl> f115767e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f115768f;

    /* renamed from: g */
    public final Y94<InterfaceC35660Rh6> f115769g;

    public C50932wI2(VH2 vh2, Y94<InterfaceC42567iB0> y94, Y94<InterfaceC8601VK> y942, Y94<InterfaceC43381jZ5> y943, Y94<C22454gl> y944, Y94<C36207Tq4> y945, Y94<InterfaceC35660Rh6> y946) {
        this.f115763a = vh2;
        this.f115764b = y94;
        this.f115765c = y942;
        this.f115766d = y943;
        this.f115767e = y944;
        this.f115768f = y945;
        this.f115769g = y946;
    }

    /* renamed from: a */
    public static C50932wI2 m7037a(VH2 vh2, Y94<InterfaceC42567iB0> y94, Y94<InterfaceC8601VK> y942, Y94<InterfaceC43381jZ5> y943, Y94<C22454gl> y944, Y94<C36207Tq4> y945, Y94<InterfaceC35660Rh6> y946) {
        return new C50932wI2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static InterfaceC43160jB0 m7035c(VH2 vh2, InterfaceC42567iB0 interfaceC42567iB0, InterfaceC8601VK interfaceC8601VK, InterfaceC43381jZ5 interfaceC43381jZ5, C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (InterfaceC43160jB0) C51679xZ3.m5002e(vh2.m80120A(interfaceC42567iB0, interfaceC8601VK, interfaceC43381jZ5, c22454gl, c36207Tq4, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC43160jB0 get() {
        return m7035c(this.f115763a, this.f115764b.get(), this.f115765c.get(), this.f115766d.get(), this.f115767e.get(), this.f115768f.get(), this.f115769g.get());
    }
}
