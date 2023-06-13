package zendesk.support;

import java.util.Locale;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* loaded from: classes8.dex */
public final class ProviderModule_ProvideSdkSettingsProviderFactory implements InterfaceC48812sj1<SupportSettingsProvider> {
    private final Y94<ZendeskLocaleConverter> helpCenterLocaleConverterProvider;
    private final Y94<Locale> localeProvider;
    private final ProviderModule module;
    private final Y94<SettingsProvider> sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, Y94<SettingsProvider> y94, Y94<Locale> y942, Y94<ZendeskLocaleConverter> y943) {
        this.module = providerModule;
        this.sdkSettingsProvider = y94;
        this.localeProvider = y942;
        this.helpCenterLocaleConverterProvider = y943;
    }

    public static ProviderModule_ProvideSdkSettingsProviderFactory create(ProviderModule providerModule, Y94<SettingsProvider> y94, Y94<Locale> y942, Y94<ZendeskLocaleConverter> y943) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, y94, y942, y943);
    }

    public static SupportSettingsProvider provideSdkSettingsProvider(ProviderModule providerModule, SettingsProvider settingsProvider, Locale locale, ZendeskLocaleConverter zendeskLocaleConverter) {
        return (SupportSettingsProvider) C51679xZ3.m5002e(providerModule.provideSdkSettingsProvider(settingsProvider, locale, zendeskLocaleConverter));
    }

    @Override // p000.Y94
    public SupportSettingsProvider get() {
        return provideSdkSettingsProvider(this.module, this.sdkSettingsProvider.get(), this.localeProvider.get(), this.helpCenterLocaleConverterProvider.get());
    }
}
