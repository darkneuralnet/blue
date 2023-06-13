package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: Hw */
/* loaded from: classes2.dex */
public final class C3276Hw {

    /* renamed from: a */
    public final Y94<InterfaceC40001dr4> f14190a;

    /* renamed from: b */
    public final Y94<InterfaceC34088Kp0> f14191b;

    public C3276Hw(Y94<InterfaceC40001dr4> y94, Y94<InterfaceC34088Kp0> y942) {
        this.f14190a = y94;
        this.f14191b = y942;
    }

    /* renamed from: a */
    public static C3276Hw m103221a(Y94<InterfaceC40001dr4> y94, Y94<InterfaceC34088Kp0> y942) {
        return new C3276Hw(y94, y942);
    }

    /* renamed from: c */
    public static C1639Dw m103219c(InterfaceC40001dr4 interfaceC40001dr4, InterfaceC34088Kp0 interfaceC34088Kp0, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC3815Iw interfaceC3815Iw, InterfaceC40099e13 interfaceC40099e13) {
        return new C1639Dw(interfaceC40001dr4, interfaceC34088Kp0, lifecycleScopeProvider, interfaceC3815Iw, interfaceC40099e13);
    }

    /* renamed from: b */
    public C1639Dw m103220b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC3815Iw interfaceC3815Iw, InterfaceC40099e13 interfaceC40099e13) {
        return m103219c(this.f14190a.get(), this.f14191b.get(), lifecycleScopeProvider, interfaceC3815Iw, interfaceC40099e13);
    }
}
