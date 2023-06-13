package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements InterfaceC48812sj1<ZendeskSettingsProvider> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<ApplicationConfiguration> configurationProvider;
    private final Y94<Context> contextProvider;
    private final Y94<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Y94<SdkSettingsService> sdkSettingsServiceProvider;
    private final Y94<Serializer> serializerProvider;
    private final Y94<SettingsStorage> settingsStorageProvider;
    private final Y94<ZendeskLocaleConverter> zendeskLocaleConverterProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(Y94<SdkSettingsService> y94, Y94<SettingsStorage> y942, Y94<CoreSettingsStorage> y943, Y94<ActionHandlerRegistry> y944, Y94<Serializer> y945, Y94<ZendeskLocaleConverter> y946, Y94<ApplicationConfiguration> y947, Y94<Context> y948) {
        this.sdkSettingsServiceProvider = y94;
        this.settingsStorageProvider = y942;
        this.coreSettingsStorageProvider = y943;
        this.actionHandlerRegistryProvider = y944;
        this.serializerProvider = y945;
        this.zendeskLocaleConverterProvider = y946;
        this.configurationProvider = y947;
        this.contextProvider = y948;
    }

    public static ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory create(Y94<SdkSettingsService> y94, Y94<SettingsStorage> y942, Y94<CoreSettingsStorage> y943, Y94<ActionHandlerRegistry> y944, Y94<Serializer> y945, Y94<ZendeskLocaleConverter> y946, Y94<ApplicationConfiguration> y947, Y94<Context> y948) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(Object obj, Object obj2, Object obj3, ActionHandlerRegistry actionHandlerRegistry, Object obj4, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return (ZendeskSettingsProvider) C51679xZ3.m5002e(ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) obj, (SettingsStorage) obj2, (CoreSettingsStorage) obj3, actionHandlerRegistry, (Serializer) obj4, zendeskLocaleConverter, applicationConfiguration, context));
    }

    @Override // p000.Y94
    public ZendeskSettingsProvider get() {
        return provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), this.actionHandlerRegistryProvider.get(), this.serializerProvider.get(), this.zendeskLocaleConverterProvider.get(), this.configurationProvider.get(), this.contextProvider.get());
    }
}
