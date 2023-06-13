package com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di;

import java.util.Set;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidesProductUsageFactory */
/* loaded from: classes7.dex */
public final class PollingViewModelModule_Companion_ProvidesProductUsageFactory implements InterfaceC48812sj1<Set<String>> {

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.di.PollingViewModelModule_Companion_ProvidesProductUsageFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final PollingViewModelModule_Companion_ProvidesProductUsageFactory INSTANCE = new PollingViewModelModule_Companion_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }

    public static PollingViewModelModule_Companion_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) C51679xZ3.m5002e(PollingViewModelModule.Companion.providesProductUsage());
    }

    @Override // p000.Y94
    public Set<String> get() {
        return providesProductUsage();
    }
}
