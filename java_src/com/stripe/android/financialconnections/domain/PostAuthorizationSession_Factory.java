package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class PostAuthorizationSession_Factory implements InterfaceC48812sj1<PostAuthorizationSession> {
    private final Y94<String> applicationIdProvider;
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsManifestRepository> repositoryProvider;

    public PostAuthorizationSession_Factory(Y94<FinancialConnectionsManifestRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942, Y94<String> y943) {
        this.repositoryProvider = y94;
        this.configurationProvider = y942;
        this.applicationIdProvider = y943;
    }

    public static PostAuthorizationSession_Factory create(Y94<FinancialConnectionsManifestRepository> y94, Y94<FinancialConnectionsSheet.Configuration> y942, Y94<String> y943) {
        return new PostAuthorizationSession_Factory(y94, y942, y943);
    }

    public static PostAuthorizationSession newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheet.Configuration configuration, String str) {
        return new PostAuthorizationSession(financialConnectionsManifestRepository, configuration, str);
    }

    @Override // p000.Y94
    public PostAuthorizationSession get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get(), this.applicationIdProvider.get());
    }
}
