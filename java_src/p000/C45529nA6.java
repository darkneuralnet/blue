package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.lib.webview.core.BaseWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.S74;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LnA6;", "LxE;", "LS74;", "", "url", "", "Sl", "", "Ql", "title", "t", "show", "", "hiddenState", "showProgress", "Landroid/view/View;", "b", "Landroid/view/View;", "loadingView", "Lco/bird/android/lib/webview/core/BaseWebView;", "c", "Lco/bird/android/lib/webview/core/BaseWebView;", "webView", "LUz6;", "Rl", "()LUz6;", "webBridge", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nA6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45529nA6 extends AbstractC30071xE {

    /* renamed from: b */
    public final View f99558b;

    /* renamed from: c */
    public final BaseWebView f99559c;

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"nA6$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: nA6$a */
    /* loaded from: classes3.dex */
    public static final class C26420a extends WebViewClient {
        public C26420a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageFinished(view, str);
            S74.C7343a.showProgress$default(C45529nA6.this, false, 0, 2, null);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String str, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageStarted(view, str, bitmap);
            S74.C7343a.showProgress$default(C45529nA6.this, true, 0, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45529nA6(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f99558b = C40788fB0.m41779c(activity, C43469ji4.loadingGroup);
        BaseWebView baseWebView = (BaseWebView) C40788fB0.m41779c(activity, C43469ji4.webView);
        this.f99559c = baseWebView;
        baseWebView.getSettings().setDomStorageEnabled(true);
        baseWebView.getSettings().setJavaScriptEnabled(true);
        baseWebView.getSettings().setBlockNetworkLoads(false);
        baseWebView.getSettings().setAllowFileAccess(true);
        baseWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        baseWebView.getSettings().setAllowFileAccessFromFileURLs(true);
        baseWebView.setWebViewClient(new C26420a());
    }

    /* renamed from: Tl */
    public static final void m24230Tl(ActionBar actionBar, String title) {
        Intrinsics.checkNotNullParameter(actionBar, "$actionBar");
        Intrinsics.checkNotNullParameter(title, "$title");
        actionBar.mo70242E(title);
    }

    /* renamed from: Ql */
    public final boolean m24233Ql() {
        boolean canGoBack = this.f99559c.canGoBack();
        if (canGoBack) {
            this.f99559c.goBack();
        }
        return canGoBack;
    }

    /* renamed from: Rl */
    public final InterfaceC36524Uz6 m24232Rl() {
        return this.f99559c;
    }

    /* renamed from: Sl */
    public final void m24231Sl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f99559c.loadUrl(url);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        C49520tu6.m11232s(this.f99558b, z, 8);
    }

    /* renamed from: t */
    public final void m24229t(final String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        final ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: mA6
                @Override // java.lang.Runnable
                public final void run() {
                    C45529nA6.m24230Tl(ActionBar.this, title);
                }
            });
        }
    }
}
