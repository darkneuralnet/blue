.class public interface abstract LBt5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00030\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\nH\'J.\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00040\u00030\u00022\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000eH\'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00030\u00022\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0007H\'\u00a8\u0006\u0015"
    }
    d2 = {
        "LBt5;",
        "",
        "Lio/reactivex/F;",
        "LHM4;",
        "",
        "Lco/bird/android/model/wire/WireServiceCenterStatus;",
        "e",
        "",
        "birdId",
        "b",
        "Lco/bird/api/request/ServiceCenterEventBody;",
        "body",
        "",
        "c",
        "",
        "latitude",
        "longitude",
        "Lco/bird/android/model/Warehouse;",
        "d",
        "warehouseId",
        "a",
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
        .annotation runtime LdJ3;
            value = "warehouseId"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "warehouse/{warehouseId}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/Warehouse;",
            ">;>;"
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
        value = "service-center/status-for-bird"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/wire/WireServiceCenterStatus;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/api/request/ServiceCenterEventBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/request/ServiceCenterEventBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "service-center/event"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/ServiceCenterEventBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(DD)Lio/reactivex/F;
    .param p1    # D
        .annotation runtime LXc4;
            value = "latitude"
        .end annotation
    .end param
    .param p3    # D
        .annotation runtime LXc4;
            value = "longitude"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "service-center/nearby-warehouses"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Warehouse;",
            ">;>;>;"
        }
    .end annotation
.end method

.method public abstract e()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "service-center/statuses"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireServiceCenterStatus;",
            ">;>;>;"
        }
    .end annotation
.end method
