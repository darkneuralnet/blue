.class public final Lco/bird/android/model/analytics/RideCompleted;
.super Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/analytics/RecurrentNthEvent;
.implements Lco/bird/android/model/analytics/UserPropertyProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0008\u0010\u000e\u001a\u00020\u0005H\u0016J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/model/analytics/RideCompleted;",
        "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;",
        "Lco/bird/android/model/analytics/RecurrentNthEvent;",
        "Lco/bird/android/model/analytics/UserPropertyProvider;",
        "birdModel",
        "",
        "lat",
        "",
        "lon",
        "ride",
        "Lco/bird/android/model/wire/WireRide;",
        "ridePrice",
        "Lco/bird/android/model/wire/WireRidePrice;",
        "(Ljava/lang/String;DDLco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRidePrice;)V",
        "brazeKey",
        "charge",
        "()Ljava/lang/Double;",
        "getUserProperty",
        "Lco/bird/android/model/analytics/PersistentPropertyEntry;",
        "increment",
        "",
        "nthEvent",
        "count",
        "",
        "model-analytics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final ride:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(Ljava/lang/String;DDLco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRidePrice;)V
    .locals 3

    const-string v0, "ride"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ridePrice"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/analytics/Type;->RIDE_COMPLETED:Lco/bird/android/model/analytics/Type;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;-><init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p6, p0, Lco/bird/android/model/analytics/RideCompleted;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result v1

    invoke-static {v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$minutes(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Minutes"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v1

    invoke-static {v1, v2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$miles(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "Miles"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getCost()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$dollars(J)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "Dollars"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "birdModel"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p2

    const-string p3, "latitude"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p2

    const-string p3, "longitude"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getCost()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "total_price"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const-string p3, "distance"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "duration"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    const-string p2, "ride_id"

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getPartnerId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "partner_id"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$toString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "start_time"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getCompletedAt()Lorg/joda/time/DateTime;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-virtual {p6}, Lco/bird/android/model/wire/WireRide;->getCanceledAt()Lorg/joda/time/DateTime;

    move-result-object p2

    :cond_0
    invoke-static {p2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$toString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "end_time"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1, p7}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$addRidePrice(Ljava/util/Map;Lco/bird/android/model/wire/WireRidePrice;)V

    return-void
.end method


# virtual methods
.method public brazeKey()Ljava/lang/String;
    .locals 1

    const-string v0, "mobile_ride_complete"

    return-object v0
.end method

.method public charge()Ljava/lang/Double;
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/analytics/RideCompleted;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getCost()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$dollars(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getUserProperty()Lco/bird/android/model/analytics/PersistentPropertyEntry;
    .locals 1

    new-instance v0, Lco/bird/android/model/analytics/LastRideDate;

    invoke-direct {v0}, Lco/bird/android/model/analytics/LastRideDate;-><init>()V

    return-object v0
.end method

.method public increment()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    iget-object v1, p0, Lco/bird/android/model/analytics/RideCompleted;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result v1

    invoke-static {v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$minutes(I)I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "Total Ride Minutes"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lco/bird/android/model/analytics/RideCompleted;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v1

    invoke-static {v1, v2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$miles(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "Total Ride Miles"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lco/bird/android/model/analytics/RideCompleted;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getCost()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$dollars(J)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "Total Ride Dollars"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public nthEvent(I)Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lco/bird/android/model/analytics/TenthRide;

    invoke-direct {p1}, Lco/bird/android/model/analytics/TenthRide;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p1, Lco/bird/android/model/analytics/ThirdRide;

    invoke-direct {p1}, Lco/bird/android/model/analytics/ThirdRide;-><init>()V

    goto :goto_0

    :cond_2
    new-instance p1, Lco/bird/android/model/analytics/SecondRide;

    invoke-direct {p1}, Lco/bird/android/model/analytics/SecondRide;-><init>()V

    goto :goto_0

    :cond_3
    new-instance p1, Lco/bird/android/model/analytics/FirstRide;

    invoke-direct {p1}, Lco/bird/android/model/analytics/FirstRide;-><init>()V

    :goto_0
    return-object p1
.end method
