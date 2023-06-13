package zendesk.support;

import java.util.Locale;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideDeviceLocaleFactory implements InterfaceC48812sj1<Locale> {
    private final GuideProviderModule module;

    public GuideProviderModule_ProvideDeviceLocaleFactory(GuideProviderModule guideProviderModule) {
        this.module = guideProviderModule;
    }

    public static GuideProviderModule_ProvideDeviceLocaleFactory create(GuideProviderModule guideProviderModule) {
        return new GuideProviderModule_ProvideDeviceLocaleFactory(guideProviderModule);
    }

    public static Locale provideDeviceLocale(GuideProviderModule guideProviderModule) {
        return (Locale) C51679xZ3.m5002e(guideProviderModule.provideDeviceLocale());
    }

    @Override // p000.Y94
    public Locale get() {
        return provideDeviceLocale(this.module);
    }
}
