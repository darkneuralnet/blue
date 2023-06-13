package p000;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: is1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42973is1 implements InterfaceC42380hs1 {

    /* renamed from: a */
    public final C43566js1 f91397a;

    public C42973is1(C43566js1 c43566js1) {
        this.f91397a = c43566js1;
    }

    /* renamed from: b */
    public static Y94<InterfaceC42380hs1> m31745b(C43566js1 c43566js1) {
        return C39546d52.m44621a(new C42973is1(c43566js1));
    }

    @Override // p000.InterfaceC42380hs1
    /* renamed from: a */
    public C41194fs1 mo31746a(BaseActivity baseActivity, InterfaceC40099e13 interfaceC40099e13, InterfaceC48572sJ4 interfaceC48572sJ4, ScopeProvider scopeProvider, InterfaceC44159ks1 interfaceC44159ks1, MapUi mapUi) {
        return this.f91397a.m29816b(baseActivity, interfaceC40099e13, interfaceC48572sJ4, scopeProvider, interfaceC44159ks1, mapUi);
    }
}
