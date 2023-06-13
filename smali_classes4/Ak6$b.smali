.class public final LAk6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAk6;->a(Lco/bird/android/model/Vehicle;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashMap;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/BirdCodeWithStatus;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/NearbyBirdViewModel;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/BirdCodeWithStatus;",
        "response",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/NearbyBirdViewModel;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Vehicle;

.field public final synthetic h:I

.field public final synthetic i:LAk6;

.field public final synthetic j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lkotlin/Triple<",
            "Lco/bird/api/response/BirdCodeWithStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/Vehicle;ILAk6;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            "I",
            "LAk6;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lkotlin/Triple<",
            "Lco/bird/api/response/BirdCodeWithStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LAk6$b;->g:Lco/bird/android/model/Vehicle;

    iput p2, p0, LAk6$b;->h:I

    iput-object p3, p0, LAk6$b;->i:LAk6;

    iput-object p4, p0, LAk6$b;->j:Ljava/util/HashMap;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lio/reactivex/u;
    .locals 97
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/BirdCodeWithStatus;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/NearbyBirdViewModel;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "response"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/BirdCodeWithStatus;

    if-eqz v1, :cond_2

    iget-object v3, v0, LAk6$b;->g:Lco/bird/android/model/Vehicle;

    iget v2, v0, LAk6$b;->h:I

    iget-object v15, v0, LAk6$b;->i:LAk6;

    iget-object v14, v0, LAk6$b;->j:Ljava/util/HashMap;

    invoke-static {v3}, Lco/bird/android/model/VehicleKt;->isIBeacon(Lco/bird/android/model/Vehicle;)Z

    move-result v22

    new-instance v23, Lco/bird/android/model/NearbyBirdViewModel;

    const/16 v24, 0x0

    invoke-virtual {v3}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v25

    invoke-virtual {v3}, Lco/bird/android/model/Vehicle;->getBattery()I

    move-result v29

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getId()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getCode()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getModel()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    :cond_0
    move-object/from16 v35, v4

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

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

    const/16 v91, 0x0

    const/16 v92, -0x28c

    const/16 v93, -0x1

    const/16 v94, 0x3

    const/16 v95, 0x0

    invoke-static/range {v25 .. v95}, Lco/bird/android/model/wire/WireBird;->copy$default(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v96, v14

    move-object/from16 v14, v16

    move-object/from16 p1, v15

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1fffd

    const/16 v21, 0x0

    move/from16 v25, v2

    move-object v2, v3

    move-object/from16 v26, v3

    move-object/from16 v3, v24

    invoke-static/range {v2 .. v21}, Lco/bird/android/model/Vehicle;->copy$default(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILjava/lang/Object;)Lco/bird/android/model/Vehicle;

    move-result-object v5

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getStatus()Lco/bird/android/model/wire/WireServiceCenterStatus;

    move-result-object v6

    if-eqz v22, :cond_1

    invoke-static/range {p1 .. p1}, LAk6;->access$inOperatorMapMode(LAk6;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    move v9, v2

    move-object/from16 v4, v23

    move/from16 v7, v25

    move/from16 v8, v22

    invoke-direct/range {v4 .. v9}, Lco/bird/android/model/NearbyBirdViewModel;-><init>(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)V

    invoke-virtual/range {v23 .. v23}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-static {v3, v2}, LAk6;->access$getKey(LAk6;Lco/bird/android/model/Vehicle;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkotlin/Triple;

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getModel()Ljava/lang/String;

    move-result-object v4

    invoke-static/range {v26 .. v26}, Lco/bird/android/model/VehicleKt;->isIBeacon(Lco/bird/android/model/Vehicle;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v3, v1, v4, v5}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v1, v96

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LAk6$b;->a(LHM4;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
