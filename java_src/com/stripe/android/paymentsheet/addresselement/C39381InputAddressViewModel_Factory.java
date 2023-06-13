package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
/* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39381InputAddressViewModel_Factory implements InterfaceC48812sj1<InputAddressViewModel> {
    private final Y94<AddressElementActivityContract.Args> argsProvider;
    private final Y94<AddressLauncherEventReporter> eventReporterProvider;
    private final Y94<FormControllerSubcomponent.Builder> formControllerProvider;
    private final Y94<AddressElementNavigator> navigatorProvider;

    public C39381InputAddressViewModel_Factory(Y94<AddressElementActivityContract.Args> y94, Y94<AddressElementNavigator> y942, Y94<AddressLauncherEventReporter> y943, Y94<FormControllerSubcomponent.Builder> y944) {
        this.argsProvider = y94;
        this.navigatorProvider = y942;
        this.eventReporterProvider = y943;
        this.formControllerProvider = y944;
    }

    public static C39381InputAddressViewModel_Factory create(Y94<AddressElementActivityContract.Args> y94, Y94<AddressElementNavigator> y942, Y94<AddressLauncherEventReporter> y943, Y94<FormControllerSubcomponent.Builder> y944) {
        return new C39381InputAddressViewModel_Factory(y94, y942, y943, y944);
    }

    public static InputAddressViewModel newInstance(AddressElementActivityContract.Args args, AddressElementNavigator addressElementNavigator, AddressLauncherEventReporter addressLauncherEventReporter, Y94<FormControllerSubcomponent.Builder> y94) {
        return new InputAddressViewModel(args, addressElementNavigator, addressLauncherEventReporter, y94);
    }

    @Override // p000.Y94
    public InputAddressViewModel get() {
        return newInstance(this.argsProvider.get(), this.navigatorProvider.get(), this.eventReporterProvider.get(), this.formControllerProvider);
    }
}
