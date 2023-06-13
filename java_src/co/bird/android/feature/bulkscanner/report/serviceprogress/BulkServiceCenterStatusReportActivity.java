package co.bird.android.feature.bulkscanner.report.serviceprogress;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LM40;", "B", "LM40;", "j0", "()LM40;", "setPresenter", "(LM40;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceCenterStatusReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceCenterStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,76:1\n44#2:77\n*S KotlinDebug\n*F\n+ 1 BulkServiceCenterStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity\n*L\n35#1:77\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkServiceCenterStatusReportActivity extends BaseActivity {

    /* renamed from: B */
    public M40 f63440B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a;", "", "Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity;", "activity", "", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C14612b.class})
    /* renamed from: co.bird.android.feature.bulkscanner.report.serviceprogress.BulkServiceCenterStatusReportActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14610a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b;", "bulkServiceCenterBindings", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lf3;", "binding", "Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$a;", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.bulkscanner.report.serviceprogress.BulkServiceCenterStatusReportActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14611a {
            /* renamed from: a */
            InterfaceC14610a mo58615a(InterfaceC44393lG2 interfaceC44393lG2, C14612b c14612b, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C20179f3 c20179f3);
        }

        /* renamed from: a */
        void mo58625a(BulkServiceCenterStatusReportActivity bulkServiceCenterStatusReportActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b;", "", "<init>", "()V", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC14613a.class})
    /* renamed from: co.bird.android.feature.bulkscanner.report.serviceprogress.BulkServiceCenterStatusReportActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14612b {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportActivity$b$a;", "", "LV40;", "impl", "LU40;", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.feature.bulkscanner.report.serviceprogress.BulkServiceCenterStatusReportActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14613a {
            @Binds
            /* renamed from: a */
            U40 m58627a(V40 v40);
        }
    }

    public BulkServiceCenterStatusReportActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final M40 m58628j0() {
        M40 m40 = this.f63440B;
        if (m40 != null) {
            return m40;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20179f3 m42235c = C20179f3.m42235c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m42235c, "inflate(layoutInflater)");
        setContentView(m42235c.getRoot());
        mo58977D();
        InterfaceC14610a.InterfaceC14611a m58626a = C14614a.m58626a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        C14612b c14612b = new C14612b();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58626a.mo58615a(m21419a, c14612b, this, m45197b, m42235c).mo58625a(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("service_center_status");
        Intrinsics.checkNotNull(parcelableExtra);
        String stringExtra = getIntent().getStringExtra("notes");
        String stringExtra2 = getIntent().getStringExtra(AnalyticsFields.SESSION_ID);
        Intrinsics.checkNotNull(stringExtra2);
        m58628j0().m95863v((WireServiceCenterStatus) parcelableExtra, stringExtra, stringExtra2);
    }
}
