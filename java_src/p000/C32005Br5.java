package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Br5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32005Br5 implements InterfaceC48812sj1<C31771Ar5> {

    /* renamed from: a */
    public final Y94<InterfaceC33193Gt5> f2969a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f2970b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f2971c;

    /* renamed from: d */
    public final Y94<InterfaceC32239Cr5> f2972d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f2973e;

    public C32005Br5(Y94<InterfaceC33193Gt5> y94, Y94<InterfaceC40001dr4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC32239Cr5> y944, Y94<InterfaceC40099e13> y945) {
        this.f2969a = y94;
        this.f2970b = y942;
        this.f2971c = y943;
        this.f2972d = y944;
        this.f2973e = y945;
    }

    /* renamed from: a */
    public static C32005Br5 m113435a(Y94<InterfaceC33193Gt5> y94, Y94<InterfaceC40001dr4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC32239Cr5> y944, Y94<InterfaceC40099e13> y945) {
        return new C32005Br5(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C31771Ar5 m113433c(InterfaceC33193Gt5 interfaceC33193Gt5, InterfaceC40001dr4 interfaceC40001dr4, ScopeProvider scopeProvider, InterfaceC32239Cr5 interfaceC32239Cr5, InterfaceC40099e13 interfaceC40099e13) {
        return new C31771Ar5(interfaceC33193Gt5, interfaceC40001dr4, scopeProvider, interfaceC32239Cr5, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C31771Ar5 get() {
        return m113433c(this.f2969a.get(), this.f2970b.get(), this.f2971c.get(), this.f2972d.get(), this.f2973e.get());
    }
}
