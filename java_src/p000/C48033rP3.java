package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: rP3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48033rP3 implements InterfaceC47440qP3 {

    /* renamed from: a */
    public final C48625sP3 f106965a;

    public C48033rP3(C48625sP3 c48625sP3) {
        this.f106965a = c48625sP3;
    }

    /* renamed from: b */
    public static Y94<InterfaceC47440qP3> m15993b(C48625sP3 c48625sP3) {
        return C39546d52.m44621a(new C48033rP3(c48625sP3));
    }

    @Override // p000.InterfaceC47440qP3
    /* renamed from: a */
    public C46254oP3 mo15994a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, CP3 cp3, InterfaceC38875bz1 interfaceC38875bz1, InterfaceC40099e13 interfaceC40099e13, BaseActivity baseActivity) {
        return this.f106965a.m14233b(lifecycleScopeProvider, cp3, interfaceC38875bz1, interfaceC40099e13, baseActivity);
    }
}
