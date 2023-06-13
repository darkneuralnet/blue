package co.bird.android.app.feature.physicallock;

import android.app.Application;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import co.bird.android.app.feature.physicallock.InterfaceC14017b;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePhysicalLock;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/PhysicalLockActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LHS3;", "B", "LHS3;", "j0", "()LHS3;", "setPresenter", "(LHS3;)V", "presenter", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Z", "blurCombination", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhysicalLockActivity extends BaseActivity {

    /* renamed from: B */
    public HS3 f61969B;

    /* renamed from: C */
    public boolean f61970C;

    public PhysicalLockActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final HS3 m60185j0() {
        HS3 hs3 = this.f61969B;
        if (hs3 != null) {
            return hs3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ES3 es3;
        super.onCreate(bundle);
        setContentView(new FrameLayout(this));
        Integer valueOf = Integer.valueOf(getIntent().getIntExtra("request_code", -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        this.f61970C = mo58955y().m82623f8().m73665a().getEnablePhysicalLockBlurCombination();
        boolean booleanExtra = getIntent().getBooleanExtra("physical_lock_unlocking", true);
        if (booleanExtra) {
            boolean z = this.f61970C;
            if (z) {
                es3 = ES3.UNLOCKING_BLUR_CODE;
            } else if (!z) {
                es3 = ES3.UNLOCKING;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!booleanExtra) {
            es3 = ES3.LOCKING;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) getIntent().getParcelableExtra("physical_lock");
        if (wirePhysicalLock == null) {
            return;
        }
        invalidateOptionsMenu();
        InterfaceC14017b.InterfaceC14018a m60179a = C14009a.m60179a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m60179a.mo60170a(c46172oG2.m21419a(application), new FS3(es3), this, m58963Z()).mo60171a(this);
        m60185j0().mo90228i(es3, wirePhysicalLock, valueOf);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (this.f61970C) {
            getMenuInflater().inflate(C36387Uk4.menu_lock_bird, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m60185j0().onDestroy();
        super.onDestroy();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.help) {
            m60185j0().mo90227p();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
