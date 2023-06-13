package com.stripe.android.googlepaylauncher.injection;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherFactory_Impl implements GooglePayPaymentMethodLauncherFactory {
    private final GooglePayPaymentMethodLauncher_Factory delegateFactory;

    public GooglePayPaymentMethodLauncherFactory_Impl(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        this.delegateFactory = googlePayPaymentMethodLauncher_Factory;
    }

    @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory
    public GooglePayPaymentMethodLauncher create(ZC0 zc0, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> abstractC0407B5, boolean z) {
        return this.delegateFactory.get(zc0, config, readyCallback, abstractC0407B5, z);
    }

    public static Y94<GooglePayPaymentMethodLauncherFactory> create(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        return C39546d52.m44621a(new GooglePayPaymentMethodLauncherFactory_Impl(googlePayPaymentMethodLauncher_Factory));
    }
}
