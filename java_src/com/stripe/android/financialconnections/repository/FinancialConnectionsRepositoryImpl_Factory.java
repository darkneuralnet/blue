package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
/* loaded from: classes7.dex */
public final class FinancialConnectionsRepositoryImpl_Factory implements InterfaceC48812sj1<FinancialConnectionsRepositoryImpl> {
    private final Y94<ApiRequest.Options> apiOptionsProvider;
    private final Y94<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Y94<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public FinancialConnectionsRepositoryImpl_Factory(Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Options> y942, Y94<ApiRequest.Factory> y943) {
        this.requestExecutorProvider = y94;
        this.apiOptionsProvider = y942;
        this.apiRequestFactoryProvider = y943;
    }

    public static FinancialConnectionsRepositoryImpl_Factory create(Y94<FinancialConnectionsRequestExecutor> y94, Y94<ApiRequest.Options> y942, Y94<ApiRequest.Factory> y943) {
        return new FinancialConnectionsRepositoryImpl_Factory(y94, y942, y943);
    }

    public static FinancialConnectionsRepositoryImpl newInstance(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Options options, ApiRequest.Factory factory) {
        return new FinancialConnectionsRepositoryImpl(financialConnectionsRequestExecutor, options, factory);
    }

    @Override // p000.Y94
    public FinancialConnectionsRepositoryImpl get() {
        return newInstance(this.requestExecutorProvider.get(), this.apiOptionsProvider.get(), this.apiRequestFactoryProvider.get());
    }
}
