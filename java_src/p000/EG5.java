package p000;

import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: EG5 */
/* loaded from: classes2.dex */
public final class EG5 implements DG5 {

    /* renamed from: a */
    public final FG5 f7167a;

    public EG5(FG5 fg5) {
        this.f7167a = fg5;
    }

    /* renamed from: b */
    public static Y94<DG5> m109262b(FG5 fg5) {
        return C39546d52.m44621a(new EG5(fg5));
    }

    @Override // p000.DG5
    /* renamed from: a */
    public SmartlockAssociationPresenter mo109263a(DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, FF5 ff5, InterfaceC40099e13 interfaceC40099e13) {
        return this.f7167a.m107367b(dq3, lifecycleScopeProvider, ff5, interfaceC40099e13);
    }
}
