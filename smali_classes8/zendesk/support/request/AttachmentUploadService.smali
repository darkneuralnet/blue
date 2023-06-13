.class Lzendesk/support/request/AttachmentUploadService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/AttachmentUploadService$AttachmentUploadResult;,
        Lzendesk/support/request/AttachmentUploadService$AttachmentsCallback;,
        Lzendesk/support/request/AttachmentUploadService$ResolveCallback;
    }
.end annotation


# instance fields
.field private final belvedere:Lzendesk/belvedere/a;

.field private final errorItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field

.field private final itemsForUpload:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field

.field private final localToRemoteMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private final processedItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field

.field private resolveCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/request/AttachmentUploadService$ResolveCallback;",
            ">;"
        }
    .end annotation
.end field

.field private resultListener:LlI6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LlI6<",
            "Lzendesk/support/request/AttachmentUploadService$AttachmentUploadResult;",
            ">;"
        }
    .end annotation
.end field

.field private subDirectory:Ljava/lang/String;

.field private final uploadProvider:Lzendesk/support/UploadProvider;


# direct methods
.method public constructor <init>(Lzendesk/support/UploadProvider;Lzendesk/belvedere/a;Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseSparseArrays"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/UploadProvider;",
            "Lzendesk/belvedere/a;",
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->lock:Ljava/lang/Object;

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->uploadProvider:Lzendesk/support/UploadProvider;

    iput-object p2, p0, Lzendesk/support/request/AttachmentUploadService;->belvedere:Lzendesk/belvedere/a;

    iput-object p3, p0, Lzendesk/support/request/AttachmentUploadService;->itemsForUpload:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->resolveCallbacks:Ljava/util/List;

    invoke-static {}, Lzendesk/support/request/UtilsAttachment;->getTemporaryRequestCacheDir()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->subDirectory:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->processedItems:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->errorItems:Ljava/util/List;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->localToRemoteMap:Ljava/util/Map;

    return-void
.end method

.method public static synthetic access$100(Lzendesk/support/request/AttachmentUploadService;)Z
    .locals 0

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->isUploadFinished()Z

    move-result p0

    return p0
.end method

.method public static synthetic access$200(Lzendesk/support/request/AttachmentUploadService;Lzendesk/support/request/StateRequestAttachment;Lzendesk/belvedere/MediaResult;)Lzendesk/support/request/StateRequestAttachment;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/support/request/AttachmentUploadService;->updateRequestAttachment(Lzendesk/support/request/StateRequestAttachment;Lzendesk/belvedere/MediaResult;)Lzendesk/support/request/StateRequestAttachment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$300(Lzendesk/support/request/AttachmentUploadService;)Lzendesk/support/UploadProvider;
    .locals 0

    iget-object p0, p0, Lzendesk/support/request/AttachmentUploadService;->uploadProvider:Lzendesk/support/UploadProvider;

    return-object p0
.end method

.method public static synthetic access$400(Lzendesk/support/request/AttachmentUploadService;Lzendesk/support/request/StateRequestAttachment;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/request/AttachmentUploadService;->errorUpload(Lzendesk/support/request/StateRequestAttachment;)V

    return-void
.end method

.method public static synthetic access$500(Lzendesk/support/request/AttachmentUploadService;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lzendesk/support/request/AttachmentUploadService;->localToRemoteMap:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic access$600(Lzendesk/support/request/AttachmentUploadService;Lzendesk/support/request/StateRequestAttachment;Lzendesk/support/UploadResponse;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/support/request/AttachmentUploadService;->uploadSuccess(Lzendesk/support/request/StateRequestAttachment;Lzendesk/support/UploadResponse;)V

    return-void
.end method

.method private errorUpload(Lzendesk/support/request/StateRequestAttachment;)V
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzendesk/support/request/AttachmentUploadService;->errorItems:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->notifyIfFinished()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private isUploadFinished()Z
    .locals 6

    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzendesk/support/request/AttachmentUploadService;->errorItems:Ljava/util/List;

    invoke-static {v1}, Ljm0;->i(Ljava/util/Collection;)Z

    move-result v1

    iget-object v2, p0, Lzendesk/support/request/AttachmentUploadService;->processedItems:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Lzendesk/support/request/AttachmentUploadService;->itemsForUpload:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    if-nez v1, :cond_2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v4, v5

    :cond_2
    :goto_1
    monitor-exit v0

    return v4

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private notifyIfFinished()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lzendesk/support/request/AttachmentUploadService;->resultListener:LlI6;

    aput-object v2, v0, v1

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->isUploadFinished()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "RequestActivity"

    const-string v2, "Notify if finished. Listener: %s, isUploadFinished: %s"

    invoke-static {v1, v2, v0}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->isUploadFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->resultListener:LlI6;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->errorItems:Ljava/util/List;

    invoke-static {v0}, Ljm0;->g(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->resultListener:LlI6;

    new-instance v1, Lzendesk/support/request/AttachmentUploadService$AttachmentUploadResult;

    iget-object v2, p0, Lzendesk/support/request/AttachmentUploadService;->processedItems:Ljava/util/List;

    invoke-static {v2}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lzendesk/support/request/AttachmentUploadService;->localToRemoteMap:Ljava/util/Map;

    invoke-direct {v1, v2, v3}, Lzendesk/support/request/AttachmentUploadService$AttachmentUploadResult;-><init>(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->resultListener:LlI6;

    new-instance v1, Lug1;

    const-string v2, "Error uploading attachments."

    invoke-direct {v1, v2}, Lug1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LlI6;->onError(Lsg1;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->resultListener:LlI6;

    :cond_1
    return-void
.end method

.method private renameFile(Ljava/io/File;J)Lzendesk/belvedere/MediaResult;
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->belvedere:Lzendesk/belvedere/a;

    iget-object v1, p0, Lzendesk/support/request/AttachmentUploadService;->subDirectory:Ljava/lang/String;

    invoke-static {v1, p2, p3}, Lzendesk/support/request/UtilsAttachment;->getAttachmentSubDir(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p2, p3}, Lzendesk/belvedere/a;->d(Ljava/lang/String;Ljava/lang/String;)Lzendesk/belvedere/MediaResult;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p3, v0

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->c()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p3, v1

    const-string v0, "RequestActivity"

    const-string v1, "Rename local file: %s -> %s"

    invoke-static {v0, v1, p3}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->c()Ljava/io/File;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method private updateRequestAttachment(Lzendesk/support/request/StateRequestAttachment;Lzendesk/belvedere/MediaResult;)Lzendesk/support/request/StateRequestAttachment;
    .locals 1

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->newBuilder()Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->c()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1, v0}, Lzendesk/support/request/StateRequestAttachment$Builder;->setLocalFile(Ljava/io/File;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lzendesk/support/request/StateRequestAttachment$Builder;->setName(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lzendesk/support/request/StateRequestAttachment$Builder;->setMimeType(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lzendesk/belvedere/MediaResult;->j()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lzendesk/support/request/StateRequestAttachment$Builder;->setLocalUri(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment$Builder;->build()Lzendesk/support/request/StateRequestAttachment;

    move-result-object p1

    return-object p1
.end method

.method private uploadAttachment(Lzendesk/support/request/StateRequestAttachment;)V
    .locals 3

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->getParsedLocalUri()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->isUploadFinished()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lzendesk/support/request/AttachmentUploadService$ResolveCallback;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzendesk/support/request/AttachmentUploadService$ResolveCallback;-><init>(Lzendesk/support/request/AttachmentUploadService;Lzendesk/support/request/StateRequestAttachment;Lzendesk/support/request/AttachmentUploadService$1;)V

    iget-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->resolveCallbacks:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->belvedere:Lzendesk/belvedere/a;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lzendesk/support/request/AttachmentUploadService;->subDirectory:Ljava/lang/String;

    invoke-virtual {p1, v0, v2, v1}, Lzendesk/belvedere/a;->h(Ljava/util/List;Ljava/lang/String;LG80;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->getLocalUri()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "RequestActivity"

    const-string v2, "Unable to parse uri, skipping. | %s"

    invoke-static {v1, v2, v0}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lzendesk/support/request/AttachmentUploadService;->errorUpload(Lzendesk/support/request/StateRequestAttachment;)V

    :goto_0
    return-void
.end method

.method private uploadSuccess(Lzendesk/support/request/StateRequestAttachment;Lzendesk/support/UploadResponse;)V
    .locals 4

    invoke-virtual {p2}, Lzendesk/support/UploadResponse;->getAttachment()Lzendesk/support/Attachment;

    move-result-object v0

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->getLocalFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0}, Lzendesk/support/Attachment;->getId()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lzendesk/support/request/AttachmentUploadService;->renameFile(Ljava/io/File;J)Lzendesk/belvedere/MediaResult;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->j()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->c()Ljava/io/File;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->getLocalUri()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->getLocalFile()Ljava/io/File;

    move-result-object v1

    :goto_0
    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment;->newBuilder()Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lzendesk/support/request/StateRequestAttachment$Builder;->setLocalUri(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lzendesk/support/request/StateRequestAttachment$Builder;->setLocalFile(Ljava/io/File;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lzendesk/support/UploadResponse;->getToken()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lzendesk/support/request/StateRequestAttachment$Builder;->setToken(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {v0}, Lzendesk/support/Attachment;->getContentUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lzendesk/support/request/StateRequestAttachment$Builder;->setUrl(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {v0}, Lzendesk/support/Attachment;->getContentType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lzendesk/support/request/StateRequestAttachment$Builder;->setMimeType(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {v0}, Lzendesk/support/Attachment;->getFileName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lzendesk/support/request/StateRequestAttachment$Builder;->setName(Ljava/lang/String;)Lzendesk/support/request/StateRequestAttachment$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/request/StateRequestAttachment$Builder;->build()Lzendesk/support/request/StateRequestAttachment;

    move-result-object p1

    iget-object p2, p0, Lzendesk/support/request/AttachmentUploadService;->lock:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lzendesk/support/request/AttachmentUploadService;->processedItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->notifyIfFinished()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public setResultListener(LlI6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlI6<",
            "Lzendesk/support/request/AttachmentUploadService$AttachmentUploadResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->resultListener:LlI6;

    invoke-direct {p0}, Lzendesk/support/request/AttachmentUploadService;->notifyIfFinished()V

    return-void
.end method

.method public start(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, LlS5;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lzendesk/support/request/UtilsAttachment;->getCacheDirForRequestId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->subDirectory:Ljava/lang/String;

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "RequestActivity"

    const-string v1, "Start uploading attachments"

    invoke-static {v0, v1, p1}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lzendesk/support/request/AttachmentUploadService;->itemsForUpload:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/request/StateRequestAttachment;

    invoke-direct {p0, v0}, Lzendesk/support/request/AttachmentUploadService;->uploadAttachment(Lzendesk/support/request/StateRequestAttachment;)V

    goto :goto_0

    :cond_1
    return-void
.end method
