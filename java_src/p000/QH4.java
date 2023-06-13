package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: QH4 */
/* loaded from: classes2.dex */
public final class QH4 implements PH4 {

    /* renamed from: a */
    public final RH4 f30178a;

    public QH4(RH4 rh4) {
        this.f30178a = rh4;
    }

    /* renamed from: b */
    public static Y94<PH4> m88665b(RH4 rh4) {
        return C39546d52.m44621a(new QH4(rh4));
    }

    @Override // p000.PH4
    /* renamed from: a */
    public OH4 mo88666a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, SH4 sh4, InterfaceC40099e13 interfaceC40099e13, InterfaceC33939Jy4 interfaceC33939Jy4) {
        return this.f30178a.m86991b(lifecycleScopeProvider, sh4, interfaceC40099e13, interfaceC33939Jy4);
    }
}
