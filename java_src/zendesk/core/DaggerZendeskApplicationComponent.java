package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class DaggerZendeskApplicationComponent implements ZendeskApplicationComponent {
    private Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private Y94<AcceptLanguageHeaderInterceptor> provideAcceptLanguageHeaderInterceptorProvider;
    private Y94<ZendeskAccessInterceptor> provideAccessInterceptorProvider;
    private Y94<AccessProvider> provideAccessProvider;
    private Y94<AccessService> provideAccessServiceProvider;
    private Y94<BaseStorage> provideAdditionalSdkBaseStorageProvider;
    private Y94<ApplicationConfiguration> provideApplicationConfigurationProvider;
    private Y94<Context> provideApplicationContextProvider;
    private Y94<ZendeskAuthHeaderInterceptor> provideAuthHeaderInterceptorProvider;
    private Y94<AuthenticationProvider> provideAuthProvider;
    private Y94<Serializer> provideBase64SerializerProvider;
    private Y94<OkHttpClient> provideBaseOkHttpClientProvider;
    private Y94<BlipsService> provideBlipsServiceProvider;
    private Y94<Cache> provideCacheProvider;
    private Y94<CachingInterceptor> provideCachingInterceptorProvider;
    private Y94<OkHttpClient> provideCoreOkHttpClientProvider;
    private Y94<MN4> provideCoreRetrofitProvider;
    private Y94<CoreModule> provideCoreSdkModuleProvider;
    private Y94<CoreSettingsStorage> provideCoreSettingsStorageProvider;
    private Y94<DeviceInfo> provideDeviceInfoProvider;
    private Y94<ScheduledExecutorService> provideExecutorProvider;
    private Y94<ExecutorService> provideExecutorServiceProvider;
    private Y94<C46153oE1> provideGsonProvider;
    private Y94<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
    private Y94<BaseStorage> provideIdentityBaseStorageProvider;
    private Y94<IdentityManager> provideIdentityManagerProvider;
    private Y94<IdentityStorage> provideIdentityStorageProvider;
    private Y94<SharedPreferencesStorage> provideLegacyIdentityBaseStorageProvider;
    private Y94<LegacyIdentityMigrator> provideLegacyIdentityStorageProvider;
    private Y94<SharedPreferencesStorage> provideLegacyPushBaseStorageProvider;
    private Y94<MachineIdStorage> provideMachineIdStorageProvider;
    private Y94<OkHttpClient> provideMediaOkHttpClientProvider;
    private Y94<MemoryCache> provideMemoryCacheProvider;
    private Y94<OkHttpClient> provideOkHttpClientProvider;
    private Y94<ProviderStore> provideProviderStoreProvider;
    private Y94<PushDeviceIdStorage> providePushDeviceIdStorageProvider;
    private Y94<ZendeskPushInterceptor> providePushInterceptorProvider;
    private Y94<MN4> providePushProviderRetrofitProvider;
    private Y94<PushRegistrationProvider> providePushRegistrationProvider;
    private Y94<PushRegistrationProviderInternal> providePushRegistrationProviderInternalProvider;
    private Y94<PushRegistrationService> providePushRegistrationServiceProvider;
    private Y94<RestServiceProvider> provideRestServiceProvider;
    private Y94<MN4> provideRetrofitProvider;
    private Y94<BaseStorage> provideSdkBaseStorageProvider;
    private Y94<SettingsProvider> provideSdkSettingsProvider;
    private Y94<SdkSettingsProviderInternal> provideSdkSettingsProviderInternalProvider;
    private Y94<SdkSettingsService> provideSdkSettingsServiceProvider;
    private Y94<Storage> provideSdkStorageProvider;
    private Y94<Serializer> provideSerializerProvider;
    private Y94<SessionStorage> provideSessionStorageProvider;
    private Y94<BaseStorage> provideSettingsBaseStorageProvider;
    private Y94<ZendeskSettingsInterceptor> provideSettingsInterceptorProvider;
    private Y94<SettingsStorage> provideSettingsStorageProvider;
    private Y94<UserProvider> provideUserProvider;
    private Y94<UserService> provideUserServiceProvider;
    private Y94<ZendeskOauthIdHeaderInterceptor> provideZendeskBasicHeadersInterceptorProvider;
    private Y94<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private Y94<ZendeskShadow> provideZendeskProvider;
    private Y94<ZendeskSettingsProvider> provideZendeskSdkSettingsProvider;
    private Y94<ZendeskUnauthorizedInterceptor> provideZendeskUnauthorizedInterceptorProvider;
    private Y94<BlipsCoreProvider> providerBlipsCoreProvider;
    private Y94<BlipsProvider> providerBlipsProvider;
    private Y94<ConnectivityManager> providerConnectivityManagerProvider;
    private Y94<NetworkInfoProvider> providerNetworkInfoProvider;
    private Y94<ZendeskBlipsProvider> providerZendeskBlipsProvider;
    private Y94<AcceptHeaderInterceptor> providesAcceptHeaderInterceptorProvider;
    private Y94<File> providesBelvedereDirProvider;
    private Y94<File> providesCacheDirProvider;
    private Y94<File> providesDataDirProvider;
    private Y94<BaseStorage> providesDiskLruStorageProvider;
    private Y94<UserAgentAndClientHeadersInterceptor> providesUserAgentHeaderInterceptorProvider;
    private final DaggerZendeskApplicationComponent zendeskApplicationComponent;

    /* loaded from: classes8.dex */
    public static final class Builder {
        private ZendeskApplicationModule zendeskApplicationModule;
        private ZendeskNetworkModule zendeskNetworkModule;

        public ZendeskApplicationComponent build() {
            C51679xZ3.m5006a(this.zendeskApplicationModule, ZendeskApplicationModule.class);
            if (this.zendeskNetworkModule == null) {
                this.zendeskNetworkModule = new ZendeskNetworkModule();
            }
            return new DaggerZendeskApplicationComponent(this.zendeskApplicationModule, this.zendeskNetworkModule);
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule) {
            this.zendeskApplicationModule = (ZendeskApplicationModule) C51679xZ3.m5005b(zendeskApplicationModule);
            return this;
        }

        public Builder zendeskNetworkModule(ZendeskNetworkModule zendeskNetworkModule) {
            this.zendeskNetworkModule = (ZendeskNetworkModule) C51679xZ3.m5005b(zendeskNetworkModule);
            return this;
        }

        @Deprecated
        public Builder zendeskProvidersModule(ZendeskProvidersModule zendeskProvidersModule) {
            C51679xZ3.m5005b(zendeskProvidersModule);
            return this;
        }

        @Deprecated
        public Builder zendeskStorageModule(ZendeskStorageModule zendeskStorageModule) {
            C51679xZ3.m5005b(zendeskStorageModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        this.provideApplicationContextProvider = V51.m80429b(ZendeskApplicationModule_ProvideApplicationContextFactory.create(zendeskApplicationModule));
        Y94<C46153oE1> m34371a = C42572iB5.m34371a(ZendeskApplicationModule_ProvideGsonFactory.create());
        this.provideGsonProvider = m34371a;
        Y94<Serializer> m80429b = V51.m80429b(ZendeskStorageModule_ProvideSerializerFactory.create(m34371a));
        this.provideSerializerProvider = m80429b;
        Y94<BaseStorage> m80429b2 = V51.m80429b(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, m80429b));
        this.provideSettingsBaseStorageProvider = m80429b2;
        this.provideSettingsStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideSettingsStorageFactory.create(m80429b2));
        Y94<BaseStorage> m80429b3 = V51.m80429b(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityBaseStorageProvider = m80429b3;
        this.provideIdentityStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideIdentityStorageFactory.create(m80429b3));
        this.provideAdditionalSdkBaseStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        Y94<File> m80429b4 = V51.m80429b(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
        this.providesCacheDirProvider = m80429b4;
        this.providesDiskLruStorageProvider = V51.m80429b(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(m80429b4, this.provideSerializerProvider));
        this.provideCacheProvider = V51.m80429b(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
        this.providesDataDirProvider = V51.m80429b(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
        Y94<File> m80429b5 = V51.m80429b(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
        this.providesBelvedereDirProvider = m80429b5;
        this.provideSessionStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, m80429b5));
        this.provideSdkBaseStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        Y94<MemoryCache> m80429b6 = V51.m80429b(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
        this.provideMemoryCacheProvider = m80429b6;
        this.provideSdkStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, m80429b6));
        this.provideLegacyIdentityBaseStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideLegacyPushBaseStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityManagerProvider = V51.m80429b(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
        Y94<PushDeviceIdStorage> m80429b7 = V51.m80429b(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
        this.providePushDeviceIdStorageProvider = m80429b7;
        this.provideLegacyIdentityStorageProvider = V51.m80429b(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, m80429b7));
        this.provideApplicationConfigurationProvider = V51.m80429b(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(zendeskApplicationModule));
        this.provideHttpLoggingInterceptorProvider = C42572iB5.m34371a(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
        this.provideZendeskBasicHeadersInterceptorProvider = C42572iB5.m34371a(C31159x2dd20439.create(zendeskNetworkModule, this.provideApplicationConfigurationProvider));
        this.providesUserAgentHeaderInterceptorProvider = C42572iB5.m34371a(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(zendeskNetworkModule));
        Y94<ScheduledExecutorService> m80429b8 = V51.m80429b(ZendeskApplicationModule_ProvideExecutorFactory.create());
        this.provideExecutorProvider = m80429b8;
        Y94<ExecutorService> m80429b9 = V51.m80429b(ZendeskApplicationModule_ProvideExecutorServiceFactory.create(m80429b8));
        this.provideExecutorServiceProvider = m80429b9;
        this.provideBaseOkHttpClientProvider = V51.m80429b(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, m80429b9));
        this.provideAcceptLanguageHeaderInterceptorProvider = C42572iB5.m34371a(C31158x23150492.create(this.provideApplicationContextProvider));
        Y94<AcceptHeaderInterceptor> m34371a2 = C42572iB5.m34371a(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
        this.providesAcceptHeaderInterceptorProvider = m34371a2;
        Y94<OkHttpClient> m80429b10 = V51.m80429b(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, m34371a2));
        this.provideCoreOkHttpClientProvider = m80429b10;
        Y94<MN4> m80429b11 = V51.m80429b(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, m80429b10));
        this.provideCoreRetrofitProvider = m80429b11;
        this.provideBlipsServiceProvider = V51.m80429b(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(m80429b11));
        this.provideDeviceInfoProvider = V51.m80429b(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
        this.provideBase64SerializerProvider = C42572iB5.m34371a(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(zendeskApplicationModule, this.provideSerializerProvider));
        Y94<CoreSettingsStorage> m80429b12 = V51.m80429b(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
        this.provideCoreSettingsStorageProvider = m80429b12;
        Y94<ZendeskBlipsProvider> m80429b13 = V51.m80429b(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, m80429b12, this.provideExecutorServiceProvider));
        this.providerZendeskBlipsProvider = m80429b13;
        this.providerBlipsCoreProvider = V51.m80429b(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(m80429b13));
        Y94<ZendeskAuthHeaderInterceptor> m34371a3 = C42572iB5.m34371a(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
        this.provideAuthHeaderInterceptorProvider = m34371a3;
        Y94<MN4> m80429b14 = V51.m80429b(ZendeskNetworkModule_ProvidePushProviderRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider, m34371a3));
        this.providePushProviderRetrofitProvider = m80429b14;
        this.providePushRegistrationServiceProvider = C42572iB5.m34371a(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(m80429b14));
        this.provideSdkSettingsServiceProvider = C42572iB5.m34371a(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.actionHandlerRegistryProvider = V51.m80429b(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
        Y94<ZendeskLocaleConverter> m80429b15 = V51.m80429b(ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory.create(zendeskApplicationModule));
        this.provideZendeskLocaleConverterProvider = m80429b15;
        Y94<ZendeskSettingsProvider> m80429b16 = V51.m80429b(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.actionHandlerRegistryProvider, this.provideSerializerProvider, m80429b15, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
        this.provideZendeskSdkSettingsProvider = m80429b16;
        Y94<SettingsProvider> m80429b17 = V51.m80429b(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(m80429b16));
        this.provideSdkSettingsProvider = m80429b17;
        this.providePushRegistrationProvider = V51.m80429b(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, m80429b17, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
        Y94<AccessService> m34371a4 = C42572iB5.m34371a(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideAccessServiceProvider = m34371a4;
        Y94<AccessProvider> m80429b18 = V51.m80429b(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, m34371a4));
        this.provideAccessProvider = m80429b18;
        this.provideAccessInterceptorProvider = C42572iB5.m34371a(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, m80429b18, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
        this.provideZendeskUnauthorizedInterceptorProvider = C42572iB5.m34371a(C31160x5893b2b5.create(this.provideSessionStorageProvider, this.provideIdentityManagerProvider));
        Y94<SdkSettingsProviderInternal> m80429b19 = V51.m80429b(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
        this.provideSdkSettingsProviderInternalProvider = m80429b19;
        this.provideSettingsInterceptorProvider = C42572iB5.m34371a(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(m80429b19, this.provideSettingsStorageProvider));
        Y94<PushRegistrationProviderInternal> m80429b20 = V51.m80429b(C31161xb2419e95.create(this.providePushRegistrationProvider));
        this.providePushRegistrationProviderInternalProvider = m80429b20;
        Y94<ZendeskPushInterceptor> m34371a5 = C42572iB5.m34371a(ZendeskNetworkModule_ProvidePushInterceptorFactory.create(m80429b20, this.providePushDeviceIdStorageProvider, this.provideIdentityStorageProvider));
        this.providePushInterceptorProvider = m34371a5;
        Y94<OkHttpClient> m80429b21 = V51.m80429b(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, m34371a5, this.provideCacheProvider));
        this.provideOkHttpClientProvider = m80429b21;
        this.provideRetrofitProvider = V51.m80429b(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, m80429b21));
        Y94<CachingInterceptor> m34371a6 = C42572iB5.m34371a(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
        this.provideCachingInterceptorProvider = m34371a6;
        Y94<OkHttpClient> m80429b22 = V51.m80429b(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, m34371a6, this.provideZendeskUnauthorizedInterceptorProvider));
        this.provideMediaOkHttpClientProvider = m80429b22;
        this.provideRestServiceProvider = V51.m80429b(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(zendeskNetworkModule, this.provideRetrofitProvider, m80429b22, this.provideOkHttpClientProvider, this.provideCoreOkHttpClientProvider));
        this.providerBlipsProvider = V51.m80429b(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
        Y94<ConnectivityManager> m80429b23 = V51.m80429b(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
        this.providerConnectivityManagerProvider = m80429b23;
        this.providerNetworkInfoProvider = V51.m80429b(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(m80429b23));
        this.provideAuthProvider = V51.m80429b(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
        Y94<MachineIdStorage> m80429b24 = V51.m80429b(ZendeskStorageModule_ProvideMachineIdStorageFactory.create(this.provideApplicationContextProvider));
        this.provideMachineIdStorageProvider = m80429b24;
        this.provideCoreSdkModuleProvider = C42572iB5.m34371a(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, this.provideAuthProvider, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider, m80429b24));
        Y94<UserService> m34371a7 = C42572iB5.m34371a(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
        this.provideUserServiceProvider = m34371a7;
        Y94<UserProvider> m80429b25 = V51.m80429b(ZendeskProvidersModule_ProvideUserProviderFactory.create(m34371a7));
        this.provideUserProvider = m80429b25;
        Y94<ProviderStore> m80429b26 = V51.m80429b(ZendeskProvidersModule_ProvideProviderStoreFactory.create(m80429b25, this.providePushRegistrationProvider));
        this.provideProviderStoreProvider = m80429b26;
        this.provideZendeskProvider = V51.m80429b(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, m80429b26));
    }

    @Override // zendesk.core.ZendeskApplicationComponent
    public ZendeskShadow zendeskShadow() {
        return this.provideZendeskProvider.get();
    }

    private DaggerZendeskApplicationComponent(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        this.zendeskApplicationComponent = this;
        initialize(zendeskApplicationModule, zendeskNetworkModule);
    }
}
