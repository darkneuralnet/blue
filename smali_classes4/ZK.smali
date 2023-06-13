.class public final LZK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u000c\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u000f\u001a\n\u0010\u0014\u001a\u00020\u0013*\u00020\u0012\u001a\n\u0010\u0017\u001a\u00020\u0016*\u00020\u0015\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0018\u001a\u0012\u0010\u001e\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c\u001a\n\u0010\u001f\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010 \u001a\u00020\u000f*\u00020\u0010\u001a\n\u0010!\u001a\u00020\u0015*\u00020\u0016\u001a\n\u0010\"\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010#\u001a\u00020\t*\u00020\n\u001a\n\u0010$\u001a\u00020\u000c*\u00020\r\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/persistence/Bird;",
        "a",
        "Lco/bird/android/model/wire/WireBirdLabel;",
        "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;",
        "b",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;",
        "f",
        "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;",
        "Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;",
        "g",
        "Lco/bird/android/model/wire/WireSmartlock;",
        "Lco/bird/android/model/persistence/nestedstructures/Smartlock;",
        "i",
        "Lco/bird/android/model/wire/WireLifecycle;",
        "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;",
        "e",
        "Lco/bird/android/model/wire/WireBirdLicenseView;",
        "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;",
        "c",
        "Lco/bird/android/model/wire/WirePrivateBird;",
        "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;",
        "h",
        "Lco/bird/android/model/wire/WireBountyReason;",
        "Lco/bird/android/model/persistence/nestedstructures/BountyReason;",
        "d",
        "LTk5;",
        "",
        "model",
        "j",
        "p",
        "k",
        "n",
        "l",
        "m",
        "o",
        "bird_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdConversion.kt\nco/bird/android/repository/converter/BirdConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1549#2:394\n1620#2,3:395\n1549#2:398\n1620#2,3:399\n1549#2:402\n1620#2,3:403\n1549#2:406\n1620#2,3:407\n1549#2:410\n1620#2,3:411\n1549#2:414\n1620#2,3:415\n*S KotlinDebug\n*F\n+ 1 BirdConversion.kt\nco/bird/android/repository/converter/BirdConversionKt\n*L\n82#1:394\n82#1:395,3\n100#1:398\n100#1:399,3\n126#1:402\n126#1:403,3\n127#1:406\n127#1:407,3\n368#1:410\n368#1:411,3\n369#1:414\n369#1:415,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/persistence/Bird;
    .locals 67

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getTaskId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getDistance()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    invoke-static {v0}, LqB0;->a(Lco/bird/android/model/wire/WireLocation;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getStickerId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getDisconnected()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getCollect()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getSubmerged()Z

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLost()Z

    move-result v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLocked()Z

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getAckLocked()Z

    move-result v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getCaptive()Z

    move-result v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getGpsFix()Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBroken()Z

    move-result v21

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLabel()Lco/bird/android/model/wire/WireBirdLabel;

    move-result-object v0

    invoke-static {v0}, LZK;->b(Lco/bird/android/model/wire/WireBirdLabel;)Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getActions()Ljava/util/List;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyId()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyPrice()Ljava/lang/Integer;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyCurrency()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyLost()Z

    move-result v27

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyOverdue()Z

    move-result v28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBrandName()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getGpsAt()Lorg/joda/time/DateTime;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getTrackedAt()Lorg/joda/time/DateTime;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getToken()Ljava/lang/String;

    move-result-object v34

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBluetooth()Z

    move-result v35

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getCellular()Z

    move-result v36

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v37

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getDueAt()Lorg/joda/time/DateTime;

    move-result-object v38

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getAsleep()Z

    move-result v39

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getImei()Ljava/lang/String;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBoardProtocol()Ljava/lang/String;

    move-result-object v41

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPhysicalLock()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LZK;->f(Lco/bird/android/model/wire/WirePhysicalLock;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v0

    move-object/from16 v42, v0

    goto :goto_0

    :cond_0
    const/16 v42, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v0

    const/16 v2, 0xa

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    move/from16 v44, v15

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v1, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-static {v15}, LZK;->f(Lco/bird/android/model/wire/WirePhysicalLock;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v15

    invoke-interface {v1, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move/from16 v44, v15

    const/4 v1, 0x0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPriorityCollect()Z

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getDown()Z

    move-result v45

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getNeedsInspection()Z

    move-result v46

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v47

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getNestId()Ljava/lang/String;

    move-result-object v48

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLastRideEndedAt()Lorg/joda/time/DateTime;

    move-result-object v49

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPartnerBirdState()Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v50

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPeril()Z

    move-result v51

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getDeliverable()Z

    move-result v52

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object v15

    invoke-static {v15}, LZK;->e(Lco/bird/android/model/wire/WireLifecycle;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v53

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getOffline()Z

    move-result v54

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLicense()Lco/bird/android/model/wire/WireBirdLicenseView;

    move-result-object v15

    if-eqz v15, :cond_3

    invoke-static {v15}, LZK;->c(Lco/bird/android/model/wire/WireBirdLicenseView;)Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-result-object v15

    move-object/from16 v55, v15

    goto :goto_2

    :cond_3
    const/16 v55, 0x0

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getAreaKey()Ljava/lang/String;

    move-result-object v56

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getNestPurpose()Lco/bird/android/model/constant/NestPurpose;

    move-result-object v57

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v15

    if-eqz v15, :cond_4

    invoke-static {v15}, LZK;->h(Lco/bird/android/model/wire/WirePrivateBird;)Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v15

    move-object/from16 v58, v15

    goto :goto_3

    :cond_4
    const/16 v58, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getScannedAt()Lorg/joda/time/DateTime;

    move-result-object v59

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBadgeType()Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v60

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBountyReasons()Ljava/util/List;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    move/from16 v61, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v15, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lco/bird/android/model/wire/WireBountyReason;

    invoke-static {v15}, LZK;->d(Lco/bird/android/model/wire/WireBountyReason;)Lco/bird/android/model/persistence/nestedstructures/BountyReason;

    move-result-object v15

    invoke-interface {v0, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getEphemeralId()Ljava/lang/String;

    move-result-object v62

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v63

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getLocationUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v65

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireBird;->getHasHelmet()Z

    move-result v15

    new-instance v66, Lco/bird/android/model/persistence/Bird;

    move-object/from16 v2, v66

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v64

    move/from16 v15, v44

    move-object/from16 v43, v1

    move/from16 v44, v61

    move-object/from16 v61, v0

    invoke-direct/range {v2 .. v65}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    return-object v66
.end method

.method public static final b(Lco/bird/android/model/wire/WireBirdLabel;)Lco/bird/android/model/persistence/nestedstructures/BirdLabel;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBirdLabel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBirdLabel;->getColor()I

    move-result v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBirdLabel;->getMarker()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBirdLabel;->getBadgeType()Lco/bird/android/model/constant/BirdBadgeType;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBirdLabel;->getChargerBadgeType()Lco/bird/android/model/constant/ChargerBirdBadgeType;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;-><init>(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireBirdLicenseView;)Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBirdLicenseView;->getCode()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/wire/WireBountyReason;)Lco/bird/android/model/persistence/nestedstructures/BountyReason;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/BountyReason;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBountyReason;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBountyReason;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/BountyReason;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/wire/WireLifecycle;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;-><init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V

    return-object v0
.end method

.method public static final f(Lco/bird/android/model/wire/WirePhysicalLock;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getCombination()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getLockInstructions()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getUnlockInstructions()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getTutorialSteps()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xa

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    invoke-static {v10}, LZK;->g(Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v9, v8

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getEndRideTutorialSteps()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    invoke-static {v1}, LZK;->g(Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;

    move-result-object v1

    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v10, v8

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, LZK;->i(Lco/bird/android/model/wire/WireSmartlock;)Lco/bird/android/model/persistence/nestedstructures/Smartlock;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v8

    :goto_2
    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v11

    new-instance p0, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-object v1, p0

    move-object v8, v9

    move-object v9, v10

    move-object v10, v0

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Smartlock;Lco/bird/android/model/constant/PhysicalLockPurpose;)V

    return-object p0
.end method

.method public static final g(Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;->getBody()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final h(Lco/bird/android/model/wire/WirePrivateBird;)Lco/bird/android/model/persistence/nestedstructures/PrivateBird;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getUserId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getEndedAt()Lorg/joda/time/DateTime;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getUserFirstScanAt()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getOwnershipKind()Lco/bird/android/model/constant/OwnershipKind;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/model/wire/WirePrivateBird;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v9

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final i(Lco/bird/android/model/wire/WireSmartlock;)Lco/bird/android/model/persistence/nestedstructures/Smartlock;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Smartlock;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSmartlock;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSmartlock;->getPhysicalLockId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSmartlock;->getTokenRequest()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSmartlock;->getTokenRequests()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireSmartlock;->getVendor()Lco/bird/android/model/constant/SmartlockVendor;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/SmartlockVendor;)V

    return-object v0
.end method

.method public static final j(LTk5;Ljava/lang/String;)Lco/bird/android/model/persistence/Bird;
    .locals 66

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LTk5;->a()Lne5;

    move-result-object v0

    invoke-interface {v0}, Lne5;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, LUk5;->c(LTk5;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v2, 0x5

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    move-object v10, v0

    invoke-virtual/range {p0 .. p0}, LTk5;->a()Lne5;

    move-result-object v0

    invoke-interface {v0}, Lne5;->e()Ljava/lang/String;

    move-result-object v12

    sget-object v17, Lco/bird/android/model/constant/OwnershipKind;->OWNER:Lco/bird/android/model/constant/OwnershipKind;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v2

    new-instance v58, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    const-string v5, "macAddress"

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    const-string v14, ""

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v6, "now()"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, v58

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    invoke-direct/range {v11 .. v19}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    invoke-static/range {p0 .. p0}, LUk5;->c(LTk5;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, LTk5;->a()Lne5;

    move-result-object v0

    invoke-interface {v0}, Lne5;->e()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v12, v0

    new-instance v13, Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-object v9, v13

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x1ff

    const/16 v26, 0x0

    invoke-direct/range {v13 .. v26}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v31, Lco/bird/android/model/constant/BirdBadgeType;->UNKNOWN:Lco/bird/android/model/constant/BirdBadgeType;

    sget-object v32, Lco/bird/android/model/constant/ChargerBirdBadgeType;->UNKNOWN:Lco/bird/android/model/constant/ChargerBirdBadgeType;

    new-instance v27, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-object/from16 v22, v27

    const-string v28, ""

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v27 .. v32}, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;-><init>(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v23

    sget-object v29, Lco/bird/android/model/constant/BountyKind;->UNKNOWN:Lco/bird/android/model/constant/BountyKind;

    sget-object v31, Lco/bird/android/model/constant/BirdTaskKind;->UNKNOWN:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-object/from16 v53, v0

    sget-object v2, Lco/bird/android/model/constant/Condition;->UNKNOWN:Lco/bird/android/model/constant/Condition;

    sget-object v6, Lco/bird/android/model/constant/SpecialCondition;->UNKNOWN:Lco/bird/android/model/constant/SpecialCondition;

    sget-object v7, Lco/bird/android/model/constant/BrainState;->UNKNOWN:Lco/bird/android/model/constant/BrainState;

    sget-object v8, Lco/bird/android/model/constant/Placement;->UNKNOWN:Lco/bird/android/model/constant/Placement;

    invoke-direct {v0, v2, v6, v7, v8}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;-><init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V

    sget-object v60, Lco/bird/android/model/constant/MapPinBadge;->UNKNOWN:Lco/bird/android/model/constant/MapPinBadge;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v61

    invoke-virtual/range {p0 .. p0}, LTk5;->a()Lne5;

    move-result-object v0

    invoke-interface {v0}, Lne5;->e()Ljava/lang/String;

    move-result-object v63

    new-instance v0, Lco/bird/android/model/persistence/Bird;

    move-object v2, v0

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-string v1, "deviceName() ?: bleDevice.macAddress"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const-string v26, ""

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x1

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    move-object/from16 v4, p1

    invoke-direct/range {v2 .. v65}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final k(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;)Lco/bird/android/model/wire/WireLifecycle;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public static final l(Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;)Lco/bird/android/model/wire/WirePhysicalLock;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getKind()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getCombination()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getLockInstructions()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getUnlockInstructions()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getTutorialSteps()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xa

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;

    invoke-static {v10}, LZK;->m(Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;)Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v9, v8

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getEndRideTutorialSteps()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;

    invoke-static {v1}, LZK;->m(Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;)Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    move-result-object v1

    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v10, v8

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getSmartlock()Lco/bird/android/model/persistence/nestedstructures/Smartlock;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, LZK;->o(Lco/bird/android/model/persistence/nestedstructures/Smartlock;)Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v8

    :goto_2
    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v11

    new-instance p0, Lco/bird/android/model/wire/WirePhysicalLock;

    move-object v1, p0

    move-object v8, v9

    move-object v9, v10

    move-object v10, v0

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/wire/WirePhysicalLock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireSmartlock;Lco/bird/android/model/constant/PhysicalLockPurpose;)V

    return-object p0
.end method

.method public static final m(Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;)Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;->getBody()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final n(Lco/bird/android/model/persistence/nestedstructures/PrivateBird;)Lco/bird/android/model/wire/WirePrivateBird;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WirePrivateBird;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getEndedAt()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getUserFirstScanAt()Lorg/joda/time/DateTime;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getOwnershipKind()Lco/bird/android/model/constant/OwnershipKind;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/wire/WirePrivateBird;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public static final o(Lco/bird/android/model/persistence/nestedstructures/Smartlock;)Lco/bird/android/model/wire/WireSmartlock;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireSmartlock;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;->getPhysicalLockId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;->getMacAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;->getTokenRequest()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;->getTokenRequests()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/Smartlock;->getVendor()Lco/bird/android/model/constant/SmartlockVendor;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/wire/WireSmartlock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/SmartlockVendor;)V

    return-object v0
.end method

.method public static final p(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;
    .locals 72

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getTaskId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBatteryLevel()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDistance()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    invoke-static {v0}, LqB0;->g(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getStickerId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDisconnected()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCollect()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getSubmerged()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLost()Z

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getAckLocked()Z

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCaptive()Z

    move-result v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getGpsFix()Z

    move-result v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBroken()Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getActions()Ljava/util/List;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyId()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyPrice()Ljava/lang/Integer;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyCurrency()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyLost()Z

    move-result v26

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyOverdue()Z

    move-result v27

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBrandName()Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getGpsAt()Lorg/joda/time/DateTime;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getTrackedAt()Lorg/joda/time/DateTime;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getToken()Ljava/lang/String;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBluetooth()Z

    move-result v34

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getCellular()Z

    move-result v35

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v36

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDueAt()Lorg/joda/time/DateTime;

    move-result-object v37

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getAsleep()Z

    move-result v38

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getImei()Ljava/lang/String;

    move-result-object v39

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBoardProtocol()Ljava/lang/String;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPriorityCollect()Z

    move-result v42

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDown()Z

    move-result v43

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getNeedsInspection()Z

    move-result v44

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPartnerId()Ljava/lang/String;

    move-result-object v45

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getNestId()Ljava/lang/String;

    move-result-object v46

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLastRideEndedAt()Lorg/joda/time/DateTime;

    move-result-object v47

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPartnerBirdState()Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v48

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPeril()Z

    move-result v49

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getDeliverable()Z

    move-result v50

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v0

    invoke-static {v0}, LZK;->k(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;)Lco/bird/android/model/wire/WireLifecycle;

    move-result-object v51

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getOffline()Z

    move-result v52

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getAreaKey()Ljava/lang/String;

    move-result-object v54

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getNestPurpose()Lco/bird/android/model/constant/NestPurpose;

    move-result-object v56

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v0

    const/16 v21, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, LZK;->n(Lco/bird/android/model/persistence/nestedstructures/PrivateBird;)Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    move-object/from16 v57, v0

    goto :goto_0

    :cond_0
    move-object/from16 v57, v21

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getScannedAt()Lorg/joda/time/DateTime;

    move-result-object v58

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBadgeType()Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v59

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getEphemeralId()Ljava/lang/String;

    move-result-object v62

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v65

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getLocationUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v64

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getHasHelmet()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v63

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/Bird;->getPhysicalLock()Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LZK;->l(Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;)Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    move-object/from16 v41, v0

    goto :goto_1

    :cond_1
    move-object/from16 v41, v21

    :goto_1
    new-instance v0, Lco/bird/android/model/wire/WireBird;

    move-object v1, v0

    const/16 v21, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/high16 v68, 0x80000

    const/high16 v69, 0xc280000

    const/16 v70, 0x3

    const/16 v71, 0x0

    invoke-direct/range {v1 .. v71}, Lco/bird/android/model/wire/WireBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
