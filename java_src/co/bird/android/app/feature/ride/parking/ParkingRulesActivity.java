package co.bird.android.app.feature.ride.parking;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/ride/parking/ParkingRulesActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LzH3;", "B", "LzH3;", "j0", "()LzH3;", "setPresenterFactory", "(LzH3;)V", "presenterFactory", "LvH3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LvH3;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ParkingRulesActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52703zH3 f62682B;

    /* renamed from: C */
    public InterfaceC50331vH3 f62683C;

    public ParkingRulesActivity() {
        super(false, Integer.valueOf(C45871nl4.parking_rules_actionbar_label), null, 5, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52703zH3 m59466j0() {
        InterfaceC52703zH3 interfaceC52703zH3 = this.f62682B;
        if (interfaceC52703zH3 != null) {
            return interfaceC52703zH3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24098D(this);
        C3319I4 m103007c = C3319I4.m103007c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m103007c, "inflate(layoutInflater)");
        setContentView(m103007c.getRoot());
        mo58977D();
        C52110yH3 mo1569a = m59466j0().mo1569a(m58963Z(), new DH3(this, m103007c), mo58957w());
        mo1569a.m3719c();
        this.f62683C = mo1569a;
    }
}
