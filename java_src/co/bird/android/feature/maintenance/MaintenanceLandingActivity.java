package co.bird.android.feature.maintenance;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/maintenance/MaintenanceLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LjH2;", "B", "LjH2;", "getMaintenanceUi", "()LjH2;", "setMaintenanceUi", "(LjH2;)V", "maintenanceUi", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMaintenanceLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaintenanceLandingActivity.kt\nco/bird/android/feature/maintenance/MaintenanceLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n44#2:61\n1855#3,2:62\n*S KotlinDebug\n*F\n+ 1 MaintenanceLandingActivity.kt\nco/bird/android/feature/maintenance/MaintenanceLandingActivity\n*L\n31#1:61\n39#1:62,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MaintenanceLandingActivity extends BaseActivity {

    /* renamed from: B */
    public C43216jH2 f64147B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/maintenance/MaintenanceLandingActivity$a;", "", "Lco/bird/android/feature/maintenance/MaintenanceLandingActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.maintenance.MaintenanceLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14944a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/maintenance/MaintenanceLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lk4;", "binding", "Lco/bird/android/feature/maintenance/MaintenanceLandingActivity$a;", C17296a.f69688o, "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.maintenance.MaintenanceLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14945a {
            /* renamed from: a */
            InterfaceC14944a mo57992a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C25093k4 c25093k4);
        }

        /* renamed from: a */
        void mo57991a(MaintenanceLandingActivity maintenanceLandingActivity);
    }

    public MaintenanceLandingActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25093k4 m29383c = C25093k4.m29383c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m29383c, "inflate(layoutInflater)");
        setContentView(m29383c.getRoot());
        setTitle(C45871nl4.operator_maintenance_title);
        InterfaceC14944a.InterfaceC14945a m57993a = C14946a.m57993a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57993a.mo57992a(m21419a, this, m45197b, m29383c).mo57991a(this);
    }
}
