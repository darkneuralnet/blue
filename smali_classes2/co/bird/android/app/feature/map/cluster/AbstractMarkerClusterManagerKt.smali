.class public final Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "contains",
        "",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "latLng",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "co.bird.android.feature.map"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManagerKt;->contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method

.method private static final contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method
