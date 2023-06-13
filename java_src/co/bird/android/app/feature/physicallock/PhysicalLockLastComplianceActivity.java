package co.bird.android.app.feature.physicallock;

import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LastLockComplianceModel;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/PhysicalLockLastComplianceActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LyS3;", "B", "LyS3;", "j0", "()LyS3;", "setPresenterFactory", "(LyS3;)V", "presenterFactory", "LvS3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LvS3;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhysicalLockLastComplianceActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52209yS3 f61971B;

    /* renamed from: C */
    public InterfaceC50430vS3 f61972C;

    public PhysicalLockLastComplianceActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52209yS3 m60184j0() {
        InterfaceC52209yS3 interfaceC52209yS3 = this.f61971B;
        if (interfaceC52209yS3 != null) {
            return interfaceC52209yS3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC50430vS3 interfaceC50430vS3 = this.f61972C;
        if (interfaceC50430vS3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC50430vS3 = null;
        }
        interfaceC50430vS3.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24060e1(this);
        setContentView(C39311cj4.activity_physical_lock_last_compliance);
        C51616xS3 mo1336a = m60184j0().mo1336a(m58963Z(), new CS3(this), mo58957w());
        this.f61972C = mo1336a;
        if (mo1336a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo1336a = null;
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("lock_compliance_model");
        Intrinsics.checkNotNull(parcelableExtra);
        mo1336a.mo5248a((LastLockComplianceModel) parcelableExtra);
        mo58977D();
    }
}
