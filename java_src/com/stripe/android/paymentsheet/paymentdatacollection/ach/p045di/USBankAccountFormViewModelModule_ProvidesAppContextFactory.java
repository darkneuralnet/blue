package com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di;

import android.app.Application;
import android.content.Context;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelModule_ProvidesAppContextFactory */
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModelModule_ProvidesAppContextFactory implements InterfaceC48812sj1<Context> {
    private final Y94<Application> applicationProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesAppContextFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Y94<Application> y94) {
        this.module = uSBankAccountFormViewModelModule;
        this.applicationProvider = y94;
    }

    public static USBankAccountFormViewModelModule_ProvidesAppContextFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Y94<Application> y94) {
        return new USBankAccountFormViewModelModule_ProvidesAppContextFactory(uSBankAccountFormViewModelModule, y94);
    }

    public static Context providesAppContext(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Application application) {
        return (Context) C51679xZ3.m5002e(uSBankAccountFormViewModelModule.providesAppContext(application));
    }

    @Override // p000.Y94
    public Context get() {
        return providesAppContext(this.module, this.applicationProvider.get());
    }
}
