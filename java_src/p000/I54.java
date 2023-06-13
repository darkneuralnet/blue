package p000;
/* renamed from: I54 */
/* loaded from: classes4.dex */
public final class I54 implements InterfaceC48812sj1<F54> {

    /* renamed from: a */
    public final Y94<InterfaceC35660Rh6> f14477a;

    /* renamed from: b */
    public final Y94<GI3> f14478b;

    /* renamed from: c */
    public final Y94<InterfaceC46663p54> f14479c;

    /* renamed from: d */
    public final Y94<InterfaceC20345fH> f14480d;

    /* renamed from: e */
    public final Y94<InterfaceC7168RR> f14481e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f14482f;

    public I54(Y94<InterfaceC35660Rh6> y94, Y94<GI3> y942, Y94<InterfaceC46663p54> y943, Y94<InterfaceC20345fH> y944, Y94<InterfaceC7168RR> y945, Y94<C36207Tq4> y946) {
        this.f14477a = y94;
        this.f14478b = y942;
        this.f14479c = y943;
        this.f14480d = y944;
        this.f14481e = y945;
        this.f14482f = y946;
    }

    /* renamed from: a */
    public static I54 m102978a(Y94<InterfaceC35660Rh6> y94, Y94<GI3> y942, Y94<InterfaceC46663p54> y943, Y94<InterfaceC20345fH> y944, Y94<InterfaceC7168RR> y945, Y94<C36207Tq4> y946) {
        return new I54(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static F54 m102976c(InterfaceC35660Rh6 interfaceC35660Rh6, GI3 gi3, InterfaceC46663p54 interfaceC46663p54, InterfaceC20345fH interfaceC20345fH, InterfaceC7168RR interfaceC7168RR, C36207Tq4 c36207Tq4) {
        return new F54(interfaceC35660Rh6, gi3, interfaceC46663p54, interfaceC20345fH, interfaceC7168RR, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public F54 get() {
        return m102976c(this.f14477a.get(), this.f14478b.get(), this.f14479c.get(), this.f14480d.get(), this.f14481e.get(), this.f14482f.get());
    }
}
