package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class ElementsSessionRepository_Api_Factory implements InterfaceC48812sj1<ElementsSessionRepository.Api> {
    private final Y94<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public ElementsSessionRepository_Api_Factory(Y94<StripeRepository> y94, Y94<PaymentConfiguration> y942, Y94<CoroutineContext> y943) {
        this.stripeRepositoryProvider = y94;
        this.lazyPaymentConfigProvider = y942;
        this.workContextProvider = y943;
    }

    public static ElementsSessionRepository_Api_Factory create(Y94<StripeRepository> y94, Y94<PaymentConfiguration> y942, Y94<CoroutineContext> y943) {
        return new ElementsSessionRepository_Api_Factory(y94, y942, y943);
    }

    public static ElementsSessionRepository.Api newInstance(StripeRepository stripeRepository, Y94<PaymentConfiguration> y94, CoroutineContext coroutineContext) {
        return new ElementsSessionRepository.Api(stripeRepository, y94, coroutineContext);
    }

    @Override // p000.Y94
    public ElementsSessionRepository.Api get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.workContextProvider.get());
    }
}
