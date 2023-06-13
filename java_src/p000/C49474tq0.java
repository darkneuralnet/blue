package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: tq0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49474tq0 {

    /* renamed from: a */
    public final Y94<InterfaceC34088Kp0> f111095a;

    /* renamed from: b */
    public final Y94<C22454gl> f111096b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f111097c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f111098d;

    /* renamed from: e */
    public final Y94<YR4> f111099e;

    public C49474tq0(Y94<InterfaceC34088Kp0> y94, Y94<C22454gl> y942, Y94<C36207Tq4> y943, Y94<InterfaceC1880Ea> y944, Y94<YR4> y945) {
        this.f111095a = y94;
        this.f111096b = y942;
        this.f111097c = y943;
        this.f111098d = y944;
        this.f111099e = y945;
    }

    /* renamed from: a */
    public static C49474tq0 m11699a(Y94<InterfaceC34088Kp0> y94, Y94<C22454gl> y942, Y94<C36207Tq4> y943, Y94<InterfaceC1880Ea> y944, Y94<YR4> y945) {
        return new C49474tq0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C47696qq0 m11697c(InterfaceC34088Kp0 interfaceC34088Kp0, C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, YR4 yr4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC41786gs0 interfaceC41786gs0, InterfaceC40099e13 interfaceC40099e13) {
        return new C47696qq0(interfaceC34088Kp0, c22454gl, c36207Tq4, interfaceC1880Ea, yr4, lifecycleScopeProvider, interfaceC41786gs0, interfaceC40099e13);
    }

    /* renamed from: b */
    public C47696qq0 m11698b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC41786gs0 interfaceC41786gs0, InterfaceC40099e13 interfaceC40099e13) {
        return m11697c(this.f111095a.get(), this.f111096b.get(), this.f111097c.get(), this.f111098d.get(), this.f111099e.get(), lifecycleScopeProvider, interfaceC41786gs0, interfaceC40099e13);
    }
}
