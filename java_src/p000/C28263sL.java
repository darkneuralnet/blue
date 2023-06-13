package p000;
/* renamed from: sL */
/* loaded from: classes4.dex */
public final class C28263sL implements InterfaceC48812sj1<C26907oL> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f108605a;

    /* renamed from: b */
    public final Y94<C22454gl> f108606b;

    /* renamed from: c */
    public final Y94<InterfaceC43072j21> f108607c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f108608d;

    /* renamed from: e */
    public final Y94<InterfaceC35660Rh6> f108609e;

    public C28263sL(Y94<InterfaceC1880Ea> y94, Y94<C22454gl> y942, Y94<InterfaceC43072j21> y943, Y94<C36207Tq4> y944, Y94<InterfaceC35660Rh6> y945) {
        this.f108605a = y94;
        this.f108606b = y942;
        this.f108607c = y943;
        this.f108608d = y944;
        this.f108609e = y945;
    }

    /* renamed from: a */
    public static C28263sL m14384a(Y94<InterfaceC1880Ea> y94, Y94<C22454gl> y942, Y94<InterfaceC43072j21> y943, Y94<C36207Tq4> y944, Y94<InterfaceC35660Rh6> y945) {
        return new C28263sL(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C26907oL m14382c(InterfaceC1880Ea interfaceC1880Ea, C22454gl c22454gl, InterfaceC43072j21 interfaceC43072j21, C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new C26907oL(interfaceC1880Ea, c22454gl, interfaceC43072j21, c36207Tq4, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C26907oL get() {
        return m14382c(this.f108605a.get(), this.f108606b.get(), this.f108607c.get(), this.f108608d.get(), this.f108609e.get());
    }
}
