package com.stripe.android.paymentsheet.injection;
/* loaded from: classes7.dex */
public final class PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory implements InterfaceC48812sj1<String> {
    private final PaymentOptionsViewModelModule module;

    public PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        this.module = paymentOptionsViewModelModule;
    }

    public static PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory create(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return new PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory(paymentOptionsViewModelModule);
    }

    public static String provideDummyInjectorKey(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return (String) C51679xZ3.m5002e(paymentOptionsViewModelModule.provideDummyInjectorKey());
    }

    @Override // p000.Y94
    public String get() {
        return provideDummyInjectorKey(this.module);
    }
}
