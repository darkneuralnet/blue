package zendesk.core;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
@Module
/* loaded from: classes8.dex */
public class CoreModule {
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final ApplicationConfiguration applicationConfiguration;
    private final Context applicationContext;
    private final AuthenticationProvider authenticationProvider;
    private final BlipsProvider blipsProvider;
    private final ScheduledExecutorService executor;
    private final MachineIdStorage machineIdStorage;
    private final MemoryCache memoryCache;
    private final NetworkInfoProvider networkInfoProvider;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final RestServiceProvider restServiceProvider;
    private final SessionStorage sessionStorage;
    private final SettingsProvider settingsProvider;

    public CoreModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, Context context, ActionHandlerRegistry actionHandlerRegistry, MemoryCache memoryCache, ScheduledExecutorService scheduledExecutorService, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider, MachineIdStorage machineIdStorage) {
        this.settingsProvider = settingsProvider;
        this.restServiceProvider = restServiceProvider;
        this.blipsProvider = blipsProvider;
        this.sessionStorage = sessionStorage;
        this.networkInfoProvider = networkInfoProvider;
        this.applicationContext = context;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.memoryCache = memoryCache;
        this.executor = scheduledExecutorService;
        this.authenticationProvider = authenticationProvider;
        this.applicationConfiguration = applicationConfiguration;
        this.pushRegistrationProvider = pushRegistrationProvider;
        this.machineIdStorage = machineIdStorage;
    }

    @Provides
    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    @Provides
    public ApplicationConfiguration getApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    @Provides
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Provides
    public AuthenticationProvider getAuthenticationProvider() {
        return this.authenticationProvider;
    }

    @Provides
    public BlipsProvider getBlipsProvider() {
        return this.blipsProvider;
    }

    @Provides
    public Executor getExecutor() {
        return this.executor;
    }

    @Provides
    public ExecutorService getExecutorService() {
        return this.executor;
    }

    @Provides
    public MachineIdStorage getMachineIdStorage() {
        return this.machineIdStorage;
    }

    @Provides
    public MemoryCache getMemoryCache() {
        return this.memoryCache;
    }

    @Provides
    public NetworkInfoProvider getNetworkInfoProvider() {
        return this.networkInfoProvider;
    }

    @Provides
    public PushRegistrationProvider getPushRegistrationProvider() {
        return this.pushRegistrationProvider;
    }

    @Provides
    public RestServiceProvider getRestServiceProvider() {
        return this.restServiceProvider;
    }

    @Provides
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.executor;
    }

    @Provides
    public SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    @Provides
    public SettingsProvider getSettingsProvider() {
        return this.settingsProvider;
    }
}
