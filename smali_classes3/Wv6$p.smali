.class public final LWv6$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LBx;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LBx;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "b",
        "(LBx;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;


# direct methods
.method public constructor <init>(LWv6;)V
    .locals 0

    iput-object p1, p0, LWv6$p;->g:LWv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LWv6;)V
    .locals 0

    invoke-static {p0}, LWv6$p;->c(LWv6;)V

    return-void
.end method

.method public static final c(LWv6;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LWv6;->access$getNavigator$p(LWv6;)Le13;

    move-result-object p0

    sget-object v0, Le13$b;->c:Le13$b;

    const/4 v1, 0x0

    new-array v1, v1, [Lkotlin/Pair;

    invoke-interface {p0, v0, v1}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    return-void
.end method


# virtual methods
.method public final b(LBx;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, LWv6$p;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getCurrentCameraGeospatialPose$p(LWv6;)Lcom/google/ar/core/GeospatialPose;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    iget-object v4, v0, LWv6$p;->g:LWv6;

    new-instance v5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getLongitude()D

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v5}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v6

    invoke-static {v4, v6}, LWv6;->access$closestNest(LWv6;Landroid/location/Location;)Lco/bird/android/model/ParkingNest;

    move-result-object v6

    invoke-static {v4}, LWv6;->access$getArManager$p(LWv6;)Ltm;

    move-result-object v7

    sget-object v8, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    invoke-static {v4}, LWv6;->access$getRideId$p(LWv6;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object v10

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v10

    if-eqz v6, :cond_0

    invoke-static {v5}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v11

    invoke-static {v4, v6, v11}, LWv6;->access$containsLocation(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;)Z

    move-result v11

    if-ne v11, v2, :cond_0

    move v11, v2

    goto :goto_0

    :cond_0
    move v11, v3

    :goto_0
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v4}, LWv6;->access$getBestAccuracyMeters$p(LWv6;)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getHorizontalAccuracy()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x320

    const/16 v19, 0x0

    move-object v11, v6

    invoke-static/range {v7 .. v19}, Ltm$a;->trackResolutionResult$default(Ltm;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {v4}, LWv6;->access$getDebugging$p(LWv6;)Z

    move-result v7

    if-eqz v7, :cond_3

    if-eqz v6, :cond_1

    invoke-static {v5}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v5

    invoke-static {v4, v6, v5}, LWv6;->access$containsLocation(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;)Z

    move-result v5

    if-ne v5, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v2, :cond_2

    sget-object v2, LH32;->a:LH32;

    invoke-virtual {v4, v2}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    sget-object v2, LkA3;->a:LkA3;

    invoke-virtual {v4, v2}, Lf1;->h(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    invoke-static {v4}, LWv6;->access$getLocationManager$p(LWv6;)Ldr4;

    move-result-object v2

    new-instance v3, Landroid/location/Location;

    sget-object v5, LUw2;->d:LUw2;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getLongitude()D

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Landroid/location/Location;->setLongitude(D)V

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getHorizontalAccuracy()D

    move-result-wide v6

    double-to-float v6, v6

    invoke-virtual {v3, v6}, Landroid/location/Location;->setAccuracy(F)V

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getAltitude()D

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Landroid/location/Location;->setAltitude(D)V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1a

    if-lt v6, v7, :cond_4

    invoke-virtual {v1}, Lcom/google/ar/core/GeospatialPose;->getVerticalAccuracy()D

    move-result-wide v6

    double-to-float v1, v6

    invoke-static {v3, v1}, LQL4;->a(Landroid/location/Location;F)V

    :cond_4
    new-instance v7, LVw2;

    invoke-direct {v7, v3, v5}, LVw2;-><init>(Landroid/location/Location;LUw2;)V

    const/4 v8, 0x0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    const/16 v3, 0x1e

    invoke-virtual {v1, v3}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v9

    const-string v1, "now().plusSeconds(VPS_LOCATION_EXPIRATION_SECONDS)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    new-instance v1, Lr36;

    move-object v6, v1

    invoke-direct/range {v6 .. v11}, Lr36;-><init>(LVw2;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, Ldr4;->l(Lr36;)V

    invoke-static {v4}, LWv6;->access$getHandler$p(LWv6;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, LXv6;

    invoke-direct {v2, v4}, LXv6;-><init>(LWv6;)V

    const-wide/16 v3, 0x5dc

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4

    :cond_5
    iget-object v1, v0, LWv6$p;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getArManager$p(LWv6;)Ltm;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    invoke-static {v1}, LWv6;->access$getRideId$p(LWv6;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v8

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-static {v1}, LWv6;->access$getLocationManager$p(LWv6;)Ldr4;

    move-result-object v10

    invoke-interface {v10}, Ldr4;->p()LZ84;

    move-result-object v10

    invoke-virtual {v10}, LZ84;->a()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/location/Location;

    invoke-static {v1, v9, v10}, LWv6;->access$containsLocation(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;)Z

    move-result v9

    if-ne v9, v2, :cond_6

    move v9, v2

    goto :goto_3

    :cond_6
    move v9, v3

    :goto_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const-string v10, "Trouble obtaining earth for camera pose"

    invoke-static {v1}, LWv6;->access$getBestAccuracyMeters$p(LWv6;)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x380

    const/16 v16, 0x0

    invoke-static/range {v4 .. v16}, Ltm$a;->trackResolutionResult$default(Ltm;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)V

    const-string v4, "Trouble obtaining earth for camera pose"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v4, LBd6;->a:LBd6;

    invoke-virtual {v1, v4}, Lf1;->h(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v4}, LWv6;->o0(LWv6;ZILjava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBx;

    invoke-virtual {p0, p1}, LWv6$p;->b(LBx;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
