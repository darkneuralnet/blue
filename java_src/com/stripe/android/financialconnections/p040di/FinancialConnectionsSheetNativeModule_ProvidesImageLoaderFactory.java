package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.stripe.android.uicore.image.StripeImageLoader;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory implements InterfaceC48812sj1<StripeImageLoader> {
    private final Y94<Application> contextProvider;
    private final FinancialConnectionsSheetNativeModule module;

    public FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<Application> y94) {
        this.module = financialConnectionsSheetNativeModule;
        this.contextProvider = y94;
    }

    public static FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory create(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Y94<Application> y94) {
        return new FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory(financialConnectionsSheetNativeModule, y94);
    }

    public static StripeImageLoader providesImageLoader(FinancialConnectionsSheetNativeModule financialConnectionsSheetNativeModule, Application application) {
        return (StripeImageLoader) C51679xZ3.m5002e(financialConnectionsSheetNativeModule.providesImageLoader(application));
    }

    @Override // p000.Y94
    public StripeImageLoader get() {
        return providesImageLoader(this.module, this.contextProvider.get());
    }
}
