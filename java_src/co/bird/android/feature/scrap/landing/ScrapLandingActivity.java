package co.bird.android.feature.scrap.landing;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LQn5;", "B", "LQn5;", "j0", "()LQn5;", "setPresenter", "(LQn5;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapLandingActivity.kt\nco/bird/android/feature/scrap/landing/ScrapLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n44#2:104\n1#3:105\n*S KotlinDebug\n*F\n+ 1 ScrapLandingActivity.kt\nco/bird/android/feature/scrap/landing/ScrapLandingActivity\n*L\n40#1:104\n*E\n"})
/* loaded from: classes3.dex */
public final class ScrapLandingActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC35479Qn5 f65203B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/scrap/landing/ScrapLandingActivity$a;", "", "Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15528b.class})
    /* renamed from: co.bird.android.feature.scrap.landing.ScrapLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15526a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JV\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/scrap/landing/ScrapLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LDQ3;", "permissionManager", "Landroid/widget/Button;", "scan", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", "blockingOverlay", "Lco/bird/android/feature/scrap/landing/ScrapLandingActivity$a;", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.scrap.landing.ScrapLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15527a {
            /* renamed from: a */
            InterfaceC15526a mo56969a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DQ3 dq3, @BindsInstance Button button, @BindsInstance Button button2, @BindsInstance OperatorInfoCard operatorInfoCard, @BindsInstance BlockingEnterLocationView blockingEnterLocationView);
        }

        /* renamed from: a */
        void mo56968a(ScrapLandingActivity scrapLandingActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/scrap/landing/ScrapLandingActivity$b;", "", "Ldo5;", "impl", "Lco5;", "b", "LZn5;", "LQn5;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.scrap.landing.ScrapLandingActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15528b {

        /* renamed from: a */
        public static final C15529a f65204a = new C15529a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/scrap/landing/ScrapLandingActivity$b$a;", "", "", "CODE", "Ljava/lang/String;", "SCAN", "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.scrap.landing.ScrapLandingActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15529a {
            public /* synthetic */ C15529a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C15529a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC35479Qn5 m56972a(C37585Zn5 c37585Zn5);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC39362co5 m56971b(C39972do5 c39972do5);
    }

    public ScrapLandingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC35479Qn5 m56973j0() {
        InterfaceC35479Qn5 interfaceC35479Qn5 = this.f65203B;
        if (interfaceC35479Qn5 != null) {
            return interfaceC35479Qn5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        super.onActivityResult(i, i2, intent);
        if ((i == 10001 || i == 10003) && i2 == -1 && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("bird")) != null) {
            m56973j0().mo72513c(wireBird);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C34272Lj4.activity_scrap_landing);
        InterfaceC15526a.InterfaceC15527a m56970a = C15530a.m56970a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        DQ3 mo58956x = mo58956x();
        View findViewById = findViewById(C37296Yh4.scanButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.scanButton)");
        Button button = (Button) findViewById;
        View findViewById2 = findViewById(C37296Yh4.enterCodeButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.enterCodeButton)");
        Button button2 = (Button) findViewById2;
        View findViewById3 = findViewById(C37296Yh4.operatorInfoCard);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.operatorInfoCard)");
        OperatorInfoCard operatorInfoCard = (OperatorInfoCard) findViewById3;
        View findViewById4 = findViewById(C37296Yh4.blockEnterLocationOverlay);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.blockEnterLocationOverlay)");
        m56970a.mo56969a(m21419a, this, m45197b, mo58956x, button, button2, operatorInfoCard, (BlockingEnterLocationView) findViewById4).mo56968a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56973j0().onResume();
    }
}
