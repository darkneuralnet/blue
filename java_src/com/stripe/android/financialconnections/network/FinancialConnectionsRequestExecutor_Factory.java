package com.stripe.android.financialconnections.network;

import com.stripe.android.core.networking.StripeNetworkClient;
/* loaded from: classes7.dex */
public final class FinancialConnectionsRequestExecutor_Factory implements InterfaceC48812sj1<FinancialConnectionsRequestExecutor> {
    private final Y94<AbstractC38706bi2> jsonProvider;
    private final Y94<StripeNetworkClient> stripeNetworkClientProvider;

    public FinancialConnectionsRequestExecutor_Factory(Y94<StripeNetworkClient> y94, Y94<AbstractC38706bi2> y942) {
        this.stripeNetworkClientProvider = y94;
        this.jsonProvider = y942;
    }

    public static FinancialConnectionsRequestExecutor_Factory create(Y94<StripeNetworkClient> y94, Y94<AbstractC38706bi2> y942) {
        return new FinancialConnectionsRequestExecutor_Factory(y94, y942);
    }

    public static FinancialConnectionsRequestExecutor newInstance(StripeNetworkClient stripeNetworkClient, AbstractC38706bi2 abstractC38706bi2) {
        return new FinancialConnectionsRequestExecutor(stripeNetworkClient, abstractC38706bi2);
    }

    @Override // p000.Y94
    public FinancialConnectionsRequestExecutor get() {
        return newInstance(this.stripeNetworkClientProvider.get(), this.jsonProvider.get());
    }
}
