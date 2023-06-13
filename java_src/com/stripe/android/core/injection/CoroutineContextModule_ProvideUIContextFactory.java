package com.stripe.android.core.injection;

import kotlin.coroutines.CoroutineContext;
/* loaded from: classes6.dex */
public final class CoroutineContextModule_ProvideUIContextFactory implements InterfaceC48812sj1<CoroutineContext> {
    private final CoroutineContextModule module;

    public CoroutineContextModule_ProvideUIContextFactory(CoroutineContextModule coroutineContextModule) {
        this.module = coroutineContextModule;
    }

    public static CoroutineContextModule_ProvideUIContextFactory create(CoroutineContextModule coroutineContextModule) {
        return new CoroutineContextModule_ProvideUIContextFactory(coroutineContextModule);
    }

    public static CoroutineContext provideUIContext(CoroutineContextModule coroutineContextModule) {
        return (CoroutineContext) C51679xZ3.m5002e(coroutineContextModule.provideUIContext());
    }

    @Override // p000.Y94
    public CoroutineContext get() {
        return provideUIContext(this.module);
    }
}
