package p000;
/* renamed from: wi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51172wi0 implements InterfaceC49405tj1<C50579vi0> {

    /* renamed from: a */
    public final Z94<C52951zi0> f116378a;

    /* renamed from: b */
    public final Z94<String[][]> f116379b;

    public C51172wi0(Z94<C52951zi0> z94, Z94<String[][]> z942) {
        this.f116378a = z94;
        this.f116379b = z942;
    }

    /* renamed from: a */
    public static C51172wi0 m6464a(Z94<C52951zi0> z94, Z94<String[][]> z942) {
        return new C51172wi0(z94, z942);
    }

    /* renamed from: c */
    public static C50579vi0 m6462c(C52951zi0 c52951zi0, String[][] strArr) {
        return new C50579vi0(c52951zi0, strArr);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C50579vi0 get() {
        return m6462c(this.f116378a.get(), this.f116379b.get());
    }
}
