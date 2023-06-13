package p000;
/* renamed from: il5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42907il5 implements InterfaceC49405tj1<C42314hl5> {

    /* renamed from: a */
    public final Z94<C46978pd5> f87831a;

    /* renamed from: b */
    public final Z94<C49635u62> f87832b;

    /* renamed from: c */
    public final Z94<C37558Zk5> f87833c;

    /* renamed from: d */
    public final Z94<C3717Id> f87834d;

    public C42907il5(Z94<C46978pd5> z94, Z94<C49635u62> z942, Z94<C37558Zk5> z943, Z94<C3717Id> z944) {
        this.f87831a = z94;
        this.f87832b = z942;
        this.f87833c = z943;
        this.f87834d = z944;
    }

    /* renamed from: a */
    public static C42907il5 m33512a(Z94<C46978pd5> z94, Z94<C49635u62> z942, Z94<C37558Zk5> z943, Z94<C3717Id> z944) {
        return new C42907il5(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C42314hl5 m33510c(C46978pd5 c46978pd5, C49635u62 c49635u62, C37558Zk5 c37558Zk5, C3717Id c3717Id) {
        return new C42314hl5(c46978pd5, c49635u62, c37558Zk5, c3717Id);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C42314hl5 get() {
        return m33510c(this.f87831a.get(), this.f87832b.get(), this.f87833c.get(), this.f87834d.get());
    }
}
