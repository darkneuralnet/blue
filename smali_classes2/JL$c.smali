.class public final LJL$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJL;->p(Lco/bird/android/model/Vehicle;)Lio/reactivex/p;
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
        "Lco/bird/android/model/Vehicle;",
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
        "Lco/bird/android/model/Vehicle;",
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

.field public final synthetic h:LJL;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Vehicle;LJL;)V
    .locals 0

    iput-object p1, p0, LJL$c;->g:Lco/bird/android/model/Vehicle;

    iput-object p2, p0, LJL$c;->h:LJL;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lio/reactivex/u;
    .locals 76
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/BirdCodeWithStatus;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "response"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LHM4;->b()I

    move-result v1

    const/16 v3, 0x194

    if-eq v1, v3, :cond_2

    invoke-virtual/range {p1 .. p1}, LHM4;->b()I

    move-result v1

    const/16 v3, 0x193

    if-eq v1, v3, :cond_2

    iget-object v1, v0, LJL$c;->g:Lco/bird/android/model/Vehicle;

    invoke-static {v1}, Lco/bird/android/model/VehicleKt;->isIBeacon(Lco/bird/android/model/Vehicle;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, LHM4;->b()I

    move-result v1

    const/16 v3, 0x190

    if-ne v1, v3, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/BirdCodeWithStatus;

    if-eqz v1, :cond_1

    iget-object v4, v0, LJL$c;->g:Lco/bird/android/model/Vehicle;

    move-object v2, v4

    const/4 v3, 0x0

    invoke-virtual {v4}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v1}, Lco/bird/api/response/BirdCodeWithStatus;->getCode()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

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

    const/16 v72, -0x81

    const/16 v73, -0x1

    const/16 v74, 0x3

    const/16 v75, 0x0

    invoke-static/range {v5 .. v75}, Lco/bird/android/model/wire/WireBird;->copy$default(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lco/bird/android/model/wire/WireBird;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1fffd

    const/16 v21, 0x0

    invoke-static/range {v2 .. v21}, Lco/bird/android/model/Vehicle;->copy$default(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILjava/lang/Object;)Lco/bird/android/model/Vehicle;

    move-result-object v1

    invoke-static {v1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object v1

    if-nez v1, :cond_5

    :cond_1
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object v1

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v1, v0, LJL$c;->g:Lco/bird/android/model/Vehicle;

    invoke-static {v1}, Lco/bird/android/model/VehicleKt;->isIBeacon(Lco/bird/android/model/Vehicle;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, LJL$c;->g:Lco/bird/android/model/Vehicle;

    invoke-virtual {v1}, Lco/bird/android/model/Vehicle;->getBeaconHash()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, v0, LJL$c;->h:LJL;

    invoke-static {v2}, LJL;->access$getIBeaconBlacklist$p(LJL;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v1, v0, LJL$c;->h:LJL;

    invoke-static {v1}, LJL;->access$getSerialNumberBlacklist$p(LJL;)Ljava/util/HashSet;

    move-result-object v1

    iget-object v2, v0, LJL$c;->h:LJL;

    iget-object v3, v0, LJL$c;->g:Lco/bird/android/model/Vehicle;

    invoke-virtual {v3}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    invoke-static {v2, v3}, LJL;->access$getIdentifier(LJL;Lco/bird/android/model/wire/WireBird;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object v1

    :cond_5
    :goto_2
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LJL$c;->a(LHM4;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
