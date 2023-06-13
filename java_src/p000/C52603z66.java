package p000;
/* renamed from: z66  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52603z66 implements InterfaceC48812sj1<C52010y66> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f120810a;

    public C52603z66(Y94<InterfaceC40099e13> y94) {
        this.f120810a = y94;
    }

    /* renamed from: a */
    public static C52603z66 m1787a(Y94<InterfaceC40099e13> y94) {
        return new C52603z66(y94);
    }

    /* renamed from: c */
    public static C52010y66 m1785c(InterfaceC40099e13 interfaceC40099e13) {
        return new C52010y66(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52010y66 get() {
        return m1785c(this.f120810a.get());
    }
}
