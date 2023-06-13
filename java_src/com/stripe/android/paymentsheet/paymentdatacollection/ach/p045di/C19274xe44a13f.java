package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory */
/* loaded from: classes7.dex */
public final class C19274xe44a13f implements InterfaceC48812sj1<PaymentConfiguration> {
    private final Y94<Context> appContextProvider;
    private final USBankAccountFormViewModelModule module;

    public C19274xe44a13f(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Y94<Context> y94) {
        this.module = uSBankAccountFormViewModelModule;
        this.appContextProvider = y94;
    }

    public static C19274xe44a13f create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Y94<Context> y94) {
        return new C19274xe44a13f(uSBankAccountFormViewModelModule, y94);
    }

    public static PaymentConfiguration providePaymentConfiguration(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Context context) {
        return (PaymentConfiguration) C51679xZ3.m5002e(uSBankAccountFormViewModelModule.providePaymentConfiguration(context));
    }

    @Override // p000.Y94
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.module, this.appContextProvider.get());
    }
}
