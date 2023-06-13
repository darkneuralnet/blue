.class public interface abstract Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0008\u001a\u00020\u00032\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH&J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\u000cH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;",
        "",
        "clearWarehouseMarkers",
        "",
        "deselect",
        "warehouseMarker",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        "select",
        "setWarehouseMarkers",
        "warehouseMarkers",
        "",
        "warehouseMarkerClicks",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract clearWarehouseMarkers()V
.end method

.method public abstract deselect(Lco/bird/android/model/persistence/WarehouseMarker;)V
.end method

.method public abstract select(Lco/bird/android/model/persistence/WarehouseMarker;)V
.end method

.method public abstract setWarehouseMarkers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/WarehouseMarker;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract warehouseMarkerClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/WarehouseMarker;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end method
