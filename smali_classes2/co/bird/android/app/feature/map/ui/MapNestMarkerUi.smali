.class public interface abstract Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u000c0\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;",
        "",
        "claim",
        "",
        "nestMarker",
        "Lco/bird/android/model/persistence/NestMarker;",
        "claimProgress",
        "",
        "clearNestMarkers",
        "deselect",
        "nestMarkerClicks",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "",
        "select",
        "setNestArea",
        "nest",
        "Lco/bird/android/model/wire/WireNest;",
        "setNestMarkers",
        "nestMarkers",
        "",
        "unclaim",
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
.method public abstract claim(Lco/bird/android/model/persistence/NestMarker;I)V
.end method

.method public abstract clearNestMarkers()V
.end method

.method public abstract deselect(Lco/bird/android/model/persistence/NestMarker;)V
.end method

.method public abstract nestMarkerClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/NestMarker;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract select(Lco/bird/android/model/persistence/NestMarker;)V
.end method

.method public abstract setNestArea(Lco/bird/android/model/wire/WireNest;)V
.end method

.method public abstract setNestMarkers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract unclaim(Lco/bird/android/model/persistence/NestMarker;)V
.end method
