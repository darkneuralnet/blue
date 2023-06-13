.class public final Lgb6$a$T1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb6$a$T1;->a(LSa6;)V
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
        "Lco/bird/android/model/wire/configs/WarningPresentationKind;",
        "Lco/bird/android/model/wire/configs/Config;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "Lco/bird/android/model/wire/configs/WarningPresentationKind;",
        "value",
        "a",
        "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/configs/WarningPresentationKind;)Lco/bird/android/model/wire/configs/Config;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lgb6$a$T1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb6$a$T1$b;

    invoke-direct {v0}, Lgb6$a$T1$b;-><init>()V

    sput-object v0, Lgb6$a$T1$b;->g:Lgb6$a$T1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/configs/WarningPresentationKind;)Lco/bird/android/model/wire/configs/Config;
    .locals 176

    move-object/from16 v0, p1

    const-string v1, "config"

    move-object/from16 v15, p1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "value"

    move-object/from16 v14, p2

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    const/16 v16, 0x0

    move-object/from16 v14, v16

    move-object/from16 v15, v16

    const/16 v17, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v26

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const-wide/16 v62, 0x0

    const-wide/16 v64, 0x0

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

    const/16 v91, 0x0

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

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lco/bird/android/model/wire/configs/RideConfig;->getWarningConfig()Lco/bird/android/model/wire/configs/RideWarningConfig;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0xf

    const/16 v25, 0x0

    move-object/from16 v23, p2

    invoke-static/range {v18 .. v25}, Lco/bird/android/model/wire/configs/RideWarningConfig;->copy$default(Lco/bird/android/model/wire/configs/RideWarningConfig;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;Lco/bird/android/model/wire/configs/WarningPresentationKind;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/RideWarningConfig;

    move-result-object v108

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

    const/16 v121, 0x0

    const/16 v122, -0x1

    const/16 v123, -0x1

    const v124, 0x3ffeff

    const/16 v125, 0x0

    invoke-static/range {v26 .. v125}, Lco/bird/android/model/wire/configs/RideConfig;->copy$default(Lco/bird/android/model/wire/configs/RideConfig;JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZIIILjava/lang/Object;)Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v18

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

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

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v69, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v76, 0x0

    const/16 v78, 0x0

    const/16 v84, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v95, 0x0

    const/16 v97, 0x0

    const/16 v99, 0x0

    const/16 v101, 0x0

    const/16 v105, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const-wide/16 v124, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

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

    const-wide/16 v149, 0x0

    const-wide/16 v151, 0x0

    const/16 v153, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const/16 v156, 0x0

    const/16 v157, 0x0

    const/16 v158, 0x0

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

    const v170, -0x10001

    const/16 v171, -0x1

    const/16 v172, -0x1

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

    check-cast p2, Lco/bird/android/model/wire/configs/WarningPresentationKind;

    invoke-virtual {p0, p1, p2}, Lgb6$a$T1$b;->a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/configs/WarningPresentationKind;)Lco/bird/android/model/wire/configs/Config;

    move-result-object p1

    return-object p1
.end method
