package co.bird.android.feature.transferorder.sku.scanner.details;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LmD5;", "B", "LmD5;", "j0", "()LmD5;", "setPresenter", "(LmD5;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuScannedDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuScannedDetailsActivity.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n44#2:90\n1#3:91\n*S KotlinDebug\n*F\n+ 1 SkuScannedDetailsActivity.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity\n*L\n33#1:90\n*E\n"})
/* loaded from: classes3.dex */
public final class SkuScannedDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public C44962mD5 f65820B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity$a;", "", "Lco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.transferorder.sku.scanner.details.SkuScannedDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15860a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jn\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lf6;", "binding", "", "itemCheckedIn", "outbound", "viewUnidentified", "", "skuOrderId", "skuModel", "title", "Lco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsActivity$a;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.sku.scanner.details.SkuScannedDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15861a {
            /* renamed from: a */
            InterfaceC15860a mo56369a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C20209f6 c20209f6, @BindsInstance boolean z, @BindsInstance boolean z2, @BindsInstance boolean z3, @BindsInstance String str, @BindsInstance String str2, @BindsInstance String str3);
        }

        /* renamed from: a */
        void mo56368a(SkuScannedDetailsActivity skuScannedDetailsActivity);
    }

    public SkuScannedDetailsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C44962mD5 m56371j0() {
        C44962mD5 c44962mD5 = this.f65820B;
        if (c44962mD5 != null) {
            return c44962mD5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("raw_scan_result")) != null) {
            m56371j0().m25998A(stringExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20209f6 m42094c = C20209f6.m42094c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m42094c, "inflate(layoutInflater)");
        setContentView(m42094c.getRoot());
        InterfaceC15860a.InterfaceC15861a m56370a = C15862a.m56370a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        boolean booleanExtra = getIntent().getBooleanExtra("checked_in", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("co.bird.android.transferorder.outbound", true);
        boolean booleanExtra3 = getIntent().getBooleanExtra("identifier_category", true);
        String stringExtra = getIntent().getStringExtra("sku_order_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m56370a.mo56369a(m21419a, this, m45197b, m42094c, booleanExtra, booleanExtra2, booleanExtra3, stringExtra, getIntent().getStringExtra("sku"), getIntent().getStringExtra("activity_title")).mo56368a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56371j0().m25977p();
    }
}
