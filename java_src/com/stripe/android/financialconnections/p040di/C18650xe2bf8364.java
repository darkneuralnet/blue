package com.stripe.android.financialconnections.p040di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.StripeNetworkClient;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvideStripeNetworkClientFactory */
/* loaded from: classes7.dex */
public final class C18650xe2bf8364 implements InterfaceC48812sj1<StripeNetworkClient> {
    private final Y94<CoroutineContext> contextProvider;
    private final Y94<Logger> loggerProvider;

    public C18650xe2bf8364(Y94<CoroutineContext> y94, Y94<Logger> y942) {
        this.contextProvider = y94;
        this.loggerProvider = y942;
    }

    public static C18650xe2bf8364 create(Y94<CoroutineContext> y94, Y94<Logger> y942) {
        return new C18650xe2bf8364(y94, y942);
    }

    public static StripeNetworkClient provideStripeNetworkClient(CoroutineContext coroutineContext, Logger logger) {
        return (StripeNetworkClient) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.provideStripeNetworkClient(coroutineContext, logger));
    }

    @Override // p000.Y94
    public StripeNetworkClient get() {
        return provideStripeNetworkClient(this.contextProvider.get(), this.loggerProvider.get());
    }
}
