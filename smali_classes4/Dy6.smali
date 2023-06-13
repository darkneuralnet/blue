.class public interface abstract LDy6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00050\u0004H\'\u00a8\u0006\n"
    }
    d2 = {
        "LDy6;",
        "",
        "",
        "warehouseId",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/android/model/Warehouse;",
        "a",
        "Lco/bird/api/response/WarehouseValidationResponse;",
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
            value = "warehouse_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "warehouse/by-id"
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

.method public abstract b()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "warehouse/validate-user-location"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/WarehouseValidationResponse;",
            ">;>;"
        }
    .end annotation
.end method
