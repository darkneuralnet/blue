package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: AS3 */
/* loaded from: classes2.dex */
public final class AS3 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f569a;

    public AS3(Y94<InterfaceC1880Ea> y94) {
        this.f569a = y94;
    }

    /* renamed from: a */
    public static AS3 m115779a(Y94<InterfaceC1880Ea> y94) {
        return new AS3(y94);
    }

    /* renamed from: c */
    public static C51616xS3 m115777c(InterfaceC1880Ea interfaceC1880Ea, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BS3 bs3, InterfaceC40099e13 interfaceC40099e13) {
        return new C51616xS3(interfaceC1880Ea, lifecycleScopeProvider, bs3, interfaceC40099e13);
    }

    /* renamed from: b */
    public C51616xS3 m115778b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BS3 bs3, InterfaceC40099e13 interfaceC40099e13) {
        return m115777c(this.f569a.get(), lifecycleScopeProvider, bs3, interfaceC40099e13);
    }
}
