package co.bird.android.app.feature.charger.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/charger/activity/ReportFraudActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LIG4;", "B", "LIG4;", "ui", "LEG4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LEG4;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReportFraudActivity extends BaseActivity {

    /* renamed from: B */
    public IG4 f61341B;

    /* renamed from: C */
    public EG4 f61342C;

    public ReportFraudActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IG4 ig4;
        super.onCreate(bundle);
        C27138p5 m19984c = C27138p5.m19984c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m19984c, "inflate(layoutInflater)");
        setContentView(m19984c.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getResources().getString(C45871nl4.report_fraud_title));
        }
        this.f61341B = new MG4(this);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        IG4 ig42 = this.f61341B;
        IG4 ig43 = null;
        if (ig42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            ig4 = null;
        } else {
            ig4 = ig42;
        }
        HG4 hg4 = new HG4(m58963Z, ig4, mo58957w(), m58971M(), m58975F(), m58973J(), m58965X());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        hg4.m104087b(intent);
        IG4 ig44 = this.f61341B;
        if (ig44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
        } else {
            ig43 = ig44;
        }
        ig43.mo95459i9(m19984c, hg4);
        this.f61342C = hg4;
    }
}
