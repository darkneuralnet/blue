package zendesk.core;

import java.util.concurrent.ExecutorService;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements InterfaceC48812sj1<ZendeskBlipsProvider> {
    private final Y94<ApplicationConfiguration> applicationConfigurationProvider;
    private final Y94<BlipsService> blipsServiceProvider;
    private final Y94<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Y94<DeviceInfo> deviceInfoProvider;
    private final Y94<ExecutorService> executorProvider;
    private final Y94<IdentityManager> identityManagerProvider;
    private final Y94<Serializer> serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(Y94<BlipsService> y94, Y94<DeviceInfo> y942, Y94<Serializer> y943, Y94<IdentityManager> y944, Y94<ApplicationConfiguration> y945, Y94<CoreSettingsStorage> y946, Y94<ExecutorService> y947) {
        this.blipsServiceProvider = y94;
        this.deviceInfoProvider = y942;
        this.serializerProvider = y943;
        this.identityManagerProvider = y944;
        this.applicationConfigurationProvider = y945;
        this.coreSettingsStorageProvider = y946;
        this.executorProvider = y947;
    }

    public static ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory create(Y94<BlipsService> y94, Y94<DeviceInfo> y942, Y94<Serializer> y943, Y94<IdentityManager> y944, Y94<ApplicationConfiguration> y945, Y94<CoreSettingsStorage> y946, Y94<ExecutorService> y947) {
        return new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static ZendeskBlipsProvider providerZendeskBlipsProvider(Object obj, Object obj2, Object obj3, Object obj4, ApplicationConfiguration applicationConfiguration, Object obj5, ExecutorService executorService) {
        return (ZendeskBlipsProvider) C51679xZ3.m5002e(ZendeskProvidersModule.providerZendeskBlipsProvider((BlipsService) obj, (DeviceInfo) obj2, (Serializer) obj3, (IdentityManager) obj4, applicationConfiguration, (CoreSettingsStorage) obj5, executorService));
    }

    @Override // p000.Y94
    public ZendeskBlipsProvider get() {
        return providerZendeskBlipsProvider(this.blipsServiceProvider.get(), this.deviceInfoProvider.get(), this.serializerProvider.get(), this.identityManagerProvider.get(), this.applicationConfigurationProvider.get(), this.coreSettingsStorageProvider.get(), this.executorProvider.get());
    }
}
