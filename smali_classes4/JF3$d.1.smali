.class public final LJF3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;-><init>(LTq4;Landroid/content/Context;Lgl;Ldr4;Lbn;LEa;LYR4;LTL;Ltm;LXc1;Llw0;Lys0;LpU4;LaM;LMc2;LoI5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideStates;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RideStates;",
        "kotlin.jvm.PlatformType",
        "rideStates",
        "",
        "a",
        "(Lco/bird/android/model/RideStates;)V"
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
        "SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1179#2,2:1467\n1253#2,2:1469\n1256#2:1472\n1#3:1471\n*S KotlinDebug\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$4\n*L\n188#1:1467,2\n188#1:1469,2\n188#1:1472\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJF3;


# direct methods
.method public constructor <init>(LJF3;)V
    .locals 0

    iput-object p1, p0, LJF3$d;->g:LJF3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideStates;)V
    .locals 8

    iget-object v0, p0, LJF3$d;->g:LJF3;

    invoke-static {v0}, LJF3;->access$getMutableParkingNestByRideId$p(LJF3;)La94;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/RideStates;->getRideStates()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, LJF3$d;->g:LJF3;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/RideState;

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v1}, LJF3;->access$getBirdLocationManager$p(LJF3;)LTL;

    move-result-object v5

    invoke-interface {v5, v4}, LTL;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object v4

    if-eqz v4, :cond_0

    sget-object v5, Lco/bird/android/model/ParkingLocationSource;->VEHICLE:Lco/bird/android/model/ParkingLocationSource;

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, LJF3;->access$getReactiveLocationManager$p(LJF3;)Ldr4;

    move-result-object v4

    invoke-interface {v4}, Ldr4;->p()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/ParkingLocationSource;->USER:Lco/bird/android/model/ParkingLocationSource;

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    :goto_1
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/location/Location;

    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/ParkingLocationSource;

    invoke-static {v1}, LJF3;->access$getAreaManager$p(LJF3;)Lbn;

    move-result-object v6

    invoke-interface {v6}, Lbn;->V()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v2

    invoke-static {v1, v5, v6, v2, v4}, LJF3;->access$computeCurrentParkingNest(LJF3;Landroid/location/Location;Ljava/util/List;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/ParkingLocationSource;)LbF0;

    move-result-object v2

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideStates;

    invoke-virtual {p0, p1}, LJF3$d;->a(Lco/bird/android/model/RideStates;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
