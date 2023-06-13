package p000;
/* renamed from: v62  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50227v62 implements InterfaceC49405tj1<C49635u62> {

    /* renamed from: a */
    public final Z94<C33112Gk5> f113527a;

    /* renamed from: b */
    public final Z94<Z92> f113528b;

    public C50227v62(Z94<C33112Gk5> z94, Z94<Z92> z942) {
        this.f113527a = z94;
        this.f113528b = z942;
    }

    /* renamed from: a */
    public static C50227v62 m9193a(Z94<C33112Gk5> z94, Z94<Z92> z942) {
        return new C50227v62(z94, z942);
    }

    /* renamed from: c */
    public static C49635u62 m9191c(C33112Gk5 c33112Gk5, Z92 z92) {
        return new C49635u62(c33112Gk5, z92);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C49635u62 get() {
        return m9191c(this.f113527a.get(), this.f113528b.get());
    }
}
