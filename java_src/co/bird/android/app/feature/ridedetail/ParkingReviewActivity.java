package co.bird.android.app.feature.ridedetail;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/ParkingReviewActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LpH3;", "B", "LpH3;", "j0", "()LpH3;", "setParkingReviewPresenterImplFactory", "(LpH3;)V", "parkingReviewPresenterImplFactory", "LnH3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LnH3;", "parkingReviewPresenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ParkingReviewActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC46775pH3 f62692B;

    /* renamed from: C */
    public InterfaceC45589nH3 f62693C;

    public ParkingReviewActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC46775pH3 m59459j0() {
        InterfaceC46775pH3 interfaceC46775pH3 = this.f62692B;
        if (interfaceC46775pH3 != null) {
            return interfaceC46775pH3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkingReviewPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24062d1(this);
        setContentView(C39311cj4.activity_parking_review);
        C46182oH3 mo17696a = m59459j0().mo17696a(new C49146tH3(this), mo58957w());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo17696a.m21416a(intent);
        this.f62693C = mo17696a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_parking_review, menu);
        InterfaceC45589nH3 interfaceC45589nH3 = this.f62693C;
        if (interfaceC45589nH3 != null) {
            interfaceC45589nH3.mo21414d(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean z;
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC45589nH3 interfaceC45589nH3 = this.f62693C;
        if (interfaceC45589nH3 != null) {
            z = interfaceC45589nH3.mo21415c(item);
        } else {
            z = false;
        }
        if (!z && !super.onOptionsItemSelected(item)) {
            return false;
        }
        return true;
    }
}
