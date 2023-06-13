package co.bird.android.feature.transferorder.container;

import android.app.Application;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/transferorder/container/ContainerDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LNz0;", "B", "LNz0;", "j0", "()LNz0;", "setPresenter", "(LNz0;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContainerDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerDetailsActivity.kt\nco/bird/android/feature/transferorder/container/ContainerDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,66:1\n44#2:67\n*S KotlinDebug\n*F\n+ 1 ContainerDetailsActivity.kt\nco/bird/android/feature/transferorder/container/ContainerDetailsActivity\n*L\n31#1:67\n*E\n"})
/* loaded from: classes3.dex */
public final class ContainerDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public C34880Nz0 f65675B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/transferorder/container/ContainerDetailsActivity$a;", "", "Lco/bird/android/feature/transferorder/container/ContainerDetailsActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.transferorder.container.ContainerDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15785a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/transferorder/container/ContainerDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lr3;", "binding", "", "containerId", "Lco/bird/android/feature/transferorder/container/ContainerDetailsActivity$a;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.container.ContainerDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15786a {
            /* renamed from: a */
            InterfaceC15785a mo56561a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C27825r3 c27825r3, @BindsInstance String str);
        }

        /* renamed from: a */
        void mo56566a(ContainerDetailsActivity containerDetailsActivity);
    }

    public ContainerDetailsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C34880Nz0 m56568j0() {
        C34880Nz0 c34880Nz0 = this.f65675B;
        if (c34880Nz0 != null) {
            return c34880Nz0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27825r3 m16567c = C27825r3.m16567c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m16567c, "inflate(layoutInflater)");
        setContentView(m16567c.getRoot());
        InterfaceC15785a.InterfaceC15786a m56567a = C15787a.m56567a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        String stringExtra = getIntent().getStringExtra("container_order_id");
        Intrinsics.checkNotNull(stringExtra);
        m56567a.mo56561a(m21419a, this, m45197b, m16567c, stringExtra).mo56566a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56568j0().m93057l();
    }
}
