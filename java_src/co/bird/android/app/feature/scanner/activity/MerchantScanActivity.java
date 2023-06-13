package co.bird.android.app.feature.scanner.activity;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/scanner/activity/MerchantScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onBackPressed", "LXS2;", "B", "LXS2;", "j0", "()LXS2;", "setMerchantScanPresenterImplFactory", "(LXS2;)V", "merchantScanPresenterImplFactory", "LMS2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LMS2;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MerchantScanActivity extends BaseActivity {

    /* renamed from: B */
    public XS2 f62739B;

    /* renamed from: C */
    public MS2 f62740C;

    public MerchantScanActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final XS2 m59398j0() {
        XS2 xs2 = this.f62739B;
        if (xs2 != null) {
            return xs2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("merchantScanPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo58957w().mo37030e3();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24077S(this);
        C26356n4 m24505c = C26356n4.m24505c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m24505c, "inflate(layoutInflater)");
        setContentView(m24505c.f99289i);
        mo58977D();
        WS2 mo75012a = m59398j0().mo75012a(m58963Z(), mo58956x(), new C39767dT2(this, m24505c), mo58957w());
        mo75012a.m78406a();
        this.f62740C = mo75012a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MS2 ms2 = this.f62740C;
        if (ms2 != null) {
            ms2.onPause();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MS2 ms2 = this.f62740C;
        if (ms2 != null) {
            ms2.onResume();
        }
    }
}
