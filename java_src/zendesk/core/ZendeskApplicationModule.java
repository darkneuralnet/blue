package zendesk.core;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.logging.HttpLoggingInterceptor;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class ZendeskApplicationModule {
    static final String APPLICATION_CONTEXT = "application_context";
    static final String BASE_64_SERIALIZER = "base_64_serializer";
    private static final int THREAD_POOL_SIZE = 5;
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    public ZendeskApplicationModule(Context context, ApplicationConfiguration applicationConfiguration) {
        this.context = context.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration;
    }

    @Provides
    public static DeviceInfo provideDeviceInfo(Context context) {
        return new DeviceInfo(context);
    }

    @Provides
    public static ScheduledExecutorService provideExecutor() {
        return Executors.newScheduledThreadPool(5, new ThreadFactory() { // from class: zendesk.core.ZendeskApplicationModule.1
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, String.format(Locale.ENGLISH, "ZendeskThread-%d", Integer.valueOf(this.atomicInteger.getAndIncrement())));
                thread.setPriority(10);
                return thread;
            }
        });
    }

    @Provides
    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService;
    }

    @Provides
    @Reusable
    public static C46153oE1 provideGson() {
        return new C46746pE1().m19801i(EnumC36618Vk1.f39679f).m19805e(128, 8).m19804f(Date.class, new C45601nI6()).m19808b();
    }

    @Provides
    @Reusable
    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor.Level level;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (C33694Ix2.m101451h()) {
            level = HttpLoggingInterceptor.Level.BASIC;
        } else {
            level = HttpLoggingInterceptor.Level.NONE;
        }
        httpLoggingInterceptor.setLevel(level);
        return httpLoggingInterceptor;
    }

    @Provides
    public static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
    }

    @Provides
    public ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    @Provides
    public Context provideApplicationContext() {
        return this.context;
    }

    @Provides
    @Reusable
    public Serializer provideBase64Serializer(Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }

    @Provides
    public ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }
}
