package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.utils.UriUtils;
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel_Factory implements InterfaceC48812sj1<PartnerAuthViewModel> {
    private final Y94<String> applicationIdProvider;
    private final Y94<CancelAuthorizationSession> cancelAuthorizationSessionProvider;
    private final Y94<CompleteAuthorizationSession> completeAuthorizationSessionProvider;
    private final Y94<PostAuthorizationSession> createAuthorizationSessionProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<GoNext> goNextProvider;
    private final Y94<PartnerAuthState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;
    private final Y94<PollAuthorizationSessionOAuthResults> pollAuthorizationSessionOAuthResultsProvider;
    private final Y94<PostAuthSessionEvent> postAuthSessionEventProvider;
    private final Y94<UriUtils> uriUtilsProvider;

    public PartnerAuthViewModel_Factory(Y94<CompleteAuthorizationSession> y94, Y94<PostAuthorizationSession> y942, Y94<CancelAuthorizationSession> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<String> y945, Y94<UriUtils> y946, Y94<PostAuthSessionEvent> y947, Y94<GetManifest> y948, Y94<GoNext> y949, Y94<NavigationManager> y9410, Y94<PollAuthorizationSessionOAuthResults> y9411, Y94<Logger> y9412, Y94<PartnerAuthState> y9413) {
        this.completeAuthorizationSessionProvider = y94;
        this.createAuthorizationSessionProvider = y942;
        this.cancelAuthorizationSessionProvider = y943;
        this.eventTrackerProvider = y944;
        this.applicationIdProvider = y945;
        this.uriUtilsProvider = y946;
        this.postAuthSessionEventProvider = y947;
        this.getManifestProvider = y948;
        this.goNextProvider = y949;
        this.navigationManagerProvider = y9410;
        this.pollAuthorizationSessionOAuthResultsProvider = y9411;
        this.loggerProvider = y9412;
        this.initialStateProvider = y9413;
    }

    public static PartnerAuthViewModel_Factory create(Y94<CompleteAuthorizationSession> y94, Y94<PostAuthorizationSession> y942, Y94<CancelAuthorizationSession> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<String> y945, Y94<UriUtils> y946, Y94<PostAuthSessionEvent> y947, Y94<GetManifest> y948, Y94<GoNext> y949, Y94<NavigationManager> y9410, Y94<PollAuthorizationSessionOAuthResults> y9411, Y94<Logger> y9412, Y94<PartnerAuthState> y9413) {
        return new PartnerAuthViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412, y9413);
    }

    public static PartnerAuthViewModel newInstance(CompleteAuthorizationSession completeAuthorizationSession, PostAuthorizationSession postAuthorizationSession, CancelAuthorizationSession cancelAuthorizationSession, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, String str, UriUtils uriUtils, PostAuthSessionEvent postAuthSessionEvent, GetManifest getManifest, GoNext goNext, NavigationManager navigationManager, PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults, Logger logger, PartnerAuthState partnerAuthState) {
        return new PartnerAuthViewModel(completeAuthorizationSession, postAuthorizationSession, cancelAuthorizationSession, financialConnectionsAnalyticsTracker, str, uriUtils, postAuthSessionEvent, getManifest, goNext, navigationManager, pollAuthorizationSessionOAuthResults, logger, partnerAuthState);
    }

    @Override // p000.Y94
    public PartnerAuthViewModel get() {
        return newInstance(this.completeAuthorizationSessionProvider.get(), this.createAuthorizationSessionProvider.get(), this.cancelAuthorizationSessionProvider.get(), this.eventTrackerProvider.get(), this.applicationIdProvider.get(), this.uriUtilsProvider.get(), this.postAuthSessionEventProvider.get(), this.getManifestProvider.get(), this.goNextProvider.get(), this.navigationManagerProvider.get(), this.pollAuthorizationSessionOAuthResultsProvider.get(), this.loggerProvider.get(), this.initialStateProvider.get());
    }
}
