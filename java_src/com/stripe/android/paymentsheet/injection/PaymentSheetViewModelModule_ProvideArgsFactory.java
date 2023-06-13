package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.PaymentSheetContractV2;
/* loaded from: classes7.dex */
public final class PaymentSheetViewModelModule_ProvideArgsFactory implements InterfaceC48812sj1<PaymentSheetContractV2.Args> {
    private final PaymentSheetViewModelModule module;

    public PaymentSheetViewModelModule_ProvideArgsFactory(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        this.module = paymentSheetViewModelModule;
    }

    public static PaymentSheetViewModelModule_ProvideArgsFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return new PaymentSheetViewModelModule_ProvideArgsFactory(paymentSheetViewModelModule);
    }

    public static PaymentSheetContractV2.Args provideArgs(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return (PaymentSheetContractV2.Args) C51679xZ3.m5002e(paymentSheetViewModelModule.provideArgs());
    }

    @Override // p000.Y94
    public PaymentSheetContractV2.Args get() {
        return provideArgs(this.module);
    }
}
