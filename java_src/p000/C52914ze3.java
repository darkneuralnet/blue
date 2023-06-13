package p000;
/* renamed from: ze3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52914ze3 implements InterfaceC48812sj1<C52321ye3> {

    /* renamed from: a */
    public final Y94<InterfaceC35660Rh6> f121684a;

    /* renamed from: b */
    public final Y94<O01> f121685b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f121686c;

    /* renamed from: d */
    public final Y94<InterfaceC46986pe3> f121687d;

    /* renamed from: e */
    public final Y94<InterfaceC40001dr4> f121688e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f121689f;

    /* renamed from: g */
    public final Y94<V74> f121690g;

    public C52914ze3(Y94<InterfaceC35660Rh6> y94, Y94<O01> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC46986pe3> y944, Y94<InterfaceC40001dr4> y945, Y94<C36207Tq4> y946, Y94<V74> y947) {
        this.f121684a = y94;
        this.f121685b = y942;
        this.f121686c = y943;
        this.f121687d = y944;
        this.f121688e = y945;
        this.f121689f = y946;
        this.f121690g = y947;
    }

    /* renamed from: a */
    public static C52914ze3 m937a(Y94<InterfaceC35660Rh6> y94, Y94<O01> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC46986pe3> y944, Y94<InterfaceC40001dr4> y945, Y94<C36207Tq4> y946, Y94<V74> y947) {
        return new C52914ze3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C52321ye3 m935c(InterfaceC35660Rh6 interfaceC35660Rh6, O01 o01, InterfaceC1880Ea interfaceC1880Ea, InterfaceC46986pe3 interfaceC46986pe3, InterfaceC40001dr4 interfaceC40001dr4, C36207Tq4 c36207Tq4, V74 v74) {
        return new C52321ye3(interfaceC35660Rh6, o01, interfaceC1880Ea, interfaceC46986pe3, interfaceC40001dr4, c36207Tq4, v74);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52321ye3 get() {
        return m935c(this.f121684a.get(), this.f121685b.get(), this.f121686c.get(), this.f121687d.get(), this.f121688e.get(), this.f121689f.get(), this.f121690g.get());
    }
}
