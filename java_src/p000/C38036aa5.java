package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideState;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import java.util.Set;
/* renamed from: aa5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38036aa5 implements Z95 {

    /* renamed from: a */
    public final C38629ba5 f50657a;

    public C38036aa5(C38629ba5 c38629ba5) {
        this.f50657a = c38629ba5;
    }

    /* renamed from: b */
    public static Y94<Z95> m71181b(C38629ba5 c38629ba5) {
        return C39546d52.m44621a(new C38036aa5(c38629ba5));
    }

    @Override // p000.Z95
    /* renamed from: a */
    public Y95 mo71182a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity, Set<? extends RideState.Status> set) {
        return this.f50657a.m64340b(lifecycleScopeProvider, baseActivity, set);
    }
}
