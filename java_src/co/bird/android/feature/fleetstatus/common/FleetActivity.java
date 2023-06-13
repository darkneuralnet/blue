package co.bird.android.feature.fleetstatus.common;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/common/FleetActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lpp1;", "B", "Lpp1;", "m0", "()Lpp1;", "setPresenter", "(Lpp1;)V", "presenter", "Lkp1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkp1;", "k0", "()Lkp1;", "setFleetNavigator", "(Lkp1;)V", "fleetNavigator", "Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;", "D", "Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;", "j0", "()Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;", "n0", "(Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;)V", "component", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetActivity.kt\nco/bird/android/feature/fleetstatus/common/FleetActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,76:1\n44#2:77\n*S KotlinDebug\n*F\n+ 1 FleetActivity.kt\nco/bird/android/feature/fleetstatus/common/FleetActivity\n*L\n35#1:77\n*E\n"})
/* loaded from: classes3.dex */
public final class FleetActivity extends BaseActivity {

    /* renamed from: B */
    public C47094pp1 f63923B;

    /* renamed from: C */
    public C44129kp1 f63924C;

    /* renamed from: D */
    public InterfaceC14793a f63925D;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;", "", "Lco/bird/android/feature/fleetstatus/common/FleetActivity;", "activity", "", "b", "Lkp1;", C17296a.f69688o, "()Lkp1;", "fleetNavigator", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.fleetstatus.common.FleetActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14793a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/common/FleetActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LxE;", "ui", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.fleetstatus.common.FleetActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14794a {
            /* renamed from: a */
            InterfaceC14793a mo58220a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance AbstractC30071xE abstractC30071xE, @BindsInstance FragmentManager fragmentManager, @BindsInstance int i);
        }

        /* renamed from: a */
        C44129kp1 mo58219a();

        /* renamed from: b */
        void mo58218b(FleetActivity fleetActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"co/bird/android/feature/fleetstatus/common/FleetActivity$b", "LxE;", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.common.FleetActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14795b extends AbstractC30071xE {
        public C14795b(FleetActivity fleetActivity) {
            super(fleetActivity);
        }
    }

    public FleetActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC14793a m58225j0() {
        InterfaceC14793a interfaceC14793a = this.f63925D;
        if (interfaceC14793a != null) {
            return interfaceC14793a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    /* renamed from: k0 */
    public final C44129kp1 m58224k0() {
        C44129kp1 c44129kp1 = this.f63924C;
        if (c44129kp1 != null) {
            return c44129kp1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fleetNavigator");
        return null;
    }

    /* renamed from: m0 */
    public final C47094pp1 m58223m0() {
        C47094pp1 c47094pp1 = this.f63923B;
        if (c47094pp1 != null) {
            return c47094pp1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: n0 */
    public final void m58222n0(InterfaceC14793a interfaceC14793a) {
        Intrinsics.checkNotNullParameter(interfaceC14793a, "<set-?>");
        this.f63925D = interfaceC14793a;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m58224k0().mo28392a()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        EnumC45315mp1 enumC45315mp1;
        super.onCreate(bundle);
        C0382B3 m114773c = C0382B3.m114773c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m114773c, "inflate(layoutInflater)");
        setContentView(m114773c.getRoot());
        InterfaceC14793a.InterfaceC14794a m58221a = C14796a.m58221a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C14795b c14795b = new C14795b(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        m58222n0(m58221a.mo58220a(m21419a, this, m45197b, c14795b, supportFragmentManager, C45831nh4.container));
        m58225j0().mo58218b(this);
        if (getIntent().getBooleanExtra("fleet_report", false)) {
            enumC45315mp1 = EnumC45315mp1.INSIGHTS;
        } else {
            enumC45315mp1 = EnumC45315mp1.FLEET_STATUS;
        }
        m58223m0().m18651c(enumC45315mp1);
    }
}
