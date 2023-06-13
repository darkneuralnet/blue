package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsAccountsRepositoryFactory */
/* loaded from: classes7.dex */
public final class C18643xc3c26b93 implements InterfaceC48812sj1<FinancialConnectionsAccountsRepository> {
    private final Y94<ApiRequest.Options> apiOptionsProvider;
    private final Y94<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Y94<Logger> loggerProvider;
    private final FinancialConnectionsSheetNativeModule module;
    private final Y94<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public C18643xc3c26b93(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Options> y942, Y94<ApiRequest.Factory> y943, Y94<Logger> y944) {
        this.module = financialConnectionsSheetNativeModule;
        this.requestExecutorProvider = y94;
        this.apiOptionsProvider = y942;
        this.apiRequestFactoryProvider = y943;
        this.loggerProvider = y944;
    }

    public static C18643xc3c26b93 create(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Options> y942, Y94<ApiRequest.Factory> y943, Y94<Logger> y944) {
        return new C18643xc3c26b93(financialConnectionsSheetNativeModule, y94, y942, y943, y944);
    }

    public static FinancialConnectionsAccountsRepository providesFinancialConnectionsAccountsRepository(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Options options, ApiRequest.Factory factory, Logger logger) {
        return (FinancialConnectionsAccountsRepository) C51679xZ3.m5002e(financialConnectionsSheetNativeModule.providesFinancialConnectionsAccountsRepository(financialConnectionsRequestExecutor, options, factory, logger));
    }

    @Override // p000.Y94
    public FinancialConnectionsAccountsRepository get() {
        return providesFinancialConnectionsAccountsRepository(this.module, this.requestExecutorProvider.get(), this.apiOptionsProvider.get(), this.apiRequestFactoryProvider.get(), this.loggerProvider.get());
    }
}
