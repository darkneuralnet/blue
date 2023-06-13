package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory */
/* loaded from: classes7.dex */
public final class C19290xfafb9b5e implements InterfaceC48812sj1<PaymentConfiguration> {
    private final Y94<Context> appContextProvider;

    public C19290xfafb9b5e(Y94<Context> y94) {
        this.appContextProvider = y94;
    }

    public static C19290xfafb9b5e create(Y94<Context> y94) {
        return new C19290xfafb9b5e(y94);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) C51679xZ3.m5002e(PollingViewModelModule.Companion.providePaymentConfiguration(context));
    }

    @Override // p000.Y94
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }
}
