.class public interface abstract Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/vehiclescanner/common/mrp/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/vehiclescanner/common/mrp/a<",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0003H&J\u001c\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c0\u0003H&J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H&\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;",
        "Lco/bird/android/vehiclescanner/common/mrp/a;",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        "K1",
        "",
        "c1",
        "I2",
        "b8",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "A1",
        "Lkotlin/Pair;",
        "",
        "V",
        "z1",
        "W",
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
.method public abstract A1()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            ">;"
        }
    .end annotation
.end method

.method public abstract I2()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract K1()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/VehicleInventoryAction;",
            ">;"
        }
    .end annotation
.end method

.method public abstract V()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract W()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b8()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c1()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract z1()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method
