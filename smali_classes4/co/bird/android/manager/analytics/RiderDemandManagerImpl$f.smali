.class public final Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 0>",
        "",
        "a",
        "(Ljava/lang/Long;)V"
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
        "SMAP\nRiderDemandManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl$trackRiderDemand$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1747#2,3:178\n1747#2,3:181\n1747#2,3:184\n1747#2,3:187\n1747#2,3:190\n*S KotlinDebug\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl$trackRiderDemand$1\n*L\n94#1:178,3\n95#1:181,3\n96#1:184,3\n97#1:187,3\n98#1:190,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    iput-object p2, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 39

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getAreaManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lbn;

    move-result-object v1

    invoke-interface {v1}, Lbn;->e()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v3}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getAreaManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lbn;

    move-result-object v3

    invoke-interface {v3}, Lbn;->e()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    iget-object v4, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v4}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getPrivateBirdsManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lq54;

    move-result-object v4

    invoke-interface {v4}, Lq54;->a()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/buava/Optional;

    invoke-virtual {v4}, Lco/bird/android/buava/Optional;->c()Z

    move-result v4

    iget-object v5, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v5}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getPreference$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lgl;

    move-result-object v5

    invoke-virtual {v5}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v5

    iget-object v6, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v6}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getUserManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Llh6;

    move-result-object v6

    invoke-interface {v6}, Llh6;->K()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/buava/Optional;

    iget-object v7, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v7}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getAnalyticsManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LEa;

    move-result-object v7

    iget-object v8, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v8}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getUserStream$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LRh6;

    move-result-object v8

    invoke-interface {v8}, LRh6;->g()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v5, :cond_0

    invoke-static {v5}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    move-object/from16 v16, v10

    goto :goto_0

    :cond_0
    move-object/from16 v16, v9

    :goto_0
    iget-object v10, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v10}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getRideManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LYR4;

    move-result-object v10

    invoke-interface {v10}, LYR4;->R()LZ84;

    move-result-object v10

    invoke-virtual {v10}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/android/buava/Optional;

    invoke-static {v10}, LhU4;->a(Lco/bird/android/buava/Optional;)Z

    move-result v10

    iget-object v11, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v11}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getPreference$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lgl;

    move-result-object v11

    invoke-virtual {v11}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v11

    if-eqz v11, :cond_1

    invoke-virtual {v11}, Lco/bird/android/model/User;->getRideCount()I

    move-result v11

    int-to-long v11, v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    move-object/from16 v30, v11

    goto :goto_1

    :cond_1
    move-object/from16 v30, v9

    :goto_1
    iget-object v11, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v11}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getReactiveConfig$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)LTq4;

    move-result-object v11

    invoke-virtual {v11}, LTq4;->f8()LZ84;

    move-result-object v11

    invoke-virtual {v11}, LZ84;->a()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v11}, Lco/bird/android/model/wire/configs/Config;->getLocalConfig()Lco/bird/android/model/wire/configs/LocalConfig;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lco/bird/android/model/wire/configs/LocalConfig;->getWeatherAlert()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v19, v11

    goto :goto_2

    :cond_2
    move-object/from16 v19, v9

    :goto_2
    if-eqz v5, :cond_3

    invoke-static {v5}, Lco/bird/android/model/UserKt;->isCharger(Lco/bird/android/model/User;)Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v20, v11

    goto :goto_3

    :cond_3
    move-object/from16 v20, v9

    :goto_3
    if-eqz v5, :cond_4

    invoke-static {v5}, Lco/bird/android/model/UserKt;->isOperator(Lco/bird/android/model/User;)Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v22, v11

    goto :goto_4

    :cond_4
    move-object/from16 v22, v9

    :goto_4
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lco/bird/android/model/User;->getTester()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v24, v11

    goto :goto_5

    :cond_5
    move-object/from16 v24, v9

    :goto_5
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lco/bird/android/model/User;->getAdmin()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v25, v11

    goto :goto_6

    :cond_6
    move-object/from16 v25, v9

    :goto_6
    if-eqz v4, :cond_7

    iget-object v11, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v11}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getPrivateBirdsManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lq54;

    move-result-object v11

    invoke-interface {v11}, Lq54;->q()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v26, v11

    goto :goto_7

    :cond_7
    move-object/from16 v26, v9

    :goto_7
    if-eqz v4, :cond_8

    iget-object v4, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v4}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getPrivateBirdsManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Lq54;

    move-result-object v4

    invoke-interface {v4}, Lq54;->o()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object/from16 v27, v4

    goto :goto_8

    :cond_8
    move-object/from16 v27, v9

    :goto_8
    if-eqz v5, :cond_9

    invoke-static {v5}, Lco/bird/android/model/UserKt;->isAdminDomain(Lco/bird/android/model/User;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object/from16 v28, v4

    goto :goto_9

    :cond_9
    move-object/from16 v28, v9

    :goto_9
    invoke-virtual {v6}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/Balance;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v4

    move-object/from16 v29, v4

    goto :goto_a

    :cond_a
    move-object/from16 v29, v9

    :goto_a
    const/4 v4, 0x0

    if-eqz v1, :cond_e

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_c

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_c

    :cond_b
    move v5, v4

    goto :goto_b

    :cond_c
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/Area;->getNoRides()Z

    move-result v6

    if-eqz v6, :cond_d

    move v5, v2

    :goto_b
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v31, v5

    goto :goto_c

    :cond_e
    move-object/from16 v31, v9

    :goto_c
    if-eqz v1, :cond_12

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_10

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_10

    :cond_f
    move v5, v4

    goto :goto_d

    :cond_10
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/Area;->getNoParking()Z

    move-result v6

    if-eqz v6, :cond_11

    move v5, v2

    :goto_d
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v32, v5

    goto :goto_e

    :cond_12
    move-object/from16 v32, v9

    :goto_e
    if-eqz v1, :cond_16

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_14

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_14

    :cond_13
    move v5, v4

    goto :goto_f

    :cond_14
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/Area;->getPreferredParking()Z

    move-result v6

    if-eqz v6, :cond_15

    move v5, v2

    :goto_f
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v33, v5

    goto :goto_10

    :cond_16
    move-object/from16 v33, v9

    :goto_10
    if-eqz v1, :cond_1a

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_18

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_18

    :cond_17
    move v5, v4

    goto :goto_11

    :cond_18
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/Area;

    invoke-static {v6}, Lio;->f(Lco/bird/android/model/persistence/Area;)Z

    move-result v6

    if-eqz v6, :cond_19

    move v5, v2

    :goto_11
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v34, v5

    goto :goto_12

    :cond_1a
    move-object/from16 v34, v9

    :goto_12
    if-eqz v1, :cond_1e

    check-cast v3, Ljava/lang/Iterable;

    instance-of v1, v3, Ljava/util/Collection;

    if-eqz v1, :cond_1c

    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1c

    :cond_1b
    move v2, v4

    goto :goto_13

    :cond_1c
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result v3

    if-eqz v3, :cond_1d

    :goto_13
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    :cond_1e
    move-object/from16 v35, v9

    new-instance v1, LY85;

    move-object v11, v1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    const/16 v18, 0x0

    sget-object v21, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v23, v21

    iget-object v2, v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->h:Ljava/lang/String;

    move-object/from16 v36, v2

    const/16 v37, 0x47

    const/16 v38, 0x0

    invoke-direct/range {v11 .. v38}, LY85;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$f;->a(Ljava/lang/Long;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
