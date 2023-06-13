.class Lzendesk/support/request/AttachmentDownloadService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/request/AttachmentDownloadService;->downloadAttachment(Ljava/lang/String;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/request/AttachmentDownloadService;

.field final synthetic val$callback:LlI6;


# direct methods
.method public constructor <init>(Lzendesk/support/request/AttachmentDownloadService;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/AttachmentDownloadService$1;->this$0:Lzendesk/support/request/AttachmentDownloadService;

    iput-object p2, p0, Lzendesk/support/request/AttachmentDownloadService$1;->val$callback:LlI6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 1

    iget-object p1, p0, Lzendesk/support/request/AttachmentDownloadService$1;->val$callback:LlI6;

    new-instance v0, Lug1;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lug1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LlI6;->onError(Lsg1;)V

    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p2}, Lokhttp3/Response;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/support/request/AttachmentDownloadService$1;->val$callback:LlI6;

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p2

    invoke-virtual {p1, p2}, LlI6;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/support/request/AttachmentDownloadService$1;->val$callback:LlI6;

    new-instance v0, Lug1;

    invoke-virtual {p2}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lug1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LlI6;->onError(Lsg1;)V

    :goto_0
    return-void
.end method
