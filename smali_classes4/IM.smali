.class public final LIM;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireOperatorBirdMapMarker;",
        "",
        "filterHash",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "a",
        "Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;",
        "b",
        "bird_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireOperatorBirdMapMarker;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdMapMarker;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterHash"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getBatteryLevel()I

    move-result v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    invoke-static {v1}, LqB0;->a(Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getFleetMarker()Lco/bird/android/model/wire/WireFleetMarker;

    move-result-object p0

    invoke-static {p0}, LqB0;->b(Lco/bird/android/model/wire/WireFleetMarker;)Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v6

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v8

    const-string p0, "now()"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    move-object v7, p1

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/persistence/BirdMapMarker;-><init>(Ljava/lang/String;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lco/bird/android/model/persistence/FleetMarker;Ljava/lang/String;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireOperatorBirdMapMarker;)Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getBatteryLevel()I

    move-result v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    invoke-static {v1}, LqB0;->a(Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getCode()Ljava/lang/String;

    move-result-object v5

    new-instance p0, Lco/bird/android/model/wire/WireBirdLabel;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1f

    const/4 v13, 0x0

    move-object v6, p0

    invoke-direct/range {v6 .. v13}, Lco/bird/android/model/wire/WireBirdLabel;-><init>(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, LZK;->b(Lco/bird/android/model/wire/WireBirdLabel;)Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;-><init>(Ljava/lang/String;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/BirdLabel;)V

    return-object v0
.end method
