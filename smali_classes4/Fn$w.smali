.class public final LFn$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFn;->O1(Landroid/location/Location;Ljava/util/List;)Lco/bird/android/model/RiderAreaState;
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
        "Lco/bird/android/model/persistence/Area;",
        "+",
        "Lorg/joda/time/DateTime;",
        ">;",
        "Ljava/util/Map<",
        "Lco/bird/android/model/persistence/Area;",
        "+",
        "Lorg/joda/time/DateTime;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/Area;",
        "Lorg/joda/time/DateTime;",
        "it",
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
        "SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$determineRiderAreaState$5\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,642:1\n467#2,7:643\n*S KotlinDebug\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$determineRiderAreaState$5\n*L\n610#1:643,7\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Lco/bird/android/model/LocationAreaState;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lco/bird/android/model/LocationAreaState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "Lorg/joda/time/DateTime;",
            ">;",
            "Lco/bird/android/model/LocationAreaState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LFn$w;->g:Ljava/util/Map;

    iput-object p2, p0, LFn$w;->h:Lco/bird/android/model/LocationAreaState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "Lorg/joda/time/DateTime;",
            ">;)",
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LFn$w;->g:Ljava/util/Map;

    iget-object v0, p0, LFn$w;->h:Lco/bird/android/model/LocationAreaState;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v0}, Lco/bird/android/model/LocationAreaState;->getAreasWithin()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LFn$w;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
