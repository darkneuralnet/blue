.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;->a(Lco/bird/android/model/wire/WireRiderCellsResponse;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Map<",
        "Ljava/lang/Long;",
        "+",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/util/Map<",
        "Ljava/lang/Long;",
        "+",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u001c\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u00060\u0004j\u0002`\u00050\u00030\u00002 \u0010\u0006\u001a\u001c\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u00060\u0004j\u0002`\u00050\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "",
        "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;",
        "",
        "",
        "Lco/bird/android/feature/rider/impl/ServerCellId;",
        "map",
        "a",
        "(Ljava/util/Map;)Ljava/util/Map;"
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
        "SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,523:1\n215#2,2:524\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2$2\n*L\n224#1:524,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireRiderCellByType;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/List;Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireRiderCellByType;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->g:Ljava/util/Map;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->h:Ljava/util/List;

    iput-object p3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "+",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->g:Ljava/util/Map;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->h:Ljava/util/List;

    iget-object v2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->i:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireRiderCellByType;

    invoke-static {v4}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object v6

    invoke-static {v2, v3, v6}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$getByType(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lco/bird/android/model/wire/WireRiderCellByType;Lvt4;)Lco/bird/android/model/wire/WireRiderCell;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRiderCell;->getCellIds()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {p1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c$a;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
