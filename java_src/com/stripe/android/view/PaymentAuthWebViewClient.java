package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.core.Logger;
import com.stripe.android.payments.DefaultReturnUrl;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 42\u00020\u0001:\u00014BY\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u0013\u0012\b\u00101\u001a\u0004\u0018\u00010\u0013\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020!\u0012\u0014\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020!¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010(\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00065"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient;", "Landroid/webkit/WebViewClient;", "", "hideProgressBar", "Landroid/net/Uri;", "uri", "openIntentScheme", "Landroid/content/Intent;", "intent", "openIntent", "updateCompletionUrl", "", "isReturnUrl", "isPredefinedReturnUrl", "", "error", "onAuthCompleted", "Landroid/webkit/WebView;", "view", "", "url", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "LuX2;", "isPageLoaded", "LuX2;", "clientSecret", "Ljava/lang/String;", "Lkotlin/Function1;", "activityStarter", "Lkotlin/jvm/functions/Function1;", "activityFinisher", "userReturnUri", "Landroid/net/Uri;", "<set-?>", "completionUrlParam", "getCompletionUrlParam", "()Ljava/lang/String;", "hasLoadedBlank", "Z", "getHasLoadedBlank$payments_core_release", "()Z", "setHasLoadedBlank$payments_core_release", "(Z)V", "returnUrl", "<init>", "(Lcom/stripe/android/core/Logger;LuX2;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentAuthWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewClient.kt\ncom/stripe/android/view/PaymentAuthWebViewClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentAuthWebViewClient extends WebViewClient {
    private static final Set<String> AUTHENTICATE_URLS;
    public static final String BLANK_PAGE = "about:blank";
    private static final Set<String> COMPLETION_URLS;
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_PAYMENT_CLIENT_SECRET = "payment_intent_client_secret";
    private static final String PARAM_RETURN_URL = "return_url";
    public static final String PARAM_SETUP_CLIENT_SECRET = "setup_intent_client_secret";
    private final Function1<Throwable, Unit> activityFinisher;
    private final Function1<Intent, Unit> activityStarter;
    private final String clientSecret;
    private String completionUrlParam;
    private boolean hasLoadedBlank;
    private final C49882uX2<Boolean> isPageLoaded;
    private final Logger logger;
    private final Uri userReturnUri;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient$Companion;", "", "()V", "AUTHENTICATE_URLS", "", "", "BLANK_PAGE", "COMPLETION_URLS", "PARAM_PAYMENT_CLIENT_SECRET", "PARAM_RETURN_URL", "PARAM_SETUP_CLIENT_SECRET", "isAuthenticateUrl", "", "url", "isCompletionUrl", "isCompletionUrl$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentAuthWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewClient.kt\ncom/stripe/android/view/PaymentAuthWebViewClient$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1747#2,3:212\n1747#2,3:215\n*S KotlinDebug\n*F\n+ 1 PaymentAuthWebViewClient.kt\ncom/stripe/android/view/PaymentAuthWebViewClient$Companion\n*L\n201#1:212,3\n207#1:215,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAuthenticateUrl(String str) {
            boolean startsWith$default;
            Set<String> set = PaymentAuthWebViewClient.AUTHENTICATE_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            for (String str2 : set) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
                if (startsWith$default) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isCompletionUrl$payments_core_release(String url) {
            boolean startsWith$default;
            Intrinsics.checkNotNullParameter(url, "url");
            Set<String> set = PaymentAuthWebViewClient.COMPLETION_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            for (String str : set) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(url, str, false, 2, null);
                if (startsWith$default) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    static {
        Set<String> of;
        Set<String> of2;
        of = SetsKt__SetsJVMKt.setOf("https://hooks.stripe.com/three_d_secure/authenticate");
        AUTHENTICATE_URLS = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new String[]{"https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete"});
        COMPLETION_URLS = of2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentAuthWebViewClient(Logger logger, C49882uX2<Boolean> isPageLoaded, String clientSecret, String str, Function1<? super Intent, Unit> activityStarter, Function1<? super Throwable, Unit> activityFinisher) {
        Uri uri;
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(isPageLoaded, "isPageLoaded");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(activityStarter, "activityStarter");
        Intrinsics.checkNotNullParameter(activityFinisher, "activityFinisher");
        this.logger = logger;
        this.isPageLoaded = isPageLoaded;
        this.clientSecret = clientSecret;
        this.activityStarter = activityStarter;
        this.activityFinisher = activityFinisher;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        this.userReturnUri = uri;
    }

    private final void hideProgressBar() {
        this.logger.debug("PaymentAuthWebViewClient#hideProgressBar()");
        this.isPageLoaded.setValue(Boolean.TRUE);
    }

    private final boolean isPredefinedReturnUrl(Uri uri) {
        boolean startsWith$default;
        if (!Intrinsics.areEqual("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(uri2, DefaultReturnUrl.PREFIX, false, 2, null);
            if (!startsWith$default) {
                return false;
            }
        }
        return true;
    }

    private final boolean isReturnUrl(Uri uri) {
        String str;
        this.logger.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (isPredefinedReturnUrl(uri)) {
            return true;
        }
        Uri uri2 = this.userReturnUri;
        if (uri2 != null) {
            if (uri2.getScheme() != null && Intrinsics.areEqual(this.userReturnUri.getScheme(), uri.getScheme()) && this.userReturnUri.getHost() != null && Intrinsics.areEqual(this.userReturnUri.getHost(), uri.getHost())) {
                return true;
            }
            return false;
        } else if (uri.isOpaque()) {
            return false;
        } else {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(PARAM_PAYMENT_CLIENT_SECRET)) {
                str = uri.getQueryParameter(PARAM_PAYMENT_CLIENT_SECRET);
            } else if (queryParameterNames.contains(PARAM_SETUP_CLIENT_SECRET)) {
                str = uri.getQueryParameter(PARAM_SETUP_CLIENT_SECRET);
            } else {
                str = null;
            }
            return Intrinsics.areEqual(this.clientSecret, str);
        }
    }

    private final void onAuthCompleted(Throwable th) {
        this.logger.debug("PaymentAuthWebViewClient#onAuthCompleted()");
        this.activityFinisher.invoke(th);
    }

    public static /* synthetic */ void onAuthCompleted$default(PaymentAuthWebViewClient paymentAuthWebViewClient, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        paymentAuthWebViewClient.onAuthCompleted(th);
    }

    private final void openIntent(Intent intent) {
        Object m116783constructorimpl;
        this.logger.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            Result.Companion companion = Result.Companion;
            this.activityStarter.invoke(intent);
            m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this.logger.error("Failed to start Intent.", m116786exceptionOrNullimpl);
            if (!Intrinsics.areEqual(intent.getScheme(), "alipays")) {
                onAuthCompleted(m116786exceptionOrNullimpl);
            }
        }
    }

    private final void openIntentScheme(Uri uri) {
        Object m116783constructorimpl;
        this.logger.debug("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            Result.Companion companion = Result.Companion;
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            Intrinsics.checkNotNullExpressionValue(parseUri, "parseUri(uri.toString(), Intent.URI_INTENT_SCHEME)");
            openIntent(parseUri);
            m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this.logger.error("Failed to start Intent.", m116786exceptionOrNullimpl);
            onAuthCompleted(m116786exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateCompletionUrl(Uri uri) {
        String str;
        boolean z;
        boolean isBlank;
        this.logger.debug("PaymentAuthWebViewClient#updateCompletionUrl()");
        Companion companion = Companion;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        if (companion.isAuthenticateUrl(uri2)) {
            str = uri.getQueryParameter("return_url");
        } else {
            str = null;
        }
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (z) {
                    this.completionUrlParam = str;
                    return;
                }
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    public final String getCompletionUrlParam() {
        return this.completionUrlParam;
    }

    public final boolean getHasLoadedBlank$payments_core_release() {
        return this.hasLoadedBlank;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        Logger logger = this.logger;
        logger.debug("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(view, str);
        if (!this.hasLoadedBlank) {
            hideProgressBar();
        }
        if (str != null && Companion.isCompletionUrl$payments_core_release(str)) {
            Logger logger2 = this.logger;
            logger2.debug(str + " is a completion URL");
            onAuthCompleted$default(this, null, 1, null);
        }
    }

    public final void setHasLoadedBlank$payments_core_release(boolean z) {
        this.hasLoadedBlank = z;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        Logger logger = this.logger;
        logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        Intrinsics.checkNotNullExpressionValue(url, "url");
        updateCompletionUrl(url);
        if (isReturnUrl(url)) {
            this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            onAuthCompleted$default(this, null, 1, null);
            return true;
        }
        equals = StringsKt__StringsJVMKt.equals("intent", url.getScheme(), true);
        if (equals) {
            openIntentScheme(url);
            return true;
        } else if (!URLUtil.isNetworkUrl(url.toString())) {
            openIntent(new Intent("android.intent.action.VIEW", url));
            return true;
        } else {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}
