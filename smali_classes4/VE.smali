.class public interface abstract LVE;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00080\u00042\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00042\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000bH\'J\u0018\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0010H\'\u00a8\u0006\u0012"
    }
    d2 = {
        "LVE;",
        "",
        "Lco/bird/api/request/BatchCreateRequestBody;",
        "body",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireBatch;",
        "c",
        "Lco/bird/api/request/BatchAddBirdsRequestBody;",
        "",
        "Lco/bird/api/response/BatchBird;",
        "e",
        "",
        "warehouseId",
        "d",
        "batchId",
        "a",
        "Lco/bird/api/request/BatchRemoveBirdRequestBody;",
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
.method public abstract a(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "batch_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "batch/birds"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/api/response/BatchBird;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/BatchRemoveBirdRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BatchRemoveBirdRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "batch/remove-bird"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BatchRemoveBirdRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/BatchBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/BatchCreateRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BatchCreateRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "batch/create"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BatchCreateRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireBatch;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LzH1;
            value = "Warehouse-Id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "batch/by-warehouse-id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBatch;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/api/request/BatchAddBirdsRequestBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/BatchAddBirdsRequestBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "batch/add-birds"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BatchAddBirdsRequestBody;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/api/response/BatchBird;",
            ">;>;"
        }
    .end annotation
.end method
