package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class DefaultEventReporter_Factory implements InterfaceC48812sj1<DefaultEventReporter> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<EventTimeProvider> eventTimeProvider;
    private final Y94<EventReporter.Mode> modeProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultEventReporter_Factory(Y94<EventReporter.Mode> y94, Y94<AnalyticsRequestExecutor> y942, Y94<PaymentAnalyticsRequestFactory> y943, Y94<EventTimeProvider> y944, Y94<CoroutineContext> y945) {
        this.modeProvider = y94;
        this.analyticsRequestExecutorProvider = y942;
        this.paymentAnalyticsRequestFactoryProvider = y943;
        this.eventTimeProvider = y944;
        this.workContextProvider = y945;
    }

    public static DefaultEventReporter_Factory create(Y94<EventReporter.Mode> y94, Y94<AnalyticsRequestExecutor> y942, Y94<PaymentAnalyticsRequestFactory> y943, Y94<EventTimeProvider> y944, Y94<CoroutineContext> y945) {
        return new DefaultEventReporter_Factory(y94, y942, y943, y944, y945);
    }

    public static DefaultEventReporter newInstance(EventReporter.Mode mode, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, EventTimeProvider eventTimeProvider, CoroutineContext coroutineContext) {
        return new DefaultEventReporter(mode, analyticsRequestExecutor, paymentAnalyticsRequestFactory, eventTimeProvider, coroutineContext);
    }

    @Override // p000.Y94
    public DefaultEventReporter get() {
        return newInstance(this.modeProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.eventTimeProvider.get(), this.workContextProvider.get());
    }
}
