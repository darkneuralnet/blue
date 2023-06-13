package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor_Factory implements InterfaceC48812sj1<DefaultStripe3ds2ChallengeResultProcessor> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<RetryDelaySupplier> retryDelaySupplierProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultStripe3ds2ChallengeResultProcessor_Factory(Y94<StripeRepository> y94, Y94<AnalyticsRequestExecutor> y942, Y94<PaymentAnalyticsRequestFactory> y943, Y94<RetryDelaySupplier> y944, Y94<Logger> y945, Y94<CoroutineContext> y946) {
        this.stripeRepositoryProvider = y94;
        this.analyticsRequestExecutorProvider = y942;
        this.paymentAnalyticsRequestFactoryProvider = y943;
        this.retryDelaySupplierProvider = y944;
        this.loggerProvider = y945;
        this.workContextProvider = y946;
    }

    public static DefaultStripe3ds2ChallengeResultProcessor_Factory create(Y94<StripeRepository> y94, Y94<AnalyticsRequestExecutor> y942, Y94<PaymentAnalyticsRequestFactory> y943, Y94<RetryDelaySupplier> y944, Y94<Logger> y945, Y94<CoroutineContext> y946) {
        return new DefaultStripe3ds2ChallengeResultProcessor_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static DefaultStripe3ds2ChallengeResultProcessor newInstance(StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, RetryDelaySupplier retryDelaySupplier, Logger logger, CoroutineContext coroutineContext) {
        return new DefaultStripe3ds2ChallengeResultProcessor(stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, retryDelaySupplier, logger, coroutineContext);
    }

    @Override // p000.Y94
    public DefaultStripe3ds2ChallengeResultProcessor get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.retryDelaySupplierProvider.get(), this.loggerProvider.get(), this.workContextProvider.get());
    }
}
