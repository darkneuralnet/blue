.class public final Li25$T2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25$T2;->b(Lco/bird/android/buava/Optional;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Ljava/util/Map<",
        "Lco/bird/android/model/persistence/Area;",
        "+",
        "Lorg/joda/time/DateTime;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "list",
        "",
        "",
        "Lco/bird/android/model/persistence/Area;",
        "Lorg/joda/time/DateTime;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,4445:1\n1#2:4446\n215#3,2:4447\n215#3,2:4449\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1\n*L\n3919#1:4447,2\n3949#1:4449,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;

.field public final synthetic h:Lco/bird/android/model/RideState;


# direct methods
.method public constructor <init>(Li25;Lco/bird/android/model/RideState;)V
    .locals 0

    iput-object p1, p0, Li25$T2$a;->g:Li25;

    iput-object p2, p0, Li25$T2$a;->h:Lco/bird/android/model/RideState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final a(Lkotlin/Lazy;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final b(Lkotlin/Lazy;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Li25$T2$a;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "Lorg/joda/time/DateTime;",
            ">;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "list"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Map;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_2

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    iget-object v3, v0, Li25$T2$a;->g:Li25;

    invoke-static {v3}, Li25;->access$getLocationManager$p(Li25;)Ldr4;

    move-result-object v3

    invoke-interface {v3}, Ldr4;->p()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/Location;

    new-instance v4, Li25$T2$a$b;

    invoke-direct {v4, v1}, Li25$T2$a$b;-><init>(Ljava/util/Map;)V

    invoke-static {v4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v4

    new-instance v6, Li25$T2$a$a;

    invoke-direct {v6, v2}, Li25$T2$a$a;-><init>(Ljava/util/Map;)V

    invoke-static {v6}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v6

    iget-object v7, v0, Li25$T2$a;->g:Li25;

    iget-object v8, v0, Li25$T2$a;->h:Lco/bird/android/model/RideState;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, ""

    const-string v11, " (title/label: "

    if-eqz v9, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lco/bird/android/model/persistence/Area;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Lorg/joda/time/DateTime;

    invoke-static {v4}, Li25$T2$a;->a(Lkotlin/Lazy;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v9, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    move-object/from16 p1, v2

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getLabel()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_4

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getTitle()Ljava/lang/String;

    move-result-object v13

    :cond_4
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "tracking rider entered area "

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    new-array v11, v9, [Ljava/lang/Object;

    invoke-static {v5, v11}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v7}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object v5

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v8}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v9

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getLabel()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getTitle()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getMaxSpeed()Ljava/lang/Integer;

    move-result-object v22

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getNoParking()Z

    move-result v23

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getNoRides()Z

    move-result v24

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result v25

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getPartnerId()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_5

    move-object/from16 v26, v10

    goto :goto_3

    :cond_5
    move-object/from16 v26, v9

    :goto_3
    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getPreferredParking()Z

    move-result v27

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v28

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v11

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v13

    float-to-double v13, v13

    invoke-virtual {v3}, Landroid/location/Location;->getAltitude()D

    move-result-wide v33

    move-object/from16 p1, v2

    invoke-virtual {v3}, Landroid/location/Location;->getSpeed()F

    move-result v2

    move-wide/from16 v29, v13

    move-object/from16 v40, v15

    float-to-double v14, v2

    invoke-virtual {v7}, Li25;->f4()LYR4;

    move-result-object v2

    invoke-interface {v2}, LYR4;->o0()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/RideStates;

    invoke-virtual {v2}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v2

    move-wide/from16 v31, v14

    int-to-long v14, v2

    new-instance v2, Lm95;

    move-wide/from16 v35, v29

    move-object v13, v2

    const/16 v16, 0x0

    move-wide/from16 v41, v14

    move-wide/from16 v37, v31

    move-object/from16 v14, v16

    const/16 v21, 0x0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v29

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v30

    const/16 v31, 0x0

    invoke-static/range {v37 .. v38}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v32

    invoke-static/range {v33 .. v34}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v33

    invoke-static/range {v35 .. v36}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v34

    const/16 v35, 0x0

    sget-object v36, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v41 .. v42}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v37

    const/16 v38, 0x5

    const/16 v39, 0x0

    move-object/from16 v15, v40

    invoke-direct/range {v13 .. v39}, Lm95;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_4
    move-object/from16 v2, p1

    goto/16 :goto_2

    :cond_6
    iget-object v2, v0, Li25$T2$a;->g:Li25;

    iget-object v4, v0, Li25$T2$a;->h:Lco/bird/android/model/RideState;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/persistence/Area;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/joda/time/DateTime;

    invoke-static {v6}, Li25$T2$a;->b(Lkotlin/Lazy;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move-object/from16 v18, v1

    move-object/from16 v20, v2

    move-object/from16 v19, v3

    move-object/from16 v21, v4

    move-object/from16 p1, v10

    goto/16 :goto_7

    :cond_7
    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getLabel()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_8

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getTitle()Ljava/lang/String;

    move-result-object v9

    :cond_8
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "tracking rider exited area "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    new-array v12, v9, [Ljava/lang/Object;

    invoke-static {v8, v12}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v2}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object v8

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v44

    invoke-virtual {v4}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v12

    invoke-virtual {v12}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v45

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getLabel()Ljava/lang/String;

    move-result-object v46

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getTitle()Ljava/lang/String;

    move-result-object v47

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getMaxSpeed()Ljava/lang/Integer;

    move-result-object v49

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getNoParking()Z

    move-result v50

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getNoRides()Z

    move-result v51

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result v52

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getPartnerId()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_9

    move-object/from16 v53, v10

    goto :goto_6

    :cond_9
    move-object/from16 v53, v12

    :goto_6
    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getPreferredParking()Z

    move-result v54

    invoke-virtual {v7}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v55

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v14

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v7

    move-object/from16 p1, v10

    float-to-double v9, v7

    invoke-virtual {v3}, Landroid/location/Location;->getAltitude()D

    move-result-wide v16

    invoke-virtual {v3}, Landroid/location/Location;->getSpeed()F

    move-result v7

    move-object/from16 v18, v1

    float-to-double v0, v7

    invoke-virtual {v2}, Li25;->f4()LYR4;

    move-result-object v7

    invoke-interface {v7}, LYR4;->o0()LZ84;

    move-result-object v7

    invoke-virtual {v7}, LZ84;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/RideStates;

    invoke-virtual {v7}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v7

    move-object/from16 v20, v2

    move-object/from16 v19, v3

    int-to-long v2, v7

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v7

    move-object/from16 v21, v4

    const-string v4, "now()"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v5}, LpT0;->i(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)D

    move-result-wide v56

    new-instance v4, Lo95;

    move-object/from16 v40, v4

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v48, 0x0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v58

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v59

    const/16 v60, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v61

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v62

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v63

    const/16 v64, 0x0

    sget-object v65, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v66

    const/16 v67, 0x5

    const/16 v68, 0x0

    move-object/from16 v42, v5

    invoke-direct/range {v40 .. v68}, Lo95;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZZZLjava/lang/String;ZLjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v4}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_7
    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v1, v18

    move-object/from16 v3, v19

    move-object/from16 v2, v20

    move-object/from16 v4, v21

    goto/16 :goto_5

    :cond_a
    return-void
.end method
