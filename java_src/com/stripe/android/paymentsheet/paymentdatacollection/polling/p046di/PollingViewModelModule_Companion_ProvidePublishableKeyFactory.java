package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;

import android.content.Context;
import kotlin.jvm.functions.Function0;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidePublishableKeyFactory */
/* loaded from: classes7.dex */
public final class PollingViewModelModule_Companion_ProvidePublishableKeyFactory implements InterfaceC48812sj1<Function0<String>> {
    private final Y94<Context> appContextProvider;

    public PollingViewModelModule_Companion_ProvidePublishableKeyFactory(Y94<Context> y94) {
        this.appContextProvider = y94;
    }

    public static PollingViewModelModule_Companion_ProvidePublishableKeyFactory create(Y94<Context> y94) {
        return new PollingViewModelModule_Companion_ProvidePublishableKeyFactory(y94);
    }

    public static Function0<String> providePublishableKey(Context context) {
        return (Function0) C51679xZ3.m5002e(PollingViewModelModule.Companion.providePublishableKey(context));
    }

    @Override // p000.Y94
    public Function0<String> get() {
        return providePublishableKey(this.appContextProvider.get());
    }
}
