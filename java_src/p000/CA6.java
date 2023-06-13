package p000;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.S74;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LCA6;", "LxE;", "LS74;", "", "title", "", "Pl", "url", "Rl", "", "show", "", "hiddenState", "showProgress", "Ql", "Landroid/view/View;", "b", "Landroid/view/View;", "loadingView", "Landroid/webkit/WebView;", "c", "Landroid/webkit/WebView;", "webView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CA6 */
/* loaded from: classes3.dex */
public final class CA6 extends AbstractC30071xE {

    /* renamed from: d */
    public static final C0917a f3553d = new C0917a(null);

    /* renamed from: b */
    public final View f3554b;

    /* renamed from: c */
    public final WebView f3555c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LCA6$a;", "", "", "EMAIL_ADDRESS_SCHEME", "Ljava/lang/String;", "PHONE_NUMBER_SCHEME", "<init>", "()V", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CA6$a */
    /* loaded from: classes3.dex */
    public static final class C0917a {
        public /* synthetic */ C0917a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0917a() {
        }
    }

    @Metadata(m28433d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, m28432d2 = {"CA6$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CA6$b */
    /* loaded from: classes3.dex */
    public static final class C0918b extends WebViewClient {
        public C0918b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageFinished(view, str);
            S74.C7343a.showProgress$default(CA6.this, false, 0, 2, null);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String str, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onPageStarted(view, str, bitmap);
            S74.C7343a.showProgress$default(CA6.this, true, 0, 2, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            String scheme = request.getUrl().getScheme();
            if (scheme != null) {
                int hashCode = scheme.hashCode();
                if (hashCode != -1081572750) {
                    if (hashCode == 114715 && scheme.equals("tel")) {
                        Intent intent = new Intent("android.intent.action.DIAL", request.getUrl());
                        if (intent.resolveActivity(CA6.this.getActivity().getPackageManager()) != null) {
                            CA6.this.getActivity().startActivity(intent);
                        } else {
                            CA6.this.snackToast(C45871nl4.no_dialer_message);
                        }
                        return true;
                    }
                } else if (scheme.equals("mailto")) {
                    Intent intent2 = new Intent("android.intent.action.SENDTO", request.getUrl());
                    if (intent2.resolveActivity(CA6.this.getActivity().getPackageManager()) != null) {
                        CA6.this.getActivity().startActivity(intent2);
                    } else {
                        CA6.this.snackToast(C45871nl4.no_email_client_message);
                    }
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(view, request);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CA6(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f3554b = C40788fB0.m41779c(activity, C43469ji4.loadingGroup);
        this.f3555c = (WebView) C40788fB0.m41779c(activity, C43469ji4.webView);
    }

    /* renamed from: Pl */
    public final void m112668Pl(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getActivity().setTitle(title);
    }

    /* renamed from: Ql */
    public final boolean m112667Ql() {
        boolean canGoBack = this.f3555c.canGoBack();
        if (canGoBack) {
            this.f3555c.goBack();
        }
        return canGoBack;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: Rl */
    public final void m112666Rl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f3555c.loadUrl(url);
        this.f3555c.getSettings().setDomStorageEnabled(true);
        this.f3555c.getSettings().setJavaScriptEnabled(true);
        this.f3555c.setWebViewClient(new C0918b());
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        C49520tu6.m11232s(this.f3554b, z, 8);
    }
}
