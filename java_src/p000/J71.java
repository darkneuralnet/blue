package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: J71 */
/* loaded from: classes2.dex */
public final class J71 implements I71 {

    /* renamed from: a */
    public final K71 f16864a;

    public J71(K71 k71) {
        this.f16864a = k71;
    }

    /* renamed from: b */
    public static Y94<I71> m101119b(K71 k71) {
        return C39546d52.m44621a(new J71(k71));
    }

    @Override // p000.I71
    /* renamed from: a */
    public G71 mo101120a(BaseActivity baseActivity, ScopeProvider scopeProvider, M71 m71, InterfaceC40099e13 interfaceC40099e13, C52759zN5 c52759zN5) {
        return this.f16864a.m99212b(baseActivity, scopeProvider, m71, interfaceC40099e13, c52759zN5);
    }
}
