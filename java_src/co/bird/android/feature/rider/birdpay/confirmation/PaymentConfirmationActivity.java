package co.bird.android.feature.rider.birdpay.confirmation;

import android.content.Context;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.confirmation.InterfaceC15342b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/PaymentConfirmationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LSL3;", "B", "LSL3;", "j0", "()LSL3;", "setPresenter", "(LSL3;)V", "presenter", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PaymentConfirmationActivity extends BaseActivity {

    /* renamed from: B */
    public SL3 f64869B;

    public PaymentConfirmationActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final SL3 m57368j0() {
        SL3 sl3 = this.f64869B;
        if (sl3 != null) {
            return sl3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C33336Hj4.activity_bird_pay_confirmation);
        mo58977D();
        InterfaceC15342b.InterfaceC15343a m57367a = C15334a.m57367a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        m57367a.mo57358a(c46172oG2.m21419a(applicationContext), this).mo57359a(this);
        m57368j0().mo57349a();
    }
}
