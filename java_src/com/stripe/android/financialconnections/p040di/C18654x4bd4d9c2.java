package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.networking.ApiRequest;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesApiRequestFactoryFactory */
/* loaded from: classes7.dex */
public final class C18654x4bd4d9c2 implements InterfaceC48812sj1<ApiRequest.Factory> {

    /* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesApiRequestFactoryFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C18654x4bd4d9c2 INSTANCE = new C18654x4bd4d9c2();

        private InstanceHolder() {
        }
    }

    public static C18654x4bd4d9c2 create() {
        return InstanceHolder.INSTANCE;
    }

    public static ApiRequest.Factory providesApiRequestFactory() {
        return (ApiRequest.Factory) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.providesApiRequestFactory());
    }

    @Override // p000.Y94
    public ApiRequest.Factory get() {
        return providesApiRequestFactory();
    }
}
