package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: M65 */
/* loaded from: classes2.dex */
public final class M65 implements L65 {

    /* renamed from: a */
    public final N65 f22635a;

    public M65(N65 n65) {
        this.f22635a = n65;
    }

    /* renamed from: b */
    public static Y94<L65> m95816b(N65 n65) {
        return C39546d52.m44621a(new M65(n65));
    }

    @Override // p000.L65
    /* renamed from: a */
    public K65 mo95817a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return this.f22635a.m94367b(lifecycleScopeProvider, interfaceC40099e13);
    }
}
