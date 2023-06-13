.class public final Lco/bird/android/feature/suggestanest/SuggestNestActivity$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/suggestanest/SuggestNestActivity;->X0(LcD1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireArea;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireArea;",
        "areas",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,474:1\n1549#2:475\n1620#2,2:476\n1549#2:482\n1620#2,3:483\n1855#2:486\n1856#2:491\n1622#2:492\n11335#3:478\n11670#3,3:479\n11335#3:487\n11670#3,3:488\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$1\n*L\n364#1:475\n364#1:476,2\n373#1:482\n373#1:483,3\n374#1:486\n374#1:491\n364#1:492\n367#1:478\n367#1:479,3\n374#1:487\n374#1:488,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$f;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireArea;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/PolygonOptions;",
            ">;"
        }
    .end annotation

    const-string v0, "areas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$f;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireArea;

    new-instance v4, Lcom/google/android/gms/maps/model/PolygonOptions;

    invoke-direct {v4}, Lcom/google/android/gms/maps/model/PolygonOptions;-><init>()V

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireArea;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v5

    const-string v7, "area.region.getRing(0).points"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/ArrayList;

    array-length v8, v5

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    array-length v8, v5

    move v9, v6

    :goto_1
    const-string v10, "point"

    if-ge v9, v8, :cond_0

    aget-object v11, v5, v9

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, LcU5;->access$toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v4, v7}, Lcom/google/android/gms/maps/model/PolygonOptions;->s(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v4

    sget v5, LDf4;->birdRed10:I

    invoke-static {v0, v5}, LNA0;->c(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/model/PolygonOptions;->E(I)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v4

    sget v5, LDf4;->birdRed:I

    invoke-static {v0, v5}, LNA0;->c(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/model/PolygonOptions;->N0(I)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    invoke-virtual {v4, v7}, Lcom/google/android/gms/maps/model/PolygonOptions;->W0(F)Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireArea;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/Polygon;->numRings()I

    move-result v7

    invoke-static {v5, v7}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireArea;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v3

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v8, v5

    check-cast v8, Lkotlin/collections/IntIterator;

    invoke-virtual {v8}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v8

    invoke-virtual {v3, v8}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/LinearRing;

    invoke-virtual {v5}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object v5

    const-string v7, "ring.points"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/ArrayList;

    array-length v8, v5

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    array-length v8, v5

    move v9, v6

    :goto_4
    if-ge v9, v8, :cond_2

    aget-object v11, v5, v9

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, LcU5;->access$toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_2
    invoke-virtual {v4, v7}, Lcom/google/android/gms/maps/model/PolygonOptions;->u(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;

    goto :goto_3

    :cond_3
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
