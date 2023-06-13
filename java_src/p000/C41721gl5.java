package p000;
/* renamed from: gl5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41721gl5 implements InterfaceC49405tj1<C41128fl5> {

    /* renamed from: a */
    public final Z94<C46978pd5> f84198a;

    /* renamed from: b */
    public final Z94<C49635u62> f84199b;

    /* renamed from: c */
    public final Z94<C37558Zk5> f84200c;

    /* renamed from: d */
    public final Z94<C3717Id> f84201d;

    public C41721gl5(Z94<C46978pd5> z94, Z94<C49635u62> z942, Z94<C37558Zk5> z943, Z94<C3717Id> z944) {
        this.f84198a = z94;
        this.f84199b = z942;
        this.f84200c = z943;
        this.f84201d = z944;
    }

    /* renamed from: a */
    public static C41721gl5 m37531a(Z94<C46978pd5> z94, Z94<C49635u62> z942, Z94<C37558Zk5> z943, Z94<C3717Id> z944) {
        return new C41721gl5(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C41128fl5 m37529c(C46978pd5 c46978pd5, C49635u62 c49635u62, C37558Zk5 c37558Zk5, C3717Id c3717Id) {
        return new C41128fl5(c46978pd5, c49635u62, c37558Zk5, c3717Id);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C41128fl5 get() {
        return m37529c(this.f84198a.get(), this.f84199b.get(), this.f84200c.get(), this.f84201d.get());
    }
}
