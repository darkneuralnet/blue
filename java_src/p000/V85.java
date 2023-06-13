package p000;

import co.bird.android.model.extra.RiderBirdScanExtra;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: V85 */
/* loaded from: classes2.dex */
public final class V85 implements U85 {

    /* renamed from: a */
    public final W85 f38675a;

    public V85(W85 w85) {
        this.f38675a = w85;
    }

    /* renamed from: b */
    public static Y94<U85> m80318b(W85 w85) {
        return C39546d52.m44621a(new V85(w85));
    }

    @Override // p000.U85
    /* renamed from: a */
    public O85 mo80319a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, RiderBirdScanExtra riderBirdScanExtra, InterfaceC10274ZS interfaceC10274ZS) {
        return this.f38675a.m78788b(lifecycleScopeProvider, riderBirdScanExtra, interfaceC10274ZS);
    }
}
