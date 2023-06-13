package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory implements InterfaceC48812sj1<Function0<String>> {
    private final Y94<PaymentConfiguration> paymentConfigurationProvider;

    public PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory(Y94<PaymentConfiguration> y94) {
        this.paymentConfigurationProvider = y94;
    }

    public static PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory create(Y94<PaymentConfiguration> y94) {
        return new PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory(y94);
    }

    public static Function0<String> provideStripeAccountId(Y94<PaymentConfiguration> y94) {
        return (Function0) C51679xZ3.m5002e(PaymentSheetCommonModule.Companion.provideStripeAccountId(y94));
    }

    @Override // p000.Y94
    public Function0<String> get() {
        return provideStripeAccountId(this.paymentConfigurationProvider);
    }
}
