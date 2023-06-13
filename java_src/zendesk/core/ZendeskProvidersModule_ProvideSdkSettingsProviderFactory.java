package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements InterfaceC48812sj1<SettingsProvider> {
    private final Y94<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(Y94<ZendeskSettingsProvider> y94) {
        this.sdkSettingsProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderFactory create(Y94<ZendeskSettingsProvider> y94) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(y94);
    }

    public static SettingsProvider provideSdkSettingsProvider(Object obj) {
        return (SettingsProvider) C51679xZ3.m5002e(ZendeskProvidersModule.provideSdkSettingsProvider((ZendeskSettingsProvider) obj));
    }

    @Override // p000.Y94
    public SettingsProvider get() {
        return provideSdkSettingsProvider(this.sdkSettingsProvider.get());
    }
}
