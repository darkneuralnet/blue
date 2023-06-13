package co.bird.android.qualitycontrol.list;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.wire.WireBird;
import co.bird.android.qualitycontrol.base.BaseQualityControlActivity;
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
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m28432d2 = {"Lco/bird/android/qualitycontrol/list/ListQualityControlActivity;", "Lco/bird/android/qualitycontrol/base/BaseQualityControlActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", C17296a.f69688o, "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListQualityControlActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlActivity.kt\nco/bird/android/qualitycontrol/list/ListQualityControlActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,79:1\n44#2:80\n*S KotlinDebug\n*F\n+ 1 ListQualityControlActivity.kt\nco/bird/android/qualitycontrol/list/ListQualityControlActivity\n*L\n34#1:80\n*E\n"})
/* loaded from: classes4.dex */
public final class ListQualityControlActivity extends BaseQualityControlActivity {

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/qualitycontrol/list/ListQualityControlActivity$a;", "", "Lco/bird/android/qualitycontrol/list/ListQualityControlActivity;", "activity", "", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC16328b.class})
    /* renamed from: co.bird.android.qualitycontrol.list.ListQualityControlActivity$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16326a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/list/ListQualityControlActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LX4;", "binding", "Lco/bird/android/qualitycontrol/list/ListQualityControlActivity$a;", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.qualitycontrol.list.ListQualityControlActivity$a$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16327a {
            /* renamed from: a */
            InterfaceC16326a mo55017a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C9293X4 c9293x4);
        }

        /* renamed from: a */
        void mo55016a(ListQualityControlActivity listQualityControlActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/list/ListQualityControlActivity$b;", "", "Lys2;", "impl", "Lxs2;", "b", "Lvs2;", "LSb4;", C17296a.f69688o, "Lls2;", "Ljs2;", "c", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.qualitycontrol.list.ListQualityControlActivity$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16328b {
        @Binds
        /* renamed from: a */
        InterfaceC35838Sb4 m55021a(C50681vs2 c50681vs2);

        @Binds
        /* renamed from: b */
        InterfaceC51867xs2 m55020b(C52460ys2 c52460ys2);

        @Binds
        /* renamed from: c */
        InterfaceC43567js2 m55019c(C44753ls2 c44753ls2);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9293X4 m77444c = C9293X4.m77444c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m77444c, "inflate(layoutInflater)");
        setContentView(m77444c.getRoot());
        InterfaceC16326a.InterfaceC16327a m55018a = C16329a.m55018a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m55018a.mo55017a(m21419a, this, m45197b, m77444c).mo55016a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        WorkOrder workOrder = (WorkOrder) getIntent().getParcelableExtra("work_order");
        if (wireBird != null) {
            m55022j0().mo7892a(wireBird, workOrder);
        }
    }
}
