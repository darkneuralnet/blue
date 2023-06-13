package com.stripe.android.link.analytics;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class DefaultLinkEventsReporter_Factory implements InterfaceC48812sj1<DefaultLinkEventsReporter> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultLinkEventsReporter_Factory(Y94<AnalyticsRequestExecutor> y94, Y94<PaymentAnalyticsRequestFactory> y942, Y94<CoroutineContext> y943, Y94<Logger> y944) {
        this.analyticsRequestExecutorProvider = y94;
        this.paymentAnalyticsRequestFactoryProvider = y942;
        this.workContextProvider = y943;
        this.loggerProvider = y944;
    }

    public static DefaultLinkEventsReporter_Factory create(Y94<AnalyticsRequestExecutor> y94, Y94<PaymentAnalyticsRequestFactory> y942, Y94<CoroutineContext> y943, Y94<Logger> y944) {
        return new DefaultLinkEventsReporter_Factory(y94, y942, y943, y944);
    }

    public static DefaultLinkEventsReporter newInstance(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext coroutineContext, Logger logger) {
        return new DefaultLinkEventsReporter(analyticsRequestExecutor, paymentAnalyticsRequestFactory, coroutineContext, logger);
    }

    @Override // p000.Y94
    public DefaultLinkEventsReporter get() {
        return newInstance(this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.workContextProvider.get(), this.loggerProvider.get());
    }
}
