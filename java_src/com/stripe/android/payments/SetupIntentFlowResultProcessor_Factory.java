package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class SetupIntentFlowResultProcessor_Factory implements InterfaceC48812sj1<SetupIntentFlowResultProcessor> {
    private final Y94<Context> contextProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public SetupIntentFlowResultProcessor_Factory(Y94<Context> y94, Y94<Function0<String>> y942, Y94<StripeRepository> y943, Y94<Logger> y944, Y94<CoroutineContext> y945) {
        this.contextProvider = y94;
        this.publishableKeyProvider = y942;
        this.stripeRepositoryProvider = y943;
        this.loggerProvider = y944;
        this.workContextProvider = y945;
    }

    public static SetupIntentFlowResultProcessor_Factory create(Y94<Context> y94, Y94<Function0<String>> y942, Y94<StripeRepository> y943, Y94<Logger> y944, Y94<CoroutineContext> y945) {
        return new SetupIntentFlowResultProcessor_Factory(y94, y942, y943, y944, y945);
    }

    public static SetupIntentFlowResultProcessor newInstance(Context context, Function0<String> function0, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext) {
        return new SetupIntentFlowResultProcessor(context, function0, stripeRepository, logger, coroutineContext);
    }

    @Override // p000.Y94
    public SetupIntentFlowResultProcessor get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.stripeRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get());
    }
}
