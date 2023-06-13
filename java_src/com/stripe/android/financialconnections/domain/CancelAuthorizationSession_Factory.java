package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class CancelAuthorizationSession_Factory implements InterfaceC48812sj1<CancelAuthorizationSession> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<NativeAuthFlowCoordinator> coordinatorProvider;
    private final Y94<FinancialConnectionsManifestRepository> repositoryProvider;

    public CancelAuthorizationSession_Factory(Y94<NativeAuthFlowCoordinator> y94, Y94<FinancialConnectionsManifestRepository> y942, Y94<FinancialConnectionsSheet.Configuration> y943) {
        this.coordinatorProvider = y94;
        this.repositoryProvider = y942;
        this.configurationProvider = y943;
    }

    public static CancelAuthorizationSession_Factory create(Y94<NativeAuthFlowCoordinator> y94, Y94<FinancialConnectionsManifestRepository> y942, Y94<FinancialConnectionsSheet.Configuration> y943) {
        return new CancelAuthorizationSession_Factory(y94, y942, y943);
    }

    public static CancelAuthorizationSession newInstance(NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheet.Configuration configuration) {
        return new CancelAuthorizationSession(nativeAuthFlowCoordinator, financialConnectionsManifestRepository, configuration);
    }

    @Override // p000.Y94
    public CancelAuthorizationSession get() {
        return newInstance(this.coordinatorProvider.get(), this.repositoryProvider.get(), this.configurationProvider.get());
    }
}