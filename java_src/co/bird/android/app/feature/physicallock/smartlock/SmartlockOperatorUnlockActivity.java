package co.bird.android.app.feature.physicallock.smartlock;

import android.app.Application;
import android.os.Bundle;
import android.view.MenuItem;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;", "B", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;", "j0", "()Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;", "setPresenter", "(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V", "presenter", "<init>", "()V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockOperatorUnlockActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockOperatorUnlockActivity.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,67:1\n44#2:68\n*S KotlinDebug\n*F\n+ 1 SmartlockOperatorUnlockActivity.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity\n*L\n32#1:68\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockOperatorUnlockActivity extends BaseActivity {

    /* renamed from: B */
    public SmartlockOperatorUnlockPresenter f62175B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity$a;", "", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockActivity$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC14132a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lh6;", "binding", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockActivity$a;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockActivity$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC14133a {
            /* renamed from: a */
            InterfaceC14132a mo59705a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C22550h6 c22550h6);
        }

        /* renamed from: a */
        void mo59704a(SmartlockOperatorUnlockActivity smartlockOperatorUnlockActivity);
    }

    public SmartlockOperatorUnlockActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final SmartlockOperatorUnlockPresenter m59814j0() {
        SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter = this.f62175B;
        if (smartlockOperatorUnlockPresenter != null) {
            return smartlockOperatorUnlockPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C22550h6 m36854c = C22550h6.m36854c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m36854c, "inflate(layoutInflater)");
        setContentView(m36854c.f84703c);
        mo58977D();
        InterfaceC14132a.InterfaceC14133a m59706a = C14171a.m59706a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m59706a.mo59705a(m21419a, this, m45197b, m36854c).mo59704a(this);
        m59814j0().m59806H();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            mo58957w().mo37030e3();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
