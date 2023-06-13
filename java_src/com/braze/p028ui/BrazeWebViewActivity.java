package com.braze.p028ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.CoreConstants;
import com.appboy.enums.Channel;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http2.Http2Connection;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m28432d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "createWebChromeClient", "Landroid/webkit/WebChromeClient;", "createWebViewClient", "Landroid/webkit/WebViewClient;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.braze.ui.BrazeWebViewActivity */
/* loaded from: classes4.dex */
public class BrazeWebViewActivity extends FragmentActivity {

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, m28432d2 = {"com/braze/ui/BrazeWebViewActivity$a", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/ConsoleMessage;", "cm", "", "onConsoleMessage", "Landroid/graphics/Bitmap;", "getDefaultVideoPoster", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.BrazeWebViewActivity$a */
    /* loaded from: classes4.dex */
    public static final class C17072a extends WebChromeClient {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.ui.BrazeWebViewActivity$a$a */
        /* loaded from: classes4.dex */
        public static final class C17073a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ ConsoleMessage f69034g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17073a(ConsoleMessage consoleMessage) {
                super(0);
                this.f69034g = consoleMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Braze WebView Activity log. Line: " + this.f69034g.lineNumber() + ". SourceId: " + ((Object) this.f69034g.sourceId()) + ". Log Level: " + this.f69034g.messageLevel() + ". Message: " + ((Object) this.f69034g.message());
            }
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage cm) {
            Intrinsics.checkNotNullParameter(cm, "cm");
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C17073a(cm), 7, null);
            return true;
        }
    }

    public WebChromeClient createWebChromeClient() {
        return new C17072a();
    }

    public WebViewClient createWebViewClient() {
        return new C17074b();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        setContentView(R$layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(R$id.com_braze_webview_activity_webview);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        if (C36938Wt6.m77737g(applicationContext)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (i >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("url")) != null) {
            webView.loadUrl(string);
        }
    }

    @Metadata(m28433d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28432d2 = {"com/braze/ui/BrazeWebViewActivity$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "", "url", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.BrazeWebViewActivity$b */
    /* loaded from: classes4.dex */
    public static final class C17074b extends WebViewClient {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.ui.BrazeWebViewActivity$b$a */
        /* loaded from: classes4.dex */
        public static final class C17075a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f69036g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17075a(String str) {
                super(0);
                this.f69036g = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Unexpected exception while processing url " + this.f69036g + ". Passing url back to WebView.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.ui.BrazeWebViewActivity$b$b */
        /* loaded from: classes4.dex */
        public static final class C17076b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17076b f69037g = new C17076b();

            public C17076b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "The webview rendering process crashed, returning true";
            }
        }

        public C17074b() {
        }

        /* renamed from: a */
        public final Boolean m53218a(Context context, String str) {
            boolean contains;
            try {
                contains = CollectionsKt___CollectionsKt.contains(C38903c20.f59898b, Uri.parse(str).getScheme());
                if (contains) {
                    return null;
                }
                C32132Cf6 mo44325b = C38310b20.f56803a.m65097a().mo44325b(str, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                if (mo44325b != null) {
                    mo44325b.mo44583a(context);
                    BrazeWebViewActivity.this.finish();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C17075a(str), 4, null);
                return null;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(detail, "detail");
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C17076b.f69037g, 6, null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            String uri = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()");
            Boolean m53218a = m53218a(context, uri);
            return m53218a == null ? super.shouldOverrideUrlLoading(view, request) : m53218a.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            Boolean m53218a = m53218a(context, url);
            return m53218a == null ? super.shouldOverrideUrlLoading(view, url) : m53218a.booleanValue();
        }
    }
}
