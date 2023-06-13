package p000;
/* renamed from: aJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37880aJ2 implements InterfaceC48812sj1<VM3> {

    /* renamed from: a */
    public final VH2 f50277a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f50278b;

    /* renamed from: c */
    public final Y94<ML3> f50279c;

    /* renamed from: d */
    public final Y94<C22454gl> f50280d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f50281e;

    /* renamed from: f */
    public final Y94<InterfaceC49840uS5> f50282f;

    /* renamed from: g */
    public final Y94<InterfaceC44637lg6> f50283g;

    /* renamed from: h */
    public final Y94<InterfaceC44647lh6> f50284h;

    /* renamed from: i */
    public final Y94<InterfaceC35660Rh6> f50285i;

    public C37880aJ2(VH2 vh2, Y94<InterfaceC1880Ea> y94, Y94<ML3> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<InterfaceC49840uS5> y945, Y94<InterfaceC44637lg6> y946, Y94<InterfaceC44647lh6> y947, Y94<InterfaceC35660Rh6> y948) {
        this.f50277a = vh2;
        this.f50278b = y94;
        this.f50279c = y942;
        this.f50280d = y943;
        this.f50281e = y944;
        this.f50282f = y945;
        this.f50283g = y946;
        this.f50284h = y947;
        this.f50285i = y948;
    }

    /* renamed from: a */
    public static C37880aJ2 m71667a(VH2 vh2, Y94<InterfaceC1880Ea> y94, Y94<ML3> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<InterfaceC49840uS5> y945, Y94<InterfaceC44637lg6> y946, Y94<InterfaceC44647lh6> y947, Y94<InterfaceC35660Rh6> y948) {
        return new C37880aJ2(vh2, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static VM3 m71665c(VH2 vh2, InterfaceC1880Ea interfaceC1880Ea, ML3 ml3, C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC49840uS5 interfaceC49840uS5, InterfaceC44637lg6 interfaceC44637lg6, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (VM3) C51679xZ3.m5002e(vh2.m80062f0(interfaceC1880Ea, ml3, c22454gl, c36207Tq4, interfaceC49840uS5, interfaceC44637lg6, interfaceC44647lh6, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public VM3 get() {
        return m71665c(this.f50277a, this.f50278b.get(), this.f50279c.get(), this.f50280d.get(), this.f50281e.get(), this.f50282f.get(), this.f50283g.get(), this.f50284h.get(), this.f50285i.get());
    }
}
