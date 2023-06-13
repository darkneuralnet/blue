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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/webview/WebViewActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LyA6;", "B", "LyA6;", "j0", "()LyA6;", "setPresenter", "(LyA6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewActivity.kt\nco/bird/android/feature/webview/WebViewActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,61:1\n44#2:62\n*S KotlinDebug\n*F\n+ 1 WebViewActivity.kt\nco/bird/android/feature/webview/WebViewActivity\n*L\n28#1:62\n*E\n"})
/* loaded from: classes3.dex */
public final class WebViewActivity extends BaseActivity {

    /* renamed from: B */
    public C52050yA6 f65889B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/webview/WebViewActivity$a;", "", "Lco/bird/android/feature/webview/WebViewActivity;", "activity", "", C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.webview.WebViewActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15897a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/webview/WebViewActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCA6;", "webViewUi", "Lco/bird/android/feature/webview/WebViewActivity$a;", C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.webview.WebViewActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15898a {
            /* renamed from: a */
            InterfaceC15897a mo56305a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance CA6 ca6);
        }

        /* renamed from: a */
        void mo56304a(WebViewActivity webViewActivity);
    }

    public WebViewActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C52050yA6 m56308j0() {
        C52050yA6 c52050yA6 = this.f65889B;
        if (c52050yA6 != null) {
            return c52050yA6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!m56308j0().m3898c()) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C36846Wj4.activity_webview_standalone);
        InterfaceC15897a.InterfaceC15898a m56306a = C15901a.m56306a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56306a.mo56305a(m21419a, this, m45197b, new CA6(this)).mo56304a(this);
        C52050yA6 m56308j0 = m56308j0();
        String stringExtra = getIntent().getStringExtra("url");
        Intrinsics.checkNotNull(stringExtra);
        m56308j0.m3897d(stringExtra, getIntent().getStringExtra("activity_title"), getIntent().getBooleanExtra("zendesk_redirect_url", false));
    }
}
