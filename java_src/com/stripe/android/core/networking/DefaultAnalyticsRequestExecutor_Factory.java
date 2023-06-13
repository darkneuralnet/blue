package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes6.dex */
public final class DefaultAnalyticsRequestExecutor_Factory implements InterfaceC48812sj1<DefaultAnalyticsRequestExecutor> {
    private final Y94<Logger> loggerProvider;
    private final Y94<CoroutineContext> workContextProvider;

    public DefaultAnalyticsRequestExecutor_Factory(Y94<Logger> y94, Y94<CoroutineContext> y942) {
        this.loggerProvider = y94;
        this.workContextProvider = y942;
    }

    public static DefaultAnalyticsRequestExecutor_Factory create(Y94<Logger> y94, Y94<CoroutineContext> y942) {
        return new DefaultAnalyticsRequestExecutor_Factory(y94, y942);
    }

    public static DefaultAnalyticsRequestExecutor newInstance(Logger logger, CoroutineContext coroutineContext) {
        return new DefaultAnalyticsRequestExecutor(logger, coroutineContext);
    }

    @Override // p000.Y94
    public DefaultAnalyticsRequestExecutor get() {
        return newInstance(this.loggerProvider.get(), this.workContextProvider.get());
    }
}
