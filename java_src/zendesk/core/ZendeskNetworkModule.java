package zendesk.core;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p000.MN4;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class ZendeskNetworkModule {
    private static final String BASE_OK_HTTP = "BaseOkHttp";
    private static final String CORE_OK_HTTP = "CoreOkHttp";
    static final String CORE_RETROFIT = "CoreRetrofit";
    private static final String MEDIA_OK_HTTP = "MediaOkHttp";
    static final String PUSH_PROVIDER_RETROFIT = "PushProviderRetrofit";
    private static final String STANDARD_OK_HTTP = "StandardOkHttp";
    static final String STANDARD_RETROFIT = "Retrofit";

    @Provides
    @Reusable
    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    @Provides
    @Reusable
    public static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    @Provides
    @Reusable
    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    @Provides
    @Reusable
    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    @Provides
    public static MN4 provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, C46153oE1 c46153oE1, OkHttpClient okHttpClient) {
        return new MN4.C5282b().m95373c(applicationConfiguration.getZendeskUrl()).m95374b(C47339qE1.m17874f(c46153oE1)).m95369g(okHttpClient).m95371e();
    }

    @Provides
    @Reusable
    public static ZendeskPushInterceptor providePushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        return new ZendeskPushInterceptor(pushRegistrationProviderInternal, pushDeviceIdStorage, identityStorage);
    }

    @Provides
    public static MN4 providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, C46153oE1 c46153oE1, OkHttpClient okHttpClient, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor) {
        return new MN4.C5282b().m95373c(applicationConfiguration.getZendeskUrl()).m95374b(C47339qE1.m17874f(c46153oE1)).m95369g(okHttpClient.newBuilder().addInterceptor(zendeskAuthHeaderInterceptor).build()).m95371e();
    }

    @Provides
    public static MN4 provideRetrofit(ApplicationConfiguration applicationConfiguration, C46153oE1 c46153oE1, OkHttpClient okHttpClient) {
        return new MN4.C5282b().m95373c(applicationConfiguration.getZendeskUrl()).m95374b(C47339qE1.m17874f(c46153oE1)).m95369g(okHttpClient).m95371e();
    }

    @Provides
    @Reusable
    public static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    @Provides
    @Reusable
    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, IdentityManager identityManager) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage, identityManager);
    }

    @Provides
    @Reusable
    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    @Provides
    public OkHttpClient provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        OkHttpClient.Builder addInterceptor = Tls12SocketFactory.enableTls12(new OkHttpClient.Builder()).addInterceptor(zendeskOauthIdHeaderInterceptor).addInterceptor(httpLoggingInterceptor).addInterceptor(userAgentAndClientHeadersInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).dispatcher(new Dispatcher(executorService)).build();
    }

    @Provides
    public OkHttpClient provideCoreOkHttpClient(OkHttpClient okHttpClient, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(acceptLanguageHeaderInterceptor).addInterceptor(acceptHeaderInterceptor).build();
    }

    @Provides
    public OkHttpClient provideMediaOkHttpClient(OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(cachingInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).build();
    }

    @Provides
    public OkHttpClient provideOkHttpClient(OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, ZendeskPushInterceptor zendeskPushInterceptor, Cache cache) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).addInterceptor(acceptHeaderInterceptor).addInterceptor(zendeskPushInterceptor).cache(cache).build();
    }

    @Provides
    public RestServiceProvider provideRestServiceProvider(MN4 mn4, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return new ZendeskRestServiceProvider(mn4, okHttpClient, okHttpClient2, okHttpClient3);
    }

    @Provides
    @Reusable
    public ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    @Provides
    @Reusable
    public UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor(BuildConfig.VERSION_NAME, Constants.VARIANT);
    }
}
