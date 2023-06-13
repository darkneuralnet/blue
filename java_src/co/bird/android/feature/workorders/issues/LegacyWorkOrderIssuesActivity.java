package co.bird.android.feature.workorders.issues;

import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LsF6;", "B", "LsF6;", "j0", "()LsF6;", "setPresenter", "(LsF6;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyWorkOrderIssuesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderIssuesActivity.kt\nco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,90:1\n44#2:91\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderIssuesActivity.kt\nco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity\n*L\n41#1:91\n*E\n"})
/* loaded from: classes3.dex */
public final class LegacyWorkOrderIssuesActivity extends BaseActivity {

    /* renamed from: C */
    public static final C15940a f65947C = new C15940a(null);

    /* renamed from: B */
    public InterfaceC48538sF6 f65948B;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15940a {
        public /* synthetic */ C15940a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15940a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity$b;", "", "Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15943c.class})
    /* renamed from: co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15941b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Ld4;", "binding", "Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity$b;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15942a {
            /* renamed from: a */
            InterfaceC15941b mo56234a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C19672d4 c19672d4);
        }

        /* renamed from: a */
        void mo56233a(LegacyWorkOrderIssuesActivity legacyWorkOrderIssuesActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/workorders/issues/LegacyWorkOrderIssuesActivity$c;", "", "LFF6;", "impl", "LEF6;", "c", "LCF6;", "LsF6;", "b", "LqF6;", "LoF6;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC15943c {
        @Binds
        /* renamed from: a */
        InterfaceC46167oF6 m56238a(C47353qF6 c47353qF6);

        @Binds
        /* renamed from: b */
        InterfaceC48538sF6 m56237b(CF6 cf6);

        @Binds
        /* renamed from: c */
        EF6 m56236c(FF6 ff6);
    }

    public LegacyWorkOrderIssuesActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC48538sF6 m56239j0() {
        InterfaceC48538sF6 interfaceC48538sF6 = this.f65948B;
        if (interfaceC48538sF6 != null) {
            return interfaceC48538sF6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19672d4 m44652c = C19672d4.m44652c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m44652c, "inflate(layoutInflater)");
        setContentView(m44652c.getRoot());
        mo58977D();
        InterfaceC15941b.InterfaceC15942a m56235a = C15944a.m56235a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56235a.mo56234a(m21419a, this, m45197b, m44652c).mo56233a(this);
        String stringExtra = getIntent().getStringExtra("category");
        Intrinsics.checkNotNull(stringExtra);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("issues");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("selected_issues");
        Intrinsics.checkNotNull(parcelableArrayListExtra2);
        m56239j0().mo14492a(stringExtra, parcelableArrayListExtra, parcelableArrayListExtra2);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(stringExtra);
        }
    }
}
