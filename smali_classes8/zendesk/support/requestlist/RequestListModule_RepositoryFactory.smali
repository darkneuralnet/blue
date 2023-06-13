.class public final Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/requestlist/RequestInfoDataSource$Repository;",
        ">;"
    }
.end annotation


# instance fields
.field private final backgroundThreadExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private final localDataSourceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final mainThreadExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final requestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final supportUiStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->localDataSourceProvider:LY94;

    iput-object p2, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->supportUiStorageProvider:LY94;

    iput-object p3, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->requestProvider:LY94;

    iput-object p4, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->mainThreadExecutorProvider:LY94;

    iput-object p5, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->backgroundThreadExecutorProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)",
            "Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;"
        }
    .end annotation

    new-instance v6, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static repository(Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;Lzendesk/support/SupportUiStorage;Lzendesk/support/RequestProvider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$Repository;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzendesk/support/requestlist/RequestListModule;->repository(Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;Lzendesk/support/SupportUiStorage;Lzendesk/support/RequestProvider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$Repository;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->get()Lzendesk/support/requestlist/RequestInfoDataSource$Repository;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/requestlist/RequestInfoDataSource$Repository;
    .locals 5

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->localDataSourceProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    iget-object v1, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->supportUiStorageProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/support/SupportUiStorage;

    iget-object v2, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->requestProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/support/RequestProvider;

    iget-object v3, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->mainThreadExecutorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->backgroundThreadExecutorProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lzendesk/support/requestlist/RequestListModule_RepositoryFactory;->repository(Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;Lzendesk/support/SupportUiStorage;Lzendesk/support/RequestProvider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$Repository;

    move-result-object v0

    return-object v0
.end method
