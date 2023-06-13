package co.bird.android.app.feature.birdpay.tutorial;

import android.content.Context;
import android.os.Bundle;
import co.bird.android.app.feature.birdpay.tutorial.InterfaceC13683a;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/birdpay/tutorial/BirdPayTutorialActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LSO;", "B", "LSO;", "j0", "()LSO;", "setPresenter", "(LSO;)V", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdPayTutorialActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC7418SO f61306B;

    public BirdPayTutorialActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC7418SO m60804j0() {
        InterfaceC7418SO interfaceC7418SO = this.f61306B;
        if (interfaceC7418SO != null) {
            return interfaceC7418SO;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.rider_tutorial_dark);
        mo58977D();
        InterfaceC13683a.InterfaceC13684a m60803a = C13685b.m60803a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        m60803a.mo60796a(c46172oG2.m21419a(applicationContext), this).mo60802a(this);
        InterfaceC7418SO m60804j0 = m60804j0();
        Serializable serializableExtra = getIntent().getSerializableExtra("bird_pay_tutorial_presenter_source");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource");
        m60804j0.mo79904a((BirdPayOnboardingScreenViewedSource) serializableExtra);
    }
}
