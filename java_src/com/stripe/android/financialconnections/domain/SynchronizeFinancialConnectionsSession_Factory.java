package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class SynchronizeFinancialConnectionsSession_Factory implements InterfaceC48812sj1<SynchronizeFinancialConnectionsSession> {
    private final Y94<FinancialConnectionsManifestRepository> financialConnectionsRepositoryProvider;

    public SynchronizeFinancialConnectionsSession_Factory(Y94<FinancialConnectionsManifestRepository> y94) {
        this.financialConnectionsRepositoryProvider = y94;
    }

    public static SynchronizeFinancialConnectionsSession_Factory create(Y94<FinancialConnectionsManifestRepository> y94) {
        return new SynchronizeFinancialConnectionsSession_Factory(y94);
    }

    public static SynchronizeFinancialConnectionsSession newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository) {
        return new SynchronizeFinancialConnectionsSession(financialConnectionsManifestRepository);
    }

    @Override // p000.Y94
    public SynchronizeFinancialConnectionsSession get() {
        return newInstance(this.financialConnectionsRepositoryProvider.get());
    }
}
