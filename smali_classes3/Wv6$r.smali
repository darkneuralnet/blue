.class public final LWv6$r;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWv6$r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(Lco/bird/android/model/DialogResponse;)V"
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

    iput-object p1, p0, LWv6$r;->g:LWv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)V
    .locals 17

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, LWv6$r$a;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    const/4 v4, 0x2

    if-eq v1, v4, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getResultRequired$p(LWv6;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getArManager$p(LWv6;)Ltm;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getRideId$p(LWv6;)Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v7

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v8

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v9, v0, LWv6$r;->g:LWv6;

    invoke-static {v9}, LWv6;->access$getLocationManager$p(LWv6;)Ldr4;

    move-result-object v10

    invoke-interface {v10}, Ldr4;->p()LZ84;

    move-result-object v10

    invoke-virtual {v10}, LZ84;->a()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/location/Location;

    invoke-static {v9, v1, v10}, LWv6;->access$containsLocation(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;)Z

    move-result v1

    if-ne v1, v3, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getTimeoutSeconds$p(LWv6;)Ljava/lang/Long;

    move-result-object v1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " seconds time out and continues to ride (result required)"

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, LWv6$r;->g:LWv6;

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

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getNavigator$p(LWv6;)Le13;

    move-result-object v1

    sget-object v4, Le13$b;->b:Le13$b;

    new-array v3, v3, [Lkotlin/Pair;

    const-string v5, "parking_verification_failed"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-interface {v1, v4, v3}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    goto/16 :goto_3

    :cond_3
    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getArManager$p(LWv6;)Ltm;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getRideId$p(LWv6;)Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v7

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v8

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v9, v0, LWv6$r;->g:LWv6;

    invoke-static {v9}, LWv6;->access$getLocationManager$p(LWv6;)Ldr4;

    move-result-object v10

    invoke-interface {v10}, Ldr4;->p()LZ84;

    move-result-object v10

    invoke-virtual {v10}, LZ84;->a()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/location/Location;

    invoke-static {v9, v1, v10}, LWv6;->access$containsLocation(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;)Z

    move-result v1

    if-ne v1, v3, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getTimeoutSeconds$p(LWv6;)Ljava/lang/Long;

    move-result-object v1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " seconds time out and ends ride (result not required)"

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, LWv6$r;->g:LWv6;

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

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getNavigator$p(LWv6;)Le13;

    move-result-object v1

    sget-object v4, Le13$b;->c:Le13$b;

    new-array v3, v3, [Lkotlin/Pair;

    const-string v5, "arcore_end_ride_regardless"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-interface {v1, v4, v3}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    goto :goto_3

    :cond_5
    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getArManager$p(LWv6;)Ltm;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getRideId$p(LWv6;)Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getBird$p(LWv6;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v7

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v8

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getParkingNest(LWv6;)Lco/bird/android/model/ParkingNest;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v9, v0, LWv6$r;->g:LWv6;

    invoke-static {v9}, LWv6;->access$getLocationManager$p(LWv6;)Ldr4;

    move-result-object v10

    invoke-interface {v10}, Ldr4;->p()LZ84;

    move-result-object v10

    invoke-virtual {v10}, LZ84;->a()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/location/Location;

    invoke-static {v9, v1, v10}, LWv6;->access$containsLocation(LWv6;Lco/bird/android/model/ParkingNest;Landroid/location/Location;)Z

    move-result v1

    if-ne v1, v3, :cond_6

    move v2, v3

    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getTimeoutSeconds$p(LWv6;)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " seconds time out and keeps on trying"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getBestAccuracyMeters$p(LWv6;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x380

    const/16 v16, 0x0

    invoke-static/range {v4 .. v16}, Ltm$a;->trackResolutionResult$default(Ltm;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v1, v0, LWv6$r;->g:LWv6;

    invoke-static {v1}, LWv6;->access$getRestartSubject$p(LWv6;)LAG;

    move-result-object v1

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, v2}, LAG;->accept(Ljava/lang/Object;)V

    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LWv6$r;->a(Lco/bird/android/model/DialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
