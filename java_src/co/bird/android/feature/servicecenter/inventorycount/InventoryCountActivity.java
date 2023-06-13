package co.bird.android.feature.servicecenter.inventorycount;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.api.response.WireInventoryCount;
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
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LV72;", "B", "LV72;", "j0", "()LV72;", "setPresenter", "(LV72;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryCountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryCountActivity.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n44#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 InventoryCountActivity.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity\n*L\n36#1:91\n*E\n"})
/* loaded from: classes3.dex */
public final class InventoryCountActivity extends BaseActivity {

    /* renamed from: B */
    public V72 f65386B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity$a;", "", "Lco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15629b.class})
    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15627a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LW3;", "binding", "Lco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15628a {
            /* renamed from: a */
            InterfaceC15627a mo56817a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C8921W3 c8921w3);
        }

        /* renamed from: a */
        void mo56816a(InventoryCountActivity inventoryCountActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/InventoryCountActivity$b;", "", "LB82;", "impl", "LA82;", "b", "Ls82;", "LV72;", "c", "LG82;", "LD82;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15629b {
        @Binds
        /* renamed from: a */
        D82 m56824a(G82 g82);

        @Binds
        /* renamed from: b */
        A82 m56823b(B82 b82);

        @Binds
        /* renamed from: c */
        V72 m56822c(C48469s82 c48469s82);
    }

    public InventoryCountActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final V72 m56825j0() {
        V72 v72 = this.f65386B;
        if (v72 != null) {
            return v72;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        WireInventoryCount wireInventoryCount;
        super.onActivityResult(i, i2, intent);
        if (i == 10032 && i2 == -1 && intent != null && (wireInventoryCount = (WireInventoryCount) intent.getParcelableExtra("inventory")) != null) {
            m56825j0().mo14716b(wireInventoryCount);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo58957w().mo37029e4(0, new Intent());
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8921W3 m78890c = C8921W3.m78890c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m78890c, "inflate(layoutInflater)");
        setContentView(m78890c.getRoot());
        InterfaceC15627a.InterfaceC15628a m56818a = C15633a.m56818a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56818a.mo56817a(m21419a, this, m45197b, m78890c).mo56816a(this);
        String stringExtra = getIntent().getStringExtra("raw_scan_result");
        if (stringExtra != null) {
            m56825j0().mo14717a(stringExtra);
        }
    }
}
