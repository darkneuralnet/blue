.class interface abstract Lzendesk/support/UploadService;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract deleteAttachment(Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "token"
        .end annotation
    .end param
    .annotation runtime LKF0;
        value = "/api/mobile/uploads/{token}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract uploadAttachment(Ljava/lang/String;Lokhttp3/RequestBody;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "filename"
        .end annotation
    .end param
    .param p2    # Lokhttp3/RequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/mobile/uploads.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lokhttp3/RequestBody;",
            ")",
            "Lx80<",
            "Lzendesk/support/UploadResponseWrapper;",
            ">;"
        }
    .end annotation
.end method
