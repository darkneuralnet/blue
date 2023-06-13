package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class CustomerApiRepository_Factory implements InterfaceC48812sj1<CustomerApiRepository> {
    private final Y94<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Set<String>> productUsageTokensProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public CustomerApiRepository_Factory(Y94<StripeRepository> y94, Y94<PaymentConfiguration> y942, Y94<Logger> y943, Y94<CoroutineContext> y944, Y94<Set<String>> y945) {
        this.stripeRepositoryProvider = y94;
        this.lazyPaymentConfigProvider = y942;
        this.loggerProvider = y943;
        this.workContextProvider = y944;
        this.productUsageTokensProvider = y945;
    }

    public static CustomerApiRepository_Factory create(Y94<StripeRepository> y94, Y94<PaymentConfiguration> y942, Y94<Logger> y943, Y94<CoroutineContext> y944, Y94<Set<String>> y945) {
        return new CustomerApiRepository_Factory(y94, y942, y943, y944, y945);
    }

    public static CustomerApiRepository newInstance(StripeRepository stripeRepository, Y94<PaymentConfiguration> y94, Logger logger, CoroutineContext coroutineContext, Set<String> set) {
        return new CustomerApiRepository(stripeRepository, y94, logger, coroutineContext, set);
    }

    @Override // p000.Y94
    public CustomerApiRepository get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.loggerProvider.get(), this.workContextProvider.get(), this.productUsageTokensProvider.get());
    }
}
