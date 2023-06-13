package zendesk.support;

import dagger.Module;
import dagger.Provides;
import java.util.UUID;
import okhttp3.OkHttpClient;
@Module
/* loaded from: classes8.dex */
public class GuideModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final HelpCenterBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;
    private final HelpCenterTracker helpCenterTracker;

    /* renamed from: id */
    private final UUID f121949id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final HelpCenterSettingsProvider settingsProvider;

    public GuideModule(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, HelpCenterTracker helpCenterTracker, ArticleVoteStorage articleVoteStorage, OkHttpClient okHttpClient) {
        this.helpCenterProvider = helpCenterProvider;
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterTracker = helpCenterTracker;
        this.articleVoteStorage = articleVoteStorage;
        this.okHttpClient = okHttpClient;
    }

    public UUID getId() {
        return this.f121949id;
    }

    @Provides
    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    @Provides
    public HelpCenterBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    @Provides
    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    @Provides
    public HelpCenterTracker providesHelpCenterTracker() {
        return this.helpCenterTracker;
    }

    @Provides
    public OkHttpClient providesOkHttpClient() {
        return this.okHttpClient;
    }

    @Provides
    public HelpCenterSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }
}
