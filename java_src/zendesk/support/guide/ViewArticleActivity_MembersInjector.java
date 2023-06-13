package zendesk.support.guide;

import dagger.MembersInjector;
import okhttp3.OkHttpClient;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;
/* loaded from: classes8.dex */
public final class ViewArticleActivity_MembersInjector implements MembersInjector<ViewArticleActivity> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<ApplicationConfiguration> applicationConfigurationProvider;
    private final Y94<ArticleVoteStorage> articleVoteStorageProvider;
    private final Y94<C32054Bx0> configurationHelperProvider;
    private final Y94<HelpCenterProvider> helpCenterProvider;
    private final Y94<NetworkInfoProvider> networkInfoProvider;
    private final Y94<OkHttpClient> okHttpClientProvider;
    private final Y94<HelpCenterSettingsProvider> settingsProvider;

    public ViewArticleActivity_MembersInjector(Y94<OkHttpClient> y94, Y94<ApplicationConfiguration> y942, Y94<HelpCenterProvider> y943, Y94<ArticleVoteStorage> y944, Y94<NetworkInfoProvider> y945, Y94<HelpCenterSettingsProvider> y946, Y94<ActionHandlerRegistry> y947, Y94<C32054Bx0> y948) {
        this.okHttpClientProvider = y94;
        this.applicationConfigurationProvider = y942;
        this.helpCenterProvider = y943;
        this.articleVoteStorageProvider = y944;
        this.networkInfoProvider = y945;
        this.settingsProvider = y946;
        this.actionHandlerRegistryProvider = y947;
        this.configurationHelperProvider = y948;
    }

    public static MembersInjector<ViewArticleActivity> create(Y94<OkHttpClient> y94, Y94<ApplicationConfiguration> y942, Y94<HelpCenterProvider> y943, Y94<ArticleVoteStorage> y944, Y94<NetworkInfoProvider> y945, Y94<HelpCenterSettingsProvider> y946, Y94<ActionHandlerRegistry> y947, Y94<C32054Bx0> y948) {
        return new ViewArticleActivity_MembersInjector(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static void injectActionHandlerRegistry(ViewArticleActivity viewArticleActivity, ActionHandlerRegistry actionHandlerRegistry) {
        viewArticleActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectApplicationConfiguration(ViewArticleActivity viewArticleActivity, ApplicationConfiguration applicationConfiguration) {
        viewArticleActivity.applicationConfiguration = applicationConfiguration;
    }

    public static void injectArticleVoteStorage(ViewArticleActivity viewArticleActivity, ArticleVoteStorage articleVoteStorage) {
        viewArticleActivity.articleVoteStorage = articleVoteStorage;
    }

    public static void injectConfigurationHelper(ViewArticleActivity viewArticleActivity, C32054Bx0 c32054Bx0) {
        viewArticleActivity.configurationHelper = c32054Bx0;
    }

    public static void injectHelpCenterProvider(ViewArticleActivity viewArticleActivity, HelpCenterProvider helpCenterProvider) {
        viewArticleActivity.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(ViewArticleActivity viewArticleActivity, NetworkInfoProvider networkInfoProvider) {
        viewArticleActivity.networkInfoProvider = networkInfoProvider;
    }

    public static void injectOkHttpClient(ViewArticleActivity viewArticleActivity, OkHttpClient okHttpClient) {
        viewArticleActivity.okHttpClient = okHttpClient;
    }

    public static void injectSettingsProvider(ViewArticleActivity viewArticleActivity, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        viewArticleActivity.settingsProvider = helpCenterSettingsProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ViewArticleActivity viewArticleActivity) {
        injectOkHttpClient(viewArticleActivity, this.okHttpClientProvider.get());
        injectApplicationConfiguration(viewArticleActivity, this.applicationConfigurationProvider.get());
        injectHelpCenterProvider(viewArticleActivity, this.helpCenterProvider.get());
        injectArticleVoteStorage(viewArticleActivity, this.articleVoteStorageProvider.get());
        injectNetworkInfoProvider(viewArticleActivity, this.networkInfoProvider.get());
        injectSettingsProvider(viewArticleActivity, this.settingsProvider.get());
        injectActionHandlerRegistry(viewArticleActivity, this.actionHandlerRegistryProvider.get());
        injectConfigurationHelper(viewArticleActivity, this.configurationHelperProvider.get());
    }
}
