package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: d06  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39500d06 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f75958a;

    /* renamed from: b */
    public final Y94<HZ5> f75959b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f75960c;

    /* renamed from: d */
    public final Y94<C22454gl> f75961d;

    public C39500d06(Y94<C36207Tq4> y94, Y94<HZ5> y942, Y94<InterfaceC1880Ea> y943, Y94<C22454gl> y944) {
        this.f75958a = y94;
        this.f75959b = y942;
        this.f75960c = y943;
        this.f75961d = y944;
    }

    /* renamed from: a */
    public static C39500d06 m44742a(Y94<C36207Tq4> y94, Y94<HZ5> y942, Y94<InterfaceC1880Ea> y943, Y94<C22454gl> y944) {
        return new C39500d06(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C37703a06 m44740c(C36207Tq4 c36207Tq4, HZ5 hz5, InterfaceC1880Ea interfaceC1880Ea, C22454gl c22454gl, InterfaceC40685f06 interfaceC40685f06, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
        return new C37703a06(c36207Tq4, hz5, interfaceC1880Ea, c22454gl, interfaceC40685f06, interfaceC40099e13, lifecycleScopeProvider);
    }

    /* renamed from: b */
    public C37703a06 m44741b(InterfaceC40685f06 interfaceC40685f06, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
        return m44740c(this.f75958a.get(), this.f75959b.get(), this.f75960c.get(), this.f75961d.get(), interfaceC40685f06, interfaceC40099e13, lifecycleScopeProvider);
    }
}
