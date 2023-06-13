package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionAccounts_Factory implements InterfaceC48812sj1<PollAuthorizationSessionAccounts> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsAccountsRepository> repositoryProvider;

    public PollAuthorizationSessionAccounts_Factory(Y94<FinancialConnectionsAccountsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
    }

    public static PollAuthorizationSessionAccounts_Factory create(Y94<FinancialConnectionsAccountsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        return new PollAuthorizationSessionAccounts_Factory(y94, y942);
    }

    public static PollAuthorizationSessionAccounts newInstance(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new PollAuthorizationSessionAccounts(financialConnectionsAccountsRepository, configuration);
    }

    @Override // p000.Y94
    public PollAuthorizationSessionAccounts get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }
}
