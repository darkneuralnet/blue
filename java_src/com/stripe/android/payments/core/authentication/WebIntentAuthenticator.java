package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bu\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017Jc\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J)\u0010%\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010)R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "paymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", NamedConstantsKt.ENABLE_LOGGING, "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_INSTANT_APP, "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/payments/DefaultReturnUrl;)V", "beginWebAuth", "", "host", "stripeIntent", "requestCode", "", "clientSecret", "authUrl", "stripeAccount", "returnUrl", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performAuthentication", "authenticatable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmSuppressWildcards
@SourceDebugExtension({"SMAP\nWebIntentAuthenticator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebIntentAuthenticator.kt\ncom/stripe/android/payments/core/authentication/WebIntentAuthenticator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* loaded from: classes7.dex */
public final class WebIntentAuthenticator extends PaymentAuthenticator<StripeIntent> {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean enableLogging;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    public WebIntentAuthenticator(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, @UIContext CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, Function0<String> publishableKeyProvider, boolean z2, DefaultReturnUrl defaultReturnUrl) {
        Intrinsics.checkNotNullParameter(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z;
        this.uiContext = uiContext;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z2;
        this.defaultReturnUrl = defaultReturnUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginWebAuth(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, Continuation<Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.uiContext, new WebIntentAuthenticator$beginWebAuth$2(this, authActivityStarterHost, stripeIntent, i, str, str2, str4, str3, z, z2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, stripeIntent, options, (Continuation<Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<Unit> continuation) {
        String mobileAuthUrl;
        String value;
        boolean z;
        String uri;
        String returnUrl;
        boolean z2;
        String clientSecret;
        Object coroutine_suspended;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        if (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) {
            String url = ((StripeIntent.NextActionData.SdkData.Use3DS1) nextActionData).getUrl();
            String id = stripeIntent.getId();
            String remove = id != null ? this.threeDs1IntentReturnUrlMap.remove(id) : null;
            this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1Sdk, null, null, null, null, 30, null));
            mobileAuthUrl = url;
            value = remove;
            z = true;
        } else {
            if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
                this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, 30, null));
                StripeIntent.NextActionData.RedirectToUrl redirectToUrl = (StripeIntent.NextActionData.RedirectToUrl) nextActionData;
                uri = redirectToUrl.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "nextActionData.url.toString()");
                returnUrl = redirectToUrl.getReturnUrl();
            } else if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
                this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, 30, null));
                StripeIntent.NextActionData.AlipayRedirect alipayRedirect = (StripeIntent.NextActionData.AlipayRedirect) nextActionData;
                uri = alipayRedirect.getWebViewUrl().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "nextActionData.webViewUrl.toString()");
                returnUrl = alipayRedirect.getReturnUrl();
            } else {
                if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
                    String hostedVoucherUrl = ((StripeIntent.NextActionData.DisplayOxxoDetails) nextActionData).getHostedVoucherUrl();
                    Intrinsics.checkNotNull(hostedVoucherUrl);
                    if (!(hostedVoucherUrl.length() > 0)) {
                        hostedVoucherUrl = null;
                    }
                    if (hostedVoucherUrl == null) {
                        throw new IllegalArgumentException("null hostedVoucherUrl for DisplayOxxoDetails");
                    }
                    mobileAuthUrl = hostedVoucherUrl;
                    value = null;
                } else if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
                    mobileAuthUrl = ((StripeIntent.NextActionData.CashAppRedirect) nextActionData).getMobileAuthUrl();
                    value = this.defaultReturnUrl.getValue();
                } else {
                    throw new IllegalArgumentException("WebAuthenticator can't process nextActionData: " + nextActionData);
                }
                z = false;
            }
            value = returnUrl;
            mobileAuthUrl = uri;
            z2 = true;
            z = false;
            int requestCode$payments_core_release = StripePaymentController.Companion.getRequestCode$payments_core_release(stripeIntent);
            clientSecret = stripeIntent.getClientSecret();
            if (clientSecret == null) {
                clientSecret = "";
            }
            Object beginWebAuth = beginWebAuth(authActivityStarterHost, stripeIntent, requestCode$payments_core_release, clientSecret, mobileAuthUrl, options.getStripeAccount(), value, z, z2, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return beginWebAuth != coroutine_suspended ? beginWebAuth : Unit.INSTANCE;
        }
        z2 = z;
        int requestCode$payments_core_release2 = StripePaymentController.Companion.getRequestCode$payments_core_release(stripeIntent);
        clientSecret = stripeIntent.getClientSecret();
        if (clientSecret == null) {
        }
        Object beginWebAuth2 = beginWebAuth(authActivityStarterHost, stripeIntent, requestCode$payments_core_release2, clientSecret, mobileAuthUrl, options.getStripeAccount(), value, z, z2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (beginWebAuth2 != coroutine_suspended) {
        }
    }
}
