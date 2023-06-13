.class public final LDI6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "Lco/bird/android/model/Point;",
        "point",
        "",
        "a",
        "co.bird.android.lib.persistence.zone.api"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/Point;)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, p1, Lco/bird/android/model/Point;->y:D

    iget-wide v3, p1, Lco/bird/android/model/Point;->x:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$contains(Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/Point;)Z
    .locals 0

    invoke-static {p0, p1}, LDI6;->a(Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/Point;)Z

    move-result p0

    return p0
.end method
