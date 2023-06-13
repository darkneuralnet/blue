package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
/* loaded from: classes7.dex */
public final class DefaultGooglePayRepository_Factory implements InterfaceC48812sj1<DefaultGooglePayRepository> {
    private final Y94<Context> contextProvider;
    private final Y94<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Y94<Logger> loggerProvider;

    public DefaultGooglePayRepository_Factory(Y94<Context> y94, Y94<GooglePayPaymentMethodLauncher.Config> y942, Y94<Logger> y943) {
        this.contextProvider = y94;
        this.googlePayConfigProvider = y942;
        this.loggerProvider = y943;
    }

    public static DefaultGooglePayRepository_Factory create(Y94<Context> y94, Y94<GooglePayPaymentMethodLauncher.Config> y942, Y94<Logger> y943) {
        return new DefaultGooglePayRepository_Factory(y94, y942, y943);
    }

    public static DefaultGooglePayRepository newInstance(Context context, GooglePayPaymentMethodLauncher.Config config, Logger logger) {
        return new DefaultGooglePayRepository(context, config, logger);
    }

    @Override // p000.Y94
    public DefaultGooglePayRepository get() {
        return newInstance(this.contextProvider.get(), this.googlePayConfigProvider.get(), this.loggerProvider.get());
    }
}
