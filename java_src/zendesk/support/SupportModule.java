package zendesk.support;

import dagger.Module;
import dagger.Provides;
import java.util.UUID;
import okhttp3.OkHttpClient;
@Module
/* loaded from: classes8.dex */
public class SupportModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final SupportBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;

    /* renamed from: id */
    private final UUID f121959id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final RequestProvider requestProvider;
    private final SupportSettingsProvider settingsProvider;
    private final UploadProvider uploadProvider;
    private final ZendeskTracker zendeskTracker;

    public SupportModule(RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, OkHttpClient okHttpClient, ZendeskTracker zendeskTracker, ArticleVoteStorage articleVoteStorage) {
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
        this.helpCenterProvider = helpCenterProvider;
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.okHttpClient = okHttpClient;
        this.zendeskTracker = zendeskTracker;
        this.articleVoteStorage = articleVoteStorage;
    }

    public UUID getId() {
        return this.f121959id;
    }

    @Provides
    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    @Provides
    public SupportBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    @Provides
    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    @Provides
    public OkHttpClient providesOkHttpClient() {
        return this.okHttpClient;
    }

    @Provides
    public RequestProvider providesRequestProvider() {
        return this.requestProvider;
    }

    @Provides
    public SupportSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }

    @Provides
    public UploadProvider providesUploadProvider() {
        return this.uploadProvider;
    }

    @Provides
    public ZendeskTracker providesZendeskTracker() {
        return this.zendeskTracker;
    }
}
