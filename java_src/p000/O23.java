package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: O23 */
/* loaded from: classes3.dex */
public final class O23 implements InterfaceC48812sj1<N23> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f25561a;

    /* renamed from: b */
    public final Y94<InterfaceC12495bn> f25562b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f25563c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f25564d;

    /* renamed from: e */
    public final Y94<P23> f25565e;

    /* renamed from: f */
    public final Y94<InterfaceC47069pm6> f25566f;

    public O23(Y94<InterfaceC10636aM> y94, Y94<InterfaceC12495bn> y942, Y94<InterfaceC40099e13> y943, Y94<ScopeProvider> y944, Y94<P23> y945, Y94<InterfaceC47069pm6> y946) {
        this.f25561a = y94;
        this.f25562b = y942;
        this.f25563c = y943;
        this.f25564d = y944;
        this.f25565e = y945;
        this.f25566f = y946;
    }

    /* renamed from: a */
    public static O23 m92986a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC12495bn> y942, Y94<InterfaceC40099e13> y943, Y94<ScopeProvider> y944, Y94<P23> y945, Y94<InterfaceC47069pm6> y946) {
        return new O23(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static N23 m92984c(InterfaceC10636aM interfaceC10636aM, InterfaceC12495bn interfaceC12495bn, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, P23 p23, InterfaceC47069pm6 interfaceC47069pm6) {
        return new N23(interfaceC10636aM, interfaceC12495bn, interfaceC40099e13, scopeProvider, p23, interfaceC47069pm6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public N23 get() {
        return m92984c(this.f25561a.get(), this.f25562b.get(), this.f25563c.get(), this.f25564d.get(), this.f25565e.get(), this.f25566f.get());
    }
}
