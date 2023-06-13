package co.bird.android.app.feature.wakebirds;

import android.app.Application;
import android.os.Bundle;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lbx6;", "B", "Lbx6;", "j0", "()Lbx6;", "setPresenter", "(Lbx6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWakeSleepBirdsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeSleepBirdsActivity.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,75:1\n44#2:76\n*S KotlinDebug\n*F\n+ 1 WakeSleepBirdsActivity.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity\n*L\n34#1:76\n*E\n"})
/* loaded from: classes2.dex */
public final class WakeSleepBirdsActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC38860bx6 f62849B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a;", "", "Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14353b.class})
    /* renamed from: co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC14351a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LDQ3;", "permissionManager", "Lv6;", "binding", "Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$a;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC14352a {
            /* renamed from: a */
            InterfaceC14351a mo59323a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DQ3 dq3, @BindsInstance C29416v6 c29416v6);
        }

        /* renamed from: a */
        void mo59322a(WakeSleepBirdsActivity wakeSleepBirdsActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/wakebirds/WakeSleepBirdsActivity$b;", "", "Ltx6;", "impl", "Lqx6;", "b", "Lnx6;", "Lbx6;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC14353b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC38860bx6 m59328a(C45993nx6 c45993nx6);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC47772qx6 m59327b(C49550tx6 c49550tx6);
    }

    public WakeSleepBirdsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC38860bx6 m59329j0() {
        InterfaceC38860bx6 interfaceC38860bx6 = this.f62849B;
        if (interfaceC38860bx6 != null) {
            return interfaceC38860bx6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C29416v6 m9196c = C29416v6.m9196c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m9196c, "inflate(layoutInflater)");
        setContentView(m9196c.getRoot());
        InterfaceC14351a.InterfaceC14352a m59324a = C14354a.m59324a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m59324a.mo59323a(m21419a, this, m45197b, mo58956x(), m9196c).mo59322a(this);
        m59329j0().mo22134a();
    }
}
