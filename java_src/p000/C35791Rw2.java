package p000;
/* renamed from: Rw2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35791Rw2 implements InterfaceC49405tj1<C35557Qw2> {

    /* renamed from: a */
    public final Z94<C51765xi0> f32913a;

    /* renamed from: b */
    public final Z94<C31919Bi0> f32914b;

    /* renamed from: c */
    public final Z94<Integer> f32915c;

    /* renamed from: d */
    public final Z94<Integer> f32916d;

    /* renamed from: e */
    public final Z94<Boolean> f32917e;

    public C35791Rw2(Z94<C51765xi0> z94, Z94<C31919Bi0> z942, Z94<Integer> z943, Z94<Integer> z944, Z94<Boolean> z945) {
        this.f32913a = z94;
        this.f32914b = z942;
        this.f32915c = z943;
        this.f32916d = z944;
        this.f32917e = z945;
    }

    /* renamed from: a */
    public static C35791Rw2 m86189a(Z94<C51765xi0> z94, Z94<C31919Bi0> z942, Z94<Integer> z943, Z94<Integer> z944, Z94<Boolean> z945) {
        return new C35791Rw2(z94, z942, z943, z944, z945);
    }

    /* renamed from: c */
    public static C35557Qw2 m86187c(C51765xi0 c51765xi0, C31919Bi0 c31919Bi0, int i, int i2, boolean z) {
        return new C35557Qw2(c51765xi0, c31919Bi0, i, i2, z);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C35557Qw2 get() {
        return m86187c(this.f32913a.get(), this.f32914b.get(), this.f32915c.get().intValue(), this.f32916d.get().intValue(), this.f32917e.get().booleanValue());
    }
}
