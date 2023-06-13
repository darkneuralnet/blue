package com.stripe.android.payments.bankaccount.p043di;

import android.app.Application;
import android.content.Context;
/* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule_ProvidesAppContextFactory */
/* loaded from: classes7.dex */
public final class CollectBankAccountModule_ProvidesAppContextFactory implements InterfaceC48812sj1<Context> {
    private final Y94<Application> applicationProvider;

    public CollectBankAccountModule_ProvidesAppContextFactory(Y94<Application> y94) {
        this.applicationProvider = y94;
    }

    public static CollectBankAccountModule_ProvidesAppContextFactory create(Y94<Application> y94) {
        return new CollectBankAccountModule_ProvidesAppContextFactory(y94);
    }

    public static Context providesAppContext(Application application) {
        return (Context) C51679xZ3.m5002e(CollectBankAccountModule.INSTANCE.providesAppContext(application));
    }

    @Override // p000.Y94
    public Context get() {
        return providesAppContext(this.applicationProvider.get());
    }
}
