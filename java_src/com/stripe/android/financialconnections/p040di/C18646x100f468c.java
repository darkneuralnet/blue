package com.stripe.android.financialconnections.p040di;

import com.stripe.android.financialconnections.navigation.NavigationManager;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory */
/* loaded from: classes7.dex */
public final class C18646x100f468c implements InterfaceC48812sj1<NavigationManager> {
    private final FinancialConnectionsSheetNativeModule module;

    public C18646x100f468c(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule) {
        this.module = financialConnectionsSheetNativeModule;
    }

    public static C18646x100f468c create(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule) {
        return new C18646x100f468c(financialConnectionsSheetNativeModule);
    }

    public static NavigationManager providesNavigationManager(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule) {
        return (NavigationManager) C51679xZ3.m5002e(financialConnectionsSheetNativeModule.providesNavigationManager());
    }

    @Override // p000.Y94
    public NavigationManager get() {
        return providesNavigationManager(this.module);
    }
}
