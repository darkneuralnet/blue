package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: IP4 */
/* loaded from: classes2.dex */
public final class IP4 implements HP4 {

    /* renamed from: a */
    public final JP4 f15462a;

    public IP4(JP4 jp4) {
        this.f15462a = jp4;
    }

    /* renamed from: b */
    public static Y94<HP4> m102416b(JP4 jp4) {
        return C39546d52.m44621a(new IP4(jp4));
    }

    @Override // p000.HP4
    /* renamed from: a */
    public FP4 mo102417a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC42185hY4 interfaceC42185hY4, KP4 kp4, InterfaceC40099e13 interfaceC40099e13, InterfaceC37617Zr1 interfaceC37617Zr1, String str) {
        return this.f15462a.m100511b(lifecycleScopeProvider, interfaceC42185hY4, kp4, interfaceC40099e13, interfaceC37617Zr1, str);
    }
}
