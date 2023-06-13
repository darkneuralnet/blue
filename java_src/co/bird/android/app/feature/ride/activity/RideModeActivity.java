package co.bird.android.app.feature.ride.activity;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.api.response.BeginnerModeRiderMapAction;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideModeActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LyU4;", "B", "LyU4;", "j0", "()LyU4;", "setRideModePresenterImplFactory", "(LyU4;)V", "rideModePresenterImplFactory", "LtU4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LtU4;", "rideModePresenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RideModeActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52228yU4 f62421B;

    /* renamed from: C */
    public InterfaceC49264tU4 f62422C;

    public RideModeActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52228yU4 m59559j0() {
        InterfaceC52228yU4 interfaceC52228yU4 = this.f62421B;
        if (interfaceC52228yU4 != null) {
            return interfaceC52228yU4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideModePresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24023y(this);
        C4330K5 m99255c = C4330K5.m99255c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m99255c, "inflate(layoutInflater)");
        setContentView(m99255c.getRoot());
        List<BeginnerModeRiderMapAction> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("beginner_mode_actions");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BeginnerModeRiderMapAction> list = parcelableArrayListExtra;
        String stringExtra = getIntent().getStringExtra("selected_acceleration_level");
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("ride_mode_activity_label");
        Intrinsics.checkNotNull(stringExtra2);
        if (list != null && stringExtra != null && stringExtra2 != null) {
            C51635xU4 mo1320a = m59559j0().mo1320a(m58963Z(), list, stringExtra, stringExtra2, new DU4(this, m99255c));
            this.f62422C = mo1320a;
            if (mo1320a != null) {
                mo1320a.mo5134a();
            }
        }
    }
}
