package co.bird.android.feature.workorders.details;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/workorders/details/WorkOrderDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LpD6;", "B", "LpD6;", "j0", "()LpD6;", "setPresenter", "(LpD6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsActivity.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,82:1\n44#2:83\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsActivity.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsActivity\n*L\n35#1:83\n*E\n"})
/* loaded from: classes3.dex */
public final class WorkOrderDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC46742pD6 f65920B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/workorders/details/WorkOrderDetailsActivity$a;", "", "Lco/bird/android/feature/workorders/details/WorkOrderDetailsActivity;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15924b.class})
    /* renamed from: co.bird.android.feature.workorders.details.WorkOrderDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15922a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/details/WorkOrderDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lx6;", "binding", "Lco/bird/android/feature/workorders/details/WorkOrderDetailsActivity$a;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.workorders.details.WorkOrderDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15923a {
            /* renamed from: a */
            InterfaceC15922a mo56261a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C30038x6 c30038x6);
        }

        /* renamed from: a */
        void mo56260a(WorkOrderDetailsActivity workOrderDetailsActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/details/WorkOrderDetailsActivity$b;", "", "LDD6;", "impl", "LCD6;", C17296a.f69688o, "LyD6;", "LpD6;", "c", "LmD6;", "LkD6;", "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.workorders.details.WorkOrderDetailsActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15924b {
        @Binds
        /* renamed from: a */
        CD6 m56265a(DD6 dd6);

        @Binds
        /* renamed from: b */
        InterfaceC43777kD6 m56264b(C44963mD6 c44963mD6);

        @Binds
        /* renamed from: c */
        InterfaceC46742pD6 m56263c(C52077yD6 c52077yD6);
    }

    public WorkOrderDetailsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC46742pD6 m56266j0() {
        InterfaceC46742pD6 interfaceC46742pD6 = this.f65920B;
        if (interfaceC46742pD6 != null) {
            return interfaceC46742pD6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30038x6 m5850c = C30038x6.m5850c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m5850c, "inflate(layoutInflater)");
        setContentView(m5850c.getRoot());
        InterfaceC15922a.InterfaceC15923a m56262a = C15925a.m56262a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56262a.mo56261a(m21419a, this, m45197b, m5850c).mo56260a(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("work_order");
        Intrinsics.checkNotNull(parcelableExtra2);
        m56266j0().mo3839a((WireBird) parcelableExtra, (WorkOrder) parcelableExtra2);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56266j0().onResume();
    }
}
