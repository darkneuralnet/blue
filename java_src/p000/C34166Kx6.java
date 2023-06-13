package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: Kx6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34166Kx6 {

    /* renamed from: a */
    public final Y94<InterfaceC46473om3> f20454a;

    /* renamed from: b */
    public final Y94<InterfaceC27246pJ> f20455b;

    public C34166Kx6(Y94<InterfaceC46473om3> y94, Y94<InterfaceC27246pJ> y942) {
        this.f20454a = y94;
        this.f20455b = y942;
    }

    /* renamed from: a */
    public static C34166Kx6 m98048a(Y94<InterfaceC46473om3> y94, Y94<InterfaceC27246pJ> y942) {
        return new C34166Kx6(y94, y942);
    }

    /* renamed from: c */
    public static C33464Hx6 m98046c(InterfaceC46473om3 interfaceC46473om3, InterfaceC27246pJ interfaceC27246pJ, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC34400Lx6 interfaceC34400Lx6, InterfaceC40613et3 interfaceC40613et3) {
        return new C33464Hx6(interfaceC46473om3, interfaceC27246pJ, lifecycleScopeProvider, interfaceC34400Lx6, interfaceC40613et3);
    }

    /* renamed from: b */
    public C33464Hx6 m98047b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC34400Lx6 interfaceC34400Lx6, InterfaceC40613et3 interfaceC40613et3) {
        return m98046c(this.f20454a.get(), this.f20455b.get(), lifecycleScopeProvider, interfaceC34400Lx6, interfaceC40613et3);
    }
}
