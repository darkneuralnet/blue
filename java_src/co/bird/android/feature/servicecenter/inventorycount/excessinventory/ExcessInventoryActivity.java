package co.bird.android.feature.servicecenter.inventorycount.excessinventory;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.api.response.WarehouseInventory;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lkh1;", "B", "Lkh1;", "j0", "()Lkh1;", "setPresenter", "(Lkh1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExcessInventoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcessInventoryActivity.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n44#2:73\n1#3:74\n*S KotlinDebug\n*F\n+ 1 ExcessInventoryActivity.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity\n*L\n33#1:73\n*E\n"})
/* loaded from: classes3.dex */
public final class ExcessInventoryActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC44049kh1 f65426B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity$a;", "", "Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15652b.class})
    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15650a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/EditText;", "quantity", "Landroid/widget/Button;", "submit", "Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15651a {
            /* renamed from: a */
            InterfaceC15650a mo56789a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance EditText editText, @BindsInstance Button button);
        }

        /* renamed from: a */
        void mo56793a(ExcessInventoryActivity excessInventoryActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity$b;", "", "Lrh1;", "impl", "Lqh1;", "b", "Lph1;", "Lkh1;", C17296a.f69688o, "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15652b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC44049kh1 m56796a(C47014ph1 c47014ph1);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC47607qh1 m56795b(C48200rh1 c48200rh1);
    }

    public ExcessInventoryActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC44049kh1 m56797j0() {
        InterfaceC44049kh1 interfaceC44049kh1 = this.f65426B;
        if (interfaceC44049kh1 != null) {
            return interfaceC44049kh1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C34740Nj4.activity_excess_inventory);
        InterfaceC15650a.InterfaceC15651a m56794a = C15653a.m56794a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        View findViewById = findViewById(C38115ai4.quantity);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.quantity)");
        EditText editText = (EditText) findViewById;
        View findViewById2 = findViewById(C38115ai4.submit);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.submit)");
        m56794a.mo56789a(m21419a, this, m45197b, editText, (Button) findViewById2).mo56793a(this);
        WarehouseInventory warehouseInventory = (WarehouseInventory) getIntent().getParcelableExtra("inventory");
        if (warehouseInventory != null) {
            m56797j0().mo18990a(warehouseInventory);
        }
    }
}
