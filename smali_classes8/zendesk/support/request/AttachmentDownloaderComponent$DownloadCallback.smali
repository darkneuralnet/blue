.class Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;
.super LlI6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/AttachmentDownloaderComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DownloadCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LlI6<",
        "Lzendesk/belvedere/MediaResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final requestAttachment:Lzendesk/support/request/StateRequestAttachment;

.field final synthetic this$0:Lzendesk/support/request/AttachmentDownloaderComponent;


# direct methods
.method public constructor <init>(Lzendesk/support/request/AttachmentDownloaderComponent;Lzendesk/support/request/StateRequestAttachment;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;->this$0:Lzendesk/support/request/AttachmentDownloaderComponent;

    invoke-direct {p0}, LlI6;-><init>()V

    iput-object p2, p0, Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;->requestAttachment:Lzendesk/support/request/StateRequestAttachment;

    return-void
.end method


# virtual methods
.method public onError(Lsg1;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p1}, Lsg1;->c()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "RequestActivity"

    const-string v1, "Unable to download attachment. Error: %s"

    invoke-static {p1, v1, v0}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/belvedere/MediaResult;

    invoke-virtual {p0, p1}, Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;->onSuccess(Lzendesk/belvedere/MediaResult;)V

    return-void
.end method

.method public onSuccess(Lzendesk/belvedere/MediaResult;)V
    .locals 3

    iget-object v0, p0, Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;->this$0:Lzendesk/support/request/AttachmentDownloaderComponent;

    invoke-static {v0}, Lzendesk/support/request/AttachmentDownloaderComponent;->access$100(Lzendesk/support/request/AttachmentDownloaderComponent;)Lzendesk/support/suas/Dispatcher;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;->this$0:Lzendesk/support/request/AttachmentDownloaderComponent;

    invoke-static {v1}, Lzendesk/support/request/AttachmentDownloaderComponent;->access$000(Lzendesk/support/request/AttachmentDownloaderComponent;)Lzendesk/support/request/ActionFactory;

    move-result-object v1

    iget-object v2, p0, Lzendesk/support/request/AttachmentDownloaderComponent$DownloadCallback;->requestAttachment:Lzendesk/support/request/StateRequestAttachment;

    invoke-virtual {v1, v2, p1}, Lzendesk/support/request/ActionFactory;->attachmentDownloaded(Lzendesk/support/request/StateRequestAttachment;Lzendesk/belvedere/MediaResult;)Lzendesk/support/suas/Action;

    move-result-object p1

    invoke-interface {v0, p1}, Lzendesk/support/suas/Dispatcher;->dispatch(Lzendesk/support/suas/Action;)V

    return-void
.end method
