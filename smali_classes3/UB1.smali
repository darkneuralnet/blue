.class public final LUB1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "Lco/bird/android/model/wire/WireLocation;",
        "c",
        "Landroid/location/Location;",
        "a",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "b",
        "Lco/bird/android/model/wire/WireCoordinate;",
        "d",
        "extension_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGeolocation+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Geolocation+.kt\nco/bird/android/library/extension/Geolocation_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Landroid/location/Location;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/location/Location;

    const-string v1, ""

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getTime()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setTime(J)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getSpeed()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setSpeed(F)V

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getAltitude()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setAltitude(D)V

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getAccuracy()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setAccuracy(F)V

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getSource()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/location/Location;->setProvider(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireLocation;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getHeading()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getSpeed()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getAltitude()Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getAccuracy()Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getMocked()Z

    move-result v10

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getTime()Lorg/joda/time/DateTime;

    move-result-object v11

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getSource()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    move-object v12, p0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireCoordinate;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireCoordinate;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lco/bird/android/model/wire/WireCoordinate;-><init>(DD)V

    return-object v0
.end method
