package com.stripe.android.link.repositories;

import com.stripe.android.networking.StripeRepository;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* loaded from: classes7.dex */
public final class LinkApiRepository_Factory implements InterfaceC48812sj1<LinkApiRepository> {
    private final Y94<ConsumersApiService> consumersApiServiceProvider;
    private final Y94<Locale> localeProvider;
    private final Y94<Function0<String>> publishableKeyProvider;
    private final Y94<Function0<String>> stripeAccountIdProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public LinkApiRepository_Factory(Y94<Function0<String>> y94, Y94<Function0<String>> y942, Y94<StripeRepository> y943, Y94<ConsumersApiService> y944, Y94<CoroutineContext> y945, Y94<Locale> y946) {
        this.publishableKeyProvider = y94;
        this.stripeAccountIdProvider = y942;
        this.stripeRepositoryProvider = y943;
        this.consumersApiServiceProvider = y944;
        this.workContextProvider = y945;
        this.localeProvider = y946;
    }

    public static LinkApiRepository_Factory create(Y94<Function0<String>> y94, Y94<Function0<String>> y942, Y94<StripeRepository> y943, Y94<ConsumersApiService> y944, Y94<CoroutineContext> y945, Y94<Locale> y946) {
        return new LinkApiRepository_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static LinkApiRepository newInstance(Function0<String> function0, Function0<String> function02, StripeRepository stripeRepository, ConsumersApiService consumersApiService, CoroutineContext coroutineContext, Locale locale) {
        return new LinkApiRepository(function0, function02, stripeRepository, consumersApiService, coroutineContext, locale);
    }

    @Override // p000.Y94
    public LinkApiRepository get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.stripeRepositoryProvider.get(), this.consumersApiServiceProvider.get(), this.workContextProvider.get(), this.localeProvider.get());
    }
}
