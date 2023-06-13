package co.bird.android.app.feature.parking;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/parking/ParkingAnnouncementActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LYE3;", "B", "LYE3;", "parkingAnnouncementPresenter", "LcF3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LcF3;", "j0", "()LcF3;", "setParkingAnnouncementPresenterImplFactory", "(LcF3;)V", "parkingAnnouncementPresenterImplFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ParkingAnnouncementActivity extends BaseActivity {

    /* renamed from: B */
    public YE3 f61945B;

    /* renamed from: C */
    public InterfaceC39031cF3 f61946C;

    public ParkingAnnouncementActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC39031cF3 m60203j0() {
        InterfaceC39031cF3 interfaceC39031cF3 = this.f61946C;
        if (interfaceC39031cF3 != null) {
            return interfaceC39031cF3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkingAnnouncementPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        YE3 ye3 = this.f61945B;
        boolean z = false;
        if (ye3 != null && !ye3.mo64756a()) {
            z = true;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3020H4 m104452c = C3020H4.m104452c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m104452c, "inflate(layoutInflater)");
        setContentView(m104452c.getRoot());
        H22.f12748a.mo24068a2(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70245B(false);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(false);
        }
        ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.mo70210x(false);
        }
        C38438bF3 mo44479a = m60203j0().mo44479a(m58963Z(), new C41420gF3(this, m104452c), mo58957w());
        this.f61945B = mo44479a;
        if (mo44479a != null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            mo44479a.mo64755b(intent);
        }
    }
}
