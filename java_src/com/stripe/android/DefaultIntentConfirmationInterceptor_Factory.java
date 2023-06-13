package com.stripe.android;

import android.content.Context;
import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.functions.Function0;
/* loaded from: classes6.dex */
public final class DefaultIntentConfirmationInterceptor_Factory implements InterfaceC48812sj1<DefaultIntentConfirmationInterceptor> {
    private final Y94<Context> contextProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public DefaultIntentConfirmationInterceptor_Factory(Y94<Context> y94, Y94<StripeRepository> y942, Y94<Function0<String>> y943, Y94<Function0<String>> y944) {
        this.contextProvider = y94;
        this.stripeRepositoryProvider = y942;
        this.publishableKeyProvider = y943;
        this.stripeAccountIdProvider = y944;
    }

    public static DefaultIntentConfirmationInterceptor_Factory create(Y94<Context> y94, Y94<StripeRepository> y942, Y94<Function0<String>> y943, Y94<Function0<String>> y944) {
        return new DefaultIntentConfirmationInterceptor_Factory(y94, y942, y943, y944);
    }

    public static DefaultIntentConfirmationInterceptor newInstance(Context context, StripeRepository stripeRepository, Function0<String> function0, Function0<String> function02) {
        return new DefaultIntentConfirmationInterceptor(context, stripeRepository, function0, function02);
    }

    @Override // p000.Y94
    public DefaultIntentConfirmationInterceptor get() {
        return newInstance(this.contextProvider.get(), this.stripeRepositoryProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }
}
