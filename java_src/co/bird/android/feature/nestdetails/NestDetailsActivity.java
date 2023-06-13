package co.bird.android.feature.nestdetails;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/nestdetails/NestDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LI23;", "B", "LI23;", "j0", "()LI23;", "setPresenter", "(LI23;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestDetailsActivity.kt\nco/bird/android/feature/nestdetails/NestDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,82:1\n44#2:83\n*S KotlinDebug\n*F\n+ 1 NestDetailsActivity.kt\nco/bird/android/feature/nestdetails/NestDetailsActivity\n*L\n39#1:83\n*E\n"})
/* loaded from: classes3.dex */
public final class NestDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public I23 f64230B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/nestdetails/NestDetailsActivity$a;", "", "Lco/bird/android/feature/nestdetails/NestDetailsActivity;", "activity", "", C17296a.f69688o, "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC14991b.class})
    /* renamed from: co.bird.android.feature.nestdetails.NestDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14989a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/nestdetails/NestDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lp4;", "binding", "", "showRange", "Lco/bird/android/feature/nestdetails/NestDetailsActivity$a;", C17296a.f69688o, "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.nestdetails.NestDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14990a {
            /* renamed from: a */
            InterfaceC14989a mo57922a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C27137p4 c27137p4, @BindsInstance boolean z);
        }

        /* renamed from: a */
        void mo57921a(NestDetailsActivity nestDetailsActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/nestdetails/NestDetailsActivity$b;", "", "LQ23;", "impl", "LP23;", "c", "Lqm6;", "Lpm6;", "b", "LN23;", "LI23;", C17296a.f69688o, "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.nestdetails.NestDetailsActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14991b {
        @Binds
        /* renamed from: a */
        I23 m57926a(N23 n23);

        @Binds
        /* renamed from: b */
        InterfaceC47069pm6 m57925b(C47662qm6 c47662qm6);

        @Binds
        /* renamed from: c */
        P23 m57924c(Q23 q23);
    }

    public NestDetailsActivity() {
        super(false, Integer.valueOf(C45871nl4.nest_location_details), null, 5, null);
    }

    /* renamed from: j0 */
    public final I23 m57927j0() {
        I23 i23 = this.f64230B;
        if (i23 != null) {
            return i23;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27137p4 m20000c = C27137p4.m20000c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m20000c, "inflate(layoutInflater)");
        setContentView(m20000c.getRoot());
        mo58977D();
        InterfaceC14989a.InterfaceC14990a m57923a = C14992a.m57923a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57923a.mo57922a(m21419a, this, m45197b, m20000c, mo58955y().m82623f8().getValue().getRiderMapConfig().getShowRangeInsteadOfBatteryPercentage()).mo57921a(this);
        m57927j0().mo94434a();
    }
}
