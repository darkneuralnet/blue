package co.bird.android.feature.repair.p014v1.base;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R\"\u0010\u0018\u001a\u00020\u00118\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LNy4;", "B", "LNy4;", "j0", "()LNy4;", "m0", "(LNy4;)V", "component", "LXB4;", "k0", "()LXB4;", "setPresenter", "(LXB4;)V", "presenter", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseRepairOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewActivity.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v1.base.BaseRepairOverviewActivity */
/* loaded from: classes3.dex */
public abstract class BaseRepairOverviewActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC34875Ny4 f64574B;

    public BaseRepairOverviewActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC34875Ny4 m57596j0() {
        InterfaceC34875Ny4 interfaceC34875Ny4 = this.f64574B;
        if (interfaceC34875Ny4 != null) {
            return interfaceC34875Ny4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: k0 */
    public abstract XB4 mo57585k0();

    /* renamed from: m0 */
    public final void m57595m0(InterfaceC34875Ny4 interfaceC34875Ny4) {
        Intrinsics.checkNotNullParameter(interfaceC34875Ny4, "<set-?>");
        this.f64574B = interfaceC34875Ny4;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2;
        Issue issue;
        ArrayList parcelableArrayListExtra3;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i != 10011) {
                if (i != 10012) {
                    if (i != 10016) {
                        if (i == 10024 && intent != null && (parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("repairs")) != null) {
                            mo57585k0().mo77222d(parcelableArrayListExtra3);
                        }
                    } else if (intent != null && (issue = (Issue) intent.getParcelableExtra("issue")) != null) {
                        mo57585k0().mo77224b(issue);
                    }
                } else if (intent != null && (parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("repairs")) != null) {
                    mo57585k0().mo77223c(parcelableArrayListExtra2);
                }
            } else if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("repairs")) != null) {
                mo57585k0().mo77223c(parcelableArrayListExtra);
            }
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo57585k0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C35343Py4 c35343Py4 = C35343Py4.f29494b;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57595m0((InterfaceC34875Ny4) AbstractC31704Ak1.component$default(c35343Py4, application, null, 2, null));
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            mo57585k0().onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
