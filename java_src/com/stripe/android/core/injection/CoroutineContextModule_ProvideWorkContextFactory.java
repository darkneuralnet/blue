package com.stripe.android.core.injection;

import kotlin.coroutines.CoroutineContext;
/* loaded from: classes6.dex */
public final class CoroutineContextModule_ProvideWorkContextFactory implements InterfaceC48812sj1<CoroutineContext> {
    private final CoroutineContextModule module;

    public CoroutineContextModule_ProvideWorkContextFactory(CoroutineContextModule coroutineContextModule) {
        this.module = coroutineContextModule;
    }

    public static CoroutineContextModule_ProvideWorkContextFactory create(CoroutineContextModule coroutineContextModule) {
        return new CoroutineContextModule_ProvideWorkContextFactory(coroutineContextModule);
    }

    public static CoroutineContext provideWorkContext(CoroutineContextModule coroutineContextModule) {
        return (CoroutineContext) C51679xZ3.m5002e(coroutineContextModule.provideWorkContext());
    }

    @Override // p000.Y94
    public CoroutineContext get() {
        return provideWorkContext(this.module);
    }
}
