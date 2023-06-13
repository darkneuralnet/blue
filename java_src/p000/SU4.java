package p000;
/* renamed from: SU4 */
/* loaded from: classes3.dex */
public final class SU4 implements InterfaceC48812sj1<RU4> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f33781a;

    public SU4(Y94<InterfaceC40099e13> y94) {
        this.f33781a = y94;
    }

    /* renamed from: a */
    public static SU4 m85366a(Y94<InterfaceC40099e13> y94) {
        return new SU4(y94);
    }

    /* renamed from: c */
    public static RU4 m85364c(InterfaceC40099e13 interfaceC40099e13) {
        return new RU4(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public RU4 get() {
        return m85364c(this.f33781a.get());
    }
}
