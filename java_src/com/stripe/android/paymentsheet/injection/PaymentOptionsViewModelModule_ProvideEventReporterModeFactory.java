package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
/* loaded from: classes7.dex */
public final class PaymentOptionsViewModelModule_ProvideEventReporterModeFactory implements InterfaceC48812sj1<EventReporter.Mode> {
    private final PaymentOptionsViewModelModule module;

    public PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        this.module = paymentOptionsViewModelModule;
    }

    public static PaymentOptionsViewModelModule_ProvideEventReporterModeFactory create(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return new PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(paymentOptionsViewModelModule);
    }

    public static EventReporter.Mode provideEventReporterMode(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return (EventReporter.Mode) C51679xZ3.m5002e(paymentOptionsViewModelModule.provideEventReporterMode());
    }

    @Override // p000.Y94
    public EventReporter.Mode get() {
        return provideEventReporterMode(this.module);
    }
}
