package co.bird.android.feature.transferorder.sku.investigation;

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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LeC5;", "B", "LeC5;", "j0", "()LeC5;", "setPresenter", "(LeC5;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuInvestigationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationActivity.kt\nco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,66:1\n44#2:67\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationActivity.kt\nco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity\n*L\n32#1:67\n*E\n"})
/* loaded from: classes3.dex */
public final class SkuInvestigationActivity extends BaseActivity {

    /* renamed from: B */
    public C40209eC5 f65802B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity$a;", "", "Lco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.transferorder.sku.investigation.SkuInvestigationActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15850a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ld6;", "binding", "", "skuOrderId", "Lco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationActivity$a;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.sku.investigation.SkuInvestigationActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15851a {
            /* renamed from: a */
            InterfaceC15850a mo56386a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C19674d6 c19674d6, @BindsInstance String str);
        }

        /* renamed from: a */
        void mo56385a(SkuInvestigationActivity skuInvestigationActivity);
    }

    public SkuInvestigationActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C40209eC5 m56388j0() {
        C40209eC5 c40209eC5 = this.f65802B;
        if (c40209eC5 != null) {
            return c40209eC5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19674d6 m44611c = C19674d6.m44611c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m44611c, "inflate(layoutInflater)");
        setContentView(m44611c.getRoot());
        mo58977D();
        InterfaceC15850a.InterfaceC15851a m56387a = C15852a.m56387a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        String stringExtra = getIntent().getStringExtra("sku_order_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m56387a.mo56386a(m21419a, this, m45197b, m44611c, stringExtra).mo56385a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56388j0().m43116i();
    }
}
