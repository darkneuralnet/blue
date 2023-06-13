package p000;
/* renamed from: KW5 */
/* loaded from: classes4.dex */
public final class KW5 implements InterfaceC48812sj1<IW5> {

    /* renamed from: a */
    public final Y94<InterfaceC48923su2> f19717a;

    public KW5(Y94<InterfaceC48923su2> y94) {
        this.f19717a = y94;
    }

    /* renamed from: a */
    public static KW5 m98802a(Y94<InterfaceC48923su2> y94) {
        return new KW5(y94);
    }

    /* renamed from: c */
    public static IW5 m98800c(InterfaceC48923su2 interfaceC48923su2) {
        return new IW5(interfaceC48923su2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public IW5 get() {
        return m98800c(this.f19717a.get());
    }
}
