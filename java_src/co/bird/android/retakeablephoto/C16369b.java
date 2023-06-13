package co.bird.android.retakeablephoto;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.retakeablephoto.b */
/* loaded from: classes4.dex */
public final class C16369b implements InterfaceC48812sj1<ScopeProvider> {

    /* renamed from: a */
    public final Y94<BaseActivity> f66985a;

    public C16369b(Y94<BaseActivity> y94) {
        this.f66985a = y94;
    }

    /* renamed from: a */
    public static C16369b m54958a(Y94<BaseActivity> y94) {
        return new C16369b(y94);
    }

    /* renamed from: c */
    public static ScopeProvider m54956c(BaseActivity baseActivity) {
        return (ScopeProvider) C51679xZ3.m5002e(RetakeablePhotoActivity.AbstractC16364c.m54967c(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ScopeProvider get() {
        return m54956c(this.f66985a.get());
    }
}
