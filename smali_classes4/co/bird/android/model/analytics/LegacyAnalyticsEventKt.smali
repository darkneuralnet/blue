.class public final Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u001a \u0010\t\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a \u0010\u0010\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a \u0010\u0013\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a \u0010\u0016\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u000e\u0010\u0019\u001a\u00020\u000c*\u0004\u0018\u00010\u001aH\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "dollars",
        "",
        "cents",
        "",
        "miles",
        "meters",
        "minutes",
        "",
        "seconds",
        "addBountyFilter",
        "",
        "",
        "",
        "",
        "bountyFilter",
        "Lco/bird/android/model/BountyBirdsFilter;",
        "addDeal",
        "deal",
        "Lco/bird/android/model/Deal;",
        "addReservationPrice",
        "reservationPrice",
        "Lco/bird/android/model/ReservationPrice;",
        "addRidePrice",
        "ridePrice",
        "Lco/bird/android/model/wire/WireRidePrice;",
        "toString",
        "Lorg/joda/time/DateTime;",
        "model-analytics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/LegacyAnalyticsEventKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$addBountyFilter(Ljava/util/Map;Lco/bird/android/model/BountyBirdsFilter;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->addBountyFilter(Ljava/util/Map;Lco/bird/android/model/BountyBirdsFilter;)V

    return-void
.end method

.method public static final synthetic access$addDeal(Ljava/util/Map;Lco/bird/android/model/Deal;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->addDeal(Ljava/util/Map;Lco/bird/android/model/Deal;)V

    return-void
.end method

.method public static final synthetic access$addReservationPrice(Ljava/util/Map;Lco/bird/android/model/ReservationPrice;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->addReservationPrice(Ljava/util/Map;Lco/bird/android/model/ReservationPrice;)V

    return-void
.end method

.method public static final synthetic access$addRidePrice(Ljava/util/Map;Lco/bird/android/model/wire/WireRidePrice;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->addRidePrice(Ljava/util/Map;Lco/bird/android/model/wire/WireRidePrice;)V

    return-void
.end method

.method public static final synthetic access$dollars(J)D
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->dollars(J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$miles(D)D
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->miles(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$minutes(I)I
    .locals 0

    invoke-static {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->minutes(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$toString(Lorg/joda/time/DateTime;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->toString(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final addBountyFilter(Ljava/util/Map;Lco/bird/android/model/BountyBirdsFilter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lco/bird/android/model/BountyBirdsFilter;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getIncludedBountyOptions()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/BountyOption;->CHARGE:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "charge"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getIncludedBountyOptions()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/BountyOption;->DAMAGED_CHARGE:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "damage_charge"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getIncludedBountyOptions()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/BountyOption;->REBALANCE:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "move"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getIncludedBountyOptions()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/BountyOption;->DAMAGED_TRANSPORT:Lco/bird/android/model/BountyOption;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "damage_move"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getLastRiddenMillisAgo()Lco/bird/android/model/IntervalFilter;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/IntervalFilter;->getMin()Ljava/lang/Comparable;

    move-result-object v0

    const-string v1, "lastRiddenMin"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getLastRiddenMillisAgo()Lco/bird/android/model/IntervalFilter;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/IntervalFilter;->getMax()Ljava/lang/Comparable;

    move-result-object v0

    const-string v1, "lastRiddenMax"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getLastLocatedMillisAgo()Lco/bird/android/model/IntervalFilter;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/IntervalFilter;->getMin()Ljava/lang/Comparable;

    move-result-object v0

    const-string v1, "lastLocatedMin"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getLastLocatedMillisAgo()Lco/bird/android/model/IntervalFilter;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/IntervalFilter;->getMax()Ljava/lang/Comparable;

    move-result-object v0

    const-string v1, "lastLocatedMax"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getPrice()Lco/bird/android/model/IntervalFilter;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/IntervalFilter;->getMin()Ljava/lang/Comparable;

    move-result-object v0

    const-string v1, "priceMin"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/BountyBirdsFilter;->getPrice()Lco/bird/android/model/IntervalFilter;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/IntervalFilter;->getMax()Ljava/lang/Comparable;

    move-result-object p1

    const-string v0, "priceMax"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final addDeal(Ljava/util/Map;Lco/bird/android/model/Deal;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lco/bird/android/model/Deal;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/Deal;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "deal_id"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "deal_name"

    invoke-virtual {p1}, Lco/bird/android/model/Deal;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/Deal;->getAddAmount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "amount"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/Deal;->getDuration()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "deal_duration"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final addReservationPrice(Ljava/util/Map;Lco/bird/android/model/ReservationPrice;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lco/bird/android/model/ReservationPrice;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/ReservationPrice;->getBasePrice()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "reservation_start_price"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/ReservationPrice;->getMinutePrice()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "reservation_minute_price"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "reservation_currency"

    invoke-virtual {p1}, Lco/bird/android/model/ReservationPrice;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final addRidePrice(Ljava/util/Map;Lco/bird/android/model/wire/WireRidePrice;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lco/bird/android/model/wire/WireRidePrice;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRidePrice;->getCurrency()Ljava/lang/String;

    move-result-object v0

    const-string v1, "currency"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRidePrice;->getBasePrice()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "start_price"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRidePrice;->getMinutePrice()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "minute_price"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRidePrice;->getMinimumPrice()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "minimum_ride_price"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRidePrice;->getIncludedMinutes()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "minutes_included"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRidePrice;->getSalesTax()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "sales_tax"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final dollars(J)D
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "This function assumes USD. We can no longer assume USD as the currency."
    .end annotation

    long-to-double p0, p0

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p0, v0

    return-wide p0
.end method

.method private static final miles(D)D
    .locals 2

    const-wide v0, 0x4099255c28f5c28fL    # 1609.34

    div-double/2addr p0, v0

    return-wide p0
.end method

.method private static final minutes(I)I
    .locals 0

    div-int/lit8 p0, p0, 0x3c

    return p0
.end method

.method private static final toString(Lorg/joda/time/DateTime;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
