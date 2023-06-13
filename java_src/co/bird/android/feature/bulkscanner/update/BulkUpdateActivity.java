package co.bird.android.feature.bulkscanner.update;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.OperatorScanIntent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/update/BulkUpdateActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LV60;", "B", "LV60;", "j0", "()LV60;", "setPresenter", "(LV60;)V", "presenter", "<init>", "()V", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkUpdateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkUpdateActivity.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdateActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,70:1\n44#2:71\n*S KotlinDebug\n*F\n+ 1 BulkUpdateActivity.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdateActivity\n*L\n33#1:71\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkUpdateActivity extends BaseActivity {

    /* renamed from: B */
    public V60 f63571B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/update/BulkUpdateActivity$a;", "", "Lco/bird/android/feature/bulkscanner/update/BulkUpdateActivity;", "activity", "", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.bulkscanner.update.BulkUpdateActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14664a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/update/BulkUpdateActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lw4;", "binding", "Lco/bird/android/feature/bulkscanner/update/BulkUpdateActivity$a;", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.bulkscanner.update.BulkUpdateActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14665a {
            /* renamed from: a */
            InterfaceC14664a mo58536a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C29751w4 c29751w4);
        }

        /* renamed from: a */
        void mo58540a(BulkUpdateActivity bulkUpdateActivity);
    }

    public BulkUpdateActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final V60 m58542j0() {
        V60 v60 = this.f63571B;
        if (v60 != null) {
            return v60;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m58542j0().m80413h(i, i2, intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo58957w().mo37030e3();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C29751w4 m7512c = C29751w4.m7512c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m7512c, "inflate(layoutInflater)");
        setContentView(m7512c.getRoot());
        mo58977D();
        InterfaceC14664a.InterfaceC14665a m58541a = C14666a.m58541a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58541a.mo58536a(m21419a, this, m45197b, m7512c).mo58540a(this);
        String stringExtra = getIntent().getStringExtra(AnalyticsFields.SESSION_ID);
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("co.bird.android.ops_batch_job_trip_stop_id");
        String stringExtra3 = getIntent().getStringExtra("bulk_scan_intent");
        if (stringExtra3 == null) {
            stringExtra3 = OperatorScanIntent.SCAN.name();
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra3, "intent.getStringExtra(Ex…ratorScanIntent.SCAN.name");
        m58542j0().m80412i(stringExtra, stringExtra2, OperatorScanIntent.valueOf(stringExtra3));
    }
}
