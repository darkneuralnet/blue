package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory */
/* loaded from: classes7.dex */
public final class C18651xbcea0d9e implements InterfaceC48812sj1<AnalyticsRequestExecutor> {
    private final Y94<DefaultAnalyticsRequestExecutor> executorProvider;

    public C18651xbcea0d9e(Y94<DefaultAnalyticsRequestExecutor> y94) {
        this.executorProvider = y94;
    }

    public static C18651xbcea0d9e create(Y94<DefaultAnalyticsRequestExecutor> y94) {
        return new C18651xbcea0d9e(y94);
    }

    public static AnalyticsRequestExecutor providesAnalyticsRequestExecutor$financial_connections_release(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor) {
        return (AnalyticsRequestExecutor) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.providesAnalyticsRequestExecutor$financial_connections_release(defaultAnalyticsRequestExecutor));
    }

    @Override // p000.Y94
    public AnalyticsRequestExecutor get() {
        return providesAnalyticsRequestExecutor$financial_connections_release(this.executorProvider.get());
    }
}
