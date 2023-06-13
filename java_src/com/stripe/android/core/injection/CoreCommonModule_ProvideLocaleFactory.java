package com.stripe.android.core.injection;

import java.util.Locale;
/* loaded from: classes6.dex */
public final class CoreCommonModule_ProvideLocaleFactory implements InterfaceC48812sj1<Locale> {
    private final CoreCommonModule module;

    public CoreCommonModule_ProvideLocaleFactory(CoreCommonModule coreCommonModule) {
        this.module = coreCommonModule;
    }

    public static CoreCommonModule_ProvideLocaleFactory create(CoreCommonModule coreCommonModule) {
        return new CoreCommonModule_ProvideLocaleFactory(coreCommonModule);
    }

    public static Locale provideLocale(CoreCommonModule coreCommonModule) {
        return coreCommonModule.provideLocale();
    }

    @Override // p000.Y94
    public Locale get() {
        return provideLocale(this.module);
    }
}
