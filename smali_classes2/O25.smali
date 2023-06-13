.class public final LO25;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\"\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a*\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005\u00a8\u0006\r"
    }
    d2 = {
        "Li25;",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "LgR4;",
        "warning",
        "",
        "endRideAllowed",
        "LzQ4;",
        "b",
        "endRideWasAllowed",
        "endRideChosen",
        "LyQ4;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Li25;Lco/bird/android/model/wire/WireRide;LgR4;ZZ)LyQ4;
    .locals 39

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ride"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warning"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->r()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    new-instance v35, LyQ4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {p0 .. p1}, Li25;->C4(Lco/bird/android/model/wire/WireRide;)Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v8

    const/4 v9, 0x1

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lco/bird/android/model/wire/WireBird;->getCellular()Z

    move-result v8

    if-ne v8, v9, :cond_0

    move v8, v9

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v11

    if-eqz v11, :cond_1

    invoke-virtual {v11}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_2

    :cond_1
    const-string v11, ""

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getCurrency()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v13

    double-to-long v13, v13

    const/4 v15, 0x0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMinimumRidePrice()J

    move-result-wide v16

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMinutePrice()J

    move-result-wide v18

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getIncludedMinutes()I

    move-result v10

    move/from16 v22, v7

    int-to-long v6, v10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v10

    const/16 v23, 0x0

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v24, v10

    goto :goto_1

    :cond_3
    move-object/from16 v24, v23

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object v10

    invoke-virtual {v10}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v26

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getBasePrice()J

    move-result-wide v27

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Li25;->g4()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_4
    move-object/from16 v10, v23

    :goto_2
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/DateTime;

    :cond_5
    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v10, v2}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2}, Lco/bird/android/model/RideStatesKt;->isPrimaryRide(Lco/bird/android/model/RideState;)Z

    move-result v2

    if-ne v2, v9, :cond_6

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    :goto_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v2

    invoke-interface {v2}, LYR4;->o0()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/RideStates;

    invoke-virtual {v2}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v2

    int-to-long v9, v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v36

    invoke-virtual/range {p2 .. p2}, LgR4;->toString()Ljava/lang/String;

    move-result-object v37

    invoke-virtual/range {p2 .. p2}, LgR4;->c()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v38, v2

    goto :goto_4

    :cond_7
    move-object/from16 v38, v23

    :goto_4
    invoke-virtual/range {p0 .. p0}, Li25;->X3()LXc1;

    move-result-object v1

    invoke-interface {v1}, LXc1;->n()Ljava/lang/String;

    move-result-object v32

    const v33, 0x60107

    const/16 v34, 0x0

    move-object/from16 v1, v35

    move-object v2, v4

    move-object v3, v5

    const/4 v4, 0x0

    move/from16 v5, v22

    move-wide/from16 v20, v6

    move v6, v8

    move-object v7, v11

    move-object v8, v12

    move-wide v9, v13

    move-object v11, v15

    move-wide/from16 v12, v16

    move-wide/from16 v14, v18

    move-wide/from16 v16, v20

    move-object/from16 v18, v24

    move-object/from16 v19, v25

    move/from16 v20, v26

    move-wide/from16 v21, v27

    move-object/from16 v23, v0

    move-object/from16 v24, v29

    move-object/from16 v25, v30

    move-object/from16 v26, v31

    move-object/from16 v27, v36

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move/from16 v30, p3

    move/from16 v31, p4

    invoke-direct/range {v1 .. v34}, LyQ4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v35
.end method

.method public static final b(Li25;Lco/bird/android/model/wire/WireRide;LgR4;Z)LzQ4;
    .locals 42

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ride"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warning"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->r()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    new-instance v40, LzQ4;

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p1}, Li25;->C4(Lco/bird/android/model/wire/WireRide;)Z

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    const/4 v10, 0x1

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getCellular()Z

    move-result v5

    if-ne v5, v10, :cond_2

    move v12, v10

    goto :goto_0

    :cond_2
    const/4 v12, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    :cond_3
    const-string v5, ""

    :cond_4
    move-object v13, v5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getCurrency()Ljava/lang/String;

    move-result-object v14

    move v15, v12

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getDistance()D

    move-result-wide v11

    double-to-long v11, v11

    const/16 v16, 0x0

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getMinimumRidePrice()J

    move-result-wide v17

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getMinutePrice()J

    move-result-wide v19

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getIncludedMinutes()I

    move-result v5

    move/from16 v23, v9

    int-to-long v8, v5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    const/16 v24, 0x0

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v25, v5

    goto :goto_1

    :cond_5
    move-object/from16 v25, v24

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v27

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getBasePrice()J

    move-result-wide v28

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v4

    if-nez v4, :cond_7

    invoke-virtual/range {p0 .. p0}, Li25;->g4()Ljava/util/Map;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_6
    move-object/from16 v5, v24

    :goto_2
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/joda/time/DateTime;

    :cond_7
    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, LYR4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lco/bird/android/model/RideStatesKt;->isPrimaryRide(Lco/bird/android/model/RideState;)Z

    move-result v2

    if-ne v2, v10, :cond_8

    goto :goto_3

    :cond_8
    const/4 v10, 0x0

    :goto_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Li25;->f4()LYR4;

    move-result-object v5

    invoke-interface {v5}, LYR4;->o0()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/RideStates;

    invoke-virtual {v5}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v5

    move-wide/from16 v32, v8

    int-to-long v7, v5

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v34

    invoke-virtual/range {p2 .. p2}, LgR4;->toString()Ljava/lang/String;

    move-result-object v41

    invoke-virtual/range {p2 .. p2}, LgR4;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v7, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_4

    :cond_9
    move-object/from16 v3, v24

    :goto_4
    invoke-virtual/range {p0 .. p0}, Li25;->X3()LXc1;

    move-result-object v1

    invoke-interface {v1}, LXc1;->n()Ljava/lang/String;

    move-result-object v35

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getNestSearchAccuracyRadiusLimit()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v36

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingConfig;->getRiderNestAdditionalBufferMeters()Ljava/lang/Double;

    move-result-object v37

    const v38, 0x60107

    const/16 v39, 0x0

    move-object/from16 v5, v40

    const/4 v0, 0x0

    move-object v7, v0

    move-wide/from16 v21, v32

    const/4 v0, 0x0

    move-object v8, v0

    move/from16 v9, v23

    move v10, v15

    move-wide v0, v11

    move-object v11, v13

    move-object v12, v14

    move-wide v13, v0

    move-object/from16 v15, v16

    move-wide/from16 v16, v17

    move-wide/from16 v18, v19

    move-wide/from16 v20, v21

    move-object/from16 v22, v25

    move-object/from16 v23, v26

    move/from16 v24, v27

    move-wide/from16 v25, v28

    move-object/from16 v27, v4

    move-object/from16 v28, v30

    move-object/from16 v29, v31

    move-object/from16 v30, v2

    move-object/from16 v31, v34

    move-object/from16 v32, v41

    move-object/from16 v33, v3

    move/from16 v34, p3

    invoke-direct/range {v5 .. v39}, LzQ4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v40
.end method
