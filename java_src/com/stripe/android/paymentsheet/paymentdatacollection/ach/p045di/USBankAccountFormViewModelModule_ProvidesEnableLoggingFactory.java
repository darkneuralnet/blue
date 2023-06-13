package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory */
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory implements InterfaceC48812sj1<Boolean> {
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        this.module = uSBankAccountFormViewModelModule;
    }

    public static USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return new USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory(uSBankAccountFormViewModelModule);
    }

    public static boolean providesEnableLogging(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return uSBankAccountFormViewModelModule.providesEnableLogging();
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging(this.module));
    }
}
