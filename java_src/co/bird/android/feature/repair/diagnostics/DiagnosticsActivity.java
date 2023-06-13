package co.bird.android.feature.repair.diagnostics;

import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/repair/diagnostics/DiagnosticsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lk31;", "B", "Lk31;", "j0", "()Lk31;", "setPresenter", "(Lk31;)V", "presenter", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDiagnosticsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsActivity.kt\nco/bird/android/feature/repair/diagnostics/DiagnosticsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n44#2:57\n1#3:58\n*S KotlinDebug\n*F\n+ 1 DiagnosticsActivity.kt\nco/bird/android/feature/repair/diagnostics/DiagnosticsActivity\n*L\n30#1:57\n*E\n"})
/* loaded from: classes3.dex */
public final class DiagnosticsActivity extends BaseActivity {

    /* renamed from: B */
    public C43675k31 f64562B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/diagnostics/DiagnosticsActivity$a;", "", "Lco/bird/android/feature/repair/diagnostics/DiagnosticsActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.repair.diagnostics.DiagnosticsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15166a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/diagnostics/DiagnosticsActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lw3;", "binding", "Lco/bird/android/feature/repair/diagnostics/DiagnosticsActivity$a;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.diagnostics.DiagnosticsActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15167a {
            /* renamed from: a */
            InterfaceC15166a mo57605a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C29744w3 c29744w3);
        }

        /* renamed from: a */
        void mo57610a(DiagnosticsActivity diagnosticsActivity);
    }

    public DiagnosticsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C43675k31 m57612j0() {
        C43675k31 c43675k31 = this.f64562B;
        if (c43675k31 != null) {
            return c43675k31;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C29744w3 m7539c = C29744w3.m7539c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m7539c, "inflate(layoutInflater)");
        setContentView(m7539c.getRoot());
        InterfaceC15166a.InterfaceC15167a m57611a = C15168a.m57611a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57611a.mo57605a(m21419a, this, m45197b, m7539c).mo57610a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (wireBird != null) {
                str = wireBird.getCode();
            } else {
                str = null;
            }
            supportActionBar.mo70242E("#" + str);
        }
        if (wireBird != null) {
            m57612j0().m29404e(wireBird);
        }
    }
}
