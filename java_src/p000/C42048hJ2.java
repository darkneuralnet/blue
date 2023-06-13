package p000;
/* renamed from: hJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42048hJ2 implements InterfaceC48812sj1<InterfaceC31893Bf1> {

    /* renamed from: a */
    public final VH2 f84992a;

    /* renamed from: b */
    public final Y94<JT0> f84993b;

    /* renamed from: c */
    public final Y94<V74> f84994c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f84995d;

    /* renamed from: e */
    public final Y94<YR4> f84996e;

    /* renamed from: f */
    public final Y94<InterfaceC35660Rh6> f84997f;

    public C42048hJ2(VH2 vh2, Y94<JT0> y94, Y94<V74> y942, Y94<C36207Tq4> y943, Y94<YR4> y944, Y94<InterfaceC35660Rh6> y945) {
        this.f84992a = vh2;
        this.f84993b = y94;
        this.f84994c = y942;
        this.f84995d = y943;
        this.f84996e = y944;
        this.f84997f = y945;
    }

    /* renamed from: a */
    public static C42048hJ2 m36543a(VH2 vh2, Y94<JT0> y94, Y94<V74> y942, Y94<C36207Tq4> y943, Y94<YR4> y944, Y94<InterfaceC35660Rh6> y945) {
        return new C42048hJ2(vh2, y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static InterfaceC31893Bf1 m36541c(VH2 vh2, JT0 jt0, V74 v74, C36207Tq4 c36207Tq4, YR4 yr4, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (InterfaceC31893Bf1) C51679xZ3.m5002e(vh2.m80048m0(jt0, v74, c36207Tq4, yr4, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC31893Bf1 get() {
        return m36541c(this.f84992a, this.f84993b.get(), this.f84994c.get(), this.f84995d.get(), this.f84996e.get(), this.f84997f.get());
    }
}
