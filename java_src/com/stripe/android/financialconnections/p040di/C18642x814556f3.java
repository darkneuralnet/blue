package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import java.util.Locale;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory */
/* loaded from: classes7.dex */
public final class C18642x814556f3 implements InterfaceC48812sj1<FinancialConnectionsManifestRepository> {
    private final Y94<ApiRequest.Options> apiOptionsProvider;
    private final Y94<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Y94<Locale> localeProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public C18642x814556f3(Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Factory> y942, Y94<ApiRequest.Options> y943, Y94<Locale> y944, Y94<Logger> y945) {
        this.requestExecutorProvider = y94;
        this.apiRequestFactoryProvider = y942;
        this.apiOptionsProvider = y943;
        this.localeProvider = y944;
        this.loggerProvider = y945;
    }

    public static C18642x814556f3 create(Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Factory> y942, Y94<ApiRequest.Options> y943, Y94<Locale> y944, Y94<Logger> y945) {
        return new C18642x814556f3(y94, y942, y943, y944, y945);
    }

    public static FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Factory factory, ApiRequest.Options options, Locale locale, Logger logger) {
        return (FinancialConnectionsManifestRepository) C51679xZ3.m5002e(FinancialConnectionsSheetModule.INSTANCE.providesFinancialConnectionsManifestRepository(financialConnectionsRequestExecutor, factory, options, locale, logger));
    }

    @Override // p000.Y94
    public FinancialConnectionsManifestRepository get() {
        return providesFinancialConnectionsManifestRepository(this.requestExecutorProvider.get(), this.apiRequestFactoryProvider.get(), this.apiOptionsProvider.get(), this.localeProvider.get(), this.loggerProvider.get());
    }
}
