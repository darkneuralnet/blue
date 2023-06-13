.class public final Lfv6$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;->Y(LcD1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LEH3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LEH3;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LEH3;)V"
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

    iput-object p1, p0, Lfv6$p;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LEH3;)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getNestArModelNode(Lfv6;)Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object v1

    sget-object v2, LEH3;->c:LEH3;

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object/from16 v5, p1

    if-ne v5, v2, :cond_0

    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getParkingLocationVerificationConfig$p(Lfv6;)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->getShowArMarker()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-virtual {v1, v2}, Lio/github/sceneview/node/Node;->I0(Z)V

    iget-object v1, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$loadTimeoutTimerIfNecessary(Lfv6;)V

    iget-object v1, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getArManager$p(Lfv6;)Ltm;

    move-result-object v1

    sget-object v6, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    invoke-virtual/range {p1 .. p1}, LEH3;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v8

    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object v9, v5

    :goto_1
    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getParkingManager$p(Lfv6;)LoF3;

    move-result-object v2

    invoke-interface {v2}, LoF3;->g()LbF0;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LbF0;->e()Lco/bird/android/model/ParkingNest;

    move-result-object v2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object v10, v5

    :goto_2
    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getParkingManager$p(Lfv6;)LoF3;

    move-result-object v2

    invoke-interface {v2}, LoF3;->g()LbF0;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LbF0;->f()LmG3;

    move-result-object v5

    :cond_3
    sget-object v2, LmG3;->b:LmG3;

    if-ne v5, v2, :cond_4

    goto :goto_3

    :cond_4
    move v3, v4

    :goto_3
    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getBestAccuracyMeters$p(Lfv6;)D

    move-result-wide v4

    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LSL4;

    invoke-virtual {v2}, LSL4;->e()D

    move-result-wide v11

    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getResolvedLocationRelay$p(Lfv6;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LSL4;

    invoke-virtual {v2}, LSL4;->h()LTL4;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    iget-object v2, v0, Lfv6$p;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getSkipBirdScan$p(Lfv6;)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    move-object v5, v1

    move-object v11, v2

    move-object v12, v3

    invoke-interface/range {v5 .. v15}, Ltm;->g(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEH3;

    invoke-virtual {p0, p1}, Lfv6$p;->a(LEH3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
