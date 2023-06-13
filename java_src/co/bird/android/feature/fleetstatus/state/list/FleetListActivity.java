package co.bird.android.feature.fleetstatus.state.list;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.FlightSheetContext;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LOo1;", "B", "LOo1;", "j0", "()LOo1;", "setPresenter", "(LOo1;)V", "presenter", "Lnm6;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lnm6;", "k0", "()Lnm6;", "setVehicleListPresenter", "(Lnm6;)V", "vehicleListPresenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListActivity.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,110:1\n44#2:111\n*S KotlinDebug\n*F\n+ 1 FleetListActivity.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListActivity\n*L\n41#1:111\n*E\n"})
/* loaded from: classes3.dex */
public final class FleetListActivity extends BaseActivity {

    /* renamed from: B */
    public C35016Oo1 f63974B;

    /* renamed from: C */
    public C45883nm6 f63975C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a;", "", "Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C14821b.class})
    /* renamed from: co.bird.android.feature.fleetstatus.state.list.FleetListActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14818a {

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JJ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$b;", "fleetListActivityModule", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LC3;", "binding", "", "repairFlow", "Lco/bird/android/model/constant/FlightSheetContext;", "flightSheetContext", "Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$a;", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Factory
        /* renamed from: co.bird.android.feature.fleetstatus.state.list.FleetListActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14819a {

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.feature.fleetstatus.state.list.FleetListActivity$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C14820a {
                public static /* synthetic */ InterfaceC14818a create$default(InterfaceC14819a interfaceC14819a, InterfaceC44393lG2 interfaceC44393lG2, C14821b c14821b, BaseActivity baseActivity, ScopeProvider scopeProvider, C0846C3 c0846c3, boolean z, FlightSheetContext flightSheetContext, int i, Object obj) {
                    boolean z2;
                    FlightSheetContext flightSheetContext2;
                    if (obj == null) {
                        if ((i & 32) != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i & 64) != 0) {
                            flightSheetContext2 = FlightSheetContext.STANDARD;
                        } else {
                            flightSheetContext2 = flightSheetContext;
                        }
                        return interfaceC14819a.mo58177a(interfaceC44393lG2, c14821b, baseActivity, scopeProvider, c0846c3, z2, flightSheetContext2);
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
            }

            /* renamed from: a */
            InterfaceC14818a mo58177a(InterfaceC44393lG2 interfaceC44393lG2, C14821b c14821b, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C0846C3 c0846c3, @BindsInstance boolean z, @BindsInstance FlightSheetContext flightSheetContext);
        }

        /* renamed from: a */
        void mo58176a(FleetListActivity fleetListActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$b;", "", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "<init>", "(LTq4;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC14822a.class})
    /* renamed from: co.bird.android.feature.fleetstatus.state.list.FleetListActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14821b {

        /* renamed from: a */
        public final C36207Tq4 f63976a;

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/state/list/FleetListActivity$b$a;", "", "Lcp1;", "ui", "LWs1;", DateTokenConverter.CONVERTER_KEY, "Llp0;", "c", "LAo0;", "impl", "Luo0;", C17296a.f69688o, "LQt1;", "v2", "LAs1;", "b", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.feature.fleetstatus.state.list.FleetListActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14822a {
            @Binds
            /* renamed from: a */
            InterfaceC50047uo0 m58182a(C31739Ao0 c31739Ao0);

            @Binds
            /* renamed from: b */
            InterfaceC31776As1 m58181b(C35529Qt1 c35529Qt1);

            @Binds
            /* renamed from: c */
            InterfaceC44721lp0 m58180c(C39386cp1 c39386cp1);

            @Binds
            /* renamed from: d */
            InterfaceC36924Ws1 m58179d(C39386cp1 c39386cp1);
        }

        public C14821b(C36207Tq4 reactiveConfig) {
            Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
            this.f63976a = reactiveConfig;
        }
    }

    public FleetListActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C35016Oo1 m58184j0() {
        C35016Oo1 c35016Oo1 = this.f63974B;
        if (c35016Oo1 != null) {
            return c35016Oo1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public final C45883nm6 m58183k0() {
        C45883nm6 c45883nm6 = this.f63975C;
        if (c45883nm6 != null) {
            return c45883nm6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicleListPresenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Unit unit;
        String stringExtra;
        super.onCreate(bundle);
        C0846C3 m112944c = C0846C3.m112944c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m112944c, "inflate(layoutInflater)");
        setContentView(m112944c.getRoot());
        InterfaceC14818a.InterfaceC14819a m58178a = C14823a.m58178a();
        Intrinsics.checkNotNullExpressionValue(m58178a, "factory()");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C14821b c14821b = new C14821b(mo58955y());
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC14818a.InterfaceC14819a.C14820a.create$default(m58178a, m21419a, c14821b, this, m45197b, m112944c, false, null, 96, null).mo58176a(this);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("bird_ids");
        if (stringArrayListExtra != null) {
            m58183k0().m23166l(stringArrayListExtra);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || (stringExtra = getIntent().getStringExtra("fleet_id")) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(Extras.FLEET_ID) ?: return");
        String stringExtra2 = getIntent().getStringExtra("fleet_list");
        if (stringExtra2 == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra2, "intent.getStringExtra(Extras.FLEET_LIST) ?: return");
        m58184j0().m91370r(stringExtra, stringExtra2);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Unit unit;
        String stringExtra;
        super.onResume();
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("bird_ids");
        if (stringArrayListExtra != null) {
            m58183k0().m23164n(stringArrayListExtra);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || (stringExtra = getIntent().getStringExtra("fleet_id")) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(Extras.FLEET_ID) ?: return");
        String stringExtra2 = getIntent().getStringExtra("fleet_list");
        if (stringExtra2 == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra2, "intent.getStringExtra(Extras.FLEET_LIST) ?: return");
        m58184j0().m91369s(stringExtra, stringExtra2);
    }
}
