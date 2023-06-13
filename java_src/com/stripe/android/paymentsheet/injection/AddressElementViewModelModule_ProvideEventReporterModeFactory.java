package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
/* loaded from: classes7.dex */
public final class AddressElementViewModelModule_ProvideEventReporterModeFactory implements InterfaceC48812sj1<EventReporter.Mode> {
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvideEventReporterModeFactory(AddressElementViewModelModule addressElementViewModelModule) {
        this.module = addressElementViewModelModule;
    }

    public static AddressElementViewModelModule_ProvideEventReporterModeFactory create(AddressElementViewModelModule addressElementViewModelModule) {
        return new AddressElementViewModelModule_ProvideEventReporterModeFactory(addressElementViewModelModule);
    }

    public static EventReporter.Mode provideEventReporterMode(AddressElementViewModelModule addressElementViewModelModule) {
        return (EventReporter.Mode) C51679xZ3.m5002e(addressElementViewModelModule.provideEventReporterMode());
    }

    @Override // p000.Y94
    public EventReporter.Mode get() {
        return provideEventReporterMode(this.module);
    }
}
