.class public final LX65;
.super LtA;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX65$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "LX65;",
        "LtA;",
        "La75;",
        "model",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "s",
        "v",
        "Lco/bird/android/model/RideStatusBottomSheetButton;",
        "u",
        "w",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "co.bird.android.feature.rider.bottomsheets"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRideStatusBottomSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetConverter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LtA;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic r(LX65;La75;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LX65;->t(LX65;La75;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final t(LX65;La75;)Ljava/util/List;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LX65;->v(La75;)LH6;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final s(La75;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La75;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW65;

    invoke-direct {v0, p0, p1}, LW65;-><init>(LX65;La75;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "fromCallable {\n      lis\u2026tion(model)\n      )\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final u(La75;)Lco/bird/android/model/RideStatusBottomSheetButton;
    .locals 20

    invoke-virtual/range {p1 .. p1}, La75;->f()Lco/bird/android/model/RideUpdateState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideUpdateState;->RIDE_REQUIREMENTS:Lco/bird/android/model/RideUpdateState;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "context.getString(L.string.ride_action_unlock)"

    const/4 v5, 0x0

    if-eq v0, v1, :cond_11

    invoke-virtual/range {p1 .. p1}, La75;->f()Lco/bird/android/model/RideUpdateState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideUpdateState;->STARTING:Lco/bird/android/model/RideUpdateState;

    if-ne v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p1 .. p1}, La75;->f()Lco/bird/android/model/RideUpdateState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideUpdateState;->ENDING:Lco/bird/android/model/RideUpdateState;

    if-eq v0, v1, :cond_10

    invoke-virtual/range {p1 .. p1}, La75;->f()Lco/bird/android/model/RideUpdateState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideUpdateState;->LOCKING:Lco/bird/android/model/RideUpdateState;

    if-ne v0, v1, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual/range {p1 .. p1}, La75;->d()Lco/bird/android/model/Reservation;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual/range {p1 .. p1}, La75;->c()Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScanlessReservedRideStart()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p1 .. p1}, La75;->d()Lco/bird/android/model/Reservation;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getRideId()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->ride_action_unlock:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, La75;->d()Lco/bird/android/model/Reservation;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/model/ReservationKt;->remainingSeconds(Lco/bird/android/model/Reservation;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_3

    goto :goto_0

    :cond_3
    move v3, v5

    :cond_4
    :goto_0
    new-instance v1, Lco/bird/android/model/RideStatusUnlockButton;

    invoke-direct {v1, v2, v0, v5, v3}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto/16 :goto_5

    :cond_5
    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->ride_action_ride_after_reservation:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.stri\u2026n_ride_after_reservation)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, La75;->d()Lco/bird/android/model/Reservation;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/model/ReservationKt;->remainingSeconds(Lco/bird/android/model/Reservation;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_6

    goto :goto_1

    :cond_6
    move v3, v5

    :cond_7
    :goto_1
    new-instance v1, Lco/bird/android/model/RideStatusScanAfterReserveButton;

    invoke-direct {v1, v0, v5, v3}, Lco/bird/android/model/RideStatusScanAfterReserveButton;-><init>(Ljava/lang/String;ZZ)V

    goto/16 :goto_5

    :cond_8
    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lco/bird/android/model/wire/WireBirdKt;->birdModel(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/constant/BirdModel;

    move-result-object v2

    :cond_9
    sget-object v0, Lco/bird/android/model/constant/BirdModel;->SCAN_ONLY:Lco/bird/android/model/constant/BirdModel;

    const-string v1, "context.getString(L.string.ride_action_lock)"

    if-ne v2, v0, :cond_a

    new-instance v0, Lco/bird/android/model/RideStatusLockButton;

    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v3

    sget v4, Lnl4;->ride_action_lock:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2, v3, v5, v5}, Lco/bird/android/model/RideStatusLockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    :goto_2
    move-object v1, v0

    goto/16 :goto_5

    :cond_a
    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getStatus()Lco/bird/android/model/RideState$Status;

    move-result-object v0

    sget-object v2, LX65$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-eq v0, v3, :cond_e

    const/4 v1, 0x2

    if-eq v0, v1, :cond_d

    const/4 v1, 0x3

    if-eq v0, v1, :cond_c

    const/4 v1, 0x4

    if-ne v0, v1, :cond_b

    new-instance v1, Lco/bird/android/model/RideStatusUnlockButton;

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v2, Lnl4;->ride_action_unlock:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_5

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    new-instance v0, Lco/bird/android/model/RideStatusUnlockButton;

    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v1

    sget v3, Lnl4;->ride_action_unlock:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_5

    :cond_d
    new-instance v1, Lco/bird/android/model/RideStatusUnlockButton;

    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v2

    sget v6, Lnl4;->ride_action_unlock:I

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, v2, v3, v5}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto/16 :goto_5

    :cond_e
    new-instance v0, Lco/bird/android/model/RideStatusLockButton;

    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->ride_action_lock:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, Lco/bird/android/model/RideStatusLockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_f
    new-instance v1, Lco/bird/android/model/RideStatusUnlockButton;

    const/4 v14, 0x0

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v2, Lnl4;->ride_action_unlock:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x4

    const/16 v19, 0x0

    move-object v13, v1

    invoke-direct/range {v13 .. v19}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_10
    :goto_3
    new-instance v1, Lco/bird/android/model/RideStatusUnlockButton;

    const/4 v3, 0x0

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v2, Lnl4;->ride_action_unlock:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v2, v1

    move-object v4, v0

    invoke-direct/range {v2 .. v8}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_11
    :goto_4
    new-instance v1, Lco/bird/android/model/RideStatusUnlockButton;

    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_12
    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v6, Lnl4;->ride_action_unlock:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v0, v3, v5}, Lco/bird/android/model/RideStatusUnlockButton;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    :goto_5
    return-object v1
.end method

.method public final v(La75;)LH6;
    .locals 24

    invoke-virtual/range {p1 .. p1}, La75;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lrg4;->ic_vehicle_moped:I

    goto :goto_0

    :cond_0
    sget v0, Lrg4;->ic_scooter_flying:I

    :goto_0
    move v2, v0

    invoke-virtual/range {p1 .. p1}, La75;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, La75;->d()Lco/bird/android/model/Reservation;

    move-result-object v0

    const/4 v13, 0x0

    if-eqz v0, :cond_3

    invoke-virtual/range {p1 .. p1}, La75;->c()Lco/bird/android/model/wire/configs/Config;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScanlessReservedRideStart()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getExpireAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, LpT0;->h(Lorg/joda/time/DateTime;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v13

    goto :goto_1

    :cond_3
    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result v0

    :goto_1
    move v4, v0

    goto :goto_2

    :cond_4
    move v4, v13

    :goto_2
    invoke-virtual/range {p1 .. p1}, La75;->d()Lco/bird/android/model/Reservation;

    move-result-object v0

    const/4 v14, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getExpireAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p1 .. p1}, La75;->c()Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getEnableScanlessReservedRideStart()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, LR46;->e:LR46;

    goto :goto_3

    :cond_5
    sget-object v0, LR46;->d:LR46;

    :goto_3
    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    move-object v5, v0

    goto :goto_8

    :cond_7
    :goto_5
    invoke-virtual/range {p1 .. p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v0

    if-ne v0, v14, :cond_8

    move v0, v14

    goto :goto_6

    :cond_8
    move v0, v13

    :goto_6
    if-nez v0, :cond_a

    invoke-virtual/range {p1 .. p1}, La75;->f()Lco/bird/android/model/RideUpdateState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideUpdateState;->STARTING:Lco/bird/android/model/RideUpdateState;

    if-ne v0, v1, :cond_9

    goto :goto_7

    :cond_9
    sget-object v0, LR46;->c:LR46;

    goto :goto_4

    :cond_a
    :goto_7
    sget-object v0, LR46;->d:LR46;

    goto :goto_4

    :goto_8
    invoke-virtual/range {p1 .. p1}, La75;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v15, Lxx1;->a:Lxx1;

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v16

    int-to-double v0, v0

    const-wide/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x4

    const/16 v23, 0x0

    move-wide/from16 v17, v0

    invoke-static/range {v15 .. v23}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_b
    const/4 v0, 0x0

    :goto_9
    move-object v6, v0

    invoke-virtual/range {p0 .. p1}, LX65;->u(La75;)Lco/bird/android/model/RideStatusBottomSheetButton;

    move-result-object v7

    invoke-virtual/range {p0 .. p1}, LX65;->w(La75;)Lco/bird/android/model/RideStatusBottomSheetButton;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, La75;->h()Z

    move-result v9

    const/4 v10, 0x0

    const/16 v11, 0x100

    const/4 v12, 0x0

    new-instance v16, Lb75;

    move-object/from16 v1, v16

    invoke-direct/range {v1 .. v12}, Lb75;-><init>(ILjava/lang/String;ILR46;Ljava/lang/String;Lco/bird/android/model/RideStatusBottomSheetButton;Lco/bird/android/model/RideStatusBottomSheetButton;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LH6;

    new-array v1, v14, [LG6;

    new-instance v2, LG6;

    sget v17, LIj4;->item_ride_state_header:I

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/16 v20, 0x0

    move-object v15, v2

    invoke-direct/range {v15 .. v20}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v2, v1, v13

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v21, 0x6

    const/16 v22, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v17 .. v22}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final w(La75;)Lco/bird/android/model/RideStatusBottomSheetButton;
    .locals 13

    invoke-virtual {p1}, La75;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/model/RideStateKt;->isInGroupRide(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lco/bird/android/model/RideStatusManageRidesButton;

    invoke-virtual {p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->ride_action_manage_rides:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v0, "context.getString(L.stri\u2026ride_action_manage_rides)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/RideStatusManageRidesButton;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, La75;->g()Lco/bird/android/model/RideState;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->canEnd()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    move v0, v1

    :cond_1
    const-string p1, "context.getString(L.string.ride_action_end_ride)"

    if-eqz v0, :cond_2

    new-instance v0, Lco/bird/android/model/RideStatusEndButton;

    invoke-virtual {p0}, LtA;->m()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->ride_action_end_ride:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/RideStatusEndButton;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lco/bird/android/model/RideStatusEndButton;

    invoke-virtual {p0}, LtA;->m()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->ride_action_end_ride:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/RideStatusEndButton;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object p1, v0

    :goto_1
    return-object p1
.end method
