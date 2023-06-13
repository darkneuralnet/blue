.class public final Li25$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->v3()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/constant/ScanIntention;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/constant/ScanIntention;",
        "kotlin.jvm.PlatformType",
        "scanIntention",
        "",
        "a",
        "(Lco/bird/android/model/constant/ScanIntention;)V"
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
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$checkPreScanPermissions$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n1549#2:4450\n1620#2,3:4451\n1#3:4454\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$checkPreScanPermissions$7$1\n*L\n2021#1:4446\n2021#1:4447,3\n2022#1:4450\n2022#1:4451,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$k;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/constant/ScanIntention;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ride intent scan intention: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v0, Li25$k;->g:Li25;

    invoke-static {v2}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v1, "no user found to attempt to start ride in checkPreScanPermissions!!"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v4, Lco/bird/android/model/constant/ScanIntention;->GUEST_RIDE:Lco/bird/android/model/constant/ScanIntention;

    if-ne v1, v4, :cond_3

    iget-object v4, v0, Li25$k;->g:Li25;

    invoke-static {v4}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v5, v0, Li25$k;->g:Li25;

    invoke-static {v5}, Li25;->access$getAreaManager$p(Li25;)Lbn;

    move-result-object v5

    invoke-interface {v5}, Lbn;->e()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v5, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v11}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v5, v0, Li25$k;->g:Li25;

    invoke-static {v5}, Li25;->access$getAreaManager$p(Li25;)Lbn;

    move-result-object v5

    invoke-interface {v5}, Lbn;->e()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    iget-object v11, v0, Li25$k;->g:Li25;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v5, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lco/bird/android/model/persistence/Area;

    invoke-static {v11}, Li25;->access$getAreaManager$p(Li25;)Lbn;

    move-result-object v12

    invoke-interface {v12}, Lbn;->O()LZ84;

    move-result-object v12

    invoke-virtual {v12}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map;

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/joda/time/ReadableInstant;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v12

    invoke-static {v10, v12}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v10

    invoke-virtual {v10}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v10

    int-to-double v12, v10

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-interface {v15, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    move-object v10, v15

    move-object v15, v5

    const/16 v16, 0x0

    const/16 v17, 0x0

    iget-object v5, v0, Li25$k;->g:Li25;

    invoke-virtual {v5}, Li25;->f4()LYR4;

    move-result-object v5

    invoke-interface {v5}, LYR4;->R()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/buava/Optional;

    invoke-virtual {v5}, Lco/bird/android/buava/Optional;->c()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    iget-object v5, v0, Li25$k;->g:Li25;

    invoke-virtual {v5}, Li25;->f4()LYR4;

    move-result-object v5

    invoke-interface {v5}, LYR4;->o0()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/RideStates;

    invoke-virtual {v5}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v5

    move-object/from16 v22, v4

    int-to-long v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    const/16 v20, 0xfe7

    const/16 v21, 0x0

    new-instance v3, LDa5;

    move-object v5, v3

    invoke-direct/range {v5 .. v21}, LDa5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v22

    invoke-interface {v4, v3}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_2

    :cond_3
    iget-object v3, v0, Li25$k;->g:Li25;

    invoke-static {v3}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object v3

    new-instance v4, Lco/bird/android/model/analytics/RideButtonTapped;

    invoke-direct {v4}, Lco/bird/android/model/analytics/RideButtonTapped;-><init>()V

    invoke-interface {v3, v4}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :goto_2
    iget-object v3, v0, Li25$k;->g:Li25;

    invoke-static {v3}, Li25;->access$getRideMapStateManager$p(Li25;)LpU4;

    move-result-object v3

    invoke-interface {v3}, LpU4;->g()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireBird;

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    sget-object v5, Lco/bird/android/model/constant/ScanIntention;->RIDE:Lco/bird/android/model/constant/ScanIntention;

    if-ne v1, v5, :cond_4

    invoke-virtual {v2}, Lco/bird/android/model/User;->getAdmin()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_5

    move-object v4, v3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "going to scan bird with intention "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v0, Li25$k;->g:Li25;

    invoke-static {v2}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v2

    const-string v3, "scanIntention"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x2716

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v4, v3}, Le13;->f4(Lco/bird/android/model/constant/ScanIntention;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/constant/ScanIntention;

    invoke-virtual {p0, p1}, Li25$k;->a(Lco/bird/android/model/constant/ScanIntention;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
