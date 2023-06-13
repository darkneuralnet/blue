package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

import java.util.Set;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule_ProvidesProductUsageFactory */
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModelModule_ProvidesProductUsageFactory implements InterfaceC48812sj1<Set<String>> {
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesProductUsageFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        this.module = uSBankAccountFormViewModelModule;
    }

    public static USBankAccountFormViewModelModule_ProvidesProductUsageFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return new USBankAccountFormViewModelModule_ProvidesProductUsageFactory(uSBankAccountFormViewModelModule);
    }

    public static Set<String> providesProductUsage(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return (Set) C51679xZ3.m5002e(uSBankAccountFormViewModelModule.providesProductUsage());
    }

    @Override // p000.Y94
    public Set<String> get() {
        return providesProductUsage(this.module);
    }
}
