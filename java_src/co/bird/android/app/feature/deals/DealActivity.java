package co.bird.android.app.feature.deals;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Deal;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/app/feature/deals/DealActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LzU0;", "B", "LzU0;", "j0", "()LzU0;", "setDealPresenterImplFactory", "(LzU0;)V", "dealPresenterImplFactory", "LST0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LST0;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DealActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52817zU0 f61432B;

    /* renamed from: C */
    public ST0 f61433C;

    public DealActivity() {
        super(false, Integer.valueOf(C45871nl4.deal_activity_title), null, 5, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52817zU0 m60671j0() {
        InterfaceC52817zU0 interfaceC52817zU0 = this.f61432B;
        if (interfaceC52817zU0 != null) {
            return interfaceC52817zU0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dealPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ST0 st0 = this.f61433C;
        if (st0 != null) {
            st0.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ST0 st0 = this.f61433C;
        if (st0 != null) {
            st0.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24099B0(this);
        C28512t3 m13195c = C28512t3.m13195c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m13195c, "inflate(layoutInflater)");
        setContentView(m13195c.getRoot());
        C51631xU0 mo1326a = m60671j0().mo1326a(this, m58963Z(), new DU0(this, m13195c), mo58957w(), m58965X());
        mo1326a.m5205J((Deal) getIntent().getParcelableExtra("deal"));
        this.f61433C = mo1326a;
    }
}
