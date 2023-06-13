package zendesk.support;

import java.util.Locale;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideSettingsProviderFactory implements InterfaceC48812sj1<HelpCenterSettingsProvider> {
    private final Y94<ZendeskLocaleConverter> localeConverterProvider;
    private final Y94<Locale> localeProvider;
    private final GuideProviderModule module;
    private final Y94<SettingsProvider> sdkSettingsProvider;

    public GuideProviderModule_ProvideSettingsProviderFactory(GuideProviderModule guideProviderModule, Y94<SettingsProvider> y94, Y94<ZendeskLocaleConverter> y942, Y94<Locale> y943) {
        this.module = guideProviderModule;
        this.sdkSettingsProvider = y94;
        this.localeConverterProvider = y942;
        this.localeProvider = y943;
    }

    public static GuideProviderModule_ProvideSettingsProviderFactory create(GuideProviderModule guideProviderModule, Y94<SettingsProvider> y94, Y94<ZendeskLocaleConverter> y942, Y94<Locale> y943) {
        return new GuideProviderModule_ProvideSettingsProviderFactory(guideProviderModule, y94, y942, y943);
    }

    public static HelpCenterSettingsProvider provideSettingsProvider(GuideProviderModule guideProviderModule, SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        return (HelpCenterSettingsProvider) C51679xZ3.m5002e(guideProviderModule.provideSettingsProvider(settingsProvider, zendeskLocaleConverter, locale));
    }

    @Override // p000.Y94
    public HelpCenterSettingsProvider get() {
        return provideSettingsProvider(this.module, this.sdkSettingsProvider.get(), this.localeConverterProvider.get(), this.localeProvider.get());
    }
}
