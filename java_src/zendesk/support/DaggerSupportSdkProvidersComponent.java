package zendesk.support;

import android.content.Context;
import java.util.Locale;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.MemoryCache;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class DaggerSupportSdkProvidersComponent implements SupportSdkProvidersComponent {
    private final CoreModule coreModule;
    private Y94<Context> getApplicationContextProvider;
    private Y94<AuthenticationProvider> getAuthenticationProvider;
    private Y94<BlipsProvider> getBlipsProvider;
    private Y94<MemoryCache> getMemoryCacheProvider;
    private Y94<RestServiceProvider> getRestServiceProvider;
    private Y94<SessionStorage> getSessionStorageProvider;
    private Y94<SettingsProvider> getSettingsProvider;
    private Y94<Locale> provideLocaleProvider;
    private Y94<SupportSdkMetadata> provideMetadataProvider;
    private Y94<ProviderStore> provideProviderStoreProvider;
    private Y94<RequestMigrator> provideRequestMigratorProvider;
    private Y94<RequestProvider> provideRequestProvider;
    private Y94<RequestSessionCache> provideRequestSessionCacheProvider;
    private Y94<RequestStorage> provideRequestStorageProvider;
    private Y94<SupportSettingsProvider> provideSdkSettingsProvider;
    private Y94<SupportBlipsProvider> provideSupportBlipsProvider;
    private Y94<SupportModule> provideSupportModuleProvider;
    private Y94<UploadProvider> provideUploadProvider;
    private Y94<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private Y94<ZendeskRequestService> provideZendeskRequestServiceProvider;
    private Y94<ZendeskUploadService> provideZendeskUploadServiceProvider;
    private Y94<ArticleVoteStorage> providesArticleVoteStorageProvider;
    private Y94<HelpCenterProvider> providesHelpCenterProvider;
    private Y94<RequestService> providesRequestServiceProvider;
    private Y94<UploadService> providesUploadServiceProvider;
    private Y94<ZendeskTracker> providesZendeskTrackerProvider;
    private final DaggerSupportSdkProvidersComponent supportSdkProvidersComponent;

    /* loaded from: classes8.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private GuideModule guideModule;
        private ProviderModule providerModule;
        private StorageModule storageModule;
        private SupportApplicationModule supportApplicationModule;

        public SupportSdkProvidersComponent build() {
            C51679xZ3.m5006a(this.supportApplicationModule, SupportApplicationModule.class);
            C51679xZ3.m5006a(this.coreModule, CoreModule.class);
            if (this.providerModule == null) {
                this.providerModule = new ProviderModule();
            }
            C51679xZ3.m5006a(this.guideModule, GuideModule.class);
            if (this.storageModule == null) {
                this.storageModule = new StorageModule();
            }
            return new DaggerSupportSdkProvidersComponent(this.supportApplicationModule, this.coreModule, this.providerModule, this.guideModule, this.storageModule);
        }

        public Builder coreModule(CoreModule coreModule) {
            this.coreModule = (CoreModule) C51679xZ3.m5005b(coreModule);
            return this;
        }

        public Builder guideModule(GuideModule guideModule) {
            this.guideModule = (GuideModule) C51679xZ3.m5005b(guideModule);
            return this;
        }

        public Builder providerModule(ProviderModule providerModule) {
            this.providerModule = (ProviderModule) C51679xZ3.m5005b(providerModule);
            return this;
        }

        @Deprecated
        public Builder serviceModule(ServiceModule serviceModule) {
            C51679xZ3.m5005b(serviceModule);
            return this;
        }

        public Builder storageModule(StorageModule storageModule) {
            this.storageModule = (StorageModule) C51679xZ3.m5005b(storageModule);
            return this;
        }

        public Builder supportApplicationModule(SupportApplicationModule supportApplicationModule) {
            this.supportApplicationModule = (SupportApplicationModule) C51679xZ3.m5005b(supportApplicationModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
        this.providesHelpCenterProvider = GuideModule_ProvidesHelpCenterProviderFactory.create(guideModule);
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
        this.provideLocaleProvider = V51.m80429b(SupportApplicationModule_ProvideLocaleFactory.create(supportApplicationModule));
        Y94<ZendeskLocaleConverter> m80429b = V51.m80429b(ProviderModule_ProvideZendeskLocaleConverterFactory.create(providerModule));
        this.provideZendeskLocaleConverterProvider = m80429b;
        this.provideSdkSettingsProvider = V51.m80429b(ProviderModule_ProvideSdkSettingsProviderFactory.create(providerModule, this.getSettingsProvider, this.provideLocaleProvider, m80429b));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule);
        CoreModule_GetRestServiceProviderFactory create = CoreModule_GetRestServiceProviderFactory.create(coreModule);
        this.getRestServiceProvider = create;
        Y94<RequestService> m80429b2 = V51.m80429b(ServiceModule_ProvidesRequestServiceFactory.create(create));
        this.providesRequestServiceProvider = m80429b2;
        this.provideZendeskRequestServiceProvider = V51.m80429b(ServiceModule_ProvideZendeskRequestServiceFactory.create(m80429b2));
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(coreModule);
        CoreModule_GetApplicationContextFactory create2 = CoreModule_GetApplicationContextFactory.create(coreModule);
        this.getApplicationContextProvider = create2;
        this.provideRequestMigratorProvider = V51.m80429b(StorageModule_ProvideRequestMigratorFactory.create(storageModule, create2));
        CoreModule_GetMemoryCacheFactory create3 = CoreModule_GetMemoryCacheFactory.create(coreModule);
        this.getMemoryCacheProvider = create3;
        this.provideRequestStorageProvider = V51.m80429b(StorageModule_ProvideRequestStorageFactory.create(storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, create3));
        this.provideRequestSessionCacheProvider = V51.m80429b(StorageModule_ProvideRequestSessionCacheFactory.create(storageModule));
        this.providesZendeskTrackerProvider = V51.m80429b(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(supportApplicationModule));
        this.provideMetadataProvider = V51.m80429b(SupportApplicationModule_ProvideMetadataFactory.create(supportApplicationModule, this.getApplicationContextProvider));
        CoreModule_GetBlipsProviderFactory create4 = CoreModule_GetBlipsProviderFactory.create(coreModule);
        this.getBlipsProvider = create4;
        Y94<SupportBlipsProvider> m80429b3 = V51.m80429b(ProviderModule_ProvideSupportBlipsProviderFactory.create(providerModule, create4));
        this.provideSupportBlipsProvider = m80429b3;
        this.provideRequestProvider = V51.m80429b(ProviderModule_ProvideRequestProviderFactory.create(providerModule, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, this.provideMetadataProvider, m80429b3));
        Y94<UploadService> m80429b4 = V51.m80429b(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
        this.providesUploadServiceProvider = m80429b4;
        Y94<ZendeskUploadService> m80429b5 = V51.m80429b(ServiceModule_ProvideZendeskUploadServiceFactory.create(m80429b4));
        this.provideZendeskUploadServiceProvider = m80429b5;
        Y94<UploadProvider> m80429b6 = V51.m80429b(ProviderModule_ProvideUploadProviderFactory.create(providerModule, m80429b5));
        this.provideUploadProvider = m80429b6;
        this.provideProviderStoreProvider = V51.m80429b(ProviderModule_ProvideProviderStoreFactory.create(providerModule, this.providesHelpCenterProvider, this.provideRequestProvider, m80429b6));
        GuideModule_ProvidesArticleVoteStorageFactory create5 = GuideModule_ProvidesArticleVoteStorageFactory.create(guideModule);
        this.providesArticleVoteStorageProvider = create5;
        this.provideSupportModuleProvider = V51.m80429b(ProviderModule_ProvideSupportModuleFactory.create(providerModule, this.provideRequestProvider, this.provideUploadProvider, this.providesHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, create5));
    }

    private Support injectSupport(Support support) {
        Support_MembersInjector.injectProviderStore(support, this.provideProviderStoreProvider.get());
        Support_MembersInjector.injectSupportModule(support, this.provideSupportModuleProvider.get());
        Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
        Support_MembersInjector.injectBlipsProvider(support, this.provideSupportBlipsProvider.get());
        Support_MembersInjector.injectActionHandlerRegistry(support, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        Support_MembersInjector.injectRequestProvider(support, this.provideRequestProvider.get());
        Support_MembersInjector.injectAuthenticationProvider(support, CoreModule_GetAuthenticationProviderFactory.getAuthenticationProvider(this.coreModule));
        return support;
    }

    @Override // zendesk.support.SupportSdkProvidersComponent
    public Support inject(Support support) {
        return injectSupport(support);
    }

    private DaggerSupportSdkProvidersComponent(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
        this.supportSdkProvidersComponent = this;
        this.coreModule = coreModule;
        initialize(supportApplicationModule, coreModule, providerModule, guideModule, storageModule);
    }
}
