.class final Lco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/GoogleMap_Kt;->addPolygons(Lco/bird/android/app/feature/map/renderer/RichLayer;Ljava/util/List;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "+",
        "LVO4;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "",
        "LVO4;",
        "invoke",
        "()Ljava/util/List;",
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
        "SMAP\nGoogleMap+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1549#2:262\n1620#2,3:263\n*S KotlinDebug\n*F\n+ 1 GoogleMap+.kt\nco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1\n*L\n133#1:262\n133#1:263,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $region:Lco/bird/android/model/Polygon;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Polygon;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1;->$region:Lco/bird/android/model/Polygon;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LVO4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/GoogleMap_Kt$addPolygons$simplified$1;->$region:Lco/bird/android/model/Polygon;

    invoke-static {v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x20

    if-le v1, v2, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    invoke-static {v0, v1, v2}, LBX3;->g(Ljava/util/List;D)Ljava/util/List;

    move-result-object v0

    :cond_0
    const-string v1, "if (points.size > 32) {\n\u2026         points\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    new-instance v3, LVO4;

    invoke-direct {v3, v2}, LVO4;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method
