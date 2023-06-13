package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: XJ4 */
/* loaded from: classes2.dex */
public final class XJ4 implements WJ4 {

    /* renamed from: a */
    public final YJ4 f42978a;

    public XJ4(YJ4 yj4) {
        this.f42978a = yj4;
    }

    /* renamed from: b */
    public static Y94<WJ4> m77134b(YJ4 yj4) {
        return C39546d52.m44621a(new XJ4(yj4));
    }

    @Override // p000.WJ4
    /* renamed from: a */
    public TJ4 mo77135a(DQ3 dq3, BaseActivity baseActivity, ScopeProvider scopeProvider, AB1 ab1, InterfaceC40099e13 interfaceC40099e13) {
        return this.f42978a.m75257b(dq3, baseActivity, scopeProvider, ab1, interfaceC40099e13);
    }
}
