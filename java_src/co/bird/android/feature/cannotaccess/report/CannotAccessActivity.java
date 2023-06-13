package co.bird.android.feature.cannotaccess.report;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.cannotaccess.report.InterfaceC14669a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/feature/cannotaccess/report/CannotAccessActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lmd0;", "B", "Lmd0;", "cannotAccessPresenter", "LEd0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LEd0;", "j0", "()LEd0;", "setCannotAccessPresenterImplFactory", "(LEd0;)V", "cannotAccessPresenterImplFactory", "<init>", "()V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CannotAccessActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC45194md0 f63582B;

    /* renamed from: C */
    public InterfaceC32576Ed0 f63583C;

    public CannotAccessActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC32576Ed0 m58528j0() {
        InterfaceC32576Ed0 interfaceC32576Ed0 = this.f63583C;
        if (interfaceC32576Ed0 != null) {
            return interfaceC32576Ed0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cannotAccessPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC45194md0 interfaceC45194md0 = this.f63582B;
        if (interfaceC45194md0 != null) {
            interfaceC45194md0.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20696g3 m40251c = C20696g3.m40251c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m40251c, "inflate(layoutInflater)");
        setContentView(m40251c.f81449k);
        InterfaceC14669a.InterfaceC14670a m58527a = C14671b.m58527a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m58527a.mo58517a(c46172oG2.m21419a(application)).mo58526a(this);
        mo58977D();
        C31874Bd0 mo106874a = m58528j0().mo106874a(m58963Z(), new C37256Yd0(this, m40251c), mo58957w());
        this.f63582B = mo106874a;
        if (mo106874a != null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            mo106874a.mo25308b(intent);
        }
    }
}
