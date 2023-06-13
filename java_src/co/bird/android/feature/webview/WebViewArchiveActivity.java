package co.bird.android.feature.webview;

import android.app.Application;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/webview/WebViewArchiveActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onBackPressed", "Lco/bird/android/feature/webview/c;", "B", "Lco/bird/android/feature/webview/c;", "j0", "()Lco/bird/android/feature/webview/c;", "setPresenter", "(Lco/bird/android/feature/webview/c;)V", "presenter", "<init>", "()V", C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebViewArchiveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewArchiveActivity.kt\nco/bird/android/feature/webview/WebViewArchiveActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,61:1\n44#2:62\n*S KotlinDebug\n*F\n+ 1 WebViewArchiveActivity.kt\nco/bird/android/feature/webview/WebViewArchiveActivity\n*L\n28#1:62\n*E\n"})
/* loaded from: classes3.dex */
public final class WebViewArchiveActivity extends BaseActivity {

    /* renamed from: B */
    public C15907c f65890B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/webview/WebViewArchiveActivity$a;", "", "Lco/bird/android/feature/webview/WebViewArchiveActivity;", "activity", "", C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.webview.WebViewArchiveActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15899a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/webview/WebViewArchiveActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/feature/webview/WebViewArchiveActivity$a;", C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.webview.WebViewArchiveActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15900a {
            /* renamed from: a */
            InterfaceC15899a mo56300a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider);
        }

        /* renamed from: a */
        void mo56299a(WebViewArchiveActivity webViewArchiveActivity);
    }

    public WebViewArchiveActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C15907c m56307j0() {
        C15907c c15907c = this.f65890B;
        if (c15907c != null) {
            return c15907c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!m56307j0().m56292d()) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C36846Wj4.activity_archive_webview);
        InterfaceC15899a.InterfaceC15900a m56301a = C15904b.m56301a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56301a.mo56300a(m21419a, this, m45197b).mo56299a(this);
        m56307j0().m56285k(getIntent().getStringExtra("co.bird.android.web_archive_name"));
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56307j0().m56284l();
    }
}
