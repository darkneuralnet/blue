package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: rQ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48043rQ4 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f107057a;

    /* renamed from: b */
    public final Y94<YR4> f107058b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f107059c;

    /* renamed from: d */
    public final Y94<GI3> f107060d;

    public C48043rQ4(Y94<C36207Tq4> y94, Y94<YR4> y942, Y94<InterfaceC1880Ea> y943, Y94<GI3> y944) {
        this.f107057a = y94;
        this.f107058b = y942;
        this.f107059c = y943;
        this.f107060d = y944;
    }

    /* renamed from: a */
    public static C48043rQ4 m15975a(Y94<C36207Tq4> y94, Y94<YR4> y942, Y94<InterfaceC1880Ea> y943, Y94<GI3> y944) {
        return new C48043rQ4(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C42706iQ4 m15973c(C36207Tq4 c36207Tq4, YR4 yr4, InterfaceC1880Ea interfaceC1880Ea, GI3 gi3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC48635sQ4 interfaceC48635sQ4) {
        return new C42706iQ4(c36207Tq4, yr4, interfaceC1880Ea, gi3, scopeProvider, interfaceC40099e13, interfaceC48635sQ4);
    }

    /* renamed from: b */
    public C42706iQ4 m15974b(ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC48635sQ4 interfaceC48635sQ4) {
        return m15973c(this.f107057a.get(), this.f107058b.get(), this.f107059c.get(), this.f107060d.get(), scopeProvider, interfaceC40099e13, interfaceC48635sQ4);
    }
}
