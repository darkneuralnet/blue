package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: eF3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40234eF3 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f78163a;

    /* renamed from: b */
    public final Y94<C22454gl> f78164b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f78165c;

    public C40234eF3(Y94<InterfaceC1880Ea> y94, Y94<C22454gl> y942, Y94<C36207Tq4> y943) {
        this.f78163a = y94;
        this.f78164b = y942;
        this.f78165c = y943;
    }

    /* renamed from: a */
    public static C40234eF3 m43072a(Y94<InterfaceC1880Ea> y94, Y94<C22454gl> y942, Y94<C36207Tq4> y943) {
        return new C40234eF3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C38438bF3 m43070c(InterfaceC1880Ea interfaceC1880Ea, C22454gl c22454gl, C36207Tq4 c36207Tq4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40827fF3 interfaceC40827fF3, InterfaceC40099e13 interfaceC40099e13) {
        return new C38438bF3(interfaceC1880Ea, c22454gl, c36207Tq4, lifecycleScopeProvider, interfaceC40827fF3, interfaceC40099e13);
    }

    /* renamed from: b */
    public C38438bF3 m43071b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40827fF3 interfaceC40827fF3, InterfaceC40099e13 interfaceC40099e13) {
        return m43070c(this.f78163a.get(), this.f78164b.get(), this.f78165c.get(), lifecycleScopeProvider, interfaceC40827fF3, interfaceC40099e13);
    }
}
