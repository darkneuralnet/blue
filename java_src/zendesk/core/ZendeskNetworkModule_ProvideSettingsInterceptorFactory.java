package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements InterfaceC48812sj1<ZendeskSettingsInterceptor> {
    private final Y94<SdkSettingsProviderInternal> sdkSettingsProvider;
    private final Y94<SettingsStorage> settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(Y94<SdkSettingsProviderInternal> y94, Y94<SettingsStorage> y942) {
        this.sdkSettingsProvider = y94;
        this.settingsStorageProvider = y942;
    }

    public static ZendeskNetworkModule_ProvideSettingsInterceptorFactory create(Y94<SdkSettingsProviderInternal> y94, Y94<SettingsStorage> y942) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(y94, y942);
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(Object obj, Object obj2) {
        return (ZendeskSettingsInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) obj, (SettingsStorage) obj2));
    }

    @Override // p000.Y94
    public ZendeskSettingsInterceptor get() {
        return provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
    }
}
