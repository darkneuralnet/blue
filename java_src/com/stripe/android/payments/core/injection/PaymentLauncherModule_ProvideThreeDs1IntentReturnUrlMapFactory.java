package com.stripe.android.payments.core.injection;

import java.util.Map;
/* loaded from: classes7.dex */
public final class PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory implements InterfaceC48812sj1<Map<String, String>> {
    private final PaymentLauncherModule module;

    public PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory(PaymentLauncherModule paymentLauncherModule) {
        this.module = paymentLauncherModule;
    }

    public static PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory create(PaymentLauncherModule paymentLauncherModule) {
        return new PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory(paymentLauncherModule);
    }

    public static Map<String, String> provideThreeDs1IntentReturnUrlMap(PaymentLauncherModule paymentLauncherModule) {
        return (Map) C51679xZ3.m5002e(paymentLauncherModule.provideThreeDs1IntentReturnUrlMap());
    }

    @Override // p000.Y94
    public Map<String, String> get() {
        return provideThreeDs1IntentReturnUrlMap(this.module);
    }
}
