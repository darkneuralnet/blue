package co.bird.android.feature.servicecenter.status.bulk.landing;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC36038Sx6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lgu5;", "B", "Lgu5;", "j0", "()Lgu5;", "setPresenter", "(Lgu5;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressLandingActivity.kt\nco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,77:1\n44#2:78\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressLandingActivity.kt\nco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity\n*L\n35#1:78\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkServiceProgressLandingActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC41811gu5 f65519B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity$a;", "", "Lco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15703b.class})
    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15701a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "La6;", "binding", "LDQ3;", "permissionManager", "Lco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15702a {
            /* renamed from: a */
            InterfaceC15701a mo56717a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C10570a6 c10570a6, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo56724a(BulkServiceProgressLandingActivity bulkServiceProgressLandingActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingActivity$b;", "", "Lnu5;", "impl", "Lmu5;", C17296a.f69688o, "La50;", "Lgu5;", "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15703b {
        @Binds
        /* renamed from: a */
        InterfaceC45369mu5 m56727a(C45962nu5 c45962nu5);

        @Binds
        /* renamed from: b */
        InterfaceC41811gu5 m56726b(C37747a50 c37747a50);
    }

    public BulkServiceProgressLandingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC41811gu5 m56728j0() {
        InterfaceC41811gu5 interfaceC41811gu5 = this.f65519B;
        if (interfaceC41811gu5 != null) {
            return interfaceC41811gu5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10570a6 m71902c = C10570a6.m71902c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m71902c, "inflate(layoutInflater)");
        setContentView(m71902c.getRoot());
        InterfaceC15701a.InterfaceC15702a m56725a = C15704a.m56725a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56725a.mo56717a(m21419a, this, m45197b, m71902c, mo58956x()).mo56724a(this);
        m56728j0().mo28196a();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC36038Sx6.C7617a.checkWarehouseInfo$default(m56728j0(), null, 1, null);
    }
}
