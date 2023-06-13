.class final Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRendererFactory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
        "SMAP\nNestMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n766#2:116\n857#2,2:117\n1855#2,2:119\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3\n*L\n59#1:116\n59#1:117,2\n60#1:119,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;->this$0:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 3

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;->this$0:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;

    invoke-static {p1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->access$getClusterManager(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;)LGl0;

    move-result-object p1

    invoke-virtual {p1}, LGl0;->k()LF9;

    move-result-object p1

    invoke-interface {p1}, LF9;->b()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "clusterManager.algorithm.items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-virtual {v2}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/NestMarker;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/NestMarker;->getAvailableSpaceDetails()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager$3;->this$0:Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;

    invoke-static {p1, v1}, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;->access$safeUpdateItem(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)V

    goto :goto_1

    :cond_2
    return-void
.end method
