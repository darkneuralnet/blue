package com.stripe.android.networking;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class StripeApiRepository_Factory implements InterfaceC48812sj1<StripeApiRepository> {
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Context> appContextProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Set<String>> productUsageTokensProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public StripeApiRepository_Factory(Y94<Context> y94, Y94<Function0<String>> y942, Y94<CoroutineContext> y943, Y94<Set<String>> y944, Y94<PaymentAnalyticsRequestFactory> y945, Y94<AnalyticsRequestExecutor> y946, Y94<Logger> y947) {
        this.appContextProvider = y94;
        this.publishableKeyProvider = y942;
        this.workContextProvider = y943;
        this.productUsageTokensProvider = y944;
        this.paymentAnalyticsRequestFactoryProvider = y945;
        this.analyticsRequestExecutorProvider = y946;
        this.loggerProvider = y947;
    }

    public static StripeApiRepository_Factory create(Y94<Context> y94, Y94<Function0<String>> y942, Y94<CoroutineContext> y943, Y94<Set<String>> y944, Y94<PaymentAnalyticsRequestFactory> y945, Y94<AnalyticsRequestExecutor> y946, Y94<Logger> y947) {
        return new StripeApiRepository_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static StripeApiRepository newInstance(Context context, Function0<String> function0, CoroutineContext coroutineContext, Set<String> set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        return new StripeApiRepository(context, function0, coroutineContext, set, paymentAnalyticsRequestFactory, analyticsRequestExecutor, logger);
    }

    @Override // p000.Y94
    public StripeApiRepository get() {
        return newInstance(this.appContextProvider.get(), this.publishableKeyProvider.get(), this.workContextProvider.get(), this.productUsageTokensProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.loggerProvider.get());
    }
}
