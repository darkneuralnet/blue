package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
/* loaded from: classes7.dex */
public final class ManualEntryViewModel_Factory implements InterfaceC48812sj1<ManualEntryViewModel> {
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<GoNext> goNextProvider;
    private final Y94<ManualEntryState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Y94<PollAttachPaymentAccount> pollAttachPaymentAccountProvider;

    public ManualEntryViewModel_Factory(Y94<ManualEntryState> y94, Y94<NativeAuthFlowCoordinator> y942, Y94<PollAttachPaymentAccount> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<GetManifest> y945, Y94<GoNext> y946, Y94<Logger> y947) {
        this.initialStateProvider = y94;
        this.nativeAuthFlowCoordinatorProvider = y942;
        this.pollAttachPaymentAccountProvider = y943;
        this.eventTrackerProvider = y944;
        this.getManifestProvider = y945;
        this.goNextProvider = y946;
        this.loggerProvider = y947;
    }

    public static ManualEntryViewModel_Factory create(Y94<ManualEntryState> y94, Y94<NativeAuthFlowCoordinator> y942, Y94<PollAttachPaymentAccount> y943, Y94<FinancialConnectionsAnalyticsTracker> y944, Y94<GetManifest> y945, Y94<GoNext> y946, Y94<Logger> y947) {
        return new ManualEntryViewModel_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static ManualEntryViewModel newInstance(ManualEntryState manualEntryState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GetManifest getManifest, GoNext goNext, Logger logger) {
        return new ManualEntryViewModel(manualEntryState, nativeAuthFlowCoordinator, pollAttachPaymentAccount, financialConnectionsAnalyticsTracker, getManifest, goNext, logger);
    }

    @Override // p000.Y94
    public ManualEntryViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.pollAttachPaymentAccountProvider.get(), this.eventTrackerProvider.get(), this.getManifestProvider.get(), this.goNextProvider.get(), this.loggerProvider.get());
    }
}
