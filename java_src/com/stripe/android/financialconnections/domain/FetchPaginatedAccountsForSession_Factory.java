package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
/* loaded from: classes7.dex */
public final class FetchPaginatedAccountsForSession_Factory implements InterfaceC48812sj1<FetchPaginatedAccountsForSession> {
    private final Y94<FinancialConnectionsRepository> financialConnectionsRepositoryProvider;

    public FetchPaginatedAccountsForSession_Factory(Y94<FinancialConnectionsRepository> y94) {
        this.financialConnectionsRepositoryProvider = y94;
    }

    public static FetchPaginatedAccountsForSession_Factory create(Y94<FinancialConnectionsRepository> y94) {
        return new FetchPaginatedAccountsForSession_Factory(y94);
    }

    public static FetchPaginatedAccountsForSession newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchPaginatedAccountsForSession(financialConnectionsRepository);
    }

    @Override // p000.Y94
    public FetchPaginatedAccountsForSession get() {
        return newInstance(this.financialConnectionsRepositoryProvider.get());
    }
}
