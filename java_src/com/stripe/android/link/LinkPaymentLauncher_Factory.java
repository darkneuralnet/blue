package com.stripe.android.link;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.uicore.address.AddressRepository;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class LinkPaymentLauncher_Factory implements InterfaceC48812sj1<LinkPaymentLauncher> {
    private final Y94<AddressRepository> addressRepositoryProvider;
    private final Y94<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<Context> contextProvider;
    private final Y94<Boolean> enableLoggingProvider;
    private final Y94<CoroutineContext> ioContextProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<Set<String>> productUsageProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> uiContextProvider;

    public LinkPaymentLauncher_Factory(Y94<Context> y94, Y94<Set<String>> y942, Y94<Function0<String>> y943, Y94<Function0<String>> y944, Y94<Boolean> y945, Y94<CoroutineContext> y946, Y94<CoroutineContext> y947, Y94<PaymentAnalyticsRequestFactory> y948, Y94<AnalyticsRequestExecutor> y949, Y94<StripeRepository> y9410, Y94<AddressRepository> y9411) {
        this.contextProvider = y94;
        this.productUsageProvider = y942;
        this.publishableKeyProvider = y943;
        this.stripeAccountIdProvider = y944;
        this.enableLoggingProvider = y945;
        this.ioContextProvider = y946;
        this.uiContextProvider = y947;
        this.paymentAnalyticsRequestFactoryProvider = y948;
        this.analyticsRequestExecutorProvider = y949;
        this.stripeRepositoryProvider = y9410;
        this.addressRepositoryProvider = y9411;
    }

    public static LinkPaymentLauncher_Factory create(Y94<Context> y94, Y94<Set<String>> y942, Y94<Function0<String>> y943, Y94<Function0<String>> y944, Y94<Boolean> y945, Y94<CoroutineContext> y946, Y94<CoroutineContext> y947, Y94<PaymentAnalyticsRequestFactory> y948, Y94<AnalyticsRequestExecutor> y949, Y94<StripeRepository> y9410, Y94<AddressRepository> y9411) {
        return new LinkPaymentLauncher_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    public static LinkPaymentLauncher newInstance(Context context, Set<String> set, Function0<String> function0, Function0<String> function02, boolean z, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, AddressRepository addressRepository) {
        return new LinkPaymentLauncher(context, set, function0, function02, z, coroutineContext, coroutineContext2, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository, addressRepository);
    }

    @Override // p000.Y94
    public LinkPaymentLauncher get() {
        return newInstance(this.contextProvider.get(), this.productUsageProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.ioContextProvider.get(), this.uiContextProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.stripeRepositoryProvider.get(), this.addressRepositoryProvider.get());
    }
}
