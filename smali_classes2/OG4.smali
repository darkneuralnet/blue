.class public interface abstract LOG4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapBirdUi;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H&J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001c\u0010\u0011\u001a\u00020\u000c8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u000c8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0012\u0010\u000e\"\u0004\u0008\u0013\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "LOG4;",
        "Lco/bird/android/app/feature/map/ui/MapBirdUi;",
        "Lio/reactivex/Observable;",
        "Lcom/google/android/gms/maps/model/PolylineOptions;",
        "Od",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "Q5",
        "options",
        "LMX3;",
        "E1",
        "LDX3;",
        "c0",
        "",
        "getOverlayEnabled",
        "()Z",
        "wf",
        "(Z)V",
        "overlayEnabled",
        "getMapPanEnabled",
        "zj",
        "mapPanEnabled",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract E1(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;
.end method

.method public abstract Od()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/PolylineOptions;",
            ">;"
        }
    .end annotation
.end method

.method public abstract Q5()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/PolygonOptions;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c0(Lcom/google/android/gms/maps/model/PolygonOptions;)LDX3;
.end method

.method public abstract wf(Z)V
.end method

.method public abstract zj(Z)V
.end method
