package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
/* loaded from: classes7.dex */
public final class AddressElementViewModelModule_ProvideEventReporterFactory implements InterfaceC48812sj1<AddressLauncherEventReporter> {
    private final Y94<DefaultAddressLauncherEventReporter> defaultAddressLauncherEventReporterProvider;
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvideEventReporterFactory(AddressElementViewModelModule addressElementViewModelModule, Y94<DefaultAddressLauncherEventReporter> y94) {
        this.module = addressElementViewModelModule;
        this.defaultAddressLauncherEventReporterProvider = y94;
    }

    public static AddressElementViewModelModule_ProvideEventReporterFactory create(AddressElementViewModelModule addressElementViewModelModule, Y94<DefaultAddressLauncherEventReporter> y94) {
        return new AddressElementViewModelModule_ProvideEventReporterFactory(addressElementViewModelModule, y94);
    }

    public static AddressLauncherEventReporter provideEventReporter(AddressElementViewModelModule addressElementViewModelModule, DefaultAddressLauncherEventReporter defaultAddressLauncherEventReporter) {
        return (AddressLauncherEventReporter) C51679xZ3.m5002e(addressElementViewModelModule.provideEventReporter(defaultAddressLauncherEventReporter));
    }

    @Override // p000.Y94
    public AddressLauncherEventReporter get() {
        return provideEventReporter(this.module, this.defaultAddressLauncherEventReporterProvider.get());
    }
}
