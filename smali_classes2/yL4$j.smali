.class public final LyL4$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyL4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Lco/bird/android/model/RideStates;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Reservation;",
        ">;+",
        "Lco/bird/android/model/RideMapState;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u00020\t2\u00c3\u0001\u0010\u0008\u001a\u00be\u0001\u00120\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007 \u0005*^\u00120\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/RideStates;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/Reservation;",
        "Lco/bird/android/model/RideMapState;",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LyL4;


# direct methods
.method public constructor <init>(LyL4;)V
    .locals 0

    iput-object p1, p0, LyL4$j;->g:LyL4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lco/bird/android/model/RideStates;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Reservation;",
            ">;+",
            "Lco/bird/android/model/RideMapState;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideMapState;

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideStates;

    iget-object v3, p0, LyL4$j;->g:LyL4;

    invoke-static {v3}, LyL4;->access$getConfigForCurrentBird(LyL4;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/ReservationConfig;->getEnableRideReservation()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    if-nez v2, :cond_0

    iget-object v3, p0, LyL4$j;->g:LyL4;

    invoke-static {v3}, LyL4;->access$getFlightBannerCoordinatorPresenter$p(LyL4;)LZr1;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RESERVATION_BEFORE:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {v3, v4}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, Lco/bird/android/model/RideMapState;->NONE:Lco/bird/android/model/RideMapState;

    if-ne p1, v2, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LyL4$j;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getAnalyticsManager$p(LyL4;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/RiderPinTapped;

    invoke-direct {v1}, Lco/bird/android/model/analytics/RiderPinTapped;-><init>()V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :cond_2
    iget-object v0, p0, LyL4$j;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getFlightBannerCoordinatorPresenter$p(LyL4;)LZr1;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RESERVATION_BEFORE:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {v0, v1, p1}, LZr1;->O1(Lco/bird/android/model/FlightBannerNode$FlightBanner;Z)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LyL4$j;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
