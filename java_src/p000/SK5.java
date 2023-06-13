package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: SK5 */
/* loaded from: classes2.dex */
public final class SK5 {

    /* renamed from: a */
    public final Y94<InterfaceC33939Jy4> f33479a;

    public SK5(Y94<InterfaceC33939Jy4> y94) {
        this.f33479a = y94;
    }

    /* renamed from: a */
    public static SK5 m85732a(Y94<InterfaceC33939Jy4> y94) {
        return new SK5(y94);
    }

    /* renamed from: c */
    public static PK5 m85730c(InterfaceC33939Jy4 interfaceC33939Jy4, DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, TK5 tk5, InterfaceC40099e13 interfaceC40099e13) {
        return new PK5(interfaceC33939Jy4, dq3, lifecycleScopeProvider, tk5, interfaceC40099e13);
    }

    /* renamed from: b */
    public PK5 m85731b(DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, TK5 tk5, InterfaceC40099e13 interfaceC40099e13) {
        return m85730c(this.f33479a.get(), dq3, lifecycleScopeProvider, tk5, interfaceC40099e13);
    }
}
