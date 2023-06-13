package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: y94  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52038y94 {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f118825a;

    public C52038y94(Y94<InterfaceC10636aM> y94) {
        this.f118825a = y94;
    }

    /* renamed from: a */
    public static C52038y94 m4038a(Y94<InterfaceC10636aM> y94) {
        return new C52038y94(y94);
    }

    /* renamed from: c */
    public static C49667u94 m4036c(InterfaceC10636aM interfaceC10636aM, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC52631z94 interfaceC52631z94, InterfaceC40099e13 interfaceC40099e13) {
        return new C49667u94(interfaceC10636aM, lifecycleScopeProvider, interfaceC52631z94, interfaceC40099e13);
    }

    /* renamed from: b */
    public C49667u94 m4037b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC52631z94 interfaceC52631z94, InterfaceC40099e13 interfaceC40099e13) {
        return m4036c(this.f118825a.get(), lifecycleScopeProvider, interfaceC52631z94, interfaceC40099e13);
    }
}
