package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class DefaultFinancialConnectionsEventReporter_Factory implements InterfaceC48812sj1<DefaultFinancialConnectionsEventReporter> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<AnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultFinancialConnectionsEventReporter_Factory(Y94<AnalyticsRequestExecutor> y94, Y94<AnalyticsRequestFactory> y942, Y94<CoroutineContext> y943) {
        this.analyticsRequestExecutorProvider = y94;
        this.analyticsRequestFactoryProvider = y942;
        this.workContextProvider = y943;
    }

    public static DefaultFinancialConnectionsEventReporter_Factory create(Y94<AnalyticsRequestExecutor> y94, Y94<AnalyticsRequestFactory> y942, Y94<CoroutineContext> y943) {
        return new DefaultFinancialConnectionsEventReporter_Factory(y94, y942, y943);
    }

    public static DefaultFinancialConnectionsEventReporter newInstance(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, CoroutineContext coroutineContext) {
        return new DefaultFinancialConnectionsEventReporter(analyticsRequestExecutor, analyticsRequestFactory, coroutineContext);
    }

    @Override // p000.Y94
    public DefaultFinancialConnectionsEventReporter get() {
        return newInstance(this.analyticsRequestExecutorProvider.get(), this.analyticsRequestFactoryProvider.get(), this.workContextProvider.get());
    }
}
