package p000;
/* renamed from: fw */
/* loaded from: classes6.dex */
public final class C20663fw implements InterfaceC49405tj1<C20146ew> {

    /* renamed from: a */
    public final Z94<C46978pd5> f81170a;

    /* renamed from: b */
    public final Z94<C3717Id> f81171b;

    /* renamed from: c */
    public final Z94<C49635u62> f81172c;

    /* renamed from: d */
    public final Z94<C51413x62> f81173d;

    public C20663fw(Z94<C46978pd5> z94, Z94<C3717Id> z942, Z94<C49635u62> z943, Z94<C51413x62> z944) {
        this.f81170a = z94;
        this.f81171b = z942;
        this.f81172c = z943;
        this.f81173d = z944;
    }

    /* renamed from: a */
    public static C20663fw m40439a(Z94<C46978pd5> z94, Z94<C3717Id> z942, Z94<C49635u62> z943, Z94<C51413x62> z944) {
        return new C20663fw(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C20146ew m40437c(C46978pd5 c46978pd5, C3717Id c3717Id, C49635u62 c49635u62, C51413x62 c51413x62) {
        return new C20146ew(c46978pd5, c3717Id, c49635u62, c51413x62);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C20146ew get() {
        return m40437c(this.f81170a.get(), this.f81171b.get(), this.f81172c.get(), this.f81173d.get());
    }
}
