package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import java.util.Locale;
/* loaded from: classes7.dex */
public final class AccountPickerViewModel_Factory implements InterfaceC48812sj1<AccountPickerViewModel> {
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<GoNext> goNextProvider;
    private final Y94<AccountPickerState> initialStateProvider;
    private final Y94<Locale> localeProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;
    private final Y94<PollAuthorizationSessionAccounts> pollAuthorizationSessionAccountsProvider;
    private final Y94<SelectAccounts> selectAccountsProvider;

    public AccountPickerViewModel_Factory(Y94<AccountPickerState> y94, Y94<FinancialConnectionsAnalyticsTracker> y942, Y94<SelectAccounts> y943, Y94<GetManifest> y944, Y94<GoNext> y945, Y94<Locale> y946, Y94<NavigationManager> y947, Y94<Logger> y948, Y94<PollAuthorizationSessionAccounts> y949) {
        this.initialStateProvider = y94;
        this.eventTrackerProvider = y942;
        this.selectAccountsProvider = y943;
        this.getManifestProvider = y944;
        this.goNextProvider = y945;
        this.localeProvider = y946;
        this.navigationManagerProvider = y947;
        this.loggerProvider = y948;
        this.pollAuthorizationSessionAccountsProvider = y949;
    }

    public static AccountPickerViewModel_Factory create(Y94<AccountPickerState> y94, Y94<FinancialConnectionsAnalyticsTracker> y942, Y94<SelectAccounts> y943, Y94<GetManifest> y944, Y94<GoNext> y945, Y94<Locale> y946, Y94<NavigationManager> y947, Y94<Logger> y948, Y94<PollAuthorizationSessionAccounts> y949) {
        return new AccountPickerViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    public static AccountPickerViewModel newInstance(AccountPickerState accountPickerState, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, SelectAccounts selectAccounts, GetManifest getManifest, GoNext goNext, Locale locale, NavigationManager navigationManager, Logger logger, PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts) {
        return new AccountPickerViewModel(accountPickerState, financialConnectionsAnalyticsTracker, selectAccounts, getManifest, goNext, locale, navigationManager, logger, pollAuthorizationSessionAccounts);
    }

    @Override // p000.Y94
    public AccountPickerViewModel get() {
        return newInstance(this.initialStateProvider.get(), this.eventTrackerProvider.get(), this.selectAccountsProvider.get(), this.getManifestProvider.get(), this.goNextProvider.get(), this.localeProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get(), this.pollAuthorizationSessionAccountsProvider.get());
    }
}
