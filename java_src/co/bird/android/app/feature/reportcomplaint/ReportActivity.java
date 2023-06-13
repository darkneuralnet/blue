package co.bird.android.app.feature.reportcomplaint;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Folder;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/app/feature/reportcomplaint/ReportActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onDestroy", "LEH4;", "B", "LEH4;", "j0", "()LEH4;", "setReportPresenterFactory", "(LEH4;)V", "reportPresenterFactory", "LZC6;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LZC6;", "k0", "()LZC6;", "setWorkManager", "(LZC6;)V", "workManager", "LiH4;", "D", "LiH4;", "reportPresenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReportActivity extends BaseActivity {

    /* renamed from: B */
    public EH4 f62343B;

    /* renamed from: C */
    public ZC6 f62344C;

    /* renamed from: D */
    public InterfaceC42625iH4 f62345D;

    public ReportActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final EH4 m59618j0() {
        EH4 eh4 = this.f62343B;
        if (eh4 != null) {
            return eh4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportPresenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final ZC6 m59617k0() {
        ZC6 zc6 = this.f62344C;
        if (zc6 != null) {
            return zc6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workManager");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC42625iH4 interfaceC42625iH4 = this.f62345D;
        if (interfaceC42625iH4 != null) {
            interfaceC42625iH4.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24097E(this);
        C26812o5 m21829c = C26812o5.m21829c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m21829c, "inflate(layoutInflater)");
        setContentView(m21829c.getRoot());
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        C48112rY1 c48112rY1 = new C48112rY1(this, uuid, Folder.COMPLAINT_PHOTOS, m59617k0());
        CH4 mo107358a = m59618j0().mo107358a(m58963Z(), m58971M(), new IH4(this, m21829c), mo58956x(), mo58957w(), c48112rY1);
        this.f62345D = mo107358a;
        if (mo107358a != null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            mo107358a.mo34243a(intent, uuid);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC42625iH4 interfaceC42625iH4 = this.f62345D;
        if (interfaceC42625iH4 != null) {
            interfaceC42625iH4.onDestroy();
        }
    }
}
