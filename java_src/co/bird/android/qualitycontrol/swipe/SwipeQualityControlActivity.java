package co.bird.android.qualitycontrol.swipe;

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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LSb4;", "B", "LSb4;", "j0", "()LSb4;", "setPresenter", "(LSb4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlActivity.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,81:1\n44#2:82\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlActivity.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity\n*L\n36#1:82\n*E\n"})
/* loaded from: classes4.dex */
public final class SwipeQualityControlActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC35838Sb4 f66945B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity$a;", "", "Lco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity;", "activity", "", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC16351b.class})
    /* renamed from: co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16349a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LZ4;", "binding", "Lco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity$a;", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity$a$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16350a {
            /* renamed from: a */
            InterfaceC16349a mo54987a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C10110Z4 c10110z4);
        }

        /* renamed from: a */
        void mo54986a(SwipeQualityControlActivity swipeQualityControlActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/swipe/SwipeQualityControlActivity$b;", "", "LkX5;", "impl", "LiX5;", "c", "LfX5;", "LSb4;", C17296a.f69688o, "LNW5;", "LLW5;", "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16351b {
        @Binds
        /* renamed from: a */
        InterfaceC35838Sb4 m54991a(C40991fX5 c40991fX5);

        @Binds
        /* renamed from: b */
        LW5 m54990b(NW5 nw5);

        @Binds
        /* renamed from: c */
        InterfaceC42770iX5 m54989c(C43956kX5 c43956kX5);
    }

    public SwipeQualityControlActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC35838Sb4 m54992j0() {
        InterfaceC35838Sb4 interfaceC35838Sb4 = this.f66945B;
        if (interfaceC35838Sb4 != null) {
            return interfaceC35838Sb4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10110Z4 m73786c = C10110Z4.m73786c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m73786c, "inflate(layoutInflater)");
        setContentView(m73786c.getRoot());
        InterfaceC16349a.InterfaceC16350a m54988a = C16352a.m54988a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m54988a.mo54987a(m21419a, this, m45197b, m73786c).mo54986a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        WorkOrder workOrder = (WorkOrder) getIntent().getParcelableExtra("work_order");
        if (wireBird != null) {
            m54992j0().mo7892a(wireBird, workOrder);
        }
    }
}
