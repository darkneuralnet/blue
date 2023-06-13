.class public interface abstract LjZ5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\tH\'J\u0018\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u0018\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000f0\u000e2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\rH\'\u00a8\u0006\u0011"
    }
    d2 = {
        "LjZ5;",
        "",
        "Lco/bird/api/request/StartTaskBody;",
        "body",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/wire/WireBird;",
        "e",
        "Lco/bird/api/request/TaskIdBody;",
        "c",
        "Lco/bird/api/request/TaskIssueBody;",
        "f",
        "a",
        "d",
        "Lco/bird/api/request/TaskCancelRequestBody;",
        "Lio/reactivex/F;",
        "LHM4;",
        "b",
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
.method public abstract a(Lco/bird/api/request/TaskIdBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/TaskIdBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "task/repaired"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/TaskIdBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/TaskCancelRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/TaskCancelRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "task/cancel-request"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/TaskCancelRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/TaskIdBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/TaskIdBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "task/complete"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/TaskIdBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/TaskIdBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/TaskIdBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "task/escalate"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/TaskIdBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/StartTaskBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/StartTaskBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "task"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/StartTaskBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/TaskIssueBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/TaskIssueBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "task/issues"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/TaskIssueBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method
