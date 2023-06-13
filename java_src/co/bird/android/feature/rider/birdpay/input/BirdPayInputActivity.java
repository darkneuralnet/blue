package co.bird.android.feature.rider.birdpay.input;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.input.InterfaceC15360a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/input/BirdPayInputActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "LiN;", "B", "LiN;", "j0", "()LiN;", "setPresenter", "(LiN;)V", "presenter", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BirdPayInputActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC23223iN f64932B;

    public BirdPayInputActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC23223iN m57312j0() {
        InterfaceC23223iN interfaceC23223iN = this.f64932B;
        if (interfaceC23223iN != null) {
            return interfaceC23223iN;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C33336Hj4.activity_bird_pay_input);
        mo58977D();
        InterfaceC15360a.InterfaceC15361a m57163a = C15411f.m57163a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        m57163a.mo57150a(c46172oG2.m21419a(applicationContext), this).mo57162a(this);
        m57312j0().mo34056a();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (m57312j0().mo34054c()) {
            getMenuInflater().inflate(C35685Rk4.menu_birdpay_input_activity, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (m57312j0().mo34055b(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
