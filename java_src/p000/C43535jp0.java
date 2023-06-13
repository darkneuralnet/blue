package p000;
/* renamed from: jp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43535jp0 implements InterfaceC48812sj1<C42942ip0> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f93391a;

    /* renamed from: b */
    public final Y94<InterfaceC27246pJ> f93392b;

    /* renamed from: c */
    public final Y94<InterfaceC48164rd5> f93393c;

    /* renamed from: d */
    public final Y94<C22454gl> f93394d;

    /* renamed from: e */
    public final Y94<InterfaceC7168RR> f93395e;

    public C43535jp0(Y94<InterfaceC10636aM> y94, Y94<InterfaceC27246pJ> y942, Y94<InterfaceC48164rd5> y943, Y94<C22454gl> y944, Y94<InterfaceC7168RR> y945) {
        this.f93391a = y94;
        this.f93392b = y942;
        this.f93393c = y943;
        this.f93394d = y944;
        this.f93395e = y945;
    }

    /* renamed from: a */
    public static C43535jp0 m29883a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC27246pJ> y942, Y94<InterfaceC48164rd5> y943, Y94<C22454gl> y944, Y94<InterfaceC7168RR> y945) {
        return new C43535jp0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C42942ip0 m29881c(InterfaceC10636aM interfaceC10636aM, InterfaceC27246pJ interfaceC27246pJ, InterfaceC48164rd5 interfaceC48164rd5, C22454gl c22454gl, InterfaceC7168RR interfaceC7168RR) {
        return new C42942ip0(interfaceC10636aM, interfaceC27246pJ, interfaceC48164rd5, c22454gl, interfaceC7168RR);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42942ip0 get() {
        return m29881c(this.f93391a.get(), this.f93392b.get(), this.f93393c.get(), this.f93394d.get(), this.f93395e.get());
    }
}
