.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->invoke$filterVisiblePolygonables(Ljava/util/List;ZLandroid/location/Location;FLco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lcom/google/android/gms/maps/model/VisibleRegion;Lkotlin/Lazy;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
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
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,518:1\n12744#2,2:519\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2\n*L\n160#1:519,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $points:[Lco/bird/android/model/Point;

.field final synthetic $visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;


# direct methods
.method public constructor <init>([Lco/bird/android/model/Point;Lcom/google/android/gms/maps/model/VisibleRegion;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->$points:[Lco/bird/android/model/Point;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 10

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->$points:[Lco/bird/android/model/Point;

    const-string v1, "points"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const-string v6, "visibleRegion"

    const/4 v7, 0x1

    if-ge v5, v3, :cond_1

    aget-object v8, v0, v5

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "point"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v8}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->access$contains(Lcom/google/android/gms/maps/model/VisibleRegion;Lco/bird/android/model/Point;)Z

    move-result v8

    if-eqz v8, :cond_0

    move v0, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->$points:[Lco/bird/android/model/Point;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->access$getToLatLngBounds([Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->access$contains(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/VisibleRegion;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v4, v7

    :cond_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$visibleRegionIntersects$2;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
