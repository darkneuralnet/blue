package com.stripe.android;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.jvm.functions.Function0;
/* loaded from: classes6.dex */
public final class GooglePayJsonFactory_Factory implements InterfaceC48812sj1<GooglePayJsonFactory> {
    private final Y94<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;

    public GooglePayJsonFactory_Factory(Y94<Function0<String>> y94, Y94<Function0<String>> y942, Y94<GooglePayPaymentMethodLauncher.Config> y943) {
        this.publishableKeyProvider = y94;
        this.stripeAccountIdProvider = y942;
        this.googlePayConfigProvider = y943;
    }

    public static GooglePayJsonFactory_Factory create(Y94<Function0<String>> y94, Y94<Function0<String>> y942, Y94<GooglePayPaymentMethodLauncher.Config> y943) {
        return new GooglePayJsonFactory_Factory(y94, y942, y943);
    }

    public static GooglePayJsonFactory newInstance(Function0<String> function0, Function0<String> function02, GooglePayPaymentMethodLauncher.Config config) {
        return new GooglePayJsonFactory(function0, function02, config);
    }

    @Override // p000.Y94
    public GooglePayJsonFactory get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.googlePayConfigProvider.get());
    }
}
