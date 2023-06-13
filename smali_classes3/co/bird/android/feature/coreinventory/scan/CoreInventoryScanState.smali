.class public interface abstract Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIx5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R(\u0010\u000c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u0082\u0001\u0005\u001e\u001f !\"\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        "LIx5;",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        "getAction",
        "()Lco/bird/android/model/constant/VehicleInventoryAction;",
        "action",
        "",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "",
        "l",
        "()Ljava/util/List;",
        "vehicleScans",
        "f",
        "()Z",
        "processEnabled",
        "",
        "a",
        "()Ljava/lang/String;",
        "warehouse",
        "",
        "m",
        "()I",
        "loadingCount",
        "b",
        "unprocessedCount",
        "",
        "getError",
        "()Ljava/lang/Throwable;",
        "error",
        "Lco/bird/android/feature/coreinventory/scan/AlertDisabledEmpty;",
        "Lco/bird/android/feature/coreinventory/scan/AlertDisabledError;",
        "Lco/bird/android/feature/coreinventory/scan/ConfirmExit;",
        "Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;",
        "Lco/bird/android/feature/coreinventory/scan/UpdateUi;",
        "core-inventory_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()I
.end method

.method public abstract f()Z
.end method

.method public abstract getAction()Lco/bird/android/model/constant/VehicleInventoryAction;
.end method

.method public abstract getError()Ljava/lang/Throwable;
.end method

.method public abstract l()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract m()I
.end method
