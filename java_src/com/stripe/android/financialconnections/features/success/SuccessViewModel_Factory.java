package com.stripe.android.financialconnections.features.success;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.GetAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.navigation.NavigationManager;
/* loaded from: classes7.dex */
public final class SuccessViewModel_Factory implements InterfaceC48812sj1<SuccessViewModel> {
    private final Y94<CompleteFinancialConnectionsSession> completeFinancialConnectionsSessionProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GetAuthorizationSessionAccounts> getAuthorizationSessionAccountsProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<SuccessState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Y94<NavigationManager> navigationManagerProvider;

    public SuccessViewModel_Factory(Y94<SuccessState> y94, Y94<GetAuthorizationSessionAccounts> y942, Y94<GetManifest> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<Logger> y945, Y94<NavigationManager> y946, Y94<CompleteFinancialConnectionsSession> y947, Y94<NativeAuthFlowCoordinator> y948) {
        this.initialStateProvider = y94;
        this.getAuthorizationSessionAccountsProvider = y942;
        this.getManifestProvider = y943;
        this.eventTrackerProvider = y944;
        this.loggerProvider = y945;
        this.navigationManagerProvider = y946;
        this.completeFinancialConnectionsSessionProvider = y947;
        this.nativeAuthFlowCoordinatorProvider = y948;
    }

    public static SuccessViewModel_Factory create(Y94<SuccessState> y94, Y94<GetAuthorizationSessionAccounts> y942, Y94<GetManifest> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<Logger> y945, Y94<NavigationManager> y946, Y94<CompleteFinancialConnectionsSession> y947, Y94<NativeAuthFlowCoordinator> y948) {
        return new SuccessViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static SuccessViewModel newInstance(SuccessState successState, GetAuthorizationSessionAccounts getAuthorizationSessionAccounts, GetManifest getManifest, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Logger logger, NavigationManager navigationManager, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        return new SuccessViewModel(successState, getAuthorizationSessionAccounts, getManifest, financialConnectionsAnalyticsTracker, logger, navigationManager, completeFinancialConnectionsSession, nativeAuthFlowCoordinator);
    }

    @Override // p000.Y94
    public SuccessViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.getAuthorizationSessionAccountsProvider.get(), this.getManifestProvider.get(), this.eventTrackerProvider.get(), this.loggerProvider.get(), this.navigationManagerProvider.get(), this.completeFinancialConnectionsSessionProvider.get(), this.nativeAuthFlowCoordinatorProvider.get());
    }
}
