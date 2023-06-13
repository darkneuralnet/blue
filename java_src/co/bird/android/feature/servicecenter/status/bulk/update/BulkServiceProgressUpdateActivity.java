package co.bird.android.feature.servicecenter.status.bulk.update;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.navigator.FailedBatchUpdateResult;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
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
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Ls50;", "B", "Ls50;", "j0", "()Ls50;", "setPresenter", "(Ls50;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressUpdateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressUpdateActivity.kt\nco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,91:1\n44#2:92\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressUpdateActivity.kt\nco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity\n*L\n39#1:92\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkServiceProgressUpdateActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC48437s50 f65539B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity$a;", "", "Lco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15713b.class})
    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15711a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lb6;", "binding", "Lco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15712a {
            /* renamed from: a */
            InterfaceC15711a mo56704a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C12291b6 c12291b6);
        }

        /* renamed from: a */
        void mo56711a(BulkServiceProgressUpdateActivity bulkServiceProgressUpdateActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdateActivity$b;", "", "LmE;", "impl", "LlE;", C17296a.f69688o, "LD50;", "Ls50;", "b", "Lq50;", "Lo50;", "c", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15713b {
        @Binds
        /* renamed from: a */
        InterfaceC25660lE m56715a(C26017mE c26017mE);

        @Binds
        /* renamed from: b */
        InterfaceC48437s50 m56714b(D50 d50);

        @Binds
        /* renamed from: c */
        InterfaceC46066o50 m56713c(C47252q50 c47252q50);
    }

    public BulkServiceProgressUpdateActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC48437s50 m56716j0() {
        InterfaceC48437s50 interfaceC48437s50 = this.f65539B;
        if (interfaceC48437s50 != null) {
            return interfaceC48437s50;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        FailedBatchUpdateResult failedBatchUpdateResult;
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            failedBatchUpdateResult = (FailedBatchUpdateResult) X52.m77423b(intent);
        } else {
            failedBatchUpdateResult = null;
        }
        InterfaceC48437s50 m56716j0 = m56716j0();
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        m56716j0.mo14798b(i, z, failedBatchUpdateResult);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12291b6 m64975c = C12291b6.m64975c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m64975c, "inflate(layoutInflater)");
        setContentView(m64975c.getRoot());
        InterfaceC15711a.InterfaceC15712a m56712a = C15714a.m56712a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56712a.mo56704a(m21419a, this, m45197b, m64975c).mo56711a(this);
        mo58977D();
        String stringExtra = getIntent().getStringExtra(AnalyticsFields.SESSION_ID);
        Intrinsics.checkNotNull(stringExtra);
        m56716j0().mo14799a(stringExtra);
    }
}
