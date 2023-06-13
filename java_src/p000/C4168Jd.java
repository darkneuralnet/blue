package p000;
/* renamed from: Jd */
/* loaded from: classes6.dex */
public final class C4168Jd implements InterfaceC49405tj1<C3717Id> {

    /* renamed from: a */
    public final Z94<Integer> f17905a;

    public C4168Jd(Z94<Integer> z94) {
        this.f17905a = z94;
    }

    /* renamed from: a */
    public static C4168Jd m100110a(Z94<Integer> z94) {
        return new C4168Jd(z94);
    }

    /* renamed from: c */
    public static C3717Id m100108c(int i) {
        return new C3717Id(i);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C3717Id get() {
        return m100108c(this.f17905a.get().intValue());
    }
}
