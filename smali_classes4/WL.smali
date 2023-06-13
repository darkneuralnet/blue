.class public final LWL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTL;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWL$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u000c\u0010\u000c\u001a\u00020\u000b*\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LWL;",
        "LTL;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lco/bird/android/model/wire/WireLocation;",
        "a",
        "b",
        "i",
        "Lco/bird/android/model/RideState;",
        "rideState",
        "h",
        "",
        "g",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "Ldr4;",
        "Ldr4;",
        "reactiveLocationManager",
        "LYR4;",
        "c",
        "LYR4;",
        "rideManager",
        "La94;",
        "",
        "",
        "d",
        "La94;",
        "lockedAtLocations",
        "<init>",
        "(LTq4;Ldr4;LYR4;)V",
        "location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdLocationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,139:1\n180#2:140\n*S KotlinDebug\n*F\n+ 1 BirdLocationManagerImpl.kt\nco/bird/android/manager/location/BirdLocationManagerImpl\n*L\n56#1:140\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LTq4;

.field public final b:Ldr4;

.field public final c:LYR4;

.field public final d:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LTq4;Ldr4;LYR4;)V
    .locals 1

    const-string v0, "reactiveConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveLocationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWL;->a:LTq4;

    iput-object p2, p0, LWL;->b:Ldr4;

    iput-object p3, p0, LWL;->c:LYR4;

    sget-object p1, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    sget-object v0, LWL$d;->g:LWL$d;

    invoke-virtual {p1, p2, v0}, La94$a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)La94;

    move-result-object p1

    iput-object p1, p0, LWL;->d:La94;

    invoke-interface {p3}, LYR4;->o0()LZ84;

    move-result-object p2

    sget-object p3, LWL$a;->g:LWL$a;

    new-instance v0, LUL;

    invoke-direct {v0, p3}, LUL;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "rideManager.rideStates\n \u2026o bird.location }\n      }"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v0, "UNBOUND"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p3, LWL$b;

    invoke-direct {p3, p1}, LWL$b;-><init>(Ljava/lang/Object;)V

    new-instance p1, LVL;

    invoke-direct {p1, p3}, LVL;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, LWL;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LWL;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireLocation;
    .locals 4

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LWL;->c:LYR4;

    invoke-interface {v0, p1}, LYR4;->g0(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/RideState;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v0}, Lco/bird/android/model/RideStatesKt;->isGuestRide(Lco/bird/android/model/RideState;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lco/bird/android/model/wire/configs/RideLocationMode;->BIRD_LOCATION:Lco/bird/android/model/wire/configs/RideLocationMode;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRideConfig()Lco/bird/android/model/wire/configs/Config;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getRideLocationMode()Lco/bird/android/model/wire/configs/RideLocationMode;

    move-result-object v1

    :goto_0
    sget-object v2, LWL$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 p1, 0x3

    if-eq v1, p1, :cond_3

    const/4 p1, 0x4

    if-eq v1, p1, :cond_3

    const/4 p1, 0x5

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    iget-object p1, p0, LWL;->b:Ldr4;

    invoke-interface {p1}, Ldr4;->p()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    const/4 v0, 0x0

    invoke-static {p1, v0, v2, v0}, Lco/bird/android/model/wire/WireLocationKt;->toLocation$default(Landroid/location/Location;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-virtual {p0, p1, v0}, LWL;->h(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideState;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public b(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireBird;
    .locals 71

    move-object/from16 v0, p1

    const-string v1, "bird"

    move-object/from16 v7, p1

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p1}, LWL;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v67, -0x41

    const/16 v68, -0x1

    const/16 v69, 0x3

    const/16 v70, 0x0

    invoke-static/range {v0 .. v70}, Lco/bird/android/model/wire/WireBird;->copy$default(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lco/bird/android/model/wire/WireBird;)D
    .locals 2

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->birdModel(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/constant/BirdModel;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/constant/BirdModel;->isCruiser()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/constant/BirdModel;->isMiniCruiser()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/constant/BirdModel;->isBike()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/constant/BirdModel;->isMoto()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/constant/BirdModel;->isScooter()Z

    const-wide v0, 0x4021c71c71c71c72L    # 8.88888888888889

    goto :goto_1

    :cond_1
    :goto_0
    const-wide v0, 0x402638e38e38e38eL    # 11.11111111111111

    :goto_1
    return-wide v0
.end method

.method public final h(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideState;)Lco/bird/android/model/wire/WireLocation;
    .locals 2

    invoke-static {p2}, Lco/bird/android/model/RideStateKt;->isInUnlockedRide(Lco/bird/android/model/RideState;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, LWL;->b:Ldr4;

    invoke-interface {p2}, Ldr4;->p()LZ84;

    move-result-object p2

    invoke-virtual {p2}, LZ84;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/location/Location;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p2, v1, v0, v1}, Lco/bird/android/model/wire/WireLocationKt;->toLocation$default(Landroid/location/Location;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LWL;->i(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LWL;->d:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p2}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {p0, p2, p1}, LWL;->i(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final i(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireLocation;
    .locals 6

    const-string v0, "bird"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getLocationUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLocation;->getTimestamp()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    sget-object v2, LYw2;->a:LYw2;

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, LYw2;->e(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireLocation;)F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {p0, p2}, LWL;->g(Lco/bird/android/model/wire/WireBird;)D

    move-result-wide v4

    mul-double/2addr v0, v4

    cmpg-double v0, v2, v0

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method
