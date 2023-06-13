package co.bird.android.feature.operator.tasklist;

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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/operator/tasklist/OperatorTaskListActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lfv3;", "B", "Lfv3;", "getPresenter", "()Lfv3;", "setPresenter", "(Lfv3;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListActivity.kt\nco/bird/android/feature/operator/tasklist/OperatorTaskListActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,70:1\n44#2:71\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListActivity.kt\nco/bird/android/feature/operator/tasklist/OperatorTaskListActivity\n*L\n32#1:71\n*E\n"})
/* loaded from: classes3.dex */
public final class OperatorTaskListActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC41226fv3 f64294B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/operator/tasklist/OperatorTaskListActivity$a;", "", "Lco/bird/android/feature/operator/tasklist/OperatorTaskListActivity;", "activity", "", C17296a.f69688o, "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15030b.class})
    /* renamed from: co.bird.android.feature.operator.tasklist.OperatorTaskListActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15028a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/operator/tasklist/OperatorTaskListActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LC4;", "binding", "Lco/bird/android/feature/operator/tasklist/OperatorTaskListActivity$a;", C17296a.f69688o, "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.operator.tasklist.OperatorTaskListActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15029a {
            /* renamed from: a */
            InterfaceC15028a mo57862a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C0848C4 c0848c4);
        }

        /* renamed from: a */
        void mo57861a(OperatorTaskListActivity operatorTaskListActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/operator/tasklist/OperatorTaskListActivity$b;", "", "LIv3;", "impl", "LHv3;", C17296a.f69688o, "LCv3;", "Lfv3;", "b", "LWu3;", "LUu3;", "c", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.operator.tasklist.OperatorTaskListActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15030b {
        @Binds
        /* renamed from: a */
        InterfaceC33443Hv3 m57866a(C33677Iv3 c33677Iv3);

        @Binds
        /* renamed from: b */
        InterfaceC41226fv3 m57865b(C32273Cv3 c32273Cv3);

        @Binds
        /* renamed from: c */
        InterfaceC36476Uu3 m57864c(C36944Wu3 c36944Wu3);
    }

    public OperatorTaskListActivity() {
        super(false, null, null, 7, null);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0848C4 m112926c = C0848C4.m112926c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m112926c, "inflate(layoutInflater)");
        setContentView(m112926c.getRoot());
        InterfaceC15028a.InterfaceC15029a m57863a = C15031a.m57863a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57863a.mo57862a(m21419a, this, m45197b, m112926c).mo57861a(this);
    }
}
