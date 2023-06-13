package co.bird.android.feature.servicecenter.repairlogger.scan;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
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
import p000.InterfaceC36038Sx6;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onResume", "LDB4;", "B", "LDB4;", "j0", "()LDB4;", "setPresenter", "(LDB4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairLoggerScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairLoggerScanActivity.kt\nco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,81:1\n44#2:82\n*S KotlinDebug\n*F\n+ 1 RepairLoggerScanActivity.kt\nco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity\n*L\n32#1:82\n*E\n"})
/* loaded from: classes3.dex */
public final class RepairLoggerScanActivity extends BaseActivity {

    /* renamed from: B */
    public DB4 f65479B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity$a;", "", "Lco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15683b.class})
    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15681a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lg5;", "binding", "LDQ3;", "permissionManager", "Lco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15682a {
            /* renamed from: a */
            InterfaceC15681a mo56748a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C20724g5 c20724g5, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo56747a(RepairLoggerScanActivity repairLoggerScanActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/scan/RepairLoggerScanActivity$b;", "", "LKB4;", "impl", "LJB4;", "b", "LHB4;", "LDB4;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15683b {
        @Binds
        /* renamed from: a */
        DB4 m56751a(HB4 hb4);

        @Binds
        /* renamed from: b */
        JB4 m56750b(KB4 kb4);
    }

    public RepairLoggerScanActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final DB4 m56752j0() {
        DB4 db4 = this.f65479B;
        if (db4 != null) {
            return db4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m56752j0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20724g5 m40141c = C20724g5.m40141c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m40141c, "inflate(layoutInflater)");
        setContentView(m40141c.getRoot());
        InterfaceC15681a.InterfaceC15682a m56749a = C15684a.m56749a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56749a.mo56748a(m21419a, this, m45197b, m40141c, mo58956x()).mo56747a(this);
        DB4 m56752j0 = m56752j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m56752j0.mo104190b(intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC36038Sx6.C7617a.checkWarehouseInfo$default(m56752j0(), null, 1, null);
    }
}
