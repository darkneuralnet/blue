.class public interface abstract LDB1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0007H\'\u00a8\u0006\n"
    }
    d2 = {
        "LDB1;",
        "",
        "Lco/bird/android/model/wire/WireRiderCellsRequest;",
        "request",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireRiderCellsResponse;",
        "a",
        "Lco/bird/android/model/wire/WireRiderZoneCellsRequest;",
        "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
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
.method public abstract a(Lco/bird/android/model/wire/WireRiderCellsRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/wire/WireRiderCellsRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "map/rider-cells"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRiderCellsRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireRiderCellsResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/android/model/wire/WireRiderZoneCellsRequest;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/wire/WireRiderZoneCellsRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "map/rider-zones-for-cells"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRiderZoneCellsRequest;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;",
            ">;"
        }
    .end annotation
.end method
