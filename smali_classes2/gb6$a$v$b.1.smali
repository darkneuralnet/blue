.class public final Lgb6$a$v$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb6$a$v;->a(LSa6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/wire/configs/Config;",
        "Ljava/lang/Boolean;",
        "Lco/bird/android/model/wire/configs/Config;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "",
        "value",
        "a",
        "(Lco/bird/android/model/wire/configs/Config;Z)Lco/bird/android/model/wire/configs/Config;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lgb6$a$v$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb6$a$v$b;

    invoke-direct {v0}, Lgb6$a$v$b;-><init>()V

    sput-object v0, Lgb6$a$v$b;->g:Lgb6$a$v$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/Config;Z)Lco/bird/android/model/wire/configs/Config;
    .locals 176

    move-object/from16 v0, p1

    move/from16 v121, p2

    const-string v1, "config"

    move-object/from16 v15, p1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

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

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v128

    const/16 v129, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v91

    invoke-virtual/range {v91 .. v91}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v130

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v91

    invoke-virtual/range {v91 .. v91}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v91

    invoke-virtual/range {v91 .. v91}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getIdTool()Lco/bird/android/model/wire/configs/OperatorIdToolConfig;

    move-result-object v91

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const v125, -0x20000001

    const/16 v126, 0x1

    const/16 v127, 0x0

    invoke-static/range {v91 .. v127}, Lco/bird/android/model/wire/configs/OperatorIdToolConfig;->copy$default(Lco/bird/android/model/wire/configs/OperatorIdToolConfig;ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZIIIILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorIdToolConfig;

    move-result-object v137

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const/16 v148, 0x0

    const/16 v149, 0x0

    const/16 v150, 0x0

    const/16 v151, 0x0

    const/16 v152, 0x0

    const/16 v153, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const/16 v156, 0x0

    const/16 v157, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const v160, 0x1fffffbf

    const/16 v161, 0x0

    invoke-static/range {v130 .. v161}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->copy$default(Lco/bird/android/model/wire/configs/OperatorFeatureConfig;Lco/bird/android/model/wire/configs/OperatorMapConfig;Lco/bird/android/model/wire/configs/OperatorBulkScannerConfig;Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;Lco/bird/android/model/wire/configs/OperatorTaskListConfig;Lco/bird/android/model/wire/configs/OperatorNestMapConfig;Lco/bird/android/model/wire/configs/OperatorIdToolConfig;Lco/bird/android/model/wire/configs/OperatorReplaceQrConfig;Lco/bird/android/model/wire/configs/OperatorCommandCenterConfig;Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;ZZZLco/bird/android/model/wire/configs/OperatorRepairConfig;Lco/bird/android/model/wire/configs/HealthCheckConfig;Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;Lco/bird/android/model/wire/configs/MaintenanceConfig;Lco/bird/android/model/wire/configs/OperatorReportConfig;Lco/bird/android/model/wire/configs/OperatorReleaseConfig;Lco/bird/android/model/wire/configs/TransferOrderConfig;Lco/bird/android/model/wire/configs/OperatorSettingsConfig;Lco/bird/android/model/wire/configs/OperatorBatterySwapConfig;Lco/bird/android/model/wire/configs/VehicleInventoryTrackingConfig;Lco/bird/android/model/wire/configs/OperatorFleetReportConfig;Lco/bird/android/model/wire/configs/ArParkingConfig;Lco/bird/android/model/wire/configs/OperatorNestClaimsConfig;Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;Lco/bird/android/model/wire/configs/OperatorZoneMapConfig;Lco/bird/android/model/wire/configs/OperatorNotificationCenterConfig;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v93

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v97, 0x0

    const/16 v100, 0xfd

    const/16 v101, 0x0

    move-object/from16 v91, v128

    move/from16 v92, v129

    invoke-static/range {v91 .. v101}, Lco/bird/android/model/wire/configs/OperatorConfig;->copy$default(Lco/bird/android/model/wire/configs/OperatorConfig;ZLco/bird/android/model/wire/configs/OperatorFeatureConfig;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/wire/configs/OperatorPermissionsConfig;ZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v91

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v105, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v121, 0x0

    const-wide/16 v124, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v132, 0x0

    const/16 v135, 0x0

    const/16 v137, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const-wide/16 v149, 0x0

    const-wide/16 v151, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, 0x0

    const/16 v165, 0x0

    const/16 v166, 0x0

    const/16 v167, 0x0

    const/16 v168, 0x0

    const/16 v169, 0x0

    const/16 v170, -0x1

    const/16 v171, -0x1

    const v172, -0x80001

    const/16 v173, -0x1

    const v174, 0x7fffffff

    const/16 v175, 0x0

    invoke-static/range {v0 .. v175}, Lco/bird/android/model/wire/configs/Config;->copy$default(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireHabitatStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/configs/AssetConfig;Lco/bird/android/model/wire/configs/BrazeConfig;Ljava/util/List;Lco/bird/android/model/wire/configs/BirdPlusConfig;ZDZZLco/bird/android/model/wire/configs/FraudConfig;Lco/bird/android/model/wire/configs/LeaseConfig;Ljava/lang/Integer;Ljava/lang/Integer;Lco/bird/android/model/wire/configs/LocalConfig;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/wire/configs/BountyConfig;Lco/bird/android/model/wire/configs/TaxIdConfig;ZIDDLco/bird/android/model/constant/IdCardTerminology;Lco/bird/android/model/wire/configs/IdentificationConfig;DDLjava/lang/Boolean;Lco/bird/android/model/wire/WireRiderTutorial;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;ZLjava/lang/Boolean;ZDDZZZZIZLjava/lang/String;Lco/bird/android/model/wire/configs/DeliveryConfig;ZZZZZLco/bird/android/model/wire/configs/DamageNestConfig;Lco/bird/android/model/wire/configs/CollectionNestConfig;Lco/bird/android/model/wire/configs/ChargerConfig;Lco/bird/android/model/wire/configs/SuperchargerConfig;Lco/bird/android/model/wire/configs/StorageNestConfig;ZZZZZZLco/bird/android/model/wire/configs/ParkingConfig;Lco/bird/android/model/wire/configs/MechanicConfig;ZZZZZLjava/lang/Boolean;ZLco/bird/android/model/wire/configs/GovTechConfig;ZZZZZLco/bird/android/model/wire/configs/ServiceCenterConfig;ZZLco/bird/android/model/constant/PriceOnScannerKind;ZLco/bird/android/model/wire/configs/ReservationConfig;Lco/bird/android/model/wire/configs/ShopConfig;Lco/bird/android/model/wire/configs/OperatorConfig;Lco/bird/android/model/wire/configs/ContractorConfig;ZZZZLjava/util/List;ILco/bird/android/model/wire/configs/BeaconConfig;ZLco/bird/android/model/wire/configs/ComplianceConfig;ZZZLco/bird/android/model/wire/configs/BaseRentalConfig;ZZZZLco/bird/android/model/wire/WireCommunicationOptIn;Lco/bird/android/model/wire/configs/EndRideRatingConfig;Ljava/lang/String;ZLco/bird/android/model/wire/configs/InaccessibleBirdConfig;Lco/bird/android/model/wire/configs/MobileMapConfigView;Lco/bird/android/model/wire/configs/MobileMapConfigView;Lco/bird/android/model/wire/configs/PlatformConfig;IZZFZZJLco/bird/android/model/wire/configs/PaymentConfig;ZLco/bird/android/model/wire/configs/PrivateBirdConfig;Lco/bird/android/model/wire/configs/PillButtonConfig;Lco/bird/android/model/wire/configs/MarketManifestConfig;Ljava/lang/Integer;ZLco/bird/android/model/wire/configs/TaxInformationConfig;Lco/bird/android/model/wire/configs/PromoConfig;ZLco/bird/android/model/wire/configs/BirdPayConfig;Lco/bird/android/model/wire/configs/OfferConfig;Ljava/lang/String;Lco/bird/android/model/wire/configs/MerchantConfig;ZLco/bird/android/model/wire/configs/PricingUiConfig;Lco/bird/android/model/wire/configs/DestinationConfig;Lco/bird/android/model/wire/configs/RiderProfileConfig;Lco/bird/android/model/wire/configs/FlyerConfig;Lco/bird/android/model/wire/configs/RidePassConfig;Lco/bird/android/model/wire/configs/MultiRideConfig;Lco/bird/android/model/wire/configs/FrequentFlyerConfig;Lco/bird/android/model/wire/configs/ThirdPartyConfig;JDLco/bird/android/model/wire/configs/ZendeskConfig;Lco/bird/android/model/wire/configs/ZigZagConfig;Lco/bird/android/model/wire/configs/LocalizationConfig;Lco/bird/android/model/wire/configs/AndroidConfig;Lco/bird/android/model/wire/configs/UserTrackingConfig;Lco/bird/android/model/wire/configs/UserInterfaceConfig;FZZLjava/util/List;Lco/bird/android/model/wire/configs/TutorialV2Config;Lco/bird/android/model/wire/configs/SecurityConfig;Lco/bird/android/model/wire/configs/OnboardingConfig;Lco/bird/android/model/wire/configs/SaveMoneyConfig;Lco/bird/android/model/wire/configs/RiderHomeAreaPromptConfig;ZLco/bird/android/model/constant/HabitatType;IIIIILjava/lang/Object;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lgb6$a$v$b;->a(Lco/bird/android/model/wire/configs/Config;Z)Lco/bird/android/model/wire/configs/Config;

    move-result-object p1

    return-object p1
.end method
