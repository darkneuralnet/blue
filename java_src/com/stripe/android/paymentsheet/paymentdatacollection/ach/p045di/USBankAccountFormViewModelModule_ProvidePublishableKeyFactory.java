package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

import android.content.Context;
import kotlin.jvm.functions.Function0;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule_ProvidePublishableKeyFactory */
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModelModule_ProvidePublishableKeyFactory implements InterfaceC48812sj1<Function0<String>> {
    private final Y94<Context> appContextProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Y94<Context> y94) {
        this.module = uSBankAccountFormViewModelModule;
        this.appContextProvider = y94;
    }

    public static USBankAccountFormViewModelModule_ProvidePublishableKeyFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Y94<Context> y94) {
        return new USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(uSBankAccountFormViewModelModule, y94);
    }

    public static Function0<String> providePublishableKey(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Context context) {
        return (Function0) C51679xZ3.m5002e(uSBankAccountFormViewModelModule.providePublishableKey(context));
    }

    @Override // p000.Y94
    public Function0<String> get() {
        return providePublishableKey(this.module, this.appContextProvider.get());
    }
}
