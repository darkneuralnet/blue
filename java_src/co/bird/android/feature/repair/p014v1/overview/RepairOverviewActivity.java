package co.bird.android.feature.repair.p014v1.overview;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p014v1.base.BaseRepairOverviewActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;", "Lco/bird/android/feature/repair/v1/base/BaseRepairOverviewActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LXB4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LXB4;", "k0", "()LXB4;", "setPresenter", "(LXB4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairOverviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewActivity.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n44#2:85\n1#3:86\n*S KotlinDebug\n*F\n+ 1 RepairOverviewActivity.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewActivity\n*L\n40#1:85\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v1.overview.RepairOverviewActivity */
/* loaded from: classes3.dex */
public final class RepairOverviewActivity extends BaseRepairOverviewActivity {

    /* renamed from: C */
    public XB4 f64586C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a;", "", "Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC34875Ny4.class}, modules = {InterfaceC15186b.class})
    /* renamed from: co.bird.android.feature.repair.v1.overview.RepairOverviewActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15184a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a$a;", "", "LlG2;", "mainComponent", "LNy4;", "repairComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lh5;", "binding", "Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$a;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v1.overview.RepairOverviewActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15185a {
            /* renamed from: a */
            InterfaceC15184a mo57579a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C22548h5 c22548h5);
        }

        /* renamed from: a */
        void mo57578a(RepairOverviewActivity repairOverviewActivity);
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/overview/RepairOverviewActivity$b;", "", "LtC4;", "impl", "LsC4;", "c", "LnC4;", "LXB4;", "b", "LUB4;", "LSB4;", DateTokenConverter.CONVERTER_KEY, "LzD4;", "imp", "LwD4;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.repair.v1.overview.RepairOverviewActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15186b {
        @Binds
        /* renamed from: a */
        InterfaceC50889wD4 m57584a(C52668zD4 c52668zD4);

        @Binds
        /* renamed from: b */
        XB4 m57583b(C45545nC4 c45545nC4);

        @Binds
        /* renamed from: c */
        InterfaceC48509sC4 m57582c(C49102tC4 c49102tC4);

        @Binds
        /* renamed from: d */
        SB4 m57581d(UB4 ub4);
    }

    @Override // co.bird.android.feature.repair.p014v1.base.BaseRepairOverviewActivity
    /* renamed from: k0 */
    public XB4 mo57585k0() {
        XB4 xb4 = this.f64586C;
        if (xb4 != null) {
            return xb4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.feature.repair.p014v1.base.BaseRepairOverviewActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C22548h5 m36863c = C22548h5.m36863c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m36863c, "inflate(layoutInflater)");
        setContentView(m36863c.getRoot());
        InterfaceC15184a.InterfaceC15185a m57580a = C15187a.m57580a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        InterfaceC34875Ny4 m57596j0 = m57596j0();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57580a.mo57579a(m21419a, m57596j0, this, m45197b, m36863c).mo57578a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird != null) {
            mo57585k0().mo24198a(wireBird);
        }
    }
}
