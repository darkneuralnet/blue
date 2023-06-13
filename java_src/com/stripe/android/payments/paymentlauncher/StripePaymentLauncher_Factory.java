package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class StripePaymentLauncher_Factory {
    private final Y94<Context> contextProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<CoroutineContext> ioContextProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Set<String>> productUsageProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> uiContextProvider;

    public StripePaymentLauncher_Factory(Y94<Context> y94, Y94<Boolean> y942, Y94<CoroutineContext> y943, Y94<CoroutineContext> y944, Y94<StripeRepository> y945, Y94<PaymentAnalyticsRequestFactory> y946, Y94<Set<String>> y947) {
        this.contextProvider = y94;
        this.enableLoggingProvider = y942;
        this.ioContextProvider = y943;
        this.uiContextProvider = y944;
        this.stripeRepositoryProvider = y945;
        this.paymentAnalyticsRequestFactoryProvider = y946;
        this.productUsageProvider = y947;
    }

    public static StripePaymentLauncher_Factory create(Y94<Context> y94, Y94<Boolean> y942, Y94<CoroutineContext> y943, Y94<CoroutineContext> y944, Y94<StripeRepository> y945, Y94<PaymentAnalyticsRequestFactory> y946, Y94<Set<String>> y947) {
        return new StripePaymentLauncher_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static StripePaymentLauncher newInstance(Function0<String> function0, Function0<String> function02, AbstractC0407B5<PaymentLauncherContract.Args> abstractC0407B5, Context context, boolean z, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set<String> set) {
        return new StripePaymentLauncher(function0, function02, abstractC0407B5, context, z, coroutineContext, coroutineContext2, stripeRepository, paymentAnalyticsRequestFactory, set);
    }

    public StripePaymentLauncher get(Function0<String> function0, Function0<String> function02, AbstractC0407B5<PaymentLauncherContract.Args> abstractC0407B5) {
        return newInstance(function0, function02, abstractC0407B5, this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.ioContextProvider.get(), this.uiContextProvider.get(), this.stripeRepositoryProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.productUsageProvider.get());
    }
}
