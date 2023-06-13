package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
/* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory */
/* loaded from: classes7.dex */
public final class C19228xcc094b3b implements InterfaceC48812sj1<PaymentConfiguration> {
    private final Y94<Context> appContextProvider;

    public C19228xcc094b3b(Y94<Context> y94) {
        this.appContextProvider = y94;
    }

    public static C19228xcc094b3b create(Y94<Context> y94) {
        return new C19228xcc094b3b(y94);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) C51679xZ3.m5002e(PaymentSheetCommonModule.Companion.providePaymentConfiguration(context));
    }

    @Override // p000.Y94
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }
}
