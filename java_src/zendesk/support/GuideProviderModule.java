package zendesk.support;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import java.util.Locale;
import zendesk.core.BlipsProvider;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class GuideProviderModule {
    private HelpCenterTracker tracker;

    public GuideProviderModule(HelpCenterTracker helpCenterTracker) {
        this.tracker = helpCenterTracker;
    }

    @Provides
    public static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return new ZendeskArticleVoteStorage(sessionStorage.getAdditionalSdkStorage());
    }

    @Provides
    @Reusable
    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        return new HelpCenterCachingNetworkConfig(helpCenterCachingInterceptor);
    }

    @Provides
    @Reusable
    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return new HelpCenterCachingInterceptor();
    }

    @Provides
    public static HelpCenterSessionCache provideHelpCenterSessionCache() {
        return new ZendeskHelpCenterSessionCache();
    }

    @Provides
    public static ZendeskHelpCenterService provideZendeskHelpCenterService(HelpCenterService helpCenterService, ZendeskLocaleConverter zendeskLocaleConverter) {
        return new ZendeskHelpCenterService(helpCenterService, zendeskLocaleConverter);
    }

    @Provides
    public static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }

    @Provides
    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, HelpCenterCachingNetworkConfig helpCenterCachingNetworkConfig) {
        return (HelpCenterService) restServiceProvider.createRestService(HelpCenterService.class, "1.0.8", "Guide", helpCenterCachingNetworkConfig);
    }

    @Provides
    public Locale provideDeviceLocale() {
        return Locale.getDefault();
    }

    @Provides
    public GuideModule provideGuideModule(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider) {
        return new GuideModule(helpCenterProvider, helpCenterSettingsProvider, helpCenterBlipsProvider, this.tracker, articleVoteStorage, restServiceProvider.getMediaOkHttpClient());
    }

    @Provides
    public HelpCenterProvider provideHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache) {
        return new ZendeskHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, zendeskHelpCenterService, helpCenterSessionCache, this.tracker);
    }

    @Provides
    public HelpCenterSettingsProvider provideSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        return new ZendeskHelpCenterSettingsProvider(settingsProvider, zendeskLocaleConverter, locale);
    }

    @Provides
    public HelpCenterBlipsProvider providesHelpCenterBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        return new ZendeskHelpCenterBlipsProvider(blipsProvider, locale);
    }
}
