package co.bird.android.app.feature.ride.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideEndPhotoActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onBackPressed", "LdR4;", "B", "LdR4;", "j0", "()LdR4;", "setRideEndPhotoPresenterImplFactory", "(LdR4;)V", "rideEndPhotoPresenterImplFactory", "LEQ4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LEQ4;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RideEndPhotoActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC39751dR4 f62419B;

    /* renamed from: C */
    public EQ4 f62420C;

    public RideEndPhotoActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC39751dR4 m59560j0() {
        InterfaceC39751dR4 interfaceC39751dR4 = this.f62419B;
        if (interfaceC39751dR4 != null) {
            return interfaceC39751dR4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideEndPhotoPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        EQ4 eq4 = this.f62420C;
        if (eq4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            eq4 = null;
        }
        eq4.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3883J5 m101194c = C3883J5.m101194c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m101194c, "inflate(layoutInflater)");
        setContentView(m101194c.getRoot());
        if (!getIntent().getBooleanExtra("ride_end_photo_required", false) && !getIntent().getBooleanExtra("has_physical_lock", false)) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo70212v(false);
            }
            ActionBar supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.mo70245B(false);
            }
        } else {
            mo58977D();
        }
        H22.f12748a.mo24042n0(this);
        ZQ4 mo42882a = m59560j0().mo42882a(m58963Z(), mo58957w(), new WR4(this, m101194c));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo42882a.m73196A(intent);
        this.f62420C = mo42882a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        EQ4 eq4 = this.f62420C;
        if (eq4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            eq4 = null;
        }
        eq4.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EQ4 eq4 = this.f62420C;
        if (eq4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            eq4 = null;
        }
        eq4.onResume();
    }
}
