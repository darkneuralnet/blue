package com.stripe.android.financialconnections.p040di;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory */
/* loaded from: classes7.dex */
public final class C18641xdfed4cb1 implements InterfaceC48812sj1<String> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;

    public C18641xdfed4cb1(Y94<FinancialConnectionsSheet.Configuration> y94) {
        this.configurationProvider = y94;
    }

    public static C18641xdfed4cb1 create(Y94<FinancialConnectionsSheet.Configuration> y94) {
        return new C18641xdfed4cb1(y94);
    }

    public static String providesStripeAccountId(FinancialConnectionsSheet.Configuration configuration) {
        return FinancialConnectionsSheetConfigurationModule.INSTANCE.providesStripeAccountId(configuration);
    }

    @Override // p000.Y94
    public String get() {
        return providesStripeAccountId(this.configurationProvider.get());
    }
}
