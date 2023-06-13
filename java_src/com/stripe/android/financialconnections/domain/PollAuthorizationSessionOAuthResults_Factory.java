package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionOAuthResults_Factory implements InterfaceC48812sj1<PollAuthorizationSessionOAuthResults> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsRepository> repositoryProvider;

    public PollAuthorizationSessionOAuthResults_Factory(Y94<FinancialConnectionsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
    }

    public static PollAuthorizationSessionOAuthResults_Factory create(Y94<FinancialConnectionsRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        return new PollAuthorizationSessionOAuthResults_Factory(y94, y942);
    }

    public static PollAuthorizationSessionOAuthResults newInstance(FinancialConnectionsRepository financialConnectionsRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new PollAuthorizationSessionOAuthResults(financialConnectionsRepository, configuration);
    }

    @Override // p000.Y94
    public PollAuthorizationSessionOAuthResults get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }
}
