.class public final Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;
.super Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00082\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J(\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00060\nH\u0016\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;",
        "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "marker",
        "",
        "markerId",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "item",
        "",
        "holdIfNotReady",
        "",
        "items",
        "holdNonReadyItems",
        "LBK2;",
        "markerOverridesManager",
        "<init>",
        "(LBK2;)V",
        "co.bird.android.feature.map"
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
        "SMAP\nUnreadyMarkerOverrideBirdMarkers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnreadyMarkerOverrideBirdMarkers.kt\nco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n2689#2,10:45\n1855#3,2:55\n1549#3:57\n1620#3,3:58\n*S KotlinDebug\n*F\n+ 1 UnreadyMarkerOverrideBirdMarkers.kt\nco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers\n*L\n36#1:45,10\n39#1:55,2\n41#1:57\n41#1:58,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(LBK2;)V
    .locals 1

    const-string v0, "markerOverridesManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;-><init>(LBK2;)V

    return-void
.end method

.method public static final synthetic access$getMarkerOverridesManager(Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;)LBK2;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->getMarkerOverridesManager()LBK2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public holdIfNotReady(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->getMarkerOverridesManager()LBK2;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-interface {v0, v1}, LBK2;->d(Lco/bird/android/model/persistence/BirdMapMarker;)LLt2;

    move-result-object v0

    invoke-virtual {v0}, LLt2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->getNotReady()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    invoke-direct {v3, p1, v0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;-><init>(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LLt2;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->getReady()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, LLt2;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    xor-int/lit8 p1, v1, 0x1

    return p1
.end method

.method public holdNonReadyItems(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;)",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers$holdNonReadyItems$1;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers$holdNonReadyItems$1;-><init>(Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;)V

    invoke-static {p1, v0}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->getLoadingOverride()LLt2;

    move-result-object v3

    invoke-virtual {v3}, LLt2;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/Pair;

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->getNotReady()Ljava/util/List;

    move-result-object v1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;->getReady()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->getLoadingOverride()LLt2;

    move-result-object v1

    invoke-virtual {v1}, LLt2;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;->getItem()Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-object p1
.end method

.method public markerId(Lco/bird/android/model/persistence/BirdMapMarker;)Ljava/lang/String;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic markerId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;->markerId(Lco/bird/android/model/persistence/BirdMapMarker;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
