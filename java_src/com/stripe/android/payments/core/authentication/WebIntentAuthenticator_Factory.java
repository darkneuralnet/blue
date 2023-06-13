package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class WebIntentAuthenticator_Factory implements InterfaceC48812sj1<WebIntentAuthenticator> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<Boolean> isInstantAppProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Y94<CoroutineContext> uiContextProvider;

    public WebIntentAuthenticator_Factory(Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> y94, Y94<AnalyticsRequestExecutor> y942, Y94<PaymentAnalyticsRequestFactory> y943, Y94<Boolean> y944, Y94<CoroutineContext> y945, Y94<Map<String, String>> y946, Y94<Function0<String>> y947, Y94<Boolean> y948, Y94<DefaultReturnUrl> y949) {
        this.paymentBrowserAuthStarterFactoryProvider = y94;
        this.analyticsRequestExecutorProvider = y942;
        this.paymentAnalyticsRequestFactoryProvider = y943;
        this.enableLoggingProvider = y944;
        this.uiContextProvider = y945;
        this.threeDs1IntentReturnUrlMapProvider = y946;
        this.publishableKeyProvider = y947;
        this.isInstantAppProvider = y948;
        this.defaultReturnUrlProvider = y949;
    }

    public static WebIntentAuthenticator_Factory create(Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> y94, Y94<AnalyticsRequestExecutor> y942, Y94<PaymentAnalyticsRequestFactory> y943, Y94<Boolean> y944, Y94<CoroutineContext> y945, Y94<Map<String, String>> y946, Y94<Function0<String>> y947, Y94<Boolean> y948, Y94<DefaultReturnUrl> y949) {
        return new WebIntentAuthenticator_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    public static WebIntentAuthenticator newInstance(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> function1, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext coroutineContext, Map<String, String> map, Function0<String> function0, boolean z2, DefaultReturnUrl defaultReturnUrl) {
        return new WebIntentAuthenticator(function1, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z, coroutineContext, map, function0, z2, defaultReturnUrl);
    }

    @Override // p000.Y94
    public WebIntentAuthenticator get() {
        return newInstance(this.paymentBrowserAuthStarterFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.uiContextProvider.get(), this.threeDs1IntentReturnUrlMapProvider.get(), this.publishableKeyProvider.get(), this.isInstantAppProvider.get().booleanValue(), this.defaultReturnUrlProvider.get());
    }
}
