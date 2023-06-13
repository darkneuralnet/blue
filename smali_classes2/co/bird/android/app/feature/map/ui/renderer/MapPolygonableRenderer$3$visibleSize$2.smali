.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleSize$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->invoke(Lkotlin/Triple;)Lna4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Double;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

.field final synthetic $visibleRegionGeom$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "LCX3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/VisibleRegion;Lkotlin/Lazy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/VisibleRegion;",
            "Lkotlin/Lazy<",
            "+",
            "LCX3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleSize$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleSize$2;->$visibleRegionGeom$delegate:Lkotlin/Lazy;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Double;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleSize$2;->$visibleRegionGeom$delegate:Lkotlin/Lazy;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->access$invoke$lambda$0(Lkotlin/Lazy;)LCX3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LCX3;->M()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleSize$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    const-string v1, "visibleRegion.latLngBounds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRendererKt;->access$getPoints(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LRN5;->b(Ljava/util/List;)D

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleSize$2;->invoke()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method
