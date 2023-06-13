package co.bird.android.feature.servicecenter.repairlogger.addrepair;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LNA4;", "B", "LNA4;", "j0", "()LNA4;", "setPresenter", "(LNA4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairLoggerAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairLoggerAddActivity.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,80:1\n44#2:81\n*S KotlinDebug\n*F\n+ 1 RepairLoggerAddActivity.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity\n*L\n35#1:81\n*E\n"})
/* loaded from: classes3.dex */
public final class RepairLoggerAddActivity extends BaseActivity {

    /* renamed from: B */
    public NA4 f65440B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity$a;", "", "Lco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15664b.class})
    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15662a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Le5;", "binding", "Lco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15663a {
            /* renamed from: a */
            InterfaceC15662a mo56773a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C19960e5 c19960e5);
        }

        /* renamed from: a */
        void mo56772a(RepairLoggerAddActivity repairLoggerAddActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddActivity$b;", "", "LgB4;", "impl", "LeB4;", C17296a.f69688o, "LcB4;", "LNA4;", "c", "Lw7;", "Lu7;", "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15664b {
        @Binds
        /* renamed from: a */
        InterfaceC40199eB4 m56777a(C41385gB4 c41385gB4);

        @Binds
        /* renamed from: b */
        InterfaceC29058u7 m56776b(C29782w7 c29782w7);

        @Binds
        /* renamed from: c */
        NA4 m56775c(C38996cB4 c38996cB4);
    }

    public RepairLoggerAddActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final NA4 m56778j0() {
        NA4 na4 = this.f65440B;
        if (na4 != null) {
            return na4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19960e5 m43295c = C19960e5.m43295c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m43295c, "inflate(layoutInflater)");
        setContentView(m43295c.getRoot());
        InterfaceC15662a.InterfaceC15663a m56774a = C15665a.m56774a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56774a.mo56773a(m21419a, this, m45197b, m43295c).mo56772a(this);
        mo58977D();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("repair_options");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        m56778j0().mo61791a((WireBird) parcelableExtra, parcelableArrayListExtra);
    }
}
