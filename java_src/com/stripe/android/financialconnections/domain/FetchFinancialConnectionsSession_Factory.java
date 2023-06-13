package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
/* loaded from: classes7.dex */
public final class FetchFinancialConnectionsSession_Factory implements InterfaceC48812sj1<FetchFinancialConnectionsSession> {
    private final Y94<FetchPaginatedAccountsForSession> fetchPaginatedAccountsForSessionProvider;
    private final Y94<FinancialConnectionsRepository> financialConnectionsRepositoryProvider;

    public FetchFinancialConnectionsSession_Factory(Y94<FetchPaginatedAccountsForSession> y94, Y94<FinancialConnectionsRepository> y942) {
        this.fetchPaginatedAccountsForSessionProvider = y94;
        this.financialConnectionsRepositoryProvider = y942;
    }

    public static FetchFinancialConnectionsSession_Factory create(Y94<FetchPaginatedAccountsForSession> y94, Y94<FinancialConnectionsRepository> y942) {
        return new FetchFinancialConnectionsSession_Factory(y94, y942);
    }

    public static FetchFinancialConnectionsSession newInstance(FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchFinancialConnectionsSession(fetchPaginatedAccountsForSession, financialConnectionsRepository);
    }

    @Override // p000.Y94
    public FetchFinancialConnectionsSession get() {
        return newInstance(this.fetchPaginatedAccountsForSessionProvider.get(), this.financialConnectionsRepositoryProvider.get());
    }
}
