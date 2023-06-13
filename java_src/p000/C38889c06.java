package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: c06  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38889c06 implements InterfaceC38296b06 {

    /* renamed from: a */
    public final C39500d06 f59883a;

    public C38889c06(C39500d06 c39500d06) {
        this.f59883a = c39500d06;
    }

    /* renamed from: b */
    public static Y94<InterfaceC38296b06> m62034b(C39500d06 c39500d06) {
        return C39546d52.m44621a(new C38889c06(c39500d06));
    }

    @Override // p000.InterfaceC38296b06
    /* renamed from: a */
    public C37703a06 mo62035a(InterfaceC40685f06 interfaceC40685f06, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
        return this.f59883a.m44741b(interfaceC40685f06, interfaceC40099e13, lifecycleScopeProvider);
    }
}
