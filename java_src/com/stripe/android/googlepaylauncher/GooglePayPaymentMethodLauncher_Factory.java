package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncher_Factory {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Context> contextProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Y94<CoroutineContext> ioContextProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Set<String>> productUsageProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public GooglePayPaymentMethodLauncher_Factory(Y94<Context> y94, Y94<Function1<GooglePayEnvironment, GooglePayRepository>> y942, Y94<Set<String>> y943, Y94<Function0<String>> y944, Y94<Function0<String>> y945, Y94<Boolean> y946, Y94<CoroutineContext> y947, Y94<PaymentAnalyticsRequestFactory> y948, Y94<AnalyticsRequestExecutor> y949, Y94<StripeRepository> y9410) {
        this.contextProvider = y94;
        this.googlePayRepositoryFactoryProvider = y942;
        this.productUsageProvider = y943;
        this.publishableKeyProvider = y944;
        this.stripeAccountIdProvider = y945;
        this.enableLoggingProvider = y946;
        this.ioContextProvider = y947;
        this.paymentAnalyticsRequestFactoryProvider = y948;
        this.analyticsRequestExecutorProvider = y949;
        this.stripeRepositoryProvider = y9410;
    }

    public static GooglePayPaymentMethodLauncher_Factory create(Y94<Context> y94, Y94<Function1<GooglePayEnvironment, GooglePayRepository>> y942, Y94<Set<String>> y943, Y94<Function0<String>> y944, Y94<Function0<String>> y945, Y94<Boolean> y946, Y94<CoroutineContext> y947, Y94<PaymentAnalyticsRequestFactory> y948, Y94<AnalyticsRequestExecutor> y949, Y94<StripeRepository> y9410) {
        return new GooglePayPaymentMethodLauncher_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    public static GooglePayPaymentMethodLauncher newInstance(ZC0 zc0, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> abstractC0407B5, boolean z, Context context, Function1<GooglePayEnvironment, GooglePayRepository> function1, Set<String> set, Function0<String> function0, Function0<String> function02, boolean z2, CoroutineContext coroutineContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository) {
        return new GooglePayPaymentMethodLauncher(zc0, config, readyCallback, abstractC0407B5, z, context, function1, set, function0, function02, z2, coroutineContext, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository);
    }

    public GooglePayPaymentMethodLauncher get(ZC0 zc0, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> abstractC0407B5, boolean z) {
        return newInstance(zc0, config, readyCallback, abstractC0407B5, z, this.contextProvider.get(), this.googlePayRepositoryFactoryProvider.get(), this.productUsageProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.ioContextProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.stripeRepositoryProvider.get());
    }
}
