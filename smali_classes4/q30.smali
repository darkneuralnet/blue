.class public interface abstract Lq30;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0008H\'J,\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000fH\'\u00a8\u0006\u0012"
    }
    d2 = {
        "Lq30;",
        "",
        "Lco/bird/api/request/BugReportNewRequestBody;",
        "body",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/response/BugReportNewResponse;",
        "a",
        "Lco/bird/api/request/BugReportUpdateFileBody;",
        "Lco/bird/api/response/BugReportUpdateFileResponse;",
        "b",
        "",
        "fileId",
        "",
        "length",
        "Lokhttp3/RequestBody;",
        "requestBody",
        "c",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Lco/bird/api/request/BugReportNewRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BugReportNewRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bugreport/new"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BugReportNewRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/BugReportNewResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/BugReportUpdateFileBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BugReportUpdateFileBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "bugreport/update_file"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BugReportUpdateFileBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/BugReportUpdateFileResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;ILokhttp3/RequestBody;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "file_id"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LXc4;
            value = "length"
        .end annotation
    .end param
    .param p3    # Lokhttp3/RequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "bugreport/upload-file"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lokhttp3/RequestBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/BugReportUpdateFileResponse;",
            ">;"
        }
    .end annotation
.end method
