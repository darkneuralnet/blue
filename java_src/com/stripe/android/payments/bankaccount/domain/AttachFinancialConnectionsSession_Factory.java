package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
/* loaded from: classes7.dex */
public final class AttachFinancialConnectionsSession_Factory implements InterfaceC48812sj1<AttachFinancialConnectionsSession> {
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public AttachFinancialConnectionsSession_Factory(Y94<StripeRepository> y94) {
        this.stripeRepositoryProvider = y94;
    }

    public static AttachFinancialConnectionsSession_Factory create(Y94<StripeRepository> y94) {
        return new AttachFinancialConnectionsSession_Factory(y94);
    }

    public static AttachFinancialConnectionsSession newInstance(StripeRepository stripeRepository) {
        return new AttachFinancialConnectionsSession(stripeRepository);
    }

    @Override // p000.Y94
    public AttachFinancialConnectionsSession get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}
