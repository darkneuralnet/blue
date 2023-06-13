package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import java.util.Locale;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory */
/* loaded from: classes7.dex */
public final class C18645x1c42b46a implements InterfaceC48812sj1<FinancialConnectionsManifestRepository> {
    private final Y94<ApiRequest.Options> apiOptionsProvider;
    private final Y94<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Y94<SynchronizeSessionResponse> initialSynchronizeSessionResponseProvider;
    private final Y94<Locale> localeProvider;
    private final Y94<Logger> loggerProvider;
    private final FinancialConnectionsSheetNativeModule module;
    private final Y94<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public C18645x1c42b46a(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Factory> y942, Y94<ApiRequest.Options> y943, Y94<Locale> y944, Y94<Logger> y945, Y94<SynchronizeSessionResponse> y946) {
        this.module = financialConnectionsSheetNativeModule;
        this.requestExecutorProvider = y94;
        this.apiRequestFactoryProvider = y942;
        this.apiOptionsProvider = y943;
        this.localeProvider = y944;
        this.loggerProvider = y945;
        this.initialSynchronizeSessionResponseProvider = y946;
    }

    public static C18645x1c42b46a create(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Factory> y942, Y94<ApiRequest.Options> y943, Y94<Locale> y944, Y94<Logger> y945, Y94<SynchronizeSessionResponse> y946) {
        return new C18645x1c42b46a(financialConnectionsSheetNativeModule, y94, y942, y943, y944, y945, y946);
    }

    public static FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Factory factory, ApiRequest.Options options, Locale locale, Logger logger, SynchronizeSessionResponse synchronizeSessionResponse) {
        return (FinancialConnectionsManifestRepository) C51679xZ3.m5002e(financialConnectionsSheetNativeModule.providesFinancialConnectionsManifestRepository(financialConnectionsRequestExecutor, factory, options, locale, logger, synchronizeSessionResponse));
    }

    @Override // p000.Y94
    public FinancialConnectionsManifestRepository get() {
        return providesFinancialConnectionsManifestRepository(this.module, this.requestExecutorProvider.get(), this.apiRequestFactoryProvider.get(), this.apiOptionsProvider.get(), this.localeProvider.get(), this.loggerProvider.get(), this.initialSynchronizeSessionResponseProvider.get());
    }
}
