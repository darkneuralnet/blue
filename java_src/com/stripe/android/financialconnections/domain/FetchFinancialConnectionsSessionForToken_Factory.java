package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
/* loaded from: classes7.dex */
public final class FetchFinancialConnectionsSessionForToken_Factory implements InterfaceC48812sj1<FetchFinancialConnectionsSessionForToken> {
    private final Y94<FinancialConnectionsRepository> connectionsRepositoryProvider;

    public FetchFinancialConnectionsSessionForToken_Factory(Y94<FinancialConnectionsRepository> y94) {
        this.connectionsRepositoryProvider = y94;
    }

    public static FetchFinancialConnectionsSessionForToken_Factory create(Y94<FinancialConnectionsRepository> y94) {
        return new FetchFinancialConnectionsSessionForToken_Factory(y94);
    }

    public static FetchFinancialConnectionsSessionForToken newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchFinancialConnectionsSessionForToken(financialConnectionsRepository);
    }

    @Override // p000.Y94
    public FetchFinancialConnectionsSessionForToken get() {
        return newInstance(this.connectionsRepositoryProvider.get());
    }
}
