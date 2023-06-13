package co.bird.android.feature.servicecenter.qualitycontrol.landing;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LEb4;", "B", "LEb4;", "j0", "()LEb4;", "setPresenter", "(LEb4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlLandingActivity.kt\nco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n44#2:89\n1#3:90\n*S KotlinDebug\n*F\n+ 1 QualityControlLandingActivity.kt\nco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity\n*L\n35#1:89\n*E\n"})
/* loaded from: classes3.dex */
public final class QualityControlLandingActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC32562Eb4 f65433B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity$a;", "", "Lco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15658b.class})
    /* renamed from: co.bird.android.feature.servicecenter.qualitycontrol.landing.QualityControlLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15656a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LDQ3;", "permissionManager", "LW4;", "binding", "Lco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.qualitycontrol.landing.QualityControlLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15657a {
            /* renamed from: a */
            InterfaceC15656a mo56784a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DQ3 dq3, @BindsInstance C8929W4 c8929w4);
        }

        /* renamed from: a */
        void mo56783a(QualityControlLandingActivity qualityControlLandingActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/qualitycontrol/landing/QualityControlLandingActivity$b;", "", "LRb4;", "impl", "LQb4;", "b", "LOb4;", "LEb4;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.qualitycontrol.landing.QualityControlLandingActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15658b {
        @Binds
        /* renamed from: a */
        InterfaceC32562Eb4 m56787a(C34902Ob4 c34902Ob4);

        @Binds
        /* renamed from: b */
        InterfaceC35370Qb4 m56786b(C35604Rb4 c35604Rb4);
    }

    public QualityControlLandingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC32562Eb4 m56788j0() {
        InterfaceC32562Eb4 interfaceC32562Eb4 = this.f65433B;
        if (interfaceC32562Eb4 != null) {
            return interfaceC32562Eb4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        super.onActivityResult(i, i2, intent);
        if ((i == 10000 || i == 10001 || i == 10003) && i2 == -1 && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("bird")) != null) {
            m56788j0().mo91887c(wireBird);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8929W4 m78873c = C8929W4.m78873c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m78873c, "inflate(layoutInflater)");
        setContentView(m78873c.getRoot());
        InterfaceC15656a.InterfaceC15657a m56785a = C15659a.m56785a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56785a.mo56784a(m21419a, this, m45197b, mo58956x(), m78873c).mo56783a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56788j0().onResume();
    }
}
