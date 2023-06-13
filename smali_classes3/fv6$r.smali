.class public final Lfv6$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;->m0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfv6$r$a;
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
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$r;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)V
    .locals 14

    iget-object v0, p0, Lfv6$r;->g:Lfv6;

    invoke-static {v0}, Lfv6;->access$getParkingStateRelay$p(Lfv6;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFH3;

    iget-object v1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getParkingStateRelay$p(Lfv6;)La94;

    move-result-object v1

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFH3;

    invoke-virtual {v1}, LFH3;->c()LbF0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object v7, v2

    :goto_0
    instance-of v1, v0, LKc0;

    if-eqz v1, :cond_1

    check-cast v0, LKc0;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LKc0;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object v8, v0

    goto :goto_2

    :cond_2
    move-object v8, v2

    :goto_2
    if-nez p1, :cond_3

    const/4 p1, -0x1

    goto :goto_3

    :cond_3
    sget-object v0, Lfv6$r$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_3
    const/4 v0, 0x1

    if-eq p1, v0, :cond_8

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResultRequired$p(Lfv6;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getArManager$p(Lfv6;)Ltm;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_5
    move-object v6, v2

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getTimeoutSeconds$p(Lfv6;)Ljava/lang/Long;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " seconds time out and continues to ride (result required)"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getBestAccuracyMeters$p(Lfv6;)D

    move-result-wide v10

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    invoke-virtual {p1}, LSL4;->e()D

    move-result-wide v12

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    invoke-virtual {p1}, LSL4;->h()LTL4;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lfv6$r;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    move-object v12, v2

    move-object v13, p1

    invoke-interface/range {v3 .. v13}, Ltm;->a(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$resetThirdPartyLocationOnCancel(Lfv6;)V

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getNavigator$p(Lfv6;)Le13;

    move-result-object p1

    sget-object v2, Le13$b;->b:Le13$b;

    new-array v0, v0, [Lkotlin/Pair;

    const-string v3, "parking_verification_failed"

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-interface {p1, v2, v0}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    goto/16 :goto_4

    :cond_6
    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getArManager$p(Lfv6;)Ltm;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_7
    move-object v6, v2

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getTimeoutSeconds$p(Lfv6;)Ljava/lang/Long;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " seconds time out and ends ride (result not required)"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getBestAccuracyMeters$p(Lfv6;)D

    move-result-wide v10

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    invoke-virtual {p1}, LSL4;->e()D

    move-result-wide v12

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    invoke-virtual {p1}, LSL4;->h()LTL4;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lfv6$r;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    move-object v12, v2

    move-object v13, p1

    invoke-interface/range {v3 .. v13}, Ltm;->a(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getNavigator$p(Lfv6;)Le13;

    move-result-object p1

    sget-object v2, Le13$b;->c:Le13$b;

    new-array v0, v0, [Lkotlin/Pair;

    const-string v3, "arcore_end_ride_regardless"

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-interface {p1, v2, v0}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    goto/16 :goto_4

    :cond_8
    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getArManager$p(Lfv6;)Ltm;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_9
    move-object v6, v2

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getTimeoutSeconds$p(Lfv6;)Ljava/lang/Long;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " seconds time out and keeps on trying"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getBestAccuracyMeters$p(Lfv6;)D

    move-result-wide v0

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    invoke-virtual {p1}, LSL4;->e()D

    move-result-wide v10

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object p1

    invoke-virtual {p1}, La94;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSL4;

    invoke-virtual {p1}, LSL4;->h()LTL4;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    move-object v10, p1

    invoke-interface/range {v3 .. v13}, Ltm;->a(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V

    iget-object p1, p0, Lfv6$r;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getStartScanningTime$p(Lfv6;)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {p1, v0}, Lfv6;->access$resetFlow(Lfv6;Lorg/joda/time/DateTime;)V

    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, Lfv6$r;->a(Lco/bird/android/model/DialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
