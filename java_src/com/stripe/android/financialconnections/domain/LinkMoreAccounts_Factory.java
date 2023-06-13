package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class LinkMoreAccounts_Factory implements InterfaceC48812sj1<LinkMoreAccounts> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsManifestRepository> repositoryProvider;

    public LinkMoreAccounts_Factory(Y94<FinancialConnectionsManifestRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
    }

    public static LinkMoreAccounts_Factory create(Y94<FinancialConnectionsManifestRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942) {
        return new LinkMoreAccounts_Factory(y94, y942);
    }

    public static LinkMoreAccounts newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new LinkMoreAccounts(financialConnectionsManifestRepository, configuration);
    }

    @Override // p000.Y94
    public LinkMoreAccounts get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }
}
