package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: dh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39898dh0 {

    /* renamed from: a */
    public final Y94<FO2> f77041a;

    /* renamed from: b */
    public final Y94<InterfaceC32604Eg1> f77042b;

    public C39898dh0(Y94<FO2> y94, Y94<InterfaceC32604Eg1> y942) {
        this.f77041a = y94;
        this.f77042b = y942;
    }

    /* renamed from: a */
    public static C39898dh0 m43900a(Y94<FO2> y94, Y94<InterfaceC32604Eg1> y942) {
        return new C39898dh0(y94, y942);
    }

    /* renamed from: c */
    public static C38101ah0 m43898c(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, FO2 fo2, InterfaceC32604Eg1 interfaceC32604Eg1, InterfaceC40490eh0 interfaceC40490eh0, InterfaceC40099e13 interfaceC40099e13) {
        return new C38101ah0(lifecycleScopeProvider, fo2, interfaceC32604Eg1, interfaceC40490eh0, interfaceC40099e13);
    }

    /* renamed from: b */
    public C38101ah0 m43899b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40490eh0 interfaceC40490eh0, InterfaceC40099e13 interfaceC40099e13) {
        return m43898c(lifecycleScopeProvider, this.f77041a.get(), this.f77042b.get(), interfaceC40490eh0, interfaceC40099e13);
    }
}
