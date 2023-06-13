package com.stripe.android.financialconnections.p040di;

import android.app.Application;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory */
/* loaded from: classes7.dex */
public final class C18638x7ea6f701 implements InterfaceC48812sj1<String> {
    private final Y94<Application> applicationProvider;

    public C18638x7ea6f701(Y94<Application> y94) {
        this.applicationProvider = y94;
    }

    public static C18638x7ea6f701 create(Y94<Application> y94) {
        return new C18638x7ea6f701(y94);
    }

    public static String providesApplicationId(Application application) {
        return (String) C51679xZ3.m5002e(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesApplicationId(application));
    }

    @Override // p000.Y94
    public String get() {
        return providesApplicationId(this.applicationProvider.get());
    }
}
