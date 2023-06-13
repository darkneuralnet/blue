package com.braze.p028ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.amazonaws.services.p026s3.util.Mimetypes;
import com.stripe.android.view.PaymentAuthWebViewClient;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView */
/* loaded from: classes5.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements EO1 {
    private static final String TAG = C43664k20.m29433n(InAppMessageHtmlBaseView.class);
    private EZ1 mInAppMessageWebViewClient;
    private boolean mIsFinished;
    protected WebView mMessageWebView;

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$a */
    /* loaded from: classes5.dex */
    public class C17095a extends WebChromeClient {
        public C17095a() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str = InAppMessageHtmlBaseView.TAG;
            C43664k20.m29438i(str, "Braze HTML In-app Message log. Line: " + consoleMessage.lineNumber() + ". SourceId: " + consoleMessage.sourceId() + ". Log Level: " + consoleMessage.messageLevel() + ". Message: " + consoleMessage.message());
            return true;
        }
    }

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsFinished = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isInTouchMode() && keyEvent.getKeyCode() == 4 && C42478i20.m35358s().m6655e()) {
            DZ1.m110187a();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void finishWebViewDisplay() {
        C43664k20.m29438i(TAG, "Finishing WebView display");
        this.mIsFinished = true;
        WebView webView = this.mMessageWebView;
        if (webView != null) {
            webView.loadUrl(PaymentAuthWebViewClient.BLANK_PAGE);
            this.mMessageWebView.onPause();
            this.mMessageWebView.removeAllViews();
            this.mMessageWebView = null;
        }
    }

    @Override // p000.EO1
    public View getMessageClickableView() {
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView getMessageWebView() {
        if (this.mIsFinished) {
            C43664k20.m29421z(TAG, "Cannot return the WebView for an already finished message");
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            C43664k20.m29438i(TAG, "Cannot find WebView. getWebViewViewId() returned 0.");
            return null;
        }
        WebView webView = this.mMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        this.mMessageWebView = webView2;
        if (webView2 == null) {
            String str = TAG;
            C43664k20.m29438i(str, "findViewById for " + webViewViewId + " returned null. Returning null for WebView.");
            return null;
        }
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        this.mMessageWebView.setLayerType(2, null);
        this.mMessageWebView.setBackgroundColor(0);
        try {
            if (C47308qA6.m17997a("FORCE_DARK") && C36938Wt6.m77737g(getContext())) {
                C38989cA6.m61804b(settings, 2);
            }
            if (C47308qA6.m17997a("FORCE_DARK_STRATEGY")) {
                C38989cA6.m61803c(settings, 1);
            }
        } catch (Throwable th) {
            C43664k20.m29434m(TAG, "Failed to set dark mode WebView settings", th);
        }
        this.mMessageWebView.setWebChromeClient(new C17095a());
        return this.mMessageWebView;
    }

    public abstract int getWebViewViewId();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && C42478i20.m35358s().m6655e()) {
            DZ1.m110187a();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHtmlPageFinishedListener(InterfaceC46845pP1 interfaceC46845pP1) {
        EZ1 ez1 = this.mInAppMessageWebViewClient;
        if (ez1 != null) {
            ez1.m108816e(interfaceC46845pP1);
        }
    }

    public void setInAppMessageWebViewClient(EZ1 ez1) {
        getMessageWebView().setWebViewClient(ez1);
        this.mInAppMessageWebViewClient = ez1;
    }

    public void setWebViewContent(String str, String str2) {
        WebView messageWebView = getMessageWebView();
        messageWebView.loadDataWithBaseURL("file://" + str2 + "/", str, Mimetypes.MIMETYPE_HTML, "utf-8", null);
    }

    public void setWebViewContent(String str) {
        getMessageWebView().loadDataWithBaseURL("file:///", str, Mimetypes.MIMETYPE_HTML, "utf-8", null);
    }
}
