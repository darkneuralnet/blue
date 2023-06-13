package co.bird.android.feature.bulkscanner.report.regular;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.OperatorRole;
import co.bird.android.model.User;
import co.bird.android.model.constant.AnnouncementContext;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41707gk1;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Ln60;", "B", "Ln60;", "k0", "()Ln60;", "setPresenter", "(Ln60;)V", "presenter", "Luk1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Luk1;", "j0", "()Luk1;", "setAnnouncementPresenterFactory", "(Luk1;)V", "announcementPresenterFactory", "LRh6;", "D", "LRh6;", "m0", "()LRh6;", "setUserStream", "(LRh6;)V", "userStream", "<init>", "()V", C17296a.f69688o, "b", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkStatusReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n44#2:93\n1549#3:94\n1620#3,3:95\n*S KotlinDebug\n*F\n+ 1 BulkStatusReportActivity.kt\nco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity\n*L\n41#1:93\n53#1:94\n53#1:95,3\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkStatusReportActivity extends BaseActivity {

    /* renamed from: B */
    public C45483n60 f63405B;

    /* renamed from: C */
    public InterfaceC50008uk1 f63406C;

    /* renamed from: D */
    public InterfaceC35660Rh6 f63407D;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$a;", "", "LI60;", "impl", "LH60;", "b", "Lxk1;", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14594a {
        @Binds
        /* renamed from: a */
        InterfaceC51786xk1 m58647a(I60 i60);

        @Binds
        /* renamed from: b */
        H60 m58646b(I60 i60);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b;", "", "Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity;", "activity", "", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC14594a.class})
    /* renamed from: co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14595b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lf3;", "binding", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "Lco/bird/android/feature/bulkscanner/report/regular/BulkStatusReportActivity$b;", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14596a {
            /* renamed from: a */
            InterfaceC14595b mo58629a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C20179f3 c20179f3, @BindsInstance FragmentManager fragmentManager, @BindsInstance AbstractC11719f abstractC11719f);
        }

        /* renamed from: a */
        void mo58644a(BulkStatusReportActivity bulkStatusReportActivity);
    }

    public BulkStatusReportActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC50008uk1 m58650j0() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f63406C;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("announcementPresenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final C45483n60 m58649k0() {
        C45483n60 c45483n60 = this.f63405B;
        if (c45483n60 != null) {
            return c45483n60;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: m0 */
    public final InterfaceC35660Rh6 m58648m0() {
        InterfaceC35660Rh6 interfaceC35660Rh6 = this.f63407D;
        if (interfaceC35660Rh6 != null) {
            return interfaceC35660Rh6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStream");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo58957w().mo37030e3();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        List<OperatorRole> operatorRoles;
        int collectionSizeOrDefault;
        super.onCreate(bundle);
        C20179f3 m42235c = C20179f3.m42235c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m42235c, "inflate(layoutInflater)");
        setContentView(m42235c.getRoot());
        mo58977D();
        InterfaceC14595b.InterfaceC14596a m58645a = C14597a.m58645a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        AbstractC11719f lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        m58645a.mo58629a(m21419a, this, m45197b, m42235c, supportFragmentManager, lifecycle).mo58644a(this);
        C45483n60 m58649k0 = m58649k0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m58649k0.m24462L(intent);
        InterfaceC50008uk1 m58650j0 = m58650j0();
        AnnouncementContext announcementContext = AnnouncementContext.BULK_SCANNER_STATUS;
        User mo76584a = m58648m0().mo76584a();
        if (mo76584a != null && (operatorRoles = mo76584a.getOperatorRoles()) != null) {
            List<OperatorRole> list = operatorRoles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorRole operatorRole : list) {
                arrayList.add(operatorRole.getRole());
            }
        } else {
            arrayList = null;
        }
        m58650j0.mo8210a(null, announcementContext, new C41707gk1.C22436h(null, null, null, arrayList, 7, null));
    }
}
