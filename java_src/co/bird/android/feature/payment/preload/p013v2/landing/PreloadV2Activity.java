package co.bird.android.feature.payment.preload.p013v2.landing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.payment.preload.p013v2.landing.PreloadV2Activity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\"\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lco/bird/android/feature/payment/preload/v2/landing/PreloadV2Activity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Ly04;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", AbstractC26684u0.f100690q, "Lz04;", TransferTable.COLUMN_STATE, "S", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lx04;", "j", "Lx04;", "Q", "()Lx04;", "setPresenter", "(Lx04;)V", "presenter", "LP4;", "k", "LP4;", "binding", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.payment.preload.v2.landing.PreloadV2Activity */
/* loaded from: classes3.dex */
public final class PreloadV2Activity extends BaseActivityLite implements InterfaceC51948y04 {

    /* renamed from: j */
    public C51355x04 f64424j;

    /* renamed from: k */
    public C6236P4 f64425k;

    /* renamed from: R */
    public static final void m57760R(PreloadV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m57761Q().m5993p();
    }

    /* renamed from: Q */
    public final C51355x04 m57761Q() {
        C51355x04 c51355x04 = this.f64424j;
        if (c51355x04 != null) {
            return c51355x04;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(InterfaceC52541z04 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C41276g04) {
            C6236P4 c6236p4 = this.f64425k;
            if (c6236p4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6236p4 = null;
            }
            TextView textView = c6236p4.f27839d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.infoText0");
            C41276g04 c41276g04 = (C41276g04) state;
            C49520tu6.setTextAndVisibility$default(textView, getString(c41276g04.m40356c()), 0, 2, null);
            C6236P4 c6236p42 = this.f64425k;
            if (c6236p42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6236p42 = null;
            }
            TextView textView2 = c6236p42.f27840e;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.infoText1");
            C49520tu6.setTextAndVisibility$default(textView2, c41276g04.m40357b(), 0, 2, null);
            C6236P4 c6236p43 = this.f64425k;
            if (c6236p43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6236p43 = null;
            }
            TextView textView3 = c6236p43.f27841f;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.infoText2");
            C49520tu6.setTextAndVisibility$default(textView3, m57761Q().m5994o(this), 0, 2, null);
        } else if (state instanceof HY3) {
            C6236P4 c6236p44 = this.f64425k;
            if (c6236p44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6236p44 = null;
            }
            TextView textView4 = c6236p44.f27839d;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.infoText0");
            HY3 hy3 = (HY3) state;
            C49520tu6.setTextAndVisibility$default(textView4, getString(hy3.m103759c()), 0, 2, null);
            C6236P4 c6236p45 = this.f64425k;
            if (c6236p45 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6236p45 = null;
            }
            TextView textView5 = c6236p45.f27840e;
            Intrinsics.checkNotNullExpressionValue(textView5, "binding.infoText1");
            C49520tu6.setTextAndVisibility$default(textView5, hy3.m103760b(), 0, 2, null);
            C6236P4 c6236p46 = this.f64425k;
            if (c6236p46 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6236p46 = null;
            }
            TextView textView6 = c6236p46.f27841f;
            Intrinsics.checkNotNullExpressionValue(textView6, "binding.infoText2");
            C49520tu6.setTextAndVisibility$default(textView6, m57761Q().m5994o(this), 0, 2, null);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10074) {
            if (i2 == -1) {
                new Handler().postDelayed(new Runnable() { // from class: l04
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreloadV2Activity.m57760R(PreloadV2Activity.this);
                    }
                }, 500L);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58977D();
        C39720dO0.m44334a().mo9390a(m58989H()).mo9391c(this);
        C6236P4 m91027c = C6236P4.m91027c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m91027c, "inflate(layoutInflater)");
        this.f64425k = m91027c;
        if (m91027c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m91027c = null;
        }
        setContentView(m91027c.getRoot());
        m57761Q().consume(this);
    }

    @Override // p000.InterfaceC51948y04
    /* renamed from: u0 */
    public Observable<Unit> mo4246u0() {
        C6236P4 c6236p4 = this.f64425k;
        if (c6236p4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6236p4 = null;
        }
        Button button = c6236p4.f27837b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
