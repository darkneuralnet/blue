.class public final Lco/bird/android/model/persistence/BirdKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "TEST_BIRD",
        "Lco/bird/android/model/persistence/Bird;",
        "getTEST_BIRD",
        "()Lco/bird/android/model/persistence/Bird;",
        "model-persistence_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TEST_BIRD:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public static constructor <clinit>()V
    .locals 73

    sget-object v6, Lco/bird/android/model/constant/OwnershipKind;->OWNER:Lco/bird/android/model/constant/OwnershipKind;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v8

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-object/from16 v65, v0

    const-string v1, ""

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v9, "now()"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    new-instance v17, Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-object/from16 v16, v17

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1ff

    const/16 v30, 0x0

    invoke-direct/range {v17 .. v30}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lco/bird/android/model/constant/BirdBadgeType;->UNKNOWN:Lco/bird/android/model/constant/BirdBadgeType;

    sget-object v5, Lco/bird/android/model/constant/ChargerBirdBadgeType;->UNKNOWN:Lco/bird/android/model/constant/ChargerBirdBadgeType;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-object/from16 v29, v0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/persistence/nestedstructures/BirdLabel;-><init>(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v30

    sget-object v36, Lco/bird/android/model/constant/BountyKind;->UNKNOWN:Lco/bird/android/model/constant/BountyKind;

    sget-object v38, Lco/bird/android/model/constant/BirdTaskKind;->UNKNOWN:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-object/from16 v60, v0

    sget-object v1, Lco/bird/android/model/constant/Condition;->UNKNOWN:Lco/bird/android/model/constant/Condition;

    sget-object v2, Lco/bird/android/model/constant/SpecialCondition;->UNKNOWN:Lco/bird/android/model/constant/SpecialCondition;

    sget-object v3, Lco/bird/android/model/constant/BrainState;->UNKNOWN:Lco/bird/android/model/constant/BrainState;

    sget-object v4, Lco/bird/android/model/constant/Placement;->UNKNOWN:Lco/bird/android/model/constant/Placement;

    invoke-direct {v0, v1, v2, v3, v4}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;-><init>(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V

    sget-object v67, Lco/bird/android/model/constant/MapPinBadge;->UNKNOWN:Lco/bird/android/model/constant/MapPinBadge;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v68

    new-instance v0, Lco/bird/android/model/persistence/Bird;

    move-object v9, v0

    const-string v10, ""

    const-string v11, ""

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v17, ""

    const/16 v18, 0x0

    const-string v19, ""

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-string v33, ""

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x1

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

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v66, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    invoke-direct/range {v9 .. v72}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    sput-object v0, Lco/bird/android/model/persistence/BirdKt;->TEST_BIRD:Lco/bird/android/model/persistence/Bird;

    return-void
.end method

.method public static final getTEST_BIRD()Lco/bird/android/model/persistence/Bird;
    .locals 1

    sget-object v0, Lco/bird/android/model/persistence/BirdKt;->TEST_BIRD:Lco/bird/android/model/persistence/Bird;

    return-object v0
.end method
