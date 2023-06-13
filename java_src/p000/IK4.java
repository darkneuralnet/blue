package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: IK4 */
/* loaded from: classes2.dex */
public final class IK4 implements HK4 {

    /* renamed from: a */
    public final JK4 f15367a;

    public IK4(JK4 jk4) {
        this.f15367a = jk4;
    }

    /* renamed from: b */
    public static Y94<HK4> m102478b(JK4 jk4) {
        return C39546d52.m44621a(new IK4(jk4));
    }

    @Override // p000.HK4
    /* renamed from: a */
    public GK4 mo102479a(BaseActivity baseActivity, ScopeProvider scopeProvider, KK4 kk4, InterfaceC40099e13 interfaceC40099e13) {
        return this.f15367a.m100702b(baseActivity, scopeProvider, kk4, interfaceC40099e13);
    }
}
