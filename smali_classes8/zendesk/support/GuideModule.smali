.class public Lzendesk/support/GuideModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# instance fields
.field private final articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

.field private final blipsProvider:Lzendesk/support/HelpCenterBlipsProvider;

.field private final helpCenterProvider:Lzendesk/support/HelpCenterProvider;

.field private final helpCenterTracker:Lzendesk/support/HelpCenterTracker;

.field private final id:Ljava/util/UUID;

.field private final okHttpClient:Lokhttp3/OkHttpClient;

.field private final settingsProvider:Lzendesk/support/HelpCenterSettingsProvider;


# direct methods
.method public constructor <init>(Lzendesk/support/HelpCenterProvider;Lzendesk/support/HelpCenterSettingsProvider;Lzendesk/support/HelpCenterBlipsProvider;Lzendesk/support/HelpCenterTracker;Lzendesk/support/ArticleVoteStorage;Lokhttp3/OkHttpClient;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/GuideModule;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    iput-object p2, p0, Lzendesk/support/GuideModule;->settingsProvider:Lzendesk/support/HelpCenterSettingsProvider;

    iput-object p3, p0, Lzendesk/support/GuideModule;->blipsProvider:Lzendesk/support/HelpCenterBlipsProvider;

    iput-object p4, p0, Lzendesk/support/GuideModule;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    iput-object p5, p0, Lzendesk/support/GuideModule;->articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

    iput-object p6, p0, Lzendesk/support/GuideModule;->okHttpClient:Lokhttp3/OkHttpClient;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/GuideModule;->id:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lzendesk/support/GuideModule;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public providesArticleVoteStorage()Lzendesk/support/ArticleVoteStorage;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/GuideModule;->articleVoteStorage:Lzendesk/support/ArticleVoteStorage;

    return-object v0
.end method

.method public providesBlipsProvider()Lzendesk/support/HelpCenterBlipsProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/GuideModule;->blipsProvider:Lzendesk/support/HelpCenterBlipsProvider;

    return-object v0
.end method

.method public providesHelpCenterProvider()Lzendesk/support/HelpCenterProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/GuideModule;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    return-object v0
.end method

.method public providesHelpCenterTracker()Lzendesk/support/HelpCenterTracker;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/GuideModule;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    return-object v0
.end method

.method public providesOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/GuideModule;->okHttpClient:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public providesSettingsProvider()Lzendesk/support/HelpCenterSettingsProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lzendesk/support/GuideModule;->settingsProvider:Lzendesk/support/HelpCenterSettingsProvider;

    return-object v0
.end method
