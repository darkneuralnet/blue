.class public final Li25$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->q4()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "birds",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initBirdsNearbyRenderStream$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1#2:4446\n288#3,2:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initBirdsNearbyRenderStream$3\n*L\n1923#1:4447,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$q;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Li25$q;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getLogger(Li25;)Lg46$b;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attempting to show "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " birds to show on map"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v0

    const-string v1, "birds"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/MapBirdUi;->setBirds(Ljava/util/List;)V

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getRideMapStateManager$p(Li25;)LpU4;

    move-result-object v0

    invoke-interface {v0}, LpU4;->g()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    if-eqz v0, :cond_0

    iget-object v1, p0, Li25$q;->g:Li25;

    invoke-static {v1}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v1

    invoke-interface {v1, v0}, Lco/bird/android/app/feature/map/ui/MapBirdUi;->select(Lco/bird/android/model/wire/WireBird;)V

    :cond_0
    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getDeeplinkBird$p(Li25;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getDeeplinkBirdId$p(Li25;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, Li25;->access$getDeeplinkBird$p(Li25;)Lco/bird/android/model/wire/WireBird;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6, v5}, Lco/bird/android/model/wire/WireBird;->isProbablySame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v6

    if-ne v6, v4, :cond_3

    move v6, v4

    goto :goto_0

    :cond_3
    move v6, v2

    :goto_0
    if-eqz v6, :cond_4

    invoke-static {v0}, Li25;->access$getLogger(Li25;)Lg46$b;

    move-result-object v6

    const-string v7, "matched bird successfully from bird returned in bird/nearby-by-ids call"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v8}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Li25;->access$getLogger(Li25;)Lg46$b;

    move-result-object v6

    invoke-static {v0}, Li25;->access$getDeeplinkBird$p(Li25;)Lco/bird/android/model/wire/WireBird;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "deeplinkBird = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v8}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Li25;->access$getLogger(Li25;)Lg46$b;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "matched bird = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v2, [Ljava/lang/Object;

    invoke-virtual {v6, v5, v7}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    move v5, v4

    goto :goto_2

    :cond_4
    invoke-static {v0}, Li25;->access$getDeeplinkBirdId$p(Li25;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getEphemeralId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Li25;->access$getDeeplinkBirdId$p(Li25;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Li25;->access$getDeeplinkBirdId$p(Li25;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0}, Li25;->access$getDeeplinkBirdId$p(Li25;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    invoke-static {v0}, Li25;->access$getLogger(Li25;)Lg46$b;

    move-result-object v5

    const-string v6, "matched bird successfully via deeplink bird id"

    new-array v7, v2, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    move v5, v2

    :goto_2
    if-eqz v5, :cond_2

    goto :goto_3

    :cond_7
    move-object v1, v3

    :goto_3
    check-cast v1, Lco/bird/android/model/wire/WireBird;

    iget-object p1, p0, Li25$q;->g:Li25;

    invoke-static {p1}, Li25;->access$getDeeplinkLatLng$p(Li25;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getBirdManager$p(Li25;)LaM;

    move-result-object v0

    sget-object v5, LYw2;->a:LYw2;

    invoke-virtual {v5, p1}, LYw2;->i(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object p1

    invoke-interface {v0, p1}, LaM;->y0(Landroid/location/Location;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    goto :goto_4

    :cond_8
    move-object p1, v3

    :goto_4
    if-eqz p1, :cond_9

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->getCenterLocation()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapUiKt;->toGeolocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    invoke-static {v0}, LUB1;->a(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Landroid/location/Location;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    goto :goto_5

    :cond_9
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    :goto_5
    if-eqz p1, :cond_d

    iget-object v5, p0, Li25$q;->g:Li25;

    invoke-static {v5}, Li25;->access$getDeeplinkLatLng$p(Li25;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-static {v5}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v7

    invoke-interface {v7, v6}, Lco/bird/android/app/feature/map/ui/MapUi;->viewportContains(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v6

    if-ne v6, v4, :cond_a

    move v6, v4

    goto :goto_6

    :cond_a
    move v6, v2

    :goto_6
    if-eqz v6, :cond_b

    invoke-static {v5}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v5

    invoke-interface {v5}, Lco/bird/android/app/feature/map/ui/MapUi;->nearbyRadius()D

    move-result-wide v5

    double-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v5, v6

    cmpg-float v5, v0, v5

    if-gtz v5, :cond_b

    goto :goto_7

    :cond_b
    move v4, v2

    :goto_7
    if-eqz v4, :cond_c

    goto :goto_8

    :cond_c
    move-object p1, v3

    :goto_8
    if-eqz p1, :cond_d

    new-instance v4, Li25$b;

    invoke-direct {v4, p1, v0}, Li25$b;-><init>(Lco/bird/android/model/wire/WireBird;F)V

    goto :goto_9

    :cond_d
    move-object v4, v3

    :goto_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Tracking potential deeplink fallback entry "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Li25$q;->g:Li25;

    invoke-static {p1}, Li25;->access$getPotentialDeeplinkBirdFallback$p(Li25;)La94;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0, v4}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    if-eqz v1, :cond_e

    iget-object p1, p0, Li25$q;->g:Li25;

    const/4 v0, 0x2

    invoke-static {p1, v1, v2, v0, v3}, Li25;->S7(Li25;Lco/bird/android/model/wire/WireBird;ZILjava/lang/Object;)V

    goto :goto_a

    :cond_e
    iget-object p1, p0, Li25$q;->g:Li25;

    invoke-static {p1}, Li25;->access$getLogger(Li25;)Lg46$b;

    move-result-object p1

    iget-object v0, p0, Li25$q;->g:Li25;

    invoke-static {v0}, Li25;->access$getDeeplinkBirdId$p(Li25;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to find the deeplinked bird: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " or any close by."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_f
    :goto_a
    return-void
.end method
