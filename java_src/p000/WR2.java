package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: WR2 */
/* loaded from: classes3.dex */
public final class WR2 implements InterfaceC48812sj1<TR2> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f41003a;

    /* renamed from: b */
    public final Y94<XR2> f41004b;

    /* renamed from: c */
    public final Y94<InterfaceC37961aS2> f41005c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f41006d;

    public WR2(Y94<ScopeProvider> y94, Y94<XR2> y942, Y94<InterfaceC37961aS2> y943, Y94<InterfaceC40099e13> y944) {
        this.f41003a = y94;
        this.f41004b = y942;
        this.f41005c = y943;
        this.f41006d = y944;
    }

    /* renamed from: a */
    public static WR2 m78463a(Y94<ScopeProvider> y94, Y94<XR2> y942, Y94<InterfaceC37961aS2> y943, Y94<InterfaceC40099e13> y944) {
        return new WR2(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static TR2 m78461c(ScopeProvider scopeProvider, XR2 xr2, InterfaceC37961aS2 interfaceC37961aS2, InterfaceC40099e13 interfaceC40099e13) {
        return new TR2(scopeProvider, xr2, interfaceC37961aS2, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public TR2 get() {
        return m78461c(this.f41003a.get(), this.f41004b.get(), this.f41005c.get(), this.f41006d.get());
    }
}
