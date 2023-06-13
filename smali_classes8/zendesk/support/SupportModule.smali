.class public Lzendesk/support/SupportModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# instance fields
.field private final articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

.field private final blipsProvider:Lzendesk/support/SupportBlipsProvider;

.field private final helpCenterProvider:Lzendesk/support/HelpCenterProvider;

.field private final id:Ljava/util/UUID;

.field private final okHttpClient:Lokhttp3/OkHttpClient;

.field private final requestProvider:Lzendesk/support/RequestProvider;

.field private final settingsProvider:Lzendesk/support/SupportSettingsProvider;

.field private final uploadProvider:Lzendesk/support/UploadProvider;

.field private final zendeskTracker:Lzendesk/support/ZendeskTracker;


# direct methods
.method public constructor <init>(Lzendesk/support/RequestProvider;Lzendesk/support/UploadProvider;Lzendesk/support/HelpCenterProvider;Lzendesk/support/SupportSettingsProvider;Lzendesk/support/SupportBlipsProvider;Lokhttp3/OkHttpClient;Lzendesk/support/ZendeskTracker;Lzendesk/support/ArticleVoteStorage;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/SupportModule;->id:Ljava/util/UUID;

    iput-object p1, p0, Lzendesk/support/SupportModule;->requestProvider:Lzendesk/support/RequestProvider;

    iput-object p2, p0, Lzendesk/support/SupportModule;->uploadProvider:Lzendesk/support/UploadProvider;

    iput-object p3, p0, Lzendesk/support/SupportModule;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    iput-object p4, p0, Lzendesk/support/SupportModule;->settingsProvider:Lzendesk/support/SupportSettingsProvider;

    iput-object p5, p0, Lzendesk/support/SupportModule;->blipsProvider:Lzendesk/support/SupportBlipsProvider;

    iput-object p6, p0, Lzendesk/support/SupportModule;->okHttpClient:Lokhttp3/OkHttpClient;

    iput-object p7, p0, Lzendesk/support/SupportModule;->zendeskTracker:Lzendesk/support/ZendeskTracker;

    iput-object p8, p0, Lzendesk/support/SupportModule;->articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

    return-void
.end method


# virtual methods
.method public getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SupportModule;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public providesArticleVoteStorage()Lzendesk/support/ArticleVoteStorage;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

    return-object v0
.end method

.method public providesBlipsProvider()Lzendesk/support/SupportBlipsProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->blipsProvider:Lzendesk/support/SupportBlipsProvider;

    return-object v0
.end method

.method public providesHelpCenterProvider()Lzendesk/support/HelpCenterProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    return-object v0
.end method

.method public providesOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->okHttpClient:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public providesRequestProvider()Lzendesk/support/RequestProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->requestProvider:Lzendesk/support/RequestProvider;

    return-object v0
.end method

.method public providesSettingsProvider()Lzendesk/support/SupportSettingsProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->settingsProvider:Lzendesk/support/SupportSettingsProvider;

    return-object v0
.end method

.method public providesUploadProvider()Lzendesk/support/UploadProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->uploadProvider:Lzendesk/support/UploadProvider;

    return-object v0
.end method

.method public providesZendeskTracker()Lzendesk/support/ZendeskTracker;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/SupportModule;->zendeskTracker:Lzendesk/support/ZendeskTracker;

    return-object v0
.end method
