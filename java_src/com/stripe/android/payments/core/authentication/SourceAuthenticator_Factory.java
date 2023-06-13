package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class SourceAuthenticator_Factory implements InterfaceC48812sj1<SourceAuthenticator> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<Boolean> isInstantAppProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;
    private final Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<CoroutineContext> uiContextProvider;

    public SourceAuthenticator_Factory(Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> y94, Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> y942, Y94<AnalyticsRequestExecutor> y943, Y94<PaymentAnalyticsRequestFactory> y944, Y94<Boolean> y945, Y94<CoroutineContext> y946, Y94<Function0<String>> y947, Y94<Boolean> y948) {
        this.paymentBrowserAuthStarterFactoryProvider = y94;
        this.paymentRelayStarterFactoryProvider = y942;
        this.analyticsRequestExecutorProvider = y943;
        this.paymentAnalyticsRequestFactoryProvider = y944;
        this.enableLoggingProvider = y945;
        this.uiContextProvider = y946;
        this.publishableKeyProvider = y947;
        this.isInstantAppProvider = y948;
    }

    public static SourceAuthenticator_Factory create(Y94<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> y94, Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> y942, Y94<AnalyticsRequestExecutor> y943, Y94<PaymentAnalyticsRequestFactory> y944, Y94<Boolean> y945, Y94<CoroutineContext> y946, Y94<Function0<String>> y947, Y94<Boolean> y948) {
        return new SourceAuthenticator_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static SourceAuthenticator newInstance(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> function1, Function1<AuthActivityStarterHost, PaymentRelayStarter> function12, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext coroutineContext, Function0<String> function0, boolean z2) {
        return new SourceAuthenticator(function1, function12, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z, coroutineContext, function0, z2);
    }

    @Override // p000.Y94
    public SourceAuthenticator get() {
        return newInstance(this.paymentBrowserAuthStarterFactoryProvider.get(), this.paymentRelayStarterFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.uiContextProvider.get(), this.publishableKeyProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }
}
