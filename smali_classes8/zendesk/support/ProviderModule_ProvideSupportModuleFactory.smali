.class public final Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/SupportModule;",
        ">;"
    }
.end annotation


# instance fields
.field private final articleVoteStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/ArticleVoteStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final blipsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final helpCenterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lzendesk/support/ProviderModule;

.field private final requestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final restServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final settingsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportSettingsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final uploadProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/UploadProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final zendeskTrackerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/ZendeskTracker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzendesk/support/ProviderModule;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/ProviderModule;",
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/UploadProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportSettingsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/ZendeskTracker;",
            ">;",
            "LY94<",
            "Lzendesk/support/ArticleVoteStorage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->module:Lzendesk/support/ProviderModule;

    iput-object p2, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->requestProvider:LY94;

    iput-object p3, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->uploadProvider:LY94;

    iput-object p4, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->helpCenterProvider:LY94;

    iput-object p5, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->settingsProvider:LY94;

    iput-object p6, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->restServiceProvider:LY94;

    iput-object p7, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->blipsProvider:LY94;

    iput-object p8, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->zendeskTrackerProvider:LY94;

    iput-object p9, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->articleVoteStorageProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/ProviderModule;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/ProviderModule;",
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/UploadProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportSettingsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/ZendeskTracker;",
            ">;",
            "LY94<",
            "Lzendesk/support/ArticleVoteStorage;",
            ">;)",
            "Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;"
        }
    .end annotation

    new-instance v10, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;-><init>(Lzendesk/support/ProviderModule;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static provideSupportModule(Lzendesk/support/ProviderModule;Lzendesk/support/RequestProvider;Lzendesk/support/UploadProvider;Lzendesk/support/HelpCenterProvider;Lzendesk/support/SupportSettingsProvider;Lzendesk/core/RestServiceProvider;Lzendesk/support/SupportBlipsProvider;Ljava/lang/Object;Lzendesk/support/ArticleVoteStorage;)Lzendesk/support/SupportModule;
    .locals 9

    move-object/from16 v7, p7

    check-cast v7, Lzendesk/support/ZendeskTracker;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lzendesk/support/ProviderModule;->provideSupportModule(Lzendesk/support/RequestProvider;Lzendesk/support/UploadProvider;Lzendesk/support/HelpCenterProvider;Lzendesk/support/SupportSettingsProvider;Lzendesk/core/RestServiceProvider;Lzendesk/support/SupportBlipsProvider;Lzendesk/support/ZendeskTracker;Lzendesk/support/ArticleVoteStorage;)Lzendesk/support/SupportModule;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/SupportModule;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->get()Lzendesk/support/SupportModule;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/SupportModule;
    .locals 9

    iget-object v0, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->module:Lzendesk/support/ProviderModule;

    iget-object v1, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->requestProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/support/RequestProvider;

    iget-object v2, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->uploadProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/support/UploadProvider;

    iget-object v3, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->helpCenterProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzendesk/support/HelpCenterProvider;

    iget-object v4, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->settingsProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzendesk/support/SupportSettingsProvider;

    iget-object v5, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->restServiceProvider:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzendesk/core/RestServiceProvider;

    iget-object v6, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->blipsProvider:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzendesk/support/SupportBlipsProvider;

    iget-object v7, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->zendeskTrackerProvider:LY94;

    invoke-interface {v7}, LY94;->get()Ljava/lang/Object;

    move-result-object v7

    iget-object v8, p0, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->articleVoteStorageProvider:LY94;

    invoke-interface {v8}, LY94;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lzendesk/support/ArticleVoteStorage;

    invoke-static/range {v0 .. v8}, Lzendesk/support/ProviderModule_ProvideSupportModuleFactory;->provideSupportModule(Lzendesk/support/ProviderModule;Lzendesk/support/RequestProvider;Lzendesk/support/UploadProvider;Lzendesk/support/HelpCenterProvider;Lzendesk/support/SupportSettingsProvider;Lzendesk/core/RestServiceProvider;Lzendesk/support/SupportBlipsProvider;Ljava/lang/Object;Lzendesk/support/ArticleVoteStorage;)Lzendesk/support/SupportModule;

    move-result-object v0

    return-object v0
.end method
