package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
/* loaded from: classes7.dex */
public final class PostAuthSessionEvent_Factory implements InterfaceC48812sj1<PostAuthSessionEvent> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<FinancialConnectionsManifestRepository> repositoryProvider;

    public PostAuthSessionEvent_Factory(Y94<FinancialConnectionsManifestRepository> y94, Y94<Logger> y942, Y94<FinancialConnectionsSheet.Configuration> y943) {
        this.repositoryProvider = y94;
        this.loggerProvider = y942;
        this.configurationProvider = y943;
    }

    public static PostAuthSessionEvent_Factory create(Y94<FinancialConnectionsManifestRepository> y94, Y94<Logger> y942, Y94<FinancialConnectionsSheet.Configuration> y943) {
        return new PostAuthSessionEvent_Factory(y94, y942, y943);
    }

    public static PostAuthSessionEvent newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, Logger logger, FinancialConnectionsSheet.Configuration configuration) {
        return new PostAuthSessionEvent(financialConnectionsManifestRepository, logger, configuration);
    }

    @Override // p000.Y94
    public PostAuthSessionEvent get() {
        return newInstance(this.repositoryProvider.get(), this.loggerProvider.get(), this.configurationProvider.get());
    }
}
