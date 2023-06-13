package co.bird.android.app.feature.physicallock.smartlock;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockToolsLauncherActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LcL5;", "B", "LcL5;", "j0", "()LcL5;", "setPresenterFactory", "(LcL5;)V", "presenterFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmartlockToolsLauncherActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC39087cL5 f62250B;

    public SmartlockToolsLauncherActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC39087cL5 m59708j0() {
        InterfaceC39087cL5 interfaceC39087cL5 = this.f62250B;
        if (interfaceC39087cL5 != null) {
            return interfaceC39087cL5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24064c3(this);
        setContentView(C39311cj4.activity_smartlock_tools_launcher);
        m59708j0().mo44383a(m58963Z(), new C41476gL5(this), mo58957w()).m64652g();
    }
}
