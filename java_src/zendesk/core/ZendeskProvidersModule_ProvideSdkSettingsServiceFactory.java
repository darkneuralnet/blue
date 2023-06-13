package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements InterfaceC48812sj1<SdkSettingsService> {
    private final Y94<MN4> retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(Y94<MN4> y94) {
        this.retrofitProvider = y94;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsServiceFactory create(Y94<MN4> y94) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(y94);
    }

    public static SdkSettingsService provideSdkSettingsService(MN4 mn4) {
        return (SdkSettingsService) C51679xZ3.m5002e(ZendeskProvidersModule.provideSdkSettingsService(mn4));
    }

    @Override // p000.Y94
    public SdkSettingsService get() {
        return provideSdkSettingsService(this.retrofitProvider.get());
    }
}
