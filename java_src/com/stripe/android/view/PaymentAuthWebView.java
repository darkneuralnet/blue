package com.stripe.android.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0003J\b\u0010\u0012\u001a\u00020\u000bH\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebView;", "Landroid/webkit/WebView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onLoadBlank", "Lkotlin/Function0;", "", "getOnLoadBlank$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setOnLoadBlank$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "cleanup", "configureSettings", "destroy", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentAuthWebView extends WebView {
    private Function0<Unit> onLoadBlank;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentAuthWebView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void cleanup() {
        clearHistory();
        this.onLoadBlank.invoke();
        loadUrl(PaymentAuthWebViewClient.BLANK_PAGE);
        onPause();
        removeAllViews();
        destroyDrawingCache();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void configureSettings() {
        String userAgent$default = RequestHeadersFactory.Companion.getUserAgent$default(RequestHeadersFactory.Companion, null, 1, null);
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        settings.setUserAgentString(userAgentString + " [" + userAgent$default + "]");
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        cleanup();
        super.destroy();
    }

    public final Function0<Unit> getOnLoadBlank$payments_core_release() {
        return this.onLoadBlank;
    }

    public final void setOnLoadBlank$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onLoadBlank = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PaymentAuthWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentAuthWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onLoadBlank = PaymentAuthWebView$onLoadBlank$1.INSTANCE;
        configureSettings();
    }
}
