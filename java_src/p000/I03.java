package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: I03 */
/* loaded from: classes2.dex */
public final class I03 implements G03 {

    /* renamed from: a */
    public final L03 f14321a;

    public I03(L03 l03) {
        this.f14321a = l03;
    }

    /* renamed from: b */
    public static Y94<G03> m103079b(L03 l03) {
        return C39546d52.m44621a(new I03(l03));
    }

    @Override // p000.G03
    /* renamed from: a */
    public D03 mo103080a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, M03 m03, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return this.f14321a.m97938b(lifecycleScopeProvider, m03, interfaceC40099e13, dq3);
    }
}
