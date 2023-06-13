package p000;
/* renamed from: a10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37707a10 implements InterfaceC48812sj1<Y00> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f49676a;

    /* renamed from: b */
    public final Y94<InterfaceC49283tW5> f49677b;

    /* renamed from: c */
    public final Y94<InterfaceC51944y00> f49678c;

    /* renamed from: d */
    public final Y94<K00> f49679d;

    /* renamed from: e */
    public final Y94<M00> f49680e;

    public C37707a10(Y94<InterfaceC36152Tk3> y94, Y94<InterfaceC49283tW5> y942, Y94<InterfaceC51944y00> y943, Y94<K00> y944, Y94<M00> y945) {
        this.f49676a = y94;
        this.f49677b = y942;
        this.f49678c = y943;
        this.f49679d = y944;
        this.f49680e = y945;
    }

    /* renamed from: a */
    public static C37707a10 m72072a(Y94<InterfaceC36152Tk3> y94, Y94<InterfaceC49283tW5> y942, Y94<InterfaceC51944y00> y943, Y94<K00> y944, Y94<M00> y945) {
        return new C37707a10(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static Y00 m72070c(InterfaceC36152Tk3 interfaceC36152Tk3, InterfaceC49283tW5 interfaceC49283tW5, InterfaceC51944y00 interfaceC51944y00, K00 k00, M00 m00) {
        return new Y00(interfaceC36152Tk3, interfaceC49283tW5, interfaceC51944y00, k00, m00);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Y00 get() {
        return m72070c(this.f49676a.get(), this.f49677b.get(), this.f49678c.get(), this.f49679d.get(), this.f49680e.get());
    }
}
