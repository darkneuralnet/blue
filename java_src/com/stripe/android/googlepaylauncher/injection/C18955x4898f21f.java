package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
/* renamed from: com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory */
/* loaded from: classes7.dex */
public final class C18955x4898f21f implements InterfaceC48812sj1<EP3> {
    private final Y94<Context> contextProvider;
    private final Y94<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Y94<PaymentsClientFactory> paymentsClientFactoryProvider;

    public C18955x4898f21f(Y94<Context> y94, Y94<GooglePayPaymentMethodLauncher.Config> y942, Y94<PaymentsClientFactory> y943) {
        this.contextProvider = y94;
        this.googlePayConfigProvider = y942;
        this.paymentsClientFactoryProvider = y943;
    }

    public static C18955x4898f21f create(Y94<Context> y94, Y94<GooglePayPaymentMethodLauncher.Config> y942, Y94<PaymentsClientFactory> y943) {
        return new C18955x4898f21f(y94, y942, y943);
    }

    public static EP3 providePaymentsClient(Context context, GooglePayPaymentMethodLauncher.Config config, PaymentsClientFactory paymentsClientFactory) {
        return (EP3) C51679xZ3.m5002e(GooglePayPaymentMethodLauncherModule.Companion.providePaymentsClient(context, config, paymentsClientFactory));
    }

    @Override // p000.Y94
    public EP3 get() {
        return providePaymentsClient(this.contextProvider.get(), this.googlePayConfigProvider.get(), this.paymentsClientFactoryProvider.get());
    }
}
