package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory implements InterfaceC48812sj1<PaymentAuthenticatorRegistry> {
    private final Y94<Context> contextProvider;
    private final Y94<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<Boolean> isInstantAppProvider;
    private final PaymentLauncherModule module;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Set<String>> productUsageProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Y94<CoroutineContext> uiContextProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory(PaymentLauncherModule paymentLauncherModule, Y94<Context> y94, Y94<StripeRepository> y942, Y94<Boolean> y943, Y94<CoroutineContext> y944, Y94<CoroutineContext> y945, Y94<Map<String, String>> y946, Y94<DefaultAnalyticsRequestExecutor> y947, Y94<PaymentAnalyticsRequestFactory> y948, Y94<Function0<String>> y949, Y94<Set<String>> y9410, Y94<Boolean> y9411) {
        this.module = paymentLauncherModule;
        this.contextProvider = y94;
        this.stripeRepositoryProvider = y942;
        this.enableLoggingProvider = y943;
        this.workContextProvider = y944;
        this.uiContextProvider = y945;
        this.threeDs1IntentReturnUrlMapProvider = y946;
        this.defaultAnalyticsRequestExecutorProvider = y947;
        this.paymentAnalyticsRequestFactoryProvider = y948;
        this.publishableKeyProvider = y949;
        this.productUsageProvider = y9410;
        this.isInstantAppProvider = y9411;
    }

    public static PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory create(PaymentLauncherModule paymentLauncherModule, Y94<Context> y94, Y94<StripeRepository> y942, Y94<Boolean> y943, Y94<CoroutineContext> y944, Y94<CoroutineContext> y945, Y94<Map<String, String>> y946, Y94<DefaultAnalyticsRequestExecutor> y947, Y94<PaymentAnalyticsRequestFactory> y948, Y94<Function0<String>> y949, Y94<Set<String>> y9410, Y94<Boolean> y9411) {
        return new PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory(paymentLauncherModule, y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    public static PaymentAuthenticatorRegistry providePaymentAuthenticatorRegistry(PaymentLauncherModule paymentLauncherModule, Context context, StripeRepository stripeRepository, boolean z, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0<String> function0, Set<String> set, boolean z2) {
        return (PaymentAuthenticatorRegistry) C51679xZ3.m5002e(paymentLauncherModule.providePaymentAuthenticatorRegistry(context, stripeRepository, z, coroutineContext, coroutineContext2, map, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, function0, set, z2));
    }

    @Override // p000.Y94
    public PaymentAuthenticatorRegistry get() {
        return providePaymentAuthenticatorRegistry(this.module, this.contextProvider.get(), this.stripeRepositoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.workContextProvider.get(), this.uiContextProvider.get(), this.threeDs1IntentReturnUrlMapProvider.get(), this.defaultAnalyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.publishableKeyProvider.get(), this.productUsageProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }
}
