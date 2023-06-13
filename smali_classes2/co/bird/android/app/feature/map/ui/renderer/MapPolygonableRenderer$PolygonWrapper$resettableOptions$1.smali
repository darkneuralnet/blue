.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/model/Polygonable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
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
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,518:1\n11335#2:519\n11670#2,3:520\n11335#2:524\n11670#2,3:525\n11335#2:530\n11670#2,3:531\n1855#3:523\n1856#3:528\n1855#3:529\n1856#3:534\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1\n*L\n322#1:519\n322#1:520,3\n332#1:524\n332#1:525,3\n336#1:530\n336#1:531,3\n331#1:523\n331#1:528\n335#1:529\n335#1:534\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/android/gms/maps/model/PolygonOptions;
    .locals 13

    new-instance v0, Lcom/google/android/gms/maps/model/PolygonOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolygonOptions;-><init>()V

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v1

    invoke-interface {v1}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v1

    const-string v3, "polygonable.region.getRing(0).points"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v1

    move v5, v2

    :goto_0
    const-string v6, "point"

    if-ge v5, v4, :cond_0

    aget-object v7, v1, v5

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/PolygonOptions;->s(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v1

    invoke-interface {v1}, Lco/bird/android/model/Polygonable;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolygonOptions;->E(I)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v1

    invoke-interface {v1}, Lco/bird/android/model/Polygonable;->getBorderColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolygonOptions;->N0(I)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/PolygonOptions;->W0(F)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getSize()D

    move-result-wide v3

    double-to-float v3, v3

    neg-float v3, v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/PolygonOptions;->Y0(F)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolygonOptions;->v(Z)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    const-string v3, "PolygonOptions()\n       \u2026        .clickable(false)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v3

    invoke-interface {v3}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v3

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v1

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v5

    invoke-interface {v5}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v5

    invoke-virtual {v5, v4}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v4

    const-string v5, "polygonable.region.getRing(idx).points"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    array-length v7, v4

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_1

    aget-object v9, v4, v8

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v5}, Lcom/google/android/gms/maps/model/PolygonOptions;->u(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    invoke-static {v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->access$getHoles$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCX3;

    invoke-virtual {v3}, LCX3;->L0()LKr2;

    move-result-object v3

    invoke-virtual {v3}, LBr2;->Y()[LyB0;

    move-result-object v3

    const-string v4, "it.exteriorRing.coordinates"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v3

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    array-length v5, v3

    move v6, v2

    :goto_4
    if-ge v6, v5, :cond_3

    aget-object v7, v3, v6

    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v9, v7, LyB0;->c:D

    iget-wide v11, v7, LyB0;->b:D

    invoke-direct {v8, v9, v10, v11, v12}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_3
    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/model/PolygonOptions;->u(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;

    goto :goto_3

    :cond_4
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;->invoke()Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v0

    return-object v0
.end method
