package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
@Module
/* loaded from: classes8.dex */
class ZendeskProvidersModule {
    @Provides
    public static ActionHandlerRegistry actionHandlerRegistry() {
        return Zendesk.INSTANCE.actionHandlerRegistry();
    }

    @Provides
    public static AccessProvider provideAccessProvider(IdentityManager identityManager, AccessService accessService) {
        return new ZendeskAccessProvider(identityManager, accessService);
    }

    @Provides
    @Reusable
    public static AccessService provideAccessService(MN4 mn4) {
        return (AccessService) mn4.m95385b(AccessService.class);
    }

    @Provides
    public static BlipsService provideBlipsService(MN4 mn4) {
        return (BlipsService) mn4.m95385b(BlipsService.class);
    }

    @Provides
    @Reusable
    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider, MachineIdStorage machineIdStorage) {
        return new CoreModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, context, actionHandlerRegistry, memoryCache, scheduledExecutorService, authenticationProvider, applicationConfiguration, pushRegistrationProvider, machineIdStorage);
    }

    @Provides
    public static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return new ZendeskProviderStore(userProvider, pushRegistrationProvider);
    }

    @Provides
    public static PushRegistrationProvider providePushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Context context) {
        return new ZendeskPushRegistrationProvider(pushRegistrationService, identityManager, settingsProvider, blipsCoreProvider, pushDeviceIdStorage, DeviceInfo.getCurrentLocale(context));
    }

    @Provides
    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        return (ZendeskPushRegistrationProvider) pushRegistrationProvider;
    }

    @Provides
    @Reusable
    public static PushRegistrationService providePushRegistrationService(MN4 mn4) {
        return (PushRegistrationService) mn4.m95385b(PushRegistrationService.class);
    }

    @Provides
    public static SettingsProvider provideSdkSettingsProvider(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    @Provides
    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    @Provides
    @Reusable
    public static SdkSettingsService provideSdkSettingsService(MN4 mn4) {
        return (SdkSettingsService) mn4.m95385b(SdkSettingsService.class);
    }

    @Provides
    public static UserProvider provideUserProvider(UserService userService) {
        return new ZendeskUserProvider(userService);
    }

    @Provides
    @Reusable
    public static UserService provideUserService(MN4 mn4) {
        return (UserService) mn4.m95385b(UserService.class);
    }

    @Provides
    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return new ZendeskSettingsProvider(sdkSettingsService, settingsStorage, coreSettingsStorage, actionHandlerRegistry, serializer, zendeskLocaleConverter, applicationConfiguration.getApplicationId(), context);
    }

    @Provides
    public static BlipsCoreProvider providerBlipsCoreProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    @Provides
    public static BlipsProvider providerBlipsProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    @Provides
    public static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Provides
    public static NetworkInfoProvider providerNetworkInfoProvider(ConnectivityManager connectivityManager) {
        return new ZendeskNetworkInfoProvider(connectivityManager);
    }

    @Provides
    public static ZendeskBlipsProvider providerZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, Serializer serializer, IdentityManager identityManager, ApplicationConfiguration applicationConfiguration, CoreSettingsStorage coreSettingsStorage, ExecutorService executorService) {
        return new ZendeskBlipsProvider(blipsService, deviceInfo, serializer, identityManager, applicationConfiguration.getApplicationId(), coreSettingsStorage, executorService);
    }
}
