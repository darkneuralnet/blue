.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->B(Ljava/util/Set;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRiderCellsResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRiderCellsResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireRiderCellsResponse;)Lio/reactivex/h;"
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
        "SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,523:1\n1#2:524\n1549#3:525\n1620#3,3:526\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2\n*L\n213#1:525\n213#1:526,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->h:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRiderCellsResponse;)Lio/reactivex/h;
    .locals 5

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRiderCellsResponse;->getCells()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireRiderCellByType;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRiderCellByType;->getBirds()Lco/bird/android/model/wire/WireRiderCell;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "returned cells: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireRiderCellByType;

    if-eqz v0, :cond_3

    iget-object v3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-virtual {v3}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getByType(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lco/bird/android/model/wire/WireRiderCellByType;Lvt4;)Lco/bird/android/model/wire/WireRiderCell;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRiderCell;->getStrategy()Ljava/lang/String;

    move-result-object v1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "returned strategy: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v1, :cond_4

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getServerCellStrategy$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;

    move-result-object v0

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v3, v1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->h:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {v1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getSubRegionToServerCells$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;

    move-result-object v1

    new-instance v3, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;

    iget-object v4, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-direct {v3, p1, v0, v4}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;-><init>(Ljava/util/Map;Ljava/util/List;Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    invoke-virtual {v1, v3}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "remaining subregions to request: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$hydrateMapGeocacheSubRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;)Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRiderCellsResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->a(Lco/bird/android/model/wire/WireRiderCellsResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
