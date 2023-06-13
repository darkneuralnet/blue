.class public final LVm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireArea;",
        "",
        "role",
        "Lco/bird/android/model/persistence/Area;",
        "a",
        "co.bird.android.repository.area"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireArea;Ljava/lang/String;)Lco/bird/android/model/persistence/Area;
    .locals 58

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v15, p1

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNotes()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getHideBirds()Z

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRejectDrops()Z

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNoRides()Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNoParking()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getPreferredParking()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getDelivery()Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->isReleaseConstrained()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->isDemandArea()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getFeeModified()Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getDemandLevel()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getOverlayLabel()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getOverlayMinZoomLevel()Ljava/lang/Integer;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getSelectedOverlayLabel()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getColor()I

    move-result v21

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getBorderColor()I

    move-result v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getTitleColor()I

    move-result v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getZoomBehavior()Lco/bird/android/model/constant/ZoomBehavior;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getOperational()Z

    move-result v28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getMaxSpeed()Ljava/lang/Integer;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getReleaseCapacity()Ljava/lang/Integer;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNoParkingFineAlertTitle()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNoParkingFineAlertMessage()Ljava/lang/String;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRiderBarInRideMessageTitle()Ljava/lang/String;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRiderBarInRideMessageBody()Ljava/lang/String;

    move-result-object v34

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRiderBarNotInRideMessageTitle()Ljava/lang/String;

    move-result-object v35

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRiderBarNotInRideMessageBody()Ljava/lang/String;

    move-result-object v36

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRiderBarInRideMessageIconType()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v37

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getRiderBarNotInRideMessageIconType()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v38

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getAreaReleaseCapacityIconType()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v39

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getPartnerId()Ljava/lang/String;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getFleetIds()Ljava/util/List;

    move-result-object v41

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getAreaKeys()Ljava/util/List;

    move-result-object v42

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->isUniversalArea()Z

    move-result v43

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNoParkingFineCurrency()Ljava/lang/String;

    move-result-object v44

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getNoParkingFineAmount()Ljava/lang/Integer;

    move-result-object v47

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getAreasMerged()Ljava/util/List;

    move-result-object v48

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireArea;->getCenterPoint()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LqB0;->a(Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object/from16 v49, v1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    move-object/from16 v51, v1

    new-instance v57, Lco/bird/android/model/persistence/Area;

    move-object v15, v1

    move-object/from16 v1, v57

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    move-object/from16 p0, v1

    const-string v1, "now()"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v52, 0x0

    sget-object v53, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v54, 0x0

    const/16 v55, 0x1800

    const/16 v56, 0x0

    move-object v15, v0

    move-object/from16 v50, p1

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v56}, Lco/bird/android/model/persistence/Area;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v57
.end method
