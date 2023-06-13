.class Lzendesk/support/SupportSdkModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final MAX_DISK_CACHE_SIZE:I = 0x1400000


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configurationHelper()LBx0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LBx0;

    invoke-direct {v0}, LBx0;-><init>()V

    return-object v0
.end method

.method public mainThreadExecutor()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lzendesk/support/SupportSdkModule$1;

    invoke-direct {v0, p0}, Lzendesk/support/SupportSdkModule$1;-><init>(Lzendesk/support/SupportSdkModule;)V

    return-object v0
.end method

.method public okHttp3Downloader(Lokhttp3/OkHttpClient;)LKe3;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LKe3;

    invoke-direct {v0, p1}, LKe3;-><init>(Lokhttp3/OkHttpClient;)V

    return-object v0
.end method

.method public provides()LoE1;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LoE1;

    invoke-direct {v0}, LoE1;-><init>()V

    return-object v0
.end method

.method public providesActionHandlers()Ljava/util/List;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/core/ActionHandler;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lzendesk/support/DeepLinkToRequestActionHandler;

    invoke-direct {v1}, Lzendesk/support/DeepLinkToRequestActionHandler;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public providesPicasso(Landroid/content/Context;LKe3;Ljava/util/concurrent/ExecutorService;)LiT3;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LiT3$b;

    invoke-direct {v0, p1}, LiT3$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, LiT3$b;->c(Lb61;)LiT3$b;

    move-result-object p1

    invoke-virtual {p1, p3}, LiT3$b;->d(Ljava/util/concurrent/ExecutorService;)LiT3$b;

    move-result-object p1

    sget-object p2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, p2}, LiT3$b;->b(Landroid/graphics/Bitmap$Config;)LiT3$b;

    move-result-object p1

    invoke-virtual {p1}, LiT3$b;->a()LiT3;

    move-result-object p1

    return-object p1
.end method

.method public providesRequestDiskLruCache(Lzendesk/core/SessionStorage;)LF41;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-interface {p1}, Lzendesk/core/SessionStorage;->getZendeskDataDir()Ljava/io/File;

    move-result-object p1

    const-string v1, "request"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/32 v1, 0x1400000

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, v2}, LF41;->x(Ljava/io/File;IIJ)LF41;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public providesZendeskUrl(Lzendesk/core/ApplicationConfiguration;)Ljava/lang/String;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-virtual {p1}, Lzendesk/core/ApplicationConfiguration;->getZendeskUrl()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public requestInfoDataSource(Lzendesk/support/SupportUiStorage;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    new-instance v1, Lzendesk/support/requestlist/RequestInfoDataSource$Disk;

    const-string v2, "local_request_infos"

    invoke-direct {v1, p2, p3, p1, v2}, Lzendesk/support/requestlist/RequestInfoDataSource$Disk;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lzendesk/support/SupportUiStorage;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;-><init>(Lzendesk/support/requestlist/RequestInfoDataSource$Disk;)V

    return-object v0
.end method

.method public supportUiStorage(LF41;LoE1;)Lzendesk/support/SupportUiStorage;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lzendesk/support/SupportUiStorage;

    invoke-direct {v0, p1, p2}, Lzendesk/support/SupportUiStorage;-><init>(LF41;LoE1;)V

    return-object v0
.end method
