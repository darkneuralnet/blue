.class public final LgS$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgS;->B1(Landroid/location/Location;DLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorMapResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorMapResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;"
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
        "SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$fetchOperatorMapNearby$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,296:1\n1549#2:297\n1620#2,3:298\n1549#2:301\n1620#2,3:302\n1549#2:305\n1620#2,3:306\n37#3,2:309\n37#3,2:311\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$fetchOperatorMapNearby$2\n*L\n222#1:297\n222#1:298,3\n224#1:301\n224#1:302,3\n229#1:305\n229#1:306,3\n238#1:309,2\n226#1:311,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgS;

.field public final synthetic h:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;


# direct methods
.method public constructor <init>(LgS;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)V
    .locals 0

    iput-object p1, p0, LgS$e;->g:LgS;

    iput-object p2, p0, LgS$e;->h:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LgS;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, LgS$e;->e(LgS;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LgS;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, LgS$e;->d(LgS;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LgS;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LgS;->access$getBirdMapMarkerDao$p(LgS;)LJM;

    move-result-object p0

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/BirdMapMarker;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, LJM;->l([Lco/bird/android/model/persistence/BirdMapMarker;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e(LgS;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$retainedIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LgS;->access$getBirdMapMarkerDao$p(LgS;)LJM;

    move-result-object p0

    invoke-virtual {p0, p1}, LJM;->j(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final c(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;
    .locals 9

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    iget-object v1, p0, LgS$e;->g:LgS;

    invoke-static {v1}, LgS;->access$getReactiveConfig$p(LgS;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getMap()Lco/bird/android/model/wire/configs/OperatorMapConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/OperatorMapConfig;->getMapPinsStaleThreshold()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/joda/time/DateTime;->minus(J)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapResponse;->getBirds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapResponse;->getBirds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v4, p0, LgS$e;->g:LgS;

    iget-object v5, p0, LgS$e;->h:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;

    invoke-static {v4, v5}, LgS;->access$sha1(LgS;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LIM;->a(Lco/bird/android/model/wire/WireOperatorBirdMapMarker;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdMapMarker;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v1, p0, LgS$e;->g:LgS;

    new-instance v4, LjS;

    invoke-direct {v4, v1, v6}, LjS;-><init>(LgS;Ljava/util/List;)V

    invoke-static {v4}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v1

    const-string v4, "fromCallable {\n         \u2026toTypedArray())\n        }"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapResponse;->getBirds()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireOperatorBirdMapMarker;

    invoke-static {v3}, LIM;->b(Lco/bird/android/model/wire/WireOperatorBirdMapMarker;)Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object p1, p0, LgS$e;->g:LgS;

    const/4 v3, 0x4

    new-array v3, v3, [Lio/reactivex/c;

    invoke-static {p1}, LgS;->access$getBirdMapMarkerDao$p(LgS;)LJM;

    move-result-object v5

    const-string v6, "limitDate"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, LJM;->i(Lorg/joda/time/DateTime;)Lio/reactivex/c;

    move-result-object v0

    const/4 v5, 0x0

    aput-object v0, v3, v5

    iget-object v0, p0, LgS$e;->g:LgS;

    new-instance v6, LkS;

    invoke-direct {v6, v0, v2}, LkS;-><init>(LgS;Ljava/util/List;)V

    invoke-static {v6}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v2, "fromCallable { birdMapMa\u2026MapMarkers(retainedIds) }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    iget-object v0, p0, LgS$e;->g:LgS;

    invoke-static {v0}, LgS;->access$getBirdDao$p(LgS;)LbL;

    move-result-object v0

    new-array v1, v5, [Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;

    invoke-interface {v4, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;

    invoke-virtual {v0, v1}, LbL;->k([Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v3, v1

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "concat(listOf(\n         \u2026scribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LgS;->Y1(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorMapResponse;

    invoke-virtual {p0, p1}, LgS$e;->c(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
