package p000;
/* renamed from: el5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40535el5 implements InterfaceC49405tj1<C39943dl5> {

    /* renamed from: a */
    public final Z94<C46978pd5> f78823a;

    /* renamed from: b */
    public final Z94<C49635u62> f78824b;

    /* renamed from: c */
    public final Z94<C37558Zk5> f78825c;

    public C40535el5(Z94<C46978pd5> z94, Z94<C49635u62> z942, Z94<C37558Zk5> z943) {
        this.f78823a = z94;
        this.f78824b = z942;
        this.f78825c = z943;
    }

    /* renamed from: a */
    public static C40535el5 m42572a(Z94<C46978pd5> z94, Z94<C49635u62> z942, Z94<C37558Zk5> z943) {
        return new C40535el5(z94, z942, z943);
    }

    /* renamed from: c */
    public static C39943dl5 m42570c(C46978pd5 c46978pd5, C49635u62 c49635u62, C37558Zk5 c37558Zk5) {
        return new C39943dl5(c46978pd5, c49635u62, c37558Zk5);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C39943dl5 get() {
        return m42570c(this.f78823a.get(), this.f78824b.get(), this.f78825c.get());
    }
}
