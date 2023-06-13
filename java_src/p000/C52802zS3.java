package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: zS3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52802zS3 implements InterfaceC52209yS3 {

    /* renamed from: a */
    public final AS3 f121386a;

    public C52802zS3(AS3 as3) {
        this.f121386a = as3;
    }

    /* renamed from: b */
    public static Y94<InterfaceC52209yS3> m1335b(AS3 as3) {
        return C39546d52.m44621a(new C52802zS3(as3));
    }

    @Override // p000.InterfaceC52209yS3
    /* renamed from: a */
    public C51616xS3 mo1336a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BS3 bs3, InterfaceC40099e13 interfaceC40099e13) {
        return this.f121386a.m115778b(lifecycleScopeProvider, bs3, interfaceC40099e13);
    }
}
