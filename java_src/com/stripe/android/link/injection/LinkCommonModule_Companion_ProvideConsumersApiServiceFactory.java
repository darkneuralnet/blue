package com.stripe.android.link.injection;

import com.stripe.android.core.Logger;
import com.stripe.android.repository.ConsumersApiService;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class LinkCommonModule_Companion_ProvideConsumersApiServiceFactory implements InterfaceC48812sj1<ConsumersApiService> {
    private final Y94<Logger> loggerProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public LinkCommonModule_Companion_ProvideConsumersApiServiceFactory(Y94<Logger> y94, Y94<CoroutineContext> y942) {
        this.loggerProvider = y94;
        this.workContextProvider = y942;
    }

    public static LinkCommonModule_Companion_ProvideConsumersApiServiceFactory create(Y94<Logger> y94, Y94<CoroutineContext> y942) {
        return new LinkCommonModule_Companion_ProvideConsumersApiServiceFactory(y94, y942);
    }

    public static ConsumersApiService provideConsumersApiService(Logger logger, CoroutineContext coroutineContext) {
        return (ConsumersApiService) C51679xZ3.m5002e(LinkCommonModule.Companion.provideConsumersApiService(logger, coroutineContext));
    }

    @Override // p000.Y94
    public ConsumersApiService get() {
        return provideConsumersApiService(this.loggerProvider.get(), this.workContextProvider.get());
    }
}
