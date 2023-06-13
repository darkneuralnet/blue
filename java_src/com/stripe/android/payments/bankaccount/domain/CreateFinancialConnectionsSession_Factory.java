package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
/* loaded from: classes7.dex */
public final class CreateFinancialConnectionsSession_Factory implements InterfaceC48812sj1<CreateFinancialConnectionsSession> {
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public CreateFinancialConnectionsSession_Factory(Y94<StripeRepository> y94) {
        this.stripeRepositoryProvider = y94;
    }

    public static CreateFinancialConnectionsSession_Factory create(Y94<StripeRepository> y94) {
        return new CreateFinancialConnectionsSession_Factory(y94);
    }

    public static CreateFinancialConnectionsSession newInstance(StripeRepository stripeRepository) {
        return new CreateFinancialConnectionsSession(stripeRepository);
    }

    @Override // p000.Y94
    public CreateFinancialConnectionsSession get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}
