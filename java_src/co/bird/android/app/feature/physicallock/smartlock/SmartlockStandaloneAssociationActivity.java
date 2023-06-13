package co.bird.android.app.feature.physicallock.smartlock;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockStandaloneAssociationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LQK5;", "B", "LQK5;", "j0", "()LQK5;", "setFactory", "(LQK5;)V", "factory", "LPK5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LPK5;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmartlockStandaloneAssociationActivity extends BaseActivity {

    /* renamed from: B */
    public QK5 f62248B;

    /* renamed from: C */
    public PK5 f62249C;

    public SmartlockStandaloneAssociationActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final QK5 m59709j0() {
        QK5 qk5 = this.f62248B;
        if (qk5 != null) {
            return qk5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        PK5 pk5 = null;
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(SmartlockQrScanActivity.class)) && i2 == 17) {
            if (intent != null && (stringExtra = intent.getStringExtra("smartlock_serial_number")) != null) {
                PK5 pk52 = this.f62249C;
                if (pk52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                } else {
                    pk5 = pk52;
                }
                pk5.m90457x(stringExtra);
            }
        } else if (i == 10006 && i2 == -1 && intent != null) {
            PK5 pk53 = this.f62249C;
            if (pk53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            } else {
                pk5 = pk53;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("bird");
            Intrinsics.checkNotNull(parcelableExtra);
            pk5.m90468m((WireBird) parcelableExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_smartlock_standalone_association);
        mo58977D();
        H22.f12748a.mo24049i1(this);
        PK5 mo86849a = m59709j0().mo86849a(mo58956x(), m58963Z(), new TK5(this), mo58957w());
        this.f62249C = mo86849a;
        if (mo86849a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo86849a = null;
        }
        mo86849a.m90467n();
    }
}
