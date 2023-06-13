.class Lzendesk/support/ZendeskUploadService;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ZendeskUploadService"


# instance fields
.field private final uploadService:Lzendesk/support/UploadService;


# direct methods
.method public constructor <init>(Lzendesk/support/UploadService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/ZendeskUploadService;->uploadService:Lzendesk/support/UploadService;

    return-void
.end method


# virtual methods
.method public deleteAttachment(Ljava/lang/String;LlI6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LlI6<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/ZendeskUploadService;->uploadService:Lzendesk/support/UploadService;

    invoke-interface {v0, p1}, Lzendesk/support/UploadService;->deleteAttachment(Ljava/lang/String;)Lx80;

    move-result-object p1

    new-instance v0, LON4;

    invoke-direct {v0, p2}, LON4;-><init>(LlI6;)V

    invoke-interface {p1, v0}, Lx80;->E0(LH80;)V

    return-void
.end method

.method public uploadAttachment(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;LlI6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "LlI6<",
            "Lzendesk/support/UploadResponseWrapper;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/ZendeskUploadService;->uploadService:Lzendesk/support/UploadService;

    invoke-static {p3}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object p3

    invoke-static {p3, p2}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lzendesk/support/UploadService;->uploadAttachment(Ljava/lang/String;Lokhttp3/RequestBody;)Lx80;

    move-result-object p1

    new-instance p2, LON4;

    invoke-direct {p2, p4}, LON4;-><init>(LlI6;)V

    invoke-interface {p1, p2}, Lx80;->E0(LH80;)V

    return-void
.end method
