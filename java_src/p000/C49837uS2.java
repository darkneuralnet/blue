package p000;
/* renamed from: uS2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49837uS2 implements InterfaceC48812sj1<C49244tS2> {

    /* renamed from: a */
    public final Y94<InterfaceC35660Rh6> f112387a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f112388b;

    /* renamed from: c */
    public final Y94<BQ2> f112389c;

    /* renamed from: d */
    public final Y94<InterfaceC40359eT2> f112390d;

    public C49837uS2(Y94<InterfaceC35660Rh6> y94, Y94<C36207Tq4> y942, Y94<BQ2> y943, Y94<InterfaceC40359eT2> y944) {
        this.f112387a = y94;
        this.f112388b = y942;
        this.f112389c = y943;
        this.f112390d = y944;
    }

    /* renamed from: a */
    public static C49837uS2 m10274a(Y94<InterfaceC35660Rh6> y94, Y94<C36207Tq4> y942, Y94<BQ2> y943, Y94<InterfaceC40359eT2> y944) {
        return new C49837uS2(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C49244tS2 m10272c(InterfaceC35660Rh6 interfaceC35660Rh6, C36207Tq4 c36207Tq4, BQ2 bq2, InterfaceC40359eT2 interfaceC40359eT2) {
        return new C49244tS2(interfaceC35660Rh6, c36207Tq4, bq2, interfaceC40359eT2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49244tS2 get() {
        return m10272c(this.f112387a.get(), this.f112388b.get(), this.f112389c.get(), this.f112390d.get());
    }
}
