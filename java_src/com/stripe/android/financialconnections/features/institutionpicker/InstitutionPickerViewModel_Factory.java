package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.navigation.NavigationManager;
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel_Factory implements InterfaceC48812sj1<InstitutionPickerViewModel> {
    private final Y94<FinancialConnectionsSheet.Configuration> configurationProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<FeaturedInstitutions> featuredInstitutionsProvider;
    private final Y94<GetManifest> getManifestProvider;
    private final Y94<InstitutionPickerState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NavigationManager> navigationManagerProvider;
    private final Y94<SearchInstitutions> searchInstitutionsProvider;
    private final Y94<UpdateLocalManifest> updateLocalManifestProvider;

    public InstitutionPickerViewModel_Factory(Y94<FinancialConnectionsSheet.Configuration> y94, Y94<SearchInstitutions> y942, Y94<FeaturedInstitutions> y943, Y94<GetManifest> y944, Y94<FinancialConnectionsAnalyticsTracker> y945, Y94<NavigationManager> y946, Y94<UpdateLocalManifest> y947, Y94<Logger> y948, Y94<InstitutionPickerState> y949) {
        this.configurationProvider = y94;
        this.searchInstitutionsProvider = y942;
        this.featuredInstitutionsProvider = y943;
        this.getManifestProvider = y944;
        this.eventTrackerProvider = y945;
        this.navigationManagerProvider = y946;
        this.updateLocalManifestProvider = y947;
        this.loggerProvider = y948;
        this.initialStateProvider = y949;
    }

    public static InstitutionPickerViewModel_Factory create(Y94<FinancialConnectionsSheet.Configuration> y94, Y94<SearchInstitutions> y942, Y94<FeaturedInstitutions> y943, Y94<GetManifest> y944, Y94<FinancialConnectionsAnalyticsTracker> y945, Y94<NavigationManager> y946, Y94<UpdateLocalManifest> y947, Y94<Logger> y948, Y94<InstitutionPickerState> y949) {
        return new InstitutionPickerViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    public static InstitutionPickerViewModel newInstance(FinancialConnectionsSheet.Configuration configuration, SearchInstitutions searchInstitutions, FeaturedInstitutions featuredInstitutions, GetManifest getManifest, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NavigationManager navigationManager, UpdateLocalManifest updateLocalManifest, Logger logger, InstitutionPickerState institutionPickerState) {
        return new InstitutionPickerViewModel(configuration, searchInstitutions, featuredInstitutions, getManifest, financialConnectionsAnalyticsTracker, navigationManager, updateLocalManifest, logger, institutionPickerState);
    }

    @Override // p000.Y94
    public InstitutionPickerViewModel get() {
        return newInstance(this.configurationProvider.get(), this.searchInstitutionsProvider.get(), this.featuredInstitutionsProvider.get(), this.getManifestProvider.get(), this.eventTrackerProvider.get(), this.navigationManagerProvider.get(), this.updateLocalManifestProvider.get(), this.loggerProvider.get(), this.initialStateProvider.get());
    }
}
