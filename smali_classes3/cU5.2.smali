.class public final LcU5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/model/Point;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "b",
        "Lco/bird/android/model/wire/WireLocation;",
        "c",
        "LBj6;",
        "",
        "a",
        "suggest-a-nest_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LBj6;)Z
    .locals 1

    sget-object v0, LBj6;->b:LBj6;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic access$isValid(LBj6;)Z
    .locals 0

    invoke-static {p0}, LcU5;->a(LBj6;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    invoke-static {p0}, LcU5;->b(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toLatLng(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    invoke-static {p0}, LcU5;->c(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, p0, Lco/bird/android/model/Point;->y:D

    iget-wide v3, p0, Lco/bird/android/model/Point;->x:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method
