package p000;
/* renamed from: ZZ3 */
/* loaded from: classes3.dex */
public final class ZZ3 implements InterfaceC48812sj1<YZ3> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f48784a;

    public ZZ3(Y94<InterfaceC40099e13> y94) {
        this.f48784a = y94;
    }

    /* renamed from: a */
    public static ZZ3 m72921a(Y94<InterfaceC40099e13> y94) {
        return new ZZ3(y94);
    }

    /* renamed from: c */
    public static YZ3 m72919c(InterfaceC40099e13 interfaceC40099e13) {
        return new YZ3(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public YZ3 get() {
        return m72919c(this.f48784a.get());
    }
}
