package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
/* loaded from: classes7.dex */
public final class RetrieveStripeIntent_Factory implements InterfaceC48812sj1<RetrieveStripeIntent> {
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public RetrieveStripeIntent_Factory(Y94<StripeRepository> y94) {
        this.stripeRepositoryProvider = y94;
    }

    public static RetrieveStripeIntent_Factory create(Y94<StripeRepository> y94) {
        return new RetrieveStripeIntent_Factory(y94);
    }

    public static RetrieveStripeIntent newInstance(StripeRepository stripeRepository) {
        return new RetrieveStripeIntent(stripeRepository);
    }

    @Override // p000.Y94
    public RetrieveStripeIntent get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}
