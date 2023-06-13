package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: eL5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40290eL5 {

    /* renamed from: a */
    public final Y94<AbstractC39873de5> f78251a;

    public C40290eL5(Y94<AbstractC39873de5> y94) {
        this.f78251a = y94;
    }

    /* renamed from: a */
    public static C40290eL5 m43016a(Y94<AbstractC39873de5> y94) {
        return new C40290eL5(y94);
    }

    /* renamed from: c */
    public static C38494bL5 m43014c(AbstractC39873de5 abstractC39873de5, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40883fL5 interfaceC40883fL5, InterfaceC40099e13 interfaceC40099e13) {
        return new C38494bL5(abstractC39873de5, lifecycleScopeProvider, interfaceC40883fL5, interfaceC40099e13);
    }

    /* renamed from: b */
    public C38494bL5 m43015b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40883fL5 interfaceC40883fL5, InterfaceC40099e13 interfaceC40099e13) {
        return m43014c(this.f78251a.get(), lifecycleScopeProvider, interfaceC40883fL5, interfaceC40099e13);
    }
}
