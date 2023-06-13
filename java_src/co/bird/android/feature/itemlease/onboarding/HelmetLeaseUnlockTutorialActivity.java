package co.bird.android.feature.itemlease.onboarding;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LRK1;", "B", "LRK1;", "j0", "()LRK1;", "setPresenter", "(LRK1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseUnlockTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialActivity.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,82:1\n44#2:83\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseUnlockTutorialActivity.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity\n*L\n32#1:83\n*E\n"})
/* loaded from: classes3.dex */
public final class HelmetLeaseUnlockTutorialActivity extends BaseActivity {

    /* renamed from: B */
    public RK1 f64110B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a;", "", "Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14918b.class})
    /* renamed from: co.bird.android.feature.itemlease.onboarding.HelmetLeaseUnlockTutorialActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14916a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LN3;", "binding", "Lco/bird/android/model/wire/WireBird;", "bird", "LDQ3;", "permissionManager", "Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a;", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.itemlease.onboarding.HelmetLeaseUnlockTutorialActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14917a {
            /* renamed from: a */
            InterfaceC14916a mo58023a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C5470N3 c5470n3, @BindsInstance WireBird wireBird, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo58022a(HelmetLeaseUnlockTutorialActivity helmetLeaseUnlockTutorialActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$b;", "", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.itemlease.onboarding.HelmetLeaseUnlockTutorialActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14918b {
    }

    public HelmetLeaseUnlockTutorialActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final RK1 m58031j0() {
        RK1 rk1 = this.f64110B;
        if (rk1 != null) {
            return rk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m58031j0().m86927a0(i, i2, intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m58031j0().m86925b0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5470N3 m94408c = C5470N3.m94408c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m94408c, "inflate(layoutInflater)");
        setContentView(m94408c.getRoot());
        InterfaceC14916a.InterfaceC14917a m58024a = C14922b.m58024a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58024a.mo58023a(m21419a, this, m45197b, m94408c, (WireBird) getIntent().getParcelableExtra("bird"), mo58956x()).mo58022a(this);
        m58031j0().m86917f0();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58031j0().m86915g0();
    }
}
