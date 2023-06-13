package co.bird.android.feature.operatorinventory;

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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LX82;", "B", "LX82;", "j0", "()LX82;", "setPresenter", "(LX82;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryPartDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartDetailsActivity.kt\nco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,62:1\n44#2:63\n*S KotlinDebug\n*F\n+ 1 InventoryPartDetailsActivity.kt\nco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity\n*L\n31#1:63\n*E\n"})
/* loaded from: classes3.dex */
public final class InventoryPartDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public X82 f64321B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity$a;", "", "Lco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.operatorinventory.InventoryPartDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15043a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LX3;", "binding", "Lco/bird/android/feature/operatorinventory/InventoryPartDetailsActivity$a;", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.operatorinventory.InventoryPartDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15044a {
            /* renamed from: a */
            InterfaceC15043a mo57839a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C9290X3 c9290x3);
        }

        /* renamed from: a */
        void mo57838a(InventoryPartDetailsActivity inventoryPartDetailsActivity);
    }

    public InventoryPartDetailsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final X82 m57842j0() {
        X82 x82 = this.f64321B;
        if (x82 != null) {
            return x82;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9290X3 m77512c = C9290X3.m77512c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m77512c, "inflate(layoutInflater)");
        setContentView(m77512c.getRoot());
        InterfaceC15043a.InterfaceC15044a m57840a = C15047a.m57840a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57840a.mo57839a(m21419a, this, m45197b, m77512c).mo57838a(this);
        X82 m57842j0 = m57842j0();
        String stringExtra = getIntent().getStringExtra("category");
        String stringExtra2 = getIntent().getStringExtra("sku");
        Intrinsics.checkNotNull(stringExtra2);
        m57842j0.m77309k(stringExtra, stringExtra2);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57842j0().m77307m();
    }
}
