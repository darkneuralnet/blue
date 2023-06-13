package co.bird.android.feature.repair.p016v3.overview;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RepairFlow;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LwF4;", "B", "LwF4;", "j0", "()LwF4;", "setPresenter", "(LwF4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3OverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewActivity.kt\nco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n44#2:79\n1#3:80\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewActivity.kt\nco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity\n*L\n34#1:79\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v3.overview.RepairV3OverviewActivity */
/* loaded from: classes3.dex */
public final class RepairV3OverviewActivity extends BaseActivity {

    /* renamed from: B */
    public C50907wF4 f64666B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity$a;", "", "Lco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.repair.v3.overview.RepairV3OverviewActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15233a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ll5;", "binding", "LDQ3;", "permissionManager", "Lco/bird/android/feature/repair/v3/overview/RepairV3OverviewActivity$a;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v3.overview.RepairV3OverviewActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15234a {
            /* renamed from: a */
            InterfaceC15233a mo57516a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C25596l5 c25596l5, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo57515a(RepairV3OverviewActivity repairV3OverviewActivity);
    }

    public RepairV3OverviewActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C50907wF4 m57518j0() {
        C50907wF4 c50907wF4 = this.f64666B;
        if (c50907wF4 != null) {
            return c50907wF4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        RepairFlow repairFlow;
        super.onActivityResult(i, i2, intent);
        if ((i == 10037 || i == 10087) && i2 == -1 && intent != null && (repairFlow = (RepairFlow) intent.getParcelableExtra("repair_flow")) != null) {
            m57518j0().m7137U(repairFlow, i);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25596l5 m27948c = C25596l5.m27948c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m27948c, "inflate(layoutInflater)");
        setContentView(m27948c.getRoot());
        InterfaceC15233a.InterfaceC15234a m57517a = C15235a.m57517a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57517a.mo57516a(m21419a, this, m45197b, m27948c, mo58956x()).mo57515a(this);
        String stringExtra = getIntent().getStringExtra("bird");
        if (stringExtra != null) {
            m57518j0().m7113x(stringExtra);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57518j0().m7140R();
    }
}
