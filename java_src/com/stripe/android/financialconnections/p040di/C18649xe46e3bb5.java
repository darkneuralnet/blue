package com.stripe.android.financialconnections.p040di;

import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvideEventReporterFactory */
/* loaded from: classes7.dex */
public final class C18649xe46e3bb5 implements InterfaceC48812sj1<FinancialConnectionsEventReporter> {
    private final Y94<DefaultFinancialConnectionsEventReporter> defaultFinancialConnectionsEventReporterProvider;

    public C18649xe46e3bb5(Y94<DefaultFinancialConnectionsEventReporter> y94) {
        this.defaultFinancialConnectionsEventReporterProvider = y94;
    }

    public static C18649xe46e3bb5 create(Y94<DefaultFinancialConnectionsEventReporter> y94) {
        return new C18649xe46e3bb5(y94);
    }

    public static FinancialConnectionsEventReporter provideEventReporter(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter) {
        return (FinancialConnectionsEventReporter) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.provideEventReporter(defaultFinancialConnectionsEventReporter));
    }

    @Override // p000.Y94
    public FinancialConnectionsEventReporter get() {
        return provideEventReporter(this.defaultFinancialConnectionsEventReporterProvider.get());
    }
}
