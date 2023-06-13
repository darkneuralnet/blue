.class public final Lfv6$f$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6$f;->invoke(Ljava/lang/Boolean;)Lio/reactivex/B;
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
        "Lco/bird/android/buava/Optional<",
        "Lcom/google/ar/core/Earth;",
        ">;+",
        "Landroid/location/Location;",
        "+",
        "Ljava/lang/Float;",
        ">;",
        "Lkotlin/Pair<",
        "+",
        "LSL4;",
        "+",
        "LFH3;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t \u0003*\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/buava/Optional;",
        "Lcom/google/ar/core/Earth;",
        "kotlin.jvm.PlatformType",
        "Landroid/location/Location;",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "LSL4;",
        "LFH3;",
        "a",
        "(Lkotlin/Triple;)Lkotlin/Pair;"
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
        "SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$listenForLocationUpdates$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1138:1\n1#2:1139\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$f$d;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lkotlin/Pair;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/Earth;",
            ">;+",
            "Landroid/location/Location;",
            "Ljava/lang/Float;",
            ">;)",
            "Lkotlin/Pair<",
            "LSL4;",
            "LFH3;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<name for destructuring parameter 0>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/location/Location;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ar/core/Earth;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/ar/core/Earth;->getCameraGeospatialPose()Lcom/google/ar/core/GeospatialPose;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-wide/16 v6, 0x0

    if-eqz v5, :cond_1

    iget-object v1, v0, Lfv6$f$d;->g:Lfv6;

    invoke-virtual {v5}, Lcom/google/ar/core/GeospatialPose;->getHorizontalAccuracy()D

    move-result-wide v10

    invoke-static {v1, v10, v11}, Lfv6;->access$vpsLocationMeetsAccuracy(Lfv6;D)Lkotlin/Pair;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    :cond_2
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    iget-object v1, v0, Lfv6$f$d;->g:Lfv6;

    invoke-virtual {v9}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    float-to-double v12, v4

    invoke-static {v1, v12, v13}, Lfv6;->access$gpsLocationMeetsAccuracy(Lfv6;D)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/google/ar/core/GeospatialPose;->getHeading()D

    move-result-wide v15

    cmpg-double v1, v15, v6

    if-gez v1, :cond_3

    const-wide v17, 0x4076800000000000L    # 360.0

    add-double v15, v15, v17

    :cond_3
    iget-object v1, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getSensorManager$p(Lfv6;)Landroid/hardware/SensorManager;

    move-result-object v1

    invoke-static {v1, v9}, Lpv6;->a(Landroid/hardware/SensorManager;Landroid/location/Location;)Landroid/hardware/GeomagneticField;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/GeomagneticField;->getDeclination()F

    move-result v1

    float-to-double v3, v1

    add-double/2addr v15, v3

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    sget-object v4, LSL4;->p:LSL4$a;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v15

    cmpl-double v3, v15, v6

    if-lez v3, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    iget-object v3, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v3}, Lfv6;->access$isGeospatialModeAvailableAtCurrentLocation$p(Lfv6;)Z

    move-result v15

    :try_start_0
    iget-object v3, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v3}, Lfv6;->access$isGeospatialModeSupported$p(Lfv6;)Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/util/concurrent/SettableFuture;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_4
    const-string v6, "try { isGeospatialModeSu\u2026h(e: Throwable) { false }"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    :try_start_1
    iget-object v3, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v3}, Lfv6;->access$isArCoreAvailable$p(Lfv6;)Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/util/concurrent/SettableFuture;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_5
    const-string v6, "try { isArCoreAvailable.\u2026h (e: Throwable) { false}"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    move-wide v6, v10

    move-wide v10, v13

    move-object v13, v1

    move-object v14, v2

    invoke-virtual/range {v4 .. v17}, LSL4$a;->a(Lcom/google/ar/core/GeospatialPose;DZLandroid/location/Location;DZLjava/lang/Double;Ljava/lang/Double;ZZZ)LSL4;

    move-result-object v1

    iget-object v2, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v2, v1}, Lfv6;->access$maybeSetThirdPartyLocation(Lfv6;LSL4;)V

    iget-object v2, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getParkingManager$p(Lfv6;)LoF3;

    move-result-object v2

    iget-object v3, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v3}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, LSL4;->j()Landroid/location/Location;

    move-result-object v4

    iget-object v5, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v5}, Lfv6;->access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    sget-object v5, Lco/bird/android/model/ParkingLocationSource;->USER:Lco/bird/android/model/ParkingLocationSource;

    goto :goto_6

    :cond_7
    sget-object v5, Lco/bird/android/model/ParkingLocationSource;->VEHICLE:Lco/bird/android/model/ParkingLocationSource;

    :goto_6
    invoke-interface {v2, v3, v4, v5}, LoF3;->c(Ljava/lang/String;Landroid/location/Location;Lco/bird/android/model/ParkingLocationSource;)LFH3;

    move-result-object v2

    if-nez v2, :cond_8

    new-instance v2, Lle6;

    iget-object v3, v0, Lfv6$f$d;->g:Lfv6;

    invoke-static {v3}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Lle6;-><init>(Ljava/lang/String;Lco/bird/android/model/RiderAreaState;LbF0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_8
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lfv6$f$d;->a(Lkotlin/Triple;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
