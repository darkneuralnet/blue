package co.bird.android.feature.rideendsummary;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
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
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideFeedbackActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LiR4;", "B", "LiR4;", "j0", "()LiR4;", "setPresenter", "(LiR4;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideFeedbackActivity.kt\nco/bird/android/feature/rideendsummary/RideFeedbackActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,94:1\n44#2:95\n*S KotlinDebug\n*F\n+ 1 RideFeedbackActivity.kt\nco/bird/android/feature/rideendsummary/RideFeedbackActivity\n*L\n40#1:95\n*E\n"})
/* loaded from: classes3.dex */
public final class RideFeedbackActivity extends BaseActivity {

    /* renamed from: C */
    public static final C15245a f64686C = new C15245a(null);

    /* renamed from: B */
    public InterfaceC42715iR4 f64687B;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideFeedbackActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireRide;", "ride", "", "rating", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rideendsummary.RideFeedbackActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15245a {
        public /* synthetic */ C15245a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m57492a(Context context, WireRide ride, float f) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(ride, "ride");
            Intent intent = new Intent(context, RideFeedbackActivity.class);
            intent.putExtra("ride", ride);
            intent.putExtra("rating", f);
            return intent;
        }

        private C15245a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideFeedbackActivity$b;", "", "Lco/bird/android/feature/rideendsummary/RideFeedbackActivity;", "activity", "", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15248c.class})
    /* renamed from: co.bird.android.feature.rideendsummary.RideFeedbackActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15246b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideFeedbackActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LH5;", "binding", "LEO4;", "reviewManager", "Lco/bird/android/feature/rideendsummary/RideFeedbackActivity$b;", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.rideendsummary.RideFeedbackActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15247a {
            /* renamed from: a */
            InterfaceC15246b mo57477a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C3022H5 c3022h5, @BindsInstance EO4 eo4);
        }

        /* renamed from: a */
        void mo57476a(RideFeedbackActivity rideFeedbackActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideFeedbackActivity$c;", "", "LrR4;", "impl", "LnR4;", C17296a.f69688o, "LlR4;", "LiR4;", "b", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.rideendsummary.RideFeedbackActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC15248c {
        @Binds
        /* renamed from: a */
        InterfaceC45680nR4 m57491a(C48052rR4 c48052rR4);

        @Binds
        /* renamed from: b */
        InterfaceC42715iR4 m57490b(C44494lR4 c44494lR4);
    }

    public RideFeedbackActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC42715iR4 m57493j0() {
        InterfaceC42715iR4 interfaceC42715iR4 = this.f64687B;
        if (interfaceC42715iR4 != null) {
            return interfaceC42715iR4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m57493j0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3022H5 m104439c = C3022H5.m104439c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m104439c, "inflate(layoutInflater)");
        setContentView(m104439c.getRoot());
        InterfaceC15246b.InterfaceC15247a m57478a = C15258b.m57478a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        EO4 m107260a = FO4.m107260a(this);
        Intrinsics.checkNotNullExpressionValue(m107260a, "create(this)");
        m57478a.mo57477a(m21419a, this, m45197b, m104439c, m107260a).mo57476a(this);
        InterfaceC42715iR4 m57493j0 = m57493j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m57493j0.mo27290b(intent);
    }
}
