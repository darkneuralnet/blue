package co.bird.android.feature.repair.p014v1.search;

import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/search/RepairSearchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LEC4;", "B", "LEC4;", "j0", "()LEC4;", "setPresenter", "(LEC4;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchActivity.kt\nco/bird/android/feature/repair/v1/search/RepairSearchActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,84:1\n44#2:85\n*S KotlinDebug\n*F\n+ 1 RepairSearchActivity.kt\nco/bird/android/feature/repair/v1/search/RepairSearchActivity\n*L\n41#1:85\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v1.search.RepairSearchActivity */
/* loaded from: classes3.dex */
public final class RepairSearchActivity extends BaseActivity {

    /* renamed from: C */
    public static final C15197a f64610C = new C15197a(null);

    /* renamed from: B */
    public EC4 f64611B;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/search/RepairSearchActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.repair.v1.search.RepairSearchActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15197a {
        public /* synthetic */ C15197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15197a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/search/RepairSearchActivity$b;", "", "Lco/bird/android/feature/repair/v1/search/RepairSearchActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15200c.class})
    /* renamed from: co.bird.android.feature.repair.v1.search.RepairSearchActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15198b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/search/RepairSearchActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Li5;", "binding", "Lco/bird/android/feature/repair/v1/search/RepairSearchActivity$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v1.search.RepairSearchActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15199a {
            /* renamed from: a */
            InterfaceC15198b mo57563a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C23123i5 c23123i5);
        }

        /* renamed from: a */
        void mo57562a(RepairSearchActivity repairSearchActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/search/RepairSearchActivity$c;", "", "LWC4;", "impl", "LSC4;", C17296a.f69688o, "LQC4;", "LEC4;", "c", "LBC4;", "LzC4;", "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.repair.v1.search.RepairSearchActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC15200c {
        @Binds
        /* renamed from: a */
        SC4 m57567a(WC4 wc4);

        @Binds
        /* renamed from: b */
        InterfaceC52659zC4 m57566b(BC4 bc4);

        @Binds
        /* renamed from: c */
        EC4 m57565c(QC4 qc4);
    }

    public RepairSearchActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final EC4 m57568j0() {
        EC4 ec4 = this.f64611B;
        if (ec4 != null) {
            return ec4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23123i5 m34490c = C23123i5.m34490c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m34490c, "inflate(layoutInflater)");
        setContentView(m34490c.getRoot());
        InterfaceC15198b.InterfaceC15199a m57564a = C15201a.m57564a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57564a.mo57563a(m21419a, this, m45197b, m34490c).mo57562a(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("issues");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("repairs");
        Intrinsics.checkNotNull(parcelableArrayListExtra2);
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("previously_selected_repairs");
        Intrinsics.checkNotNull(parcelableArrayListExtra3);
        m57568j0().mo88780a(parcelableArrayListExtra, parcelableArrayListExtra2, parcelableArrayListExtra3);
    }
}
