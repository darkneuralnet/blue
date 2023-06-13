package co.bird.android.feature.healthcheck;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/healthcheck/HealthCheckActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LjI1;", "B", "LjI1;", "j0", "()LjI1;", "setPresenter", "(LjI1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthCheckActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckActivity.kt\nco/bird/android/feature/healthcheck/HealthCheckActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,73:1\n44#2:74\n*S KotlinDebug\n*F\n+ 1 HealthCheckActivity.kt\nco/bird/android/feature/healthcheck/HealthCheckActivity\n*L\n34#1:74\n*E\n"})
/* loaded from: classes3.dex */
public final class HealthCheckActivity extends BaseActivity {

    /* renamed from: B */
    public C43224jI1 f64080B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/healthcheck/HealthCheckActivity$a;", "", "Lco/bird/android/feature/healthcheck/HealthCheckActivity;", "activity", "", C17296a.f69688o, "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.healthcheck.HealthCheckActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14884a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/healthcheck/HealthCheckActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LJ3;", "healthCheckBinding", "Lcm6;", "converter", "Lco/bird/android/feature/healthcheck/HealthCheckActivity$a;", C17296a.f69688o, "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.healthcheck.HealthCheckActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14885a {
            /* renamed from: a */
            InterfaceC14884a mo58065a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C3874J3 c3874j3, @BindsInstance InterfaceC39343cm6 interfaceC39343cm6);
        }

        /* renamed from: a */
        void mo58064a(HealthCheckActivity healthCheckActivity);
    }

    public HealthCheckActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C43224jI1 m58067j0() {
        C43224jI1 c43224jI1 = this.f64080B;
        if (c43224jI1 != null) {
            return c43224jI1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3874J3 m101250c = C3874J3.m101250c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m101250c, "inflate(layoutInflater)");
        setContentView(m101250c.getRoot());
        InterfaceC14884a.InterfaceC14885a m58066a = C14886a.m58066a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58066a.mo58065a(m21419a, this, m45197b, m101250c, new C40546em6()).mo58064a(this);
        C43224jI1 m58067j0 = m58067j0();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        m58067j0.m30852s((WireBird) parcelableExtra);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C34983Ok4.menu_health_check_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (m58067j0().m30877G(item.getItemId())) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58067j0().m30876H();
    }
}
