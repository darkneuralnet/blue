package com.stripe.android.financialconnections.p040di;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvideConnectionsRepositoryFactory */
/* loaded from: classes7.dex */
public final class C18648xf9c8e051 implements InterfaceC48812sj1<FinancialConnectionsRepository> {
    private final Y94<FinancialConnectionsRepositoryImpl> repositoryProvider;

    public C18648xf9c8e051(Y94<FinancialConnectionsRepositoryImpl> y94) {
        this.repositoryProvider = y94;
    }

    public static C18648xf9c8e051 create(Y94<FinancialConnectionsRepositoryImpl> y94) {
        return new C18648xf9c8e051(y94);
    }

    public static FinancialConnectionsRepository provideConnectionsRepository(FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl) {
        return (FinancialConnectionsRepository) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.provideConnectionsRepository(financialConnectionsRepositoryImpl));
    }

    @Override // p000.Y94
    public FinancialConnectionsRepository get() {
        return provideConnectionsRepository(this.repositoryProvider.get());
    }
}
