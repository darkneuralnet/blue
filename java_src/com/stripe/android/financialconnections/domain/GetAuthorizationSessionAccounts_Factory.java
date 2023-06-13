package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
/* loaded from: classes7.dex */
public final class GetAuthorizationSessionAccounts_Factory implements InterfaceC48812sj1<GetAuthorizationSessionAccounts> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsAccountsRepository> repositoryProvider;

    public GetAuthorizationSessionAccounts_Factory(Y94<FinancialConnectionsAccountsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
    }

    public static GetAuthorizationSessionAccounts_Factory create(Y94<FinancialConnectionsAccountsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        return new GetAuthorizationSessionAccounts_Factory(y94, y942);
    }

    public static GetAuthorizationSessionAccounts newInstance(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new GetAuthorizationSessionAccounts(financialConnectionsAccountsRepository, configuration);
    }

    @Override // p000.Y94
    public GetAuthorizationSessionAccounts get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }
}
