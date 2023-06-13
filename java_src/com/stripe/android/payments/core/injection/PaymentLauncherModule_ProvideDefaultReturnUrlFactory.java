package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
/* loaded from: classes7.dex */
public final class PaymentLauncherModule_ProvideDefaultReturnUrlFactory implements InterfaceC48812sj1<DefaultReturnUrl> {
    private final Y94<Context> contextProvider;
    private final PaymentLauncherModule module;

    public PaymentLauncherModule_ProvideDefaultReturnUrlFactory(PaymentLauncherModule paymentLauncherModule, Y94<Context> y94) {
        this.module = paymentLauncherModule;
        this.contextProvider = y94;
    }

    public static PaymentLauncherModule_ProvideDefaultReturnUrlFactory create(PaymentLauncherModule paymentLauncherModule, Y94<Context> y94) {
        return new PaymentLauncherModule_ProvideDefaultReturnUrlFactory(paymentLauncherModule, y94);
    }

    public static DefaultReturnUrl provideDefaultReturnUrl(PaymentLauncherModule paymentLauncherModule, Context context) {
        return (DefaultReturnUrl) C51679xZ3.m5002e(paymentLauncherModule.provideDefaultReturnUrl(context));
    }

    @Override // p000.Y94
    public DefaultReturnUrl get() {
        return provideDefaultReturnUrl(this.module, this.contextProvider.get());
    }
}
