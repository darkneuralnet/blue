package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
/* loaded from: classes7.dex */
public final class PollAttachPaymentAccount_Factory implements InterfaceC48812sj1<PollAttachPaymentAccount> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsAccountsRepository> repositoryProvider;

    public PollAttachPaymentAccount_Factory(Y94<FinancialConnectionsAccountsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
    }

    public static PollAttachPaymentAccount_Factory create(Y94<FinancialConnectionsAccountsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        return new PollAttachPaymentAccount_Factory(y94, y942);
    }

    public static PollAttachPaymentAccount newInstance(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new PollAttachPaymentAccount(financialConnectionsAccountsRepository, configuration);
    }

    @Override // p000.Y94
    public PollAttachPaymentAccount get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }
}
