package co.bird.android.feature.servicecenter.inventorycount;

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
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LA92;", "B", "LA92;", "j0", "()LA92;", "setPresenter", "(LA92;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryScanProxyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanProxyActivity.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,77:1\n44#2:78\n*S KotlinDebug\n*F\n+ 1 InventoryScanProxyActivity.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity\n*L\n31#1:78\n*E\n"})
/* loaded from: classes3.dex */
public final class InventoryScanProxyActivity extends BaseActivity {

    /* renamed from: B */
    public A92 f65387B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity$a;", "", "Lco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15632b.class})
    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15630a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LZ3;", "binding", "Lco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15631a {
            /* renamed from: a */
            InterfaceC15630a mo56805a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C10107Z3 c10107z3);
        }

        /* renamed from: a */
        void mo56804a(InventoryScanProxyActivity inventoryScanProxyActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryScanProxyActivity$b;", "", "LE92;", "impl", "LD92;", "b", "LB92;", "LA92;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15632b {
        @Binds
        /* renamed from: a */
        A92 m56820a(B92 b92);

        @Binds
        /* renamed from: b */
        D92 m56819b(E92 e92);
    }

    public InventoryScanProxyActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final A92 m56821j0() {
        A92 a92 = this.f65387B;
        if (a92 != null) {
            return a92;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m56821j0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10107Z3 m73805c = C10107Z3.m73805c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m73805c, "inflate(layoutInflater)");
        setContentView(m73805c.getRoot());
        InterfaceC15630a.InterfaceC15631a m56806a = C15643b.m56806a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56806a.mo56805a(m21419a, this, m45197b, m73805c).mo56804a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56821j0().onResume();
    }
}
