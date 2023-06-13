package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class AcceptConsent_Factory implements InterfaceC48812sj1<AcceptConsent> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsManifestRepository> repositoryProvider;

    public AcceptConsent_Factory(Y94<FinancialConnectionsManifestRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
    }

    public static AcceptConsent_Factory create(Y94<FinancialConnectionsManifestRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        return new AcceptConsent_Factory(y94, y942);
    }

    public static AcceptConsent newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new AcceptConsent(financialConnectionsManifestRepository, configuration);
    }

    @Override // p000.Y94
    public AcceptConsent get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }
}
