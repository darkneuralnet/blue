package co.bird.android.feature.promotions;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/promotions/PromotionsCenterActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LI84;", "B", "LI84;", "j0", "()LI84;", "setPresenter", "(LI84;)V", "presenter", "<init>", "()V", C17296a.f69688o, "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPromotionsCenterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterActivity.kt\nco/bird/android/feature/promotions/PromotionsCenterActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,51:1\n44#2:52\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterActivity.kt\nco/bird/android/feature/promotions/PromotionsCenterActivity\n*L\n27#1:52\n*E\n"})
/* loaded from: classes3.dex */
public final class PromotionsCenterActivity extends BaseActivity {

    /* renamed from: B */
    public I84 f64509B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/promotions/PromotionsCenterActivity$a;", "", "Lco/bird/android/feature/promotions/PromotionsCenterActivity;", "activity", "", C17296a.f69688o, "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.promotions.PromotionsCenterActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15133a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/promotions/PromotionsCenterActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LT4;", "binding", "Lco/bird/android/feature/promotions/PromotionsCenterActivity$a;", C17296a.f69688o, "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.promotions.PromotionsCenterActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15134a {
            /* renamed from: a */
            InterfaceC15133a mo57673a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C7645T4 c7645t4);
        }

        /* renamed from: a */
        void mo57672a(PromotionsCenterActivity promotionsCenterActivity);
    }

    public PromotionsCenterActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final I84 m57675j0() {
        I84 i84 = this.f64509B;
        if (i84 != null) {
            return i84;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7645T4 m84383c = C7645T4.m84383c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m84383c, "inflate(layoutInflater)");
        setContentView(m84383c.getRoot());
        InterfaceC15133a.InterfaceC15134a m57674a = C15135a.m57674a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57674a.mo57673a(m21419a, this, m45197b, m84383c).mo57672a(this);
        m57675j0().m102904j();
    }
}
