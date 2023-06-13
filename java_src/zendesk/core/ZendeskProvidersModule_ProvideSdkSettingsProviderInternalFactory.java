package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements InterfaceC48812sj1<SdkSettingsProviderInternal> {
    private final Y94<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(Y94<ZendeskSettingsProvider> y94) {
        this.sdkSettingsProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory create(Y94<ZendeskSettingsProvider> y94) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(y94);
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(Object obj) {
        return (SdkSettingsProviderInternal) C51679xZ3.m5002e(ZendeskProvidersModule.provideSdkSettingsProviderInternal((ZendeskSettingsProvider) obj));
    }

    @Override // p000.Y94
    public SdkSettingsProviderInternal get() {
        return provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
    }
}
