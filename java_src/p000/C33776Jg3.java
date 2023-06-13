package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Jg3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33776Jg3 {

    /* renamed from: a */
    public final Y94<C22454gl> f17988a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f17989b;

    /* renamed from: c */
    public final Y94<InterfaceC32292Cx4> f17990c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f17991d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f17992e;

    public C33776Jg3(Y94<C22454gl> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC32292Cx4> y943, Y94<C36207Tq4> y944, Y94<InterfaceC40099e13> y945) {
        this.f17988a = y94;
        this.f17989b = y942;
        this.f17990c = y943;
        this.f17991d = y944;
        this.f17992e = y945;
    }

    /* renamed from: a */
    public static C33776Jg3 m100032a(Y94<C22454gl> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC32292Cx4> y943, Y94<C36207Tq4> y944, Y94<InterfaceC40099e13> y945) {
        return new C33776Jg3(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C33074Gg3 m100030c(C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, InterfaceC32292Cx4 interfaceC32292Cx4, C36207Tq4 c36207Tq4, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC34010Kg3 interfaceC34010Kg3) {
        return new C33074Gg3(c22454gl, interfaceC1880Ea, interfaceC32292Cx4, c36207Tq4, interfaceC40099e13, scopeProvider, interfaceC34010Kg3);
    }

    /* renamed from: b */
    public C33074Gg3 m100031b(ScopeProvider scopeProvider, InterfaceC34010Kg3 interfaceC34010Kg3) {
        return m100030c(this.f17988a.get(), this.f17989b.get(), this.f17990c.get(), this.f17991d.get(), this.f17992e.get(), scopeProvider, interfaceC34010Kg3);
    }
}
