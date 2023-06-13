package co.bird.android.feature.rideendsummary;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rideendsummary.InterfaceC15288e;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/DamageFeedbackActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LqS0;", "B", "LqS0;", "k0", "()LqS0;", "setPresenterFactory", "(LqS0;)V", "presenterFactory", "LhS0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LhS0;", "j0", "()LhS0;", "m0", "(LhS0;)V", "presenter", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDamageFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DamageFeedbackActivity.kt\nco/bird/android/feature/rideendsummary/DamageFeedbackActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/* loaded from: classes3.dex */
public final class DamageFeedbackActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC47464qS0 f64684B;

    /* renamed from: C */
    public InterfaceC42127hS0 f64685C;

    public DamageFeedbackActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC42127hS0 m57496j0() {
        InterfaceC42127hS0 interfaceC42127hS0 = this.f64685C;
        if (interfaceC42127hS0 != null) {
            return interfaceC42127hS0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC47464qS0 m57495k0() {
        InterfaceC47464qS0 interfaceC47464qS0 = this.f64684B;
        if (interfaceC47464qS0 != null) {
            return interfaceC47464qS0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    /* renamed from: m0 */
    public final void m57494m0(InterfaceC42127hS0 interfaceC42127hS0) {
        Intrinsics.checkNotNullParameter(interfaceC42127hS0, "<set-?>");
        this.f64685C = interfaceC42127hS0;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RetakeablePhotoActivity.class)) && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("photo_url")) != null) {
            m57496j0().mo21064a(stringExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        InterfaceC15288e.InterfaceC15289a m57484a = C15252a.m57484a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57484a.mo57443a(c46172oG2.m21419a(application)).mo57444a(this);
        boolean z = true;
        boolean booleanExtra = getIntent().getBooleanExtra("physical_lock_unlocking", true);
        if (getIntent().hasExtra("physical_lock_unlocking")) {
            i = C32868Fj4.activity_damage_physical_lock_feedback;
        } else {
            i = C32868Fj4.activity_damage_feedback;
            z = false;
        }
        setContentView(i);
        m57494m0(m57495k0().mo15935a(m58963Z(), new C50427vS0(this, mo58955y().m82623f8().getValue().getChargerConfig().getMarkDamagedCopyUpdates(), z, booleanExtra), mo58957w()));
        InterfaceC42127hS0 m57496j0 = m57496j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m57496j0.mo21063b(intent);
    }
}
