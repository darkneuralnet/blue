package co.bird.android.feature.workorders.inspection;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.WorkOrder;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LyE6;", "B", "LyE6;", "j0", "()LyE6;", "setPresenter", "(LyE6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionActivity.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,84:1\n44#2:85\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionActivity.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity\n*L\n34#1:85\n*E\n"})
/* loaded from: classes3.dex */
public final class WorkOrderInspectionActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC52086yE6 f65941B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity$a;", "", "Lco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15936b.class})
    /* renamed from: co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15934a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Ly6;", "binding", "Lco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity$a;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15935a {
            /* renamed from: a */
            InterfaceC15934a mo56246a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C30417y6 c30417y6);
        }

        /* renamed from: a */
        void mo56245a(WorkOrderInspectionActivity workOrderInspectionActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/inspection/WorkOrderInspectionActivity$b;", "", "LlF6;", "impl", "LkF6;", "b", "LYE6;", "LyE6;", "c", "LjE6;", "LgE6;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15936b {
        @Binds
        /* renamed from: a */
        InterfaceC41414gE6 m56250a(C43193jE6 c43193jE6);

        @Binds
        /* renamed from: b */
        InterfaceC43795kF6 m56249b(C44388lF6 c44388lF6);

        @Binds
        /* renamed from: c */
        InterfaceC52086yE6 m56248c(YE6 ye6);
    }

    public WorkOrderInspectionActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52086yE6 m56251j0() {
        InterfaceC52086yE6 interfaceC52086yE6 = this.f65941B;
        if (interfaceC52086yE6 != null) {
            return interfaceC52086yE6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30417y6 m4147c = C30417y6.m4147c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m4147c, "inflate(layoutInflater)");
        setContentView(m4147c.getRoot());
        InterfaceC15934a.InterfaceC15935a m56247a = C15937a.m56247a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56247a.mo56246a(m21419a, this, m45197b, m4147c).mo56245a(this);
        WorkOrder workOrder = (WorkOrder) getIntent().getParcelableExtra("work_order");
        boolean booleanExtra = getIntent().getBooleanExtra("return_added_issues", false);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird != null) {
            m56251j0().mo75363c(wireBird, workOrder, booleanExtra);
        }
    }
}
