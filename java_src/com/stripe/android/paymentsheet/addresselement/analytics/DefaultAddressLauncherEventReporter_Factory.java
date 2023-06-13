package com.stripe.android.paymentsheet.addresselement.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class DefaultAddressLauncherEventReporter_Factory implements InterfaceC48812sj1<DefaultAddressLauncherEventReporter> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<AnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultAddressLauncherEventReporter_Factory(Y94<AnalyticsRequestExecutor> y94, Y94<AnalyticsRequestFactory> y942, Y94<CoroutineContext> y943) {
        this.analyticsRequestExecutorProvider = y94;
        this.analyticsRequestFactoryProvider = y942;
        this.workContextProvider = y943;
    }

    public static DefaultAddressLauncherEventReporter_Factory create(Y94<AnalyticsRequestExecutor> y94, Y94<AnalyticsRequestFactory> y942, Y94<CoroutineContext> y943) {
        return new DefaultAddressLauncherEventReporter_Factory(y94, y942, y943);
    }

    public static DefaultAddressLauncherEventReporter newInstance(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, CoroutineContext coroutineContext) {
        return new DefaultAddressLauncherEventReporter(analyticsRequestExecutor, analyticsRequestFactory, coroutineContext);
    }

    @Override // p000.Y94
    public DefaultAddressLauncherEventReporter get() {
        return newInstance(this.analyticsRequestExecutorProvider.get(), this.analyticsRequestFactoryProvider.get(), this.workContextProvider.get());
    }
}
