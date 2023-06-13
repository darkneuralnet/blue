package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
/* loaded from: classes7.dex */
public final class ManualEntrySuccessViewModel_Factory implements InterfaceC48812sj1<ManualEntrySuccessViewModel> {
    private final Y94<CompleteFinancialConnectionsSession> completeFinancialConnectionsSessionProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<ManualEntrySuccessState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;

    public ManualEntrySuccessViewModel_Factory(Y94<ManualEntrySuccessState> y94, Y94<CompleteFinancialConnectionsSession> y942, Y94<FinancialConnectionsAnalyticsTracker> y943, Y94<NativeAuthFlowCoordinator> y944, Y94<Logger> y945) {
        this.initialStateProvider = y94;
        this.completeFinancialConnectionsSessionProvider = y942;
        this.eventTrackerProvider = y943;
        this.nativeAuthFlowCoordinatorProvider = y944;
        this.loggerProvider = y945;
    }

    public static ManualEntrySuccessViewModel_Factory create(Y94<ManualEntrySuccessState> y94, Y94<CompleteFinancialConnectionsSession> y942, Y94<FinancialConnectionsAnalyticsTracker> y943, Y94<NativeAuthFlowCoordinator> y944, Y94<Logger> y945) {
        return new ManualEntrySuccessViewModel_Factory(y94, y942, y943, y944, y945);
    }

    public static ManualEntrySuccessViewModel newInstance(ManualEntrySuccessState manualEntrySuccessState, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, Logger logger) {
        return new ManualEntrySuccessViewModel(manualEntrySuccessState, completeFinancialConnectionsSession, financialConnectionsAnalyticsTracker, nativeAuthFlowCoordinator, logger);
    }

    @Override // p000.Y94
    public ManualEntrySuccessViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.completeFinancialConnectionsSessionProvider.get(), this.eventTrackerProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.loggerProvider.get());
    }
}
