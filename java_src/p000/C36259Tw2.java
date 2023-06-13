package p000;
/* renamed from: Tw2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36259Tw2 implements InterfaceC49405tj1<C36025Sw2> {

    /* renamed from: a */
    public final Z94<C51765xi0> f36479a;

    /* renamed from: b */
    public final Z94<C31919Bi0> f36480b;

    /* renamed from: c */
    public final Z94<Boolean> f36481c;

    /* renamed from: d */
    public final Z94<Boolean> f36482d;

    public C36259Tw2(Z94<C51765xi0> z94, Z94<C31919Bi0> z942, Z94<Boolean> z943, Z94<Boolean> z944) {
        this.f36479a = z94;
        this.f36480b = z942;
        this.f36481c = z943;
        this.f36482d = z944;
    }

    /* renamed from: a */
    public static C36259Tw2 m82235a(Z94<C51765xi0> z94, Z94<C31919Bi0> z942, Z94<Boolean> z943, Z94<Boolean> z944) {
        return new C36259Tw2(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C36025Sw2 m82233c(C51765xi0 c51765xi0, C31919Bi0 c31919Bi0, boolean z, boolean z2) {
        return new C36025Sw2(c51765xi0, c31919Bi0, z, z2);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C36025Sw2 get() {
        return m82233c(this.f36479a.get(), this.f36480b.get(), this.f36481c.get().booleanValue(), this.f36482d.get().booleanValue());
    }
}
