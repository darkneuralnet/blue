.class Lzendesk/support/ZendeskUploadProvider$1;
.super Lzendesk/support/ZendeskCallbackSuccess;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskUploadProvider;->uploadAttachment(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzendesk/support/ZendeskCallbackSuccess<",
        "Lzendesk/support/UploadResponseWrapper;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/ZendeskUploadProvider;

.field final synthetic val$callback:LlI6;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskUploadProvider;LlI6;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskUploadProvider$1;->this$0:Lzendesk/support/ZendeskUploadProvider;

    iput-object p3, p0, Lzendesk/support/ZendeskUploadProvider$1;->val$callback:LlI6;

    invoke-direct {p0, p2}, Lzendesk/support/ZendeskCallbackSuccess;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/UploadResponseWrapper;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskUploadProvider$1;->onSuccess(Lzendesk/support/UploadResponseWrapper;)V

    return-void
.end method

.method public onSuccess(Lzendesk/support/UploadResponseWrapper;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/ZendeskUploadProvider$1;->val$callback:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lzendesk/support/UploadResponseWrapper;->getUpload()Lzendesk/support/UploadResponse;

    move-result-object p1

    invoke-virtual {v0, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
