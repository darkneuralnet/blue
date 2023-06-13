package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory */
/* loaded from: classes7.dex */
public final class C18647xc674418c implements InterfaceC48812sj1<AnalyticsRequestFactory> {
    private final Y94<Application> applicationProvider;
    private final Y94<String> publishableKeyProvider;

    public C18647xc674418c(Y94<Application> y94, Y94<String> y942) {
        this.applicationProvider = y94;
        this.publishableKeyProvider = y942;
    }

    public static C18647xc674418c create(Y94<Application> y94, Y94<String> y942) {
        return new C18647xc674418c(y94, y942);
    }

    public static AnalyticsRequestFactory provideAnalyticsRequestFactory$financial_connections_release(Application application, String str) {
        return (AnalyticsRequestFactory) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.provideAnalyticsRequestFactory$financial_connections_release(application, str));
    }

    @Override // p000.Y94
    public AnalyticsRequestFactory get() {
        return provideAnalyticsRequestFactory$financial_connections_release(this.applicationProvider.get(), this.publishableKeyProvider.get());
    }
}
