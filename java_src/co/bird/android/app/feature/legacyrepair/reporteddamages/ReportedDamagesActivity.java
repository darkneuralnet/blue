package co.bird.android.app.feature.legacyrepair.reporteddamages;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LPH4;", "B", "LPH4;", "j0", "()LPH4;", "setPresenterFactory", "(LPH4;)V", "presenterFactory", "LJy4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LJy4;", "k0", "()LJy4;", "setRepairClient", "(LJy4;)V", "repairClient", "LSH4;", "D", "LSH4;", "ui", "LKH4;", "E", "LKH4;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReportedDamagesActivity extends BaseActivity {

    /* renamed from: B */
    public PH4 f61497B;

    /* renamed from: C */
    public InterfaceC33939Jy4 f61498C;

    /* renamed from: D */
    public SH4 f61499D;

    /* renamed from: E */
    public KH4 f61500E;

    public ReportedDamagesActivity() {
        super(false, Integer.valueOf(C45871nl4.mechanic_repair_flow_action_bar_title), null, 4, null);
    }

    /* renamed from: j0 */
    public final PH4 m60618j0() {
        PH4 ph4 = this.f61497B;
        if (ph4 != null) {
            return ph4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC33939Jy4 m60617k0() {
        InterfaceC33939Jy4 interfaceC33939Jy4 = this.f61498C;
        if (interfaceC33939Jy4 != null) {
            return interfaceC33939Jy4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repairClient");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27484q5 m18229c = C27484q5.m18229c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m18229c, "inflate(layoutInflater)");
        setContentView(m18229c.getRoot());
        H22.f12748a.mo24080Q0(this);
        this.f61499D = new TH4(this, m18229c);
        PH4 m60618j0 = m60618j0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        SH4 sh4 = this.f61499D;
        OH4 oh4 = null;
        if (sh4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            sh4 = null;
        }
        OH4 mo88666a = m60618j0.mo88666a(m58963Z, sh4, mo58957w(), m60617k0());
        this.f61500E = mo88666a;
        if (mo88666a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            oh4 = mo88666a;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        oh4.mo92573b(intent);
    }
}
