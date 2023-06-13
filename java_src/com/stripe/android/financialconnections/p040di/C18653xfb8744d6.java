package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.networking.ApiRequest;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesApiOptions$financial_connections_releaseFactory */
/* loaded from: classes7.dex */
public final class C18653xfb8744d6 implements InterfaceC48812sj1<ApiRequest.Options> {
    private final Y94<String> publishableKeyProvider;
    private final Y94<String> stripeAccountIdProvider;

    public C18653xfb8744d6(Y94<String> y94, Y94<String> y942) {
        this.publishableKeyProvider = y94;
        this.stripeAccountIdProvider = y942;
    }

    public static C18653xfb8744d6 create(Y94<String> y94, Y94<String> y942) {
        return new C18653xfb8744d6(y94, y942);
    }

    public static ApiRequest.Options providesApiOptions$financial_connections_release(String str, String str2) {
        return (ApiRequest.Options) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.providesApiOptions$financial_connections_release(str, str2));
    }

    @Override // p000.Y94
    public ApiRequest.Options get() {
        return providesApiOptions$financial_connections_release(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }
}
