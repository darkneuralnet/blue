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
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LDG5;", "B", "LDG5;", "j0", "()LDG5;", "setFactory", "(LDG5;)V", "factory", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmartlockAssociationActivity extends BaseActivity {

    /* renamed from: B */
    public DG5 f61997B;

    /* renamed from: C */
    public SmartlockAssociationPresenter f61998C;

    public SmartlockAssociationActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final DG5 m60169j0() {
        DG5 dg5 = this.f61997B;
        if (dg5 != null) {
            return dg5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        SmartlockAssociationPresenter smartlockAssociationPresenter = null;
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(SmartlockQrScanActivity.class)) && i2 == 17) {
            if (intent != null && (stringExtra = intent.getStringExtra("smartlock_serial_number")) != null) {
                SmartlockAssociationPresenter smartlockAssociationPresenter2 = this.f61998C;
                if (smartlockAssociationPresenter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                } else {
                    smartlockAssociationPresenter = smartlockAssociationPresenter2;
                }
                smartlockAssociationPresenter.m60143M0(stringExtra);
            }
        } else if (i == 10006 && i2 == -1 && intent != null) {
            SmartlockAssociationPresenter smartlockAssociationPresenter3 = this.f61998C;
            if (smartlockAssociationPresenter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            } else {
                smartlockAssociationPresenter = smartlockAssociationPresenter3;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("bird");
            Intrinsics.checkNotNull(parcelableExtra);
            smartlockAssociationPresenter.m60070p0((WireBird) parcelableExtra);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_smartlock_association);
        mo58977D();
        H22.f12748a.mo24028v(this);
        SmartlockAssociationPresenter mo109263a = m60169j0().mo109263a(mo58956x(), m58963Z(), new GG5(this), mo58957w());
        this.f61998C = mo109263a;
        if (mo109263a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo109263a = null;
        }
        mo109263a.m60064s0();
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
