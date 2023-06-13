package co.bird.android.feature.ownedbirds;

import android.app.Application;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lf64;", "B", "Lf64;", "j0", "()Lf64;", "setPresenter", "(Lf64;)V", "presenter", "<init>", "()V", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdsOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewActivity.kt\nco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,59:1\n44#2:60\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewActivity.kt\nco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity\n*L\n29#1:60\n*E\n"})
/* loaded from: classes3.dex */
public final class PrivateBirdsOverviewActivity extends BaseActivity {

    /* renamed from: B */
    public C40743f64 f64337B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a;", "", "Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity;", "activity", "", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.ownedbirds.PrivateBirdsOverviewActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15059a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LR4;", "binding", "LDQ3;", "permissionManager", "Lco/bird/android/feature/ownedbirds/PrivateBirdsOverviewActivity$a;", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ownedbirds.PrivateBirdsOverviewActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15060a {
            /* renamed from: a */
            InterfaceC15059a mo57796a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C7060R4 c7060r4, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo57795a(PrivateBirdsOverviewActivity privateBirdsOverviewActivity);
    }

    public PrivateBirdsOverviewActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C40743f64 m57823j0() {
        C40743f64 c40743f64 = this.f64337B;
        if (c40743f64 != null) {
            return c40743f64;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7060R4 m87358c = C7060R4.m87358c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m87358c, "inflate(layoutInflater)");
        setContentView(m87358c.getRoot());
        InterfaceC15059a.InterfaceC15060a m57797a = C15081c.m57797a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57797a.mo57796a(m21419a, this, m45197b, m87358c, mo58956x()).mo57795a(this);
        m57823j0().m42084D();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57823j0().m42083E();
    }
}
