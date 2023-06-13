package co.bird.android.feature.repair.p016v3.issues;

import android.app.Application;
import android.os.Bundle;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairIssue;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "LIE4;", "B", "LIE4;", "j0", "()LIE4;", "setPresenter", "(LIE4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3IssueActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueActivity.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,84:1\n44#2:85\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueActivity.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity\n*L\n33#1:85\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v3.issues.RepairV3IssueActivity */
/* loaded from: classes3.dex */
public final class RepairV3IssueActivity extends BaseActivity {

    /* renamed from: B */
    public IE4 f64660B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity$a;", "", "Lco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.repair.v3.issues.RepairV3IssueActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15228a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lk5;", "binding", "Lco/bird/android/feature/repair/v3/issues/RepairV3IssueActivity$a;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v3.issues.RepairV3IssueActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15229a {
            /* renamed from: a */
            InterfaceC15228a mo57524a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C25096k5 c25096k5);
        }

        /* renamed from: a */
        void mo57523a(RepairV3IssueActivity repairV3IssueActivity);
    }

    public RepairV3IssueActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final IE4 m57526j0() {
        IE4 ie4 = this.f64660B;
        if (ie4 != null) {
            return ie4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m57526j0().m102716v();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25096k5 m29350c = C25096k5.m29350c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m29350c, "inflate(layoutInflater)");
        setContentView(m29350c.getRoot());
        InterfaceC15228a.InterfaceC15229a m57525a = C15230a.m57525a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57525a.mo57524a(m21419a, this, m45197b, m29350c).mo57523a(this);
        String stringExtra = getIntent().getStringExtra("bird");
        if (stringExtra == null) {
            return;
        }
        RepairCategory repairCategory = (RepairCategory) getIntent().getParcelableExtra("category");
        RepairIssue repairIssue = (RepairIssue) getIntent().getParcelableExtra("issue");
        if (repairCategory != null) {
            m57526j0().m102712z(stringExtra, repairCategory);
        } else if (repairIssue != null) {
            m57526j0().m102759A(stringExtra, repairIssue);
        } else {
            throw new UnsupportedOperationException("Cannot use RepairV3IssuesActivity without a category or issue");
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            m57526j0().m102716v();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57526j0().m102757C();
    }
}
