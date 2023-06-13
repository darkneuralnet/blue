package co.bird.android.app.feature.flightsheet;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.FlightSheetContext;
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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/flightsheet/FlightSheetActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LIs1;", "B", "LIs1;", "j0", "()LIs1;", "setPresenter", "(LIs1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetActivity.kt\nco/bird/android/app/feature/flightsheet/FlightSheetActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,90:1\n44#2:91\n*S KotlinDebug\n*F\n+ 1 FlightSheetActivity.kt\nco/bird/android/app/feature/flightsheet/FlightSheetActivity\n*L\n38#1:91\n*E\n"})
/* loaded from: classes2.dex */
public final class FlightSheetActivity extends BaseActivity {

    /* renamed from: B */
    public C33648Is1 f61441B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a;", "", "Lco/bird/android/app/feature/flightsheet/FlightSheetActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C13738b.class})
    /* renamed from: co.bird.android.app.feature.flightsheet.FlightSheetActivity$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC13735a {

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J@\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$b;", "flightSheetModule", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "repairFlow", "Lco/bird/android/model/constant/FlightSheetContext;", "flightSheetContext", "Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$a;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Factory
        /* renamed from: co.bird.android.app.feature.flightsheet.FlightSheetActivity$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13736a {

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.app.feature.flightsheet.FlightSheetActivity$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C13737a {
                public static /* synthetic */ InterfaceC13735a create$default(InterfaceC13736a interfaceC13736a, InterfaceC44393lG2 interfaceC44393lG2, C13738b c13738b, BaseActivity baseActivity, ScopeProvider scopeProvider, boolean z, FlightSheetContext flightSheetContext, int i, Object obj) {
                    if (obj == null) {
                        if ((i & 16) != 0) {
                            z = false;
                        }
                        boolean z2 = z;
                        if ((i & 32) != 0) {
                            flightSheetContext = FlightSheetContext.STANDARD;
                        }
                        return interfaceC13736a.mo60659a(interfaceC44393lG2, c13738b, baseActivity, scopeProvider, z2, flightSheetContext);
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
            }

            /* renamed from: a */
            InterfaceC13735a mo60659a(InterfaceC44393lG2 interfaceC44393lG2, C13738b c13738b, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance boolean z, @BindsInstance FlightSheetContext flightSheetContext);
        }

        /* renamed from: a */
        void mo60658a(FlightSheetActivity flightSheetActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$b;", "", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "<init>", "(LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC13739a.class})
    /* renamed from: co.bird.android.app.feature.flightsheet.FlightSheetActivity$b */
    /* loaded from: classes2.dex */
    public static final class C13738b {

        /* renamed from: a */
        public final C36207Tq4 f61442a;

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/flightsheet/FlightSheetActivity$b$a;", "", "LAo0;", "impl", "Luo0;", C17296a.f69688o, "LVs1;", "flightSheetUi", "Llp0;", "c", "LWs1;", DateTokenConverter.CONVERTER_KEY, "LQt1;", "v2", "LAs1;", "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.app.feature.flightsheet.FlightSheetActivity$b$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13739a {
            @Binds
            /* renamed from: a */
            InterfaceC50047uo0 m60664a(C31739Ao0 c31739Ao0);

            @Binds
            /* renamed from: b */
            InterfaceC31776As1 m60663b(C35529Qt1 c35529Qt1);

            @Binds
            /* renamed from: c */
            InterfaceC44721lp0 m60662c(C36690Vs1 c36690Vs1);

            @Binds
            /* renamed from: d */
            InterfaceC36924Ws1 m60661d(C36690Vs1 c36690Vs1);
        }

        public C13738b(C36207Tq4 reactiveConfig) {
            Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
            this.f61442a = reactiveConfig;
        }
    }

    public FlightSheetActivity() {
        super(false, null, Boolean.TRUE, 3, null);
    }

    /* renamed from: j0 */
    public final C33648Is1 m60665j0() {
        C33648Is1 c33648Is1 = this.f61441B;
        if (c33648Is1 != null) {
            return c33648Is1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C37548Zj4.activity_flight_sheet);
        mo58977D();
        InterfaceC13735a.InterfaceC13736a m60660a = C13740a.m60660a();
        Intrinsics.checkNotNullExpressionValue(m60660a, "factory()");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C13738b c13738b = new C13738b(mo58955y());
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC13735a.InterfaceC13736a.C13737a.create$default(m60660a, m21419a, c13738b, this, m45197b, false, null, 48, null).mo60658a(this);
        C33648Is1 m60665j0 = m60665j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m60665j0.m101578a(intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m60665j0().m101577b();
    }
}
