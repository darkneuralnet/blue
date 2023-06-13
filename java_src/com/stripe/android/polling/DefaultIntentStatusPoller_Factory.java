package com.stripe.android.polling;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.polling.IntentStatusPoller;
/* loaded from: classes7.dex */
public final class DefaultIntentStatusPoller_Factory implements InterfaceC48812sj1<DefaultIntentStatusPoller> {
    private final Y94<IntentStatusPoller.Config> configProvider;
    private final Y94<SC0> dispatcherProvider;
    private final Y94<PaymentConfiguration> paymentConfigProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public DefaultIntentStatusPoller_Factory(Y94<StripeRepository> y94, Y94<PaymentConfiguration> y942, Y94<IntentStatusPoller.Config> y943, Y94<SC0> y944) {
        this.stripeRepositoryProvider = y94;
        this.paymentConfigProvider = y942;
        this.configProvider = y943;
        this.dispatcherProvider = y944;
    }

    public static DefaultIntentStatusPoller_Factory create(Y94<StripeRepository> y94, Y94<PaymentConfiguration> y942, Y94<IntentStatusPoller.Config> y943, Y94<SC0> y944) {
        return new DefaultIntentStatusPoller_Factory(y94, y942, y943, y944);
    }

    public static DefaultIntentStatusPoller newInstance(StripeRepository stripeRepository, Y94<PaymentConfiguration> y94, IntentStatusPoller.Config config, SC0 sc0) {
        return new DefaultIntentStatusPoller(stripeRepository, y94, config, sc0);
    }

    @Override // p000.Y94
    public DefaultIntentStatusPoller get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.paymentConfigProvider, this.configProvider.get(), this.dispatcherProvider.get());
    }
}
