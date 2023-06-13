package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Qx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35564Qx0 implements InterfaceC48812sj1<C34862Nx0> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f31275a;

    /* renamed from: b */
    public final Y94<C35798Rx0> f31276b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f31277c;

    /* renamed from: d */
    public final Y94<InterfaceC52757zN3> f31278d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f31279e;

    public C35564Qx0(Y94<ScopeProvider> y94, Y94<C35798Rx0> y942, Y94<C36207Tq4> y943, Y94<InterfaceC52757zN3> y944, Y94<InterfaceC40099e13> y945) {
        this.f31275a = y94;
        this.f31276b = y942;
        this.f31277c = y943;
        this.f31278d = y944;
        this.f31279e = y945;
    }

    /* renamed from: a */
    public static C35564Qx0 m87561a(Y94<ScopeProvider> y94, Y94<C35798Rx0> y942, Y94<C36207Tq4> y943, Y94<InterfaceC52757zN3> y944, Y94<InterfaceC40099e13> y945) {
        return new C35564Qx0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C34862Nx0 m87559c(ScopeProvider scopeProvider, C35798Rx0 c35798Rx0, C36207Tq4 c36207Tq4, InterfaceC52757zN3 interfaceC52757zN3, InterfaceC40099e13 interfaceC40099e13) {
        return new C34862Nx0(scopeProvider, c35798Rx0, c36207Tq4, interfaceC52757zN3, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34862Nx0 get() {
        return m87559c(this.f31275a.get(), this.f31276b.get(), this.f31277c.get(), this.f31278d.get(), this.f31279e.get());
    }
}
