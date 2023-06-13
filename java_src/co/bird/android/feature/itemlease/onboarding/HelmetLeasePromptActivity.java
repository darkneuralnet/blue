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
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LTI1;", "B", "LTI1;", "j0", "()LTI1;", "setPresenter", "(LTI1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeasePromptActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeasePromptActivity.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,74:1\n44#2:75\n*S KotlinDebug\n*F\n+ 1 HelmetLeasePromptActivity.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity\n*L\n31#1:75\n*E\n"})
/* loaded from: classes3.dex */
public final class HelmetLeasePromptActivity extends BaseActivity {

    /* renamed from: B */
    public TI1 f64109B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity$a;", "", "Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14915b.class})
    /* renamed from: co.bird.android.feature.itemlease.onboarding.HelmetLeasePromptActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14913a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J:\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LK3;", "binding", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity$a;", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.itemlease.onboarding.HelmetLeasePromptActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14914a {
            /* renamed from: a */
            InterfaceC14913a mo58029a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C4315K3 c4315k3, @BindsInstance WireBird wireBird);
        }

        /* renamed from: a */
        void mo58028a(HelmetLeasePromptActivity helmetLeasePromptActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity$b;", "", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.itemlease.onboarding.HelmetLeasePromptActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14915b {
    }

    public HelmetLeasePromptActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final TI1 m58032j0() {
        TI1 ti1 = this.f64109B;
        if (ti1 != null) {
            return ti1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m58032j0().m83937l(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4315K3 m99309c = C4315K3.m99309c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m99309c, "inflate(layoutInflater)");
        setContentView(m99309c.getRoot());
        InterfaceC14913a.InterfaceC14914a m58030a = C14919a.m58030a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58030a.mo58029a(m21419a, this, m45197b, m99309c, (WireBird) getIntent().getParcelableExtra("bird")).mo58028a(this);
        m58032j0().m83936m();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58032j0().m83935n();
    }
}
