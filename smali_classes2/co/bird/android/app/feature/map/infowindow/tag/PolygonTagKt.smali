.class public final Lco/bird/android/app/feature/map/infowindow/tag/PolygonTagKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "toPolygonTag",
        "Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;",
        "Lco/bird/android/model/persistence/Area;",
        "config",
        "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
        "co.bird.android.feature.map"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toPolygonTag(Lco/bird/android/model/persistence/Area;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;
    .locals 17

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->toolTipTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getNotes()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getTitleColor()I

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    move-object v4, v5

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getTitleColor()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->popupType()Lco/bird/android/model/constant/PopupType;

    move-result-object v6

    sget-object v7, Lco/bird/android/model/constant/PopupType;->INFO_WINDOW:Lco/bird/android/model/constant/PopupType;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v6, v7, :cond_1

    move v6, v8

    goto :goto_1

    :cond_1
    move v6, v9

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->isOperationalInverse()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getNoRides()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    move v7, v9

    goto :goto_3

    :cond_3
    :goto_2
    move v7, v8

    :goto_3
    if-eqz p1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->getNoRide()Lco/bird/android/model/wire/configs/ZoneColorConfig;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lco/bird/android/model/wire/configs/ZoneColorConfig;->getBorderColor()Lco/bird/android/model/wire/configs/MobileColorConfig;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lco/bird/android/model/wire/configs/MobileColorConfig;->getLightMode()Ljava/lang/Integer;

    move-result-object v10

    goto :goto_4

    :cond_4
    move-object v10, v5

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getNoParking()Z

    move-result v11

    if-eqz p1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->getNoParking()Lco/bird/android/model/wire/configs/ZoneColorConfig;

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-virtual {v12}, Lco/bird/android/model/wire/configs/ZoneColorConfig;->getBorderColor()Lco/bird/android/model/wire/configs/MobileColorConfig;

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-virtual {v12}, Lco/bird/android/model/wire/configs/MobileColorConfig;->getLightMode()Ljava/lang/Integer;

    move-result-object v12

    goto :goto_5

    :cond_5
    move-object v12, v5

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Area;->getMaxSpeed()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_6

    move v13, v8

    goto :goto_6

    :cond_6
    move v13, v9

    :goto_6
    if-eqz p1, :cond_7

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->getSlow()Lco/bird/android/model/wire/configs/ZoneColorConfig;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ZoneColorConfig;->getBorderColor()Lco/bird/android/model/wire/configs/MobileColorConfig;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/MobileColorConfig;->getLightMode()Ljava/lang/Integer;

    move-result-object v1

    move-object v14, v1

    goto :goto_7

    :cond_7
    move-object v14, v5

    :goto_7
    const/4 v15, 0x0

    if-eqz p1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->getParking()Lco/bird/android/model/wire/configs/ZoneColorConfig;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ZoneColorConfig;->getBorderColor()Lco/bird/android/model/wire/configs/MobileColorConfig;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/MobileColorConfig;->getLightMode()Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_8

    :cond_8
    move-object/from16 v16, v5

    :goto_8
    move-object v1, v0

    move v5, v6

    move v6, v7

    move-object v7, v10

    move v8, v11

    move-object v9, v12

    move v10, v13

    move-object v11, v14

    move v12, v15

    move-object/from16 v13, v16

    invoke-direct/range {v1 .. v13}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)V

    return-object v0
.end method

.method public static synthetic toPolygonTag$default(Lco/bird/android/model/persistence/Area;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ILjava/lang/Object;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTagKt;->toPolygonTag(Lco/bird/android/model/persistence/Area;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    move-result-object p0

    return-object p0
.end method
