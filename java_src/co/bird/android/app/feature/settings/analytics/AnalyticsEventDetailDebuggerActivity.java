package co.bird.android.app.feature.settings.analytics;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/settings/analytics/AnalyticsEventDetailDebuggerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lya;", "B", "Lya;", "j0", "()Lya;", "setPresenterFactory", "(Lya;)V", "presenterFactory", "Lxa;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lxa;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AnalyticsEventDetailDebuggerActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC30623ya f62746B;

    /* renamed from: C */
    public C30235xa f62747C;

    public AnalyticsEventDetailDebuggerActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC30623ya m59395j0() {
        InterfaceC30623ya interfaceC30623ya = this.f62746B;
        if (interfaceC30623ya != null) {
            return interfaceC30623ya;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24071W0(this);
        C7055R2 m87416c = C7055R2.m87416c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m87416c, "inflate(layoutInflater)");
        setContentView(m87416c.getRoot());
        C30235xa mo1087a = m59395j0().mo1087a(mo58957w(), new C1069Ca(this, m87416c));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo1087a.m5001a(intent);
        this.f62747C = mo1087a;
    }
}
