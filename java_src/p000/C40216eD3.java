package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: eD3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40216eD3 implements InterfaceC48812sj1<C39624dD3> {

    /* renamed from: a */
    public final Y94<WX2> f78125a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f78126b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f78127c;

    /* renamed from: d */
    public final Y94<InterfaceC40809fD3> f78128d;

    public C40216eD3(Y94<WX2> y94, Y94<InterfaceC40099e13> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40809fD3> y944) {
        this.f78125a = y94;
        this.f78126b = y942;
        this.f78127c = y943;
        this.f78128d = y944;
    }

    /* renamed from: a */
    public static C40216eD3 m43096a(Y94<WX2> y94, Y94<InterfaceC40099e13> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40809fD3> y944) {
        return new C40216eD3(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C39624dD3 m43094c(WX2 wx2, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC40809fD3 interfaceC40809fD3) {
        return new C39624dD3(wx2, interfaceC40099e13, scopeProvider, interfaceC40809fD3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39624dD3 get() {
        return m43094c(this.f78125a.get(), this.f78126b.get(), this.f78127c.get(), this.f78128d.get());
    }
}
