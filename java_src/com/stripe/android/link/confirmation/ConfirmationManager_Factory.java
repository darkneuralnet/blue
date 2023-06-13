package com.stripe.android.link.confirmation;

import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class ConfirmationManager_Factory implements InterfaceC48812sj1<ConfirmationManager> {
    private final Y94<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;

    public ConfirmationManager_Factory(Y94<StripePaymentLauncherAssistedFactory> y94, Y94<Function0<String>> y942, Y94<Function0<String>> y943) {
        this.paymentLauncherFactoryProvider = y94;
        this.publishableKeyProvider = y942;
        this.stripeAccountIdProvider = y943;
    }

    public static ConfirmationManager_Factory create(Y94<StripePaymentLauncherAssistedFactory> y94, Y94<Function0<String>> y942, Y94<Function0<String>> y943) {
        return new ConfirmationManager_Factory(y94, y942, y943);
    }

    public static ConfirmationManager newInstance(StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, Function0<String> function0, Function0<String> function02) {
        return new ConfirmationManager(stripePaymentLauncherAssistedFactory, function0, function02);
    }

    @Override // p000.Y94
    public ConfirmationManager get() {
        return newInstance(this.paymentLauncherFactoryProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }
}
