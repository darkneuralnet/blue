package co.bird.android.app.feature.testride;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/testride/PotentialIssuesActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LOY3;", "B", "LOY3;", "j0", "()LOY3;", "setPresenterFactory", "(LOY3;)V", "presenterFactory", "LRY3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LRY3;", "ui", "LLY3;", "D", "LLY3;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PotentialIssuesActivity extends BaseActivity {

    /* renamed from: B */
    public OY3 f62840B;

    /* renamed from: C */
    public RY3 f62841C;

    /* renamed from: D */
    public LY3 f62842D;

    public PotentialIssuesActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final OY3 m59336j0() {
        OY3 oy3 = this.f62840B;
        if (oy3 != null) {
            return oy3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5820O4 m92955c = C5820O4.m92955c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m92955c, "inflate(layoutInflater)");
        setContentView(m92955c.getRoot());
        H22.f12748a.mo24059e2(this);
        this.f62841C = new SY3(this, m92955c);
        OY3 m59336j0 = m59336j0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC40099e13 mo58957w = mo58957w();
        RY3 ry3 = this.f62841C;
        NY3 ny3 = null;
        if (ry3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            ry3 = null;
        }
        NY3 mo90119a = m59336j0.mo90119a(m58963Z, mo58957w, ry3);
        this.f62842D = mo90119a;
        if (mo90119a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            ny3 = mo90119a;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        ny3.mo93785b(intent);
    }
}
