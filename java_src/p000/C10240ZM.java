package p000;
/* renamed from: ZM */
/* loaded from: classes2.dex */
public final class C10240ZM implements InterfaceC48812sj1<C8997WM> {

    /* renamed from: a */
    public final Y94<InterfaceC7153RM> f48379a;

    /* renamed from: b */
    public final Y94<InterfaceC36863Wl3> f48380b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f48381c;

    /* renamed from: d */
    public final Y94<InterfaceC34441Mc2> f48382d;

    public C10240ZM(Y94<InterfaceC7153RM> y94, Y94<InterfaceC36863Wl3> y942, Y94<InterfaceC44647lh6> y943, Y94<InterfaceC34441Mc2> y944) {
        this.f48379a = y94;
        this.f48380b = y942;
        this.f48381c = y943;
        this.f48382d = y944;
    }

    /* renamed from: a */
    public static C10240ZM m73247a(Y94<InterfaceC7153RM> y94, Y94<InterfaceC36863Wl3> y942, Y94<InterfaceC44647lh6> y943, Y94<InterfaceC34441Mc2> y944) {
        return new C10240ZM(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C8997WM m73245c(InterfaceC7153RM interfaceC7153RM, InterfaceC36863Wl3 interfaceC36863Wl3, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC34441Mc2 interfaceC34441Mc2) {
        return new C8997WM(interfaceC7153RM, interfaceC36863Wl3, interfaceC44647lh6, interfaceC34441Mc2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C8997WM get() {
        return m73245c(this.f48379a.get(), this.f48380b.get(), this.f48381c.get(), this.f48382d.get());
    }
}
