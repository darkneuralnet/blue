package p000;
/* renamed from: wk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51197wk5 implements InterfaceC49405tj1<C50604vk5> {

    /* renamed from: a */
    public final Z94<C46978pd5> f116429a;

    /* renamed from: b */
    public final Z94<InterfaceC34855Nw2> f116430b;

    public C51197wk5(Z94<C46978pd5> z94, Z94<InterfaceC34855Nw2> z942) {
        this.f116429a = z94;
        this.f116430b = z942;
    }

    /* renamed from: a */
    public static C51197wk5 m6417a(Z94<C46978pd5> z94, Z94<InterfaceC34855Nw2> z942) {
        return new C51197wk5(z94, z942);
    }

    /* renamed from: c */
    public static C50604vk5 m6415c(C46978pd5 c46978pd5, InterfaceC34855Nw2 interfaceC34855Nw2) {
        return new C50604vk5(c46978pd5, interfaceC34855Nw2);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C50604vk5 get() {
        return m6415c(this.f116429a.get(), this.f116430b.get());
    }
}
