package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: dB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39607dB4 implements InterfaceC48812sj1<C38996cB4> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f76228a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f76229b;

    /* renamed from: c */
    public final Y94<InterfaceC40199eB4> f76230c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f76231d;

    /* renamed from: e */
    public final Y94<InterfaceC29058u7> f76232e;

    public C39607dB4(Y94<InterfaceC10636aM> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40199eB4> y943, Y94<InterfaceC40099e13> y944, Y94<InterfaceC29058u7> y945) {
        this.f76228a = y94;
        this.f76229b = y942;
        this.f76230c = y943;
        this.f76231d = y944;
        this.f76232e = y945;
    }

    /* renamed from: a */
    public static C39607dB4 m44544a(Y94<InterfaceC10636aM> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40199eB4> y943, Y94<InterfaceC40099e13> y944, Y94<InterfaceC29058u7> y945) {
        return new C39607dB4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C38996cB4 m44542c(InterfaceC10636aM interfaceC10636aM, ScopeProvider scopeProvider, InterfaceC40199eB4 interfaceC40199eB4, InterfaceC40099e13 interfaceC40099e13, InterfaceC29058u7 interfaceC29058u7) {
        return new C38996cB4(interfaceC10636aM, scopeProvider, interfaceC40199eB4, interfaceC40099e13, interfaceC29058u7);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C38996cB4 get() {
        return m44542c(this.f76228a.get(), this.f76229b.get(), this.f76230c.get(), this.f76231d.get(), this.f76232e.get());
    }
}
