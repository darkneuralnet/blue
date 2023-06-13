package zendesk.core;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements InterfaceC48812sj1<CoreModule> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<AuthenticationProvider> authenticationProvider;
    private final Y94<BlipsProvider> blipsProvider;
    private final Y94<Context> contextProvider;
    private final Y94<ScheduledExecutorService> executorProvider;
    private final Y94<MachineIdStorage> machineIdStorageProvider;
    private final Y94<MemoryCache> memoryCacheProvider;
    private final Y94<NetworkInfoProvider> networkInfoProvider;
    private final Y94<PushRegistrationProvider> pushRegistrationProvider;
    private final Y94<RestServiceProvider> restServiceProvider;
    private final Y94<SessionStorage> sessionStorageProvider;
    private final Y94<SettingsProvider> settingsProvider;
    private final Y94<ApplicationConfiguration> zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(Y94<SettingsProvider> y94, Y94<RestServiceProvider> y942, Y94<BlipsProvider> y943, Y94<SessionStorage> y944, Y94<NetworkInfoProvider> y945, Y94<MemoryCache> y946, Y94<ActionHandlerRegistry> y947, Y94<ScheduledExecutorService> y948, Y94<Context> y949, Y94<AuthenticationProvider> y9410, Y94<ApplicationConfiguration> y9411, Y94<PushRegistrationProvider> y9412, Y94<MachineIdStorage> y9413) {
        this.settingsProvider = y94;
        this.restServiceProvider = y942;
        this.blipsProvider = y943;
        this.sessionStorageProvider = y944;
        this.networkInfoProvider = y945;
        this.memoryCacheProvider = y946;
        this.actionHandlerRegistryProvider = y947;
        this.executorProvider = y948;
        this.contextProvider = y949;
        this.authenticationProvider = y9410;
        this.zendeskConfigurationProvider = y9411;
        this.pushRegistrationProvider = y9412;
        this.machineIdStorageProvider = y9413;
    }

    public static ZendeskProvidersModule_ProvideCoreSdkModuleFactory create(Y94<SettingsProvider> y94, Y94<RestServiceProvider> y942, Y94<BlipsProvider> y943, Y94<SessionStorage> y944, Y94<NetworkInfoProvider> y945, Y94<MemoryCache> y946, Y94<ActionHandlerRegistry> y947, Y94<ScheduledExecutorService> y948, Y94<Context> y949, Y94<AuthenticationProvider> y9410, Y94<ApplicationConfiguration> y9411, Y94<PushRegistrationProvider> y9412, Y94<MachineIdStorage> y9413) {
        return new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412, y9413);
    }

    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider, MachineIdStorage machineIdStorage) {
        return (CoreModule) C51679xZ3.m5002e(ZendeskProvidersModule.provideCoreSdkModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, memoryCache, actionHandlerRegistry, scheduledExecutorService, context, authenticationProvider, applicationConfiguration, pushRegistrationProvider, machineIdStorage));
    }

    @Override // p000.Y94
    public CoreModule get() {
        return provideCoreSdkModule(this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.sessionStorageProvider.get(), this.networkInfoProvider.get(), this.memoryCacheProvider.get(), this.actionHandlerRegistryProvider.get(), this.executorProvider.get(), this.contextProvider.get(), this.authenticationProvider.get(), this.zendeskConfigurationProvider.get(), this.pushRegistrationProvider.get(), this.machineIdStorageProvider.get());
    }
}
