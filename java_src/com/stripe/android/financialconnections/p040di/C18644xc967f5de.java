package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory */
/* loaded from: classes7.dex */
public final class C18644xc967f5de implements InterfaceC48812sj1<FinancialConnectionsInstitutionsRepository> {
    private final Y94<ApiRequest.Options> apiOptionsProvider;
    private final Y94<ApiRequest.Factory> apiRequestFactoryProvider;
    private final FinancialConnectionsSheetNativeModule module;
    private final Y94<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public C18644xc967f5de(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Factory> y942, Y94<ApiRequest.Options> y943) {
        this.module = financialConnectionsSheetNativeModule;
        this.requestExecutorProvider = y94;
        this.apiRequestFactoryProvider = y942;
        this.apiOptionsProvider = y943;
    }

    public static C18644xc967f5de create(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Factory> y942, Y94<ApiRequest.Options> y943) {
        return new C18644xc967f5de(financialConnectionsSheetNativeModule, y94, y942, y943);
    }

    public static FinancialConnectionsInstitutionsRepository providesFinancialConnectionsInstitutionsRepository(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Factory factory, ApiRequest.Options options) {
        return (FinancialConnectionsInstitutionsRepository) C51679xZ3.m5002e(financialConnectionsSheetNativeModule.providesFinancialConnectionsInstitutionsRepository(financialConnectionsRequestExecutor, factory, options));
    }

    @Override // p000.Y94
    public FinancialConnectionsInstitutionsRepository get() {
        return providesFinancialConnectionsInstitutionsRepository(this.module, this.requestExecutorProvider.get(), this.apiRequestFactoryProvider.get(), this.apiOptionsProvider.get());
    }
}
