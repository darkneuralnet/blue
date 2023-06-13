.class public final Li25$P1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->Q5(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "LXl5;",
        "+",
        "LTk5;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LXl5;",
        "LTk5;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$83\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$P1;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Li25;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Li25$P1;->b(Li25;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Li25;Lco/bird/android/model/wire/WireBird;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li25;->access$getRequirementPresenter$p(Li25;)LsJ4;

    move-result-object p0

    new-instance v0, Lco/bird/android/model/RideRequirement$LeaseBasedHelmetPrompt;

    invoke-direct {v0, p1}, Lco/bird/android/model/RideRequirement$LeaseBasedHelmetPrompt;-><init>(Lco/bird/android/model/wire/WireBird;)V

    invoke-interface {p0, v0}, LsJ4;->b(Lco/bird/android/model/RideRequirement;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 76
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LXl5;",
            "+",
            "LTk5;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<name for destructuring parameter 0>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXl5;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTk5;

    invoke-virtual {v1}, LXl5;->b()Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v4

    invoke-virtual {v1}, LXl5;->d()Lco/bird/android/model/RideState;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_0
    iget-object v3, v0, Li25$P1;->g:Li25;

    invoke-virtual {v3}, Li25;->f4()LYR4;

    move-result-object v3

    invoke-interface {v3}, LYR4;->R()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/RideState;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v3, v0, Li25$P1;->g:Li25;

    invoke-static {v3}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    :cond_2
    :goto_0
    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePhysicalLock;->getPurpose()Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    const/4 v15, 0x1

    const/4 v14, 0x0

    if-ne v5, v6, :cond_3

    iget-object v5, v0, Li25$P1;->g:Li25;

    invoke-static {v5}, Li25;->access$getItemLeaseManager$p(Li25;)LMc2;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v5, v3, v4, v6}, LMc2;->v(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WirePhysicalLock;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v3

    if-eqz v3, :cond_3

    move/from16 v74, v15

    goto :goto_1

    :cond_3
    move/from16 v74, v14

    :goto_1
    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v3

    :goto_2
    invoke-virtual {v4}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_7

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_5
    move-object v5, v3

    :goto_3
    if-nez v5, :cond_7

    iget-object v5, v0, Li25$P1;->g:Li25;

    invoke-virtual {v5}, Li25;->f4()LYR4;

    move-result-object v5

    invoke-interface {v5}, LYR4;->R()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/buava/Optional;

    invoke-virtual {v5}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/RideState;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object v13, v3

    goto :goto_5

    :cond_7
    :goto_4
    move-object v13, v5

    :goto_5
    if-nez v1, :cond_b

    if-eqz v13, :cond_8

    iget-object v1, v0, Li25$P1;->g:Li25;

    invoke-virtual {v1}, Li25;->f4()LYR4;

    move-result-object v1

    invoke-interface {v1, v13}, LYR4;->q1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    :cond_8
    if-nez v3, :cond_a

    new-instance v1, Lco/bird/android/model/wire/WireBird;

    if-nez v13, :cond_9

    const-string v3, ""

    move-object/from16 v43, v3

    goto :goto_6

    :cond_9
    move-object/from16 v43, v13

    :goto_6
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    move-object/from16 v75, v13

    move-object v13, v3

    const/4 v3, 0x0

    move v14, v3

    move v15, v3

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

    const/16 v70, -0x2

    const/16 v71, -0x81

    const/16 v72, 0x3

    const/16 v73, 0x0

    move-object v3, v1

    move-object/from16 p1, v4

    move-object/from16 v4, v43

    move-object/from16 v43, p1

    invoke-direct/range {v3 .. v73}, Lco/bird/android/model/wire/WireBird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v75

    goto :goto_8

    :cond_a
    move-object/from16 p1, v4

    move-object v1, v3

    goto :goto_7

    :cond_b
    move-object/from16 p1, v4

    :goto_7
    move-object v5, v13

    :goto_8
    if-eqz v5, :cond_c

    iget-object v3, v0, Li25$P1;->g:Li25;

    invoke-static {v3}, Li25;->access$getItemLeaseManager$p(Li25;)LMc2;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v3, v5, v4}, LMc2;->C(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_c

    move v15, v4

    goto :goto_9

    :cond_c
    const/4 v15, 0x0

    :goto_9
    if-eqz v74, :cond_e

    if-eqz v15, :cond_d

    const-string v1, "received a lock scanned notification for a lock already in active lease, continuing to unlock now"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v0, Li25$P1;->g:Li25;

    invoke-static {v1}, Li25;->access$getSmartlockManager$p(Li25;)LoI5;

    move-result-object v1

    move-object/from16 v3, p1

    invoke-interface {v1, v2, v3}, LoI5;->m(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_a

    :cond_d
    const/4 v3, 0x0

    const-string v2, "received a lock scanned notification for a lock eligible for helmet lease, prompting to start lease"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v0, Li25$P1;->g:Li25;

    new-instance v3, Lx25;

    invoke-direct {v3, v2, v1}, Lx25;-><init>(Li25;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {v3}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v1

    const-string v2, "{\n            Timber.d(\"\u2026            }\n          }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_e
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    :goto_a
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$P1;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
