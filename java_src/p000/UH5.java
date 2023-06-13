package p000;

import co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: UH5 */
/* loaded from: classes2.dex */
public final class UH5 implements TH5 {

    /* renamed from: a */
    public final VH5 f37181a;

    public UH5(VH5 vh5) {
        this.f37181a = vh5;
    }

    /* renamed from: b */
    public static Y94<TH5> m81681b(VH5 vh5) {
        return C39546d52.m44621a(new UH5(vh5));
    }

    @Override // p000.TH5
    /* renamed from: a */
    public SmartlockAssociationV2Presenter mo81682a(DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC14174b interfaceC14174b, InterfaceC40099e13 interfaceC40099e13) {
        return this.f37181a.m80016b(dq3, lifecycleScopeProvider, interfaceC14174b, interfaceC40099e13);
    }
}
