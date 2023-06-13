package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.utils.UriUtils;
/* loaded from: classes7.dex */
public final class ConsentViewModel_Factory implements InterfaceC48812sj1<ConsentViewModel> {
    private final Y94<AcceptConsent> acceptConsentProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GetOrFetchSync> getOrFetchSyncProvider;
    private final Y94<GoNext> goNextProvider;
    private final Y94<ConsentState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;
    private final Y94<UriUtils> uriUtilsProvider;

    public ConsentViewModel_Factory(Y94<ConsentState> y94, Y94<AcceptConsent> y942, Y94<GoNext> y943, Y94<GetOrFetchSync> y944, Y94<NavigationManager> y945, Y94<FinancialConnectionsAnalyticsTracker> y946, Y94<UriUtils> y947, Y94<Logger> y948) {
        this.initialStateProvider = y94;
        this.acceptConsentProvider = y942;
        this.goNextProvider = y943;
        this.getOrFetchSyncProvider = y944;
        this.navigationManagerProvider = y945;
        this.eventTrackerProvider = y946;
        this.uriUtilsProvider = y947;
        this.loggerProvider = y948;
    }

    public static ConsentViewModel_Factory create(Y94<ConsentState> y94, Y94<AcceptConsent> y942, Y94<GoNext> y943, Y94<GetOrFetchSync> y944, Y94<NavigationManager> y945, Y94<FinancialConnectionsAnalyticsTracker> y946, Y94<UriUtils> y947, Y94<Logger> y948) {
        return new ConsentViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static ConsentViewModel newInstance(ConsentState consentState, AcceptConsent acceptConsent, GoNext goNext, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, UriUtils uriUtils, Logger logger) {
        return new ConsentViewModel(consentState, acceptConsent, goNext, getOrFetchSync, navigationManager, financialConnectionsAnalyticsTracker, uriUtils, logger);
    }

    @Override // p000.Y94
    public ConsentViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.acceptConsentProvider.get(), this.goNextProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.eventTrackerProvider.get(), this.uriUtilsProvider.get(), this.loggerProvider.get());
    }
}
