package com.stripe.android.payments.core.injection;

import android.content.Context;
/* loaded from: classes7.dex */
public final class PaymentLauncherModule_ProvideIsInstantAppFactory implements InterfaceC48812sj1<Boolean> {
    private final Y94<Context> contextProvider;
    private final PaymentLauncherModule module;

    public PaymentLauncherModule_ProvideIsInstantAppFactory(PaymentLauncherModule paymentLauncherModule, Y94<Context> y94) {
        this.module = paymentLauncherModule;
        this.contextProvider = y94;
    }

    public static PaymentLauncherModule_ProvideIsInstantAppFactory create(PaymentLauncherModule paymentLauncherModule, Y94<Context> y94) {
        return new PaymentLauncherModule_ProvideIsInstantAppFactory(paymentLauncherModule, y94);
    }

    public static boolean provideIsInstantApp(PaymentLauncherModule paymentLauncherModule, Context context) {
        return paymentLauncherModule.provideIsInstantApp(context);
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(provideIsInstantApp(this.module, this.contextProvider.get()));
    }
}
