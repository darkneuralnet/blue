package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;
/* loaded from: classes6.dex */
public final class CoreCommonModule_ProvideLoggerFactory implements InterfaceC48812sj1<Logger> {
    private final Y94<Boolean> enableLoggingProvider;
    private final CoreCommonModule module;

    public CoreCommonModule_ProvideLoggerFactory(CoreCommonModule coreCommonModule, Y94<Boolean> y94) {
        this.module = coreCommonModule;
        this.enableLoggingProvider = y94;
    }

    public static CoreCommonModule_ProvideLoggerFactory create(CoreCommonModule coreCommonModule, Y94<Boolean> y94) {
        return new CoreCommonModule_ProvideLoggerFactory(coreCommonModule, y94);
    }

    public static Logger provideLogger(CoreCommonModule coreCommonModule, boolean z) {
        return (Logger) C51679xZ3.m5002e(coreCommonModule.provideLogger(z));
    }

    @Override // p000.Y94
    public Logger get() {
        return provideLogger(this.module, this.enableLoggingProvider.get().booleanValue());
    }
}
