package com.stripe.android.paymentsheet.injection;

import android.content.Context;
/* loaded from: classes7.dex */
public final class PaymentSheetCommonModule_Companion_ProvideAppNameFactory implements InterfaceC48812sj1<String> {
    private final Y94<Context> appContextProvider;

    public PaymentSheetCommonModule_Companion_ProvideAppNameFactory(Y94<Context> y94) {
        this.appContextProvider = y94;
    }

    public static PaymentSheetCommonModule_Companion_ProvideAppNameFactory create(Y94<Context> y94) {
        return new PaymentSheetCommonModule_Companion_ProvideAppNameFactory(y94);
    }

    public static String provideAppName(Context context) {
        return (String) C51679xZ3.m5002e(PaymentSheetCommonModule.Companion.provideAppName(context));
    }

    @Override // p000.Y94
    public String get() {
        return provideAppName(this.appContextProvider.get());
    }
}
