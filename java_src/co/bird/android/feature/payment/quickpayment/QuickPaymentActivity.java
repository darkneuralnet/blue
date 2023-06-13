package co.bird.android.feature.payment.quickpayment;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.OnboardingQuickPaymentStyle;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lae4;", "B", "Lae4;", "j0", "()Lae4;", "setPresenter", "(Lae4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuickPaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickPaymentActivity.kt\nco/bird/android/feature/payment/quickpayment/QuickPaymentActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,93:1\n44#2:94\n*S KotlinDebug\n*F\n+ 1 QuickPaymentActivity.kt\nco/bird/android/feature/payment/quickpayment/QuickPaymentActivity\n*L\n40#1:94\n*E\n"})
/* loaded from: classes3.dex */
public final class QuickPaymentActivity extends BaseActivity {

    /* renamed from: B */
    public C38075ae4 f64468B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$a;", "", "Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C15116b.class})
    /* renamed from: co.bird.android.feature.payment.quickpayment.QuickPaymentActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15114a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;", "module", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "La5;", "binding", "Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$a;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.payment.quickpayment.QuickPaymentActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15115a {
            /* renamed from: a */
            InterfaceC15114a mo57694a(InterfaceC44393lG2 interfaceC44393lG2, C15116b c15116b, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C10566a5 c10566a5);
        }

        /* renamed from: a */
        void mo57693a(QuickPaymentActivity quickPaymentActivity);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"Lco/bird/android/feature/payment/quickpayment/QuickPaymentActivity$b;", "", "Lde4;", "v1Impl", "Lfe4;", "v2Impl", "Lce4;", C17296a.f69688o, "Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;", "Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;", "quickPaymentVersion", "<init>", "(Lco/bird/android/model/constant/OnboardingQuickPaymentStyle;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.payment.quickpayment.QuickPaymentActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15116b {

        /* renamed from: a */
        public final OnboardingQuickPaymentStyle f64469a;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.payment.quickpayment.QuickPaymentActivity$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C15117a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OnboardingQuickPaymentStyle.values().length];
                try {
                    iArr[OnboardingQuickPaymentStyle.V2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C15116b(OnboardingQuickPaymentStyle onboardingQuickPaymentStyle) {
            this.f64469a = onboardingQuickPaymentStyle;
        }

        @Provides
        /* renamed from: a */
        public final InterfaceC39261ce4 m57696a(C39872de4 v1Impl, C41057fe4 v2Impl) {
            int i;
            Intrinsics.checkNotNullParameter(v1Impl, "v1Impl");
            Intrinsics.checkNotNullParameter(v2Impl, "v2Impl");
            OnboardingQuickPaymentStyle onboardingQuickPaymentStyle = this.f64469a;
            if (onboardingQuickPaymentStyle == null) {
                i = -1;
            } else {
                i = C15117a.$EnumSwitchMapping$0[onboardingQuickPaymentStyle.ordinal()];
            }
            if (i == 1) {
                return v2Impl;
            }
            return v1Impl;
        }
    }

    public QuickPaymentActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C38075ae4 m57697j0() {
        C38075ae4 c38075ae4 = this.f64468B;
        if (c38075ae4 != null) {
            return c38075ae4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m57697j0().m70975F(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10566a5 m71923c = C10566a5.m71923c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m71923c, "inflate(layoutInflater)");
        OnboardingQuickPaymentStyle onboardingQuickPaymentStyle = mo58955y().m82623f8().m73665a().getPaymentConfig().getOnboardingQuickPaymentStyle();
        if (onboardingQuickPaymentStyle == OnboardingQuickPaymentStyle.V2) {
            setContentView(C31932Bj4.activity_quick_payment_v2);
        } else {
            setContentView(m71923c.getRoot());
        }
        InterfaceC15114a.InterfaceC15115a m57695a = C15118a.m57695a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C15116b c15116b = new C15116b(onboardingQuickPaymentStyle);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57695a.mo57694a(m21419a, c15116b, this, m45197b, m71923c).mo57693a(this);
        m57697j0().m70971J();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57697j0().m70968M();
    }
}
