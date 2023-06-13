package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
/* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39380AutocompleteViewModel_Factory implements InterfaceC48812sj1<AutocompleteViewModel> {
    private final Y94<Application> applicationProvider;
    private final Y94<AddressElementActivityContract.Args> argsProvider;
    private final Y94<AutocompleteViewModel.Args> autocompleteArgsProvider;
    private final Y94<AddressLauncherEventReporter> eventReporterProvider;
    private final Y94<AddressElementNavigator> navigatorProvider;
    private final Y94<PlacesClientProxy> placesClientProvider;

    public C39380AutocompleteViewModel_Factory(Y94<AddressElementActivityContract.Args> y94, Y94<AddressElementNavigator> y942, Y94<PlacesClientProxy> y943, Y94<AutocompleteViewModel.Args> y944, Y94<AddressLauncherEventReporter> y945, Y94<Application> y946) {
        this.argsProvider = y94;
        this.navigatorProvider = y942;
        this.placesClientProvider = y943;
        this.autocompleteArgsProvider = y944;
        this.eventReporterProvider = y945;
        this.applicationProvider = y946;
    }

    public static C39380AutocompleteViewModel_Factory create(Y94<AddressElementActivityContract.Args> y94, Y94<AddressElementNavigator> y942, Y94<PlacesClientProxy> y943, Y94<AutocompleteViewModel.Args> y944, Y94<AddressLauncherEventReporter> y945, Y94<Application> y946) {
        return new C39380AutocompleteViewModel_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static AutocompleteViewModel newInstance(AddressElementActivityContract.Args args, AddressElementNavigator addressElementNavigator, PlacesClientProxy placesClientProxy, AutocompleteViewModel.Args args2, AddressLauncherEventReporter addressLauncherEventReporter, Application application) {
        return new AutocompleteViewModel(args, addressElementNavigator, placesClientProxy, args2, addressLauncherEventReporter, application);
    }

    @Override // p000.Y94
    public AutocompleteViewModel get() {
        return newInstance(this.argsProvider.get(), this.navigatorProvider.get(), this.placesClientProvider.get(), this.autocompleteArgsProvider.get(), this.eventReporterProvider.get(), this.applicationProvider.get());
    }
}
