package p000;
/* renamed from: Jp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33855Jp1 implements InterfaceC48812sj1<C33621Ip1> {

    /* renamed from: a */
    public final Y94<InterfaceC42360hq1> f18294a;

    public C33855Jp1(Y94<InterfaceC42360hq1> y94) {
        this.f18294a = y94;
    }

    /* renamed from: a */
    public static C33855Jp1 m99658a(Y94<InterfaceC42360hq1> y94) {
        return new C33855Jp1(y94);
    }

    /* renamed from: c */
    public static C33621Ip1 m99656c(InterfaceC42360hq1 interfaceC42360hq1) {
        return new C33621Ip1(interfaceC42360hq1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33621Ip1 get() {
        return m99656c(this.f18294a.get());
    }
}
