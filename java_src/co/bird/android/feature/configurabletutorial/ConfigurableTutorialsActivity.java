package co.bird.android.feature.configurabletutorial;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.configurabletutorial.InterfaceC14751a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010#\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r  *\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"Lco/bird/android/feature/configurabletutorial/ConfigurableTutorialsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lcx0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "", TransferTable.COLUMN_STATE, "render", "Lio/reactivex/Observable;", "", "", "x7", "Lbx0;", "j", "Lbx0;", "Q", "()Lbx0;", "setPresenter", "(Lbx0;)V", "presenter", "Lco/bird/android/feature/configurabletutorial/a;", "k", "Lco/bird/android/feature/configurabletutorial/a;", "P", "()Lco/bird/android/feature/configurabletutorial/a;", "R", "(Lco/bird/android/feature/configurabletutorial/a;)V", "component", "Lma4;", "kotlin.jvm.PlatformType", "l", "Lma4;", "startFromIdsRelay", "Lqw0;", "m", "Lqw0;", "tutorialNavigator", "<init>", "()V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConfigurableTutorialsActivity extends BaseActivityLite implements InterfaceC39465cx0 {

    /* renamed from: j */
    public C38854bx0 f63731j;

    /* renamed from: k */
    public InterfaceC14751a f63732k;

    /* renamed from: l */
    public final C45168ma4<List<String>> f63733l;

    /* renamed from: m */
    public C47756qw0 f63734m;

    public ConfigurableTutorialsActivity() {
        C45168ma4<List<String>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<String>>()");
        this.f63733l = m25409g;
    }

    /* renamed from: P */
    public final InterfaceC14751a m58406P() {
        InterfaceC14751a interfaceC14751a = this.f63732k;
        if (interfaceC14751a != null) {
            return interfaceC14751a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: Q */
    public final C38854bx0 m58405Q() {
        C38854bx0 c38854bx0 = this.f63731j;
        if (c38854bx0 != null) {
            return c38854bx0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: R */
    public final void m58404R(InterfaceC14751a interfaceC14751a) {
        Intrinsics.checkNotNullParameter(interfaceC14751a, "<set-?>");
        this.f63732k = interfaceC14751a;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C47756qw0 c47756qw0 = this.f63734m;
        if (c47756qw0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tutorialNavigator");
            c47756qw0 = null;
        }
        if (c47756qw0.mo28392a()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C27481q3.m18257c(getLayoutInflater()).getRoot());
        mo58977D();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        this.f63734m = new C47756qw0(supportFragmentManager, C43459jh4.container);
        InterfaceC14751a.InterfaceC14752a m58403a = C14753b.m58403a();
        InterfaceC44393lG2 m58989H = m58989H();
        C47756qw0 c47756qw0 = this.f63734m;
        if (c47756qw0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tutorialNavigator");
            c47756qw0 = null;
        }
        m58404R(m58403a.mo58391a(m58989H, c47756qw0, getIntent().getBooleanExtra("keep_unseen", false)));
        m58406P().mo58400c(this);
        m58405Q().consume(this);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("configurable_tutorial_id");
        if (stringArrayListExtra != null) {
            this.f63733l.accept(stringArrayListExtra);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // p000.InterfaceC48362rx4
    public void render(Object state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // p000.InterfaceC39465cx0
    /* renamed from: x7 */
    public Observable<List<String>> mo44802x7() {
        Observable<List<String>> hide = this.f63733l.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "startFromIdsRelay.hide()");
        return hide;
    }
}
