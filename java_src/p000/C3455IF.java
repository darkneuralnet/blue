package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: IF */
/* loaded from: classes3.dex */
public final class C3455IF implements InterfaceC48812sj1<C3095HF> {

    /* renamed from: a */
    public final Y94<InterfaceC3940JF> f14932a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f14933b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f14934c;

    /* renamed from: d */
    public final Y94<InterfaceC26874oF> f14935d;

    /* renamed from: e */
    public final Y94<InterfaceC46473om3> f14936e;

    public C3455IF(Y94<InterfaceC3940JF> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC26874oF> y944, Y94<InterfaceC46473om3> y945) {
        this.f14932a = y94;
        this.f14933b = y942;
        this.f14934c = y943;
        this.f14935d = y944;
        this.f14936e = y945;
    }

    /* renamed from: a */
    public static C3455IF m102678a(Y94<InterfaceC3940JF> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC26874oF> y944, Y94<InterfaceC46473om3> y945) {
        return new C3455IF(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C3095HF m102676c(InterfaceC3940JF interfaceC3940JF, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC26874oF interfaceC26874oF, InterfaceC46473om3 interfaceC46473om3) {
        return new C3095HF(interfaceC3940JF, scopeProvider, interfaceC40099e13, interfaceC26874oF, interfaceC46473om3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C3095HF get() {
        return m102676c(this.f14932a.get(), this.f14933b.get(), this.f14934c.get(), this.f14935d.get(), this.f14936e.get());
    }
}
