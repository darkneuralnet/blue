.class public final Lzendesk/support/requestlist/RequestListModule_ModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/requestlist/RequestListModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final blipsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final memoryCacheProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lzendesk/support/requestlist/RequestListModule;

.field private final requestInfoDataSourceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/requestlist/RequestInfoDataSource$Repository;",
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


# direct methods
.method public constructor <init>(Lzendesk/support/requestlist/RequestListModule;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/requestlist/RequestListModule;",
            "LY94<",
            "Lzendesk/support/requestlist/RequestInfoDataSource$Repository;",
            ">;",
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportSettingsProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->module:Lzendesk/support/requestlist/RequestListModule;

    iput-object p2, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->requestInfoDataSourceProvider:LY94;

    iput-object p3, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->memoryCacheProvider:LY94;

    iput-object p4, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->blipsProvider:LY94;

    iput-object p5, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->settingsProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/requestlist/RequestListModule;LY94;LY94;LY94;LY94;)Lzendesk/support/requestlist/RequestListModule_ModelFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/requestlist/RequestListModule;",
            "LY94<",
            "Lzendesk/support/requestlist/RequestInfoDataSource$Repository;",
            ">;",
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportSettingsProvider;",
            ">;)",
            "Lzendesk/support/requestlist/RequestListModule_ModelFactory;"
        }
    .end annotation

    new-instance v6, Lzendesk/support/requestlist/RequestListModule_ModelFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lzendesk/support/requestlist/RequestListModule_ModelFactory;-><init>(Lzendesk/support/requestlist/RequestListModule;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static model(Lzendesk/support/requestlist/RequestListModule;Lzendesk/support/requestlist/RequestInfoDataSource$Repository;Lzendesk/core/MemoryCache;Lzendesk/support/SupportBlipsProvider;Lzendesk/support/SupportSettingsProvider;)Lzendesk/support/requestlist/RequestListModel;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lzendesk/support/requestlist/RequestListModule;->model(Lzendesk/support/requestlist/RequestInfoDataSource$Repository;Lzendesk/core/MemoryCache;Lzendesk/support/SupportBlipsProvider;Lzendesk/support/SupportSettingsProvider;)Lzendesk/support/requestlist/RequestListModel;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/requestlist/RequestListModel;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->get()Lzendesk/support/requestlist/RequestListModel;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/requestlist/RequestListModel;
    .locals 5

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->module:Lzendesk/support/requestlist/RequestListModule;

    iget-object v1, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->requestInfoDataSourceProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/support/requestlist/RequestInfoDataSource$Repository;

    iget-object v2, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->memoryCacheProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/core/MemoryCache;

    iget-object v3, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->blipsProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzendesk/support/SupportBlipsProvider;

    iget-object v4, p0, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->settingsProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzendesk/support/SupportSettingsProvider;

    invoke-static {v0, v1, v2, v3, v4}, Lzendesk/support/requestlist/RequestListModule_ModelFactory;->model(Lzendesk/support/requestlist/RequestListModule;Lzendesk/support/requestlist/RequestInfoDataSource$Repository;Lzendesk/core/MemoryCache;Lzendesk/support/SupportBlipsProvider;Lzendesk/support/SupportSettingsProvider;)Lzendesk/support/requestlist/RequestListModel;

    move-result-object v0

    return-object v0
.end method
