package com.stripe.android.financialconnections.features.reset;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.LinkMoreAccounts;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
/* loaded from: classes7.dex */
public final class ResetViewModel_Factory implements InterfaceC48812sj1<ResetViewModel> {
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GoNext> goNextProvider;
    private final Y94<ResetState> initialStateProvider;
    private final Y94<LinkMoreAccounts> linkMoreAccountsProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;

    public ResetViewModel_Factory(Y94<ResetState> y94, Y94<LinkMoreAccounts> y942, Y94<NativeAuthFlowCoordinator> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<GoNext> y945, Y94<Logger> y946) {
        this.initialStateProvider = y94;
        this.linkMoreAccountsProvider = y942;
        this.nativeAuthFlowCoordinatorProvider = y943;
        this.eventTrackerProvider = y944;
        this.goNextProvider = y945;
        this.loggerProvider = y946;
    }

    public static ResetViewModel_Factory create(Y94<ResetState> y94, Y94<LinkMoreAccounts> y942, Y94<NativeAuthFlowCoordinator> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<GoNext> y945, Y94<Logger> y946) {
        return new ResetViewModel_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static ResetViewModel newInstance(ResetState resetState, LinkMoreAccounts linkMoreAccounts, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GoNext goNext, Logger logger) {
        return new ResetViewModel(resetState, linkMoreAccounts, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, goNext, logger);
    }

    @Override // p000.Y94
    public ResetViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.linkMoreAccountsProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.goNextProvider.get(), this.loggerProvider.get());
    }
}
