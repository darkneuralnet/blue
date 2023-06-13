.class public final LZQ4$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZQ4;->A(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LZQ4$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZQ4$a;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LZQ4$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZQ4;


# direct methods
.method public constructor <init>(LZQ4;)V
    .locals 0

    iput-object p1, p0, LZQ4$i;->g:LZQ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZQ4$a;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v1}, LZQ4;->access$getPhysicalLockPresent$p(LZQ4;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/ParkingPhotoType;->LOCK:Lco/bird/android/model/ParkingPhotoType;

    goto :goto_0

    :cond_0
    sget-object v1, Lco/bird/android/model/ParkingPhotoType;->REVIEWED:Lco/bird/android/model/ParkingPhotoType;

    :goto_0
    iget-object v2, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v2}, LZQ4;->access$getAnalyticsManager$p(LZQ4;)LEa;

    move-result-object v2

    iget-object v3, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v3}, LZQ4;->access$getRide$p(LZQ4;)Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    const-string v4, "ride"

    const/4 v5, 0x0

    if-nez v3, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v5

    :cond_1
    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    const-string v3, ""

    :cond_3
    move-object v10, v3

    iget-object v3, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v3}, LZQ4;->access$getRide$p(LZQ4;)Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v5

    :cond_4
    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lco/bird/android/model/ParkingPhotoType;->toString()Ljava/lang/String;

    move-result-object v13

    iget-object v1, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v1}, LZQ4;->access$getAreaManager$p(LZQ4;)Lbn;

    move-result-object v1

    invoke-interface {v1}, Lbn;->c0()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/ParkingNestData;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/ParkingNestData;->getParkingNest()Lco/bird/android/model/ParkingNest;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/ParkingNest;->getId()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_1

    :cond_5
    move-object v12, v5

    :goto_1
    iget-object v1, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v1}, LZQ4;->access$getRide$p(LZQ4;)Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_6
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPhysicalLock()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/constant/PhysicalLockPurpose;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_7
    move-object v14, v5

    iget-object v1, v0, LZQ4$i;->g:LZQ4;

    invoke-static {v1}, LZQ4;->access$getEndRideManager$p(LZQ4;)LXc1;

    move-result-object v1

    invoke-interface {v1}, LXc1;->n()Ljava/lang/String;

    move-result-object v15

    new-instance v1, LFG3;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v17}, LFG3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZQ4$a;

    invoke-virtual {p0, p1}, LZQ4$i;->a(LZQ4$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
