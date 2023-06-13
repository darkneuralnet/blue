package co.bird.android.app.feature.propertyreport;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/propertyreport/PropertyReportActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lf94;", "B", "Lf94;", "propertyReportPresenter", "Lw94;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lw94;", "j0", "()Lw94;", "setPropertyReportPresenterImplFactory", "(Lw94;)V", "propertyReportPresenterImplFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PropertyReportActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC40773f94 f62333B;

    /* renamed from: C */
    public InterfaceC50852w94 f62334C;

    public PropertyReportActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC50852w94 m59622j0() {
        InterfaceC50852w94 interfaceC50852w94 = this.f62334C;
        if (interfaceC50852w94 != null) {
            return interfaceC50852w94;
        }
        Intrinsics.throwUninitializedPropertyAccessException("propertyReportPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8187U4 m82020c = C8187U4.m82020c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m82020c, "inflate(layoutInflater)");
        setContentView(m82020c.f36796s);
        H22.f12748a.mo24022z0(this);
        mo58977D();
        C49667u94 mo5770a = m59622j0().mo5770a(m58963Z(), new A94(this, m82020c), mo58957w());
        this.f62333B = mo5770a;
        if (mo5770a != null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            mo5770a.mo10764b(intent);
        }
    }
}
