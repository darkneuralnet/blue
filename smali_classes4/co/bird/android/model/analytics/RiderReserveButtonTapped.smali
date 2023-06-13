.class public final Lco/bird/android/model/analytics/RiderReserveButtonTapped;
.super Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/analytics/RiderReserveButtonTapped;",
        "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;",
        "ridePrice",
        "Lco/bird/android/model/wire/WireRidePrice;",
        "reservationPrice",
        "Lco/bird/android/model/ReservationPrice;",
        "(Lco/bird/android/model/wire/WireRidePrice;Lco/bird/android/model/ReservationPrice;)V",
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


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRidePrice;Lco/bird/android/model/ReservationPrice;)V
    .locals 3

    const-string v0, "ridePrice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reservationPrice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/analytics/Type;->RIDER_RESERVE_BUTTON_TAPPED:Lco/bird/android/model/analytics/Type;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;-><init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$addRidePrice(Ljava/util/Map;Lco/bird/android/model/wire/WireRidePrice;)V

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1, p2}, Lco/bird/android/model/analytics/LegacyAnalyticsEventKt;->access$addReservationPrice(Ljava/util/Map;Lco/bird/android/model/ReservationPrice;)V

    return-void
.end method
