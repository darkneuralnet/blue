package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory implements InterfaceC48812sj1<Function1<GooglePayEnvironment, GooglePayRepository>> {
    private final Y94<Context> appContextProvider;
    private final Y94<Logger> loggerProvider;
    private final GooglePayLauncherModule module;

    public GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(GooglePayLauncherModule googlePayLauncherModule, Y94<Context> y94, Y94<Logger> y942) {
        this.module = googlePayLauncherModule;
        this.appContextProvider = y94;
        this.loggerProvider = y942;
    }

    public static GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory create(GooglePayLauncherModule googlePayLauncherModule, Y94<Context> y94, Y94<Logger> y942) {
        return new GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(googlePayLauncherModule, y94, y942);
    }

    public static Function1<GooglePayEnvironment, GooglePayRepository> provideGooglePayRepositoryFactory(GooglePayLauncherModule googlePayLauncherModule, Context context, Logger logger) {
        return (Function1) C51679xZ3.m5002e(googlePayLauncherModule.provideGooglePayRepositoryFactory(context, logger));
    }

    @Override // p000.Y94
    public Function1<GooglePayEnvironment, GooglePayRepository> get() {
        return provideGooglePayRepositoryFactory(this.module, this.appContextProvider.get(), this.loggerProvider.get());
    }
}
