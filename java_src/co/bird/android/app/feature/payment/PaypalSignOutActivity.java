package co.bird.android.app.feature.payment;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/payment/PaypalSignOutActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LPP3;", "B", "LPP3;", "j0", "()LPP3;", "setPaypalSignOutPresenterImplFactory", "(LPP3;)V", "paypalSignOutPresenterImplFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PaypalSignOutActivity extends BaseActivity {

    /* renamed from: B */
    public PP3 f61954B;

    public PaypalSignOutActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final PP3 m60196j0() {
        PP3 pp3 = this.f61954B;
        if (pp3 != null) {
            return pp3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paypalSignOutPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24057f1(this);
        setContentView(C39311cj4.activity_paypal_sign_out);
        OP3 mo88530a = m60196j0().mo88530a(new VP3(this), m58963Z(), mo58957w());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo88530a.m92342f(intent);
    }
}
