package co.bird.android.app.feature.physicallock.smartlock;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Activity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LTH5;", "B", "LTH5;", "j0", "()LTH5;", "setFactory", "(LTH5;)V", "factory", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmartlockAssociationV2Activity extends BaseActivity {

    /* renamed from: B */
    public TH5 f62072B;

    /* renamed from: C */
    public SmartlockAssociationV2Presenter f62073C;

    public SmartlockAssociationV2Activity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final TH5 m60020j0() {
        TH5 th5 = this.f62072B;
        if (th5 != null) {
            return th5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10006 && i2 == -1 && intent != null) {
            SmartlockAssociationV2Presenter smartlockAssociationV2Presenter = this.f62073C;
            if (smartlockAssociationV2Presenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                smartlockAssociationV2Presenter = null;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("bird");
            Intrinsics.checkNotNull(parcelableExtra);
            smartlockAssociationV2Presenter.m59954Y0((WireBird) parcelableExtra);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_smartlock_association_v2);
        mo58977D();
        H22.f12748a.mo24051h3(this);
        SmartlockAssociationV2Presenter mo81682a = m60020j0().mo81682a(mo58956x(), m58963Z(), new C14176c(this), mo58957w());
        this.f62073C = mo81682a;
        if (mo81682a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo81682a = null;
        }
        mo81682a.m59946b1();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            mo58957w().mo37030e3();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
