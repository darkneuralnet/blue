package co.bird.android.feature.servicecenter.status.single.update;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lyu5;", "B", "Lyu5;", "j0", "()Lyu5;", "setPresenter", "(Lyu5;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceProgressUpdateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdateActivity.kt\nco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n44#2:83\n1#3:84\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdateActivity.kt\nco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity\n*L\n35#1:83\n*E\n"})
/* loaded from: classes3.dex */
public final class ServiceProgressUpdateActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52483yu5 f65578B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity$a;", "", "Lco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15733b.class})
    /* renamed from: co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15731a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lb6;", "binding", "Lco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15732a {
            /* renamed from: a */
            InterfaceC15731a mo56685a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C12291b6 c12291b6);
        }

        /* renamed from: a */
        void mo56684a(ServiceProgressUpdateActivity serviceProgressUpdateActivity);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdateActivity$b;", "", "Lcv5;", "impl", "Lbv5;", C17296a.f69688o, "LQu5;", "Lyu5;", "c", "Lwu5;", "Luu5;", DateTokenConverter.CONVERTER_KEY, "LZu5;", "LVu5;", "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15733b {
        @Binds
        /* renamed from: a */
        InterfaceC38839bv5 m56690a(C39450cv5 c39450cv5);

        @Binds
        /* renamed from: b */
        InterfaceC36712Vu5 m56689b(C37648Zu5 c37648Zu5);

        @Binds
        /* renamed from: c */
        InterfaceC52483yu5 m56688c(C35542Qu5 c35542Qu5);

        @Binds
        /* renamed from: d */
        InterfaceC50112uu5 m56687d(C51297wu5 c51297wu5);
    }

    public ServiceProgressUpdateActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52483yu5 m56691j0() {
        InterfaceC52483yu5 interfaceC52483yu5 = this.f65578B;
        if (interfaceC52483yu5 != null) {
            return interfaceC52483yu5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12291b6 m64975c = C12291b6.m64975c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m64975c, "inflate(layoutInflater)");
        setContentView(m64975c.getRoot());
        InterfaceC15731a.InterfaceC15732a m56686a = C15734a.m56686a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56686a.mo56685a(m21419a, this, m45197b, m64975c).mo56684a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird != null) {
            m56691j0().mo2305a(wireBird);
        }
    }
}
