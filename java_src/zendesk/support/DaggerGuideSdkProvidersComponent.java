package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* loaded from: classes8.dex */
final class DaggerGuideSdkProvidersComponent implements GuideSdkProvidersComponent {
    private Y94<BlipsProvider> getBlipsProvider;
    private Y94<RestServiceProvider> getRestServiceProvider;
    private Y94<SessionStorage> getSessionStorageProvider;
    private Y94<SettingsProvider> getSettingsProvider;
    private final DaggerGuideSdkProvidersComponent guideSdkProvidersComponent;
    private Y94<ArticleVoteStorage> provideArticleVoteStorageProvider;
    private Y94<HelpCenterCachingNetworkConfig> provideCustomNetworkConfigProvider;
    private Y94<Locale> provideDeviceLocaleProvider;
    private Y94<GuideModule> provideGuideModuleProvider;
    private Y94<HelpCenterCachingInterceptor> provideHelpCenterCachingInterceptorProvider;
    private Y94<HelpCenterProvider> provideHelpCenterProvider;
    private Y94<HelpCenterSessionCache> provideHelpCenterSessionCacheProvider;
    private Y94<HelpCenterSettingsProvider> provideSettingsProvider;
    private Y94<ZendeskHelpCenterService> provideZendeskHelpCenterServiceProvider;
    private Y94<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private Y94<HelpCenterBlipsProvider> providesHelpCenterBlipsProvider;
    private Y94<HelpCenterService> providesHelpCenterServiceProvider;

    /* loaded from: classes8.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private GuideProviderModule guideProviderModule;

        public GuideSdkProvidersComponent build() {
            C51679xZ3.m5006a(this.coreModule, CoreModule.class);
            C51679xZ3.m5006a(this.guideProviderModule, GuideProviderModule.class);
            return new DaggerGuideSdkProvidersComponent(this.coreModule, this.guideProviderModule);
        }

        public Builder coreModule(CoreModule coreModule) {
            this.coreModule = (CoreModule) C51679xZ3.m5005b(coreModule);
            return this;
        }

        public Builder guideProviderModule(GuideProviderModule guideProviderModule) {
            this.guideProviderModule = (GuideProviderModule) C51679xZ3.m5005b(guideProviderModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(CoreModule coreModule, GuideProviderModule guideProviderModule) {
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
        this.provideZendeskLocaleConverterProvider = V51.m80429b(GuideProviderModule_ProvideZendeskLocaleConverterFactory.create());
        Y94<Locale> m80429b = V51.m80429b(GuideProviderModule_ProvideDeviceLocaleFactory.create(guideProviderModule));
        this.provideDeviceLocaleProvider = m80429b;
        this.provideSettingsProvider = V51.m80429b(GuideProviderModule_ProvideSettingsProviderFactory.create(guideProviderModule, this.getSettingsProvider, this.provideZendeskLocaleConverterProvider, m80429b));
        CoreModule_GetBlipsProviderFactory create = CoreModule_GetBlipsProviderFactory.create(coreModule);
        this.getBlipsProvider = create;
        this.providesHelpCenterBlipsProvider = V51.m80429b(GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory.create(guideProviderModule, create, this.provideDeviceLocaleProvider));
        this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(coreModule);
        Y94<HelpCenterCachingInterceptor> m34371a = C42572iB5.m34371a(GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory.create());
        this.provideHelpCenterCachingInterceptorProvider = m34371a;
        Y94<HelpCenterCachingNetworkConfig> m34371a2 = C42572iB5.m34371a(GuideProviderModule_ProvideCustomNetworkConfigFactory.create(m34371a));
        this.provideCustomNetworkConfigProvider = m34371a2;
        Y94<HelpCenterService> m80429b2 = V51.m80429b(GuideProviderModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, m34371a2));
        this.providesHelpCenterServiceProvider = m80429b2;
        this.provideZendeskHelpCenterServiceProvider = V51.m80429b(GuideProviderModule_ProvideZendeskHelpCenterServiceFactory.create(m80429b2, this.provideZendeskLocaleConverterProvider));
        Y94<HelpCenterSessionCache> m80429b3 = V51.m80429b(GuideProviderModule_ProvideHelpCenterSessionCacheFactory.create());
        this.provideHelpCenterSessionCacheProvider = m80429b3;
        this.provideHelpCenterProvider = V51.m80429b(GuideProviderModule_ProvideHelpCenterProviderFactory.create(guideProviderModule, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, this.provideZendeskHelpCenterServiceProvider, m80429b3));
        CoreModule_GetSessionStorageFactory create2 = CoreModule_GetSessionStorageFactory.create(coreModule);
        this.getSessionStorageProvider = create2;
        Y94<ArticleVoteStorage> m80429b4 = V51.m80429b(GuideProviderModule_ProvideArticleVoteStorageFactory.create(create2));
        this.provideArticleVoteStorageProvider = m80429b4;
        this.provideGuideModuleProvider = V51.m80429b(GuideProviderModule_ProvideGuideModuleFactory.create(guideProviderModule, this.provideHelpCenterProvider, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, m80429b4, this.getRestServiceProvider));
    }

    private Guide injectGuide(Guide guide) {
        Guide_MembersInjector.injectGuideModule(guide, this.provideGuideModuleProvider.get());
        Guide_MembersInjector.injectBlipsProvider(guide, this.providesHelpCenterBlipsProvider.get());
        return guide;
    }

    @Override // zendesk.support.GuideSdkProvidersComponent
    public Guide inject(Guide guide) {
        return injectGuide(guide);
    }

    private DaggerGuideSdkProvidersComponent(CoreModule coreModule, GuideProviderModule guideProviderModule) {
        this.guideSdkProvidersComponent = this;
        initialize(coreModule, guideProviderModule);
    }
}
