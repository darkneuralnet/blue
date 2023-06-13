package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: jP */
/* loaded from: classes3.dex */
public final class C24814jP {

    /* renamed from: a */
    public final Y94<InterfaceC4077JQ> f92645a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f92646b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f92647c;

    public C24814jP(Y94<InterfaceC4077JQ> y94, Y94<InterfaceC1880Ea> y942, Y94<C36207Tq4> y943) {
        this.f92645a = y94;
        this.f92646b = y942;
        this.f92647c = y943;
    }

    /* renamed from: a */
    public static C24814jP m30720a(Y94<InterfaceC4077JQ> y94, Y94<InterfaceC1880Ea> y942, Y94<C36207Tq4> y943) {
        return new C24814jP(y94, y942, y943);
    }

    /* renamed from: c */
    public static C20393fP m30718c(InterfaceC4077JQ interfaceC4077JQ, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, InterfaceC25154kP interfaceC25154kP, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return new C20393fP(interfaceC4077JQ, interfaceC1880Ea, c36207Tq4, interfaceC25154kP, interfaceC40099e13, scopeProvider);
    }

    /* renamed from: b */
    public C20393fP m30719b(InterfaceC25154kP interfaceC25154kP, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return m30718c(this.f92645a.get(), this.f92646b.get(), this.f92647c.get(), interfaceC25154kP, interfaceC40099e13, scopeProvider);
    }
}
