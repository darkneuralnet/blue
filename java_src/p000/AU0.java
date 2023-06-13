package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: AU0 */
/* loaded from: classes2.dex */
public final class AU0 implements InterfaceC52817zU0 {

    /* renamed from: a */
    public final BU0 f622a;

    public AU0(BU0 bu0) {
        this.f622a = bu0;
    }

    /* renamed from: b */
    public static Y94<InterfaceC52817zU0> m115729b(BU0 bu0) {
        return C39546d52.m44621a(new AU0(bu0));
    }

    @Override // p000.InterfaceC52817zU0
    /* renamed from: a */
    public C51631xU0 mo1326a(BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, CU0 cu0, InterfaceC40099e13 interfaceC40099e13, C22454gl c22454gl) {
        return this.f622a.m113976b(baseActivity, lifecycleScopeProvider, cu0, interfaceC40099e13, c22454gl);
    }
}
