.class Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/AttachmentDownloadService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SaveToFileTask"
.end annotation


# instance fields
.field private final callback:LlI6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LlI6<",
            "Lzendesk/belvedere/MediaResult;",
            ">;"
        }
    .end annotation
.end field

.field private final destFile:Lzendesk/belvedere/MediaResult;

.field private final responseBody:Lokhttp3/ResponseBody;


# direct methods
.method private constructor <init>(Lokhttp3/ResponseBody;Lzendesk/belvedere/MediaResult;LlI6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/ResponseBody;",
            "Lzendesk/belvedere/MediaResult;",
            "LlI6<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->responseBody:Lokhttp3/ResponseBody;

    iput-object p2, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->destFile:Lzendesk/belvedere/MediaResult;

    iput-object p3, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->callback:LlI6;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/ResponseBody;Lzendesk/belvedere/MediaResult;LlI6;Lzendesk/support/request/AttachmentDownloadService$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;-><init>(Lokhttp3/ResponseBody;Lzendesk/belvedere/MediaResult;LlI6;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->destFile:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->c()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, LOe3;->f(Ljava/io/File;)LwB5;

    move-result-object v1

    invoke-static {v1}, LOe3;->c(LwB5;)Ln30;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->responseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v2}, Lokhttp3/ResponseBody;->source()Lo30;

    move-result-object v2

    invoke-interface {v1, v2}, Ln30;->R2(LAN5;)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v1}, Lzendesk/support/Streams;->closeQuietly(Ljava/io/Closeable;)V

    iget-object v1, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->responseBody:Lokhttp3/ResponseBody;

    invoke-static {v1}, Lzendesk/support/Streams;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    :goto_0
    :try_start_2
    const-string v2, "RequestActivity"

    const-string v3, "Unable to save attachment to disk. Error: \'%s\'"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Lug1;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lug1;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v1}, Lzendesk/support/Streams;->closeQuietly(Ljava/io/Closeable;)V

    iget-object v0, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->responseBody:Lokhttp3/ResponseBody;

    invoke-static {v0}, Lzendesk/support/Streams;->closeQuietly(Ljava/io/Closeable;)V

    move-object v0, v2

    :goto_1
    iget-object v1, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->callback:LlI6;

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    iget-object v0, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->destFile:Lzendesk/belvedere/MediaResult;

    invoke-virtual {v1, v0}, LlI6;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    invoke-virtual {v1, v0}, LlI6;->onError(Lsg1;)V

    :cond_1
    :goto_2
    return-void

    :catchall_1
    move-exception v0

    :goto_3
    invoke-static {v1}, Lzendesk/support/Streams;->closeQuietly(Ljava/io/Closeable;)V

    iget-object v1, p0, Lzendesk/support/request/AttachmentDownloadService$SaveToFileTask;->responseBody:Lokhttp3/ResponseBody;

    invoke-static {v1}, Lzendesk/support/Streams;->closeQuietly(Ljava/io/Closeable;)V

    throw v0
.end method
