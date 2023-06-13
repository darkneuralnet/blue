package co.bird.android.feature.hardcount.landing;

import android.app.Application;
import android.os.Bundle;
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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/hardcount/landing/HardCountLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LGF1;", "B", "LGF1;", "j0", "()LGF1;", "setPresenter", "(LGF1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountLandingActivity.kt\nco/bird/android/feature/hardcount/landing/HardCountLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,73:1\n44#2:74\n*S KotlinDebug\n*F\n+ 1 HardCountLandingActivity.kt\nco/bird/android/feature/hardcount/landing/HardCountLandingActivity\n*L\n31#1:74\n*E\n"})
/* loaded from: classes3.dex */
public final class HardCountLandingActivity extends BaseActivity {

    /* renamed from: B */
    public GF1 f64073B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/hardcount/landing/HardCountLandingActivity$a;", "", "Lco/bird/android/feature/hardcount/landing/HardCountLandingActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14880b.class})
    /* renamed from: co.bird.android.feature.hardcount.landing.HardCountLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14878a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/hardcount/landing/HardCountLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LI3;", "binding", "Lco/bird/android/feature/hardcount/landing/HardCountLandingActivity$a;", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.hardcount.landing.HardCountLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14879a {
            /* renamed from: a */
            InterfaceC14878a mo58073a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance DQ3 dq3, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C3318I3 c3318i3);
        }

        /* renamed from: a */
        void mo58072a(HardCountLandingActivity hardCountLandingActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/hardcount/landing/HardCountLandingActivity$b;", "", "LVF1;", "impl", "LUF1;", "b", "LTF1;", "LGF1;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.hardcount.landing.HardCountLandingActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14880b {
        @Binds
        /* renamed from: a */
        public abstract GF1 m58076a(TF1 tf1);

        @Binds
        /* renamed from: b */
        public abstract UF1 m58075b(VF1 vf1);
    }

    public HardCountLandingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final GF1 m58077j0() {
        GF1 gf1 = this.f64073B;
        if (gf1 != null) {
            return gf1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3318I3 m103036c = C3318I3.m103036c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m103036c, "inflate(layoutInflater)");
        setContentView(m103036c.getRoot());
        InterfaceC14878a.InterfaceC14879a m58074a = C14881a.m58074a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58074a.mo58073a(m21419a, this, mo58956x(), m45197b, m103036c).mo58072a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58077j0().onResume();
    }
}
