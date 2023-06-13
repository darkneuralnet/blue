package com.stripe.android.core.injection;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/core/injection/CoroutineContextModule;", "", "()V", "provideUIContext", "Lkotlin/coroutines/CoroutineContext;", "provideWorkContext", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes6.dex */
public final class CoroutineContextModule {
    @UIContext
    @Provides
    public final CoroutineContext provideUIContext() {
        return T41.m84376c();
    }

    @Provides
    @IOContext
    public final CoroutineContext provideWorkContext() {
        return T41.m84377b();
    }
}
