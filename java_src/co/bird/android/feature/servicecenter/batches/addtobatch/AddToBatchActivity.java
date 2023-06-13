package co.bird.android.feature.servicecenter.batches.addtobatch;

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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LJ7;", "B", "LJ7;", "j0", "()LJ7;", "setPresenter", "(LJ7;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddToBatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToBatchActivity.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,73:1\n44#2:74\n*S KotlinDebug\n*F\n+ 1 AddToBatchActivity.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity\n*L\n32#1:74\n*E\n"})
/* loaded from: classes3.dex */
public final class AddToBatchActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC3894J7 f65266B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity$a;", "", "Lco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15569b.class})
    /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15567a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LP2;", "binding", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15568a {
            /* renamed from: a */
            InterfaceC15567a mo56909a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance C6231P2 c6231p2, @BindsInstance ScopeProvider scopeProvider);
        }

        /* renamed from: a */
        void mo56916a(AddToBatchActivity addToBatchActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchActivity$b;", "", "LY7;", "impl", "LU7;", "c", "LS7;", "LJ7;", C17296a.f69688o, "LG7;", "LE7;", "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15569b {
        @Binds
        /* renamed from: a */
        InterfaceC3894J7 m56920a(C7333S7 c7333s7);

        @Binds
        /* renamed from: b */
        InterfaceC1738E7 m56919b(C2652G7 c2652g7);

        @Binds
        /* renamed from: c */
        InterfaceC8198U7 m56918c(C9636Y7 c9636y7);
    }

    public AddToBatchActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC3894J7 m56921j0() {
        InterfaceC3894J7 interfaceC3894J7 = this.f65266B;
        if (interfaceC3894J7 != null) {
            return interfaceC3894J7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6231P2 m91045c = C6231P2.m91045c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m91045c, "inflate(layoutInflater)");
        setContentView(m91045c.getRoot());
        InterfaceC15567a.InterfaceC15568a m56917a = C15570a.m56917a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56917a.mo56909a(m21419a, this, m91045c, m45197b).mo56916a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56921j0().refresh();
    }
}
