.class public interface abstract LI32;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\u0018\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\nH\'J\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u000cH\'\u00a8\u0006\u000e"
    }
    d2 = {
        "LI32;",
        "",
        "",
        "birdId",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/BirdInspection;",
        "a",
        "Lco/bird/api/request/InspectBody;",
        "body",
        "c",
        "Lco/bird/api/request/SubmitInspectionJobsBody;",
        "d",
        "Lco/bird/api/request/CloseInspectionBody;",
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
.method public abstract a(Ljava/lang/String;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "inspection/last"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdInspection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/CloseInspectionBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/CloseInspectionBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "inspection/close"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CloseInspectionBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdInspection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/InspectBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/InspectBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "inspection"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/InspectBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdInspection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/SubmitInspectionJobsBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/SubmitInspectionJobsBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "inspection/job"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/SubmitInspectionJobsBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdInspection;",
            ">;"
        }
    .end annotation
.end method
