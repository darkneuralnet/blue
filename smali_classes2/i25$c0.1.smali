.class public final Li25$c0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->A5(Lcom/uber/autodispose/ScopeProvider;)V
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ScanlessRideItem;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0006*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0006*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/ScanlessRideItem;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireBird;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeScanlessRideEligibleBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeScanlessRideEligibleBirds$1\n*L\n3708#1:4446,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$c0;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$c0;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/ScanlessRideItem;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    const/4 v2, 0x0

    const-string v3, "availableScanlessBirds"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Ljava/lang/Iterable;

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_1

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    :cond_0
    move v6, v4

    goto :goto_2

    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/ScanlessRideItem;

    invoke-virtual {v7}, Lco/bird/android/model/ScanlessRideItem;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v8

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {v7}, Lco/bird/android/model/ScanlessRideItem;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireBird;->getEphemeralId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_3
    move v7, v4

    goto :goto_1

    :cond_4
    :goto_0
    move v7, v5

    :goto_1
    if-eqz v7, :cond_2

    move v6, v5

    :goto_2
    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    move v6, v4

    goto :goto_4

    :cond_6
    :goto_3
    move v6, v5

    :goto_4
    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    move-object v1, v2

    :goto_5
    iget-object v2, p0, Li25$c0;->g:Li25;

    invoke-virtual {v2}, Li25;->f4()LYR4;

    move-result-object v2

    invoke-interface {v2}, LYR4;->o0()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/RideStates;

    invoke-virtual {v2}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v5

    if-eqz v2, :cond_8

    move v2, v5

    goto :goto_6

    :cond_8
    move v2, v4

    :goto_6
    if-eqz v2, :cond_9

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result p1

    if-nez p1, :cond_9

    move p1, v5

    goto :goto_7

    :cond_9
    move p1, v4

    :goto_7
    if-eqz v2, :cond_a

    if-eqz v1, :cond_a

    move v4, v5

    :cond_a
    iget-object v1, p0, Li25$c0;->g:Li25;

    invoke-static {v1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/FlightBannerNode$FlightBanner;->QUICK_START_BIRD_UNSELECTED:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {v1, v2, p1}, LZr1;->O1(Lco/bird/android/model/FlightBannerNode$FlightBanner;Z)V

    iget-object v1, p0, Li25$c0;->g:Li25;

    invoke-static {v1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/FlightBannerNode$FlightBanner;->QUICK_START_BIRD_SELECTED:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {v1, v2, v4}, LZr1;->O1(Lco/bird/android/model/FlightBannerNode$FlightBanner;Z)V

    if-eqz p1, :cond_b

    iget-object p1, p0, Li25$c0;->g:Li25;

    invoke-static {p1}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object p1

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/ScanlessRideItem;

    invoke-virtual {v0}, Lco/bird/android/model/ScanlessRideItem;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/app/feature/map/ui/MapBirdUi;->deselect(Lco/bird/android/model/wire/WireBird;)V

    :cond_b
    return-void
.end method
