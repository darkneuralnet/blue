package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements InterfaceC48812sj1<PushRegistrationProvider> {
    private final Y94<BlipsCoreProvider> blipsProvider;
    private final Y94<Context> contextProvider;
    private final Y94<IdentityManager> identityManagerProvider;
    private final Y94<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final Y94<PushRegistrationService> pushRegistrationServiceProvider;
    private final Y94<SettingsProvider> settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(Y94<PushRegistrationService> y94, Y94<IdentityManager> y942, Y94<SettingsProvider> y943, Y94<BlipsCoreProvider> y944, Y94<PushDeviceIdStorage> y945, Y94<Context> y946) {
        this.pushRegistrationServiceProvider = y94;
        this.identityManagerProvider = y942;
        this.settingsProvider = y943;
        this.blipsProvider = y944;
        this.pushDeviceIdStorageProvider = y945;
        this.contextProvider = y946;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderFactory create(Y94<PushRegistrationService> y94, Y94<IdentityManager> y942, Y94<SettingsProvider> y943, Y94<BlipsCoreProvider> y944, Y94<PushDeviceIdStorage> y945, Y94<Context> y946) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(y94, y942, y943, y944, y945, y946);
    }

    public static PushRegistrationProvider providePushRegistrationProvider(Object obj, Object obj2, SettingsProvider settingsProvider, Object obj3, Object obj4, Context context) {
        return (PushRegistrationProvider) C51679xZ3.m5002e(ZendeskProvidersModule.providePushRegistrationProvider((PushRegistrationService) obj, (IdentityManager) obj2, settingsProvider, (BlipsCoreProvider) obj3, (PushDeviceIdStorage) obj4, context));
    }

    @Override // p000.Y94
    public PushRegistrationProvider get() {
        return providePushRegistrationProvider(this.pushRegistrationServiceProvider.get(), this.identityManagerProvider.get(), this.settingsProvider.get(), this.blipsProvider.get(), this.pushDeviceIdStorageProvider.get(), this.contextProvider.get());
    }
}
