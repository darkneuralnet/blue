package p000;
/* renamed from: MX4 */
/* loaded from: classes4.dex */
public final class MX4 implements InterfaceC48812sj1<LX4> {

    /* renamed from: a */
    public final Y94<PU4> f23225a;

    /* renamed from: b */
    public final Y94<InterfaceC47478qT5> f23226b;

    /* renamed from: c */
    public final Y94<CX4> f23227c;

    /* renamed from: d */
    public final Y94<C22454gl> f23228d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f23229e;

    public MX4(Y94<PU4> y94, Y94<InterfaceC47478qT5> y942, Y94<CX4> y943, Y94<C22454gl> y944, Y94<C36207Tq4> y945) {
        this.f23225a = y94;
        this.f23226b = y942;
        this.f23227c = y943;
        this.f23228d = y944;
        this.f23229e = y945;
    }

    /* renamed from: a */
    public static MX4 m95178a(Y94<PU4> y94, Y94<InterfaceC47478qT5> y942, Y94<CX4> y943, Y94<C22454gl> y944, Y94<C36207Tq4> y945) {
        return new MX4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static LX4 m95176c(PU4 pu4, InterfaceC47478qT5 interfaceC47478qT5, CX4 cx4, C22454gl c22454gl, C36207Tq4 c36207Tq4) {
        return new LX4(pu4, interfaceC47478qT5, cx4, c22454gl, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public LX4 get() {
        return m95176c(this.f23225a.get(), this.f23226b.get(), this.f23227c.get(), this.f23228d.get(), this.f23229e.get());
    }
}
