package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: ta2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49316ta2 implements InterfaceC48812sj1<C48723sa2> {

    /* renamed from: a */
    public final Y94<InterfaceC50501va2> f110764a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f110765b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f110766c;

    public C49316ta2(Y94<InterfaceC50501va2> y94, Y94<InterfaceC40099e13> y942, Y94<ScopeProvider> y943) {
        this.f110764a = y94;
        this.f110765b = y942;
        this.f110766c = y943;
    }

    /* renamed from: a */
    public static C49316ta2 m12036a(Y94<InterfaceC50501va2> y94, Y94<InterfaceC40099e13> y942, Y94<ScopeProvider> y943) {
        return new C49316ta2(y94, y942, y943);
    }

    /* renamed from: c */
    public static C48723sa2 m12034c(InterfaceC50501va2 interfaceC50501va2, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return new C48723sa2(interfaceC50501va2, interfaceC40099e13, scopeProvider);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48723sa2 get() {
        return m12034c(this.f110764a.get(), this.f110765b.get(), this.f110766c.get());
    }
}
