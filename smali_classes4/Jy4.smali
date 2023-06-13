.class public interface abstract LJy4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u0018\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'J\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000cH\'J$\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'J$\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u000f0\u000e0\u00122\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u000e0\u00122\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0015H\'\u00a8\u0006\u0018"
    }
    d2 = {
        "LJy4;",
        "",
        "Lco/bird/api/request/RepairBody;",
        "body",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/BirdRepair;",
        "g",
        "Lco/bird/api/request/SubmitRepairJobsBody;",
        "e",
        "",
        "birdId",
        "a",
        "Lco/bird/api/request/CloseRepairBody;",
        "d",
        "LHM4;",
        "",
        "Lco/bird/android/model/BirdProblem;",
        "c",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;",
        "b",
        "Lco/bird/api/request/ReplacePhysicalLockBody;",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "f",
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
        value = "repair/last"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdRepair;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "repair/all-physical-lock-replacement-types"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "repair/problems"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdProblem;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract d(Lco/bird/api/request/CloseRepairBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/CloseRepairBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "repair/close"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/CloseRepairBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdRepair;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/SubmitRepairJobsBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/SubmitRepairJobsBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "repair/job"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/SubmitRepairJobsBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdRepair;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/api/request/ReplacePhysicalLockBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/ReplacePhysicalLockBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "repair/replace-physical-lock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ReplacePhysicalLockBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g(Lco/bird/api/request/RepairBody;)Lio/reactivex/Observable;
    .param p1    # Lco/bird/api/request/RepairBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "repair"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/RepairBody;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/BirdRepair;",
            ">;"
        }
    .end annotation
.end method
