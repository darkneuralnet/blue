.class public final Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;",
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

.field private final mainThreadExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lzendesk/support/SupportSdkModule;

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
.method public constructor <init>(Lzendesk/support/SupportSdkModule;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/SupportSdkModule;",
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
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

    iput-object p1, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->module:Lzendesk/support/SupportSdkModule;

    iput-object p2, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->supportUiStorageProvider:LY94;

    iput-object p3, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->mainThreadExecutorProvider:LY94;

    iput-object p4, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->backgroundThreadExecutorProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/SupportSdkModule;LY94;LY94;LY94;)Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/SupportSdkModule;",
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)",
            "Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;-><init>(Lzendesk/support/SupportSdkModule;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static requestInfoDataSource(Lzendesk/support/SupportSdkModule;Lzendesk/support/SupportUiStorage;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lzendesk/support/SupportSdkModule;->requestInfoDataSource(Lzendesk/support/SupportUiStorage;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->get()Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;
    .locals 4

    iget-object v0, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->module:Lzendesk/support/SupportSdkModule;

    iget-object v1, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->supportUiStorageProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/support/SupportUiStorage;

    iget-object v2, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->mainThreadExecutorProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->backgroundThreadExecutorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1, v2, v3}, Lzendesk/support/SupportSdkModule_RequestInfoDataSourceFactory;->requestInfoDataSource(Lzendesk/support/SupportSdkModule;Lzendesk/support/SupportUiStorage;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    move-result-object v0

    return-object v0
.end method
