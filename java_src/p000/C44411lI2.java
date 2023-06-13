package p000;
/* renamed from: lI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44411lI2 implements InterfaceC48812sj1<InterfaceC33585Il1> {

    /* renamed from: a */
    public final VH2 f95850a;

    /* renamed from: b */
    public final Y94<C22454gl> f95851b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f95852c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f95853d;

    public C44411lI2(VH2 vh2, Y94<C22454gl> y94, Y94<InterfaceC35660Rh6> y942, Y94<C36207Tq4> y943) {
        this.f95850a = vh2;
        this.f95851b = y94;
        this.f95852c = y942;
        this.f95853d = y943;
    }

    /* renamed from: a */
    public static C44411lI2 m27441a(VH2 vh2, Y94<C22454gl> y94, Y94<InterfaceC35660Rh6> y942, Y94<C36207Tq4> y943) {
        return new C44411lI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC33585Il1 m27439c(VH2 vh2, C22454gl c22454gl, InterfaceC35660Rh6 interfaceC35660Rh6, C36207Tq4 c36207Tq4) {
        return (InterfaceC33585Il1) C51679xZ3.m5002e(vh2.m80043p(c22454gl, interfaceC35660Rh6, c36207Tq4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC33585Il1 get() {
        return m27439c(this.f95850a, this.f95851b.get(), this.f95852c.get(), this.f95853d.get());
    }
}
