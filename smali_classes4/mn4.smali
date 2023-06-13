.class public interface abstract Lmn4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u00052\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\'J\u001e\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u00052\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\'J:\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00060\u00052\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\'J>\u0010\u0012\u001a,\u0012(\u0012&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00110\u00100\u00060\n0\u00052\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\'\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmn4;",
        "",
        "",
        "birdId",
        "role",
        "Lio/reactivex/F;",
        "",
        "d",
        "Lco/bird/api/request/ProgrammaticIssueBody;",
        "body",
        "LHM4;",
        "",
        "a",
        "",
        "locking",
        "b",
        "",
        "",
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
.method public abstract a(Lco/bird/api/request/ProgrammaticIssueBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/ProgrammaticIssueBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "rating/reliability-issue"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ProgrammaticIssueBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime LXc4;
            value = "locking"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "request_role"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "rating/physical-lock-issues"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "rating/vehicle-and-app-issues"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;>;>;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "request_role"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "rating/v2/issues"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method
