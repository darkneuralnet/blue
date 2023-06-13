package com.stripe.android.stripe3ds2.views;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient;", "Landroid/webkit/WebViewClient;", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "getListener$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "setListener$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;)V", "handleFormSubmitUrl", "", "uri", "Landroid/net/Uri;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "shouldNotInterceptUrl", "", "shouldOverrideUrlLoading", "Companion", "OnHtmlSubmitListener", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ThreeDS2WebViewClient extends WebViewClient {
    public static final String CHALLENGE_URL = "https://emv3ds/challenge";
    public static final Companion Companion = new Companion(null);
    private OnHtmlSubmitListener listener;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$Companion;", "", "()V", "CHALLENGE_URL", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "", "onHtmlSubmit", "", MessageExtension.FIELD_DATA, "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface OnHtmlSubmitListener {
        void onHtmlSubmit(String str);
    }

    public final OnHtmlSubmitListener getListener$3ds2sdk_release() {
        return this.listener;
    }

    public final void handleFormSubmitUrl(Uri uri) {
        boolean startsWith$default;
        OnHtmlSubmitListener onHtmlSubmitListener;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = uri2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(lowerCase, CHALLENGE_URL, false, 2, null);
        if (startsWith$default && (onHtmlSubmitListener = this.listener) != null) {
            onHtmlSubmitListener.onHtmlSubmit(uri.getQuery());
        }
    }

    public final void setListener$3ds2sdk_release(OnHtmlSubmitListener onHtmlSubmitListener) {
        this.listener = onHtmlSubmitListener;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        handleFormSubmitUrl(url);
        Uri url2 = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "request.url");
        if (shouldNotInterceptUrl(url2)) {
            return super.shouldInterceptRequest(view, request);
        }
        return new WebResourceResponse(null, null, null);
    }

    public final boolean shouldNotInterceptUrl(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return URLUtil.isDataUrl(uri.toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        handleFormSubmitUrl(url);
        return true;
    }
}
