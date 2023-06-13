package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class UpdateLocalManifest_Factory implements InterfaceC48812sj1<UpdateLocalManifest> {
    private final Y94<FinancialConnectionsManifestRepository> repositoryProvider;

    public UpdateLocalManifest_Factory(Y94<FinancialConnectionsManifestRepository> y94) {
        this.repositoryProvider = y94;
    }

    public static UpdateLocalManifest_Factory create(Y94<FinancialConnectionsManifestRepository> y94) {
        return new UpdateLocalManifest_Factory(y94);
    }

    public static UpdateLocalManifest newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository) {
        return new UpdateLocalManifest(financialConnectionsManifestRepository);
    }

    @Override // p000.Y94
    public UpdateLocalManifest get() {
        return newInstance(this.repositoryProvider.get());
    }
}
