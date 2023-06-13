.class final Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init()V
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
        "Ljava/util/List<",
        "+TK;>;+",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        ">;",
        "Lna4<",
        "+",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction<",
        "TT;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u000c\u001ab\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \t*\u0004\u0018\u00018\u00018\u0001 \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00080\u0008 \t*0\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \t*\u0004\u0018\u00018\u00018\u0001 \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00080\u0008\u0018\u00010\u00070\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u000e\u0008\u0001\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "K",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "T",
        "Lkotlin/Pair;",
        "",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "<name for destructuring parameter 0>",
        "Lna4;",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Pair;)Lna4;",
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
        "SMAP\nAbstractMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1549#2:226\n1620#2,3:227\n766#2:230\n857#2,2:231\n1222#2,4:233\n766#2:237\n857#2,2:238\n1603#2,9:240\n1855#2:249\n1856#2:251\n1612#2:252\n1855#2,2:253\n1549#2:255\n1620#2,3:256\n1549#2:259\n1620#2,3:260\n1549#2:263\n1620#2,3:264\n1#3:250\n*S KotlinDebug\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5\n*L\n137#1:226\n137#1:227,3\n139#1:230\n139#1:231,2\n140#1:233,4\n142#1:237\n142#1:238,2\n144#1:240,9\n144#1:249\n144#1:251\n144#1:252\n164#1:253,2\n165#1:255\n165#1:256,3\n178#1:259\n178#1:260,3\n179#1:263\n179#1:264,3\n144#1:250\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
            "TK;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
            "TK;TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->invoke$lambda$9(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$9(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->invoke(Lkotlin/Pair;)Lna4;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)Lna4;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "+TK;>;",
            "Lcom/google/android/gms/maps/model/VisibleRegion;",
            ">;)",
            "Lna4<",
            "+",
            "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction<",
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/maps/model/VisibleRegion;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-static {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->access$getLogger(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)Lg46$b;

    move-result-object p1

    const-string v0, "Clearing items"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$ClearMarkers;

    invoke-direct {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$ClearMarkers;-><init>()V

    invoke-static {p1}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "markers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v6}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->id(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, "viewport"

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->latLng(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-static {p1, v7}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManagerKt;->access$contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v6}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->id(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v3

    invoke-virtual {v3}, LGl0;->k()LF9;

    move-result-object v3

    invoke-interface {v3}, LF9;->b()Ljava/util/Collection;

    move-result-object v3

    const-string v5, "clusterManager.algorithm.items"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    invoke-virtual {v9}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v9

    const-string v10, "item.position"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v9}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManagerKt;->access$contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_4

    :cond_6
    move v9, v2

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v9, 0x1

    :goto_5
    if-eqz v9, :cond_5

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object p1

    invoke-virtual {p1}, LGl0;->k()LF9;

    move-result-object p1

    invoke-interface {p1}, LF9;->b()Ljava/util/Collection;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v7, 0x0

    if-eqz v5, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    invoke-virtual {v5}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v5}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_7

    :cond_a
    const-string v7, "existingClusterItem"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v8, v5}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->updateMarker(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    :cond_b
    :goto_7
    if-eqz v7, :cond_9

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    invoke-static {v3}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    invoke-virtual {v3, v8}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V

    goto :goto_8

    :cond_d
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v8}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->newMarker(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_e
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, Lio/reactivex/k;->P()Lio/reactivex/k;

    move-result-object p1

    return-object p1

    :cond_f
    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-static {v0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->access$getLogger(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)Lg46$b;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Num items updated: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v8}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-static {v0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->access$getLogger(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)Lg46$b;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Num items removed: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v8}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;->this$0:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;

    invoke-static {v0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->access$getLogger(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)Lg46$b;

    move-result-object v0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Num items added: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v2}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v2, 0x64

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v0}, Lio/reactivex/k;->n0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->R0()Lio/reactivex/k;

    move-result-object v0

    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0x32

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    new-instance v8, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;

    invoke-direct {v8, v6}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$RemoveMarkers;-><init>(Ljava/util/List;)V

    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_10
    invoke-static {v5, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    new-instance v4, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;

    invoke-direct {v4, v2}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction$AddMarkers;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_11
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/k;->i0(Ljava/lang/Iterable;)Lio/reactivex/k;

    move-result-object p1

    sget-object v1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5$2;->INSTANCE:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5$2;

    new-instance v2, Lco/bird/android/app/feature/map/cluster/a;

    invoke-direct {v2, v1}, Lco/bird/android/app/feature/map/cluster/a;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {p1, v0, v2}, Lio/reactivex/k;->u1(Lna4;Lna4;Lio/reactivex/functions/c;)Lio/reactivex/k;

    move-result-object p1

    const-wide/16 v0, 0xa

    sget-object v2, Lio/reactivex/a;->c:Lio/reactivex/a;

    invoke-virtual {p1, v0, v1, v7, v2}, Lio/reactivex/k;->w0(JLio/reactivex/functions/a;Lio/reactivex/a;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method
