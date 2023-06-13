package co.bird.android.app.feature.physicallock.smartlock;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0014R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onDestroy", "LRL5;", "B", "LRL5;", "j0", "()LRL5;", "setPresenterFactory", "(LRL5;)V", "presenterFactory", "LmL5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LmL5;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SmartlockUnlockActivity extends BaseActivity {

    /* renamed from: B */
    public RL5 f62251B;

    /* renamed from: C */
    public InterfaceC45034mL5 f62252C;

    public SmartlockUnlockActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final RL5 m59707j0() {
        RL5 rl5 = this.f62251B;
        if (rl5 != null) {
            return rl5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC45034mL5 interfaceC45034mL5 = this.f62252C;
        if (interfaceC45034mL5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC45034mL5 = null;
        }
        interfaceC45034mL5.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_smartlock_unlock);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(false);
        }
        H22.f12748a.mo24026w0(this);
        GL5 mo85711a = m59707j0().mo85711a(mo58956x(), m58963Z(), new XL5(this), mo58957w());
        this.f62252C = mo85711a;
        if (mo85711a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo85711a = null;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo85711a.mo25817b(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_smartlock_unlock, menu);
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC45034mL5 interfaceC45034mL5 = this.f62252C;
        if (interfaceC45034mL5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC45034mL5 = null;
        }
        interfaceC45034mL5.onDestroy();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC45034mL5 interfaceC45034mL5 = this.f62252C;
        if (interfaceC45034mL5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC45034mL5 = null;
        }
        if (!interfaceC45034mL5.mo25816c(item) && !super.onOptionsItemSelected(item)) {
            return false;
        }
        return true;
    }
}
