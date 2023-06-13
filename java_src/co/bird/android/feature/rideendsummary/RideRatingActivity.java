package co.bird.android.feature.rideendsummary;

import android.app.Application;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideRatingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "onBackPressed", "LQ25;", "B", "LQ25;", "j0", "()LQ25;", "setPresenter$ride_end_summary_release", "(LQ25;)V", "presenter", "LP5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LP5;", "binding", "<init>", "()V", C17296a.f69688o, "b", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideRatingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideRatingActivity.kt\nco/bird/android/feature/rideendsummary/RideRatingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,108:1\n44#2:109\n*S KotlinDebug\n*F\n+ 1 RideRatingActivity.kt\nco/bird/android/feature/rideendsummary/RideRatingActivity\n*L\n44#1:109\n*E\n"})
/* loaded from: classes3.dex */
public final class RideRatingActivity extends BaseActivity {

    /* renamed from: B */
    public Q25 f64688B;

    /* renamed from: C */
    public C6237P5 f64689C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideRatingActivity$a;", "", "Lco/bird/android/feature/rideendsummary/RideRatingActivity;", "activity", "", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15251b.class})
    /* renamed from: co.bird.android.feature.rideendsummary.RideRatingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15249a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideRatingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LP5;", "binding", "LEO4;", "reviewManager", "Lco/bird/android/feature/rideendsummary/RideRatingActivity$a;", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.rideendsummary.RideRatingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15250a {
            /* renamed from: a */
            InterfaceC15249a mo57468a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C6237P5 c6237p5, @BindsInstance EO4 eo4);
        }

        /* renamed from: a */
        void mo57467a(RideRatingActivity rideRatingActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideRatingActivity$b;", "", "Lo35;", "impl", "Li35;", "b", "Lg35;", "LQ25;", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.rideendsummary.RideRatingActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15251b {
        @Binds
        /* renamed from: a */
        Q25 m57488a(C41307g35 c41307g35);

        @Binds
        /* renamed from: b */
        InterfaceC42493i35 m57487b(C46051o35 c46051o35);
    }

    public RideRatingActivity() {
        super(false, null, null, 7, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View currentFocus = getCurrentFocus();
            C6237P5 c6237p5 = this.f64689C;
            C6237P5 c6237p52 = null;
            if (c6237p5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6237p5 = null;
            }
            if (c6237p5.f27857c.isFocused()) {
                Rect rect = new Rect();
                C6237P5 c6237p53 = this.f64689C;
                if (c6237p53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6237p53 = null;
                }
                c6237p53.f27857c.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    C6237P5 c6237p54 = this.f64689C;
                    if (c6237p54 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        c6237p52 = c6237p54;
                    }
                    c6237p52.f27857c.clearFocus();
                    Intrinsics.checkNotNull(currentFocus);
                    Object systemService = currentFocus.getContext().getSystemService("input_method");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: j0 */
    public final Q25 m57489j0() {
        Q25 q25 = this.f64688B;
        if (q25 != null) {
            return q25;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m57489j0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m57489j0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C6237P5 c6237p5;
        super.onCreate(bundle);
        C6237P5 m90875c = C6237P5.m90875c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m90875c, "inflate(layoutInflater)");
        this.f64689C = m90875c;
        if (m90875c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m90875c = null;
        }
        setContentView(m90875c.getRoot());
        setTheme(C50021ul4.Theme_MaterialComponents_Light_Bridge);
        InterfaceC15249a.InterfaceC15250a m57469a = C15265c.m57469a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C6237P5 c6237p52 = this.f64689C;
        if (c6237p52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6237p5 = null;
        } else {
            c6237p5 = c6237p52;
        }
        EO4 m107260a = FO4.m107260a(this);
        Intrinsics.checkNotNullExpressionValue(m107260a, "create(this)");
        m57469a.mo57468a(m21419a, this, m45197b, c6237p5, m107260a).mo57467a(this);
        Q25 m57489j0 = m57489j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m57489j0.mo40222b(intent);
    }
}
