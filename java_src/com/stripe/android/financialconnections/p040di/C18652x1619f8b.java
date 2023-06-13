package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetManifest;
import java.util.Locale;
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory */
/* loaded from: classes7.dex */
public final class C18652x1619f8b implements InterfaceC48812sj1<FinancialConnectionsAnalyticsTracker> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<Application> contextProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<Locale> localeProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<StripeNetworkClient> stripeNetworkClientProvider;

    public C18652x1619f8b(Y94<Application> y94, Y94<Logger> y942, Y94<GetManifest> y943, Y94<Locale> y944, Y94<FinancialConnectionsSheet.Configuration> y945, Y94<StripeNetworkClient> y946) {
        this.contextProvider = y94;
        this.loggerProvider = y942;
        this.getManifestProvider = y943;
        this.localeProvider = y944;
        this.configurationProvider = y945;
        this.stripeNetworkClientProvider = y946;
    }

    public static C18652x1619f8b create(Y94<Application> y94, Y94<Logger> y942, Y94<GetManifest> y943, Y94<Locale> y944, Y94<FinancialConnectionsSheet.Configuration> y945, Y94<StripeNetworkClient> y946) {
        return new C18652x1619f8b(y94, y942, y943, y944, y945, y946);
    }

    public static FinancialConnectionsAnalyticsTracker providesAnalyticsTracker(Application application, Logger logger, GetManifest getManifest, Locale locale, FinancialConnectionsSheet.Configuration configuration, StripeNetworkClient stripeNetworkClient) {
        return (FinancialConnectionsAnalyticsTracker) C51679xZ3.m5002e(FinancialConnectionsSheetSharedModule.INSTANCE.providesAnalyticsTracker(application, logger, getManifest, locale, configuration, stripeNetworkClient));
    }

    @Override // p000.Y94
    public FinancialConnectionsAnalyticsTracker get() {
        return providesAnalyticsTracker(this.contextProvider.get(), this.loggerProvider.get(), this.getManifestProvider.get(), this.localeProvider.get(), this.configurationProvider.get(), this.stripeNetworkClientProvider.get());
    }
}
