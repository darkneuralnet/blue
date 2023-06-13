package com.stripe.android.financialconnections.p040di;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory */
/* loaded from: classes7.dex */
public final class C18639x28e5e010 implements InterfaceC48812sj1<Boolean> {

    /* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C18639x28e5e010 INSTANCE = new C18639x28e5e010();

        private InstanceHolder() {
        }
    }

    public static C18639x28e5e010 create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return FinancialConnectionsSheetConfigurationModule.INSTANCE.providesEnableLogging();
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }
}
