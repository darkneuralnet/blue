package p000;

import co.bird.android.app.feature.map.p008ui.MapUi;
import com.uber.autodispose.ScopeProvider;
/* renamed from: ZF3 */
/* loaded from: classes2.dex */
public final class ZF3 {

    /* renamed from: a */
    public final Y94<InterfaceC40001dr4> f48073a;

    /* renamed from: b */
    public final Y94<InterfaceC12495bn> f48074b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f48075c;

    /* renamed from: d */
    public final Y94<YR4> f48076d;

    public ZF3(Y94<InterfaceC40001dr4> y94, Y94<InterfaceC12495bn> y942, Y94<InterfaceC1880Ea> y943, Y94<YR4> y944) {
        this.f48073a = y94;
        this.f48074b = y942;
        this.f48075c = y943;
        this.f48076d = y944;
    }

    /* renamed from: a */
    public static ZF3 m73489a(Y94<InterfaceC40001dr4> y94, Y94<InterfaceC12495bn> y942, Y94<InterfaceC1880Ea> y943, Y94<YR4> y944) {
        return new ZF3(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static WF3 m73487c(InterfaceC40001dr4 interfaceC40001dr4, InterfaceC12495bn interfaceC12495bn, InterfaceC1880Ea interfaceC1880Ea, YR4 yr4, InterfaceC40099e13 interfaceC40099e13, InterfaceC37854aG3 interfaceC37854aG3, ScopeProvider scopeProvider, MapUi mapUi) {
        return new WF3(interfaceC40001dr4, interfaceC12495bn, interfaceC1880Ea, yr4, interfaceC40099e13, interfaceC37854aG3, scopeProvider, mapUi);
    }

    /* renamed from: b */
    public WF3 m73488b(InterfaceC40099e13 interfaceC40099e13, InterfaceC37854aG3 interfaceC37854aG3, ScopeProvider scopeProvider, MapUi mapUi) {
        return m73487c(this.f48073a.get(), this.f48074b.get(), this.f48075c.get(), this.f48076d.get(), interfaceC40099e13, interfaceC37854aG3, scopeProvider, mapUi);
    }
}
