package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidesEnableLoggingFactory */
/* loaded from: classes7.dex */
public final class PollingViewModelModule_Companion_ProvidesEnableLoggingFactory implements InterfaceC48812sj1<Boolean> {

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidesEnableLoggingFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final PollingViewModelModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new PollingViewModelModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }

    public static PollingViewModelModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return PollingViewModelModule.Companion.providesEnableLogging();
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }
}
