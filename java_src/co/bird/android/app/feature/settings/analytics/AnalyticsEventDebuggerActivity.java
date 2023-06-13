package co.bird.android.app.feature.settings.analytics;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/settings/analytics/AnalyticsEventDebuggerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lra;", "B", "Lra;", "j0", "()Lra;", "setPresenterFactory", "(Lra;)V", "presenterFactory", "Lqa;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lqa;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AnalyticsEventDebuggerActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC27949ra f62744B;

    /* renamed from: C */
    public C27622qa f62745C;

    public AnalyticsEventDebuggerActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC27949ra m59396j0() {
        InterfaceC27949ra interfaceC27949ra = this.f62744B;
        if (interfaceC27949ra != null) {
            return interfaceC27949ra;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24056f3(this);
        C6646Q2 m89099c = C6646Q2.m89099c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m89099c, "inflate(layoutInflater)");
        setContentView(m89099c.getRoot());
        C27622qa mo13994a = m59396j0().mo13994a(m58963Z(), mo58957w(), new C29593va(this, m89099c));
        mo13994a.m17441e();
        this.f62745C = mo13994a;
    }
}
