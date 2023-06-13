package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;

import android.app.Application;
import android.content.Context;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidesAppContextFactory */
/* loaded from: classes7.dex */
public final class PollingViewModelModule_Companion_ProvidesAppContextFactory implements InterfaceC48812sj1<Context> {
    private final Y94<Application> applicationProvider;

    public PollingViewModelModule_Companion_ProvidesAppContextFactory(Y94<Application> y94) {
        this.applicationProvider = y94;
    }

    public static PollingViewModelModule_Companion_ProvidesAppContextFactory create(Y94<Application> y94) {
        return new PollingViewModelModule_Companion_ProvidesAppContextFactory(y94);
    }

    public static Context providesAppContext(Application application) {
        return (Context) C51679xZ3.m5002e(PollingViewModelModule.Companion.providesAppContext(application));
    }

    @Override // p000.Y94
    public Context get() {
        return providesAppContext(this.applicationProvider.get());
    }
}
