package com.stripe.android.financialconnections.features.attachpayment;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.navigation.NavigationManager;
/* loaded from: classes7.dex */
public final class AttachPaymentViewModel_Factory implements InterfaceC48812sj1<AttachPaymentViewModel> {
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GetAuthorizationSessionAccounts> getAuthorizationSessionAccountsProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<GoNext> goNextProvider;
    private final Y94<AttachPaymentState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;
    private final Y94<PollAttachPaymentAccount> pollAttachPaymentAccountProvider;

    public AttachPaymentViewModel_Factory(Y94<AttachPaymentState> y94, Y94<PollAttachPaymentAccount> y942, Y94<FinancialConnectionsAnalyticsTracker> y943, Y94<GetAuthorizationSessionAccounts> y944, Y94<NavigationManager> y945, Y94<GetManifest> y946, Y94<GoNext> y947, Y94<Logger> y948) {
        this.initialStateProvider = y94;
        this.pollAttachPaymentAccountProvider = y942;
        this.eventTrackerProvider = y943;
        this.getAuthorizationSessionAccountsProvider = y944;
        this.navigationManagerProvider = y945;
        this.getManifestProvider = y946;
        this.goNextProvider = y947;
        this.loggerProvider = y948;
    }

    public static AttachPaymentViewModel_Factory create(Y94<AttachPaymentState> y94, Y94<PollAttachPaymentAccount> y942, Y94<FinancialConnectionsAnalyticsTracker> y943, Y94<GetAuthorizationSessionAccounts> y944, Y94<NavigationManager> y945, Y94<GetManifest> y946, Y94<GoNext> y947, Y94<Logger> y948) {
        return new AttachPaymentViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static AttachPaymentViewModel newInstance(AttachPaymentState attachPaymentState, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GetAuthorizationSessionAccounts getAuthorizationSessionAccounts, NavigationManager navigationManager, GetManifest getManifest, GoNext goNext, Logger logger) {
        return new AttachPaymentViewModel(attachPaymentState, pollAttachPaymentAccount, financialConnectionsAnalyticsTracker, getAuthorizationSessionAccounts, navigationManager, getManifest, goNext, logger);
    }

    @Override // p000.Y94
    public AttachPaymentViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.pollAttachPaymentAccountProvider.get(), this.eventTrackerProvider.get(), this.getAuthorizationSessionAccountsProvider.get(), this.navigationManagerProvider.get(), this.getManifestProvider.get(), this.goNextProvider.get(), this.loggerProvider.get());
    }
}
