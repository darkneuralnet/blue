package p000;

import co.bird.android.app.feature.map.p008ui.MapUi;
import com.uber.autodispose.ScopeProvider;
/* renamed from: YF3 */
/* loaded from: classes2.dex */
public final class YF3 implements XF3 {

    /* renamed from: a */
    public final ZF3 f44913a;

    public YF3(ZF3 zf3) {
        this.f44913a = zf3;
    }

    /* renamed from: b */
    public static Y94<XF3> m75294b(ZF3 zf3) {
        return C39546d52.m44621a(new YF3(zf3));
    }

    @Override // p000.XF3
    /* renamed from: a */
    public WF3 mo75295a(InterfaceC40099e13 interfaceC40099e13, InterfaceC37854aG3 interfaceC37854aG3, ScopeProvider scopeProvider, MapUi mapUi) {
        return this.f44913a.m73488b(interfaceC40099e13, interfaceC37854aG3, scopeProvider, mapUi);
    }
}
