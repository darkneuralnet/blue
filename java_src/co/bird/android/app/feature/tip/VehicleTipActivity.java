package co.bird.android.app.feature.tip;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/tip/VehicleTipActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LCn6;", "B", "LCn6;", "j0", "()LCn6;", "setFactory", "(LCn6;)V", "factory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VehicleTipActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC32204Cn6 f62843B;

    public VehicleTipActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final InterfaceC32204Cn6 m59335j0() {
        InterfaceC32204Cn6 interfaceC32204Cn6 = this.f62843B;
        if (interfaceC32204Cn6 != null) {
            return interfaceC32204Cn6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_vehicle_tip);
        H22.f12748a.mo24082P(this);
        m59335j0().mo109935a(m58963Z(), new C33842Jn6(this)).m431f(getIntent().getStringExtra("tip_id"), mo58955y().m82623f8().getValue().getEmergencyContactPhoneNumber());
    }
}
