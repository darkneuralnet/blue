package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class StripePaymentLauncherAssistedFactory_Impl implements StripePaymentLauncherAssistedFactory {
    private final StripePaymentLauncher_Factory delegateFactory;

    public StripePaymentLauncherAssistedFactory_Impl(StripePaymentLauncher_Factory stripePaymentLauncher_Factory) {
        this.delegateFactory = stripePaymentLauncher_Factory;
    }

    @Override // com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory
    public StripePaymentLauncher create(Function0<String> function0, Function0<String> function02, AbstractC0407B5<PaymentLauncherContract.Args> abstractC0407B5) {
        return this.delegateFactory.get(function0, function02, abstractC0407B5);
    }

    public static Y94<StripePaymentLauncherAssistedFactory> create(StripePaymentLauncher_Factory stripePaymentLauncher_Factory) {
        return C39546d52.m44621a(new StripePaymentLauncherAssistedFactory_Impl(stripePaymentLauncher_Factory));
    }
}
