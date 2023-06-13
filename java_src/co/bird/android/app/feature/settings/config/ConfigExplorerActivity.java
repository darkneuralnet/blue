package co.bird.android.app.feature.settings.config;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/settings/config/ConfigExplorerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lbv0;", "B", "Lbv0;", "j0", "()Lbv0;", "setPresenterFactory", "(Lbv0;)V", "presenterFactory", "Lav0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lav0;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ConfigExplorerActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC38834bv0 f62749B;

    /* renamed from: C */
    public C38241av0 f62750C;

    public ConfigExplorerActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC38834bv0 m59393j0() {
        InterfaceC38834bv0 interfaceC38834bv0 = this.f62749B;
        if (interfaceC38834bv0 != null) {
            return interfaceC38834bv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24091H2(this);
        setContentView(C39311cj4.activity_config_explorer);
        C38241av0 mo44825a = m59393j0().mo44825a(m58963Z(), new C41223fv0(this));
        mo44825a.m65270n();
        this.f62750C = mo44825a;
    }
}
