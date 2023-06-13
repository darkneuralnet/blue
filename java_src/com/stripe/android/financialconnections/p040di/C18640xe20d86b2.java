package com.stripe.android.financialconnections.p040di;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory */
/* loaded from: classes7.dex */
public final class C18640xe20d86b2 implements InterfaceC48812sj1<String> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;

    public C18640xe20d86b2(Y94<FinancialConnectionsSheet.Configuration> y94) {
        this.configurationProvider = y94;
    }

    public static C18640xe20d86b2 create(Y94<FinancialConnectionsSheet.Configuration> y94) {
        return new C18640xe20d86b2(y94);
    }

    public static String providesPublishableKey(FinancialConnectionsSheet.Configuration configuration) {
        return (String) C51679xZ3.m5002e(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesPublishableKey(configuration));
    }

    @Override // p000.Y94
    public String get() {
        return providesPublishableKey(this.configurationProvider.get());
    }
}
