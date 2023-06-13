package co.bird.android.feature.workorders.legacyinspection;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "onBackPressed", "LAp2;", "B", "LAp2;", "j0", "()LAp2;", "setPresenter", "(LAp2;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionActivity.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n44#2:114\n1#3:115\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionActivity.kt\nco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity\n*L\n39#1:114\n*E\n"})
/* loaded from: classes3.dex */
public final class LegacyWorkOrderInspectionActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC31750Ap2 f65961B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity$a;", "", "Lco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15951b.class})
    /* renamed from: co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15949a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lc4;", "binding", "Lco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity$a;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15950a {
            /* renamed from: a */
            InterfaceC15949a mo56222a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C13383c4 c13383c4);
        }

        /* renamed from: a */
        void mo56221a(LegacyWorkOrderInspectionActivity legacyWorkOrderInspectionActivity);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/workorders/legacyinspection/LegacyWorkOrderInspectionActivity$b;", "", "Lcq2;", "impl", "Lbq2;", C17296a.f69688o, "LXp2;", "LAp2;", "b", "LkE6;", "LfE6;", DateTokenConverter.CONVERTER_KEY, "Lq83;", "Lp83;", "c", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15951b {
        @Binds
        /* renamed from: a */
        InterfaceC38786bq2 m56227a(C39397cq2 c39397cq2);

        @Binds
        /* renamed from: b */
        InterfaceC31750Ap2 m56226b(C37132Xp2 c37132Xp2);

        @Binds
        /* renamed from: c */
        InterfaceC46692p83 m56225c(C47285q83 c47285q83);

        @Binds
        /* renamed from: d */
        InterfaceC40821fE6 m56224d(C43786kE6 c43786kE6);
    }

    public LegacyWorkOrderInspectionActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC31750Ap2 m56228j0() {
        InterfaceC31750Ap2 interfaceC31750Ap2 = this.f65961B;
        if (interfaceC31750Ap2 != null) {
            return interfaceC31750Ap2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2;
        super.onActivityResult(i, i2, intent);
        if (i == 10010 && i2 == -1) {
            if (intent != null && (parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("selected_issues")) != null) {
                m56228j0().mo76281d(parcelableArrayListExtra2);
            }
            if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("unselected_issues")) != null) {
                m56228j0().mo76285a(parcelableArrayListExtra);
            }
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m56228j0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13383c4 m61985c = C13383c4.m61985c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m61985c, "inflate(layoutInflater)");
        setContentView(m61985c.getRoot());
        InterfaceC15949a.InterfaceC15950a m56223a = C15952a.m56223a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56223a.mo56222a(m21419a, this, m45197b, m61985c).mo56221a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird == null) {
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("return_added_issues", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("record_inspection_event", false);
        m56228j0().mo76283b(wireBird, (WorkOrder) getIntent().getParcelableExtra("work_order"), booleanExtra, booleanExtra2);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            m56228j0().onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
