package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory implements InterfaceC48812sj1<Function0<String>> {
    private final Y94<PaymentConfiguration> paymentConfigurationProvider;

    public PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(Y94<PaymentConfiguration> y94) {
        this.paymentConfigurationProvider = y94;
    }

    public static PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory create(Y94<PaymentConfiguration> y94) {
        return new PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(y94);
    }

    public static Function0<String> providePublishableKey(Y94<PaymentConfiguration> y94) {
        return (Function0) C51679xZ3.m5002e(PaymentSheetCommonModule.Companion.providePublishableKey(y94));
    }

    @Override // p000.Y94
    public Function0<String> get() {
        return providePublishableKey(this.paymentConfigurationProvider);
    }
}
