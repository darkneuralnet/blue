.class public interface abstract Llp2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Deprecated;
    message = "Do not use this manager any more. Implement scan() in RxBleVehicleManager"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "RxBleVehicleManager"
        imports = {}
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Llp2;",
        "",
        "Lco/bird/api/request/BLEScanTrigger;",
        "bleTrigger",
        "Lio/reactivex/k;",
        "Lco/bird/android/model/Vehicle;",
        "b",
        "vehicle",
        "Lio/reactivex/Observable;",
        "",
        "a",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/request/BLEScanTrigger;)Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/request/BLEScanTrigger;",
            ")",
            "Lio/reactivex/k<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end method
