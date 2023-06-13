.class final Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;-><init>(LGl0;LcD1;Landroid/content/Context;Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;)V
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
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "+",
        "Ljava/lang/Long;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "",
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
        "SMAP\nBountyMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n288#2,2:126\n*S KotlinDebug\n*F\n+ 1 BountyMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2\n*L\n54#1:126,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/BountyMapMarker;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    invoke-static {v1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->access$getClusterManager$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)LGl0;

    move-result-object v1

    invoke-virtual {v1}, LGl0;->k()LF9;

    move-result-object v1

    invoke-interface {v1}, LF9;->b()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "clusterManager.algorithm.items"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BountyMapMarker;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;

    if-nez v2, :cond_2

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    invoke-static {p1}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->access$getMarkersToAnimate$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BountyMapMarker;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    invoke-virtual {v1, v2}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BountyMapMarker;->getCountdownUntil()Lorg/joda/time/DateTime;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lorg/joda/time/base/AbstractInstant;->isAfterNow()Z

    move-result v3

    if-ne v3, v5, :cond_3

    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    if-eqz v3, :cond_4

    if-eqz v1, :cond_6

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    invoke-static {p1, v2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->access$bitmapDescriptor(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;)LPT;

    move-result-object p1

    invoke-virtual {v1, p1}, LfM2;->k(LPT;)V

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_6

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer$2;->this$0:Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;

    invoke-static {v2}, Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;->access$getTimerMarkerOptionProvider$p(Lco/bird/android/app/feature/map/renderer/BountyMarkerClusterRenderer;)Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;

    move-result-object v2

    const-string v3, "bountyMarker"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, 0x2

    rem-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    if-nez p1, :cond_5

    move v4, v5

    :cond_5
    invoke-virtual {v2, v0, v5, v4}, Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;->bitmapDescriptorFlashing(Lco/bird/android/model/persistence/BountyMapMarker;ZZ)LPT;

    move-result-object p1

    invoke-virtual {v1, p1}, LfM2;->k(LPT;)V

    :cond_6
    :goto_2
    return-void
.end method
