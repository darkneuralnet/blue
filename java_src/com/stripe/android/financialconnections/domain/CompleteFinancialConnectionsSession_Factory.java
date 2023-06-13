package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
/* loaded from: classes7.dex */
public final class CompleteFinancialConnectionsSession_Factory implements InterfaceC48812sj1<CompleteFinancialConnectionsSession> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FetchPaginatedAccountsForSession> fetchPaginatedAccountsForSessionProvider;
    private final Y94<FinancialConnectionsRepository> repositoryProvider;

    public CompleteFinancialConnectionsSession_Factory(Y94<FinancialConnectionsRepository> y94, Y94<FetchPaginatedAccountsForSession> y942, Y94<FinancialConnectionsSheet.Configuration> y943) {
        this.repositoryProvider = y94;
        this.fetchPaginatedAccountsForSessionProvider = y942;
        this.configurationProvider = y943;
    }

    public static CompleteFinancialConnectionsSession_Factory create(Y94<FinancialConnectionsRepository> y94, Y94<FetchPaginatedAccountsForSession> y942, Y94<FinancialConnectionsSheet.Configuration> y943) {
        return new CompleteFinancialConnectionsSession_Factory(y94, y942, y943);
    }

    public static CompleteFinancialConnectionsSession newInstance(FinancialConnectionsRepository financialConnectionsRepository, FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsSheet.Configuration configuration) {
        return new CompleteFinancialConnectionsSession(financialConnectionsRepository, fetchPaginatedAccountsForSession, configuration);
    }

    @Override // p000.Y94
    public CompleteFinancialConnectionsSession get() {
        return newInstance(this.repositoryProvider.get(), this.fetchPaginatedAccountsForSessionProvider.get(), this.configurationProvider.get());
    }
}
