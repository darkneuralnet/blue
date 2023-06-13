package co.bird.android.app.feature.reservation.activity;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/reservation/activity/ReservationFeedbackActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LzK4;", "B", "LzK4;", "presenter", "LHK4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LHK4;", "j0", "()LHK4;", "setPresenterFactory", "(LHK4;)V", "presenterFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReservationFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationFeedbackActivity.kt\nco/bird/android/app/feature/reservation/activity/ReservationFeedbackActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes2.dex */
public final class ReservationFeedbackActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52731zK4 f62348B;

    /* renamed from: C */
    public HK4 f62349C;

    public ReservationFeedbackActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final HK4 m59610j0() {
        HK4 hk4 = this.f62349C;
        if (hk4 != null) {
            return hk4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RetakeablePhotoActivity.class)) && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("photo_url")) != null) {
            InterfaceC52731zK4 interfaceC52731zK4 = this.f62348B;
            if (interfaceC52731zK4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                interfaceC52731zK4 = null;
            }
            interfaceC52731zK4.mo1535j(stringExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27842r5 m16513c = C27842r5.m16513c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m16513c, "inflate(layoutInflater)");
        setContentView(m16513c.getRoot());
        H22.f12748a.mo24034q1(this);
        mo58977D();
        GK4 mo102479a = m59610j0().mo102479a(this, m58963Z(), new LK4(this, m16513c), mo58957w());
        this.f62348B = mo102479a;
        if (mo102479a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo102479a = null;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo102479a.mo1536b(intent);
    }
}
