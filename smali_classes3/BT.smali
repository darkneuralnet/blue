.class public final LBT;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBT$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\u000c\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u001a\u000c\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u001a\u000c\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\u0016\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Bird;",
        "Lco/bird/android/model/VehicleDescriptor;",
        "g",
        "Lco/bird/android/model/wire/WireBird;",
        "h",
        "f",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "Lco/bird/android/model/wire/WireLocation;",
        "c",
        "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
        "Lco/bird/android/model/wire/WireLifecycle;",
        "d",
        "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;",
        "Lco/bird/android/model/wire/WirePrivateBird;",
        "e",
        "",
        "b",
        "",
        "Lco/bird/android/model/constant/PartKind;",
        "",
        "a",
        "extension_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/persistence/Bird;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Bird;",
            ")",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PartKind;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LBT;->f(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/model/wire/WireBirdKt;->birdModel(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/constant/BirdModel;

    move-result-object v0

    sget-object v1, LBT$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/model/constant/PartKind;->CHASSIS:Lco/bird/android/model/constant/PartKind;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object v0, Lco/bird/android/model/constant/PartKind;->BLE_MAC_ADDRESS:Lco/bird/android/model/constant/PartKind;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getBleMacAddress()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p0, ""

    :cond_2
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final b(Lco/bird/android/model/persistence/Bird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Condition;->NEEDS_SERVICE:Lco/bird/android/model/constant/Condition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireLocation;
    .locals 13

    new-instance v12, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getHeading()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getSpeed()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getAltitude()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getAccuracy()Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getMocked()Z

    move-result v9

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getTime()Lorg/joda/time/DateTime;

    move-result-object v10

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getSource()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    move-object v11, p0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;)V

    return-object v12
.end method

.method public static final d(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;)Lco/bird/android/model/wire/WireLifecycle;
    .locals 4

    new-instance v0, Lco/bird/android/model/wire/WireLifecycle;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/wire/WireLifecycle;-><init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/persistence/nestedstructures/PrivateBird;)Lco/bird/android/model/wire/WirePrivateBird;
    .locals 9

    new-instance v8, Lco/bird/android/model/wire/WirePrivateBird;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getEndedAt()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getUserFirstScanAt()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getOwnershipKind()Lco/bird/android/model/constant/OwnershipKind;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/WirePrivateBird;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-object v8
.end method

.method public static final f(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;
    .locals 73

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getTaskId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBatteryLevel()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDistance()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    invoke-static {v0}, LBT;->c(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCode()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getStickerId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDisconnected()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCollect()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getSubmerged()Z

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLost()Z

    move-result v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getAckLocked()Z

    move-result v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCaptive()Z

    move-result v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getGpsFix()Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBroken()Z

    move-result v21

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getActions()Ljava/util/List;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyId()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyPrice()Ljava/lang/Integer;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyCurrency()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyLost()Z

    move-result v27

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyOverdue()Z

    move-result v28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBrandName()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getGpsAt()Lorg/joda/time/DateTime;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getTrackedAt()Lorg/joda/time/DateTime;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getToken()Ljava/lang/String;

    move-result-object v34

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBluetooth()Z

    move-result v35

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCellular()Z

    move-result v36

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v37

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDueAt()Lorg/joda/time/DateTime;

    move-result-object v38

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getAsleep()Z

    move-result v39

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getImei()Ljava/lang/String;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBoardProtocol()Ljava/lang/String;

    move-result-object v41

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPriorityCollect()Z

    move-result v43

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDown()Z

    move-result v44

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getNeedsInspection()Z

    move-result v45

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPartnerId()Ljava/lang/String;

    move-result-object v46

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getNestId()Ljava/lang/String;

    move-result-object v47

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLastRideEndedAt()Lorg/joda/time/DateTime;

    move-result-object v48

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPartnerBirdState()Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v49

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPeril()Z

    move-result v50

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDeliverable()Z

    move-result v51

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v0

    invoke-static {v0}, LBT;->d(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;)Lco/bird/android/model/wire/WireLifecycle;

    move-result-object v52

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getOffline()Z

    move-result v53

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getAreaKey()Ljava/lang/String;

    move-result-object v55

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getNestPurpose()Lco/bird/android/model/constant/NestPurpose;

    move-result-object v57

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LBT;->e(Lco/bird/android/model/persistence/nestedstructures/PrivateBird;)Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v58, v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getScannedAt()Lorg/joda/time/DateTime;

    move-result-object v59

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBadgeType()Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v60

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getEphemeralId()Ljava/lang/String;

    move-result-object v63

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v66

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLocationUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v65

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getHasHelmet()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v64

    new-instance v0, Lco/bird/android/model/wire/WireBird;

    move-object v2, v0

    const/16 v22, 0x0

    const/16 v42, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/high16 v69, 0x80000

    const v70, 0xc280080

    const/16 v71, 0x3

    const/16 v72, 0x0

    invoke-direct/range {v2 .. v72}, Lco/bird/android/model/wire/WireBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final g(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/VehicleDescriptor;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/VehicleDescriptor;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getImei()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/VehicleDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final h(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/VehicleDescriptor;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/VehicleDescriptor;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/VehicleDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
