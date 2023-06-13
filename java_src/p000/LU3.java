package p000;
/* renamed from: LU3 */
/* loaded from: classes3.dex */
public final class LU3 implements InterfaceC48812sj1<JU3> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f21520a;

    /* renamed from: b */
    public final Y94<InterfaceC23227iO> f21521b;

    /* renamed from: c */
    public final Y94<InterfaceC49950ue3> f21522c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f21523d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f21524e;

    /* renamed from: f */
    public final Y94<String> f21525f;

    public LU3(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC23227iO> y942, Y94<InterfaceC49950ue3> y943, Y94<C36207Tq4> y944, Y94<InterfaceC40099e13> y945, Y94<String> y946) {
        this.f21520a = y94;
        this.f21521b = y942;
        this.f21522c = y943;
        this.f21523d = y944;
        this.f21524e = y945;
        this.f21525f = y946;
    }

    /* renamed from: a */
    public static LU3 m96890a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC23227iO> y942, Y94<InterfaceC49950ue3> y943, Y94<C36207Tq4> y944, Y94<InterfaceC40099e13> y945, Y94<String> y946) {
        return new LU3(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static JU3 m96888c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC23227iO interfaceC23227iO, InterfaceC49950ue3 interfaceC49950ue3, C36207Tq4 c36207Tq4, InterfaceC40099e13 interfaceC40099e13, String str) {
        return new JU3(interfaceC1880Ea, interfaceC23227iO, interfaceC49950ue3, c36207Tq4, interfaceC40099e13, str);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public JU3 get() {
        return m96888c(this.f21520a.get(), this.f21521b.get(), this.f21522c.get(), this.f21523d.get(), this.f21524e.get(), this.f21525f.get());
    }
}
