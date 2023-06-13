.class public final Li25$J;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->Z4(Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lde5$a;",
        "+",
        "Lco/bird/android/model/RideMapState;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lde5$a;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/RideMapState;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeBluetoothState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeBluetoothState$1\n*L\n4285#1:4446,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$J;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$J;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lde5$a;",
            "+",
            "Lco/bird/android/model/RideMapState;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde5$a;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideMapState;

    sget-object v1, Lde5$a;->f:Lde5$a;

    if-eq v0, v1, :cond_0

    sget-object v1, Lco/bird/android/model/RideMapState;->RIDING:Lco/bird/android/model/RideMapState;

    if-eq p1, v1, :cond_1

    :cond_0
    iget-object p1, p0, Li25$J;->g:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDER_BAR_LOCATION_SERVICES_DISABLED:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v1}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    iget-object p1, p0, Li25$J;->g:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDER_BAR_BLUETOOTH_DISABLED:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v1}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :cond_1
    iget-object p1, p0, Li25$J;->g:Li25;

    invoke-virtual {p1}, Li25;->f4()LYR4;

    move-result-object p1

    invoke-interface {p1}, LYR4;->o0()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideStates;

    invoke-virtual {p1}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/RideState;

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLock()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x1

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    if-eqz v1, :cond_3

    move v2, v3

    :cond_6
    :goto_2
    if-eqz v2, :cond_8

    sget-object p1, Lde5$a;->e:Lde5$a;

    if-ne v0, p1, :cond_7

    iget-object p1, p0, Li25$J;->g:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDER_BAR_LOCATION_SERVICES_DISABLED:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    goto :goto_3

    :cond_7
    sget-object p1, Lde5$a;->f:Lde5$a;

    if-eq v0, p1, :cond_8

    iget-object p1, p0, Li25$J;->g:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDER_BAR_BLUETOOTH_DISABLED:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :cond_8
    :goto_3
    return-void
.end method
