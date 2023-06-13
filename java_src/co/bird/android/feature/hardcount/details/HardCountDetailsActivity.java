package co.bird.android.feature.hardcount.details;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
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
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/hardcount/details/HardCountDetailsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LrF1;", "B", "LrF1;", "j0", "()LrF1;", "setPresenter", "(LrF1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsActivity.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n44#2:107\n1#3:108\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsActivity.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsActivity\n*L\n38#1:107\n*E\n"})
/* loaded from: classes3.dex */
public final class HardCountDetailsActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC47941rF1 f64065B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/hardcount/details/HardCountDetailsActivity$a;", "", "Lco/bird/android/feature/hardcount/details/HardCountDetailsActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14874b.class})
    /* renamed from: co.bird.android.feature.hardcount.details.HardCountDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14872a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/hardcount/details/HardCountDetailsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "scanCount", "Landroidx/constraintlayout/widget/ConstraintLayout;", "troubleshootingTip", "Lco/bird/android/feature/hardcount/details/HardCountDetailsActivity$a;", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.hardcount.details.HardCountDetailsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14873a {
            /* renamed from: a */
            InterfaceC14872a mo58083a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RecyclerView recyclerView, @BindsInstance TextView textView, @BindsInstance ConstraintLayout constraintLayout);
        }

        /* renamed from: a */
        void mo58082a(HardCountDetailsActivity hardCountDetailsActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/hardcount/details/HardCountDetailsActivity$b;", "", "LEF1;", "impl", "LDF1;", "c", "LBF1;", "LrF1;", "b", "LpF1;", "LmF1;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.hardcount.details.HardCountDetailsActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14874b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC44976mF1 m58087a(C46755pF1 c46755pF1);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC47941rF1 m58086b(BF1 bf1);

        @Binds
        /* renamed from: c */
        public abstract DF1 m58085c(EF1 ef1);
    }

    public HardCountDetailsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC47941rF1 m58088j0() {
        InterfaceC47941rF1 interfaceC47941rF1 = this.f64065B;
        if (interfaceC47941rF1 != null) {
            return interfaceC47941rF1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if ((i == 10001 || i == 10003) && intent != null && (stringExtra = intent.getStringExtra("vehicle_serial")) != null) {
            m58088j0().mo16154b(stringExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(C40514ej4.activity_hard_count_details);
        InterfaceC14872a.InterfaceC14873a m58084a = C14875a.m58084a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        TextView textView = (TextView) findViewById(C48203rh4.scanCount);
        RecyclerView recyclerView = (RecyclerView) findViewById(C48203rh4.recyclerView);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C48203rh4.troubleshootingTipsContainer);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "findViewById(R.id.recyclerView)");
        Intrinsics.checkNotNullExpressionValue(textView, "findViewById(R.id.scanCount)");
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "findViewById(R.id.troubleshootingTipsContainer)");
        m58084a.mo58083a(m21419a, this, m45197b, recyclerView, textView, constraintLayout).mo58082a(this);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("scan_identifiers");
        InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory = (InventoryScanningIdentifierCategory) getIntent().getParcelableExtra("identifier_category");
        int[] intArrayExtra = getIntent().getIntArrayExtra("scan_ids");
        if (stringArrayListExtra != null && inventoryScanningIdentifierCategory != null) {
            m58088j0().mo16155a(stringArrayListExtra, inventoryScanningIdentifierCategory);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                if (inventoryScanningIdentifierCategory == InventoryScanningIdentifierCategory.PENDING) {
                    string = getString(C45871nl4.hard_count_pending_uploads);
                } else {
                    string = getString(C45871nl4.hard_count_unidentifiable_scans);
                }
                supportActionBar.mo70242E(string);
            }
        } else if (intArrayExtra != null) {
            m58088j0().mo16153c(intArrayExtra);
        }
    }
}
