package co.bird.android.app.feature.operator.permission.p009ui;

import android.app.Application;
import android.os.Bundle;
import co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver;
import co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver;
import co.bird.android.app.feature.operator.permission.p009ui.InterfaceC13994b;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "onStart", "onDestroy", "LGQ3;", "B", "LGQ3;", "m0", "()LGQ3;", "setPresenter", "(LGQ3;)V", "presenter", "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", "j0", "()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", "setBluetoothEnableChangeReceiver", "(Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;)V", "bluetoothEnableChangeReceiver", "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "D", "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "k0", "()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "setLocationEnableChangeReceiver", "(Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;)V", "locationEnableChangeReceiver", "LaZ2;", "E", "LaZ2;", "navigationDrawerPresenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.operator.permission.ui.OperatorPermissionsRequiredActivity */
/* loaded from: classes2.dex */
public final class OperatorPermissionsRequiredActivity extends BaseActivity {

    /* renamed from: B */
    public GQ3 f61906B;

    /* renamed from: C */
    public BluetoothEnableChangeReceiver f61907C;

    /* renamed from: D */
    public LocationEnableChangeReceiver f61908D;

    /* renamed from: E */
    public InterfaceC38024aZ2 f61909E;

    public OperatorPermissionsRequiredActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final BluetoothEnableChangeReceiver m60219j0() {
        BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver = this.f61907C;
        if (bluetoothEnableChangeReceiver != null) {
            return bluetoothEnableChangeReceiver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bluetoothEnableChangeReceiver");
        return null;
    }

    /* renamed from: k0 */
    public final LocationEnableChangeReceiver m60218k0() {
        LocationEnableChangeReceiver locationEnableChangeReceiver = this.f61908D;
        if (locationEnableChangeReceiver != null) {
            return locationEnableChangeReceiver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationEnableChangeReceiver");
        return null;
    }

    /* renamed from: m0 */
    public final GQ3 m60217m0() {
        GQ3 gq3 = this.f61906B;
        if (gq3 != null) {
            return gq3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C32184Cl4.LightAppTheme_NoActionBar);
        super.onCreate(bundle);
        C30411y4 m4208c = C30411y4.m4208c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m4208c, "inflate(layoutInflater)");
        setContentView(m4208c.getRoot());
        InterfaceC13994b.InterfaceC13995a m60216a = C13988a.m60216a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m60216a.mo60207a(c46172oG2.m21419a(application), this, m58963Z(), m4208c, mo58956x()).mo60208a(this);
        InterfaceC38024aZ2 interfaceC38024aZ2 = this.f61909E;
        if (interfaceC38024aZ2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationDrawerPresenter");
            interfaceC38024aZ2 = null;
        }
        interfaceC38024aZ2.mo71220a();
        registerReceiver(m60218k0(), LocationEnableChangeReceiver.f61673d.m60327a());
        registerReceiver(m60219j0(), BluetoothEnableChangeReceiver.f61668c.m60329a());
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(m60218k0());
        unregisterReceiver(m60219j0());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m60217m0().onStart();
    }
}
